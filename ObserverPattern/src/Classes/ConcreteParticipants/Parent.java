package Classes.ConcreteParticipants;

import Classes.Observer;

public class Parent implements Observer{
    private String name;

    /**
     * Конструктор класса, принимающий имя родителя
     * @param name Имя родителя
     */
    public Parent(String name) {
        this.name = name;
    }

    @Override
    public void update(String childName, double grade) {
        System.out.println("Родитель " + name + " получил уведомление об оценке ребенка " + childName + ": " + grade);
        // здесь родитель может реагировать на успеваемость ребенка
    }
}
