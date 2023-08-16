package model.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс описывает сущность Заказ столика, может содержать данные о предзаказе блюд
 */
public class TableOrder {
    private static int nextId = 1;

    private int orderId;
    private Table table;
    private Customer customer;
    private List<PreorderedDish> preorderedDishes = new ArrayList<>();

    /**
     * Конструктор класса Заказ столика
     * @param table столик
     * @param customer клиент
     */
    public TableOrder(Table table, Customer customer) {
        this.orderId = nextId++;
        this.table = table;
        this.customer = customer;
    }

    /**
     * Метод добавления к заказу выбранного блюда
     * Создается объект предзаказа блюда и добавляется в заказ столика.
     * @param dish блюдо
     * @param quantity количество
     */
    public void addPreorderedDish(Dish dish, int quantity) {
        PreorderedDish preorderedDish = new PreorderedDish(dish, quantity);
        preorderedDishes.add(preorderedDish);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Метод получения предзаказа блюд
     * @return список заказанных блюд
     */
    public List<PreorderedDish> getPreorderedDishes() {
        return preorderedDishes;
    }

    public void setPreorderedDishes(List<PreorderedDish> preorderedDishes) {
        this.preorderedDishes = preorderedDishes;
    }
}
