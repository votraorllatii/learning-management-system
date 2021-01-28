/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserRolesInterface;
import dao.UserRolesRepository;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserRoles;

/**
 *
 * @author VotraOrllati
 */
@WebServlet(name = "UserRolesController", urlPatterns = {"/UserRolesController"})
public class UserRolesController extends HttpServlet {

        UserRolesInterface uri;

    public UserRolesController() {
        uri = new UserRolesRepository();
    }
    
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("userRolesList")) {
            request.getSession().setAttribute("userRolesList", uri.findAll());
        }

        if (action.equalsIgnoreCase("delete")) {

            int usersRolesId = Integer.parseInt(request.getParameter("userRolesId"));
            uri.deleteUserRoles(usersRolesId);
            request.getSession().removeAttribute("userRole");
            request.setAttribute("userRolesList", uri.findAll());
            response.sendRedirect("Role.jsp");
        } else if (action.equalsIgnoreCase("edit")) {
            int usersId = Integer.parseInt(request.getParameter("userRolesId"));
            UserRoles userRole = uri.getUserRoles(usersId);
            request.getSession().setAttribute("userRole", userRole);
            response.sendRedirect("Role.jsp");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String action = request.getParameter("action");
        uri = new UserRolesRepository();

        String roleName = request.getParameter("roleName");
        String roleDescription = request.getParameter("roleDescription");


        if (!roleName.trim().isEmpty() && !roleDescription.trim().isEmpty()) {
            UserRoles userRole = new UserRoles();
            
            userRole.setRoleName(roleName);
            userRole.setRoleDescription(roleDescription);

            userRole.setRoleId(9999);

            String usersRolesId = request.getParameter("userRolesId");

            if (usersRolesId == null || usersRolesId.isEmpty()) {
                uri.addUserRoles(userRole);
                request.getSession().removeAttribute("userRole");
            } else {
                userRole.setRoleId(Integer.parseInt(usersRolesId));
                uri.updateUserRoles(userRole);
                request.getSession().removeAttribute("userRole");
            }

            request.getSession().setAttribute("userRolesList", uri.findAll());
        }
        response.sendRedirect("Role.jsp");
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
