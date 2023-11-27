package com.fadil.tugashrd.service;

import com.fadil.tugashrd.entity.Menu;
import com.fadil.tugashrd.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    public final MenuRepository menuRepository;
    @Autowired
    public MenuService(MenuRepository menuRepository){
        this.menuRepository = menuRepository;
    }

    public List<Menu> getAllMenu(){
        return menuRepository.findAll();
    }
}
