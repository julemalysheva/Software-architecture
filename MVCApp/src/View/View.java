package View;

import java.util.List;

import Controller.Controller;
import Controller.iGetController;
import Controller.iGetView;
import Model.Domen.Student;

public class View implements iGetView {

    iGetController contr;
    
    /**
     * метод установки контролера, где устанавили ссылку на контролер.
     */
    public void setController(iGetController contr)
    {
         this.contr = contr;
    }

    public void printAllStudent(List<Student> students)
    {
        for(Student s:students)
        {
            System.out.println(s);
        }
    }
}