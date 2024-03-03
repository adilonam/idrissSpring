package com.example.autotrip.repositories;

import com.example.autotrip.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {

}

