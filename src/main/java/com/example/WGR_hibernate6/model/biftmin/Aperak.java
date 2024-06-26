package com.example.WGR_hibernate6.model.biftmin;

import jakarta.persistence.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "B_APERAK")
public class Aperak  implements Serializable {
  @Id
  @org.hibernate.annotations.GenericGenerator(
          name = "ID_APERAK",
          type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
          parameters = {
                  @Parameter(name = "sequence_name", value = "APERAK_HID"),
                  @Parameter(name = "initial_value", value = "1")
          }
  )
  private Long hid;
  private String idUnb;            // ID оригинального сообщения из сегмента UNB, на которое формируется CONTRL
  private Date datUnb;             // Дата отправки оригинального сообщения
  private String id;               // идентификатор сообщения
  private String kodDoc;           // Тип документа
  private String idBgm;            // Идентификатор из BGM
  private String status;           // Статус сообщения (1 - Анулирование, 4 - Изменения, 5 - Замена, 9 - Оригинал)
  private Date datOf;              // Дата оформления документка (сообщения) на стороне отправления
  private String smgs;             // Номер оригинальной накладной
  private Date dprv;               // Дата приема груза к перевозке
  private Date dattr;              // Дата занесения сообщения в БД
  private String text = "";        // текст сообщения APERAK

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "HID_IFTMIN_LOG")
  private BIftminLog iftminLog;

  @OneToMany(mappedBy = "main")
  private Set<AperakDet> aperakDet = new HashSet<>();

  public Aperak() {
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

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
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

  public void setDattr(Date dattr) {
    this.dattr = dattr;
  }

  public Date getDatUnb() {
    return datUnb;
  }

  public Date getDatOf() {
    return datOf;
  }

  public Date getDprv() {
    return dprv;
  }

  public String getIdBgm() {
    return idBgm;
  }

  public String getIdUnb() {
    return idUnb;
  }

  public String getKodDoc() {
    return kodDoc;
  }

  public String getSmgs() {
    return smgs;
  }

  public String getStatus() {
    return status;
  }

  public Set<AperakDet> getAperakDet() {
    return aperakDet;
  }

  public void setDatUnb(Date datUnb) {
    this.datUnb = datUnb;
  }

  public void setDatOf(Date datOf) {
    this.datOf = datOf;
  }

  public void setDprv(Date dprv) {
    this.dprv = dprv;
  }

  public void setIdBgm(String idBgm) {
    this.idBgm = idBgm;
  }

  public void setIdUnb(String idUnb) {
    this.idUnb = idUnb;
  }

  public void setKodDoc(String kodDoc) {
    this.kodDoc = kodDoc;
  }

  public void setSmgs(String smgs) {
    this.smgs = smgs;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setAperakDet(Set<AperakDet> det) {
    this.aperakDet = det;
  }

  public void addAperakDet(AperakDet det) {
     this.aperakDet.add(det);
     det.setMain(this);
  }

  public BIftminLog getIftminLog() {
    return iftminLog;
  }

  public void setIftminLog(BIftminLog iftminLog) {
    this.iftminLog = iftminLog;
  }
}
