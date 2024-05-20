package com.example.WGR_hibernate6.repository;

import com.example.WGR_hibernate6.model.stamp.PrintDataStamp;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class StampRepositoryTest {

    @Autowired
    private StampRepository repository;

    @Test
    @Transactional
    void test() {

        List<PrintDataStamp> list = repository.findAll();
        assertEquals(20, list.size());

    }

}
