package com.example.WGR_hibernate6.repository;

import com.example.WGR_hibernate6.model.PackDoc;
import com.example.WGR_hibernate6.model.cimsmgs.*;
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
    public void findAllTest() {
        List<PackDoc> packDocs = packDocRepository.findByRouteHid(3L, PageRequest.of(0, 200)).stream().toList();
        assertEquals(200, packDocs.size());

        for (PackDoc packDoc : packDocs) {
            System.out.println("Invoices: " + packDoc.getCsInvoices().size());
            System.out.println("Status: " + packDoc.getStatuses().size());
            System.out.println("Smgss: " + packDoc.getCimSmgses().size());
            for (CimSmgs smgs : packDoc.getCimSmgses()) {
                System.out.println("Docses7"+smgs.getCimSmgsDocses7().size());
                System.out.println("Docses9"+smgs.getCimSmgsDocses9().size());
                System.out.println("Docses13"+smgs.getCimSmgsDocses13().size());
                System.out.println("Docses136"+smgs.getCimSmgsDocses136().size());

                System.out.println("carLists : " + smgs.getCimSmgsCarLists().size());
                for (CimSmgsCarList carList : smgs.getCimSmgsCarLists().values()) {
                    if(smgs.isContOtpr()) {
                        System.out.println("KOnt otpr");
                        System.out.println("konLists : " + carList.getCimSmgsKonLists().size());
                        for (CimSmgsKonList konList: carList.getCimSmgsKonLists().values()){
                            System.out.println("Plombs : " + konList.getCimSmgsPlombs().size());

                            System.out.println("gruzs : " + konList.getCimSmgsGruzs().size());
                            for(CimSmgsGruz gruz: konList.getCimSmgsGruzs().values())
                                System.out.println("Dangruzs : " + gruz.getCimSmgsDanGruzs().size());
                        }
                    }else{
                        System.out.println("Car otpr");
                        System.out.println("Plombs : " + carList.getCimSmgsPlombs().size());
                        System.out.println("gruzs : " + carList.getCimSmgsGruzs().size());
                        for(CimSmgsGruz gruz: carList.getCimSmgsGruzs().values())
                            System.out.println("Dangruzs : " + gruz.getCimSmgsDanGruzs().size());
                    }
                }

            }
        }
    }

}
