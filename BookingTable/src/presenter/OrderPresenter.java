package presenter;

import model.domain.Customer;
import model.domain.Table;
import model.domain.Dish;


public interface OrderPresenter {
    void loadHalls();
    void loadTablesInHall(int hallId);

    Table getTableById(int tableId);

    Dish getDishById(int dishId);

    void loadDishes();
    void createOrder(Table table, Customer customer);
    void addDishToOrder(Dish dish, int quantity);
    void placeOrder();
}
