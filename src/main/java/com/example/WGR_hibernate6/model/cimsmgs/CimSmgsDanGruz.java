package com.example.WGR_hibernate6.model.cimsmgs;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "cim_smgs_dan_gruz")
public class CimSmgsDanGruz {
    @Id
    @org.hibernate.annotations.GenericGenerator(
            name = "ID_GENERATOR_CIMSMGS_DAN_GRUZ_LIST",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "CIMSMGS_DAN_GRUZ_HID"),
                    @Parameter(name = "initial_value", value = "1")
            }
    )
    private long hid;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_GRUZ")
    private CimSmgsGruz cimSmgsGruz;
    @Column(name = "CAR_D_NAME")
    @Length(max = 256)
    private String carDName;
    @Column(name = "CAR_D_NAME_DE")
    @Length(max = 256)
    private String carDNameDe;
    @Column(name = "COD_DANGER")
    @Length(max = 32)
    private String codDanger;
    @Column(name = "NUM_OON")
    @Length(max = 32)
    private String numOon;
    @Column(name = "DANG_SIGN")
    @Length(max = 32)
    private String dangSign;
    @Column(name = "GROUP_PACK")
    @Length(max = 32)
    private String groupPack;
    @Column(name = "EMERGEN_C")
    @Length(max = 32)
    private String emergenC;
    @Column(name = "STAMP_D_NAME")
    @Length(max = 128)
    private String stampDName;
    @Column(name = "DOP_INFO")
    @Length(max = 512)
    private String dopInfo;
    @Column(name = "CLASS")
    @Length(max = 32)
    private String clazz;
    @Column(name = "SORT", precision = 2)
    @Max(99)
    private Byte sort;

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }
    public CimSmgsDanGruz() {
    }

    public CimSmgsDanGruz(long hid, CimSmgsGruz cimSmgsGruz, String carDName, String carDNameDe, String codDanger, String numOon, String numOonDe, String dangSign, String groupPack, String emergenC, String stampDName, String dopInfo, String clazz, Date dattr, Byte sort) {
        this.hid = hid;
        this.cimSmgsGruz = cimSmgsGruz;
        this.carDName = carDName;
        this.carDNameDe = carDNameDe;
        this.codDanger = codDanger;
        this.numOon = numOon;
        this.dangSign = dangSign;
        this.groupPack = groupPack;
        this.emergenC = emergenC;
        this.stampDName = stampDName;
        this.dopInfo = dopInfo;
        this.clazz = clazz;
        this.sort = sort;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getDopInfo() {
        return dopInfo;
    }

    public void setDopInfo(String dopInfo) {
        this.dopInfo = dopInfo;
    }

    public String getStampDName() {
        return stampDName;
    }

    public void setStampDName(String stampDName) {
        this.stampDName = stampDName;
    }

    public String getEmergenC() {
        return emergenC;
    }

    public void setEmergenC(String emergenC) {
        this.emergenC = emergenC;
    }

    public String getGroupPack() {
        return groupPack;
    }

    public void setGroupPack(String groupPack) {
        this.groupPack = groupPack;
    }

    public String getDangSign() {
        return dangSign;
    }

    public void setDangSign(String dangSign) {
        this.dangSign = dangSign;
    }

    public String getNumOon() {
        return numOon;
    }

    public void setNumOon(String numOon) {
        this.numOon = numOon;
    }

    public String getCodDanger() {
        return codDanger;
    }

    public void setCodDanger(String codDanger) {
        this.codDanger = codDanger;
    }

    public String getCarDNameDe() {
        return carDNameDe;
    }

    public void setCarDNameDe(String carDNameDe) {
        this.carDNameDe = carDNameDe;
    }

    public String getCarDName() {
        return carDName;
    }

    public void setCarDName(String carDName) {
        this.carDName = carDName;
    }

    public CimSmgsGruz getCimSmgsGruz() {
        return cimSmgsGruz;
    }

    public void setCimSmgsGruz(CimSmgsGruz cimSmgsGruz) {
        this.cimSmgsGruz = cimSmgsGruz;
    }

    public long getHid() {
        return hid;
    }

    public void setHid(long hid) {
        this.hid = hid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CimSmgsDanGruz that = (CimSmgsDanGruz) o;
        return hid == that.hid &&
                Objects.equals(cimSmgsGruz != null ? cimSmgsGruz.getHid() : null, that.cimSmgsGruz != null ? that.cimSmgsGruz.getHid() : null) &&
                Objects.equals(carDName, that.carDName) &&
                Objects.equals(carDNameDe, that.carDNameDe) &&
                Objects.equals(codDanger, that.codDanger) &&
                Objects.equals(numOon, that.numOon) &&
                Objects.equals(dangSign, that.dangSign) &&
                Objects.equals(groupPack, that.groupPack) &&
                Objects.equals(emergenC, that.emergenC) &&
                Objects.equals(stampDName, that.stampDName) &&
                Objects.equals(dopInfo, that.dopInfo) &&
                Objects.equals(clazz, that.clazz) &&
                Objects.equals(sort, that.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, cimSmgsGruz != null ? cimSmgsGruz.getHid() : "", carDName, carDNameDe, codDanger, numOon, dangSign, groupPack, emergenC, stampDName, dopInfo, clazz,  sort);
    }

    public StringBuilder danGruzRu4CimSmgsEu() {
        StringBuilder result = new StringBuilder();
        result.append(StringUtils.isNotBlank(codDanger) ? codDanger : "");
        result.append(StringUtils.isNotBlank(numOon) ? "/UN" + numOon : "");
        result.append(StringUtils.isNotBlank(carDName) ? " " + carDName : "");
        result.append(StringUtils.isNotBlank(clazz) ? " " + clazz : "");
        result.append(StringUtils.isNotBlank(dangSign) ? " (" + dangSign + ")" : "");
        result.append(StringUtils.isNotBlank(groupPack) ? ", " + groupPack : "");
        result.append(StringUtils.isNotBlank(emergenC) ? ", AK-" + emergenC : "");
        result.append(StringUtils.isNotBlank(stampDName) ? ", " + stampDName : "");
        result.append(StringUtils.isNotBlank(dopInfo) ? " - " + dopInfo : "");

        return result;
    }

    public StringBuilder danGruzDe4CimSmgsEu() {
        StringBuilder result = new StringBuilder();
        result.append(StringUtils.isNotBlank(codDanger) ? codDanger : "");
        result.append(StringUtils.isNotBlank(numOon) ? "/UN" + numOon : "");
        result.append(StringUtils.isNotBlank(carDNameDe) ? " " + carDNameDe : "");
        result.append(StringUtils.isNotBlank(clazz) ? " " + clazz : "");
        result.append(StringUtils.isNotBlank(dangSign) ? " (" + dangSign + ")" : "");
        result.append(StringUtils.isNotBlank(groupPack) ? ", " + groupPack : "");
        result.append(StringUtils.isNotBlank(dopInfo) ? " - " + dopInfo : "");

        return result;
    }
}
