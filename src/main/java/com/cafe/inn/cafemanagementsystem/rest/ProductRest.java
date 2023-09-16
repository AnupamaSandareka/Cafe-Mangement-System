package com.cafe.inn.cafemanagementsystem.rest;

import com.cafe.inn.cafemanagementsystem.wrapper.ProductWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "/deleteById/{id}")
    ResponseEntity<String> deleteProductById(@PathVariable Integer id);

    @PostMapping(path = "/updateStatus")
    ResponseEntity<String> updateStatus(@RequestBody(required = true) Map<String,String> requestMap);

    @GetMapping(path = "/getByCategory/{id}")
    ResponseEntity<List<ProductWrapper>> getByCategory(@PathVariable Integer id);

    @GetMapping(path = "/getProductById/{id}")
    ResponseEntity<ProductWrapper> getProductById(@PathVariable Integer id);
}
