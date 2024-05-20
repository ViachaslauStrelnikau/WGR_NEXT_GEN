package com.example.WGR_hibernate6.model.smgsfiles;


import com.example.WGR_hibernate6.model.PackDoc;
import com.example.WGR_hibernate6.model.Route;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "cim_smgs_file_inf")
@JsonIgnoreProperties({"packDoc","route","cimSmgsFiles"})
public class CimSmgsFileInf implements Serializable {
	@Id
	@org.hibernate.annotations.GenericGenerator(
			name = "ID_GENERATOR_CIMSMGS_FILE_INF",
			type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
			parameters = {
					@Parameter(name = "sequence_name", value = "CIMSMGS_FILE_INF_HID"),
					@Parameter(name = "initial_value", value = "1")
			}
	)
	private Long hid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HID_ROUTE")
	private Route route;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HID_PACK")
	private PackDoc packDoc;
	private String type;
	private String nkon;
	private Date dattr;
	private String un;
	@OneToMany(mappedBy = "cimSmgsFileInf",fetch = FetchType.LAZY)
	private Set<CimSmgsFile> cimSmgsFiles = new HashSet<CimSmgsFile>(0);
    private String trans;

	public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public CimSmgsFileInf() {
	}

	public CimSmgsFileInf(Long hid, Date dattr, String un) {
		this.hid = hid;
		this.dattr = dattr;
		this.un = un;
	}

	public CimSmgsFileInf(Long hid, Route route, PackDoc packDoc, String type,
			String nkon, Date dattr, String un, Set cimSmgsFiles) {
		this.hid = hid;
		this.route = route;
		this.packDoc = packDoc;
		this.type = type;
		this.nkon = nkon;
		this.dattr = dattr;
		this.un = un;
		this.cimSmgsFiles = cimSmgsFiles;
	}

	public Long getHid() {
		return this.hid;
	}

	public void setHid(Long hid) {
		this.hid = hid;
	}

	public Route getRoute() {
		return this.route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public PackDoc getPackDoc() {
		return this.packDoc;
	}

	public void setPackDoc(PackDoc packDoc) {
		this.packDoc = packDoc;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNkon() {
		return this.nkon;
	}

	public void setNkon(String nkon) {
		this.nkon = nkon;
	}

	public Date getDattr() {
		return this.dattr;
	}

	public void setDattr(Date dattr) {
		this.dattr = dattr;
	}

	public String getUn() {
		return this.un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public Set<CimSmgsFile> getCimSmgsFiles() {
		return this.cimSmgsFiles;
	}

	public void setCimSmgsFiles(Set<CimSmgsFile> cimSmgsFiles) {
		this.cimSmgsFiles = cimSmgsFiles;
	}

    public boolean hasPack(){
        return this.getPackDoc() != null && this.getPackDoc().getHid() != null;
    }

	public void addFileItem(CimSmgsFile f) {
		if (f != null) {
			f.setCimSmgsFileInf(this);
			cimSmgsFiles.add(f);
		}
	}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CimSmgsFileInf that = (CimSmgsFileInf) o;
        return Objects.equals(hid, that.hid) &&
                Objects.equals(route != null ? route.getHid() : "", that.route != null ? that.route.getHid() : "") &&
                Objects.equals(packDoc!= null ? packDoc.getHid() : "", that.packDoc != null ? that.packDoc.getHid() : "") &&
                Objects.equals(type, that.type) &&
                Objects.equals(nkon, that.nkon) &&
                Objects.equals(un, that.un) &&
                Objects.equals(trans, that.trans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, route != null ? route.getHid() : "", packDoc!= null ? packDoc.getHid() : "", type, nkon, un, trans);
    }
}
