package com.example.WGR_hibernate6.model.cimsmgs;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

@Entity
@Table(name = "cim_smgs_kon_list")
public class CimSmgsKonList implements Serializable {
    @Id
    @org.hibernate.annotations.GenericGenerator(
            name = "ID_GENERATOR_CIMSMGS_KON_LIST",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "CIMSMGS_KON_HID"),
                    @Parameter(name = "initial_value", value = "1")
            }
    )
    private Long hid;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hid_car")
    private CimSmgsCarList cimSmgsCarList;
    @Column(name = "TRANS")
    @Length(max = 20)
    private String trans;
    @Column(name = "UN")
    @Length(max = 20)
    private String un;
    @Column(name = "ARCH")
    private Date arch;
    @Column(name = "NUM",precision = 3,scale = 0)
    @Max(999)
    private Short num;
    @Column(name = "NVAG")
    @Length(max = 16)
    private String nvag;
    @Column(name = "NHM_NAMES")
    @Length(max = 512)
    private String nhmNames;
    @Column(name = "NHM_CODES")
    @Length(max = 128)
    private String nhmCodes;
    @Column(name = "RID",precision = 1)
    @Max(9)
    private Byte rid;
    @Column(name = "PLOMBS")
    @Length(max = 250)
    private String plombs;
    @Column(name = "MASS_SEND")
    private BigDecimal massSend;
    @Column(name = "MASS_CALC")
    private BigDecimal massCalc;
    @Column(name = "PRICE")
    private BigDecimal price;
    @Column(name = "PRICE_ADD")
    private BigDecimal priceAdd;
    @Column(name = "PRICE_ALL")
    private BigDecimal priceAll;
    @Column(name = "UTI_N")
    @Length(max = 16)
    private String utiN;
    @Column(name = "UTI_TYPE")
    @Length(max = 16)
    private String utiType;
    @Column(name = "DOC_SEND")
    @Length(max = 128)
    private String docSend;
    @Column(name = "NOTES")
    @Length(max = 80)
    private String notes;
    @Column(name = "G_14_1")
    @Length(max = 160)
    private String g141;
    @Column(name = "G_14_2")
    @Length(max = 160)
    private String g142;
    @Column(name = "G_14_2R")
    @Length(max = 160)
    private String g142r;
    @Column(name = "G_14_6")
    @Length(max = 250)
    private String g146;
    @Column(name = "G_14_9")
    @Length(max = 160)
    private String g149;
    @Column(name = "G_14_9R")
    @Length(max = 160)
    private String g149r;
    @Column(name = "G_14_10")
    @Length(max = 64)
    private String g1410;
    //	Порядковы номер в ведомости
    @Column(name = "VED_POR_NOM",precision = 2)
    @Max(99)
    private Byte vedPorNom;
    @Column(name = "SORT",precision = 2)
    @Max(99)
    private Byte sort;
    @Column(name = "SIZE_MM")
    private BigDecimal sizeMm;
    @Column(name = "SIZE_FOOT")
    private BigDecimal sizeFoot;
    @Column(name = "KOD_SOB",precision = 2)
    @Max(99)
    private Byte kodSob;
    @Column(name = "OTM_KSOB",precision = 2)
    @Max(99)
    private Byte otmKSob;
    @Column(name = "TARA_KONT", length = 5)
    private Short taraKont;
    @Column(name = "VID")
    @Length(max = 80)
    private String vid;
    @Column(name = "KAT")
    @Length(max = 40)
    private String kat;
    @Column(name = "OWNER_KOD")
    @Length(max = 10)
    private String ownerKod;
    @Column(name = "SPEC_KON")
    @Length(max = 50)
    private String specKon;
    @Column(name = "POGR_KON",precision = 1)
    @Max(9)
    private Byte pogrKon;
    @Column(name = "VVOZ")
    private Date vvoz;
    @Column(name = "POGRUZKA")
    private Date pogruzka;
    @Column(name = "ZAJAV_NO")
    @Length(max = 50)
    private String zajavNo;
    @Column(name = "COUNT", length = 10)
    private BigDecimal count;
    @Column(name = "PRIVATE", precision = 1)
    @Max(9)
    private Byte privat;
    @Column(name = "G_25")
    @Length(max = 50)
    private String g25;
    @Column(name = "NETTO",precision = 12, scale = 2)
    @Digits(integer = 10, fraction = 2)
    private BigDecimal netto;
    @Column(name = "netto_Suf")
    @Length(max = 20)
    private String nettoSuf;
    @Column(name = "netto_pref")
    @Length(max = 20)
    private String nettoPref;
    @Column(name = "TARA",precision = 12, scale = 2)
    @Digits(integer = 10, fraction = 2)
    private BigDecimal tara;
    @Column(name = "tara_Pref")
    @Length(max = 20)
    private String taraPref;
    @Column(name = "tara_Suf")
    @Length(max = 20)
    private String taraSuf;
    @Column(name = "brutto",precision = 12, scale = 2)
    @Digits(integer = 10, fraction = 2)
    private BigDecimal brutto;
    @Column(name = "brutto_Pref")
    @Length(max = 20)
    private String bruttoPref;
    @Column(name = "brutto_Suf")
    @Length(max = 20)
    private String bruttoSuf;
    @Column(name = "prim")
    @Length(max = 512)
    private String prim;
    @Column(name = "GRPOD",precision = 8, scale = 3)
    @Digits(integer = 5, fraction = 3)
    private BigDecimal grpod;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cimSmgsKonList")
    @MapKeyColumn(name = "SORT")
    private Map<Integer, CimSmgsGruz> cimSmgsGruzs = new TreeMap<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cimSmgsKonList")
    @MapKeyColumn(name = "SORT")
    private Map<Integer, CimSmgsDocs> cimSmgsDocses9 = new TreeMap<>();
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cimSmgsKonList")
    @MapKeyColumn(name = "SORT")
    private Map<Short, CimSmgsPlomb> cimSmgsPlombs = new TreeMap<>();

    @Transient
    private boolean konDuplicates = false;


    public Byte getVedPorNom() {
        return vedPorNom;
    }

    public void setVedPorNom(Byte vedPorNom) {
        this.vedPorNom = vedPorNom;
    }

    public boolean isKonDuplicates() {
        return konDuplicates;
    }

    public void setKonDuplicates(boolean konDuplicates) {
        this.konDuplicates = konDuplicates;
    }

    public BigDecimal getGrpod() {
        return grpod;
    }

    public void setGrpod(BigDecimal grpod) {
        this.grpod = grpod;
    }

    public CimSmgsKonList(byte sort, CimSmgsCarList parentVag) {
        this.sort = sort;
        parentVag.addCimSmgsKonListItem(this);
    }

    public Map<Short, CimSmgsPlomb> getCimSmgsPlombs() {
        return cimSmgsPlombs;
    }

    public void setCimSmgsPlombs(Map<Short, CimSmgsPlomb> cimSmgsPlombs) {
        this.cimSmgsPlombs = cimSmgsPlombs;
    }

    public String getPrim() {
        return prim;
    }

    public void setPrim(String prim) {
        this.prim = prim;
    }

    public String getBruttoSuf() {
        return bruttoSuf;
    }

    public void setBruttoSuf(String bruttoSuf) {
        this.bruttoSuf = bruttoSuf;
    }

    public String getBruttoPref() {
        return bruttoPref;
    }

    public void setBruttoPref(String bruttoPref) {
        this.bruttoPref = bruttoPref;
    }

    public BigDecimal getBrutto() {
        return brutto;
    }

    public void setBrutto(BigDecimal brutto) {
        this.brutto = brutto;
    }

    public String getTaraSuf() {
        return taraSuf;
    }

    public void setTaraSuf(String taraSuf) {
        this.taraSuf = taraSuf;
    }

    public String getTaraPref() {
        return taraPref;
    }

    public void setTaraPref(String taraPref) {
        this.taraPref = taraPref;
    }

    public BigDecimal getTara() {
        return tara;
    }

    public void setTara(BigDecimal tara) {
        this.tara = tara;
    }

    public String getNettoPref() {
        return nettoPref;
    }

    public void setNettoPref(String nettoPref) {
        this.nettoPref = nettoPref;
    }

    public String getNettoSuf() {
        return nettoSuf;
    }

    public void setNettoSuf(String nettoSuf) {
        this.nettoSuf = nettoSuf;
    }

    public BigDecimal getNetto() {
        return netto;
    }

    public void setNetto(BigDecimal netto) {
        this.netto = netto;
    }

    public String getG25() {
        return g25;
    }

    public void setG25(String g25) {
        this.g25 = g25;
    }

    public Byte getPrivat() {
        return privat;
    }

    public void setPrivat(Byte privat) {
        this.privat = privat;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public String getZajavNo() {
        return zajavNo;
    }

    public void setZajavNo(String zajavNo) {
        this.zajavNo = zajavNo;
    }

    public Date getPogruzka() {
        return pogruzka;
    }

    public void setPogruzka(Date pogruzka) {
        this.pogruzka = pogruzka;
    }

    public Date getVvoz() {
        return vvoz;
    }

    public void setVvoz(Date vvoz) {
        this.vvoz = vvoz;
    }

    public Byte getPogrKon() {
        return pogrKon;
    }

    public void setPogrKon(Byte pogrKon) {
        this.pogrKon = pogrKon;
    }

    public String getSpecKon() {
        return specKon;
    }

    public void setSpecKon(String specKon) {
        this.specKon = specKon;
    }

    public String getOwnerKod() {
        return ownerKod;
    }

    public void setOwnerKod(String ownerKod) {
        this.ownerKod = ownerKod;
    }

    public CimSmgsKonList() {
    }

    public CimSmgsKonList(Long hid) {
        this.hid = hid;
    }

    public CimSmgsKonList(Long hid, CimSmgsCarList cimSmgsCarList, Byte sort) {
        this.hid = hid;
        this.cimSmgsCarList = cimSmgsCarList;
        this.sort = sort;
    }

    public CimSmgsKonList(Long hid, CimSmgsCarList cimSmgsCarList,
            /* CimSmgs cimSmgs, */Date dattr, Date locked, String unLock, String trans, String un, Date arch, Short num, String nvag, String nhmNames,
                          String nhmCodes, Byte rid, String plombs, BigDecimal massSend, BigDecimal massCalc, BigDecimal price, BigDecimal priceAdd,
                          BigDecimal priceAll, String utiN, String utiType, String docSend, String notes, String g141, String g142, String g142r, String g146,
                          String g149, String g149r, String g1410, Map<Integer, CimSmgsGruz> cimSmgsGruzs, Byte sort, BigDecimal sizeMm, BigDecimal sizeFoot,
                          Byte kodSob, Byte otmKSob, Short taraKont, String vid, String kat) {
        this.hid = hid;
        this.cimSmgsCarList = cimSmgsCarList;
        this.kodSob = kodSob;
        this.otmKSob = otmKSob;
        this.taraKont = taraKont;
        this.sizeFoot = sizeFoot;
        this.sizeMm = sizeMm;
        this.trans = trans;
        this.un = un;
        this.arch = arch;
        this.num = num;
        this.nvag = nvag;
        this.nhmNames = nhmNames;
        this.nhmCodes = nhmCodes;
        this.rid = rid;
        this.plombs = plombs;
        this.massSend = massSend;
        this.massCalc = massCalc;
        this.price = price;
        this.priceAdd = priceAdd;
        this.priceAll = priceAll;
        this.utiN = utiN;
        this.utiType = utiType;
        this.docSend = docSend;
        this.notes = notes;
        this.g141 = g141;
        this.g142 = g142;
        this.g142r = g142r;
        this.g146 = g146;
        this.g149 = g149;
        this.g149r = g149r;
        this.g1410 = g1410;
        this.cimSmgsGruzs = cimSmgsGruzs;
        this.sort = sort;
        this.vid = vid;
        this.kat = kat;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public CimSmgsCarList getCimSmgsCarList() {
        return this.cimSmgsCarList;
    }

    public void setCimSmgsCarList(CimSmgsCarList cimSmgsCarList) {
        this.cimSmgsCarList = cimSmgsCarList;
    }

    public String getTrans() {
        return this.trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public String getUn() {
        return this.un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public Date getArch() {
        return this.arch;
    }

    public void setArch(Date arch) {
        this.arch = arch;
    }

    public Short getNum() {
        return this.num;
    }

    public void setNum(Short num) {
        this.num = num;
    }

    public String getNvag() {
        return this.nvag;
    }

    public void setNvag(String nvag) {
        this.nvag = nvag;
    }

    public String getNhmNames() {
        return this.nhmNames;
    }

    public void setNhmNames(String nhmNames) {
        this.nhmNames = nhmNames;
    }

    public String getNhmCodes() {
        return this.nhmCodes;
    }

    public void setNhmCodes(String nhmCodes) {
        this.nhmCodes = nhmCodes;
    }

    public Byte getRid() {
        return this.rid;
    }

    public void setRid(Byte rid) {
        this.rid = rid;
    }

    public String getPlombs() {
        return this.plombs;
    }

    public void setPlombs(String plombs) {
        this.plombs = plombs;
    }

    public BigDecimal getMassSend() {
        return this.massSend;
    }

    public void setMassSend(BigDecimal massSend) {
        this.massSend = massSend;
    }

    public BigDecimal getMassCalc() {
        return this.massCalc;
    }

    public void setMassCalc(BigDecimal massCalc) {
        this.massCalc = massCalc;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceAdd() {
        return this.priceAdd;
    }

    public void setPriceAdd(BigDecimal priceAdd) {
        this.priceAdd = priceAdd;
    }

    public BigDecimal getPriceAll() {
        return this.priceAll;
    }

    public void setPriceAll(BigDecimal priceAll) {
        this.priceAll = priceAll;
    }

    public String getUtiN() {
        return this.utiN;
    }

    public void setUtiN(String utiN) {
        this.utiN = utiN;
    }

    public String getUtiType() {
        return this.utiType;
    }

    public void setUtiType(String utiType) {
        this.utiType = utiType;
    }

    public String getDocSend() {
        return this.docSend;
    }

    public void setDocSend(String docSend) {
        this.docSend = docSend;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getG141() {
        return this.g141;
    }

    public void setG141(String g141) {
        this.g141 = g141;
    }

    public String getG142() {
        return this.g142;
    }

    public void setG142(String g142) {
        this.g142 = g142;
    }

    public String getG142r() {
        return this.g142r;
    }

    public void setG142r(String g142r) {
        this.g142r = g142r;
    }

    public String getG146() {
        return this.g146;
    }

    public void setG146(String g146) {
        this.g146 = g146;
    }

    public String getG149() {
        return this.g149;
    }

    public void setG149(String g149) {
        this.g149 = g149;
    }

    public String getG149r() {
        return this.g149r;
    }

    public void setG149r(String g149r) {
        this.g149r = g149r;
    }

    public String getG1410() {
        return this.g1410;
    }

    public void setG1410(String g1410) {
        this.g1410 = g1410;
    }

    public Map<Integer, CimSmgsGruz> getCimSmgsGruzs() {
        return this.cimSmgsGruzs;
    }

    public Byte getSort() {
        return sort;
    }

    public BigDecimal getSizeMm() {
        return sizeMm;
    }

    public BigDecimal getSizeFoot() {
        return sizeFoot;
    }

    public Byte getKodSob() {
        return kodSob;
    }

    public Byte getOtmKSob() {
        return otmKSob;
    }

    public Short getTaraKont() {
        return taraKont;
    }

    public String getVid() {
        return vid;
    }

    public String getKat() {
        return kat;
    }

    @JsonManagedReference
    public void setCimSmgsGruzs(Map<Integer, CimSmgsGruz> cimSmgsGruzs) {
        this.cimSmgsGruzs = cimSmgsGruzs;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public void setSizeMm(BigDecimal sizeMm) {
        this.sizeMm = sizeMm;
    }

    public void setSizeFoot(BigDecimal sizeFoot) {
        this.sizeFoot = sizeFoot;
    }

    public void setKodSob(Byte kodSob) {
        this.kodSob = kodSob;
    }

    public void setOtmKSob(Byte otmKSob) {
        this.otmKSob = otmKSob;
    }

    public void setTaraKont(Short taraKont) {
        this.taraKont = taraKont;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public void setKat(String kat) {
        this.kat = kat;
    }

    public String toString() {
        return new ToStringBuilder(this).append("hid", hid).append("name", nhmNames).toString();
    }

    public void addCimSmgsGruzs() {
        CimSmgsCarList cimSmgsCarList = this.getCimSmgsCarList();
        for (CimSmgsGruz gruz : cimSmgsGruzs.values()) {
            int index = cimSmgsCarList.getCimSmgsGruzs().size();
            gruz.setSort(index);
            gruz.setCimSmgsKonList(this);
            gruz.setCimSmgsCarList(cimSmgsCarList);
            cimSmgsCarList.getCimSmgsGruzs().put(index, gruz);
            gruz.addCimSmgsDanGruzs();
        }
    }

    public void addCimSmgsGruzItem(CimSmgsGruz gruz) {
        if (gruz != null) {
            gruz.setCimSmgsKonList(this);
            cimSmgsGruzs.put(gruz.getSort(), gruz);
        }
    }


    void addCimSmgsDocs9() {
        CimSmgs cimSmgs = this.getCimSmgsCarList().getCimSmgs();
        CimSmgsCarList cimSmgsCarList = this.getCimSmgsCarList();
        for (CimSmgsDocs doc : cimSmgsDocses9.values()) {
            Integer index = cimSmgs.getCimSmgsDocses9().size();
            doc.setSort(index);

            doc.setCimSmgsKonList(this);
            doc.setCimSmgsCarList(cimSmgsCarList);
            doc.setCimSmgs(cimSmgs);

            cimSmgsCarList.getCimSmgsDocses9().put(index, doc);
            cimSmgs.getCimSmgsDocses9().put(index, doc);
        }
    }

    void addCimSmgsPlombs() {
        CimSmgs cimSmgs = this.cimSmgsCarList.getCimSmgs();
        CimSmgsCarList cimSmgsCarList = this.getCimSmgsCarList();
        for (CimSmgsPlomb plomb : cimSmgsPlombs.values()) {
            short index = (short) cimSmgs.getCimSmgsPlombs().size();
            plomb.setSort(index);

            plomb.setCimSmgsKonList(this);
            plomb.setCimSmgsCarList(cimSmgsCarList);
            plomb.setCimSmgs(cimSmgs);

            cimSmgsCarList.getCimSmgsPlombs().put(index, plomb);
            cimSmgs.getCimSmgsPlombs().put(index, plomb);
        }
    }

    public void addCimSmgsPlombItem(CimSmgsPlomb plomb) {
        if (plomb != null) {
            plomb.setCimSmgsKonList(this);
            cimSmgsPlombs.put(plomb.getSort(), plomb);
        }
    }

    public void addCimSmgsDocsItem(CimSmgsDocs csd) {
        if (csd != null) {
            csd.setCimSmgsKonList(this);
            if (csd.getSort() == null) {
                csd.setSort(cimSmgsDocses9.size());
            }
            cimSmgsDocses9.put(csd.getSort(), csd);
        }
    }

    public String kon4CimSmgs() {
        StringBuffer result = new StringBuffer("");
        if (sizeFoot != null) {
            result.append("1x");
            result.append(sizeFoot);
            result.append("HC Container №");
        }
        if (utiN != null && utiN.length() > 0) {
            result.append("<br/>");
            result.append(utiN);
        }
        if (sizeMm != null) {
            result.append("<br/>");
            result.append("(");
            result.append(sizeMm);
            result.append("mm)");
        }
        return result.toString();
    }

    public String kon4CimSmgs1() {
        StringBuffer result = new StringBuffer("");
        if (sizeFoot != null) {
            result.append("1x");
            result.append(sizeFoot);
        }

        if (notes != null && notes.length() > 0) {
            result.append(" ");
            result.append(notes);
        }

        if (utiN != null && utiN.length() > 0) {
            String konConst = (notes != null && notes.length() > 0) ? "" : "HC Container №";
            result.append(" ");
            result.append(konConst);
            result.append("\n");
            result.append(utiN);
        }
        if (sizeMm != null) {
            result.append("\n");
            result.append("(");
            result.append(sizeMm);
            result.append("mm)");
        }
        return result.toString();
    }


    public String gruzyPrintCmr() {
        StringBuilder sb = new StringBuilder();
        String nl = "<br/>";
        String prefix = "";
        for (CimSmgsGruz gruz : getCimSmgsGruzs().values()) {
            sb.append(prefix);
            prefix = "<br/>";
            sb.append(gruz.getNzgr() != null ? gruz.getNzgr() + nl : "");
            sb.append(getSizeFoot() != null ? "1x" + getSizeFoot() + "'" : "");
            sb.append(getVid() != null ? getVid() : "");
            sb.append(getUtiN() != null ? nl + getUtiN() : "");
            sb.append(gruz.getPlaces() != null ? " " + gruz.getPlaces() : "");
            sb.append(gruz.getUpak() != null ? " " + gruz.getUpak() : "");
        }
        return sb.toString();
    }

    public String gruzyPrintCmr1() {
        StringBuilder sb = new StringBuilder();
        String nl = "\n";
        String prefix = "";
        for (CimSmgsGruz gruz : getCimSmgsGruzs().values()) {
            sb.append(prefix);
            prefix = "/n";
            sb.append(gruz.getNzgr() != null ? gruz.getNzgr() + nl : "");
            sb.append(getSizeFoot() != null ? "1x" + getSizeFoot() + "'" : "");
            sb.append(getVid() != null ? getVid() : "");
            sb.append(getUtiN() != null ? nl + getUtiN() : "");
            sb.append(gruz.getPlaces() != null ? " " + gruz.getPlaces() : "");
            sb.append(gruz.getUpak() != null ? " " + gruz.getUpak() : "");
        }
        return sb.toString();
    }

    public Map<Integer, CimSmgsDocs> getCimSmgsDocses9() {
        return cimSmgsDocses9;
    }

    public void setCimSmgsDocses9(Map<Integer, CimSmgsDocs> cimSmgsDocses9) {
        this.cimSmgsDocses9 = cimSmgsDocses9;
    }

    public String kont4CsPrint() {
        StringBuilder sb = new StringBuilder();
        sb.append(sizeFoot != null ? "1x" + sizeFoot : "");

        if (StringUtils.isNotBlank(utiN)) {
            sb.append(StringUtils.isNotBlank(notes) ? " " + notes : "");
            sb.append(" Container № ");
            sb.append(utiN);
        }

        sb.append(sizeMm != null ? " (" + sizeMm + "mm)" : "");
        sb.append(StringUtils.isNotBlank(utiType) ? "; " + utiType : "");
        sb.append(grpod != null ? "; " + grpod : "");

        return sb.toString();
    }

    public void parseAndAddPlombsFromString(String znak) {
        String[] znaks;
        if (znak.split(",").length > znak.split(";").length)
            znaks = znak.split(",");
        else
            znaks = znak.split(";");

        this.addPlombsFromZnakArray(znaks);
    }

    public void addPlombsFromZnakArray(String[] znaks) {
        for (String znak : znaks) {

            if (znak != null && !znak.trim().isEmpty()) {
                CimSmgsPlomb plomb = new CimSmgsPlomb();
                plomb.setZnak(znak);
                plomb.setKpl((short) 1);
                plomb.setSort((short) getCimSmgsPlombs().size());

                this.addCimSmgsPlombItem(plomb);
            }
        }
    }

    public void clearPlombs() {
        if (getCimSmgsCarList() != null && getCimSmgsCarList().getCimSmgs() != null) {
            getCimSmgsCarList().getCimSmgsPlombs().clear();
            getCimSmgsCarList().getCimSmgs().getCimSmgsPlombs().clear();
        }
        getCimSmgsPlombs().clear();
    }

    public BigDecimal calcMassSend() {
        return cimSmgsGruzs
                .values()
                .stream()
                .map(CimSmgsGruz::getMassa)
                .filter(Objects::nonNull)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }

    public Integer calcPlaces() {
        return cimSmgsGruzs
                .values()
                .stream()
                .map(CimSmgsGruz::getPlaces)
                .filter(Objects::nonNull)
                .reduce(Integer::sum)
                .orElse(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CimSmgsKonList that = (CimSmgsKonList) o;
        return Objects.equals(hid, that.hid) &&
                Objects.equals(cimSmgsCarList != null ? cimSmgsCarList.getHid() : "", that.cimSmgsCarList != null ? that.cimSmgsCarList.getHid() : "") &&
                Objects.equals(trans, that.trans) &&
                Objects.equals(un, that.un) &&
                Objects.equals(num, that.num) &&
                Objects.equals(nvag, that.nvag) &&
                Objects.equals(nhmNames, that.nhmNames) &&
                Objects.equals(nhmCodes, that.nhmCodes) &&
                Objects.equals(rid, that.rid) &&
                Objects.equals(plombs, that.plombs) &&
                Objects.equals(massSend, that.massSend) &&
                Objects.equals(massCalc, that.massCalc) &&
                Objects.equals(price, that.price) &&
                Objects.equals(priceAdd, that.priceAdd) &&
                Objects.equals(priceAll, that.priceAll) &&
                Objects.equals(utiN, that.utiN) &&
                Objects.equals(utiType, that.utiType) &&
                Objects.equals(docSend, that.docSend) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(g141, that.g141) &&
                Objects.equals(g142, that.g142) &&
                Objects.equals(g142r, that.g142r) &&
                Objects.equals(g146, that.g146) &&
                Objects.equals(g149, that.g149) &&
                Objects.equals(g149r, that.g149r) &&
                Objects.equals(g1410, that.g1410) &&
                Objects.equals(sort, that.sort) &&
                Objects.equals(sizeMm, that.sizeMm) &&
                Objects.equals(sizeFoot, that.sizeFoot) &&
                Objects.equals(kodSob, that.kodSob) &&
                Objects.equals(otmKSob, that.otmKSob) &&
                Objects.equals(taraKont, that.taraKont) &&
                Objects.equals(vid, that.vid) &&
                Objects.equals(kat, that.kat) &&
                Objects.equals(ownerKod, that.ownerKod) &&
                Objects.equals(specKon, that.specKon) &&
                Objects.equals(pogrKon, that.pogrKon) &&
                Objects.equals(vvoz, that.vvoz) &&
                Objects.equals(pogruzka, that.pogruzka) &&
                Objects.equals(zajavNo, that.zajavNo) &&
                Objects.equals(count, that.count) &&
                Objects.equals(privat, that.privat) &&
                Objects.equals(g25, that.g25) &&
                Objects.equals(netto, that.netto) &&
                Objects.equals(nettoSuf, that.nettoSuf) &&
                Objects.equals(nettoPref, that.nettoPref) &&
                Objects.equals(tara, that.tara) &&
                Objects.equals(taraPref, that.taraPref) &&
                Objects.equals(taraSuf, that.taraSuf) &&
                Objects.equals(brutto, that.brutto) &&
                Objects.equals(bruttoPref, that.bruttoPref) &&
                Objects.equals(bruttoSuf, that.bruttoSuf) &&
                Objects.equals(prim, that.prim) &&
                Objects.equals(grpod, that.grpod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, cimSmgsCarList != null ? cimSmgsCarList.getHid() : "", trans, un, num, nvag, nhmNames, nhmCodes, rid, plombs, massSend, massCalc, price, priceAdd, priceAll, utiN, utiType, docSend, notes, g141, g142, g142r, g146, g149, g149r, g1410, sort, sizeMm, sizeFoot, kodSob, otmKSob, taraKont, vid, kat, ownerKod, specKon, pogrKon, vvoz, pogruzka, zajavNo, count, privat, g25, netto, nettoSuf, nettoPref, tara, taraPref, taraSuf, brutto, bruttoPref, bruttoSuf, prim, grpod);
    }
}
