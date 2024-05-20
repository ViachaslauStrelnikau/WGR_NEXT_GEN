package com.example.WGR_hibernate6.model.smgsfiles;

import jakarta.persistence.*;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Date;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


@Entity
@Table(name = "cim_smgs_file")
public class CimSmgsFile implements Serializable {

	@Id
	@org.hibernate.annotations.GenericGenerator(
			name = "ID_GENERATOR_CIMSMGS_FILE",
			type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
			parameters = {
					@Parameter(name = "sequence_name", value = "CIMSMGS_FILE_HID"),
					@Parameter(name = "initial_value", value = "1")
			}
	)
	private Long hid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HID_INF")
	private CimSmgsFileInf cimSmgsFileInf;
	@Lob
	private Blob files;
	@Lob
	private Blob filesRem;
	private String fileName;
	private String contentType;
	private BigDecimal length;
    private boolean deleted = false;
	private String newg;
	private String className;
	private Integer flags;
	private Integer userFlag;
	private String descr;
	private Date dat;
	private String un;


	@OneToMany(mappedBy = "cimSmgsFile", fetch = FetchType.LAZY)
	private Set<CimSmgsFileNew> cimSmgsFileNew = new TreeSet<>();

	public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public CimSmgsFile() {
	}

	public CimSmgsFile(Long hid, CimSmgsFileInf cimSmgsFileInf) {
		this.hid = hid;
		this.cimSmgsFileInf = cimSmgsFileInf;
	}

	public CimSmgsFile(Long hid, CimSmgsFileInf cimSmgsFileInf, Blob files,
			String fileName, String contentType, BigDecimal length) {
		this.hid = hid;
		this.cimSmgsFileInf = cimSmgsFileInf;
		this.files = files;
		this.fileName = fileName;
		this.contentType = contentType;
		this.length = length;
	}

	public Integer getUserFlag() {
		return userFlag;
	}

	public void setUserFlag(Integer userFlag) {
		this.userFlag = userFlag;
	}

	public Set<CimSmgsFileNew> getCimSmgsFileNew() {
		return cimSmgsFileNew;
	}

	public void setCimSmgsFileNew(Set<CimSmgsFileNew> cimSmgsFileNew) {
		this.cimSmgsFileNew = cimSmgsFileNew;
	}

	public Long getHid() {
		return this.hid;
	}

	public void setHid(Long hid) {
		this.hid = hid;
	}

	public CimSmgsFileInf getCimSmgsFileInf() {
		return this.cimSmgsFileInf;
	}

	public void setCimSmgsFileInf(CimSmgsFileInf cimSmgsFileInf) {
		this.cimSmgsFileInf = cimSmgsFileInf;
	}

	public Blob getFiles() {
		return this.files;
	}

	public void setFiles(Blob files) {
		this.files = files;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Date getDat() {
		return dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public BigDecimal getLength() {
		return this.length;
	}

	public void setLength(BigDecimal length_) {
        length = length_;
	}

	public String getNewg() {
		return newg;
	}

	public void setNewg(String newg) {
		this.newg = newg;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getFlags() {
		return flags;
	}

	public void setFlags(Integer flags) {
		this.flags = flags;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CimSmgsFile that = (CimSmgsFile) o;
        return Objects.equals(hid, that.hid) &&
                Objects.equals(cimSmgsFileInf != null ? cimSmgsFileInf.getHid() : "", that.cimSmgsFileInf != null ? that.cimSmgsFileInf.getHid() : "") &&
                Objects.equals(fileName, that.fileName) &&
                Objects.equals(contentType, that.contentType) &&
                Objects.equals(length, that.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, cimSmgsFileInf != null ? cimSmgsFileInf.getHid() : "", fileName, contentType, length);
    }
}
