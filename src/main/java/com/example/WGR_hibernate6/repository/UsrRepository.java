package com.example.WGR_hibernate6.repository;

import com.example.WGR_hibernate6.model.user.Usr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsrRepository extends JpaRepository<Usr, String> {
}
