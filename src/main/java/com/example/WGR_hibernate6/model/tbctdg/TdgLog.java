package com.example.WGR_hibernate6.model.tbctdg;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Parameter;

import java.util.Date;

@Entity
@Table(name = "tdg_log")
public class TdgLog implements Comparable<TdgLog> {
  @Id
  @org.hibernate.annotations.GenericGenerator(
          name = "ID_GENERATOR_TDG_LOG",
          type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
          parameters = {
                  @Parameter(name = "sequence_name", value = "TDG_LOG_HID"),
                  @Parameter(name = "initial_value", value = "1")
          }
  )
  private Long hid;
  @CreationTimestamp
  private Date dattr;
  private Long hid_cs;
  private String dir;
  private String pid;
  private Integer status;
  private String status_txt;
  private String result_txt;

  public TdgLog() {
  }

  public TdgLog(Long hid) {
    this.hid = hid;
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

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Long getHid_cs() {
    return hid_cs;
  }

  public void setHid_cs(Long hid_pack) {
    this.hid_cs = hid_pack;
  }

  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }

  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public String getStatus_txt() {
    return status_txt;
  }

  public void setStatus_txt(String status_txt) {
    this.status_txt = status_txt;
  }

  public String getResult_txt() {
    return result_txt;
  }

  public void setResult_txt(String result_txt) {
    this.result_txt = result_txt;
  }

  @Override
  public int compareTo(TdgLog o) {
    final int BEFORE = -1;
    final int EQUAL = 0;
    final int AFTER = 1;

    if (this == o) return EQUAL;
    if (this.getHid() == null) return AFTER;
    if (o.getHid() == null) return BEFORE;
    if (this.getHid() < o.getHid()) return AFTER;
    if (this.getHid() > o.getHid()) return BEFORE;
    return EQUAL;
  }

  @Override
  public String toString() {
    return hid != null ? String.valueOf(hid) : "null";
  }
}
