import Classes.ConcreteParticipants.ChildGrades;
import Classes.ConcreteParticipants.Parent;
import Classes.ConcreteParticipants.Teacher;

/**
 * Пример использования Паттерна Observer
 */
public class ObserverPatternExample {
    public static void main(String[] args) throws Exception {
        ChildGrades childGrades = new ChildGrades("Иван", 4.5);
        Teacher teacher1 = new Teacher("Мария");
        Teacher teacher2 = new Teacher("Петр");
        Parent parent1 = new Parent("Ольга");
        Parent parent2 = new Parent("Алексей");

        // Добавление наблюдателей к успеваемости ребенка
        childGrades.addObserver(teacher1);
        childGrades.addObserver(teacher2);
        childGrades.addObserver(parent1);
        childGrades.addObserver(parent2);

        // Ребенок получил новую оценку
        childGrades.setGrade(5.0);
        // Вывод:
        // Учитель Мария получил уведомление об оценке ребенка Иван: 5.0
        // Учитель Петр получил уведомление об оценке ребенка Иван: 5.0
        // Родитель Ольга получил уведомление об оценке ребенка Иван: 5.0
        // Родитель Алексей получил уведомление об оценке ребенка Иван: 5.0

        System.out.println("---------------------------------------------------------");
        // Ребенок получил еще одну оценку
        childGrades.setGrade(4.0);
        // Вывод:
        // Учитель Мария получил уведомление об оценке ребенка Иван: 4.0
        // Учитель Петр получил уведомление об оценке ребенка Иван: 4.0
        // Родитель Ольга получил уведомление об оценке ребенка Иван: 4.0
        // Родитель Алексей получил уведомление об оценке ребенка Иван: 4.0
    }
}
