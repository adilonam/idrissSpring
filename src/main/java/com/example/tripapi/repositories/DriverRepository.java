package com.example.tripapi.repositories;

import com.example.tripapi.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {

}

