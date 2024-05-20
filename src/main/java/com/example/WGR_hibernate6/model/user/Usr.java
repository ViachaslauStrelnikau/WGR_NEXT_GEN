package com.example.WGR_hibernate6.model.user;

import com.example.WGR_hibernate6.model.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "usr")
public class Usr implements Serializable {

    @Id
    @Length(max = 20, min = 2, message = "Username must be between 2 and 30 characters")
    private String un;

    @Length(max = 32, min = 2, message = "Name of klient must be between 2 and 30 characters")
    private String namKlient;
    @Email
    @Length(max = 250, message = "Field must less than 250 characters")
    private String email;

    @ColumnDefault("false")
    private boolean strans;
    @NotNull
    @Length(max = 32, min = 2, message = "Field must be between 2 and 30 characters")
    private String ps;
    private boolean locked;
    @ColumnDefault("false")
    private boolean su;
    @Length(max = 5, min = 2, message = "Field must be between 2 and 30 characters")
    private String lng;
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date dattr;
    @NotNull
    @Length(max = 20, min = 2, message = "Field must be between 2 and 30 characters")
    private String un1;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date datpw;

    @Column(name = "LIMITING_ATTEMPT", scale = 10)
    @ColumnDefault("0")
    private Long limitingAttempt;
    @Length(max = 30, min = 2, message = "Field must be between 2 and 30 characters")
    private String puescUn;
    @Length(max = 28, min = 2, message = "Field must be between 2 and 30 characters")
    private String puescPass;

    @AttributeOverrides({
            @AttributeOverride(name = "fa2Mail", column = @Column(name = "FA2_MAIL")),
            @AttributeOverride(name = "fa2Phone", column = @Column(name = "FA2_PHONE"))
    })
    private Address address;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GROUP_ID")
    private UsrGroupsDir group;

    @ManyToOne
    @JoinColumn(name = "def_route")
    private Route defRoute;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "usr_groups",
            joinColumns = @JoinColumn(name = "USR_ID"),
            inverseJoinColumns = @JoinColumn(name = "GROUP_ID"))
    private Set<UsrGroupsDir> groups = new HashSet<>(0);
    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "usr_privilegs",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "PRIV_ID")
    )
    private Set<UsrPrivilegsDir> privilegs = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "UN")
    private Set<GridConfig> gridConfigs = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "usr_admin_groups",
            joinColumns = @JoinColumn(name = "USR_ID"),
            inverseJoinColumns = @JoinColumn(name = "GROUP_ID")
    )
    private Set<UsrGroupsDir> adminGroups = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "UN_ID")
    private Set<UserPiDoc> userPiDocs = new HashSet<>();


    public Set<UserPiDoc> getUserPiDocs() {
        return userPiDocs;
    }

    public void setUserPiDocs(Set<UserPiDoc> userPiDocs) {
        this.userPiDocs = userPiDocs;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public void setNamKlient(String namKlient) {
        this.namKlient = namKlient;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStrans(boolean strans) {
        this.strans = strans;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public void setSu(boolean su) {
        this.su = su;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public void setDattr(Date dattr) {
        this.dattr = dattr;
    }

    public void setUn1(String un1) {
        this.un1 = un1;
    }

    public void setDatpw(Date datpw) {
        this.datpw = datpw;
    }

    public void setLimitingAttempt(Long limitingAttempt) {
        this.limitingAttempt = limitingAttempt;
    }

    public void setPuescUn(String puescUn) {
        this.puescUn = puescUn;
    }

    public void setPuescPass(String puescPass) {
        this.puescPass = puescPass;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setGroup(UsrGroupsDir group) {
        this.group = group;
    }

    public void setDefRoute(Route defRoute) {
        this.defRoute = defRoute;
    }

    public void setGroups(Set<UsrGroupsDir> groups) {
        this.groups = groups;
    }

    public void setPrivilegs(Set<UsrPrivilegsDir> privilegs) {
        this.privilegs = privilegs;
    }

    public void setGridConfigs(Set<GridConfig> gridConfigs) {
        this.gridConfigs = gridConfigs;
    }

    public Set<UsrGroupsDir> getAdminGroups() {
        return adminGroups;
    }

    public void setAdminGroups(Set<UsrGroupsDir> adminGroups) {
        this.adminGroups = adminGroups;
    }

    public String getUn() {
        return un;
    }

    public String getNamKlient() {
        return namKlient;
    }

    public String getEmail() {
        return email;
    }

    public boolean isStrans() {
        return strans;
    }

    public String getPs() {
        return ps;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean isSu() {
        return su;
    }

    public String getLng() {
        return lng;
    }

    public Date getDattr() {
        return dattr;
    }

    public String getUn1() {
        return un1;
    }

    public Date getDatpw() {
        return datpw;
    }

    public Long getLimitingAttempt() {
        return limitingAttempt;
    }

    public String getPuescUn() {
        return puescUn;
    }

    public String getPuescPass() {
        return puescPass;
    }

    public Address getAddress() {
        return address;
    }

    public Route getDefRoute() {
        return defRoute;
    }

    public Set<UsrGroupsDir> getGroups() {
        return groups;
    }

    public Set<UsrPrivilegsDir> getPrivilegs() {
        return privilegs;
    }

    public Set<GridConfig> getGridConfigs() {
        return gridConfigs;
    }

    public UsrGroupsDir getGroup() {
        return group;
    }
}
