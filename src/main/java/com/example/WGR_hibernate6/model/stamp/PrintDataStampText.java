package com.example.WGR_hibernate6.model.stamp;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * Текст в штампе
 */

@Embeddable
public class PrintDataStampText implements Serializable {
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
    @Length(max = 30)
    private String fontFamily;
    @Max(99)
    private Float fontSize;
    @Max(99)
    private Float leading;
    private Boolean bold;
    private Boolean italic;
    private Boolean underline;
    private Boolean uppercase;
    private Integer rotate;
    private Boolean tabular;
    @Length(max = 20)
    private String name;
    @Length(max = 20)
    private String mask;
    @Length(max = 50)
    private String txt;

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

    public String getFontFamily() {
        return fontFamily;
    }

    public Float getFontSize() {
        return fontSize;
    }

    public Float getLeading() {
        return leading;
    }

    public Boolean getBold() {
        return bold;
    }

    public Boolean getItalic() {
        return italic;
    }

    public boolean isUnderline() {
        return underline;
    }

    public Boolean getUppercase() {
        return uppercase;
    }

    public Integer getRotate() {
        return rotate;
    }

    public boolean isTabular() {
        return tabular;
    }

    public String getName() {
        return name;
    }

    public String getMask() {
        return mask;
    }

    public String getTxt() {
        return txt;
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

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setFontSize(Float fontSize) {
        this.fontSize = fontSize;
    }

    public void setLeading(Float leading) {
        this.leading = leading;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    public void setItalic(Boolean italic) {
        this.italic = italic;
    }

    public void setUnderline(boolean underline) {
        this.underline = underline;
    }

    public void setUppercase(Boolean uppercase) {
        this.uppercase = uppercase;
    }

    public void setRotate(Integer rotate) {
        this.rotate = rotate;
    }

    public void setTabular(boolean tabular) {
        this.tabular = tabular;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public PrintDataStampText(Float rllx, Float rlly, Float rurx, Float rury, String color, String fontFamily, Float fontSize, Float leading, Boolean bold, Boolean italic, boolean underline, Boolean uppercase, Integer rotate, boolean tabular, String name, String mask, String txt) {
        this.rllx = rllx;
        this.rlly = rlly;
        this.rurx = rurx;
        this.rury = rury;
        this.color = color;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.leading = leading;
        this.bold = bold;
        this.italic = italic;
        this.underline = underline;
        this.uppercase = uppercase;
        this.rotate = rotate;
        this.tabular = tabular;
        this.name = name;
        this.mask = mask;
        this.txt = txt;
    }

    public PrintDataStampText() {
    }

    @Override
    public String toString() {
        return "PrintDataStampText{" +
                ", rllx=" + rllx +
                ", rlly=" + rlly +
                ", rurx=" + rurx +
                ", rury=" + rury +
                ", color='" + color + '\'' +
                ", fontFamily='" + fontFamily + '\'' +
                ", fontSize=" + fontSize +
                ", leading=" + leading +
                ", bold=" + bold +
                ", italic=" + italic +
                ", underline=" + underline +
                ", uppercase=" + uppercase +
                ", rotate=" + rotate +
                ", tabular=" + tabular +
                ", name='" + name + '\'' +
                ", mask='" + mask + '\'' +
                ", txt='" + txt + '\'' +
                '}';
    }
}
