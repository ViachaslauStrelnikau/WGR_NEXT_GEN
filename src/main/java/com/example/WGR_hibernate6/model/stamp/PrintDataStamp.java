package com.example.WGR_hibernate6.model.stamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Штамп
 */
@Entity
@Table(name = "print_data_stamp")
public class PrintDataStamp implements Serializable {
    @Id
    @org.hibernate.annotations.GenericGenerator(
            name = "ID_GENERATOR_STAMP",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "STAMP_HID"),
                    @Parameter(name = "initial_value", value = "1")
            }
    )
    private Long hid;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @CreationTimestamp
    private Date dattr;
    @Length(max = 20)
    private String un;
    @Length(max = 20)
    private String trans;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @UpdateTimestamp
    private Date altered;
    @Length(max = 100)
    private String descr;
    @Length(max = 4)
    private String codePer;
    @NotNull
    private Float llx;
    @NotNull
    private Float lly;
    @NotNull
    private Float urx;
    @NotNull
    private Float ury;
    @ElementCollection
    @CollectionTable(name = "print_data_stamp_border", joinColumns = @JoinColumn(name = "HID_STAMP"))
    @GenericGenerator(name = "ID_GENERATOR_STAMP_BORDER",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "STAMP_BORDER_HID"),
                    @Parameter(name = "initial_value", value = "1")
            })
    private Set<PrintDataStampBorder> borders = new HashSet<>();
    @ElementCollection
    @CollectionTable(name = "print_data_stamp_text", joinColumns = @JoinColumn(name = "HID_STAMP"))
    @GenericGenerator(name = "ID_GENERATOR_STAMP_TEXT",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "STAMP_TEXT_HID"),
                    @Parameter(name = "initial_value", value = "1")
            })
    private Set<PrintDataStampText> texts = new HashSet<>();
    @ElementCollection
    @CollectionTable(name = "print_data_stamp_picture", joinColumns = @JoinColumn(name = "HID_STAMP"))
    @GenericGenerator(name = "ID_GENERATOR_STAMP_PICTURE",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "STAMP_PICTURE_HID"),
                    @Parameter(name = "initial_value", value = "1")
            })
    private Set<PrintDataStampPicture> pics = new HashSet<>();

    public Long getHid() {
        return hid;
    }

    public Date getDattr() {
        return dattr;
    }

    public String getUn() {
        return un;
    }

    public String getTrans() {
        return trans;
    }

    public Date getAltered() {
        return altered;
    }

    public String getDescr() {
        return descr;
    }

    public String getCodePer() {
        return codePer;
    }

    public float getLlx() {
        return llx;
    }

    public float getLly() {
        return lly;
    }

    public float getUrx() {
        return urx;
    }

    public float getUry() {
        return ury;
    }

    public Set<PrintDataStampBorder> getBorders() {
        return borders;
    }

    public Set<PrintDataStampText> getTexts() {
        return texts;
    }

    public Set<PrintDataStampPicture> getPics() {
        return pics;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public void setDattr(Date dattr) {
        this.dattr = dattr;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public void setAltered(Date altered) {
        this.altered = altered;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public void setCodePer(String codePer) {
        this.codePer = codePer;
    }

    public void setLlx(float llx) {
        this.llx = llx;
    }

    public void setLly(float lly) {
        this.lly = lly;
    }

    public void setUrx(float urx) {
        this.urx = urx;
    }

    public void setUry(float ury) {
        this.ury = ury;
    }

    public void setBorders(Set<PrintDataStampBorder> borders) {
        this.borders = borders;
    }

    public void setTexts(Set<PrintDataStampText> texts) {
        this.texts = texts;
    }

    public void setPics(Set<PrintDataStampPicture> pics) {
        this.pics = pics;
    }

    public PrintDataStamp(Long hid, Date dattr, String un, String trans, Date altered, String descr, String codePer, float llx, float lly, float urx, float ury, Set<PrintDataStampBorder> borders, Set<PrintDataStampText> texts, Set<PrintDataStampPicture> pics) {
        this.hid = hid;
        this.dattr = dattr;
        this.un = un;
        this.trans = trans;
        this.altered = altered;
        this.descr = descr;
        this.codePer = codePer;
        this.llx = llx;
        this.lly = lly;
        this.urx = urx;
        this.ury = ury;
        this.borders = borders;
        this.texts = texts;
        this.pics = pics;
    }

    public PrintDataStamp() {
    }

    @Override
    public String toString() {
        return "PrintDataStamp{" +
                "hid=" + hid +
                ", dattr=" + dattr +
                ", un='" + un + '\'' +
                ", trans='" + trans + '\'' +
                ", altered=" + altered +
                ", descr='" + descr + '\'' +
                ", codePer='" + codePer + '\'' +
                ", llx=" + llx +
                ", lly=" + lly +
                ", urx=" + urx +
                ", ury=" + ury +
                '}';
    }
}
