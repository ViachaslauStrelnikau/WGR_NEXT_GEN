package com.example.WGR_hibernate6.model;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Entity
@Table(name = "usr_pi_doc")
public class UserPiDoc {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long hid;
    @Length(max = 36)
    private String docId;
    @Length(max = 5)
    private String docCode;
    @Length(max = 250)
    private String docName;
    @Length(max = 20)
    private String docNumber;
    private Date docDate;
    @Length(max = 36)
    private String archId;
    @Length(max = 36)
    private String archDocId;
    @Length(max = 20)
    @Column(name = "UN_ID")
    private String un;

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public Long getHid() {
        return hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public String getArchId() {
        return archId;
    }

    public void setArchId(String archId) {
        this.archId = archId;
    }

    public String getArchDocId() {
        return archDocId;
    }

    public void setArchDocId(String archDocId) {
        this.archDocId = archDocId;
    }
}
