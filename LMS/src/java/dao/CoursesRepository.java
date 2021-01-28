package dao;

import java.util.List;
import model.Courses;
import model.Users;

public class CoursesRepository extends EntMngClass implements CoursesInterface {

    @Override
    public void addCourse(Courses c) {
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } catch (Throwable thro) {
            if (thro.getMessage().contains("2627")) {
                //throw new EmployeesException("Data already exists!");
            } else {
                //throw new EmployeesException("Create : "+thro.getClass()+" - "+thro.getMessage());
            }
        }
    }

    @Override
    public void updateCourse(Courses c) {
        try {
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
        } catch (Throwable thro) {
            if (thro.getMessage().contains("2627")) {
                //throw new EmployeesException("Data already exists!");
            } else {
                //throw new EmployeesException("Create : "+thro.getClass()+" - "+thro.getMessage());
            }
        }
    }

    @Override
    public void deleteCourse(int id) {
        try {
            em.getTransaction().begin();
            Courses c = getCourses(id);
            em.remove(c);
            em.getTransaction().commit();
        } catch (Throwable thro) {
            if (thro.getMessage().contains("2627")) {
                //throw new EmployeesException("Data already exists!");
            } else {
                //throw new EmployeesException("Create : "+thro.getClass()+" - "+thro.getMessage());
            }
        }
    }

    @Override
    public Courses getCourses(int courseId) {
        return em.find(Courses.class, courseId);
    }

    @Override
    public List<Courses> findAll() {
        return em.createNamedQuery("Courses.findAll").getResultList();
    }

}
