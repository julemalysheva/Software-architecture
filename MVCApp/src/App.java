import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetController;
import Controller.iGetModel;
import Controller.iGetView;
import Model.Model;
import Model.Domen.Student;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
//откуда-то получаем данные 
       List<Student> students = new ArrayList<Student>();
       Student s1 = new Student("Сергей",  21, 101);
       Student s2 = new Student("Андрей",  22, 111);
       Student s3 = new Student("Иван", 22, 121);
       Student s4 = new Student("Игорь", 23, 301);
       Student s5 = new Student("Даша",  25, 171);
       Student s6 = new Student("Лена",  23, 104);
       students.add(s1);
       students.add(s2);
       students.add(s3);
       students.add(s4);
       students.add(s5);
       students.add(s6);

//и кладем в модель.
       iGetModel mod = new Model(students);
       iGetView viw = new View();
//создаем контроллер
       iGetController control = new Controller(mod, viw);
       viw.setController(control);

//при вызове обновления происходит вызов метода модели - получение студентов
//и отправка его на печать во вью.
       control.update();

    }
}