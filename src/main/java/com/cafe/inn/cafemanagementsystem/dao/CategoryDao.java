package com.cafe.inn.cafemanagementsystem.dao;

import com.cafe.inn.cafemanagementsystem.POJO.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category,Integer> {

    List<Category> getAllCategory();
}
