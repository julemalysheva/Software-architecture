package model.domain;

/**
 * Класс описывает сущность Предзаказ блюд
 */
public class PreorderedDish {
    private static int nextId = 1;

    private int dishId;
    private Dish dish;
    private int quantity;

    /**
     * Констурктор Предзаказа
     * @param dish Блюдо
     * @param quantity Количество
     */
    public PreorderedDish(Dish dish, int quantity) {
        this.dishId = nextId++;
        this.dish = dish;
        this.quantity = quantity;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
