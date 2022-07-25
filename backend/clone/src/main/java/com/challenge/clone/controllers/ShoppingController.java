package com.challenge.clone.controllers;

import com.challenge.clone.dto.ShoppingDto;
import com.challenge.clone.services.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ShoppingApi/")
public class ShoppingController {

    @Autowired
    private ShoppingService shoppingService;

    @GetMapping(path = "/getShopping")
    public List<ShoppingDto> getShopping(){
        return this.shoppingService.getShopping();
    }

    @GetMapping(path = "/{id}")
    public ShoppingDto getPurchase(@PathVariable("id") Long id){
        return this.shoppingService.getPurchaseById(id);
    }
}
