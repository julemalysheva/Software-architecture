package model;

import model.domain.Customer;
import model.domain.Dish;
import model.domain.Table;
import model.domain.TableOrder;

/**
 * Класс Модели Данных - Основная сущность для Заказа Столика
 * Думаю, можно было обойтись одним классом, либо этим, либо TableOrder))
 */
public class ModelTableOrder {
    private static int nextId = 1;

    private int orderId;
    private TableOrder order;

    /**
     * Конструктор Модели Заказ Столика - создается композиция, новый объект Заказа столика
     * @param table столик
     * @param customer клиент
     */
    public ModelTableOrder(Table table, Customer customer) {
        this.orderId = nextId++;
        this.order = new TableOrder(table, customer);
    }

    /**
     * Метод добавляет к заказу блюдо
     * @param dish блюдо
     * @param quantity количество
     */
    public void addPreorderedDish(Dish dish, int quantity) {
        order.addPreorderedDish(dish, quantity);
    }

    /**
     * Метод получить заказ
     * @return order Заказ столика
     */
    public TableOrder getOrder() {
        return order;
    }
}
