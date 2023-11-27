package com.fadil.tugashrd.service;

import com.fadil.tugashrd.dto.TokenResponse;
import com.fadil.tugashrd.entity.Login;
import com.fadil.tugashrd.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TokenService {
    public final LoginRepository loginRepository;
    @Autowired
    public  TokenService(LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }

    public TokenResponse getToken(String token) {
        TokenResponse response = new TokenResponse();

        Optional<Login> getToken = loginRepository.findByToken(token);

        if (getToken.isPresent()){
            response.setValid(true);
            response.setRole(getToken.get().getStatus());
        }
        return response;
    }
}
