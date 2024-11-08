package com.app.models;

import com.app.validators.ValidMajor;
import jakarta.validation.constraints.*;

public class Student {

    @NotBlank(message = "El nombre es obligatorio.")
    @Size(min = 2, max =  30, message = "El nombre debe tener entre 2 y 30 carácteres.")
    private String firstName;

    @NotBlank(message = "El apellido es obligatorio.")
    @Size(min = 2, max =  30, message = "El apellido debe tener entre 2 y 30 carácteres.")
    private String lastName;

    private String gender;

    @NotBlank(message = "El email es obligatorio.")
    @Email(message = "El formato del email es inválido.")
    private String email;

    @NotBlank(message = "El código postal es obligatorio.")
    @Pattern(regexp = "[0-9]{5}", message = "Código postal inválido.")
    private String zipCode;

    @ValidMajor
    private String major;

    @Min(value = 16, message = "No se permiten edades menores de 16.")
    @Max(value = 65, message = "No se permiten edades mayores de 60.")
    private int age;

    //***SETTERS***
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void setAge(int age) {
        this.age = age;
    }


    //***GETTERS***
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getGender() {
        return gender;
    }
    public String getEmail() {
        return email;
    }
    public String getZipCode() {
        return zipCode;
    }
    public String getMajor() {
        return major;
    }
    public int getAge() {
        return age;
    }
}
