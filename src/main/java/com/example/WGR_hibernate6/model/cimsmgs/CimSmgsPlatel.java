package com.example.WGR_hibernate6.model.cimsmgs;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "cim_smgs_platel")
public class CimSmgsPlatel implements Serializable {
	@Id
	@org.hibernate.annotations.GenericGenerator(
			name = "ID_GENERATOR_CIMSMGS_PLATEL_LIST",
			type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
			parameters = {
					@Parameter(name = "sequence_name", value = "CIMSMGS_PLATEL_HID"),
					@Parameter(name = "initial_value", value = "1")
			}
	)
	private Long hid;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HID_CS")
	private CimSmgs cimSmgs;
	@Column(name = "DOR")
	@Length(max = 5)
	private String dor;
	@Column(name = "PLAT")
	@Length(max = 45)
	private String plat;
	@Column(name = "PRIM")
	@Length(max = 400)
	private String prim;
	@Column(name = "SORT",precision = 2)
	@NotNull
	@Max(99)
	private Byte sort;
	@Column(name = "KPLAT")
	@Length(max = 50)
	private String kplat;
	@Column(name = "KPLAT1")
	@Length(max = 50)
	private String kplat1;
	@Column(name = "KPLAT2")
	@Length(max = 50)
	private String kplat2;
	@Column(name = "KPLAT3")
	@Length(max = 50)
	private String kplat3;
	@Column(name = "DOR_R")
	@Length(max = 5)
	private String dorR;
	@Column(name = "PLAT_R")
	@Length(max = 145)
	private String platR;
	@Column(name = "PRIM_R")
	@Length(max = 400)
	private String primR;
	@Column(name = "STRANA")
	@Length(max = 2)
	private String strana;
	@Column(name = "FLAG",precision = 1)
	@Max(9)
	private byte flag;
	@Column(name = "PRIM_R1")
	@Length(max = 250)
    private String primR1;
	@Column(name = "COD_DIR")
	@Length(max = 2)
    private String codDir;
	@Column(name = "COD_PER")
	@Length(max = 4)
    private String codPer;
	@Column(name = "NAME_PER")
	@Length(max = 40)
    private String namePer;
	@Column(name = "N_DOG")
	@Length(max = 20)
    private String nDog;
	@Column(name = "DAT_DOG")
    private Date datDog;

	public CimSmgsPlatel() {
	}

	public CimSmgsPlatel(Long hid, Byte sort) {
		this.hid = hid;
		this.sort = sort;
	}

	public CimSmgsPlatel(Long hid, CimSmgs cimSmgs, String dor,
			String plat, String prim,
            Byte sort, String kplat, String kplat1, String kplat2,
			String kplat3, String dorR, String platR, String primR,
			String strana, byte flag, String nDog, Date datDog) {
		this.hid = hid;
		this.cimSmgs = cimSmgs;
		this.dor = dor;
		this.plat = plat;
		this.prim = prim;
		this.sort = sort;
		this.kplat = kplat;
		this.kplat1 = kplat1;
		this.kplat2 = kplat2;
		this.kplat3 = kplat3;
		this.dorR = dorR;
		this.platR = platR;
		this.primR = primR;
		this.strana = strana;
		this.flag = flag;
		this.nDog=nDog;
		this.datDog=datDog;
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

	public String getDor() {
		return this.dor;
	}

	public void setDor(String dor) {
		this.dor = dor;
	}

	public String getPlat() {
		return this.plat;
	}

	public void setPlat(String plat) {
		this.plat = plat;
	}

	public String getPrim() {
		return this.prim;
	}

	public void setPrim(String prim) {
		this.prim = prim;
	}

	public Byte getSort() {
		return this.sort;
	}

	public void setSort(Byte sort) {
		this.sort = sort;
	}

	public String getKplat() {
		return this.kplat;
	}

	public void setKplat(String kplat) {
		this.kplat = kplat;
	}

	public String getKplat1() {
		return this.kplat1;
	}

	public void setKplat1(String kplat1) {
		this.kplat1 = kplat1;
	}

	public String getKplat2() {
		return this.kplat2;
	}

	public void setKplat2(String kplat2) {
		this.kplat2 = kplat2;
	}

	public String getKplat3() {
		return this.kplat3;
	}

	public void setKplat3(String kplat3) {
		this.kplat3 = kplat3;
	}

	public String getDorR() {
		return this.dorR;
	}

	public void setDorR(String dorR) {
		this.dorR = dorR;
	}

	public String getPlatR() {
		return this.platR;
	}

	public void setPlatR(String platR) {
		this.platR = platR;
	}

	public String getPrimR() {
		return this.primR;
	}

	public void setPrimR(String primR) {
		this.primR = primR;
	}

	public String getStrana() {
		return this.strana;
	}

	public void setStrana(String strana) {
		this.strana = strana;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

    public String getPrimR1() {
        return primR1;
    }

    public void setPrimR1(String primR1) {
        this.primR1 = primR1;
    }

	public String getCodDir() {
		return codDir;
	}

	public String getCodPer() {
		return codPer;
	}

	public String getNamePer() {return namePer;}

	public void setCodDir(String codDir) {
		this.codDir = codDir;
	}

	public void setCodPer(String codPer) {
		this.codPer = codPer;
	}

	public void setNamePer(String namePer) {
		this.namePer = namePer;
	}

	public String getnDog() { return nDog; }

	public Date getDatDog() { return datDog; }

	public void setnDog(String nDog) { this.nDog = nDog; }

	public void setDatDog(Date datDog) { this.datDog = datDog; }

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CimSmgsPlatel that = (CimSmgsPlatel) o;
        return flag == that.flag &&
                Objects.equals(hid, that.hid) &&
                Objects.equals(cimSmgs != null ? cimSmgs.getHid() : "", that.cimSmgs != null ? that.cimSmgs : "") &&
                Objects.equals(dor, that.dor) &&
                Objects.equals(plat, that.plat) &&
                Objects.equals(prim, that.prim) &&
                Objects.equals(sort, that.sort) &&
                Objects.equals(kplat, that.kplat) &&
                Objects.equals(kplat1, that.kplat1) &&
                Objects.equals(kplat2, that.kplat2) &&
                Objects.equals(kplat3, that.kplat3) &&
                Objects.equals(dorR, that.dorR) &&
                Objects.equals(platR, that.platR) &&
                Objects.equals(primR, that.primR) &&
                Objects.equals(strana, that.strana) &&
				Objects.equals(codDir, that.codDir) &&
				Objects.equals(codPer, that.codPer) &&
				Objects.equals(namePer, that.namePer) &&
                Objects.equals(primR1, that.primR1)&&
				Objects.equals(datDog, that.datDog) &&
				Objects.equals(nDog, that.nDog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, cimSmgs != null ? cimSmgs.getHid() : "", dor, plat, prim, sort, kplat, kplat1, kplat2, kplat3, dorR, platR, primR, strana, flag, primR1,codDir,codPer,namePer,nDog,datDog);
    }

    public CimSmgsPlatel makeCopy()
	{
		CimSmgsPlatel copy= new CimSmgsPlatel();

		copy.setCodPer(this.getCodPer());
		copy.setDorR(this.getDorR());
		copy.setPlatR(this.getPlatR());
		copy.setPrimR(this.getPrimR());
		copy.setKplat(this.getKplat());
		copy.setKplat1(this.getKplat1());
		copy.setKplat3(this.getKplat3());
		copy.setPrim(this.getPrim());
		copy.setnDog(this.getnDog());
		copy.setDatDog(this.getDatDog());
		copy.setCodDir(this.getCodDir());
		copy.setNamePer(this.getNamePer());

		return copy;
	}
}
