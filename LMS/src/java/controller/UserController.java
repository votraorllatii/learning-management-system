/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserInterface;
import dao.UsersRepository;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.UserRoles;
import model.Users;

/**
 *
 * @author VotraOrllati
 */
@WebServlet(name = "UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {

    UserInterface ui;

    public UserController() {
        ui = new UsersRepository();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("usersList")) {
            request.getSession().setAttribute("usersList", ui.findAll());
        }

        if (action.equalsIgnoreCase("delete")) {

            int usersId = Integer.parseInt(request.getParameter("usersId"));
            ui.deleteUser(usersId);
            request.getSession().removeAttribute("user");
            request.setAttribute("usersList", ui.findAll());
            response.sendRedirect("User.jsp");
        } else if (action.equalsIgnoreCase("edit")) {
            int usersId = Integer.parseInt(request.getParameter("usersId"));
            Users user = ui.getUsers(usersId);
            request.getSession().setAttribute("user", user);
            response.sendRedirect("User.jsp");
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        ui = new UsersRepository();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        if (!username.trim().isEmpty() && !password.trim().isEmpty() && !email.trim().isEmpty()) {
            Users user = new Users();
            user.setName(username);
            user.setPassword(password);
            user.setEmail(email);
            UserRoles ur = new UserRoles();
            ur.setRoleId(1);
            user.setRoleId(ur);
            user.setUserId(99999);

            String userId = request.getParameter("userId");

            if (userId == null || userId.isEmpty()) {
                ui.addUser(user);
                request.getSession().removeAttribute("user");
            } else {
                user.setUserId(Integer.parseInt(userId));
                ui.updateUser(user);
                request.getSession().removeAttribute("user");
            }

            request.getSession().setAttribute("usersList", ui.findAll());
        }
        response.sendRedirect("User.jsp");
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
