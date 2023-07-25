package Classes.ConcreteParticipants;

import java.util.ArrayList;
import java.util.List;

import Classes.Observer;
import Classes.Subject;

/**
 * Конкретный субъект - успеваемость ребенка в школе
 * Содержит методы добавления/удаления наблюдателей. 
 * Когда успеваемость ребенка изменяется, метод setGrade вызывает notifyObservers, 
 * что приводит к уведомлению всех наблюдателей в списке о новой оценке. 
 */
public class ChildGrades implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String childName;
    private double grade;

    /**
     * Конструктор класса, принимающий имя ребенка и начальную оценку
     * @param childName имя ребенка
     * @param grade оценка
     */
    public ChildGrades(String childName, double grade) {
        this.childName = childName;
        this.grade = grade;
    }

    /**
     * Метод для установки новой оценки ребенка и уведомления наблюдателей
     * @param grade оценка
     */
    public void setGrade(double grade) {
        this.grade = grade;
        notifyObservers(childName, grade);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String childName, double grade) {
        for (Observer observer : observers) {
            observer.update(childName, grade);
        }
    }
}
