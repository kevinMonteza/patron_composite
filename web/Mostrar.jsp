<%-- 
    Document   : Mostrar.jsp
    Created on : Jun 21, 2018, 1:54:59 AM
    Author     : kevinMC
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.Componente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carrito de compras</title>
        <% String lista = (String) request.getAttribute("lista");%>
    </head>
    <body>
        <h1>Descripcion de los componentes seleccionados</h1>
        <h2><%= lista%></h2>
    </body>
</html>
