package com.example.WGR_hibernate6.model.cimsmgs.cscomnt;

import jakarta.persistence.*;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;

@Entity
@Table(name = "CS_COMNT_DET")
public class CsComntDet  implements Serializable {
  @Id
  @org.hibernate.annotations.GenericGenerator(
          name = "ID_GENERATOR_CS_COMNT_DET",
          type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
          parameters = {
                  @Parameter(name = "sequence_name", value = "CS_COMNT_DET_HID"),
                  @Parameter(name = "initial_value", value = "1")
          }
  )
  private Long hid;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "HID_MAIN")
  private CsComnt main;
  private String seg;            // Код типа ошибки
  private String text;            // Код класса ошибки

  public CsComntDet() {
  }

  public Long getHid() {
    return hid;
  }

  public CsComnt getMain() {
    return main;
  }

  public String getSeg() {
    return seg;
  }

  public String getText() {
    return text;
  }

  public void setHid(Long hid) {
    this.hid = hid;
  }

  public void setMain(CsComnt main) {
    this.main = main;
  }

  public void setSeg(String seg) {
    this.seg = seg;
  }

  public void setText(String text) {
    this.text = text;
  }

}
