package com.example.WGR_hibernate6.model.stamp;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.util.Arrays;
import java.util.Base64;

@Embeddable
public class PrintDataStampPicture {
    @NotNull
    private Float rllx;
    @NotNull
    private Float rlly;
    @NotNull
    private Float rurx;
    @NotNull
    private Float rury;
    private byte[] pict;
    @Length(max = 100)
    private String descr;

    public float getRllx() {
        return rllx;
    }

    public float getRlly() {
        return rlly;
    }

    public float getRurx() {
        return rurx;
    }

    public float getRury() {
        return rury;
    }

    public byte[] getPict() {
        return pict;
    }

    public String getDescr() {
        return descr;
    }

    public void setRllx(float rllx) {
        this.rllx = rllx;
    }

    public void setRlly(float rlly) {
        this.rlly = rlly;
    }

    public void setRurx(float rurx) {
        this.rurx = rurx;
    }

    public void setRury(float rury) {
        this.rury = rury;
    }

    public void setPict(byte[] pict) {
        this.pict = pict;
    }

    public void setPict(String pict) {

        this.pict =   Base64.getDecoder().decode(pict);
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public PrintDataStampPicture(float rllx, float rlly, float rurx, float rury, byte[] pict, String descr) {
        this.rllx = rllx;
        this.rlly = rlly;
        this.rurx = rurx;
        this.rury = rury;
        this.pict = pict;
        this.descr = descr;
    }

    public PrintDataStampPicture() {
    }

    @Override
    public String toString() {
        return "PrintDataStampPicture{" +
                ", rllx=" + rllx +
                ", rlly=" + rlly +
                ", rurx=" + rurx +
                ", rury=" + rury +
                ", pict=" + Arrays.toString(pict) +
                ", descr='" + descr + '\'' +
                '}';
    }
}
