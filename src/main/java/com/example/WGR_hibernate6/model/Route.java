package com.example.WGR_hibernate6.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Parent;

import java.util.*;

@Entity
@Table(name = "route")
public class Route {

    @Id
    @org.hibernate.annotations.GenericGenerator(
            name = "ID_GENERATOR_ROUTE",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "ROUTE_HID"),
                    @Parameter(name = "initial_value", value = "1")
            }
    )
    private Long hid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hid_proj")
    private Project project;
    private String name;
    private Date dattr;
    private String un;
    private Date locked;
    private String unLock;
    private Date altered;
    private String tbc_st_code;
    private String customCode;
    private String astanaRepresent;
    private String vedDir;
    private String vedLogin;
    private String vedPass;

    private String emailMask;
    private String emailsAddrs;
    private String printText;
    private Boolean vagTracking;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "HID_ROUTE")
    private Set<RouteGraph> bindedRoutes = new HashSet<>();

    @OneToMany
    @JoinTable(name = "route_groups",
            joinColumns = @JoinColumn(name = "HID_ROUTE"),
            inverseJoinColumns = @JoinColumn(name = "GROUP_ID")
    )
    private Set<UsrGroupsDir> routeGroupses = new HashSet<>();

    @OneToMany
    @JoinTable(name = "route_doc",
            joinColumns = @JoinColumn(name = "HID_ROUTE"),
            inverseJoinColumns = @JoinColumn(name = "HID_DDIR")
    )
    @OrderColumn(name = "SORT_ID", nullable = false)
    private List<DocDir> routeDocs = new ArrayList<>();

    public List<DocDir> getRouteDocs() {
        return routeDocs;
    }

    public void setRouteDocs(List<DocDir> routeDocs) {
        this.routeDocs = routeDocs;
    }

    public Set<UsrGroupsDir> getRouteGroupses() {
        return routeGroupses;
    }

    public void setRouteGroupses(Set<UsrGroupsDir> routeGroupses) {
        this.routeGroupses = routeGroupses;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
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

    public String getTbc_st_code() {
        return tbc_st_code;
    }

    public void setTbc_st_code(String tbc_st_code) {
        this.tbc_st_code = tbc_st_code;
    }

    public String getCustomCode() {
        return customCode;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode;
    }

    public String getAstanaRepresent() {
        return astanaRepresent;
    }

    public void setAstanaRepresent(String astanaRepresent) {
        this.astanaRepresent = astanaRepresent;
    }

    public String getVedDir() {
        return vedDir;
    }

    public void setVedDir(String vedDir) {
        this.vedDir = vedDir;
    }

    public String getVedLogin() {
        return vedLogin;
    }

    public void setVedLogin(String vedLogin) {
        this.vedLogin = vedLogin;
    }

    public String getVedPass() {
        return vedPass;
    }

    public void setVedPass(String vedPass) {
        this.vedPass = vedPass;
    }

    public String getEmailMask() {
        return emailMask;
    }

    public void setEmailMask(String emailMask) {
        this.emailMask = emailMask;
    }

    public String getEmailsAddrs() {
        return emailsAddrs;
    }

    public void setEmailsAddrs(String emailsAddrs) {
        this.emailsAddrs = emailsAddrs;
    }

    public String getPrintText() {
        return printText;
    }

    public void setPrintText(String printText) {
        this.printText = printText;
    }

    public Boolean getVagTracking() {
        return vagTracking;
    }

    public void setVagTracking(Boolean vagTracking) {
        this.vagTracking = vagTracking;
    }

    public Set<RouteGraph> getBindedRoutes() {
        return bindedRoutes;
    }

    public void setBindedRoutes(Set<RouteGraph> bindedRoutes) {
        this.bindedRoutes = bindedRoutes;
    }

    public Long getHid() {
        return hid;
    }
}
