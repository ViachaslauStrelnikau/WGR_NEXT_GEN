package com.example.WGR_hibernate6.service;


import com.example.WGR_hibernate6.model.Route;
import com.example.WGR_hibernate6.repository.ProjectRepository;
import com.example.WGR_hibernate6.repository.RouteRepository;
import com.example.WGR_hibernate6.repository.UsrRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsrService {

    @Autowired
    private UsrRepository usrRepository;

    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private ProjectRepository projectRepository;



    @Transactional
    public void getUsrs(){

//        List<Project> projects = projectRepository.findAll();
//
//        for(Project project:projects){
//            System.out.println("project routes size "+project.getRoutes().size());
//            System.out.println("project groups size "+project.getProjectGroupses().size());
//        }

        List<Route> routes= routeRepository.findAll();
        for(Route route:routes){
            System.out.println("Binded routes size: "+route.getBindedRoutes().size());
            System.out.println("Route docs size: "+route.getRouteDocs().size());
            System.out.println("Route groups size: "+route.getRouteGroupses().size());
        }
//System.out.println("");
//        List<Usr> list= usrRepository.findAll();
//        for(Usr usr:list){
//            System.out.println(usr.getUn());
//            System.out.println("Group size: "+ usr.getGroups().size());
//            System.out.println("GridConfigs size:"+usr.getGridConfigs().size());
//            System.out.println("Previlages size: "+ usr.getPrivilegs().size());
//            System.out.println("Admin group size: "+ usr.getAdminGroups().size());
//            System.out.println("User pi docs size: "+ usr.getUserPiDocs().size());
//        }

    }
}
