<%-- 
    Document   : admin
    Created on : Dec 16, 2018, 5:27:33 PM
    Author     : Rrezart-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  session="true" %>

<% 
    HttpSession sesion = request.getSession();
    if (sesion.getAttribute("nivel")== null) {
          response.sendRedirect("../index.jsp");
        }
  


%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="right">
            
            Welcome <%= sesion.getAttribute("username") %>
            <a href="../index.jsp?logout=true" >Log out</a>
            <hr>
            
        </div>
        <h1>Welcome Administrator</h1>
    </body>
</html>
