
package controller;

import dao.CoursesInterface;
import dao.CoursesRepository;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CourseCategories;
import model.Courses;
import model.Languages;


@WebServlet(name = "CoursesController", urlPatterns = {"/CoursesController"})
public class CoursesController extends HttpServlet {


    CoursesInterface ui;

    public CoursesController() {
        ui = new CoursesRepository();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("coursesList")) {
            request.getSession().setAttribute("coursesList", ui.findAll());
        }

        if (action.equalsIgnoreCase("delete")) {
            int CourseId = Integer.parseInt(request.getParameter("coursesId"));
            ui.deleteCourse(CourseId);
            request.getSession().removeAttribute("course");
            request.setAttribute("coursesList", ui.findAll());
            response.sendRedirect("CourseForm.jsp");
        } else if (action.equalsIgnoreCase("edit")) {
            int CourseId = Integer.parseInt(request.getParameter("coursesId"));
            Courses courses = ui.getCourses(CourseId);
            request.getSession().setAttribute("course", courses);
            response.sendRedirect("CourseForm.jsp");
        }
        //RequestDispatcher rd = request.getRequestDispatcher("UserForm.jsp");
        //rd.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String action = request.getParameter("action");
        
        ui = new CoursesRepository();
        
        String CourseTitle = request.getParameter("coursetitle");
        String CourseDescription = request.getParameter("coursedescription");
        int DurationDays = Integer.parseInt(request.getParameter("courseduration"));
        BigDecimal CourseFee= new BigDecimal(request.getParameter("coursefee"));
        

        if (!CourseTitle.trim().isEmpty() && !CourseDescription.trim().isEmpty() && DurationDays > 0 && CourseFee.doubleValue() > 0) {
            Courses course = new Courses();
            course.setCourseTitle(CourseTitle);
            course.setCourseDescription(CourseDescription);
            course.setCourseFee(CourseFee);
            course.setCourseId(12);
            course.setCourseDurationDays(DurationDays);
            CourseCategories cc = new CourseCategories();
            cc.setCourseCategoryId(1);
            course.setCourseCategoryId(cc);
            Languages l = new Languages();
            l.setLanguageId(1);
            course.setLanguageId(l);
            
        
            String CoursesId = request.getParameter("courseId");

            if (CoursesId == null || CoursesId.isEmpty()) {
                ui.addCourse(course);
                request.getSession().removeAttribute("course");
            } else {
                course.setCourseId(Integer.parseInt(CoursesId));
                ui.updateCourse(course);
                request.getSession().removeAttribute("course");
            }

            request.getSession().setAttribute("coursesList", ui.findAll());
        }
        response.sendRedirect("CourseForm.jsp");
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
