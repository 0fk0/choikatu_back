package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/API/GET")
public class Store {

    @GetMapping("/stores")
    public ResponseEntity<Map<Integer, String>> getAllStoreWithCoupons() {
        Map<Integer, String> response = new HashMap<>();
        response.put(1, "店名１");
        response.put(2, "店名2");
        response.put(3, "店名３");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
