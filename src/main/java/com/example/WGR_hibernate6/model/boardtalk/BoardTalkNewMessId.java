package com.example.WGR_hibernate6.model.boardtalk;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;


@Embeddable
public class BoardTalkNewMessId implements java.io.Serializable {
    @Column(name = "pack_doc_hid")
    private Long packDocHid;
    @Column(name = "DOC_HID")
    private Long docHid;
    private String docName;
    private String un;

    public BoardTalkNewMessId(Long packDocHid, String docName, Long docHid, String un) {
        this.packDocHid = packDocHid;
        this.docName = docName;
        this.docHid = docHid;
        this.un = un;
    }

    public BoardTalkNewMessId() {
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public Long getDocHid() {
        return docHid;
    }

    public void setDocHid(Long docHid) {
        this.docHid = docHid;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public Long getPackDocHid() {
        return packDocHid;
    }

    public void setPackDocHid(Long packDocHid) {
        this.packDocHid = packDocHid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardTalkNewMessId that = (BoardTalkNewMessId) o;
        return packDocHid.equals(that.packDocHid) &&
                docName.equals(that.docName) &&
                docHid.equals(that.docHid) &&
                un.equals(that.un);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packDocHid, docName, docHid, un);
    }

}
