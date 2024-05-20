package com.example.WGR_hibernate6.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RouteGraphId implements Serializable {
    @Column(name = "HID_ROUTE")
    private Long hidRoute;

    @Column(name = "HID_ROUTE_GRAPH")
    private Long hidRouteGraph;

    public RouteGraphId(Long hid, Long hidRouteGraph) {
        this.hidRoute = hid;
        this.hidRouteGraph = hidRouteGraph;
    }

    public RouteGraphId() {
    }

    public Long getHidRoute() {
        return hidRoute;
    }

    public void setHidRoute(Long hidRoute) {
        this.hidRoute = hidRoute;
    }

    public Long getHidRouteGraph() {
        return hidRouteGraph;
    }

    public void setHidRouteGraph(Long hidRouteGraph) {
        this.hidRouteGraph = hidRouteGraph;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RouteGraphId that = (RouteGraphId) o;
        return Objects.equals(hidRoute, that.hidRoute) && Objects.equals(hidRouteGraph, that.hidRouteGraph);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hidRoute, hidRouteGraph);
    }
}
