package view;

import model.domain.*;
import presenter.OrderPresenter;
import model.ModelTableOrder;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

/**
 * Класс представления заказа
 */
public class OrderActivity implements OrderView{
    private OrderPresenter mPresenter;
    private ModelTableOrder mCurrentModelOrder;

    /**
     * Устанавливаем презентер, через который представление будет обращаться к логике и данным
     * @param presenter
     */
    @Override
    public void setPresenter(OrderPresenter presenter) {
        mPresenter = presenter;
    }

    /**
     * Запускаем у пользователя процесс выбора столика путем отображения всех залов,
     * для получения данных обращаемся в презентер
     */
    @Override
    public void startOrderingProcess() {
        mPresenter.loadHalls();
    }

    /**
     * Отображение доступных залов пользователю.
     * Пользователь выбирает зал, после чего мы запрашиваем презентер загурзить столики по выбранному залу.
     * Вызывается mPresenter.loadTablesInHall(hallId);
     * @param halls список полученных от репозитория столов
     */
    @Override
    public void showHalls(List<Hall> halls) {
        System.out.println("Available Halls:");
        for (Hall hall : halls) {
            System.out.println(hall.getHallId() + ". " + hall.getName());
        }

        System.out.print("Select a hall: ");
        Scanner scanner = new Scanner(System.in);
        int hallId = scanner.nextInt();

        //Пользователь выбирает зал, вызывается mPresenter.loadTablesInHall(hallId);
        mPresenter.loadTablesInHall(hallId);
    }

    /**
     * Отображение доступных столов пользователю
     * Пользователь выбирает стол, вводит данные, вызывается процесс создания заказа
     * mPresenter.createOrder(selectedTable, new Customer(name, phoneNumber, email));
     * @param tables столы для выбора
     */
    @Override
    public void showTables(List<Table> tables) {
        System.out.println("Available Tables:");
        for (Table table : tables) {
            System.out.println(table.getTableId() + ". Table " + table.getTableId() + " (Capacity: " + table.getCapacity() + ")");
        }

        System.out.print("Select a table (enter table ID): ");
        Scanner scanner = new Scanner(System.in);
        int tableId = scanner.nextInt();

        Table selectedTable = mPresenter.getTableById(tableId);
        if (selectedTable != null) {
            System.out.println("Selected table: " + selectedTable.getTableId());

            scanner.nextLine(); // на новую строку
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            mPresenter.createOrder(selectedTable, new Customer(name, phoneNumber, email));
        } else {
            System.out.println("Invalid table ID.");
        }
    }

    /**
     * Отображение доступных блюд пользователю
     * Пользователь выбирает блюда и их количество, вызывается mPresenter.addDishToOrder(selectedDish, quantity);
     * @param dishes доступные блюда
     */
    @Override
public void showDishes(List<Dish> dishes) {
    System.out.println("Available Dishes:");
    for (Dish dish : dishes) {
        System.out.println(dish.getDishId() + ". " + dish.getName() + " (" + dish.getPrice() + ")");
    }

    System.out.print("Select a dish (enter dish ID): ");
    Scanner scanner = new Scanner(System.in);
    int dishId = scanner.nextInt();

    Dish selectedDish = mPresenter.getDishById(dishId);
    if (selectedDish != null) {
        System.out.println("Selected dish: " + selectedDish.getName());

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        mPresenter.addDishToOrder(selectedDish, quantity);
    } else {
        System.out.println("Invalid dish ID.");
    }
}


    /**
     * Отображение созданного заказа пользователю, запуск в перезентере mPresenter.loadDishes();
     * загрузки блюд для добавления в заказ.
     * @param modelOrder модель заказа
     */
    @Override
    public void showCreatedOrder(ModelTableOrder modelOrder) {
        mCurrentModelOrder = modelOrder;
        System.out.println("Order created for Table " + mCurrentModelOrder.getOrder().getTable().getTableId());
        mPresenter.loadDishes();
    }

    /**
     * Отображение пользователю обновленных данных по заказу после корректировки.
     * Процесс подтверждения заказа, после которого в презентере запускаем mPresenter.placeOrder();
     * процесс окончательного размещения заказа
     * @param modelOrder модель заказа
     */
    @Override
    public void updateOrderTotal(ModelTableOrder modelOrder) {
        BigDecimal total = BigDecimal.ZERO;
        for (PreorderedDish preorderedDish : modelOrder.getOrder().getPreorderedDishes()) {
            total = total.add(preorderedDish.getDish().getPrice().multiply(BigDecimal.valueOf(preorderedDish.getQuantity())));
        }
        System.out.println("Total: $" + total);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to place the order? (yes/no): ");
        String response = scanner.next();
        if ("yes".equalsIgnoreCase(response)) {
            mPresenter.placeOrder();
        }
    }

    /**
     * Отображение подтверждения заказа пользователю
     */
    @Override
    public void showOrderConfirmation() {
        System.out.println("Order placed successfully!");
    }

}
