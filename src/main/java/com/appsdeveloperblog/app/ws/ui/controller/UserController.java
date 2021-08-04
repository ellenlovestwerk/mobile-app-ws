package com.appsdeveloperblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") //http://localhost:8080/users
public class UserController {
    @GetMapping
    public String getUser() {
        return "get User";
    }
    @PostMapping
    public String createUser(RequestBody UserDetailsRequestModel userDetails) {
        return "create User";
    }
    @PutMapping
    public String updateUser() {
        return "update User";
    }
    @DeleteMapping
    public String deleteUser() {
        return "delete User";
    }
}
