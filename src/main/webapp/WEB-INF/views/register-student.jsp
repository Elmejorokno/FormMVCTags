<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>Student Register</title>
    </head>
    <body>
        <form:form action="register" method="post" modelAttribute="student">
            Nombre: <form:input path="firstName" />
            <form:errors path="firstName" />

            <br/><br/><br/>

            Apellidos: <form:input path="lastName" />
            <form:errors path="lastName" />

            <br/><br/><br/>

            Email: <form:input path="email" />
            <form:errors path="email" />

            <br/><br/><br/>

            Código Postal: <form:input path="zipCode" />
            <form:errors path="zipCode" />

            <br/><br/><br/>

            Edad: <form:input path="age" type="number"/>
            <form:errors path="age" />

            <br/><br/><br/>

            <form:select path="major" items="${majors}"/>
            <form:errors path="major" />

            <br/><br/><br/>

            <form:radiobutton path="gender" value="male" label="Hombre"/>
            <form:radiobutton path="gender" value="female" label="Mujer" />
            <form:radiobutton path="gender" value="other" label="Otro"/>

            <br/><br/><br/>

            <button type="submit">Enviar</button>
        </form:form>
    </body>
</html>
