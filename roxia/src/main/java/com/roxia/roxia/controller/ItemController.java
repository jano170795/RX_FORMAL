package com.roxia.roxia.controller;

import com.roxia.roxia.model.ItemRx;
import com.roxia.roxia.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/items")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService serviceItem;

    @GetMapping
    public ResponseEntity<List<ItemRx>> getItemsRoxia(){
        return ResponseEntity.ok(serviceItem.findAll());
    }

    //para pruebas
}
