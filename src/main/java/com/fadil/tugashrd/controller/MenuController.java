package com.fadil.tugashrd.controller;

import com.fadil.tugashrd.entity.Menu;
import com.fadil.tugashrd.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/hrd/menu")
public class MenuController {
    public final MenuService menuService;
    @Autowired
    public MenuController(MenuService menuService1){
        this.menuService = menuService1;
    }

    @GetMapping
    public ResponseEntity <List<Menu>>getAllMenu(){
        List<Menu> response = menuService.getAllMenu();
        return ResponseEntity.ok(response);
    }
}
