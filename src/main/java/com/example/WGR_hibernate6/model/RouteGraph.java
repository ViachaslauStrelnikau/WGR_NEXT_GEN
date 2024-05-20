package com.example.WGR_hibernate6.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.Formula;

import java.io.Serializable;

@Entity
@Table(name = "route_graph")
public class RouteGraph implements Serializable {
    @EmbeddedId
    private RouteGraphId id;

    @Formula("(select distinct r.NAME from ROUTE r where r.HID=HID_ROUTE)")
    private String name;

    public RouteGraphId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(RouteGraphId id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
