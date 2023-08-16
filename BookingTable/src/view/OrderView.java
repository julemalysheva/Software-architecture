package view;

import model.ModelTableOrder;
import presenter.OrderPresenter;
import model.domain.Hall;
import model.domain.Table;
import model.domain.Dish;

import java.util.List;

public interface OrderView {
    void setPresenter(OrderPresenter presenter);
    void startOrderingProcess();
    void showHalls(List<Hall> halls);
    void showTables(List<Table> tables);
    void showDishes(List<Dish> dishes);
    void showCreatedOrder(ModelTableOrder modelOrder);
    void updateOrderTotal(ModelTableOrder modelOrder);
    void showOrderConfirmation();
}
