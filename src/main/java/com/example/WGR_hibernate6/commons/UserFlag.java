package com.example.WGR_hibernate6.commons;

/**
 * Created by LDN on 15.11.2020.
 */
public enum UserFlag {
    NONE(null),
    BLACK("1"),
    GREEN("4");

    UserFlag(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    private String val;
}
