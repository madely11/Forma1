package com.madelybetancourt.forma1.user.controller;

import com.madelybetancourt.forma1.user.service.SegUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SegUserController {
    
    @Autowired
    SegUserService segUserService;

    @GetMapping("/all")
    public Object getAllUsers() {
        return this.segUserService.getAllUsers();
    }
}
