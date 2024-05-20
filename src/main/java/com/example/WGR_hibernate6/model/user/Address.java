package com.example.WGR_hibernate6.model.user;

import jakarta.annotation.Nullable;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Embeddable
public class Address {

    @Length(max =40, message = "Field must less than 40 characters")
    @Nullable
    private String surname;
    @Length(max =40, message = "Field must less than 40 characters")
    @Nullable
    private String name;
    @Length(max =40, message = "Field must less than 40 characters")
    @Nullable
    private String middleName;
    @Length(max =250, message = "Field must less than 250 characters")
    @Nullable
    private String post;

    @Length(max =24, message = "Field must less than 24 characters")
    @Nullable
    private String phone;
    @Length(max =10, message = "Field must less than 10 characters")
    @Nullable
    private String idcardCode;
    @Length(max =20, message = "Field must less than 20 characters")
    @Nullable
    private String idcardName;
    @Length(max =11, message = "Field must less than 11 characters")
    @Nullable
    private String idcardSeries;
    @Length(max =25, message = "Field must less than 25 characters")
    @Nullable
    private String idcardNumber;
    private Date idcardDate;
    @Length(max =150, message = "Field must less than 150 characters")
    @Nullable
    private String idcardIssuerName;
    @Length(max =50, message = "Field must less than 50 characters")
    @Nullable
    private String prdocName;
    @Length(max =50, message = "Field must less than 50 characters")
    @Nullable
    private String prdocNumber;
    @Nullable
    private Date prdocDateFrom;
    @Nullable
    private Date prdocDateTo;

    @Max(9)
    @Min(0)
    @Nullable
    private Byte fa2;
    @Nullable
    @Length(max =20, message = "Field must less than 20 characters")
    private String fa2Phone;
    @Length(max =200, message = "Field must less than 200 characters")
    @Nullable
    private String fa2Mail;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdcardCode() {
        return idcardCode;
    }

    public void setIdcardCode(String idcardCode) {
        this.idcardCode = idcardCode;
    }

    public String getIdcardName() {
        return idcardName;
    }

    public void setIdcardName(String idcardName) {
        this.idcardName = idcardName;
    }

    public String getIdcardSeries() {
        return idcardSeries;
    }

    public void setIdcardSeries(String idcardSeries) {
        this.idcardSeries = idcardSeries;
    }

    public String getIdcardNumber() {
        return idcardNumber;
    }

    public void setIdcardNumber(String idcardNumber) {
        this.idcardNumber = idcardNumber;
    }

    public Date getIdcardDate() {
        return idcardDate;
    }

    public void setIdcardDate(Date idcardDate) {
        this.idcardDate = idcardDate;
    }

    public String getIdcardIssuerName() {
        return idcardIssuerName;
    }

    public void setIdcardIssuerName(String idcardIssuerName) {
        this.idcardIssuerName = idcardIssuerName;
    }

    public String getPrdocName() {
        return prdocName;
    }

    public void setPrdocName(String prdocName) {
        this.prdocName = prdocName;
    }

    public String getPrdocNumber() {
        return prdocNumber;
    }

    public void setPrdocNumber(String prdocNumber) {
        this.prdocNumber = prdocNumber;
    }

    public Date getPrdocDateFrom() {
        return prdocDateFrom;
    }

    public void setPrdocDateFrom(Date prdocDateFrom) {
        this.prdocDateFrom = prdocDateFrom;
    }

    public Date getPrdocDateTo() {
        return prdocDateTo;
    }

    public void setPrdocDateTo(Date prdocDateTo) {
        this.prdocDateTo = prdocDateTo;
    }

    public Byte getFa2() {
        return fa2;
    }

    public void setFa2(Byte fa2) {
        this.fa2 = fa2;
    }

    public String getFa2Phone() {
        return fa2Phone;
    }

    public void setFa2Phone(String fa2Phone) {
        this.fa2Phone = fa2Phone;
    }

    public String getFa2Mail() {
        return fa2Mail;
    }

    public void setFa2Mail(String fa2Mail) {
        this.fa2Mail = fa2Mail;
    }
}
