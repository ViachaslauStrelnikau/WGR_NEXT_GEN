package com.example.WGR_hibernate6.repository;


import com.example.WGR_hibernate6.model.UsrPrivilegsDir;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsrPrivilegsRepository extends JpaRepository<UsrPrivilegsDir,String> {
}
