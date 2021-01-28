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
public interface CourseCategoriesInterface {
     
    void addCourseCategories(CourseCategories cc);
    
    void updateCourseCategories(CourseCategories cc);
    
    void deleteCourseCategories(int id);
    
    CourseCategories getCourseCategories(int courseCategoryId);
    
    List<CourseCategories> findAll();
    
}
