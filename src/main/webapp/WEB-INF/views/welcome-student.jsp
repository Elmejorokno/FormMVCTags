<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Bienvenido</title>
    </head>
    <body>
            <h2>Bienvenido, ${student.firstName} ${student.lastName}</h2>
        <p>Te has registrado con tu email: ${student.email}</p>
        <p>Estás estudiando ${student.major}</p>
    </body>
</html>
