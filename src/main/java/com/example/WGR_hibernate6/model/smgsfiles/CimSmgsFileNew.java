package com.example.WGR_hibernate6.model.smgsfiles;

import jakarta.persistence.*;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "cim_smgs_file_new")
public class CimSmgsFileNew implements Serializable, Comparable<CimSmgsFileNew> {
	@Id
	@org.hibernate.annotations.GenericGenerator(
			name = "ID_GENERATOR_CIMSMGS_FILE_NEW",
			type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
			parameters = {
					@Parameter(name = "sequence_name", value = "CIMSMGS_FILE_NEW_HID"),
					@Parameter(name = "initial_value", value = "1")
			}
	)
	private Long hid;
	private Date altered;
	private String un;
	private String trans;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HID_FILE")
	private CimSmgsFile cimSmgsFile = new CimSmgsFile();

	public CimSmgsFileNew() {
	}

	public CimSmgsFileNew(Date altered, String un, String trans) {
		this.altered = altered;
		this.un = un;
		this.trans = trans;
	}

	public String getTrans() {
		return trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

	public Long getHid() {
		return hid;
	}

	public void setHid(Long hid) {
		this.hid = hid;
	}

	public Date getAltered() {
		return altered;
	}

	public void setAltered(Date altered) {
		this.altered = altered;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public CimSmgsFile getCimSmgsFile() {
		return cimSmgsFile;
	}

	public void setCimSmgsFile(CimSmgsFile cimSmgsFile) {
		this.cimSmgsFile = cimSmgsFile;
	}

	@Override
	public int compareTo(CimSmgsFileNew that) {
		final int BEFORE = -1;
		final int AFTER = 1;

		if (that == null) {
			return BEFORE;
		}

		Long thisHid = this.getHid();
		Long thatHid = that.getHid();

		if (thisHid == null) {
			return AFTER;
		} else if (thatHid == null) {
			return BEFORE;
		} else {
			return thisHid.compareTo(thatHid);
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CimSmgsFileNew that = (CimSmgsFileNew) o;
		return Objects.equals(hid, that.hid) &&
				Objects.equals(un, that.un) &&
				Objects.equals(trans, that.trans);
	}

	@Override
	public int hashCode() {
		return Objects.hash(hid, un, trans);
	}
}
