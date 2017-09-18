<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <div>
            <form action="ageCalculator" method="get">
                Enter Current Age: <input type="number" name="age" value="${age}">
                <input type="submit" value="Age next birthday">
            </form>
            
        </div>
        ${errorMessage}
        ${successMessage}
    </body>
</html>
