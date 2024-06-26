package com.example.WGR_hibernate6.model.tbctdg;

import jakarta.persistence.*;
import org.hibernate.annotations.Parameter;

import java.util.Date;

@Entity
@Table(name = "tbc2_log")
public class Tbc2Log {
    @Id
    @org.hibernate.annotations.GenericGenerator(
            name = "ID_GENERATOR_TBC2_LOG",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "TBC2_LOG_HID"),
                    @Parameter(name = "initial_value", value = "1")
            }
    )
    private Long hid;
    private Long hid_src;
//    private Long hid_pack;
    private String xml;
    private String result;
    private String doc_type;
    private String docId;
    private Date dattr;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_PACK")
    private Tbc2Pack tbc2Pack;

    public Tbc2Pack getTbc2Pack() {
        return tbc2Pack;
    }

    public void setTbc2Pack(Tbc2Pack tbc2Pack) {
        this.tbc2Pack = tbc2Pack;
    }


    public Tbc2Log() {
  }

  public Tbc2Log(Long hid_src, String xml, String docId,  String doc_type) {
    this.hid_src = hid_src;
    this.xml = xml;
    this.docId = docId;
//    this.hid_pack = hid_pack;
    this.doc_type = doc_type;
  }


    /*public Long getHid_pack() {
        return hid_pack;
    }

    public void setHid_pack(Long hid_pack) {
        this.hid_pack = hid_pack;
    }*/

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }

    public Date getDattr() {
        return dattr;
    }

    public void setDattr(Date dattr) {
        this.dattr = dattr;
    }

    public Long getHid() {
    return hid;
  }

    public void setHid(Long hid) {
      this.hid = hid;
    }

    public Long getHid_src() {
      return hid_src;
    }

    public void setHid_src(Long hid_src) {
      this.hid_src = hid_src;
    }

    public String getDocId() {
    return docId;
  }

    public void setDocId(String docId) {
    this.docId = docId;
  }

    public String getXml() {
      return xml;
    }

    public void setXml(String xml) {
      this.xml = xml;
    }

}
