package com.example.WGR_hibernate6.repository;

import com.example.WGR_hibernate6.model.GridConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface GridConfigRepository extends JpaRepository<GridConfig, Long> {

    Collection<GridConfig> findByUn(String un);
}
