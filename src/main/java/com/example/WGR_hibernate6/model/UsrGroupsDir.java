package com.example.WGR_hibernate6.model;

// Generated 12.11.2010 16:44:31 by Hibernate Tools 3.4.0.Beta1

import com.example.WGR_hibernate6.model.user.Usr;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "usr_groups_dir")
public class UsrGroupsDir implements Serializable {

	@Id
	@Length(max = 20, min = 2, message = "Field must be between 2 and 20 characters")
	private String name;
	@Length(max = 512, message = "Field must less than 512 characters")
	private String deptrans;
	@NotNull
	private boolean locked;
	@CreationTimestamp
	private Date dattr;
	@NotNull
	@Length(max = 20, min = 2, message = "Field must be between 2 and 20 characters")
	private String un;
	@Length(max = 200, message = "Field must less than 200 characters")
	private String descr;
	@Max(999)
	@Min(0)
    private Integer tp;


    public UsrGroupsDir() {
	}
	
	public UsrGroupsDir(String name) {
		this.name = name;
	}

	public UsrGroupsDir(String name, boolean locked, Date dattr, String un) {
		this.name = name;
		this.locked = locked;
		this.dattr = dattr;
		this.un = un;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptrans() {
		return this.deptrans;
	}

	public void setDeptrans(String deptrans) {
		this.deptrans = deptrans;
	}

	public boolean isLocked() {
		return this.locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
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

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public void setTp(Integer tp) {
		this.tp = tp;
	}

	public Integer getTp() {
		return tp;
	}

	public void saving(Usr user) {
	    setDattr(new Date());
	    setUn(user.getUn());
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsrGroupsDir that = (UsrGroupsDir) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(deptrans, that.deptrans) &&
                Objects.equals(un, that.un) &&
				Objects.equals(tp, that.tp) &&
                Objects.equals(descr, that.descr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, deptrans, un, descr);
    }
}
