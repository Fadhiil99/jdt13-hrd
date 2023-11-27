package com.fadil.tugashrd.controller;

import com.fadil.tugashrd.dto.*;
import com.fadil.tugashrd.service.HrdService;
import com.fadil.tugashrd.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin("*")
@RestController
@RequestMapping("/hrd/login")
public class LoginController {

    public final LoginService loginService;
    public final HrdService hrdService;

    @Autowired
    public LoginController(LoginService loginService, HrdService hrdService){
        this.loginService = loginService;
        this.hrdService = hrdService;
    }

    @PostMapping
    public ResponseEntity<LoginResponse> loginUser (@RequestBody LoginRequest request) {
        LoginResponse response = loginService.login(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/registration")
    public ResponseEntity<HrdResponse> registered(@Valid @RequestBody HrdRequest request){
        HrdResponse response = hrdService.saveHrd(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
