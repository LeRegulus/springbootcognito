package com.regulus.sprinbootcognito.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getUser")
    @PreAuthorize("hasAnyAuthority('SCOPE_sbuserapi/readUser')")
    public String getUser(){
        return "Access Granted: Reading user details";
    }

    @PostMapping("/updateUser")
    @PreAuthorize("hasAnyAuthority('SCOPE_sbuserapi/updateUser')")
    public String writeUser(){
        return "Access Granted: Writing user details";
    }
}
