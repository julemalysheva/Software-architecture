package Classes;

/**
 * Интерфейс для субъекта
 */
public interface Subject {
    /**
     * Методы для добавления и удаления наблюдателей
     * @param observer наблюдатель
     */
    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    /**
     * Метод для уведомления всех наблюдателей об изменении оценки ребенка
     * @param childName Имя ребенка
     * @param grade успеваемость
     */
    void notifyObservers(String childName, double grade);
}
