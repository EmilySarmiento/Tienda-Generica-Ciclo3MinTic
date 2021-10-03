<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reportes</title>
    <link rel="stylesheet" href="https://bootswatch.com/5/lux/bootstrap.min.css">
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary" style="text-align: center;">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Tienda Virtual</a>
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link" href="usuarios.jsp">Usuarios</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="clientes.jsp">Clientes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="proveedores.jsp">Proveedores</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="productos.jsp">Productos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Ventas</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="reportes.jsp">Reportes</a>
                </li>
            </ul>
        </div>
    </nav>
    <div class="container">
        <div class="row align-items-center mt-4 text-center justify-content-center">
	        	<div class="d-grid gap-2">
	        		<a href="listadoUsuarios.jsp" class="btn btn-lg btn-primary" role="button" aria-pressed="true">Listado de usuarios</a>
				  	<a href="listadoClientes.jsp" class="btn btn-lg btn-primary" role="button" aria-pressed="true">Listado de clientes</a>
				  	<a href="ventasCliente.jsp" class="btn btn-lg btn-primary" role="button" aria-pressed="true">Ventas por cliente</a>
				 </div>
        			
        <iframe name="null" style="display:non;"></iframe><!-- mensajes-->
        </div>
    </div>