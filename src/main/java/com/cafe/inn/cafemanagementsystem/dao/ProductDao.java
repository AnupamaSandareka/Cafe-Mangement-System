package com.cafe.inn.cafemanagementsystem.dao;

import com.cafe.inn.cafemanagementsystem.POJO.Product;
import com.cafe.inn.cafemanagementsystem.wrapper.ProductWrapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer> {
    List<ProductWrapper> getAllProduct();
}
