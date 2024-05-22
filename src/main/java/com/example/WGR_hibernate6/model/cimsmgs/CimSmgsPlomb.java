package com.example.WGR_hibernate6.model.cimsmgs;

import jakarta.persistence.*;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "cim_smgs_plomb")
public class CimSmgsPlomb implements Serializable {
	@Id
	@org.hibernate.annotations.GenericGenerator(
			name = "ID_GENERATOR_CIMSMGS_PLOMB_LIST",
			type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
			parameters = {
					@Parameter(name = "sequence_name", value = "CIMSMGS_PLOMB_HID"),
					@Parameter(name = "initial_value", value = "1")
			}
	)
	private Long hid;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HID_CS")
	private CimSmgs cimSmgs;
	private Short kpl;
	private String znak;
	private Short sort;
    private String type;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HID_KON")
    private CimSmgsKonList cimSmgsKonList;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HID_CAR")
    private CimSmgsCarList cimSmgsCarList;

    public CimSmgsCarList getCimSmgsCarList() {
        return cimSmgsCarList;
    }

    public void setCimSmgsCarList(CimSmgsCarList cimSmgsCarList) {
        this.cimSmgsCarList = cimSmgsCarList;
    }

    public CimSmgsKonList getCimSmgsKonList() {
        return cimSmgsKonList;
    }

    public void setCimSmgsKonList(CimSmgsKonList cimSmgsKonList) {
        this.cimSmgsKonList = cimSmgsKonList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CimSmgsPlomb() {
	}

	public CimSmgsPlomb(Long hid, Short sort) {
		this.hid = hid;
		this.sort = sort;
	}

	public CimSmgsPlomb(Long hid, CimSmgs cimSmgs, Short kpl, String znak, /*Date dattr, Date locked, String unLock,*/ CimSmgsCarList hidCar,
                        CimSmgsKonList hidKon, Short sort) {
		this.hid = hid;
		this.cimSmgs = cimSmgs;
		this.kpl = kpl;
		this.znak = znak;
        this.cimSmgsCarList = hidCar;
        this.cimSmgsKonList = hidKon;
		this.sort = sort;
	}

	public Long getHid() {
		return this.hid;
	}

	public void setHid(Long hid) {
		this.hid = hid;
	}
	public CimSmgs getCimSmgs() {
		return this.cimSmgs;
	}
	public void setCimSmgs(CimSmgs cimSmgs) {
		this.cimSmgs = cimSmgs;
	}

	public Short getKpl() {
		return this.kpl;
	}

	public void setKpl(Short kpl) {
		this.kpl = kpl;
	}

	public String getZnak() {
		return this.znak;
	}

	public void setZnak(String znak) {
		this.znak = znak;
	}

	public Short getSort() {
		return this.sort;
	}

	public void setSort(Short sort) {
		this.sort = sort;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CimSmgsPlomb that = (CimSmgsPlomb) o;
        return Objects.equals(hid, that.hid) &&
                Objects.equals(cimSmgs != null ? cimSmgs.getHid() : "", that.cimSmgs != null ? that.cimSmgs.getHid() : "") &&
                Objects.equals(kpl, that.kpl) &&
                Objects.equals(znak, that.znak) &&
                Objects.equals(sort, that.sort) &&
                Objects.equals(type, that.type) &&
                Objects.equals(cimSmgsKonList != null ? cimSmgsKonList.getHid() : "", that.cimSmgsKonList != null ? that.cimSmgsKonList.getHid() : "") &&
                Objects.equals(cimSmgsCarList != null ? cimSmgsCarList.getHid() : "", that.cimSmgsCarList != null ? that.cimSmgsCarList.getHid() : "");
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, cimSmgs != null ? cimSmgs.getHid() : "", kpl, znak, sort, type, cimSmgsKonList != null ? cimSmgsKonList.getHid() : "", cimSmgsCarList != null ? cimSmgsCarList.getHid() : "");
    }

    public String plomb4CsPrint() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKpl() != null ? getKpl() + "x " : "");
        sb.append(StringUtils.defaultString(getZnak()));
        return sb.toString();
    }
    public CimSmgsPlomb makeCopy()
	{
		CimSmgsPlomb plombCopy= new CimSmgsPlomb();
		plombCopy.setKpl(getKpl());
		plombCopy.setZnak(getZnak());
		return plombCopy;
	}

}
