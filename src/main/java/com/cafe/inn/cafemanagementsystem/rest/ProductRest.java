package com.cafe.inn.cafemanagementsystem.rest;

import com.cafe.inn.cafemanagementsystem.wrapper.ProductWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/product")
public interface ProductRest {

    @PostMapping(path = "/addNewProduct")
    ResponseEntity<String> addNewProduct(@RequestBody(required = true)Map<String,String> requestMap);

    @GetMapping(path = "/getAllProduct")
    ResponseEntity<List<ProductWrapper>> getAllProduct();

    @PostMapping(path = "/updateProduct")
    ResponseEntity<String> updateProduct(@RequestBody(required = true) Map<String,String> requestMap);
}
