import model.domain.Hall;
import model.domain.Table;
import model.domain.Dish;
import model.repo.Repo;
import adapter.Send;
import model.repo.iRepo;
import presenter.OrderPresenterImpl;
import view.OrderActivity;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        iRepo repo = new Repo();

        // Добавляем тестовые данные для залов, столов и блюд
        Hall hall1 = new Hall("Main Hall", 50);
        Hall hall2 = new Hall("Private Room", 20);

        Table table1 = new Table(hall1, 4);
        Table table2 = new Table(hall1, 6);
        Table table3 = new Table(hall2, 8);

        Dish dish1 = new Dish("Steak", new BigDecimal("25.99"));
        Dish dish2 = new Dish("Pasta", new BigDecimal("14.99"));
        Dish dish3 = new Dish("Salad", new BigDecimal("8.99"));


        repo.addTable(1, table1);
        repo.addTable(2, table2);
        repo.addTable(3, table3);

        repo.addHall(1, hall1);
        repo.addHall(2, hall2);

        repo.addDish(1, dish1);
        repo.addDish(2, dish2);
        repo.addDish(3, dish3);


        // Инициализация презентера и отображение взаимодействия
        OrderActivity view = new OrderActivity();
        Send send = new Send();
        OrderPresenterImpl presenter = new OrderPresenterImpl(view, repo, send);

        view.setPresenter(presenter);
        view.startOrderingProcess();
    }

}