package model.domain;

/**
 * Класс описывает сущность Столик
 */
public class Table {
    private static int nextId = 1;

    private int tableId;
    private Hall hall;
    private int capacity;

    /**
     * Конструктор класса Столик
     * @param hall Зал
     * @param capacity Вместимость
     */
    public Table(Hall hall, int capacity) {
        this.tableId = nextId++;
        this.hall = hall;
        this.capacity = capacity;
    }

    public int getTableId() {
        return tableId;
    }

    public Hall getHall() {
        return hall;
    }

    public int getCapacity() {
        return capacity;
    }
}
