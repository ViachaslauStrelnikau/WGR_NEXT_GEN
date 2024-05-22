package com.example.WGR_hibernate6.repository.jpa;


import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StatusJPARepository {
    @Autowired
    private EntityManager entityManager;

}
