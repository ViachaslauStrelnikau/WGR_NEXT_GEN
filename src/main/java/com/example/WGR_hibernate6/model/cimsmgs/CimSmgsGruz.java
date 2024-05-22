package com.example.WGR_hibernate6.model.cimsmgs;

import com.example.WGR_hibernate6.commons.money2str;
import jakarta.persistence.*;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.Parameter;

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
	private String upak;
    private String kypk;
	private String len;
	private String kgvn;
	private String nzgr;
	private String nzgrEu;
	private String ekgvn;
	private String enzgr;
	private BigDecimal massa;
	private Integer places;
    private String placest;
	private Date dattr;
	private Date locked;
	private String unLock;
	private Byte lang;
	private Byte seq;
	private Integer sort;
    private String nzgrRid;
    private String nzgrRidEu;
    private Boolean ohr;
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
			String enzgr, BigDecimal massa, Integer places, Date dattr, Date locked, String unLock, Byte lang, Byte seq, Integer sort) {
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
		this.dattr = dattr;
		this.locked = locked;
		this.unLock = unLock;
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

	public Date getDattr() {
		return this.dattr;
	}

	public void setDattr(Date dattr) {
		this.dattr = dattr;
	}

	public Date getLocked() {
		return this.locked;
	}

	public void setLocked(Date locked) {
		this.locked = locked;
	}

	public String getUnLock() {
		return this.unLock;
	}

	public void setUnLock(String unLock) {
		this.unLock = unLock;
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
