package com.example.WGR_hibernate6.repository;

import com.example.WGR_hibernate6.model.stamp.PrintDataStamp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StampRepository extends JpaRepository<PrintDataStamp, Long> {
}
