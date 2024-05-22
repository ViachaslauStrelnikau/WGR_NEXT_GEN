package com.example.WGR_hibernate6.model.cimsmgs;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.StringTokenizer;


@Entity
@Table(name = "cim_smgs_docs")
public class CimSmgsDocs implements Serializable {
    @Id
    @org.hibernate.annotations.GenericGenerator(
            name = "ID_GENERATOR_CIMSMGS_DOCS_LIST",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "CIMSMGS_DOCS_HID"),
                    @Parameter(name = "initial_value", value = "1")
            }
    )
    private Long hid;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_CS")
    private CimSmgs cimSmgs;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_KON")
    private CimSmgsKonList cimSmgsKonList;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_CAR")
    private CimSmgsCarList cimSmgsCarList;
    private String code;
    private String text;

    @CreationTimestamp
    private Date dattr;
    private Date locked;
    private String unLock;
    private String text2;
    private String fieldNum;
    private Integer sort;
    private String ncas;
    private String ndoc;

    @JsonSerialize(using = DateSerializer.class)
    private Date dat;
    private Integer ncopy;
    private String text3;
    private String text4;
    private String road_s_name_r;
    private String tnved;

    public String getTnved() {
        return tnved;
    }

    public void setTnved(String tnved) {
        this.tnved = tnved;
    }

    public String getRoad_s_name_r() {
        return road_s_name_r;
    }

    public void setRoad_s_name_r(String road_s_name_r) {
        this.road_s_name_r = road_s_name_r;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getText4() {
        return text4;
    }

    public void setText4(String text4) {
        this.text4 = text4;
    }

    public Integer getNcopy() {
        return ncopy;
    }

    public void setNcopy(Integer ncopy) {
        this.ncopy = ncopy;
    }

    public Date getDat() {
        return dat;
    }

    public void setDat(Date dat) {
        this.dat = dat;
    }

    public String getNdoc() {
        return ndoc;
    }

    public void setNdoc(String ndoc) {
        this.ndoc = ndoc;
    }

    public String getNcas() {
        return ncas;
    }

    public void setNcas(String ncas) {
        this.ncas = ncas;
    }

    public CimSmgsDocs() {
    }

    public CimSmgsDocs(Long hid, Integer sort, String fieldNum) {
        this.hid = hid;
        this.sort = sort;
        this.fieldNum = fieldNum;
    }

    public CimSmgsDocs(Long hid, CimSmgs cimSmgs, String code,
                       String text, Date dattr, Date locked, String unLock, String text2,
                       String fieldNum, Integer sort) {
        this.hid = hid;
        this.cimSmgs = cimSmgs;
        this.code = code;
        this.text = text;
        this.dattr = dattr;
        this.locked = locked;
        this.unLock = unLock;
        this.text2 = text2;
        this.fieldNum = fieldNum;
        this.sort = sort;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    @JsonBackReference
    public CimSmgs getCimSmgs() {
        return this.cimSmgs;
    }

    @JsonBackReference
    public void setCimSmgs(CimSmgs cimSmgs) {
        this.cimSmgs = cimSmgs;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
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

    public String getText2() {
        return this.text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getFieldNum() {
        return this.fieldNum;
    }

    public Integer getSort() {
        return sort;
    }

    public void setFieldNum(String fieldNum) {
        this.fieldNum = fieldNum;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CimSmgsDocs that = (CimSmgsDocs) o;
        return Objects.equals(hid, that.hid) &&
                Objects.equals(cimSmgs != null ? cimSmgs.getHid() : "", that.cimSmgs != null ? that.cimSmgs.getHid() : "") &&
                Objects.equals(cimSmgsKonList != null ? cimSmgsKonList.getHid() : "", that.cimSmgsKonList != null ? that.cimSmgsKonList.getHid() : "") &&
                Objects.equals(cimSmgsCarList != null ? cimSmgsCarList.getHid() : "", that.cimSmgsCarList != null ? that.cimSmgsCarList.getHid() : "") &&
                Objects.equals(code, that.code) &&
                Objects.equals(text, that.text) &&
                Objects.equals(text2, that.text2) &&
                Objects.equals(fieldNum, that.fieldNum) &&
                Objects.equals(sort, that.sort) &&
                Objects.equals(ncas, that.ncas) &&
                Objects.equals(ndoc, that.ndoc) &&
                Objects.equals(dat, that.dat) &&
                Objects.equals(ncopy, that.ncopy) &&
                Objects.equals(text3, that.text3) &&
                Objects.equals(text4, that.text4) &&
                Objects.equals(road_s_name_r, that.road_s_name_r) &&
                Objects.equals(tnved, that.tnved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid,
                cimSmgs != null ? cimSmgs.getHid() : "",
                cimSmgsKonList != null ? cimSmgsKonList.getHid() : "",
                cimSmgsCarList != null ? cimSmgsCarList.getHid() : "",
                code, text, text2, fieldNum, sort, ncas, ndoc, dat, ncopy, text3,text4, road_s_name_r, tnved);
    }

    /*public String toString() {
        return new ToStringBuilder(this).
                append("hid", hid).
                append("name", code).
                toString();
    }*/

    public String marshroot() {
        if (this.text == null) {
            return this.text;
        } else {
            StringBuffer buf = new StringBuffer();
            StringTokenizer st = new StringTokenizer(this.text);
            String token;
            while (st.hasMoreTokens()) {
                token = st.nextToken();
                if (!token.matches("[0-9]+")) {
                    buf.append(" " + token);
                }
            }
            return buf.toString();
        }
    }

    public CimSmgsKonList getCimSmgsKonList() {
        return cimSmgsKonList;
    }

    public void setCimSmgsKonList(CimSmgsKonList cimSmgsKonList) {
        this.cimSmgsKonList = cimSmgsKonList;
    }

    public CimSmgsCarList getCimSmgsCarList() {
        return cimSmgsCarList;
    }

    public void setCimSmgsCarList(CimSmgsCarList cimSmgsCarList) {
        this.cimSmgsCarList = cimSmgsCarList;
    }
    public CimSmgsDocs makeCopy()
    {
        CimSmgsDocs copy = new CimSmgsDocs();

        copy.setText(this.getText());
        copy.setText2(this.getText2());
        copy.setText3(this.getText3());
        copy.setText4(this.getText4());
        copy.setNcas(this.getNcas());
        copy.setNcas(this.getNcas());
        copy.setDat(this.getDat());
        copy.setNcopy(this.getNcopy());
        copy.setNdoc(this.getNdoc());
        return copy;
    }
}
