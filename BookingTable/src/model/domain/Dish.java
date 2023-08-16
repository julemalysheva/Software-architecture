package model.domain;

import java.math.BigDecimal;

/**
 * Класс описывает сущность Блюдо
 */
public class Dish {
    private static int nextId = 1;

    private int dishId;
    private String name;
    private BigDecimal price;

    /**
     * Конструктор класса Блюдо
     * @param name Название блюда
     * @param price Цена блюда
     */
    public Dish(String name, BigDecimal price) {
        this.dishId = nextId++;
        this.name = name;
        this.price = price;
    }

    /**
     * Метод получения id блюда
     * @return id блюда
     */
    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
