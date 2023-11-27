package com.fadil.tugashrd.service;

import com.fadil.tugashrd.dto.HrdRequest;
import com.fadil.tugashrd.dto.HrdResponse;
import com.fadil.tugashrd.entity.Hrd;
import com.fadil.tugashrd.repository.HrdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HrdService {
    private final HrdRepository hrdRepository;

    @Autowired
    public HrdService(HrdRepository hrdRepository){
        this.hrdRepository = hrdRepository;
    }

    public HrdResponse saveHrd(HrdRequest request) {
        Hrd hrd = new Hrd();

        hrd.setNameHrd(request.getNameHrd());
        hrd.setEmail(request.getEmail());
        hrd.setPhone(request.getPhone());
        hrd.setUsername(request.getUsername());
        hrd.setPassword(request.getPassword());
        hrdRepository.save(hrd);

        return HrdResponse.builder()
                .hrdId(hrd.getHrdId())
                .username(hrd.getUsername())
                .password(hrd.getPassword())
                .nameHrd(hrd.getNameHrd())
                .email(hrd.getEmail())
                .phone(hrd.getPhone())
                .build();
    }
}
