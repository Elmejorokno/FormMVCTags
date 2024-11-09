<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <link rel="stylesheet" href="../../resources/css/form.css">
        <title>Student Register</title>
    </head>
    <body>
        <div class="form-container">
            <h2>Registro de alumnos</h2>
            <form:form action="register" method="post" modelAttribute="student">
                <label>Nombre:</label>
                <form:input path="firstName" />
                <form:errors path="firstName" cssClass="error-message" />

                <label>Apellidos:</label>
                <form:input path="lastName" />
                <form:errors path="lastName" cssClass="error-message" />

                <label>Email:</label>
                <form:input path="email" />
                <form:errors path="email" cssClass="error-message" />

                <label>Código Postal:</label>
                <form:input path="zipCode" />
                <form:errors path="zipCode" cssClass="error-message" />

                <label>Edad:</label>
                <form:input path="age" type="number"/>
                <form:errors path="age" cssClass="error-message" />

                <label>Carrera:</label>
                <form:select path="major" items="${majors}"/>
                <form:errors path="major" cssClass="error-message" />

                <label>Género:</label>
                <div class="radio-group">
                    <form:radiobutton path="gender" value="male" label="Hombre"/>
                    <form:radiobutton path="gender" value="female" label="Mujer" />
                    <form:radiobutton path="gender" value="other" label="Otro"/>
                </div>

                <button type="submit" class="btn-enviar">Enviar</button>
            </form:form>
        </div>
    </body>
</html>
