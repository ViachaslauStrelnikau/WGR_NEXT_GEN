package com.example.WGR_hibernate6.repository;

import com.example.WGR_hibernate6.model.PackDoc;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PackDocRepository extends JpaRepository<PackDoc, Long> {
    List<PackDoc> findByRouteHid(Long routeHid, Pageable pageable);
}
