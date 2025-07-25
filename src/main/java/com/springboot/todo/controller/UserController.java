package com.springboot.todo.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "User REST Api endpoints", description = "Operation related to info about current user")
@RestController
@RequestMapping("/api/user")
public class UserController {



}  
