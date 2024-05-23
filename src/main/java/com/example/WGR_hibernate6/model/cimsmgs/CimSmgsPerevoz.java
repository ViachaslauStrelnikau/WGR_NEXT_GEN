package com.example.WGR_hibernate6.model.cimsmgs;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "cim_smgs_perevoz")
public class CimSmgsPerevoz implements Serializable {
    @Id
    @org.hibernate.annotations.GenericGenerator(
            name = "ID_GENERATOR_CIMSMGS_PEREVOZ_LIST",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "CIMSMGS_PEREVOZ_HID"),
                    @Parameter(name = "initial_value", value = "1")
            }
    )
    private Long hid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_CS")
    private CimSmgs cimSmgs;
    @Column(name = "SORT",precision = 2)
    @Max(99)
    private Byte sort;
    @Column(name = "NAME_PER")
    @Length(max = 80)
    private String namPer;
    @Column(name = "ST_BEG")
    @Length(max = 48)
    private String stBeg;
    @Column(name = "ST_END")
    @Length(max = 48)
    private String stEnd;
    @Column(name = "COD_ST_BEG")
    @Length(max = 6)
    private String codStBeg;
    @Column(name = "COD_ST_END")
    @Length(max = 6)
    private String codStEnd;
    @Column(name = "ADM_ST_BEG")
    @Length(max = 2)
    private String admStBeg;
    @Column(name = "ADM_ST_END")
    @Length(max = 2)
    private String admStEnd;
    @Column(name = "CODE_PER")
    @Length(max = 4)
    private String codePer;

    public String getCodStEnd() {
        return codStEnd;
    }

    public void setCodStEnd(String codStEnd) {
        this.codStEnd = codStEnd;
    }

    public String getCodStBeg() {
        return codStBeg;
    }

    public void setCodStBeg(String codStBeg) {
        this.codStBeg = codStBeg;
    }

    public String getStEnd() {
        return stEnd;
    }

    public void setStEnd(String stEnd) {
        this.stEnd = stEnd;
    }

    public String getStBeg() {
        return stBeg;
    }

    public void setStBeg(String stBeg) {
        this.stBeg = stBeg;
    }

    public String getNamPer() {
        return namPer;
    }

    public void setNamPer(String namPer) {
        this.namPer = namPer;
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public CimSmgs getCimSmgs() {
        return cimSmgs;
    }

    public void setCimSmgs(CimSmgs cimSmgs) {
        this.cimSmgs = cimSmgs;
    }

    public Long getHid() {
        return hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public String getAdmStBeg() {
        return admStBeg;
    }

    public void setAdmStBeg(String admStBeg) {
        this.admStBeg = admStBeg;
    }

    public String getAdmStEnd() {
        return admStEnd;
    }

    public void setAdmStEnd(String admStEnd) {
        this.admStEnd = admStEnd;
    }

    public String getCodePer() {
        return codePer;
    }

    public void setCodePer(String codePer) {
        this.codePer = codePer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CimSmgsPerevoz that = (CimSmgsPerevoz) o;
        return Objects.equals(hid, that.hid) &&
                Objects.equals(cimSmgs != null ? cimSmgs.getHid() : "", that.cimSmgs != null ? that.cimSmgs.getHid() : "") &&
                Objects.equals(sort, that.sort) &&
                Objects.equals(namPer, that.namPer) &&
                Objects.equals(stBeg, that.stBeg) &&
                Objects.equals(stEnd, that.stEnd) &&
                Objects.equals(codStBeg, that.codStBeg) &&
                Objects.equals(codStEnd, that.codStEnd) &&
                Objects.equals(admStBeg, that.admStBeg) &&
                Objects.equals(admStEnd, that.admStEnd) &&
                Objects.equals(codePer, that.codePer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, cimSmgs != null ? cimSmgs.getHid() : "", sort, namPer, stBeg, stEnd, codStBeg, codStEnd, admStBeg, admStEnd, codePer);
    }
    public CimSmgsPerevoz makeCopy()
    {
        CimSmgsPerevoz copy=new CimSmgsPerevoz();
        copy.setNamPer(this.getNamPer());
        copy.setCodePer(this.getCodePer());
        copy.setStBeg(this.getStBeg());
        copy.setAdmStBeg(this.getAdmStBeg());
        copy.setCodStBeg(this.getCodStBeg());
        copy.setStEnd(this.stEnd);
        copy.setAdmStEnd(this.getAdmStEnd());
        copy.setCodStEnd(this.getCodStEnd());

        return copy;
    }
}
