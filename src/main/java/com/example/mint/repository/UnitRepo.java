package com.example.mint.repository;

import com.example.mint.entity.MaintainableUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository public interface UnitRepo extends JpaRepository<MaintainableUnit, String> {}