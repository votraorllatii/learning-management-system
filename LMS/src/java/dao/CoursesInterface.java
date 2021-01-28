package dao;

import java.util.List;
import model.Courses;


public interface CoursesInterface {

    void addCourse(Courses c);

    void updateCourse(Courses c);

    void deleteCourse(int id);

    Courses getCourses(int courseId);

    List<Courses> findAll();
}
