package com.example.WGR_hibernate6.model;

import com.example.WGR_hibernate6.commons.DocDirViewType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "doc_dir")
public class DocDir implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private BigDecimal hid;

    @Length(max = 30)
	private String name;
    @Length(max = 100)
	private String descr;

    @CreationTimestamp
	private Date dattr;

    @Length(max = 20)
	private String un;

    @Length(max = 50)
    private String alias;
    @Length(max = 50)
    private String groupAlias;

    @Length(max = 50)
    private String range;
    @Length(max = 50)
    private String prefix;
    private Byte type;
    private Boolean zipped;

    @Column(name = "view")
    @Enumerated(EnumType.STRING)
    private DocDirViewType viewType;

    public DocDirViewType getViewType() {
        return viewType;
    }

    public void setViewType(DocDirViewType viewType) {
        this.viewType = viewType;
    }

    public Boolean getZipped() {
        return zipped;
    }

    public void setZipped(Boolean zipped) {
        this.zipped = zipped;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }


    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }


    public String getGroupAlias() {
        return groupAlias;
    }

    public void setGroupAlias(String groupAlias) {
        this.groupAlias = groupAlias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public DocDir() {
	}

	public DocDir(BigDecimal hid) {
		this.hid = hid;
	}

	public DocDir(BigDecimal hid, String name, String descr, Date dattr, String un) {
		this.hid = hid;
		this.name = name;
		this.descr = descr;
		this.dattr = dattr;
		this.un = un;
	}

	public BigDecimal getHid() {
		return this.hid;
	}

	public void setHid(BigDecimal hid) {
		this.hid = hid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Date getDattr() {
		return this.dattr;
	}

	public void setDattr(Date dattr) {
		this.dattr = dattr;
	}

	public String getUn() {
		return this.un;
	}

	public void setUn(String un) {
		this.un = un;
	}
}
