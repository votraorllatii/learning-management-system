<%-- 
    Document   : index
    Created on : 19-Dec-2018, 18:11:35
    Author     : Granit
--%>

<%@page import="model.UserSession"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 
        <%
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
            response.setHeader("Cache-Control", "no-store");
            response.setDateHeader("Expires", 0);

            if (session.getAttribute("username") == null) {
                response.sendRedirect("login.jsp");
            }
        %>
        <%
            String name = (String) session.getAttribute("username");
            out.print("Hello " + name);
        %> 
        <br>
        <form  method="POST" action="LogoutController">
            <button>Log out</button>
        </form>
    </body>
</html>
