package presenter;

import model.repo.iRepo;
import adapter.iSend;
import model.domain.Customer;
import model.domain.Table;
import model.ModelTableOrder;
import model.domain.Hall;
import model.domain.Dish;
import model.domain.TableOrder;
import view.OrderView;

import java.util.List;

/**
 * Реализация презентера заказа
 */
public class OrderPresenterImpl implements OrderPresenter{
    private OrderView mView; 
    private iRepo mRepo;
    private iSend mSend;
    private ModelTableOrder mCurrentModelOrder;

    /**
     * Конструктор презентера заказа
     * @param view компонент для взаимодействия с пользователем
     * @param repo компонент для работы с данными
     * @param send компонент для отправки данных
     */
    public OrderPresenterImpl(OrderView view, iRepo repo, iSend send) {
        mView = view;
        mRepo = repo;
        mSend = send;
    }

    /**
     * Получаем все залы из данных и запускаем отображение пользователю
     */
    @Override
    public void loadHalls() {
        List<Hall> halls = mRepo.getAllHalls();
        mView.showHalls(halls);
    }

    /**
     * Загружаем все столы по выбранному залу и запускаем отображение пользователю
     * @param hallId ID выбранного Зала
     */
    @Override
    public void loadTablesInHall(int hallId) {
        List<Table> tables = mRepo.getTablesInHall(hallId);
        mView.showTables(tables);
    }

    @Override
    public Table getTableById(int tableId) {
        return mRepo.getTableById(tableId);
    }

    @Override
    public Dish getDishById(int dishId) {
        return mRepo.getDishById(dishId);
    }
    @Override
    public void loadDishes() {
        List<Dish> dishes = mRepo.getAllDishes();
        mView.showDishes(dishes);
    }
    @Override
    public void createOrder(Table table, Customer customer) {
        mCurrentModelOrder = new ModelTableOrder(table, customer);
        mView.showCreatedOrder(mCurrentModelOrder);
    }

    @Override
    public void addDishToOrder(Dish dish, int quantity) {
        mCurrentModelOrder.addPreorderedDish(dish, quantity);
        mView.updateOrderTotal(mCurrentModelOrder);
    }

    @Override
    public void placeOrder() {
        TableOrder order = mCurrentModelOrder.getOrder();
        mRepo.saveTableOrder(order);
        String requestData = createRequestData(order);
        String response = mSend.sendRequest(requestData);
        mView.showOrderConfirmation();
    }

    /**
     * Создание JSON-строки на основе данных заказа
     * @param order Данные о заказе
     * @return данные для запроса к серверу
     */
    private String createRequestData(TableOrder order) {
        return ""; // Здесь может быть реализация создания JSON-строки
    }
}
