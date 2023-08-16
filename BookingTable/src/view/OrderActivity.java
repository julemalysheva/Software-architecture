package view;

import model.domain.*;
import presenter.OrderPresenter;
import model.ModelTableOrder;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
public class OrderActivity implements OrderView{
    private OrderPresenter mPresenter;
    private ModelTableOrder mCurrentModelOrder;

    @Override
    public void setPresenter(OrderPresenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void startOrderingProcess() {
        mPresenter.loadHalls();
    }

    @Override
    public void showHalls(List<Hall> halls) {
        System.out.println("Available Halls:");
        for (Hall hall : halls) {
            System.out.println(hall.getHallId() + ". " + hall.getName());
        }

        System.out.print("Select a hall: ");
        Scanner scanner = new Scanner(System.in);
        int hallId = scanner.nextInt();

        mPresenter.loadTablesInHall(hallId);
    }


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


    @Override
    public void showCreatedOrder(ModelTableOrder modelOrder) {
        mCurrentModelOrder = modelOrder;
        System.out.println("Order created for Table " + mCurrentModelOrder.getOrder().getTable().getTableId());
        mPresenter.loadDishes();
    }

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

    @Override
    public void showOrderConfirmation() {
        System.out.println("Order placed successfully!");
    }

}
