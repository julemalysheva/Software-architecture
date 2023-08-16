package model.repo;

import model.domain.Hall;
import model.domain.Table;
import model.domain.Dish;
import model.domain.TableOrder;

import java.util.List;

/**
 * Интерфейс для взаимодействия с базой данных (имитация)
 * содержит методы для получения данных и сохранения
 * заказа, которые вызываются в Презентере
 */
public interface iRepo {
    List<Hall> getAllHalls();
    List<Table> getTablesInHall(int hallId);
    List<Dish> getAllDishes();
    void saveTableOrder(TableOrder order);

    Table getTableById(int tableId);
    Dish getDishById(int dishId);

    void addTable(Integer i, Table table1);

    void addHall(Integer i, Hall hall1);

    void addDish(Integer i, Dish dish1);
}
