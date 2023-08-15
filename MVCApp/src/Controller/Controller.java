package Controller;

import java.util.List;

import Model.Model;
import Model.Domen.Student;
import View.View;

/**
 * Класс Controller знает о существовании model и view, их включает
 */
public class Controller implements iGetController {
    //при использ.интерфейсом в качестве арх.границ мы уже не тип класса используем
    //а тип Интерфейса
    private iGetModel model;
    private iGetView view;

    //добавили хранилище для MVP 
    private List<Student> students;

    /**
     * Конструктор - получаем модель и представление снаружи - агрегация
     * @param model
     * @param view
     */
    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }
/**
 * метод появляется для MVP паттерна, он закрыт для внтуренней логики
 * контроль данных, например.
 * @param studs
 * @return
 */
    private boolean testData(List<Student> studs)
    {
        if(studs.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update()
    {
        //MVP - здесь мы разрываем связь, мы данные полуили, но вью сразу не отдаем
        //помещаем в хранилище.
        students = model.getAllStudents();
//и если тест прошел, тогда отдаем данные вью.
        if(testData(students))
        {
            view.printAllStudent(students);
        }
        else 
        {
            //можем запросить у др. модели и пр.
            System.out.println("Список студентов пуст!");
        }


        //MVC - данные из модели передаются на view
        //функционал обратной связи.
        //view.printAllStudent(model.getAllStudents());
    }    
}
