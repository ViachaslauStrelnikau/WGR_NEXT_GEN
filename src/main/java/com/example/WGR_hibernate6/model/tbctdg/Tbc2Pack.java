package com.example.WGR_hibernate6.model.tbctdg;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbc2_pack")

public class Tbc2Pack {
    @Id
    @org.hibernate.annotations.GenericGenerator(
            name = "ID_GENERATOR_TBC2_PACK",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "TBC2_PACK_HID"),
                    @Parameter(name = "initial_value", value = "1")
            }
    )
    private Long hid;
    private String packId;
    @CreationTimestamp
    private Date dattr;
    @UpdateTimestamp
    private Date chdate;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_PACK")
    private Set<Tbc2Status> tbc2Status = new HashSet<>();

    public Date getChdate() {
        return chdate;
    }

    public void setChdate(Date chdate) {
        this.chdate = chdate;
    }

    public Set<Tbc2Status> getTbc2Status() {
        return tbc2Status;
    }

    public void setTbc2Status(Set<Tbc2Status> tbc2Status) {
        this.tbc2Status = tbc2Status;
    }

    public Tbc2Pack() {
    }

    public Tbc2Pack(String packId, Date dattr) {
        this.packId = packId;
//        this.dattr = dattr;
    }

    public Long getHid() {
        return hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public String getPackId() {
        return packId;
    }

    public void setPackId(String packId) {
        this.packId = packId;
    }

    public Date getDattr() {
        return dattr;
    }

    public void setDattr(Date dattr) {
        this.dattr = dattr;
    }
}
