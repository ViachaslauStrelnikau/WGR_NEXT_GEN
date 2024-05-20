package com.example.WGR_hibernate6.model;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "project")
public class Project implements Serializable {

    @Id
	private Long hid;
	private String name;
	private Date dattr;
	private String un;
	private Date locked;
	private String unLock;
	private Date altered;
    private String robotEmail;
    private String robotPass;
    private String piStationc;
    private String piCustomCode;

    @OneToMany(mappedBy = "project",fetch = FetchType.LAZY)
    private Set<Route> routes = new TreeSet<>();

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "project_groups",
            joinColumns = @JoinColumn(name = "HID_PROJ"),
            inverseJoinColumns = @JoinColumn(name = "GROUP_ID")
    )
    private Set<UsrGroupsDir> projectGroupses = new HashSet<>(0);

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public void setRoutes(Set<Route> routes) {
        this.routes = routes;
    }

    public Set<UsrGroupsDir> getProjectGroupses() {
        return projectGroupses;
    }

    public void setProjectGroupses(Set<UsrGroupsDir> projectGroupses) {
        this.projectGroupses = projectGroupses;
    }

    public Long getHid() {
        return hid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDattr() {
        return dattr;
    }

    public void setDattr(Date dattr) {
        this.dattr = dattr;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public Date getLocked() {
        return locked;
    }

    public void setLocked(Date locked) {
        this.locked = locked;
    }

    public String getUnLock() {
        return unLock;
    }

    public void setUnLock(String unLock) {
        this.unLock = unLock;
    }

    public Date getAltered() {
        return altered;
    }

    public void setAltered(Date altered) {
        this.altered = altered;
    }

    public String getRobotEmail() {
        return robotEmail;
    }

    public void setRobotEmail(String robotEmail) {
        this.robotEmail = robotEmail;
    }

    public String getRobotPass() {
        return robotPass;
    }

    public void setRobotPass(String robotPass) {
        this.robotPass = robotPass;
    }

    public String getPiStationc() {
        return piStationc;
    }

    public void setPiStationc(String piStationc) {
        this.piStationc = piStationc;
    }

    public String getPiCustomCode() {
        return piCustomCode;
    }

    public void setPiCustomCode(String piCustomCode) {
        this.piCustomCode = piCustomCode;
    }

    public Set<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(SortedSet<Route> routes) {
        this.routes = routes;
    }
}
