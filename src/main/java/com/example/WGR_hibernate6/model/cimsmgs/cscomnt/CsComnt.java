package com.example.WGR_hibernate6.model.cimsmgs.cscomnt;

import jakarta.persistence.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Parameter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cs_comnt")
public class CsComnt  implements Serializable {
  
	@Serial
    private static final long serialVersionUID = -7592820919968979556L;
  @Id
  @org.hibernate.annotations.GenericGenerator(
          name = "ID_GENERATOR_CS_COMNT",
          type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
          parameters = {
                  @Parameter(name = "sequence_name", value = "CS_COMNT_HID"),
                  @Parameter(name = "initial_value", value = "1")
          }
  )
private Long hid;
  private Date datSend;            // Дата отправки сообщения
  @Column(name = "REF_ID")
  private String refId;            // идентификатор оригинального сообщения
  private Date refDate;            // Дата отправки оригинального сообщения
  private String refType;          // Тип оригинального документа
  @CreationTimestamp
  private Date dattr;              // Дата занесения сообщения в БД
  private String id;               // идентификатор сообщения
  private String text;             // Текст сообщения
  @OneToMany(fetch = FetchType.LAZY,mappedBy = "main")
  private Set<CsComntDet> comntDet = new HashSet<>();

  public CsComnt() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String toString() {
    return new ToStringBuilder(this).append(getId()).toString();
  }

  public Long getHid() {
    return hid;
  }

  public void setHid(Long hid) {
    this.hid = hid;
  }

  public Date getDattr() {
    return dattr;
  }

  public Set<CsComntDet> getComntDet() {
    return comntDet;
  }

  public Date getDatSend() {
    return datSend;
  }

  public Date getRefDate() {
    return refDate;
  }

  public String getRefId() {
    return refId;
  }

  public String getRefType() {
    return refType;
  }

  public String getText() {
    return text;
  }

  public void setDattr(Date dattr) {
    this.dattr = dattr;
  }

  public void setComntDet(Set<CsComntDet> comntDet) {
    this.comntDet = comntDet;
  }

  public void setDatSend(Date datSend) {
    this.datSend = datSend;
  }

  public void setRefDate(Date refDate) {
    this.refDate = refDate;
  }

  public void setRefId(String refId) {
    this.refId = refId;
  }

  public void setRefType(String refType) {
    this.refType = refType;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void addComntDet(CsComntDet det) {
     this.comntDet.add(det);
     det.setMain(this);
  }

  public boolean hasDetail() {
    return comntDet != null && !comntDet.isEmpty();
  }
}
