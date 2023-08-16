package model.domain;

/**
 * Класс описывает сущность Залы
 */
public class Hall {
    private static int nextId = 1;

    private int hallId;
    private String name;
    private int capacity;

    /**
     * Конструктор класса Зал
     * @param name Название
     * @param capacity Вместимость
     */
    public Hall(String name, int capacity) {
        this.hallId = nextId++;
        this.name = name;
        this.capacity = capacity;
    }

    /**
     * Геттеры и Сеттеры
     * @return
     */
    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
