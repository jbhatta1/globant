<%-- 
    Document   : globant
    Created on : Dec 21, 2015, 7:39:28 AM
    Author     : jaya
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test App</title>
        <script src="<%=request.getContextPath() %>/js/jquery-1.11.3.min.js"></script>
        <script>
            $(document).ready(function(){
                $(button).click(function() {
                    $(h1).hide();
                });
                var ctxPath = "<%=request.getContextPath() %>";
                $(function() {
                    $("#authenticate").on("click", function(){
                         $.ajax({
                             url: ctxPath + "/sample/rest/UserService/authenticate",
                             type: "POST",
                             data: '{"userId":"user1", "password":"abc123"}',
                             contentType: "application/json",
                             cache: false,
                             dataType: "json"
                         });
                });
            });
        </script>
    </head>
    <body>
        <h1>Globant Test</h1>
        <ul>
                <li><button id="authenticate">Authenticate</button></li>
        </ul>
    </body>
</html>
