package com.example.WGR_hibernate6.model.stamp;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * Границы штампа
 */
@Embeddable
public class PrintDataStampBorder implements Serializable {
    private Byte border;
    @NotNull
    private Float rllx;
    @NotNull
    private Float rlly;
    @NotNull
    private Float rurx;
    @NotNull
    private Float rury;
    @Length(max = 8)
    private String color;
    @Max(99)
    private Integer radius;
    private Boolean dashed;

    public byte getBorder() {
        return border;
    }

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

    public String getColor() {
        return color;
    }

    public Integer getRadius() {
        return radius;
    }

    public Boolean getDashed() {
        return dashed;
    }

    public void setDashed(Boolean dashed) {
        this.dashed = dashed;
    }


    public void setBorder(byte border) {
        this.border = border;
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public PrintDataStampBorder( byte border, float rllx, float rlly, float rurx, float rury, String color, Integer radius) {
        this.border = border;
        this.rllx = rllx;
        this.rlly = rlly;
        this.rurx = rurx;
        this.rury = rury;
        this.color = color;
        this.radius = radius;
    }

    public PrintDataStampBorder() {
    }

    public PrintDataStampBorder(byte border, float rllx, float rlly, float rurx, float rury, String color, Integer radius, Boolean dashed) {
        this.border = border;
        this.rllx = rllx;
        this.rlly = rlly;
        this.rurx = rurx;
        this.rury = rury;
        this.color = color;
        this.radius = radius;
        this.dashed = dashed;
    }

    @Override
    public String toString() {
        return "PrintDataStampBorder{" +
                ", border=" + border +
                ", rllx=" + rllx +
                ", rlly=" + rlly +
                ", rurx=" + rurx +
                ", rury=" + rury +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                ", dashed=" + dashed +
                '}';
    }
}
