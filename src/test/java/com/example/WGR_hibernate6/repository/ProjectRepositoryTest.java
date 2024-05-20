package com.example.WGR_hibernate6.repository;


import com.example.WGR_hibernate6.model.Project;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ProjectRepositoryTest {

    @Autowired
    private ProjectRepository projectRepository;


    @Test
    @Transactional
    public void testListALlProject() {
        List<Project> projects = projectRepository.findAll();
        System.out.println(projects.size());
        for(Project project : projects) {
            System.out.println(project.getName());
            System.out.println(project.getRoutes().size());
        }




    }

}
