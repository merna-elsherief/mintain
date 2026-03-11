package com.example.mint.repository;

import com.example.mint.entity.Manufactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository public interface ManufactoryRepo extends JpaRepository<Manufactory, String> {}