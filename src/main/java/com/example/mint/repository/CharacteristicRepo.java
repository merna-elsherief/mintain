package com.example.mint.repository;

import com.example.mint.entity.OperationalCharacteristic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository public interface CharacteristicRepo extends JpaRepository<OperationalCharacteristic, String> {}