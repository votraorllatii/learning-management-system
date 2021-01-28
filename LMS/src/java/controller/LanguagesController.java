/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.LanguagesInterface;
import dao.LanguagesRepository;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Languages;

/**
 *
 * @author VotraOrllati
 */
@WebServlet(name = "LanguagesController", urlPatterns = {"/LanguagesController"})
public class LanguagesController extends HttpServlet {

    LanguagesInterface li;

    public LanguagesController() {
        li = new LanguagesRepository();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("languagesList")) {
            request.getSession().setAttribute("languagesList", li.findAll());
        }

        if (action.equalsIgnoreCase("delete")) {
            int LanguageId = Integer.parseInt(request.getParameter("languagesId"));
            li.deleteLanguage(LanguageId);
            request.getSession().removeAttribute("language");
            request.setAttribute("languagesList", li.findAll());
            response.sendRedirect("Languages.jsp");
        } else if (action.equalsIgnoreCase("edit")) {
            int LanguageId = Integer.parseInt(request.getParameter("languagesId"));
            Languages languages = li.getLanguages(LanguageId);
            request.getSession().setAttribute("language", languages);
            response.sendRedirect("Languages.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        li = new LanguagesRepository();

        String languageName = request.getParameter("languagename");

        if (!languageName.trim().isEmpty()) {
            Languages language = new Languages();
            language.setLanguageName(languageName);
            language.setLanguageId(6);

            String LanguagesId = request.getParameter("languageId");

            if (LanguagesId == null || LanguagesId.isEmpty()) {
                li.addLanguage(language);
                request.getSession().removeAttribute("language");
            } else {
                language.setLanguageId(Integer.parseInt(LanguagesId));
                li.updateLanguage(language);
                request.getSession().removeAttribute("language");
            }

            request.getSession().setAttribute("languageList", li.findAll());
        }
        response.sendRedirect("Languages.jsp");

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
