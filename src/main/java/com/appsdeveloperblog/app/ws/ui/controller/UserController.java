package com.appsdeveloperblog.app.ws.ui.controller;

import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") //http://localhost:8080/users
public class UserController {
    @GetMapping
    public String getUser() {
        return "get User";
    }
    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
        return null;
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
