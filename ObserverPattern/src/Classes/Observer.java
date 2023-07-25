package Classes;

/**
 * Интерфейс для наблюдателей
 */
public interface Observer {
    /**
     * Метод для обновления наблюдателя об изменении оценки ребенка
     * @param childName Имя ребенка
     * @param grade успеваемость
     */
    void update(String childName, double grade);
}
