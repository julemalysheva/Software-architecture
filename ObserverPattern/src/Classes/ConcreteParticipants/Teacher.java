package Classes.ConcreteParticipants;

import Classes.Observer;

/**
 * Конкретный наблюдатель - учитель
 */
public class Teacher implements Observer{
    private String name;

    /**
     * Конструктор класса, принимающий имя учителя
     * @param name Имя учителя
     */
    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(String childName, double grade) {
        System.out.println("Учитель " + name + " получил уведомление об оценке ребенка " + childName + ": " + grade);
        // здесь учитель может провести анализ успеваемости и принять решение
    }
}
