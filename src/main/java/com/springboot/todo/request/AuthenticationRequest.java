package com.springboot.todo.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class AuthenticationRequest {

    @NotEmpty(message = "Email is mandatory")
    @Email(message = "Invalid format")
    private String email;

    @NotEmpty(message = "Password is mandatory")
    @Size(min = 5, max = 30, message = "Password must be 5 characters long")
    private  String password;

    public @NotEmpty(message = "Email is mandatory") @Email(message = "Invalid format") String getEmail() {
        return email;
    }

    public void setEmail(@NotEmpty(message = "Email is mandatory") @Email(message = "Invalid format") String email) {
        this.email = email;
    }

    public @NotEmpty(message = "Password is mandatory") @Size(min = 5, max = 30, message = "Password must be 5 characters long") String getPassword() {
        return password;
    }

    public void setPassword(@NotEmpty(message = "Password is mandatory") @Size(min = 5, max = 30, message = "Password must be 5 characters long") String password) {
        this.password = password;
    }
}
