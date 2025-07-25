package com.springboot.todo.service;

import com.springboot.todo.request.AuthenticationRequest;
import com.springboot.todo.request.RegisterRequest;
import com.springboot.todo.response.AuthenticationResponse;

public interface AuthenticationService {

    void register(RegisterRequest input) throws Exception;

    AuthenticationResponse login(AuthenticationRequest request);
}
