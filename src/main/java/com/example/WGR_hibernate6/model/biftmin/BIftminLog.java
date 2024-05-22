package com.example.WGR_hibernate6.model.biftmin;

import com.example.WGR_hibernate6.model.cimsmgs.CimSmgs;
import jakarta.persistence.*;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "b_iftmin_log")
public class BIftminLog implements Serializable {
  @Id
  @org.hibernate.annotations.GenericGenerator(
          name = "ID_BI_IFTMIN_LOG",
          type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
          parameters = {
                  @Parameter(name = "sequence_name", value = "BI_IFTMIN_LOG_HID"),
                  @Parameter(name = "initial_value", value = "1")
          }
  )
  private Long hid;
  private String text;
  private String mes_name;
  private String src;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "HID_SRC")
  private CimSmgs cimSmgs;
  private Date dattr;
  @OneToMany(mappedBy = "BIftminLog",fetch = FetchType.LAZY)
  private Set<Contrl> BContrls = new HashSet<>();
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "HID_IFTMIN_LOG")
  private Set<Aperak> BAperak = new HashSet<>();
  private String cod_dir;
  private String dir;
  private String id;

  public BIftminLog()   {
  }

  public BIftminLog(String out_text)   {
    this.text =out_text;
  }

  public String getMes_name() {
    return mes_name;
  }

  public String getText() {
    return text;
  }

  public String getSrc() {
    return src;
  }

  public Long getHid() {
    return hid;
  }


  public void setMes_name(String mes_name) {
    this.mes_name = mes_name;
  }

  public void setText(String out_text) {
    this.text = out_text;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public void setHid(Long hid) {
    this.hid = hid;
  }

  public CimSmgs getCimSmgs()
  {
    return this.cimSmgs;
  }

  public Date getDattr()
  {
    return dattr;
  }

  public void setCimSmgs(CimSmgs cimSmgs)
  {
    this.cimSmgs = cimSmgs;
  }

  public Set<Contrl> getBContrls()
  {
    return this.BContrls;
  }

  public void setBContrls(Set<Contrl> BContrls)
  {
    this.BContrls = BContrls;
  }

  public Set<Aperak> getBAperak()
  {
    return this.BAperak;
  }

  public void setBAperak(Set<Aperak> BAperakDets)
  {
    this.BAperak = BAperakDets;
  }

  public void setDattr(Date dattr)
  {
    this.dattr = dattr;
  }

  public String getCod_dir() {
    return cod_dir;
  }

  public void setCod_dir(String dir) {
    this.cod_dir = dir;
  }

  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Set<AperakDet> getBAperakDetSet() {
    if (BAperak.size() > 0) {
      Set<AperakDet> detSet = BAperak.iterator().next().getAperakDet();
      if (detSet.size() > 0) {
        return detSet;
      }
      else {
        return new HashSet<>(0);
      }
    }
    else {
      return new HashSet<>(0);
    }
  }
}
