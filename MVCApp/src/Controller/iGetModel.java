package Controller;

import java.util.List;

import Model.Domen.Student;

/**
 * для создания архитект. границ.для Моделей
 */

public interface iGetModel {
    public List<Student> getAllStudents();
}
