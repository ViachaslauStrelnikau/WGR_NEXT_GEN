package com.example.WGR_hibernate6.model.cimsmgs;

import com.example.WGR_hibernate6.commons.money2str;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;


@Entity
@Table(name = "cim_smgs_gruz")
public class CimSmgsGruz implements Serializable {
    @Id
    @org.hibernate.annotations.GenericGenerator(
            name = "ID_GENERATOR_CIMSMGS_GRUZ_LIST",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "CIMSMGS_GRUZ_HID"),
                    @Parameter(name = "initial_value", value = "1")
            }
    )
	private Long hid;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_CAR")
	private CimSmgsCarList cimSmgsCarList;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_KON")
	private CimSmgsKonList cimSmgsKonList;
	@Column(name = "UPAK")
	@Length(max = 50)
	private String upak;
	@Column(name = "KYPK")
	@Length(max = 2)
    private String kypk;
	@Column(name = "LEN")
	@Length(max = 32)
	private String len;
	@Column(name = "KGVN")
	@Length(max = 10)
	private String kgvn;
	@Column(name = "NZGR")
	@Length(max = 4000)
	private String nzgr;
	@Column(name = "NZGR_EU")
	@Length(max = 4000)
	private String nzgrEu;
	@Column(name = "KGVN1")
	@Length(max = 10)
	private String ekgvn;
	@Column(name = "NZGR1")
	@Length(max = 4000)
	private String enzgr;
	@Column(name = "MASSA",precision = 13,scale = 3)
	@Digits(integer = 10,fraction = 3)
	private BigDecimal massa;
	@Column(name = "PLACES",precision = 8)
	@Digits(integer = 8,fraction = 0)
	private Integer places;
	@Column(name = "PLACEST")
	@Length(max = 20)
    private String placest;
	@Column(name = "LANG",precision = 1)
	@Max(9)
	private Byte lang;
	@Column(name = "SEQ",precision = 1)
	@Max(9)
	private Byte seq;
	@Column(name = "SORT",precision = 2)
	@Max(99)
	private Integer sort;
	@Column(name = "NZGR_RID")
	@Length(max = 4000)
    private String nzgrRid;
	@Column(name = "NZGR_RID_EU")
	@Length(max = 4000)
    private String nzgrRidEu;
	@Column(name = "OHR")
    private Boolean ohr;
	@Column(name = "UPAK_EU")
	@Length(max = 50)
    private String upakForeign;

    @OneToMany(mappedBy = "cimSmgsGruz")
    @MapKeyColumn(name = "HID" )
    private Map<Byte,CimSmgsDanGruz> cimSmgsDanGruzs = new TreeMap<>();

    public Map<Byte,CimSmgsDanGruz> getCimSmgsDanGruzs() {
        return cimSmgsDanGruzs;
    }

    public void setCimSmgsDanGruzs(Map<Byte,CimSmgsDanGruz> cimSmgsDanGruzs) {
        this.cimSmgsDanGruzs = cimSmgsDanGruzs;
    }

    public String getUpakForeign() {
        return upakForeign;
    }

    public void setUpakForeign(String upakForeign) {
        this.upakForeign = upakForeign;
    }

    public Boolean isOhr() {
        return ohr;
    }

    public void setOhr(Boolean ohr) {
        this.ohr = ohr;
    }

    public String getNzgrRidEu() {
        return nzgrRidEu;
    }

    public void setNzgrRidEu(String nzgrRidEu) {
        this.nzgrRidEu = nzgrRidEu;
    }

    public String getNzgrRid() {
        return nzgrRid;
    }

    public void setNzgrRid(String nzgrRid) {
        this.nzgrRid = nzgrRid;
    }

    public CimSmgsGruz() {
	}

	public CimSmgsGruz(Long hid, Byte seq) {
		this.hid = hid;
		this.seq = seq;
	}

	public CimSmgsGruz(Long hid, CimSmgsCarList cimSmgsCarList,
	CimSmgsKonList cimSmgsKonList, String upak, String len, String kgvn, String nzgr, String nzgrEu, String ekgvn,
			String enzgr, BigDecimal massa, Integer places, Byte lang, Byte seq, Integer sort) {
		this.hid = hid;
		this.cimSmgsCarList = cimSmgsCarList;
		this.cimSmgsKonList = cimSmgsKonList;
		this.upak = upak;
		this.len = len;
		this.kgvn = kgvn;
		this.nzgr = nzgr;
		this.nzgrEu = nzgrEu;
		this.ekgvn = ekgvn;
		this.enzgr = enzgr;
		this.places = places;
		this.massa = massa;
		this.lang = lang;
		this.seq = seq;
		this.sort = sort;
	}

	public CimSmgsCarList getCimSmgsCarList() {
		return this.cimSmgsCarList;
	}

	public void setCimSmgsCarList(CimSmgsCarList cimSmgsCarList) {
		this.cimSmgsCarList = cimSmgsCarList;
	}

	public CimSmgsKonList getCimSmgsKonList() {
		return this.cimSmgsKonList;
	}

	public void setCimSmgsKonList(CimSmgsKonList cimSmgsKonList) {
		this.cimSmgsKonList = cimSmgsKonList;
	}

	public String getUpak() {
		return this.upak;
	}

	public void setUpak(String upak) {
		this.upak = upak;
	}

	public String getLen() {
		return this.len;
	}

	public void setLen(String len) {
		this.len = len;
	}

	public String getKgvn() {
		return this.kgvn;
	}

	public void setKgvn(String kgvn) {
		this.kgvn = kgvn;
	}

	public String getNzgr() {
		return this.nzgr;
	}

	public void setNzgr(String nzgr) {
		this.nzgr = nzgr;
	}

	public Integer getPlaces() {
		return this.places;
	}

	public void setPlaces(Integer places) {
		this.places = places;
	}

	public Byte getLang() {
		return this.lang;
	}

	public Long getHid() {
		return hid;
	}

	public Byte getSeq() {
		return seq;
	}

	public Integer getSort() {
		return sort;
	}

	public String getEkgvn() {
		return ekgvn;
	}

	public BigDecimal getMassa() {
		return massa;
	}

	public String getEnzgr() {
		return enzgr;
	}

	public String getNzgrEu() {
		return nzgrEu;
	}

	public void setLang(Byte lang) {
		this.lang = lang;
	}

	public void setHid(Long hid) {
		this.hid = hid;
	}

	public void setSeq(Byte seq) {
		this.seq = seq;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public void setEnzgr(String enzgr) {
		this.enzgr = enzgr;
	}

	public void setMassa(BigDecimal massa) {
		this.massa = massa;
	}

	public void setEkgvn(String ekgvn) {
		this.ekgvn = ekgvn;
	}

	public void setNzgrEu(String nzgrEu) {
		this.nzgrEu = nzgrEu;
	}

	public String placesDisp4Print() {
		return (places != null) ? (new money2str(places.doubleValue(), "NONE").getMoney2str().toString().trim()) : "";
	}

    public String getPlacest() {
        return placest;
    }

    public void setPlacest(String placest) {
        this.placest = placest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CimSmgsGruz that = (CimSmgsGruz) o;
        return Objects.equals(hid, that.hid) &&
                Objects.equals(cimSmgsCarList != null ? cimSmgsCarList.getHid() : "", that.cimSmgsCarList != null ? that.cimSmgsCarList.getHid() : "") &&
                Objects.equals(cimSmgsKonList != null ? cimSmgsKonList.getHid() : "", that.cimSmgsKonList != null ? that.cimSmgsKonList.getHid() : "") &&
                Objects.equals(upak, that.upak) &&
                Objects.equals(len, that.len) &&
                Objects.equals(kgvn, that.kgvn) &&
                Objects.equals(nzgr, that.nzgr) &&
                Objects.equals(nzgrEu, that.nzgrEu) &&
                Objects.equals(ekgvn, that.ekgvn) &&
                Objects.equals(enzgr, that.enzgr) &&
                Objects.equals(massa, that.massa) &&
                Objects.equals(places, that.places) &&
                Objects.equals(placest, that.placest) &&
                Objects.equals(lang, that.lang) &&
                Objects.equals(seq, that.seq) &&
                Objects.equals(sort, that.sort) &&
                Objects.equals(nzgrRid, that.nzgrRid) &&
                Objects.equals(nzgrRidEu, that.nzgrRidEu) &&
                Objects.equals(ohr, that.ohr) &&
                Objects.equals(upakForeign, that.upakForeign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, cimSmgsCarList != null ? cimSmgsCarList.getHid() : "", cimSmgsKonList != null ? cimSmgsKonList.getHid() : "", upak, len, kgvn, nzgr, nzgrEu, ekgvn, enzgr, massa, places, lang, seq, sort, nzgrRid, nzgrRidEu, ohr, upakForeign);
    }

	public String gruz4CimSmgs() {
		StringBuffer result = new StringBuffer("");
		if (nzgr != null && nzgr.length() > 0) {
			result.append(nzgr);
			result.append("&nbsp;&nbsp;&nbsp;&nbsp;");
		}
		if (nzgrEu != null && nzgrEu.length() > 0) {
			result.append(nzgrEu);
		}
		if (kgvn != null && kgvn.length() > 0) {
			result.append("<br/>ГНГ-");
			result.append(kgvn);
		}
		if (ekgvn != null && ekgvn.length() > 0) {
			result.append("<br/>ЕТ СНГ-");
			result.append(ekgvn);
		}
		return result.toString();
	}

    public String gruz4CimSmgs1() {
        StringBuffer result = new StringBuffer("");
        if (nzgr != null && nzgr.length() > 0) {
            result.append(nzgr);
            result.append("    ");
        }
        if (nzgrEu != null && nzgrEu.length() > 0) {
            result.append(nzgrEu);
        }
        if (kgvn != null && kgvn.length() > 0) {
            result.append("\nГНГ-");
            result.append(kgvn);
        }
        if (ekgvn != null && ekgvn.length() > 0) {
            result.append("\nЕТ СНГ-");
            result.append(ekgvn);
        }
        return result.toString();
    }
	
	public String mesta4CimSmgs() {
		StringBuffer result = new StringBuffer("");
		if (places != null) {
			result.append(places);
			result.append("&nbsp;");
			result.append("(");
			result.append(placesDisp4Print());
			result.append(")");
		}
		if (massa != null) {
			result.append("&nbsp;");
			result.append(massa);
			result.append("кг");
		}
		return result.toString();
	}

    public String mesta4CimSmgs1() {
        StringBuffer result = new StringBuffer("");
        if (places != null) {
          result.append("1 (");
          result.append(places);
          result.append(")\n");
          result.append(placesDisp4Print());
        }
        return result.toString();
    }

    public String upak4CimSmgs1() {
        StringBuilder result = new StringBuilder("");
        result.append(StringUtils.defaultString(upak));
        if(StringUtils.isNotBlank(upak) && StringUtils.isNotBlank(upakForeign)){
            result.append("/");
        }
        result.append(StringUtils.defaultString(upakForeign));
        return result.toString();
    }
    
    public String kgvn4GuDisp() {
        StringBuffer sb = new StringBuffer("");
        if(kgvn != null && kgvn.length() > 0){
            String prefix = "";
            for (int i = 0;i < kgvn.length(); i++){
                sb.append(prefix);
                prefix = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                sb.append(kgvn.charAt(i));
            }
        }
        return sb.toString();
    }


    public String kgvn4GuDisp1() {
        StringBuffer sb = new StringBuffer("");
        if(kgvn != null && kgvn.length() > 0){
            String prefix = "";
            for (int i = 0;i < kgvn.length(); i++){
                sb.append(prefix);
                prefix = "        ";
                sb.append(kgvn.charAt(i));
            }
        }
        return sb.toString();
    }

    public String g11CmrDisp() {
        String result = "";
        if(massa != null){
            result = massa.toString() + " kg";
        }

        return result;
    }

    public void addCimSmgsDanGruzs() {
        for (CimSmgsDanGruz danGruz : cimSmgsDanGruzs.values()) {
            danGruz.setCimSmgsGruz(this);
        }
    }
    public void copy2another(CimSmgsGruz another)
    {
        another.setKgvn(this.getKgvn());
        another.setNzgr(this.getNzgr());
        another.setNzgrEu(this.getNzgrEu());
        another.setEkgvn(this.getEkgvn());
        another.setEnzgr(this.getEnzgr());
        another.setMassa(this.getMassa());
        another.setKypk(this.getKypk());
        another.setUpak(this.getUpak());
        another.setUpakForeign(this.upakForeign);
        another.setPlaces(this.getPlaces());
        another.setPlacest(this.getPlacest());
    }


    public String getKypk() {
        return kypk;
    }

    public void setKypk(String kypk) {
        this.kypk = kypk;
    }
}
