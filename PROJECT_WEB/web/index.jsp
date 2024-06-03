<%-- 
    Document   : index
    Created on : 4 jun. 2024, 14:02:10
    Author     : Curso Mañana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int a = 8;
            int b = 2;
            int c = a + b;
            out.println("<h1>"+c+"</h1>");
        %>
    </body>
</html>
