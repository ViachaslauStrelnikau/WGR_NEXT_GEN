package com.example.WGR_hibernate6.model;


import com.example.WGR_hibernate6.model.cimsmgs.CimSmgs;
import jakarta.persistence.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ecp")
public class ECP implements Serializable {
    @Id
    @org.hibernate.annotations.GenericGenerator(
            name = "ID_ECP",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "ECP_HID"),
                    @Parameter(name = "initial_value", value = "1")
            }
    )
    private Long hid;
    private String ecp;
    private Long eid;
    private Date arch;
    private String sid;
    private Date dattr;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOC_HID")
    private CimSmgs cimSmgs;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toStringExclude(this, "cimSmgs");
    }


    public CimSmgs getCimSmgs() {
        return cimSmgs;
    }

    public void setCimSmgs(CimSmgs cimSmgs) {
        this.cimSmgs = cimSmgs;
    }

    public ECP() {
    }

    public ECP(Long hid, String ecp, Long eid, Date arch, Date dattr, CimSmgs cimSmgs, DocDir docDir, String sid) {
        this.hid = hid;
        this.ecp = ecp;
        this.eid = eid;
       /* this.docType = docType;
        this.docHid = docHid;*/
        this.arch = arch;
        this.dattr = dattr;
        this.cimSmgs = cimSmgs;
        this.sid = sid;
    }

    public ECP(Long hid, String ecp, CimSmgs cimSmgs, DocDir docDir) {
        this.hid = hid;
        this.ecp = ecp;
        this.cimSmgs = cimSmgs;
    }

    public ECP(Long hid) {
        this.hid = hid;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public String getEcp() {
        return this.ecp;
    }

    public void setEcp(String ecp) {
        this.ecp = ecp;
    }

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public Date getArch() {
        return arch;
    }

    public void setArch(Date arch) {
        this.arch = arch;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Date getDattr() {
        return dattr;
    }

    public void setDattr(Date dattr) {
        this.dattr = dattr;
    }

}
