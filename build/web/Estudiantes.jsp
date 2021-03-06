<%@page import="webservice.TipoDocumento"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.TipoDocumentoService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                    <a href="Controlador?accion=add" class="w3-button w3-blue w3-button w3-round w3-border w3-border-black" style="text-decoration: none"> Nuevo Documento </a>
                </div>
                <div class="card-body">
                    <table class="table table-responsive">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NOMBRE DOCUMENTO</th>
                                <th>DESCRIPCION DOCUMENTO</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            TipoDocumentoService TipoDocumento=new TipoDocumentoService();
                            List<TipoDocumento> datos=TipoDocumento.listar();
                            for (TipoDocumento u:datos){
                                
                            
                            %>
                            <tr>
                                <td><%= u.getId()%></td>
                                <td><%= u.getNameDoc()%></td>
                                <td><%= u.getDescripctionDoc()%></td>
                                <td>
                                    <a href="Controlador?accion=edit&id=<%= u.getId()%>" class="w3-button w3-yellow w3-button w3-round w3-border w3-border-black" style="text-decoration: none">Edit</a>
                                    <a href="Controlador?accion=eliminar&id=<%= u.getId()%>" class="w3-button w3-red w3-button w3-round w3-border w3-border-black" style="text-decoration: none"> Delete </a>
                                </td>
                            </tr>
                            <%}%>
                            <tr>
                                <td></td>
                                <td></td>
                            </tr>
                        </tbody>
                    </table>

                </div>
            </div>
        </div>
    </body>
</html>
