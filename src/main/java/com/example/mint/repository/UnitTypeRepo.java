package com.example.mint.repository;

import com.example.mint.entity.MaintainableUnitType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository public interface UnitTypeRepo extends JpaRepository<MaintainableUnitType, String> {}
