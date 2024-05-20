package com.example.WGR_hibernate6.repository;

import com.example.WGR_hibernate6.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
