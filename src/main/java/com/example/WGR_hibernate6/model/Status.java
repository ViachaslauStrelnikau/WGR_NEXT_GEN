package com.example.WGR_hibernate6.model;

// Generated 16.04.2012 15:44:53 by Hibernate Tools 3.4.0.CR1

import com.example.WGR_hibernate6.model.user.Usr;
import jakarta.persistence.*;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "status")
public class Status implements Serializable {

	@Id
	@org.hibernate.annotations.GenericGenerator(
			name = "ID_GENERATOR_STATUS",
			type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
			parameters = {
					@Parameter(name = "sequence_name", value = "STATUS_HID"),
					@Parameter(name = "initial_value", value = "1")
			}
	)
	private Long hid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HID_STAT")
	private StatusDir statusDir;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HID_PACK")
	private PackDoc packDoc;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UN")
	private Usr usr;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TYPE")
    private DocDir docDir;
	private Date datBegin;
	private Date datEnd;
	@Column(name = "HID_CS",insertable=false, updatable=false)
    private Long hidCs;
    private String dopInfo;

	public Long getHidCs() {
        return hidCs;
    }

    public void setHidCs(Long hidCs) {
        this.hidCs = hidCs;
    }

    public Status() {
	}

	public Status(Long hid) {
		this.hid = hid;
	}

	public String getDopInfo() {
		return dopInfo;
	}

	public void setDopInfo(String dopInfo) {
		this.dopInfo = dopInfo;
	}

	public Status(Long hid, StatusDir statusDir, PackDoc packDoc, Usr usr, DocDir docDir, Date datBegin, Long hidCs) {
		this.hid = hid;
		this.statusDir = statusDir;
		this.packDoc = packDoc;
		this.usr = usr;
        this.docDir = docDir;
        this.datBegin = datBegin;
        this.hidCs = hidCs;
	}
	public Status(Long hid, StatusDir statusDir, PackDoc packDoc, Usr usr, DocDir docDir, Date datBegin, Long hidCs, String dopInfo) {
		this.hid = hid;
		this.statusDir = statusDir;
		this.packDoc = packDoc;
		this.usr = usr;
		this.docDir = docDir;
		this.datBegin = datBegin;
		this.hidCs = hidCs;
		this.dopInfo = dopInfo;
	}

	public Long getHid() {
		return this.hid;
	}

	public void setHid(Long hid) {
		this.hid = hid;
	}

	public StatusDir getStatusDir() {
		return this.statusDir;
	}

	public void setStatusDir(StatusDir statusDir) {
		this.statusDir = statusDir;
	}

	public PackDoc getPackDoc() {
		return this.packDoc;
	}

	public void setPackDoc(PackDoc packDoc) {
		this.packDoc = packDoc;
	}

	public Usr getUsr() {
		return this.usr;
	}

	public void setUsr(Usr usr) {
		this.usr = usr;
	}

	public Date getDatBegin() {
		return this.datBegin;
	}

	public void setDatBegin(Date datBegin) {
		this.datBegin = datBegin;
	}

	public Date getDatEnd() {
		return this.datEnd;
	}

	public void setDatEnd(Date datEnd) {
		this.datEnd = datEnd;
	}

    /*public CimSmgs getCimSmgs() {
        return cimSmgs;
    }

    public void setCimSmgs(CimSmgs cimSmgs) {
        this.cimSmgs = cimSmgs;
    }*/

    public DocDir getDocDir() {
        return docDir;
    }

    public void setDocDir(DocDir docDir) {
        this.docDir = docDir;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(hid, status.hid) &&
                Objects.equals(statusDir != null ? statusDir.getHid() : "", status.statusDir != null ? status.statusDir.getHid() : "") &&
                Objects.equals(packDoc != null ? packDoc.getHid() : "", status.packDoc != null ? status.packDoc.getHid() : "") &&
                Objects.equals(usr != null ? usr.getUn() : "", status.usr != null ? status.usr.getUn() : "") &&
                Objects.equals(docDir != null ? docDir.getHid() : "", status.docDir != null ? status.docDir.getHid() : "") &&
                Objects.equals(datBegin, status.datBegin) &&
                Objects.equals(datEnd, status.datEnd) &&
                Objects.equals(hidCs, status.hidCs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, statusDir != null ? statusDir.getHid() : "", packDoc != null ? packDoc.getHid() : "", usr != null ? usr.getUn() : "", docDir != null ? docDir.getHid() : "", datBegin, datEnd, hidCs);
    }
}
