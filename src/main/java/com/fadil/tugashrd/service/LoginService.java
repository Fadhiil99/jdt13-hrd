package com.fadil.tugashrd.service;

import com.fadil.tugashrd.dto.LoginRequest;
import com.fadil.tugashrd.dto.LoginResponse;
import com.fadil.tugashrd.entity.Hrd;
import com.fadil.tugashrd.entity.Login;
import com.fadil.tugashrd.repository.HrdRepository;
import com.fadil.tugashrd.repository.LoginRepository;
import com.fadil.tugashrd.util.JwtToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    public final LoginRepository loginRepository;
    public final HrdRepository hrdRepository;

    @Autowired
    public LoginService(LoginRepository loginRepository, HrdRepository hrdRepository){
        this.loginRepository = loginRepository;
        this.hrdRepository = hrdRepository;
    }

    public LoginResponse login(LoginRequest request) {
        Optional<Hrd> hrdOptional = hrdRepository.findByUsernameAndPassword(request.getUsername(), request.getPassword());

        if(!hrdOptional.isPresent()){
            return null;
        }
        Login l = new Login();
        Hrd hrds = hrdOptional.get();

        hrds.setHrdId(hrds.getHrdId());
        hrds.setUsername(request.getUsername());
        hrds.setPassword(request.getPassword());
        l.setToken(JwtToken.getToken(request));
        l.setHrd(hrds);
        loginRepository.save(l);

        return LoginResponse.builder()
                .token(l.getToken())
                .build();
    }
}
