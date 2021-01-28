
package controller;

import dao.CourseCategoriesInterface;
import dao.CourseCategoriesRepository;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CourseCategories;

/**
 *
 * @author VotraOrllati
 */
@WebServlet(name = "CourseCategoriesController", urlPatterns = {"/CourseCategoriesController"})
public class CourseCategoriesController extends HttpServlet{
        CourseCategoriesInterface ci;

    public CourseCategoriesController() {
        ci = new CourseCategoriesRepository();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("coursecategoriesList")) {
            request.getSession().setAttribute("coursecategoriesList", ci.findAll());
        }

        if (action.equalsIgnoreCase("delete")) {

            int courseCategoriesId = Integer.parseInt(request.getParameter("courseCategoriesId"));
            ci.deleteCourseCategories(courseCategoriesId);
            request.getSession().removeAttribute("coursecategory");
            request.setAttribute("coursecategoriesList", ci.findAll());
            response.sendRedirect("tables.jsp");
        } else if (action.equalsIgnoreCase("edit")) {
            int courseCategoriesId = Integer.parseInt(request.getParameter("courseCategoriesId"));
            CourseCategories coursecategory = ci.getCourseCategories(courseCategoriesId);
            request.getSession().setAttribute("coursecategory", coursecategory);
            response.sendRedirect("tables.jsp");
        }        

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        ci = new CourseCategoriesRepository();

        String coursecategoriesname = request.getParameter("coursecategoriesname");
        String coursecategorydiscription = request.getParameter("coursecategoriesdiscription");


        if (!coursecategoriesname.trim().isEmpty() && !coursecategorydiscription.trim().isEmpty()) {
            CourseCategories coursecategory = new CourseCategories();
            coursecategory.setCourseCategoryName(coursecategoriesname);
            coursecategory.setCourseCategoryDiscription(coursecategorydiscription);
            coursecategory.setCourseCategoryId(7);

            String CourseCategoriesId = request.getParameter("courseCategoryId");

            if (CourseCategoriesId == null || CourseCategoriesId.isEmpty()) {
                ci.addCourseCategories(coursecategory);
                request.getSession().removeAttribute("coursecategory");
            } else {
                coursecategory.setCourseCategoryId(Integer.parseInt(CourseCategoriesId));
                ci.updateCourseCategories(coursecategory);
                request.getSession().removeAttribute("coursecategory");
            }

            request.getSession().setAttribute("coursecategoriesList", ci.findAll());
        }
        response.sendRedirect("tables.jsp");
        
    }



    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
}
