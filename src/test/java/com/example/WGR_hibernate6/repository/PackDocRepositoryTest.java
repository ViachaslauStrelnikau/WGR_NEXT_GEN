package com.example.WGR_hibernate6.repository;

import com.example.WGR_hibernate6.model.PackDoc;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PackDocRepositoryTest {

    @Autowired
    private PackDocRepository packDocRepository;

    @Test
    @Transactional
    public void findAllTest(){
        List<PackDoc> packDocs = packDocRepository.findByRouteHid(3L,PageRequest.of(0,200)).stream().toList();
        assertEquals(200,packDocs.size());

        for (PackDoc packDoc : packDocs) {
            System.out.println("Invoices: " +packDoc.getCsInvoices().size());
            System.out.println("Status: " +packDoc.getStatuses().size());
        }
    }

}
