package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.PayrollModel;

@Repository
public interface PayrollRepository extends JpaRepository<PayrollModel,Long> {
	
}
