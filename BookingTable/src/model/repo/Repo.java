package model.repo;

import model.domain.Hall;
import model.domain.Table;
import model.domain.Dish;
import model.domain.TableOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс для работы с БД (имитация), содержит коллекции Залов, Столов, Блюд, Хранит Заказы. 
 * Реализация репозитория данных.
 */
public class Repo implements iRepo{
    // инициализация данных
    private Map<Integer, Hall> halls = new HashMap<>();
    private Map<Integer, Table> tables = new HashMap<>();
    private Map<Integer, Dish> dishes = new HashMap<>();
    private List<TableOrder> orders = new ArrayList<>();

    /**
     * метод получения карточек Залов
     * @return список залов
     */
    @Override
    public List<Hall> getAllHalls() {
        return new ArrayList<>(halls.values());
    }

    /**
     * Метод получения перечня Столов по заданному id Зала
     * @param hallId id Зала
     * @return Список столов в Зале
     */
    @Override
    public List<Table> getTablesInHall(int hallId) {
        List<Table> tablesInHall = new ArrayList<>();
        for (Table table : tables.values()) {
            if (table.getHall().getHallId() == hallId) {
                tablesInHall.add(table);
            }
        }
        return tablesInHall;
    }

    /**
     * метод получения Меню блюд
     * @return список блюд
     */
    @Override
    public List<Dish> getAllDishes() {
        return new ArrayList<>(dishes.values());
    }

    /**
     * Метод сохранения заказа в БД, вызывается в Презентере после подтверждения заказа контактом
     * @param order заказ столика
     */
    @Override
    public void saveTableOrder(TableOrder order) {
        orders.add(order);
    }

    /**
     * Метод Получить Столик по id
     * @param tableId id Столика
     * @return Объект Столика или null
     */
    @Override
    public Table getTableById(int tableId) {
        for (Table table : tables.values()) {
            if (table.getTableId() == tableId) {
                return table;
            }
        }
        return null;
    }

    /**
     * Реализуем получение блюда по dishId из нашего источника данных (например, базы данных)
     * @param dishId
     * @return Вернем соответствующий объект Dish или null, если блюдо не найдено
     */
    @Override
    public Dish getDishById(int dishId) {
        for (Dish dish: dishes.values()) {
            if (dish.getDishId() == dishId){
                return dish;
            }
        }
        return null;
    }

    /**
     * Метод добавления в БД объекта Стола
     * @param i ключ, индекс для хранения в БД
     * @param table1 объекта Стола
     */
    @Override
    public void addTable(Integer i, Table table1) {
        tables.put(i, table1);
    }

    /**
     * Метод добавления в БД объекта Зала
     * @param i ключ, индекс для хранения в БД
     * @param hall1 объект Зала
     */
    @Override
    public void addHall(Integer i, Hall hall1) {
        halls.put(i, hall1);
    }

    /**
     * Метод добавления к БД Блюда
     * @param i ключ, индекс для хранения в БД
     * @param dish1 объект Блюда
     */
    @Override
    public void addDish(Integer i, Dish dish1) {
        dishes.put(i, dish1);
    }
}
