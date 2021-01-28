/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.CourseCategories;

/**
 *
 * @author VotraOrllati
 */
public class CourseCategoriesRepository extends EntMngClass implements CourseCategoriesInterface {

    @Override
    public void addCourseCategories(CourseCategories cc) {
         try {
            em.getTransaction().begin();
            em.persist(cc);
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
    public void updateCourseCategories(CourseCategories cc) {
            try {
            em.getTransaction().begin();
            em.merge(cc);
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
    public void deleteCourseCategories(int id) {
         try {
            em.getTransaction().begin();
            CourseCategories cc = getCourseCategories(id);
            em.remove(cc);
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
    public CourseCategories getCourseCategories(int courseCategoryId) {
        return em.find(CourseCategories.class, courseCategoryId);
    }

    @Override
    public List<CourseCategories> findAll() {
         return em.createNamedQuery("CourseCategories.findAll").getResultList();
    }
         
    
    
}
