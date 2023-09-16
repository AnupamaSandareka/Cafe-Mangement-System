package com.cafe.inn.cafemanagementsystem.rest;

import com.cafe.inn.cafemanagementsystem.POJO.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/category")
public interface CategoryRest {

    @PostMapping(path = "/add")
    ResponseEntity<String> addNewCategory(@RequestBody(required = true) Map<String, String> requestMap);

    @GetMapping(path = "/getAllCategory")
    ResponseEntity<List<Category>> getAllCategory(@RequestParam(required = false) String filterValue);

    @PostMapping(path = "/updateCategory")
    ResponseEntity<String> updateCategory(@RequestBody(required = true) Map<String,String> requestMap);

}
