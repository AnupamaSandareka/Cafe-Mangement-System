package com.cafe.inn.cafemanagementsystem.dao;

import com.cafe.inn.cafemanagementsystem.POJO.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillDao extends JpaRepository<Bill,Integer> {
}
