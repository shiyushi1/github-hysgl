package com.kgc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Meetngroom {
    private Long id;

    private String mname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date morder;

    private String advancename;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public Date getMorder() {
        return morder;
    }

    public void setMorder(Date morder) {
        this.morder = morder;
    }

    public String getAdvancename() {
        return advancename;
    }

    public void setAdvancename(String advancename) {
        this.advancename = advancename == null ? null : advancename.trim();
    }
}