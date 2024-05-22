package com.example.WGR_hibernate6.model.biftmin;

import jakarta.persistence.*;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;

@Entity
@Table(name = "b_aperak_det")
public class AperakDet implements Serializable {
  @Id
  @org.hibernate.annotations.GenericGenerator(
          name = "ID_APERAK_DET",
          type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
          parameters = {
                  @Parameter(name = "sequence_name", value = "APERAK_DET_HID"),
                  @Parameter(name = "initial_value", value = "1")
          }
  )
  private Long hid;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "HID_MAIN")
  private Aperak main;
  private String kod1;            // Код типа ошибки
  private String kod2;            // Код класса ошибки
  private String errText;         // Описание ошибки
  private String idUnhOri;
  private String errText2;        // Дополнительное описание ошибки

  public AperakDet() {
  }

  public AperakDet(String errText2, String errText) {
    this.errText2 = errText2;
    this.errText = errText;
  }

  public Long getHid() {
    return hid;
  }

  public String getErrText() {
    return errText;
  }

  public String getErrText2() {
    return errText2;
  }

  public String getKod1() {
    return kod1;
  }

  public String getKod2() {
    return kod2;
  }

  public Aperak getMain() {
    return main;
  }

    public String getIdUnhOri() {
    return idUnhOri;
  }

  public void setHid(Long hid) {
    this.hid = hid;
  }

  public void setErrText(String errText) {
    this.errText = errText;
  }

  public void setErrText2(String errText2) {
    this.errText2 = errText2;
  }

  public void setKod1(String kod1) {
    this.kod1 = kod1;
  }

  public void setKod2(String kod2) {
    this.kod2 = kod2;
  }

  public void setMain(Aperak main) {
    this.main = main;
  }

    public void setIdUnhOri(String idUnhOri) {
    this.idUnhOri = idUnhOri;
  }

}
