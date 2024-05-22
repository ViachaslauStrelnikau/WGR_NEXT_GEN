package com.example.WGR_hibernate6.model;

import com.example.WGR_hibernate6.commons.UserFlag;
import com.example.WGR_hibernate6.model.cimsmgs.CimSmgs;
import com.example.WGR_hibernate6.model.smgsfiles.CimSmgsFileInf;
import com.example.WGR_hibernate6.model.smgsinvoice.CimSmgsInvoice;
import jakarta.persistence.*;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;


@Entity
@Table(name = "pack_doc")
public class PackDoc implements Serializable {

    @Id
    @org.hibernate.annotations.GenericGenerator(
            name = "ID_GENERATOR_PACK",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "PACK_HID"),
                    @Parameter(name = "initial_value", value = "1")
            }
    )
    private Long hid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_ROUTE")
    private Route route;
    private String tbc_nomer;
    private String un;
    private String unDecl;
    private Date dattr;
    private String userFlag;
    private String userFlag2;
    private boolean deleted = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trans")
    private UsrGroupsDir usrGroupsDir;

    @OneToMany(mappedBy = "packDoc")
    private Set<Status> statuses = new HashSet<>(0);
    //	private Set<Poezd> poezds = new HashSet<Poezd>();
//	private Set<Avto> avtos = new HashSet<Avto>();
//	private Set<AvtoZayav> avtoZayavs = new HashSet<>();
//	private Set<PoezdZayav> zayavs = new HashSet<>();
    @OneToMany(mappedBy = "packDoc")
    private Set<CimSmgs> cimSmgses = new HashSet<>(0);

    @OneToMany(mappedBy = "packDoc")
    private Set<CimSmgsInvoice> csInvoices = new HashSet<>(0);

    @OneToMany(mappedBy = "packDoc")
    private Set<CimSmgsFileInf> cimSmgsFileInfs = new HashSet<>(0);
//    private Set<AltaPack> altaPacks = new HashSet<>(0);
//
//    public Set<AltaPack> getAltaPacks() {
//        return altaPacks;
//    }

    public String getUnDecl() {
        return unDecl;
    }

    public void setUnDecl(String unDecl) {
        this.unDecl = unDecl;
    }

    public String getUserFlag2() {
        return userFlag2;
    }

    public void setUserFlag2(String userFlag2) {
        this.userFlag2 = userFlag2;
    }

    public String getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(String userFlag) {
        this.userFlag = userFlag;
    }

    public void setUserFlag(UserFlag userFlag) {
        this.userFlag = userFlag.getVal();
    }

//    public Set<Poezd> getPoezds() {
//		return poezds;
//	}
//
//	public void setPoezds(Set<Poezd> poezds) {
//		this.poezds = poezds;
//	}
//
//    public Set<AvtoZayav> getAvtoZayavs() {
//        return avtoZayavs;
//    }
//
//    public void setAvtoZayavs(Set<AvtoZayav> avtoZayavs) {
//        this.avtoZayavs = avtoZayavs;
//    }
//
//    public Set<Avto> getAvtos() {
//		return avtos;
//	}
//
//	public void setAvtos(Set<Avto> avtos) {
//		this.avtos = avtos;
//	}

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


    public PackDoc(Route route, UsrGroupsDir group) {
        this.route = route;
        this.usrGroupsDir = group;
    }

    public Set<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(Set<Status> statuses) {
        this.statuses = statuses;
    }

    public Date getDattr() {
        return dattr;
    }

    public void setDattr(Date dattr) {
        this.dattr = dattr;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getTbc_nomer() {
        return tbc_nomer;
    }

    public void setTbc_nomer(String tbc_nomer) {
        this.tbc_nomer = tbc_nomer;
    }

    public Set<CimSmgsFileInf> getCimSmgsFileInfs() {
        return cimSmgsFileInfs;
    }

    public void setCimSmgsFileInfs(Set<CimSmgsFileInf> cimSmgsFileInfs) {
        this.cimSmgsFileInfs = cimSmgsFileInfs;
    }


    public UsrGroupsDir getUsrGroupsDir() {
        return usrGroupsDir;
    }

    public void setUsrGroupsDir(UsrGroupsDir usrGroupsDir) {
        this.usrGroupsDir = usrGroupsDir;
    }

    public PackDoc() {
    }

    public PackDoc(Long hid) {
        this.hid = hid;
    }

    public PackDoc(Long hid, Route route, Set cimSmgses, Set cimSmgsScans, Set csInvoices) {
        this.hid = hid;
        this.route = route;
//        this.cimSmgses = cimSmgses;
//        this.cimSmgsScans = cimSmgsScans;
        this.csInvoices = csInvoices;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public Route getRoute() {
        return this.route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

        public Set<CimSmgs> getCimSmgses() {
        return this.cimSmgses;
    }

    public void setCimSmgses(Set<CimSmgs> cimSmgses) {
        this.cimSmgses = cimSmgses;
    }

    public Set<CimSmgsInvoice> getCsInvoices() {
        return this.csInvoices;
    }

    public void setCsInvoices(Set<CimSmgsInvoice> csInvoices) {
        this.csInvoices = csInvoices;
    }
//
//    public void addCimSmgsItem(CimSmgs cs) {
//        if (cs != null) {
//            cs.setPackDoc(this);
//            cimSmgses.add(cs);
//        }
//    }
//
//    public boolean hasEpd() {
//        return findDocByFieldValue(CimSmgs.DOC_TYPE_HID_PROP_NAME, CimSmgs.EPD_DOC_TYPE_HID) != null;
//    }
//
//    public CimSmgs findDocByFieldValue(String field, Object value) {
//        return hasDocs() ? (CimSmgs) Constants.findObjectByFieldValue(getCimSmgses(), field, value) : null;
//    }

    public void addInvoiceItem(CimSmgsInvoice invoice) {
        if (invoice != null) {
            invoice.setPackDoc(this);
            csInvoices.add(invoice);
        }
    }
//
//    public void addFileInfItem(CimSmgsFileInf fInf) {
//        if (fInf != null) {
//            fInf.setPackDoc(this);
//            cimSmgsFileInfs.add(fInf);
//        }
//    }
//
//    public void addAltaPackItem(AltaPack ap) {
//        if (ap != null) {
//            ap.setPackDoc(this);
//            altaPacks.add(ap);
//        }
//    }

//    public boolean hasDocs() {
//        return getCimSmgses()!=null&&getCimSmgses().size()>0;
//    }
//
//	public void addAvtoItem(Avto avto) {
//		if (avto != null) {
//			avto.setPackDoc(this);
//			getAvtos().add(avto);
//		}
//	}
//	public void addAvtoZayavItem(AvtoZayav avtoZayav) {
//		if (avtoZayav != null) {
//            avtoZayav.setPackDoc(this);
//			getAvtoZayavs().add(avtoZayav);
//		}
//	}
//    public void addZayavItem(PoezdZayav zayav) {
//        if (zayav != null) {
//            zayav.setPackDoc(this);
//            getZayavs().add(zayav);
//        }
//    }
//	public void addPoezdItem(Poezd poezd) {
//		if (poezd != null) {
//			poezd.setPackDoc(this);
//			getPoezds().add(poezd);
//		}
//	}

    public Byte getMaxPriorityStatus() {
        Set<Status> statusesWithPriority = this.getStatuses().stream()
                .filter(status -> status.getStatusDir().getPriority() != null).collect(Collectors.toSet());
        return statusesWithPriority.isEmpty() ? -1 : statusesWithPriority.stream().max(Comparator.comparing(status -> status.getStatusDir().getPriority())).get().getStatusDir().getPriority();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackDoc packDoc = (PackDoc) o;
        return Objects.equals(hid, packDoc.hid) &&
                Objects.equals(route != null ? route.getHid() : "", packDoc.route != null ? packDoc.route.getHid() : "") &&
                Objects.equals(usrGroupsDir != null ? usrGroupsDir.getName() : "", packDoc.usrGroupsDir != null ? packDoc.usrGroupsDir.getName() : "") &&
                Objects.equals(tbc_nomer, packDoc.tbc_nomer) &&
                Objects.equals(un, packDoc.un);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, route != null ? route.getHid() : "", usrGroupsDir != null ? usrGroupsDir.getName() : "", tbc_nomer, un);
    }

//    public Set<PoezdZayav> getZayavs() {
//        return zayavs;
//    }
//
//    public void setZayavs(Set<PoezdZayav> poezdZayavs) {
//        this.zayavs = poezdZayavs;
//    }
}
