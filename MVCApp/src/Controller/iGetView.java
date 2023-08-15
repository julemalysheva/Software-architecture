package Controller;

import java.util.List;

import Model.Domen.Student;

/**
 * для создания архитект. границ.для Вью
 */

public interface iGetView {
    public void printAllStudent(List<Student> students);
    public void setController(iGetController controller);
}
