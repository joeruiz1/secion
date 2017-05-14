<%-- 
    Document   : menu
    Created on : 27/04/2017, 07:56:47 PM
    Author     : fernando stiven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
  <meta content="text/html; charset=ISO-8859-1"
 http-equiv="content-type">
  <title></title>
</head>

<body>
<div style="text-align: center;">
<form method="post" action="servletN" name="secion">bienvenido
a la&nbsp;base de &nbsp;datos de la libreria <br>
  <div style="text-align: center;">
  <div style="text-align: justify;">para ingresar a la
base de datos ingrese su usuario y contraseña </div>
  <br>
  <br>
  <div style="text-align: center;">usuario <input
 name="usuario"><br>
contraseña<input name="contra"><br>
  <br>
  <a href="http://localhost:8080/secion2/olvidodecontrase%C3%B1a.jsp">¿has
olvidado tu contraseña?</a><br>
  <a href="http://localhost:8080/secion2/crear%20usuario.jsp">¿Deseas
crear un usuario?</a></div>
  </div>
  <br>
  <input name="enviar" value="envio" type="submit"><br>
  <br>
</form>
</div>
</body>
</html>





