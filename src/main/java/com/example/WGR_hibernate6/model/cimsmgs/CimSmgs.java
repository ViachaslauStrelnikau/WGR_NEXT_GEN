package com.example.WGR_hibernate6.model.cimsmgs;

import com.example.WGR_hibernate6.model.ECP;
import com.example.WGR_hibernate6.model.PackDoc;
import com.example.WGR_hibernate6.model.Route;
import com.example.WGR_hibernate6.model.Status;
import com.example.WGR_hibernate6.model.biftmin.BIftminLog;
import com.example.WGR_hibernate6.model.boardtalk.BoardTalkNewMess;
import com.example.WGR_hibernate6.model.cimsmgs.cscomnt.CsComnt;
import com.example.WGR_hibernate6.model.tbctdg.Tbc2Log;
import com.example.WGR_hibernate6.model.tbctdg.TdgLog;
import jakarta.persistence.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;


@Entity
@Table(name = "cim_smgs")
public class CimSmgs implements Serializable {

    @Id
    @org.hibernate.annotations.GenericGenerator(
            name = "ID_GENERATOR_CIMSMGS",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @Parameter(name = "sequence_name", value = "CIMSMGS_HID"),
                    @Parameter(name = "initial_value", value = "1")
            }
    )
    private Long hid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_CS")
    private CimSmgs cimSmgs;
    @Column(name = "G_1")
    @Length(max = 512)
    private String g1;
    @Column(name = "G_2")
    @Length(max = 32)
    private String g2;
    @Column(name = "G_3")
    @Length(max = 32)
    private String g3;
    @Column(name = "G_4")
    @Length(max = 512)
    private String g4;
    @Column(name = "G_5")
    @Length(max = 32)
    private String g5;
    @Column(name = "G_6")
    @Length(max = 32)
    private String g6;
    @Column(name = "G_7")
    @Length(max = 512)
    private String g7;
    @Column(name = "G_8")
    @Length(max = 64)
    private String g8;
    @Column(name = "G_9")
    @Length(max = 512)
    private String g9;
    @Column(name = "G_10")
    @Length(max = 240)
    private String g10;
    @Column(name = "G_11")
    @Length(max = 40)
    private String g11;
    @Column(name = "G_12")
    @Length(max = 2)
    private String g12;
    @Column(name = "G_12")
    @Length(max = 240)
    private String g13;
    @Column(name = "G_14_1")
    @Length(max = 1024)
    private String g141;
    @Column(name = "G_14_2")
    @Length(max = 32)
    private String g142;
    @Column(name = "G_15")
    @Length(max = 512)
    private String g15;
    @Column(name = "G_16")
    @Length(max = 128)
    private String g16;
    @Column(name = "G_16_1")
    @Length(max = 8)
    private String g161;
    @Column(name = "G_17")
    @Length(max = 40)
    private String g17;
    @Column(name = "G_18")
    @Length(max = 512)
    private String g18;
    @Column(name = "G_18_1")
    @Length(max = 10)
    private String g181;
    @Column(name = "G_19")
    @Length(max = 32)
    private String g19;
    @Column(name = "G_20")
    @Length(max = 4000)
    private String g20;
    @Column(name = "G_21")
    @Max(9)
    private Byte g21;
    @Column(name = "G_22")
    @Max(9)
    private Byte g22;
    @Column(name = "G_23")
    @Length(max = 80)
    private String g23;
    @Column(name = "G_24")
    @Length(max = 80)
    private String g24;
    @Column(name = "G_25")
    @Max(9)
    private Byte g25;
    @Column(name = "G_26")
    @Length(max = 4096)
    private String g26;
    @Column(name = "G_27")
    @Length(max = 64)
    private String g27;
    @Column(name = "G_28")
    @Length(max = 240)
    private String g28;
    @Column(name = "G_28_1")
    private Date g281;
    @Column(name = "G_29")
    @Length(max = 128)
    private String g29;
    @Column(name = "G_30")
    @Length(max = 64)
    private String g30;
    @Column(name = "G_30_1")
    private Date g301;
    @Column(name = "ARCH")
    private Date arch;
    @Column(name = "un")
    @Length(max = 20)
    private String un;
    @Column(name = "trans")
    @Length(max = 20)
    private String trans;
    @CreationTimestamp
    private Date dattr;
    @Column(name = "LOCKED")
    private Date locked;
    @Column(name = "un_lock")
    @Length(max = 20)
    private String unLock;
    @Column(name = "G_40")
    @Length(max = 6)
    private String g40;
    @Column(name = "G_44")
    @Length(max = 6)
    private String g44;
    @Column(name = "G_19_1")
    @Length(max = 128)
    private String g191;
    @Column(name = "G_19_2")
    @Length(max = 5)
    private String g192;
    @Column(name = "G_19_3")
    @Length(max = 16)
    private String g193;
    @Column(name = "G_48")
    @Length(max = 16)
    private String g48;
    @Column(name = "G_41")
    @Length(max = 4)
    private String g41;
    @Column(name = "G_45")
    @Length(max = 4)
    private String g45;
    @Column(name = "GA_49_1")
    @Length(max = 2)
    private String ga491;
    @Column(name = "GB_49_1")
    @Length(max = 2)
    private String gb491;
    @Column(name = "GA_49_2")
    @Length(max = 2)
    private String ga492;
    @Column(name = "GB_49_2")
    @Length(max = 2)
    private String gb492;
    @Column(name = "GA_49_3")
    @Length(max = 6)
    private String ga493;
    @Column(name = "GB_49_3")
    @Length(max = 6)
    private String gb493;
    @Column(name = "GA_49_4")
    @Length(max = 6)
    private String ga494;
    @Column(name = "GB_49_4")
    @Length(max = 6)
    private String gb494;
    @Column(name = "GA_50")
    @Length(max = 3)
    private String ga50;
    @Column(name = "GB_50")
    @Length(max = 3)
    private String gb50;
    @Column(name = "GA_52")
    @Length(max = 3)
    private String ga52;
    @Column(name = "GB_52")
    @Length(max = 3)
    private String gb52;
    @Column(name = "GA_51")
    @Length(max = 6)
    private String ga51;
    @Column(name = "GB_51")
    @Length(max = 6)
    private String gb51;
    @Column(name = "GA_53")
    @Length(max = 6)
    private String ga53;
    @Column(name = "GB_53")
    @Length(max = 6)
    private String gb53;
    @Column(name = "GA_54")
    @Length(max = 7)
    private String ga54;
    @Column(name = "GB_54")
    @Length(max = 7)
    private String gb54;
    @Column(name = "GA_55")
    @Length(max = 4)
    private String ga55;
    @Column(name = "GB_55")
    @Length(max = 4)
    private String gb55;
    @Column(name = "GA_56")
    @Length(max = 4)
    private String ga56;
    @Column(name = "GB_56")
    @Length(max = 4)
    private String gb56;
    @Column(name = "GA_57")
    @Length(max = 4)
    private String ga57;
    @Column(name = "GB_57")
    @Length(max = 4)
    private String gb57;
    @Column(name = "G_59_1")
    @Length(max = 2)
    private String g591;
    @Column(name = "G_59_2")
    @Length(max = 2)
    private String g592;
    @Column(name = "G_59_3")
    @Length(max = 2)
    private String g593;
    @Column(name = "G_59_4")
    @Length(max = 2)
    private String g594;
    @Column(name = "G_59_5")
    @Length(max = 2)
    private String g595;
    @Column(name = "G_59_6")
    @Length(max = 2)
    private String g596;
    @Column(name = "G_59_7")
    @Length(max = 2)
    private String g597;
    @Column(name = "G_59_8")
    @Length(max = 6)
    private String g598;
    @Column(name = "G_60")
    @Length(max = 240)
    private String g60;
    @Column(name = "G_61")
    @Length(max = 80)
    private String g61;
    @Column(name = "G_61_1")
    @Length(max = 2)
    private String g611;
    @Column(name = "G_61_2")
    @Length(max = 6)
    private String g612;
    @Column(name = "G_43")
    @Length(max = 4)
    private String g43;
    @Column(name = "G_47")
    @Length(max = 4)
    private String g47;
    @Column(name = "G_63")
    @Length(max = 180)
    private String g63;
    @Column(name = "G_64")
    @Length(max = 160)
    private String g64;
    @Column(name = "G_65")
    @Length(max = 200)
    private String g65;
    @Column(name = "G_65_1")
    @Length(max = 160)
    private String g651;
    @Column(name = "G_65_2")
    @Length(max = 30)
    private String g652;
    @Column(name = "GA_66")
    @Length(max = 500)
    private String ga66;
    @Column(name = "GB_66_1")
    @Max(9)
    private Byte gb661;
    @Column(name = "GB_66_2")
    @Length(max = 4)
    private String gb662;
    @Column(name = "G_67")
    private Date g67;
    @Column(name = "G_69_1")
    @Length(max = 2)
    private String g691;
    @Column(name = "G_69_2")
    @Length(max = 6)
    private String g692;
    @Column(name = "G_69_3")
    @Length(max = 4)
    private String g693;
    @Column(name = "G_69_4")
    @Length(max = 50)
    private String g694;
    @Column(name = "G_68")
    @Length(max = 6)
    private String g68;
    @Column(name = "G_62")
    @Length(max = 16)
    private String g62;
    @Column(name = "G_62_1")
    @Length(max = 4)
    private String g621;
    @Column(name = "G_62_2")
    @Length(max = 4)
    private String g622;
    @Column(name = "G_38")
    @Length(max = 10)
    private String g38;
    @Column(name = "G_39")
    @Length(max = 50)
    private String g39;
    @Column(name = "G_18_B1")
    @Length(max = 4)
    private String g18B1;
    @Column(name = "G_18_B2")
    @Length(max = 4)
    private String g18B2;
    @Column(name = "GA_58_1")
    @Length(max = 2)
    private String ga581;
    @Column(name = "GB_58_1")
    @Length(max = 2)
    private String gb581;
    @Column(name = "GA_58_2")
    @Length(max = 8)
    private String ga582;
    @Column(name = "GB_58_2")
    @Length(max = 8)
    private String gb582;
    @Column(name = "GA_58_3")
    @Length(max = 2)
    private String ga583;
    @Column(name = "GB_58_3")
    @Length(max = 2)
    private String gb583;
    @Column(name = "GA_58_4")
    @Length(max = 8)
    private String ga584;
    @Column(name = "GB_58_4")
    @Length(max = 8)
    private String gb584;
    @Column(name = "GA_58_5")
    @Length(max = 2)
    private String ga585;
    @Column(name = "GB_58_5")
    @Length(max = 2)
    private String gb585;
    @Column(name = "GA_58_6")
    @Length(max = 8)
    private String ga586;
    @Column(name = "GB_58_6")
    @Length(max = 2)
    private String gb586;
    @Column(name = "G_20_100")
    @Length(max = 100)
    private String g20100;
    @Column(name = "G_42")
    @Length(max = 4)
    private String g42;
    @Column(name = "G_46")
    @Length(max = 4)
    private String g46;
    @Column(name = "G_1_1")
    @Length(max = 80)
    private String g11_1;
    @Column(name = "G_1_2")
    @Length(max = 60)
    private String g12_1;
    @Column(name = "G_1_3")
    @Length(max = 60)
    private String g13_1;
    @Column(name = "G_4_1")
    @Length(max = 80)
    private String g41_1;
    @Column(name = "G_4_2")
    @Length(max = 60)
    private String g42_1;
    @Column(name = "G_4_3")
    @Length(max = 60)
    private String g43_1;
    @Column(name = "HID_CIM")
    private BigDecimal hidCim;
    @Column(name = "HID_ICF")
    private BigDecimal hidIcf;
    @Column(name = "HID_SP")
    private BigDecimal hidSp;
    @Column(name = "HID_SMGS")
    private Long hidSmgs;
    @Column(name = "HID_CS_GRAPH")
    private Long hidCsGraph;
    @Column(name = "IFTMIN_ID")
    private Long iftminId;
    @Column(name = "IFTMIN_OUT")
    private Date iftminOut;
    @Column(name = "IFTMIN_IN")
    private Date iftminIn;
    @Column(name = "IFTMIN_ID_2")
    private Long iftminId2;
    @Column(name = "IFTMIN_OUT_2")
    private Date iftminOut2;
    @Column(name = "IFTMIN_IN_2")
    private Date iftminIn2;
    @Column(name = "G_12_1")
    @Length(max = 6)
    private String g121;
    @Column(name = "G_24_N")
    private BigDecimal g24N;
    @Column(name = "G_24_T")
    private BigDecimal g24T;
    @Column(name = "G_24_B")
    private BigDecimal g24B;
    @Column(name = "STATUS_BR")
    @Length(max = 1)
    private String statusBr;
    @UpdateTimestamp
    private Date altered;
    @Column(name = "G_1R")
    @Length(max = 512)
    private String g1r;
    @Column(name = "G_1_4")
    @Length(max = 64)
    private String g14;
    @Column(name = "G_4R")
    @Length(max = 512)
    private String g4r;
    @Column(name = "G_7R")
    @Length(max = 512)
    private String g7r;
    @Column(name = "G_9R")
    @Length(max = 512)
    private String g9r;
    @Column(name = "G_10_1")
    @Length(max = 80)
    private String g101;
    @Column(name = "G_10_1R")
    @Length(max = 80)
    private String g101r;
    @Column(name = "G_10_2")
    @Length(max = 64)
    private String g102;
    @Column(name = "G_10_2R")
    @Length(max = 64)
    private String g102r;
    @Column(name = "G_13R")
    @Length(max = 240)
    private String g13r;
    @Column(name = "G_15R")
    @Length(max = 512)
    private String g15r;
    @Column(name = "G_16_2")
    @Length(max = 80)
    private String g162;
    @Column(name = "G_16_2R")
    @Length(max = 80)
    private String g162r;
    @Column(name = "G_16_3")
    @Length(max = 64)
    private String g163;
    @Column(name = "G_16_3R")
    @Length(max = 64)
    private String g163r;
    @Column(name = "G_18R")
    @Length(max = 512)
    private String g18r;
    @Column(name = "G_29R")
    @Length(max = 128)
    private String g29r;
    @Column(name = "PROFILE")
    @Length(max = 250)
    private String profile;
    @Column(name = "TARG_GR")
    @Length(max = 64)
    private String targGr;
    @Column(name = "AV_FIELDS")
    @Length(max = 128)
    private String avFields;
    @Column(name = "G_1C")
    @Max(1)
    private Byte g1c;
    @Column(name = "G_4C")
    @Max(1)
    private Byte g4c;
    @Column(name = "G_7C")
    @Max(1)
    private Byte g7c;
    @Column(name = "G_9C")
    @Max(1)
    private Byte g9c;
    @Column(name = "G_13C")
    @Max(1)
    private Byte g13c;
    @Column(name = "G_15C")
    @Max(1)
    private Byte g15c;
    @Column(name = "G_18C")
    @Max(1)
    private Byte g18c;
    @Column(name = "G_19C")
    @Max(1)
    private Byte g19c;
    @Column(name = "G_20C")
    @Max(1)
    private Byte g20c;
    @Column(name = "NUM_CLAIM")
    @Length(max = 48)
    private String numClaim;
    @Column(name = "G_1_5")
    @Length(max = 3)
    private String g15_1;
    @Column(name = "G_1_6")
    @Length(max = 32)
    private String g16_1;
    @Column(name = "G_1_6R")
    @Length(max = 550)
    private String g16r;
    @Column(name = "G_1_7")
    @Length(max = 10)
    private String g17_1;
    @Column(name = "G_1_8")
    @Length(max = 32)
    private String g18_1;
    @Column(name = "G_1_8R")
    @Length(max = 32)
    private String g18r_1;
    @Column(name = "G_1_9")
    @Length(max = 128)
    private String g19_1;
    @Column(name = "G_1_9R")
    @Length(max = 250)
    private String g19r;
    @Column(name = "G_4_5")
    @Length(max = 3)
    private String g45_1;
    @Column(name = "G_4_6")
    @Length(max = 32)
    private String g46_1;
    @Column(name = "G_4_6R")
    @Length(max = 550)
    private String g46r;
    @Column(name = "G_4_7")
    @Length(max = 10)
    private String g47_1;
    @Column(name = "G_4_8")
    @Length(max = 32)
    private String g48_1;
    @Column(name = "G_4_8R")
    @Length(max = 32)
    private String g48r;
    @Column(name = "G_4_9")
    @Length(max = 128)
    private String g49;
    @Column(name = "G_4_9R")
    @Length(max = 250)
    private String g49r;
    @Column(name = "G_20_1")
    @Length(max = 160)
    private String g201;
    @Column(name = "G_20_2")
    @Length(max = 160)
    private String g202;
    @Column(name = "G_20_2R")
    @Length(max = 160)
    private String g202r;
    @Column(name = "G_20_3")
    @Length(max = 64)
    private String g203;
    @Column(name = "G_20_4")
    @Length(max = 128)
    private String g204;
    @Column(name = "G_20_5")
    @Length(max = 160)
    private String g205;
    @Column(name = "G_20_6")
    @Length(max = 512)
    private String g206;
    @Column(name = "G_20_6R")
    @Length(max = 512)
    private String g206r;
    @Column(name = "G_20_7")
    @Length(max = 250)
    private String g207;
    @Column(name = "G_20_7R")
    @Length(max = 250)
    private String g207r;
    @Column(name = "G_20_8")
    @Length(max = 128)
    private String g208;
    @Column(name = "G_20_9")
    @Length(max = 160)
    private String g209;
    @Column(name = "G_20_9R")
    @Length(max = 160)
    private String g209r;
    @Column(name = "G_20_10")
    @Length(max = 64)
    private String g2010;
    @Column(name = "G_20_11")
    @Length(max = 250)
    private String g2011;
    @Column(name = "G_20_12")
    @Length(max = 160)
    private String g2012;
    @Column(name = "G_20_13")
    @Length(max = 160)
    private String g2013;
    @Column(name = "G_20_14")
    @Length(max = 160)
    private String g2014;
    @Column(name = "G_20_14R")
    @Length(max = 160)
    private String g2014r;
    @Column(name = "G_20_15")
    @Length(max = 128)
    private String g2015;
    @Column(name = "G_20_16")
    @Length(max = 128)
    private String g2016;
    @Column(name = "G_20_17")
    @Length(max = 250)
    private String g2017;
    @Column(name = "G_20_17R")
    @Length(max = 64)
    private String g2017r;
    @Column(name = "G_20_11R")
    @Length(max = 250)
    private String g2011r;
    @Column(name = "G_1_10")
    @Length(max = 16)
    private String g110;
    @Column(name = "G_1_11")
    @Length(max = 32)
    private String g111;
    @Column(name = "G_1_12")
    @Length(max = 16)
    private String g112;
    @Column(name = "G_4_10")
    @Length(max = 16)
    private String g410;
    @Column(name = "G_4_11")
    @Length(max = 32)
    private String g411;
    @Column(name = "G_4_12")
    @Length(max = 16)
    private String g412;
    @Column(name = "READY")
    @Length(max = 1)
    private String ready;
    @Column(name = "G_17_1")
    @Length(max = 2)
    private String g171;
    @Column(name = "G_20_18")
    @Length(max = 64)
    private String g2018;
    @Column(name = "G_20_18R")
    @Length(max = 64)
    private String g2018r;
    @Column(name = "G_10_3r")
    @Length(max = 3)
    private String g_10_3r;
    @Column(name = "G_16_33r")
    @Length(max = 3)
    private String g_16_33r;
    @Column(name = "G_1_DOP_INFO")
    @Length(max = 512)
    private String g1_dop_info;
    @Column(name = "G_4_DOP_INFO")
    @Length(max = 512)
    private String g4_dop_info;
    @Column(name = "G_16_DOP_INFO")
    @Length(max = 100)
    private String g16_dop_info;
    @Column(name = "G_101")
    @Length(max = 500)
    private String g_101;
    @Column(name = "G_4_4")
    @Length(max = 64)
    private String g44_1;
    @Column(name = "STATUS")
    @Max(1)
    private Byte status;
    @Column(name = "BTLC_STATUS")
    @Max(99)
    private Byte btlc_status;
    @Column(name = "TDG_STATUS_1")
    @Max(99)
    private Byte tdg_status1;
    @Column(name = "TDG_STATUS_2")
    @Max(99)
    private Byte tdg_status2;
    @Column(name = "GR_STATUS")
    @Max(99)
    private Byte greenRail_status;
    @Column(name = "ZAYAV_OTPR")
    @Length(max = 2048)
    private String zayav_otpr;
    @Column(name = "ZAYAV_OTPR_C")
    @Max(9)
    private Byte zayav_otpr_c;
    @Column(name = "G_14_1_C")
    @Max(1)
    private Byte g141c;
    @Column(name = "G_26_C")
    @Max(1)
    private Byte g26c;
    @Column(name = "GA_66_1")
    @Length(max = 48)
    private String ga661;
    @Column(name = "GA_66_2")
    @Length(max = 48)
    private String ga662;
    @Column(name = "G_23_B")
    @Length(max = 20)
    private String g23b;
    @Column(name = "G_74_1")
    @Length(max = 2)
    private String g74_1;
    @Column(name = "G_74_2")
    @Length(max = 10)
    private String g74_2;
    @Column(name = "TYPE")
    @Max(99)
    private Byte type;
    @Column(name = "GS_48")
    @Length(max = 50)
    private String gs_48;
    @Column(name = "WDEFNC")
    @Length(max = 2)
    private String wdefnc;
    @Column(name = "GS_22")
    @Max(9)
    private Byte gs_22;
    @Column(name = "GS_24")
    @Length(max = 250)
    private String gs_24;
    @Column(name = "GS_141_1")
    @Length(max = 16)
    private String gs_141_1;
    @Column(name = "GS_141_2")
    private Date gs_141_2;
    @Column(name = "GS_66_1")
    @Length(max = 30)
    private String gs_66_1;
    @Column(name = "G_18_B1A")
    @Length(max = 4)
    private String g18B1a;
    @Column(name = "G_18_B1B")
    @Length(max = 4)
    private String g18B1b;
    @Column(name = "G_18_B1C")
    @Length(max = 4)
    private String g18B1c;
    @Column(name = "G_18_B1D")
    @Length(max = 4)
    private String g18B1d;
    @Column(name = "AMOUNT")
    private Long amount;
    @Column(name = "AVISO_NUM")
    @Length(max = 20)
    private String aviso_num;
    @Column(name = "AVISO_DAT")
    private Date aviso_dat;
    @Column(name = "AVISO_COD_DAT")
    private Date aviso_cod_dat;
    @Column(name = "AVISO_STAVKA")
    private BigDecimal aviso_stavka;
    @Column(name = "G11_PRIM")
    @Length(max = 2048)
    private String g11_prim;
    @Column(name = "G_1_5K")
    @Length(max = 3)
    private String g_1_5k;
    @Column(name = "G_4_5K")
    @Length(max = 3)
    private String g_4_5k;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_ROUTE")
    private Route route;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_PACK")
    private PackDoc packDoc;
    @Column(name = "G_4_PRIM")
    @Length(max = 250)
    private String g4prim;
    @Column(name = "GU_INF")
    @Length(max = 250)
    private String guInf;
    @Column(name = "PEREVOZCHIK")
    @Length(max = 250)
    private String perevozchik;
    @Column(name = "TARIF_SHEMA")
    @Length(max = 50)
    private String tarifShema;
    @Column(name = "TARIF_V_OTPR")
    @Length(max = 50)
    private String tarifVOtpr;
    @Column(name = "platezh_Km")
    private Long platezhKm;
    @Column(name = "platezh_Rub")
    private Long platezhRub;
    @Column(name = "platezh_Kop")
    @Length(max = 2)
    private String platezhKop;
    @Column(name = "provoz_Plata")
    @Length(max = 12)
    private String provozPlata;
    @Column(name = "zpu_Info")
    @Length(max = 50)
    private String zpuInfo;
    @Column(name = "TRUE_INFO")
    @Length(max = 250)
    private String trueInfo;
    @Column(name = "VIZA_NO")
    @Length(max = 50)
    private String vizaNo;
    @Column(name = "VIZA_NO")
    @Length(max = 50)
    private String perevozSign;
    @Column(name = "PEREVOZ_DATE")
    private Date perevozDate;
    @Column(name = "SBOR_CENNOST1")
    @Length(max = 12)
    private String sborCennost1;
    @Column(name = "SBOR_CENNOST2")
    @Length(max = 12)
    private String sborCennost2;
    @Column(name = "OTPR_ITOGO")
    @Length(max = 12)
    private String otprItogo;
    @Column(name = "TBC_NOMER")
    @Length(max = 20)
    private String tbcNomer;
    @Column(name = "TBC_STATUS")
    @Max(9)
    private Byte tbcStatus = (byte) 0;
    @Column(name = "ZAKAZ_NO")
    @Length(max = 20)
    private String zakazNo;
    @Column(name = "CIM")
    @Max(9)
    private Byte cim;
    @Column(name = "CIM_2")
    @Max(9)
    private Byte cim2;
    @Column(name = "incoterms")
    @Max(9)
    private Byte incoterms;
    @Column(name = "kod_Usl_Post")
    @Length(max = 3)
    private String kodUslPost;
    @Column(name = "frankofracht")
    @Max(9)
    private Byte frankofracht;
    @Column(name = "OTM_POLUCH")
    @Length(max = 250)
    private String otmPoluch;
    @Column(name = "VID_KONT_OTPR")
    @Max(9)
    private Byte vidKontOtpr;
    @Column(name = "PLATFORM")
    @Length(max = 100)
    private String platform;
    @Column(name = "DOC_NUM")
    @Length(max = 100)
    private String docNum;
    @Column(name = "teh_Usl_G12")
    @Length(max = 100)
    private String tehUslG12;
    @Column(name = "gr_Otp_Fio")
    @Length(max = 100)
    private String grOtpFio;
    @Column(name = "G_10_4")
    @Length(max = 64)
    private String g104;
    private String g164;
    private String npoezd;
    private String vagPrim;
    private String nettoPref;
    private String taraPref;
    private String bruttoPref;
    private String kontKol;
    private String g2_1;
    private String g5_1;
    private BigDecimal docType1;
    private String plat;
    private String plat1;
    private Byte gu;
    private String sborCennost11;
    private String sborCennost21;
    private String sborCennost22;
    private String ftsNomer;
    private Byte ftsStatus = (byte) 0;
    private String zpuInfo1;
    private String index_p;
    private String n_ppv;
    private Integer nppr;
    private Date dprb;
    private String g_2inn;
    private String g_5inn;
    @Column(name = "fts_docid")
    @Length(max = 36)
    private String ftsDocId;
    private String g_24_bcn;
    private String g36;
    private String g25Txt;
    private String g2_;
    private String g5_;
    private String n_packet;
    private String g7_;
    private String g3_;
    private Integer sort;
    private Integer kind;
    private String send_br;
    private Character src;
    private Long messCount;
    private long newMessCount;
    private String btsNomer;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOC_HID")
    private Set<BoardTalkNewMess> boardTalkNewMesses = new TreeSet<>();
    @OneToMany(mappedBy = "cimSmgs", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @MapKeyColumn(name = "SORT")
    @OrderBy
    @SQLRestriction(" FIELD_NUM = '13.6'")
    @BatchSize(size = 50)
    private Map<Integer, CimSmgsDocs> cimSmgsDocses136 = new TreeMap<>();

    @OneToMany(mappedBy = "cimSmgs",fetch = FetchType.LAZY)
    @OrderBy("dattr desc")
    @SQLRestriction("MES_NAME = 'IFTMIN' AND SRC = 'CIMSMGS' AND upper(DIR) = upper('btlc')")
    @BatchSize(size = 50)
    private Set<BIftminLog> iftminLogsBtlc = new HashSet<>();
    @OneToMany(mappedBy = "cimSmgs",fetch = FetchType.LAZY)
    @OrderBy("dattr desc")
    @SQLRestriction("MES_NAME = 'IFTMIN' AND SRC = 'CIMSMGS' AND upper(DIR) = upper('bch')")
    @BatchSize(size = 50)
    private Set<BIftminLog> iftminLogs = new HashSet<>();
    @OneToMany(mappedBy = "cimSmgs", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @MapKeyColumn(name = "SORT")
    @OrderBy
    @SQLRestriction("FIELD_NUM = '7'")
    @BatchSize(size = 50)
    private Map<Integer, CimSmgsDocs> cimSmgsDocses7 = new TreeMap<>();
    @OneToMany(mappedBy = "cimSmgs", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @MapKeyColumn(name = "SORT")
    @OrderBy
    @SQLRestriction("FIELD_NUM = '9'")
    @BatchSize(size = 50)
    private Map<Integer, CimSmgsDocs> cimSmgsDocses9 = new TreeMap<>();
    @OneToMany(mappedBy = "cimSmgs", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @MapKeyColumn(name = "SORT")
    @OrderBy
    @SQLRestriction("FIELD_NUM = '13'")
    @BatchSize(size = 50)
    private Map<Integer, CimSmgsDocs> cimSmgsDocses13 = new TreeMap<>();
    @OneToMany(mappedBy = "cimSmgs", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @MapKeyColumn(name = "SORT")
    @OrderBy
    @BatchSize(size = 50)
    private Map<Byte, CimSmgsCarList> cimSmgsCarLists = new TreeMap<>();
    @OneToMany(mappedBy = "cimSmgs", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @MapKeyColumn(name = "SORT")
    @OrderBy
    @BatchSize(size = 50)
    private Map<Byte, CimSmgsPlatel> cimSmgsPlatels = new TreeMap<>();
    @OneToMany(mappedBy = "cimSmgs", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @MapKeyColumn(name = "SORT")
    @OrderBy
    @BatchSize(size = 50)
    private Map<Short, CimSmgsPlomb> cimSmgsPlombs = new TreeMap<>();
    @OneToMany(mappedBy = "cimSmgs", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @MapKeyColumn(name = "SORT")
    @OrderBy
    @BatchSize(size = 50)
    private Map<Byte, CimSmgsPerevoz> cimSmgsPerevoz = new TreeMap<>();

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_CS")
    private Set<TdgLog> tdgLog = new HashSet<>(0);
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_SRC")
    private Set<Tbc2Log> tbc2Logs = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "REF_ID")
    private Set<CsComnt> csComnt = null;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_CS")
    private Set<CimSmgs> cimSmgses = new HashSet<>(0);
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "HID_CS")
    private Set<Status> statuses = new HashSet<>(0);
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cimSmgs")
    private Set<ECP> ecp = new HashSet<>(0);
    public Set<ECP> getEcp() {
        return ecp;
    }

    public void setEcp(Set<ECP> ecp) {
        this.ecp = ecp;
    }

    public String getBtsNomer() {
        return btsNomer;
    }

    public void setBtsNomer(String btsNomer) {
        this.btsNomer = btsNomer;
    }

    public Set<BoardTalkNewMess> getBoardTalkNewMesses() {
        return boardTalkNewMesses;
    }

    public void setBoardTalkNewMesses(Set<BoardTalkNewMess> boardTalkNewMesses) {
        this.boardTalkNewMesses = boardTalkNewMesses;
    }

    public String getG_101() {
        return g_101;
    }

    public void setG_101(String g_101) {
        this.g_101 = g_101;
    }

    public long getNewMessCount() {
        return newMessCount;
    }

    public void setNewMessCount(long newMessCount) {
        this.newMessCount = newMessCount;
    }

    public Long getMessCount() {
        return messCount;
    }

    public void setMessCount(Long messCount) {
        this.messCount = messCount;
    }

    public String getGa662() {
        return ga662;
    }

    public void setGa662(String ga662) {
        this.ga662 = ga662;
    }

    public String getGa661() {
        return ga661;
    }

    public void setGa661(String ga661) {
        this.ga661 = ga661;
    }

    public Byte getG26c() {
        return g26c;
    }

    public void setG26c(Byte g26c) {
        this.g26c = g26c;
    }

    public Byte getG141c() {
        return g141c;
    }

    public void setG141c(Byte g141c) {
        this.g141c = g141c;
    }

    public Byte getZayav_otpr_c() {
        return zayav_otpr_c;
    }

    public void setZayav_otpr_c(Byte zayav_otpr_c) {
        this.zayav_otpr_c = zayav_otpr_c;
    }

    public String getZayav_otpr() {
        return zayav_otpr;
    }

    public void setZayav_otpr(String zayav_otpr) {
        this.zayav_otpr = zayav_otpr;
    }

    public Map<Byte, CimSmgsPerevoz> getCimSmgsPerevoz() {
        return cimSmgsPerevoz;
    }

    public void setCimSmgsPerevoz(Map<Byte, CimSmgsPerevoz> cimSmgsPerevoz) {
        this.cimSmgsPerevoz = cimSmgsPerevoz;
    }

    public Set<BIftminLog> getIftminLogs() {
        return iftminLogs;
    }

    public void setIftminLogs(Set<BIftminLog> iftminLogs) {
        this.iftminLogs = iftminLogs;
    }

    public Set<BIftminLog> getIftminLogsBtlc() {
        return iftminLogsBtlc;
    }

    public void setIftminLogsBtlc(Set<BIftminLog> iftminLogsBtlc) {
        this.iftminLogsBtlc = iftminLogsBtlc;
    }

    public Byte getTdg_status1() {
        return tdg_status1;
    }

    public void setTdg_status1(Byte tdg_status1) {
        this.tdg_status1 = tdg_status1;
    }

    public Byte getTdg_status2() {
        return tdg_status2;
    }

    public void setTdg_status2(Byte tdg_status2) {
        this.tdg_status2 = tdg_status2;
    }

    public Byte getBtlc_status() {
        return btlc_status;
    }

    public void setBtlc_status(Byte btlc_status) {
        this.btlc_status = btlc_status;
    }


    public Character getSrc() {
        return src;
    }

    public void setSrc(Character src) {
        this.src = src;
    }

    public String getSend_br() {
        return send_br;
    }

    public void setSend_br(String send_br) {
        this.send_br = send_br;
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getG3_() {
        return g3_;
    }

    public void setG3_(String g3_) {
        this.g3_ = g3_;
    }

    public String getG7_() {
        return g7_;
    }

    public void setG7_(String g7_) {
        this.g7_ = g7_;
    }

    public String getN_packet() {
        return n_packet;
    }

    public void setN_packet(String n_packet) {
        this.n_packet = n_packet;
    }

    public String getG5_() {
        return g5_;
    }

    public void setG5_(String g5_) {
        this.g5_ = g5_;
    }

    public String getG2_() {
        return g2_;
    }

    public void setG2_(String g2_) {
        this.g2_ = g2_;
    }

    public String getG25Txt() {
        return g25Txt;
    }

    public void setG25Txt(String g25Txt) {
        this.g25Txt = g25Txt;
    }

    public String getG36() {
        return g36;
    }

    public void setG36(String g36) {
        this.g36 = g36;
    }

    public String getG_24_bcn() {
        return g_24_bcn;
    }

    public void setG_24_bcn(String g_24_bcn) {
        this.g_24_bcn = g_24_bcn;
    }

    public Map<Integer, CimSmgsDocs> getCimSmgsDocses136() {
        return cimSmgsDocses136;
    }

    public void setCimSmgsDocses136(Map<Integer, CimSmgsDocs> cimSmgsDocses136) {
        this.cimSmgsDocses136 = cimSmgsDocses136;
    }

    public String getFtsDocId() {
        return ftsDocId;
    }

    public void setFtsDocId(String ftsDocId) {
        this.ftsDocId = ftsDocId;
    }

    public String getG_2inn() {
        return g_2inn;
    }

    public void setG_2inn(String g_2inn) {
        this.g_2inn = g_2inn;
    }

    public String getG_5inn() {
        return g_5inn;
    }

    public void setG_5inn(String g_5inn) {
        this.g_5inn = g_5inn;
    }

    public String getIndex_p() {
        return index_p;
    }

    public void setIndex_p(String index_p) {
        this.index_p = index_p;
    }

    public String getN_ppv() {
        return n_ppv;
    }

    public void setN_ppv(String n_ppv) {
        this.n_ppv = n_ppv;
    }

    public Integer getNppr() {
        return nppr;
    }

    public void setNppr(Integer nppr) {
        this.nppr = nppr;
    }

    public Date getDprb() {
        return dprb;
    }

    public void setDprb(Date dprb) {
        this.dprb = dprb;
    }

    public String getZpuInfo1() {
        return zpuInfo1;
    }

    public void setZpuInfo1(String zpuInfo1) {
        this.zpuInfo1 = zpuInfo1;
    }

    public String getSborCennost22() {
        return sborCennost22;
    }

    public void setSborCennost22(String sborCennost22) {
        this.sborCennost22 = sborCennost22;
    }

    public String getSborCennost21() {
        return sborCennost21;
    }

    public void setSborCennost21(String sborCennost21) {
        this.sborCennost21 = sborCennost21;
    }

    public String getSborCennost11() {
        return sborCennost11;
    }

    public void setSborCennost11(String sborCennost11) {
        this.sborCennost11 = sborCennost11;
    }

    public Byte getGu() {
        return gu;
    }

    public void setGu(Byte gu) {
        this.gu = gu;
    }

    public String getPlat1() {
        return plat1;
    }

    public void setPlat1(String plat1) {
        this.plat1 = plat1;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public BigDecimal getDocType1() {
        return docType1;
    }

    public void setDocType1(BigDecimal docType) {
        this.docType1 = docType;
    }

    public String getG5_1() {
        return g5_1;
    }

    public void setG5_1(String g5_1) {
        this.g5_1 = g5_1;
    }

    public String getG2_1() {
        return g2_1;
    }

    public void setG2_1(String g2_1) {
        this.g2_1 = g2_1;
    }

    public String getKontKol() {
        return kontKol;
    }

    public void setKontKol(String kontKol) {
        this.kontKol = kontKol;
    }

    public String getBruttoPref() {
        return bruttoPref;
    }

    public void setBruttoPref(String bruttoPref) {
        this.bruttoPref = bruttoPref;
    }

    public String getTaraPref() {
        return taraPref;
    }

    public void setTaraPref(String taraPref) {
        this.taraPref = taraPref;
    }

    public String getNettoPref() {
        return nettoPref;
    }

    public void setNettoPref(String nettoPref) {
        this.nettoPref = nettoPref;
    }

    public String getVagPrim() {
        return vagPrim;
    }

    public void setVagPrim(String vagPrim) {
        this.vagPrim = vagPrim;
    }

    public String getNpoezd() {
        return npoezd;
    }

    public void setNpoezd(String nPoezd) {
        this.npoezd = nPoezd;
    }

    public String getG164() {
        return g164;
    }

    public void setG164(String g164) {
        this.g164 = g164;
    }

    public String getG104() {
        return g104;
    }

    public void setG104(String g104) {
        this.g104 = g104;
    }

    public String getGrOtpFio() {
        return grOtpFio;
    }

    public void setGrOtpFio(String grOtpFio) {
        this.grOtpFio = grOtpFio;
    }

    public String getTehUslG12() {
        return tehUslG12;
    }

    public void setTehUslG12(String tehUslG12) {
        this.tehUslG12 = tehUslG12;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Byte getVidKontOtpr() {
        return vidKontOtpr;
    }

    public void setVidKontOtpr(Byte vidKontOtpr) {
        this.vidKontOtpr = vidKontOtpr;
    }

    public String getOtmPoluch() {
        return otmPoluch;
    }

    public void setOtmPoluch(String otmPoluch) {
        this.otmPoluch = otmPoluch;
    }

    public Byte getFrankofracht() {
        return frankofracht;
    }

    public void setFrankofracht(Byte frankofracht) {
        this.frankofracht = frankofracht;
    }

    public String getKodUslPost() {
        return kodUslPost;
    }

    public void setKodUslPost(String kodUslPost) {
        this.kodUslPost = kodUslPost;
    }

    public Byte getIncoterms() {
        return incoterms;
    }

    public void setIncoterms(Byte incoterms) {
        this.incoterms = incoterms;
    }

    public Byte getCim() {
        return cim;
    }

    public void setCim(Byte cim) {
        this.cim = cim;
    }

    public String getZakazNo() {
        return zakazNo;
    }

    public void setZakazNo(String zakazNo) {
        this.zakazNo = zakazNo;
    }

    public String getOtprItogo() {
        return otprItogo;
    }

    public void setOtprItogo(String otprItogo) {
        this.otprItogo = otprItogo;
    }

    public String getSborCennost2() {
        return sborCennost2;
    }

    public void setSborCennost2(String sborCennost2) {
        this.sborCennost2 = sborCennost2;
    }

    public String getSborCennost1() {
        return sborCennost1;
    }

    public void setSborCennost1(String sborCennost1) {
        this.sborCennost1 = sborCennost1;
    }

    public Date getPerevozDate() {
        return perevozDate;
    }

    public void setPerevozDate(Date perevozDate) {
        this.perevozDate = perevozDate;
    }

    public String getPerevozSign() {
        return perevozSign;
    }

    public void setPerevozSign(String perevozSign) {
        this.perevozSign = perevozSign;
    }

    public String getVizaNo() {
        return vizaNo;
    }

    public void setVizaNo(String vizaNo) {
        this.vizaNo = vizaNo;
    }

    public String getTrueInfo() {
        return trueInfo;
    }

    public void setTrueInfo(String trueInfo) {
        this.trueInfo = trueInfo;
    }

    public String getZpuInfo() {
        return zpuInfo;
    }

    public void setZpuInfo(String zpuInfo) {
        this.zpuInfo = zpuInfo;
    }

    public String getProvozPlata() {
        return provozPlata;
    }

    public void setProvozPlata(String provozPlata) {
        this.provozPlata = provozPlata;
    }

    public String getPlatezhKop() {
        return platezhKop;
    }

    public void setPlatezhKop(String platezhKop) {
        this.platezhKop = platezhKop;
    }

    public Long getPlatezhRub() {
        return platezhRub;
    }

    public void setPlatezhRub(Long platezhRub) {
        this.platezhRub = platezhRub;
    }

    public Long getPlatezhKm() {
        return platezhKm;
    }

    public void setPlatezhKm(Long platezhKm) {
        this.platezhKm = platezhKm;
    }

    public String getTarifVOtpr() {
        return tarifVOtpr;
    }

    public void setTarifVOtpr(String tarifVOtpr) {
        this.tarifVOtpr = tarifVOtpr;
    }

    public String getTarifShema() {
        return tarifShema;
    }

    public void setTarifShema(String tarifShema) {
        this.tarifShema = tarifShema;
    }

    public String getPerevozchik() {
        return perevozchik;
    }

    public void setPerevozchik(String perevozchik) {
        this.perevozchik = perevozchik;
    }

    public String getGuInf() {
        return guInf;
    }

    public void setGuInf(String guInf) {
        this.guInf = guInf;
    }


    public String getG1_dop_info() {
        return g1_dop_info;
    }

    public String getG4_dop_info() {
        return g4_dop_info;
    }

    public String getG16_dop_info() {
        return g16_dop_info;
    }

    public void setG1_dop_info(String g1_dop_info) {
        this.g1_dop_info = g1_dop_info;
    }

    public void setG4_dop_info(String g4_dop_info) {
        this.g4_dop_info = g4_dop_info;
    }

    public void setG16_dop_info(String g16_dop_info) {
        this.g16_dop_info = g16_dop_info;
    }

    public String getG4prim() {
        return g4prim;
    }

    public void setG4prim(String g4prim) {
        this.g4prim = g4prim;
    }

    public Map<Short, CimSmgsPlomb> getCimSmgsPlombs() {
        return cimSmgsPlombs;
    }

    public void setCimSmgsPlombs(Map<Short, CimSmgsPlomb> cimSmgsPlombs) {
        this.cimSmgsPlombs = cimSmgsPlombs;
    }

    public PackDoc getPackDoc() {
        return packDoc;
    }

    public Byte getCim2() {
        return cim2;
    }

    public void setCim2(Byte cim2) {
        this.cim2 = cim2;
    }

    public String getDocName() {
        if(docType1 != null) {
            switch (docType1.intValue()) {
                case 1:
                    return "smgs";
                case 2:
                    return "invoicelist";
                case 3:
                    return "aviso";
                case 4:
                    return "cimsmgs";
                case 5:
                    return "aviso1";
                case 6:
                    return "slovnakl";
                case 7:
                    return "smgs2";
                case 8:
                    return "aviso2";
                case 10:
                    return "gu29k";
                case 11:
                    return "doplist";
                case 20:
                    return "avisogu29k";
                case 21:
                    return "cim";
                case 27:
                    return "avisocimsmgs";
            }
        }
        return null;
    }

    public void setPackDoc(PackDoc packDoc) {
        this.packDoc = packDoc;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public CimSmgs() {
    }

    public CimSmgs(Long hid) {
        this.hid = hid;
    }

    public CimSmgs(String un) {
        this.un = un;
    }

    public CimSmgs(Long hid, PackDoc pack, Route route) {
        this.hid = hid;
        this.packDoc = pack;
        this.route = route;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public String getG1() {
        return this.g1;
    }

    public void setG1(String g1) {
        this.g1 = g1;
    }

    public String getG2() {
        return this.g2;
    }

    public void setG2(String g2) {
        this.g2 = g2;
    }

    public String getG3() {
        return this.g3;
    }

    public void setG3(String g3) {
        this.g3 = g3;
    }

    public String getG4() {
        return this.g4;
    }

    public void setG4(String g4) {
        this.g4 = g4;
    }

    public String getG5() {
        return this.g5;
    }

    public void setG5(String g5) {
        this.g5 = g5;
    }

    public String getG6() {
        return this.g6;
    }

    public void setG6(String g6) {
        this.g6 = g6;
    }

    public String getG7() {
        return this.g7;
    }

    public void setG7(String g7) {
        this.g7 = g7;
    }

    public String getG8() {
        return this.g8;
    }

    public void setG8(String g8) {
        this.g8 = g8;
    }

    public String getG9() {
        return this.g9;
    }

    public void setG9(String g9) {
        this.g9 = g9;
    }

    public String getG10() {
        return this.g10;
    }

    public void setG10(String g10) {
        this.g10 = g10;
    }

    public String getG11() {
        return this.g11;
    }

    public void setG11(String g11) {
        this.g11 = g11;
    }

    public String getG12() {
        return this.g12;
    }

    public void setG12(String g12) {
        this.g12 = g12;
    }

    public String getG13() {
        return this.g13;
    }

    public void setG13(String g13) {
        this.g13 = g13;
    }

    public String getG141() {
        return this.g141;
    }

    public void setG141(String g141) {
        this.g141 = g141;
    }

    public String getG142() {
        return this.g142;
    }

    public void setG142(String g142) {
        this.g142 = g142;
    }

    public String getG15() {
        return this.g15;
    }

    public void setG15(String g15) {
        this.g15 = g15;
    }

    public String getG16() {
        return this.g16;
    }

    public void setG16(String g16) {
        this.g16 = g16;
    }

    public String getG161() {
        return this.g161;
    }

    public void setG161(String g161) {
        this.g161 = g161;
    }

    public String getG17() {
        return this.g17;
    }

    public void setG17(String g17) {
        this.g17 = g17;
    }

    public String getG18() {
        return this.g18;
    }

    public void setG18(String g18) {
        this.g18 = g18;
    }

    public void setG19c(Byte g19c) {
        this.g19c = g19c;
    }

    public Byte getG19c() {
        return g19c;
    }

    public String getG181() {
        return this.g181;
    }

    public void setG181(String g181) {
        this.g181 = g181;
    }

    public String getG19() {
        return this.g19;
    }

    public void setG19(String g19) {
        this.g19 = g19;
    }

    public String getG20() {
        return this.g20;
    }

    public void setG20(String g20) {
        this.g20 = g20;
    }

    public Byte getG21() {
        return this.g21;
    }

    public void setG21(Byte g21) {
        this.g21 = g21;
    }

    public Byte getG22() {
        return this.g22;
    }

    public void setG22(Byte g22) {
        this.g22 = g22;
    }

    public String getG23() {
        return this.g23;
    }

    public void setG23(String g23) {
        this.g23 = g23;
    }

    public String getG24() {
        return this.g24;
    }

    public void setG24(String g24) {
        this.g24 = g24;
    }

    public Byte getG25() {
        return this.g25;
    }

    public void setG25(Byte g25) {
        this.g25 = g25;
    }

    public String getG26() {
        return this.g26;
    }

    public void setG26(String g26) {
        this.g26 = g26;
    }

    public String getG27() {
        return this.g27;
    }

    public void setG27(String g27) {
        this.g27 = g27;
    }

    public String getG28() {
        return this.g28;
    }

    public void setG28(String g28) {
        this.g28 = g28;
    }

    public Date getG281() {
        return this.g281;
    }

    public Date getG281Disp() {
        return getG281();
    }

    public void setG281(Date g281) {
        this.g281 = g281;
    }

    public void setG281Disp(Date g281) {
        setG281(g281);
    }

    public String getG29() {
        return this.g29;
    }

    public void setG29(String g29) {
        this.g29 = g29;
    }

    public String getG30() {
        return this.g30;
    }

    public void setG30(String g30) {
        this.g30 = g30;
    }

    public Date getG301() {
        return this.g301;
    }

    public void setG301(Date g301) {
        this.g301 = g301;
    }

    public Date getArch() {
        return this.arch;
    }

    public void setArch(Date arch) {
        this.arch = arch;
    }

    public String getUn() {
        return this.un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getTrans() {
        return this.trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public Date getDattr() {
        return this.dattr;
    }

    public void setDattr(Date dattr) {
        this.dattr = dattr;
    }

    public Date getLocked() {
        return this.locked;
    }

    public void setLocked(Date locked) {
        this.locked = locked;
    }

    public String getUnLock() {
        return this.unLock;
    }

    public void setUnLock(String unLock) {
        this.unLock = unLock;
    }

    public String getG40() {
        return this.g40;
    }

    public void setG40(String g40) {
        this.g40 = g40;
    }

    public String getG44() {
        return this.g44;
    }

    public void setG44(String g44) {
        this.g44 = g44;
    }

    public String getG191() {
        return this.g191;
    }

    public void setG191(String g191) {
        this.g191 = g191;
    }

    public String getG192() {
        return this.g192;
    }

    public void setG192(String g192) {
        this.g192 = g192;
    }

    public String getG193() {
        return this.g193;
    }

    public void setG193(String g193) {
        this.g193 = g193;
    }

    public String getG48() {
        return this.g48;
    }

    public void setG48(String g48) {
        this.g48 = g48;
    }

    public String getG41() {
        return this.g41;
    }

    public void setG41(String g41) {
        this.g41 = g41;
    }

    public String getG45() {
        return this.g45;
    }

    public void setG45(String g45) {
        this.g45 = g45;
    }

    public String getGa491() {
        return this.ga491;
    }

    public void setGa491(String ga491) {
        this.ga491 = ga491;
    }

    public String getGb491() {
        return this.gb491;
    }

    public void setGb491(String gb491) {
        this.gb491 = gb491;
    }

    public String getGa492() {
        return this.ga492;
    }

    public void setGa492(String ga492) {
        this.ga492 = ga492;
    }

    public String getGb492() {
        return this.gb492;
    }

    public void setGb492(String gb492) {
        this.gb492 = gb492;
    }

    public String getGa493() {
        return this.ga493;
    }

    public void setGa493(String ga493) {
        this.ga493 = ga493;
    }

    public String getGb493() {
        return this.gb493;
    }

    public void setGb493(String gb493) {
        this.gb493 = gb493;
    }

    public String getGa494() {
        return this.ga494;
    }

    public void setGa494(String ga494) {
        this.ga494 = ga494;
    }

    public String getGb494() {
        return this.gb494;
    }

    public void setGb494(String gb494) {
        this.gb494 = gb494;
    }

    public String getGa50() {
        return this.ga50;
    }

    public void setGa50(String ga50) {
        this.ga50 = ga50;
    }

    public String getGb50() {
        return this.gb50;
    }

    public void setGb50(String gb50) {
        this.gb50 = gb50;
    }

    public String getGa52() {
        return this.ga52;
    }

    public void setGa52(String ga52) {
        this.ga52 = ga52;
    }

    public String getGb52() {
        return this.gb52;
    }

    public void setGb52(String gb52) {
        this.gb52 = gb52;
    }

    public String getGa51() {
        return this.ga51;
    }

    public void setGa51(String ga51) {
        this.ga51 = ga51;
    }

    public String getGb51() {
        return this.gb51;
    }

    public void setGb51(String gb51) {
        this.gb51 = gb51;
    }

    public String getGa53() {
        return this.ga53;
    }

    public void setGa53(String ga53) {
        this.ga53 = ga53;
    }

    public String getGb53() {
        return this.gb53;
    }

    public void setGb53(String gb53) {
        this.gb53 = gb53;
    }

    public String getGa54() {
        return this.ga54;
    }

    public void setGa54(String ga54) {
        this.ga54 = ga54;
    }

    public String getGb54() {
        return this.gb54;
    }

    public void setGb54(String gb54) {
        this.gb54 = gb54;
    }

    public String getGa55() {
        return this.ga55;
    }

    public void setGa55(String ga55) {
        this.ga55 = ga55;
    }

    public String getGb55() {
        return this.gb55;
    }

    public void setGb55(String gb55) {
        this.gb55 = gb55;
    }

    public String getGa56() {
        return this.ga56;
    }

    public void setGa56(String ga56) {
        this.ga56 = ga56;
    }

    public String getGb56() {
        return this.gb56;
    }

    public void setGb56(String gb56) {
        this.gb56 = gb56;
    }

    public String getGa57() {
        return this.ga57;
    }

    public void setGa57(String ga57) {
        this.ga57 = ga57;
    }

    public String getGb57() {
        return this.gb57;
    }

    public void setGb57(String gb57) {
        this.gb57 = gb57;
    }

    public String getG591() {
        return this.g591;
    }

    public void setG591(String g591) {
        this.g591 = g591;
    }

    public String getG592() {
        return this.g592;
    }

    public void setG592(String g592) {
        this.g592 = g592;
    }

    public String getG593() {
        return this.g593;
    }

    public void setG593(String g593) {
        this.g593 = g593;
    }

    public String getG594() {
        return this.g594;
    }

    public void setG594(String g594) {
        this.g594 = g594;
    }

    public String getG595() {
        return this.g595;
    }

    public void setG595(String g595) {
        this.g595 = g595;
    }

    public String getG596() {
        return this.g596;
    }

    public void setG596(String g596) {
        this.g596 = g596;
    }

    public String getG597() {
        return this.g597;
    }

    public void setG597(String g597) {
        this.g597 = g597;
    }

    public String getG598() {
        return this.g598;
    }

    public void setG598(String g598) {
        this.g598 = g598;
    }

    public String getG60() {
        return this.g60;
    }

    public void setG60(String g60) {
        this.g60 = g60;
    }

    public String getG61() {
        return this.g61;
    }

    public void setG61(String g61) {
        this.g61 = g61;
    }

    public String getG611() {
        return this.g611;
    }

    public void setG611(String g611) {
        this.g611 = g611;
    }

    public String getG612() {
        return this.g612;
    }

    public void setG612(String g612) {
        this.g612 = g612;
    }

    public String getG43() {
        return this.g43;
    }

    public void setG43(String g43) {
        this.g43 = g43;
    }

    public String getG47() {
        return this.g47;
    }

    public void setG47(String g47) {
        this.g47 = g47;
    }

    public String getG63() {
        return this.g63;
    }

    public void setG63(String g63) {
        this.g63 = g63;
    }

    public String getG64() {
        return this.g64;
    }

    public void setG64(String g64) {
        this.g64 = g64;
    }

    public String getG65() {
        return this.g65;
    }

    public String g65Disp() {
        String _s = "";
        if (getG65() != null)
            for (int i = 0; i < getG65().length(); i++)
                if (getG65().charAt(i) == '\n')
                    _s += "<br>";
                else
                    _s += getG65().charAt(i);
        return _s;
    }

    public void setG65(String g65) {
        this.g65 = g65;
    }

    public String getG651() {
        return this.g651;
    }

    public String g651Disp() {
        String _s = "";
        if (getG651() != null)
            for (int i = 0; i < getG651().length(); i++)
                if (getG651().charAt(i) == '\n')
                    _s += "<br>";
                else
                    _s += getG651().charAt(i);

        return _s;
    }

    public void setG651(String g651) {
        this.g651 = g651;
    }

    public String getG652() {
        return this.g652;
    }

    public void setG652(String g652) {
        this.g652 = g652;
    }

    public String getGa66() {
        return this.ga66;
    }

    public void setGa66(String ga66) {
        this.ga66 = ga66;
    }

    public Byte getGb661() {
        return this.gb661;
    }

    public void setGb661(Byte gb661) {
        this.gb661 = gb661;
    }

    public String getGb662() {
        return this.gb662;
    }

    public void setGb662(String gb662) {
        this.gb662 = gb662;
    }

    public Date getG67() {
        return this.g67;
    }

    public void setG67(Date g67) {
        this.g67 = g67;
    }

    public String getG691() {
        return this.g691;
    }

    public void setG691(String g691) {
        this.g691 = g691;
    }

    public String getG692() {
        return this.g692;
    }

    public void setG692(String g692) {
        this.g692 = g692;
    }

    public String getG693() {
        return this.g693;
    }

    public void setG693(String g693) {
        this.g693 = g693;
    }

    public String getG694() {
        return this.g694;
    }

    public void setG694(String g694) {
        this.g694 = g694;
    }

    public String getG68() {
        return this.g68;
    }

    public void setG68(String g68) {
        this.g68 = g68;
    }

    public String getG62() {
        return this.g62;
    }

    public void setG62(String g62) {
        this.g62 = g62;
    }

    public String getG621() {
        return this.g621;
    }

    public void setG621(String g621) {
        this.g621 = g621;
    }

    public String getG622() {
        return this.g622;
    }

    public void setG622(String g622) {
        this.g622 = g622;
    }

    public String getG38() {
        return this.g38;
    }

    public void setG38(String g38) {
        this.g38 = g38;
    }

    public String getG39() {
        return this.g39;
    }

    public void setG39(String g39) {
        this.g39 = g39;
    }

    public String getG18B1() {
        return this.g18B1;
    }

    public void setG18B1(String g18B1) {
        this.g18B1 = g18B1;
    }

    public String getG18B2() {
        return this.g18B2;
    }

    public void setG18B2(String g18B2) {
        this.g18B2 = g18B2;
    }

    public String getGa581() {
        return this.ga581;
    }

    public void setGa581(String ga581) {
        this.ga581 = ga581;
    }

    public String getGb581() {
        return this.gb581;
    }

    public void setGb581(String gb581) {
        this.gb581 = gb581;
    }

    public String getGa582() {
        return this.ga582;
    }

    public void setGa582(String ga582) {
        this.ga582 = ga582;
    }

    public String getGb582() {
        return this.gb582;
    }

    public void setGb582(String gb582) {
        this.gb582 = gb582;
    }

    public String getGa583() {
        return this.ga583;
    }

    public void setGa583(String ga583) {
        this.ga583 = ga583;
    }

    public String getGb583() {
        return this.gb583;
    }

    public void setGb583(String gb583) {
        this.gb583 = gb583;
    }

    public String getGa584() {
        return this.ga584;
    }

    public void setGa584(String ga584) {
        this.ga584 = ga584;
    }

    public String getGb584() {
        return this.gb584;
    }

    public void setGb584(String gb584) {
        this.gb584 = gb584;
    }

    public String getGa585() {
        return this.ga585;
    }

    public void setGa585(String ga585) {
        this.ga585 = ga585;
    }

    public String getGb585() {
        return this.gb585;
    }

    public void setGb585(String gb585) {
        this.gb585 = gb585;
    }

    public String getGa586() {
        return this.ga586;
    }

    public void setGa586(String ga586) {
        this.ga586 = ga586;
    }

    public String getGb586() {
        return this.gb586;
    }

    public void setGb586(String gb586) {
        this.gb586 = gb586;
    }

    public String getG20100() {
        return this.g20100;
    }

    public void setG20100(String g20100) {
        this.g20100 = g20100;
    }

    public String getG42() {
        return this.g42;
    }

    public void setG42(String g42) {
        this.g42 = g42;
    }

    public String getG46() {
        return this.g46;
    }

    public void setG46(String g46) {
        this.g46 = g46;
    }

    public String getG11_1() {
        return this.g11_1;
    }

    public void setG11_1(String g11_1) {
        this.g11_1 = g11_1;
    }

    public String getG12_1() {
        return this.g12_1;
    }

    public void setG12_1(String g12_1) {
        this.g12_1 = g12_1;
    }

    public String getG13_1() {
        return this.g13_1;
    }

    public void setG13_1(String g13_1) {
        this.g13_1 = g13_1;
    }

    public String getG41_1() {
        return this.g41_1;
    }

    public void setG41_1(String g41_1) {
        this.g41_1 = g41_1;
    }

    public String getG42_1() {
        return this.g42_1;
    }

    public void setG42_1(String g42_1) {
        this.g42_1 = g42_1;
    }

    public String getG43_1() {
        return this.g43_1;
    }

    public void setG43_1(String g43_1) {
        this.g43_1 = g43_1;
    }

    public BigDecimal getHidCim() {
        return this.hidCim;
    }

    public void setHidCim(BigDecimal hidCim) {
        this.hidCim = hidCim;
    }

    public BigDecimal getHidIcf() {
        return this.hidIcf;
    }

    public void setHidIcf(BigDecimal hidIcf) {
        this.hidIcf = hidIcf;
    }

    public BigDecimal getHidSp() {
        return this.hidSp;
    }

    public void setHidSp(BigDecimal hidSp) {
        this.hidSp = hidSp;
    }

    public Long getHidSmgs() {
        return this.hidSmgs;
    }

    public void setHidSmgs(Long hidSmgs) {
        this.hidSmgs = hidSmgs;
    }

    public Long getIftminId() {
        return this.iftminId;
    }

    public void setIftminId(Long iftminId) {
        this.iftminId = iftminId;
    }

    public Date getIftminOut() {
        return this.iftminOut;
    }

    public void setIftminOut(Date iftminOut) {
        this.iftminOut = iftminOut;
    }

    public Date getIftminIn() {
        return this.iftminIn;
    }

    public void setIftminIn(Date iftminIn) {
        this.iftminIn = iftminIn;
    }

    public Long getIftminId2() {
        return iftminId2;
    }

    public void setIftminId2(Long iftminId2) {
        this.iftminId2 = iftminId2;
    }

    public Date getIftminOut2() {
        return iftminOut2;
    }

    public void setIftminOut2(Date iftminOut2) {
        this.iftminOut2 = iftminOut2;
    }

    public Date getIftminIn2() {
        return iftminIn2;
    }

    public void setIftminIn2(Date iftminIn2) {
        this.iftminIn2 = iftminIn2;
    }

    public String getG121() {
        return this.g121;
    }

    public void setG121(String g121) {
        this.g121 = g121;
    }

    public BigDecimal getG24N() {
        return this.g24N;
    }

    public void setG24N(BigDecimal g24N) {
        this.g24N = g24N;
    }

    public BigDecimal getG24T() {
        return this.g24T;
    }

    public void setG24T(BigDecimal g24T) {
        this.g24T = g24T;
    }

    public BigDecimal getG24B() {
        return this.g24B;
    }

    public void setG24B(BigDecimal g24B) {
        this.g24B = g24B;
    }

    public String getStatusBr() {
        return this.statusBr;
    }

    public void setStatusBr(String statusBr) {
        this.statusBr = statusBr;
    }

    public Date getAltered() {
        return this.altered;
    }

    public void setAltered(Date altered) {
        this.altered = altered;
    }

    public String getG1r() {
        return this.g1r;
    }

    public void setG1r(String g1r) {
        this.g1r = g1r;
    }

    public String getG14() {
        return this.g14;
    }

    public void setG14(String g14) {
        this.g14 = g14;
    }

    public String getG4r() {
        return this.g4r;
    }

    public void setG4r(String g4r) {
        this.g4r = g4r;
    }

    public String getG7r() {
        return this.g7r;
    }

    public void setG7r(String g7r) {
        this.g7r = g7r;
    }

    public String getG9r() {
        return this.g9r;
    }

    public void setG9r(String g9r) {
        this.g9r = g9r;
    }

    public String getG101() {
        return this.g101;
    }

    public void setG101(String g101) {
        this.g101 = g101;
    }

    public String getG101r() {
        return this.g101r;
    }

    public void setG101r(String g101r) {
        this.g101r = g101r;
    }

    public String getG102() {
        return this.g102;
    }

    public void setG102(String g102) {
        this.g102 = g102;
    }

    public String getG102r() {
        return this.g102r;
    }

    public void setG102r(String g102r) {
        this.g102r = g102r;
    }

    public String getG13r() {
        return this.g13r;
    }

    public void setG13r(String g13r) {
        this.g13r = g13r;
    }

    public String getG15r() {
        return this.g15r;
    }

    public void setG15r(String g15r) {
        this.g15r = g15r;
    }

    public String getG162() {
        return this.g162;
    }

    public void setG162(String g162) {
        this.g162 = g162;
    }

    public String getG162r() {
        return this.g162r;
    }

    public void setG162r(String g162r) {
        this.g162r = g162r;
    }

    public String getG163() {
        return this.g163;
    }

    public void setG163(String g163) {
        this.g163 = g163;
    }

    public String getG163r() {
        return this.g163r;
    }

    public void setG163r(String g163r) {
        this.g163r = g163r;
    }

    public String getG18r() {
        return this.g18r;
    }

    public void setG18r(String g18r) {
        this.g18r = g18r;
    }

    public String getG29r() {
        return this.g29r;
    }

    public void setG29r(String g29r) {
        this.g29r = g29r;
    }

    public String getProfile() {
        return this.profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getTargGr() {
        return this.targGr;
    }

    public void setTargGr(String targGr) {
        this.targGr = targGr;
    }

    public String getAvFields() {
        return this.avFields;
    }

    public void setAvFields(String avFields) {
        this.avFields = avFields;
    }

    public Byte getG1c() {
        return this.g1c;
    }

    public void setG1c(Byte g1c) {
        this.g1c = g1c;
    }

    public Byte getG4c() {
        return this.g4c;
    }

    public void setG4c(Byte g4c) {
        this.g4c = g4c;
    }

    public Byte getG7c() {
        return this.g7c;
    }

    public void setG7c(Byte g7c) {
        this.g7c = g7c;
    }

    public Byte getG9c() {
        return this.g9c;
    }

    public void setG9c(Byte g9c) {
        this.g9c = g9c;
    }

    public Byte getG13c() {
        return this.g13c;
    }

    public void setG13c(Byte g13c) {
        this.g13c = g13c;
    }

    public Byte getG15c() {
        return this.g15c;
    }

    public void setG15c(Byte g15c) {
        this.g15c = g15c;
    }

    public Byte getG18c() {
        return this.g18c;
    }

    public void setG18c(Byte g18c) {
        this.g18c = g18c;
    }

    public Byte getG20c() {
        return this.g20c;
    }

    public void setG20c(Byte g20c) {
        this.g20c = g20c;
    }

    public String getNumClaim() {
        return this.numClaim;
    }

    public void setNumClaim(String numClaim) {
        this.numClaim = numClaim;
    }

    public String getG15_1() {
        return this.g15_1;
    }

    public void setG15_1(String g15_1) {
        this.g15_1 = g15_1;
    }

    public String getG16_1() {
        return this.g16_1;
    }

    public void setG16_1(String g16_1) {
        this.g16_1 = g16_1;
    }

    public String getG16r() {
        return this.g16r;
    }

    public void setG16r(String g16r) {
        this.g16r = g16r;
    }

    public String getG17_1() {
        return this.g17_1;
    }

    public void setG17_1(String g17_1) {
        this.g17_1 = g17_1;
    }

    public String getG18_1() {
        return this.g18_1;
    }

    public void setG18_1(String g18_1) {
        this.g18_1 = g18_1;
    }

    public String getG18r_1() {
        return this.g18r_1;
    }

    public void setG18r_1(String g18r_1) {
        this.g18r_1 = g18r_1;
    }

    public String getG19_1() {
        return this.g19_1;
    }

    public void setG19_1(String g19_1) {
        this.g19_1 = g19_1;
    }

    public String getG19r() {
        return this.g19r;
    }

    public void setG19r(String g19r) {
        this.g19r = g19r;
    }

    public String getG45_1() {
        return this.g45_1;
    }

    public void setG45_1(String g45_1) {
        this.g45_1 = g45_1;
    }

    public String getG46_1() {
        return this.g46_1;
    }

    public void setG46_1(String g46_1) {
        this.g46_1 = g46_1;
    }

    public String getG46r() {
        return this.g46r;
    }

    public void setG46r(String g46r) {
        this.g46r = g46r;
    }

    public String getG47_1() {
        return this.g47_1;
    }

    public void setG47_1(String g47_1) {
        this.g47_1 = g47_1;
    }

    public String getG48_1() {
        return this.g48_1;
    }

    public void setG48_1(String g48_1) {
        this.g48_1 = g48_1;
    }

    public String getG48r() {
        return this.g48r;
    }

    public void setG48r(String g48r) {
        this.g48r = g48r;
    }

    public String getG49() {
        return this.g49;
    }

    public void setG49(String g49) {
        this.g49 = g49;
    }

    public String getG49r() {
        return this.g49r;
    }

    public void setG49r(String g49r) {
        this.g49r = g49r;
    }

    public String getG201() {
        return this.g201;
    }

    public void setG201(String g201) {
        this.g201 = g201;
    }

    public String getG202() {
        return this.g202;
    }

    public void setG202(String g202) {
        this.g202 = g202;
    }

    public String getG202r() {
        return this.g202r;
    }

    public void setG202r(String g202r) {
        this.g202r = g202r;
    }

    public String getG203() {
        return this.g203;
    }

    public void setG203(String g203) {
        this.g203 = g203;
    }

    public String getG204() {
        return this.g204;
    }

    public void setG204(String g204) {
        this.g204 = g204;
    }

    public String getG205() {
        return this.g205;
    }

    public void setG205(String g205) {
        this.g205 = g205;
    }

    public String getG206() {
        return this.g206;
    }

    public void setG206(String g206) {
        this.g206 = g206;
    }

    public String getG206r() {
        return this.g206r;
    }

    public void setG206r(String g206r) {
        this.g206r = g206r;
    }

    public String getG207() {
        return this.g207;
    }

    public void setG207(String g207) {
        this.g207 = g207;
    }

    public String getG207r() {
        return this.g207r;
    }

    public void setG207r(String g207r) {
        this.g207r = g207r;
    }

    public String getG208() {
        return this.g208;
    }

    public void setG208(String g208) {
        this.g208 = g208;
    }

    public String getG209() {
        return this.g209;
    }

    public void setG209(String g209) {
        this.g209 = g209;
    }

    public String getG209r() {
        return this.g209r;
    }

    public void setG209r(String g209r) {
        this.g209r = g209r;
    }

    public String getG2010() {
        return this.g2010;
    }

    public void setG2010(String g2010) {
        this.g2010 = g2010;
    }

    public String getG2011() {
        return this.g2011;
    }

    public void setG2011(String g2011) {
        this.g2011 = g2011;
    }

    public String getG2012() {
        return this.g2012;
    }

    public void setG2012(String g2012) {
        this.g2012 = g2012;
    }

    public String getG2013() {
        return this.g2013;
    }

    public void setG2013(String g2013) {
        this.g2013 = g2013;
    }

    public String getG2014() {
        return this.g2014;
    }

    public void setG2014(String g2014) {
        this.g2014 = g2014;
    }

    public String getG2014r() {
        return this.g2014r;
    }

    public void setG2014r(String g2014r) {
        this.g2014r = g2014r;
    }

    public String getG2015() {
        return this.g2015;
    }

    public void setG2015(String g2015) {
        this.g2015 = g2015;
    }

    public String getG2016() {
        return this.g2016;
    }

    public void setG2016(String g2016) {
        this.g2016 = g2016;
    }

    public String getG2017() {
        return this.g2017;
    }

    public void setG2017(String g2017) {
        this.g2017 = g2017;
    }

    public String getG2017r() {
        return this.g2017r;
    }

    public void setG2017r(String g2017r) {
        this.g2017r = g2017r;
    }

    public String getG2011r() {
        return this.g2011r;
    }

    public void setG2011r(String g2011r) {
        this.g2011r = g2011r;
    }

    public String getG110() {
        return this.g110;
    }

    public void setG110(String g110) {
        this.g110 = g110;
    }

    public String getG111() {
        return this.g111;
    }

    public void setG111(String g111) {
        this.g111 = g111;
    }

    public String getG112() {
        return this.g112;
    }

    public void setG112(String g112) {
        this.g112 = g112;
    }

    public String getG410() {
        return this.g410;
    }

    public void setG410(String g410) {
        this.g410 = g410;
    }

    public String getG411() {
        return this.g411;
    }

    public void setG411(String g411) {
        this.g411 = g411;
    }

    public String getG412() {
        return this.g412;
    }

    public void setG412(String g412) {
        this.g412 = g412;
    }

    public String getReady() {
        return this.ready;
    }

    public void setReady(String ready) {
        this.ready = ready;
    }

    public String getG171() {
        return this.g171;
    }

    public void setG171(String g171) {
        this.g171 = g171;
    }

    public String getG2018() {
        return this.g2018;
    }

    public void setG2018(String g2018) {
        this.g2018 = g2018;
    }

    public String getG2018r() {
        return this.g2018r;
    }

    public void setG2018r(String g2018r) {
        this.g2018r = g2018r;
    }

    public Map<Integer, CimSmgsDocs> getCimSmgsDocses7() {
        return this.cimSmgsDocses7;
    }

    public void setCimSmgsDocses7(Map<Integer, CimSmgsDocs> cimSmgsDocses7) {
        this.cimSmgsDocses7 = cimSmgsDocses7;
    }

    public Map<Integer, CimSmgsDocs> getCimSmgsDocses9() {
        return this.cimSmgsDocses9;
    }

    public void setCimSmgsDocses9(Map<Integer, CimSmgsDocs> cimSmgsDocses9) {
        this.cimSmgsDocses9 = cimSmgsDocses9;
    }

    public Map<Byte, CimSmgsCarList> getCimSmgsCarLists() {
        return this.cimSmgsCarLists;
    }

    public String getG44_1() {
        return g44_1;
    }

    public Map<Integer, CimSmgsDocs> getCimSmgsDocses13() {
        return cimSmgsDocses13;
    }

    public Byte getStatus() {
        return status;
    }

    public String getG23b() {
        return g23b;
    }

    public String getG74_1() {
        return g74_1;
    }

    public String getG74_2() {
        return g74_2;
    }

    public Byte getType() {
        return type;
    }

    public String getGs_48() {
        return gs_48;
    }

    public Byte getGs_22() {
        return gs_22;
    }

    public String getWdefnc() {
        return wdefnc;
    }

    public void setWdefnc(String wdefnc) {
        this.wdefnc = wdefnc;
    }

    public String getGs_24() {
        return gs_24;
    }

    public void setCimSmgsCarLists(Map<Byte, CimSmgsCarList> cimSmgsCarLists) {
        this.cimSmgsCarLists = cimSmgsCarLists;
    }

    public void setG44_1(String g44_1) {
        this.g44_1 = g44_1;
    }

    public void setCimSmgsDocses13(Map<Integer, CimSmgsDocs> cimSmgsDocses13) {
        this.cimSmgsDocses13 = cimSmgsDocses13;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public void setG23b(String g23b) {
        this.g23b = g23b;
    }

    public void setG74_1(String g74_1) {
        this.g74_1 = g74_1;
    }

    public void setG74_2(String g74_2) {
        this.g74_2 = g74_2;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public void setGs_48(String gs_48) {
        this.gs_48 = gs_48;
    }

    public void setGs_22(Byte gs_22) {
        this.gs_22 = gs_22;
    }

    public void setGs_24(String gs_24) {
        this.gs_24 = gs_24;
    }

    public String getGs_141_1() {
        return gs_141_1;
    }

    public Date getGs_141_2() {
        return gs_141_2;
    }

    public String getGs_66_1() {
        return gs_66_1;
    }

    public String getG18B1a() {
        return g18B1a;
    }

    public String getG18B1b() {
        return g18B1b;
    }

    public String getG18B1c() {
        return g18B1c;
    }

    public String getG18B1d() {
        return g18B1d;
    }

    public Map<Byte, CimSmgsPlatel> getCimSmgsPlatels() {
        return cimSmgsPlatels;
    }

    public Set<CsComnt> getCsComnt() {
        return csComnt;
    }

    public void setGs_141_1(String gs_141_1) {
        this.gs_141_1 = gs_141_1;
    }

    public void setGs_141_2(Date gs_141_2) {
        this.gs_141_2 = gs_141_2;
    }

    public void setGs_66_1(String gs_66_1) {
        this.gs_66_1 = gs_66_1;
    }

    public void setG18B1a(String g18B1a) {
        this.g18B1a = g18B1a;
    }

    public void setG18B1b(String g18B1b) {
        this.g18B1b = g18B1b;
    }

    public void setG18B1c(String g18B1c) {
        this.g18B1c = g18B1c;
    }

    public void setG18B1d(String g18B1d) {
        this.g18B1d = g18B1d;
    }

    public void setCimSmgsPlatels(Map<Byte, CimSmgsPlatel> cimSmgsPlatels) {
        this.cimSmgsPlatels = cimSmgsPlatels;
    }

    public void setCsComnt(Set<CsComnt> csComnt) {
        this.csComnt = csComnt;
    }

    public void addCimSmgsPlatels() {
        for (CimSmgsPlatel elem : cimSmgsPlatels.values())
            elem.setCimSmgs(this);
    }

    public void addCimSmgsPlombs() {
        for (CimSmgsPlomb elem : cimSmgsPlombs.values())
            elem.setCimSmgs(this);
    }

    public void addCimSmgsPerevoz() {
        for (CimSmgsPerevoz elem : cimSmgsPerevoz.values())
            elem.setCimSmgs(this);
    }

    public void addCimSmgsDocses7() {
        for (CimSmgsDocs elem : cimSmgsDocses7.values())
            elem.setCimSmgs(this);
    }

    public void addCimSmgsDocses9() {
        for (CimSmgsDocs elem : cimSmgsDocses9.values())
            elem.setCimSmgs(this);
    }

    public void addCimSmgsDocses13() {
        for (CimSmgsDocs elem : cimSmgsDocses13.values())
            elem.setCimSmgs(this);
    }

    public void addCimSmgsDocses136() {
        for (CimSmgsDocs elem : cimSmgsDocses136.values())
            elem.setCimSmgs(this);
    }

    public void addCimSmgsCarLists() {
        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
            car.setCimSmgs(this);
            car.addCimSmgsGruzs();
            car.addCimSmgsDocs9();
            car.addCimSmgsPlombs();
            car.addCimSmgsKonLists();
        }
    }

    public String getFolderName () {
        String folder = getHid()!=null?getHid().toString():null;
        if (cimSmgsCarLists.values().size() == 1) {
            CimSmgsCarList car = cimSmgsCarLists.values().iterator().next();
            folder = car.getNvag();
            if (car.getCimSmgsKonLists().values().size() == 1)
                folder = car.getCimSmgsKonLists().values().iterator().next().getUtiN();
        }
        return folder;
    }

    /**
     * выполняем действия с вагонами после копирования документа
     */
    public void addCimSmgsCarListsAfterCopy() {
        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
            car.setCimSmgs(this);
            // если контейнерноа нет, то копируем грузы
            if(car.getCimSmgsKonLists().size()==0)
                car.addCimSmgsGruzs();
            // удаляем докуенты
            car.getCimSmgsDocses9().clear();
            car.addCimSmgsPlombs();
            car.addCimSmgsKonLists();
        }
    }

    public BigDecimal calcG29InKon() {
        BigDecimal sum = new BigDecimal(0);
        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values()) {
                if (kon.getMassSend() != null)
                    sum = sum.add(kon.getMassSend());
            }
        }
        return sum;
    }



    public String getG_1_5k() {
        return g_1_5k;
    }

    public void setG_1_5k(String g_1_5k) {
        this.g_1_5k = g_1_5k;
    }

    public String getG_4_5k() {
        return g_4_5k;
    }

    public void setG_4_5k(String g_4_5k) {
        this.g_4_5k = g_4_5k;
    }

    public String getG_10_3r() {
        return g_10_3r;
    }

    public void setG_10_3r(String g_10_3r) {
        this.g_10_3r = g_10_3r;
    }

    public String getG_16_33r() {
        return g_16_33r;
    }

    public void setG_16_33r(String g_16_33r) {
        this.g_16_33r = g_16_33r;
    }

    public Set<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(Set<Status> statuses) {
        this.statuses = statuses;
    }

    public void prepareGU4copy() {
        for (CimSmgsPlatel platel : getCimSmgsPlatels().values()) {
            platel.setKplat((platel.getKplat() != null ? platel.getKplat() : "") + (platel.getKplat1() != null ? "  " + platel.getKplat1() : ""));
            platel.setPlatR((platel.getDorR() != null ? platel.getDorR() : "") + (platel.getPlatR() != null ? "  " + platel.getPlatR() : ""));
        }

        StringBuilder buf = new StringBuilder();
        buf.append(StringUtils.isNotEmpty(getG_1_5k()) ? getG_1_5k() : "");
        buf.append(StringUtils.isNotEmpty(getG16r()) ? " " + getG16r() + ";" : "");
        buf.append(StringUtils.isNotEmpty(getG18r_1()) ? " " + getG18r_1() + ";" : "");
        buf.append(StringUtils.isNotEmpty(getG19r()) ? " " + getG19r() : "");
        this.setG19r(buf.toString());

        buf = new StringBuilder();
        buf.append(StringUtils.isNotEmpty(getG_4_5k()) ? getG_4_5k() : "");
        buf.append(StringUtils.isNotEmpty(getG46r()) ? " " + getG46r() + ";" : "");
        buf.append(StringUtils.isNotEmpty(getG48r()) ? " " + getG48r() + ";" : "");
        buf.append(StringUtils.isNotEmpty(getG49r()) ? " " + getG49r() : "");
        this.setG49r(buf.toString());

        buf = new StringBuilder(StringUtils.defaultString(g1r));
        buf.append(StringUtils.isNotEmpty(getG2()) ? " Код ОКПО " + getG2() : "");
        buf.append(StringUtils.isNotEmpty(getG_2inn()) ? " Код ИНН " + getG_2inn() : "");
        this.setG1r(buf.toString());

        buf = new StringBuilder(StringUtils.defaultString(g4r));
        buf.append(StringUtils.isNotEmpty(getG5()) ? " Код ОКПО " + getG5() : "");
        buf.append(StringUtils.isNotEmpty(getG_5inn()) ? " Код ИНН " + getG_5inn() : "");
        this.setG4r(buf.toString());
    }

    public Set<TdgLog> getTdgLog() {
        return tdgLog;
    }

    public void setTdgLog(Set<TdgLog> tdgLog) {
        this.tdgLog = tdgLog;
    }

    public Byte getGreenRail_status() {
        return greenRail_status;
    }

    public void setGreenRail_status(Byte greenRail_status) {
        this.greenRail_status = greenRail_status;
    }

    public boolean hasPackDoc() {
        return getPackDoc() != null && getPackDoc().getHid() != null;
    }

    public boolean hasRoute() {
        return getRoute() != null && getRoute().getHid() != null;
    }

    public boolean hasVag() {
        return getCimSmgsCarLists()!=null&&getCimSmgsCarLists().size()>0;
    }

    public CimSmgsCarList findOrCreateVag() {
        return hasVag() ? getCimSmgsCarLists().values().iterator().next() : new CimSmgsCarList((byte) 0, this);

    }

    public boolean hasKont() {
        Map<Byte, CimSmgsKonList> map=findOrCreateVag().getCimSmgsKonLists();

        return hasVag() && map!=null&&map.size()>0;
    }

    public CimSmgsKonList findOrCreateKont() {
        return hasKont() ? findOrCreateVag().getCimSmgsKonLists().values().iterator().next() : new CimSmgsKonList((byte) 0, findOrCreateVag());
    }

    public Set<Tbc2Log> getTbc2Logs() {
        return tbc2Logs;
    }

    public void setTbc2Logs(Set<Tbc2Log> tbc2Logs) {
        this.tbc2Logs = tbc2Logs;
    }

    private static class Compare implements Comparator<CimSmgsDocs> {
        private boolean isInteger(String string) {
            try {
                 Integer.parseInt(string);
            } catch (NumberFormatException ex) {
                return false;
            }
            return true;
        }

        public int compare(CimSmgsDocs o1, CimSmgsDocs o2) {
            if (o1.getCode() == null || o1.getCode().trim().length() == 0 || o2.getCode() == null || o2.getCode().trim().length() == 0)
                return -1;
            else {
                String code1 = o1.getCode().trim();
                String code2 = o2.getCode().trim();
                if (isInteger(code1) && isInteger(code2)) {
                    return  Integer.parseInt(code1)-Integer.parseInt(code2);
                }
                else
                    return o1.getCode().compareTo(o2.getCode());
            }
        }

        public boolean equals(Object obj) {
            return false;
        }
    }

    public int vagsConts() {
        int count = 0;
        if (getCimSmgsCarLists() != null) {
            count = getCimSmgsCarLists().size();
        }

        return count;
    }

    public int countConts() {
        int count = 0;
        if (getCimSmgsCarLists() != null) {
            for (CimSmgsCarList vag : getCimSmgsCarLists().values()) {
                count += vag.getCimSmgsKonLists().size();
            }
        }

        return count;
    }

    public boolean isGroupContOtpr() {
        return isContOtpr() && ((cimSmgsCarLists != null && cimSmgsCarLists.size() > 1) || countConts() > 1);
    }

    public boolean isGroup() {
        return countConts() > 1 || vagsConts() > 1;
    }

    public String g9Disp4PrintSmgs() {
        String _f9 = "";
        for (CimSmgsDocs elem : cimSmgsDocses9.values()) {
            _f9 += (elem.getText() != null ? elem.getText() + " " : "");
            _f9 += (elem.getNdoc() != null ? elem.getNdoc() + " " : "");
            _f9 += (elem.getDat() != null ? "от " + new SimpleDateFormat("dd.MM.yyyy").format(elem.getDat()) + " " : "");
            _f9 += (elem.getNcopy() != null ? elem.getNcopy() + " экз " : "");
            _f9 += "<br/>";
        }
        return _f9;
    }

    private String buildG20Helper(String dorR) {
        if (dorR.equals("ВР")) {
            return "10";
        } else if (dorR.equals("РЖД")) {
            return "20";
        } else if (dorR.equals("БЧ")) {
            return "21";
        } else if (dorR.equals("УЗ")) {
            return "22";
        } else if (dorR.equals("ЧФМ")) {
            return "23";
        } else if (dorR.equals("ЛГ")) {
            return "24";
        } else if (dorR.equals("ЛДЗ")) {
            return "25";
        } else if (dorR.equals("ЭВР")) {
            return "26";
        } else if (dorR.equals("КЗХ")) {
            return "27";
        } else if (dorR.equals("ГР")) {
            return "28";
        } else if (dorR.equals("УТИ")) {
            return "29";
        } else if (dorR.equals("ЗЧ")) {
            return "30";
        } else if (dorR.equals("МТЗ")) {
            return "31";
        } else if (dorR.equals("ДСВН")) {
            return "32";
        } else if (dorR.equals("НЕОП")) {
            return "0";
        } else if (dorR.equals("КЗД")) {
            return "33";
        } else if (dorR.equals("ПКП")) {
            return "51";
        } else if (dorR.equals("БДЖ")) {
            return "52";
        } else if (dorR.equals("ЧФР")) {
            return "53";
        } else if (dorR.equals("ЧД")) {
            return "54";
        } else if (dorR.equals("МАВ")) {
            return "55";
        } else if (dorR.equals("ЖСР")) {
            return "56";
        } else if (dorR.equals("АЗ")) {
            return "57";
        } else if (dorR.equals("АРМ")) {
            return "58";
        } else if (dorR.equals("КРГ")) {
            return "59";
        } else if (dorR.equals("ТЖД")) {
            return "66";
        } else if (dorR.equals("ТРК")) {
            return "67";
        } else if (dorR.equals("АФГ")) {
            return "69";
        } else if (dorR.equals("ТЦДД")) {
            return "75";
        } else if (dorR.equals("ДБ")) {
            return "80";
        } else if (dorR.equals("РАИ")) {
            return "96";
        } else {
            return "";
        }
    }


    public String g7CmrDisp() {
        Integer sum = 0;
        for (CimSmgsCarList car : cimSmgsCarLists.values())
            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values())
                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
                    sum += gruz.getPlaces() != null ? gruz.getPlaces() : 0;
                }

        return (sum != 0 ? sum.toString() : "");
    }

    public String g6CmrDisp() {
        String result = "";
        CimSmgsCarList vag = cimSmgsCarLists.get((byte) 0);
        if (vag != null && vag.getCimSmgsKonLists() != null) {
            CimSmgsKonList kon = vag.getCimSmgsKonLists().get((byte) 0);
            if (kon != null) {
                result += kon.getUtiN() + " " + kon.getSizeFoot();
            }
        }

        return result;
    }

    public String g24NDisp() {
        StringBuilder value = new StringBuilder();
        if (getG24N() != null) {
            value.append(StringUtils.isNotEmpty(getNettoPref()) ? getNettoPref() : "");
            value.append(getG24N());
        }
        return value.toString();
    }


    public String g24TDisp() {
        StringBuilder value = new StringBuilder();
        if (getG24T() != null) {
            value.append(StringUtils.isNotEmpty(getTaraPref()) ? getTaraPref() : "");
            value.append(getG24T());
        }
        return value.toString();
    }

    public String g24BDisp() {
        StringBuilder value = new StringBuilder();
        if (getG24B() != null) {
            value.append(StringUtils.isNotEmpty(getBruttoPref()) ? getBruttoPref() : "");
            value.append(getG24B());
        }
        return value.toString();
    }


    private String createCimDanGruzStr(CimSmgsGruz gruz){
        StringBuilder danGruzStr = new StringBuilder();
        for (CimSmgsDanGruz danGruz:gruz.getCimSmgsDanGruzs().values()) {
            danGruzStr.append(StringUtils.defaultString(danGruz.getCarDNameDe()));
            String cod=StringUtils.defaultString(danGruz.getCodDanger());
            String unCode=StringUtils.defaultString(danGruz.getNumOon());
            if(danGruzStr.length()>0)
                danGruzStr.append(" ");
            danGruzStr.append(cod);
            if(cod.length()>0&&unCode.length()>0)
                danGruzStr.append("/");
            if(unCode.length()>0)
                danGruzStr.append("UN ");
            danGruzStr.append(unCode);
        }
        return danGruzStr.toString();
    }


    public String g14SmgsDisp1() {
        int sum = 0;
        for (CimSmgsCarList car : cimSmgsCarLists.values())
            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values())
                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
                    sum += gruz.getPlaces() != null ? gruz.getPlaces() : 0;
                }
        return (sum != 0 ? Integer.toString(sum) : "");
    }



    public String gs141_2Disp() {
        return (gs_141_2 != null ? " " + new SimpleDateFormat("yy.MM.dd").format(gs_141_2) : "");
    }

    public void addCimSmgsDocsItem(CimSmgsDocs csd) {
        if (csd != null) {
            csd.setCimSmgs(this);
            Integer sort = csd.getSort();
            String fn = StringUtils.defaultString(csd.getFieldNum()).trim();

            Map<Integer, CimSmgsDocs> m;
            switch (fn) {
                case "7":
                    m = cimSmgsDocses7;
                    break;
                case "9":
                    m = cimSmgsDocses9;
                    break;
                case "13":
                    m = cimSmgsDocses13;
                    break;
                default:
                    LoggerFactory.getLogger(CimSmgs.class).warn("field_num is not defined. Use \"7\"");
                    m = cimSmgsDocses7;
            }

            if (sort == null) {
                sort = m.size();
                csd.setSort(sort);
            }
            m.put(sort, csd);
        }
    }

    public void addCimSmgsCarListItem(CimSmgsCarList csc) {
        if (csc != null) {
            csc.setCimSmgs(this);
            cimSmgsCarLists.put(csc.getSort(), csc);
        }
    }

    public void addCimSmgsPlatelItem(CimSmgsPlatel csp) {
        if (csp != null) {
            csp.setCimSmgs(this);
            cimSmgsPlatels.put(csp.getSort(), csp);
        }
    }

    public void addCimSmgsPerevozItem(CimSmgsPerevoz csp) {
        if (csp != null) {
            csp.setCimSmgs(this);
            cimSmgsPerevoz.put(csp.getSort(), csp);
        }
    }

    public void addCimSmgsPlombItem(CimSmgsPlomb csp) {
        if (csp != null) {
            csp.setCimSmgs(this);
            cimSmgsPlombs.put(csp.getSort(), csp);
        }
    }

    public void addPlomb(CimSmgsPlomb cimSmgsPlomb) {
        if (cimSmgsPlomb.getCimSmgsCarList() == null && cimSmgsPlomb.getCimSmgsKonList() == null)
            return;

        if (cimSmgsPlomb.getCimSmgsCarList() == null) {
            Map<Short, CimSmgsPlomb> konPlombs = cimSmgsPlomb.getCimSmgsKonList().getCimSmgsPlombs();
            cimSmgsPlomb.setSort((short) konPlombs.size());
            konPlombs.put((short) konPlombs.size(), cimSmgsPlomb);
        } else {
            Map<Short, CimSmgsPlomb> carPlombs = cimSmgsPlomb.getCimSmgsCarList().getCimSmgsPlombs();
            cimSmgsPlomb.setSort((short) carPlombs.size());
            carPlombs.put((short) carPlombs.size(), cimSmgsPlomb);
        }
        Map<Short, CimSmgsPlomb> cimSmgsPlombs = this.getCimSmgsPlombs();
        cimSmgsPlomb.setCimSmgs(this);
        cimSmgsPlombs.put((short) cimSmgsPlombs.size(), cimSmgsPlomb);
    }

    public boolean isSmgsOwner(String un) {
        return (this.un.equals(un));
    }

    public Long calcMassSend() {
        Long result = (long) 0;
        for (CimSmgsCarList elem : cimSmgsCarLists.values()) {
            if (elem.getMassSend() != null)
                result += elem.getMassSend();
        }
        return (result == 0 ? null : result);
    }


    /**
     * Подготавливает весь документ для сохранения
     */
    public void prepare4save(/*myUser user*/) {
        prepare4saveWoutCarLists();
        addCimSmgsCarLists();
    }

    /**
     * Подготавливает весь документ для сохранения
     * В случае, если был скопирован при помощи smgsAllCopyMapper
     */
    public void prepare4saveAfterCopy() {
        prepare4saveWoutCarLists();
        preparePlombs(this);
        // удаляем документы
        this.getCimSmgsDocses9().clear();
        addCimSmgsCarListsAfterCopy();
    }

    /**
     * Подготавливает  документ для сохранения
     * Записи о вагонах не подгатавливаются
     */
    private void prepare4saveWoutCarLists(/*myUser user*/) {
        addCimSmgsDocses7();
        addCimSmgsDocses9();
        addCimSmgsDocses13();
        addCimSmgsDocses136();
        addCimSmgsPlombs();
        addCimSmgsPlatels();
        addCimSmgsPerevoz();

        if (getTbcStatus() == null) {
            setTbcStatus((byte) 0);
        }
    }

    /**
     * Подгатавливает пломбы документа для сохранения
     * В случае, если был скопирован при помощи smgsAllCopyMapper
     *
     * @param smgs документ
     */
    private void preparePlombs(CimSmgs smgs) {
        smgs.getCimSmgsPlombs().clear();
        if (smgs.isContOtpr()) {
            removeCarPlombs(smgs.getCimSmgsCarLists().values());
        } else {
            for (CimSmgsCarList carList : smgs.getCimSmgsCarLists().values()) {
                removeConPlombs(carList.getCimSmgsKonLists().values());
            }
        }
    }

    private void removeCarPlombs(Collection<CimSmgsCarList> carLists) {
        for (CimSmgsCarList carList : carLists) {
            carList.getCimSmgsPlombs().clear();
        }
    }

    private void removeConPlombs(Collection<CimSmgsKonList> cimSmgsKonLists) {
        for (CimSmgsKonList konList : cimSmgsKonLists) {
            konList.getCimSmgsPlombs().clear();
        }
    }

    public void copyProps4Pack(CimSmgs from) {
        if (from.getG12() != null && from.getG12().trim().length() > 0)
            setG12(from.getG12().trim());
        if (from.getG121() != null && from.getG121().trim().length() > 0)
            setG121(from.getG121().trim());
        if (from.getG171() != null && from.getG171().trim().length() > 0)
            setG171(from.getG171().trim());
        if (from.getG17() != null && from.getG17().trim().length() > 0)
            setG17(from.getG17().trim());
        if (from.getG181() != null && from.getG181().trim().length() > 0)
            setG181(from.getG181().trim());
        if (from.getG18B1() != null && from.getG18B1().trim().length() > 0)
            setG18B1(from.getG18B1().trim());
        if (from.getG18B1a() != null && from.getG18B1a().trim().length() > 0)
            setG18B1a(from.getG18B1a().trim());
        if (from.getG18B1b() != null && from.getG18B1b().trim().length() > 0)
            setG18B1b(from.getG18B1b().trim());
        if (from.getG18B2() != null && from.getG18B2().trim().length() > 0)
            setG18B2(from.getG18B2().trim());
        if (from.getG694() != null && from.getG694().trim().length() > 0)
            setG694(from.getG694().trim());
        if (from.getCimSmgsCarLists().size() > 0) {
            CimSmgsKonList fromKon = from.getCimSmgsCarLists().get((byte) 0).getCimSmgsKonLists().get((byte) 0);
            CimSmgsGruz fromGruz = fromKon.getCimSmgsGruzs().get((byte) 0);
            for (CimSmgsCarList vag : getCimSmgsCarLists().values()) {
                for (CimSmgsKonList toKon : vag.getCimSmgsKonLists().values()) {
                    if (fromKon.getPlombs() != null && fromKon.getPlombs().trim().length() > 0)
                        toKon.setPlombs(fromKon.getPlombs().trim());
                    if (fromKon.getUtiN() != null && fromKon.getUtiN().trim().length() > 0)
                        toKon.setUtiN(fromKon.getUtiN().trim());

                    for (CimSmgsGruz toGruz : toKon.getCimSmgsGruzs().values()) {
                        if (fromGruz.getKgvn() != null && fromGruz.getKgvn().trim().length() > 0)
                            toGruz.setKgvn(fromGruz.getKgvn().trim());
                        if (fromGruz.getNzgr() != null && fromGruz.getNzgr().trim().length() > 0)
                            toGruz.setNzgr(fromGruz.getNzgr().trim());
                        break;
                    }
                    break;
                }
                break;
            }
        }
    }

    public void setCimSmgs(CimSmgs cimSmgs) {
        this.cimSmgs = cimSmgs;
    }

    public CimSmgs getCimSmgs() {
        return cimSmgs;
    }

    public void setCimSmgses(Set<CimSmgs> cimSmgses) {
        this.cimSmgses = cimSmgses;
    }

    public Set<CimSmgs> getCimSmgses() {
        return cimSmgses;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAviso_num(String aviso_num) {
        this.aviso_num = aviso_num;
    }

    public String getAviso_num() {
        return aviso_num;
    }

    public void setAviso_dat(Date aviso_dat) {
        this.aviso_dat = aviso_dat;
    }

    public Date getAviso_dat() {
        return aviso_dat;
    }

    public void setAviso_cod_dat(Date aviso_cod_dat) {
        this.aviso_cod_dat = aviso_cod_dat;
    }

    public Date getAviso_cod_dat() {
        return aviso_cod_dat;
    }

    public void setAviso_stavka(BigDecimal aviso_stavka) {
        this.aviso_stavka = aviso_stavka;
    }

    public BigDecimal getAviso_stavka() {
        return aviso_stavka;
    }

    public void setG11_prim(String g11_prim) {
        this.g11_prim = g11_prim;
    }

    public String getG11_prim() {
        return g11_prim;
    }

    public String getTbcNomer() {
        return tbcNomer;
    }

    public void setTbcNomer(String tbcNomer) {
        this.tbcNomer = tbcNomer;
    }

    public Byte getTbcStatus() {
        return tbcStatus;
    }

    public void setTbcStatus(Byte tbcStatus) {
        this.tbcStatus = tbcStatus;
    }

    public String getFtsNomer() {
        return ftsNomer;
    }

    public void setFtsNomer(String ftsNomer) {
        this.ftsNomer = ftsNomer;
    }

    public Byte getFtsStatus() {
        return ftsStatus;
    }

    public void setFtsStatus(Byte ftsStatus) {
        this.ftsStatus = ftsStatus;
    }

    public String g11_primDisp() {
        return (this.g11_prim != null ? this.g11_prim.replaceAll("\\n", "<br/>") : this.g11_prim);
    }

    public String buildGuGrPrimPrint() {
        return StringUtils.defaultString(g11_prim);
    }

    public String g23Disp() {
        StringBuffer result = new StringBuffer("");
        if (g23 != null && g23.length() > 0) {
            result.append("NHM-");
            result.append(g23);
        }
        if (g23b != null && g23b.length() > 0) {
            result.append("<br/>");
            result.append("ЕТ СНГ-");
            result.append(g23b);
        }
        return result.toString();
    }





    public String g29Disp() {
        StringBuffer result = new StringBuffer("");
        String sep = "";
        if (g29 != null && g29.length() > 0 && g29r != null && g29r.length() > 0) {
            sep = "&nbsp;&nbsp;/&nbsp;&nbsp;";
        }
        if (g29 != null && g29.length() > 0) {
            result.append(g29);
            result.append(sep);
        }
        result.append(g29r);
        return result.toString();
    }


    public boolean hasPack() {
        return this.getPackDoc() != null && this.getPackDoc().getHid() != null ? true : false;
    }
//
//    public void insertNewPacket(myUser user) {
//        PackDoc pack = new PackDoc();
//        pack.setRoute(getRoute());
//        pack.setUsrGroupsDir(user.getUsr().getGroup());
////        getPackDocDAO().makePersistent(pack);
//        pack.addCimSmgsItem(this);
//    }
//
//    public void preparePacket(myUser user) {
//        getPackDoc().setRoute(getRoute());
//        getPackDoc().setUsrGroupsDir(user.getUsr().getGroup());
////        getPackDocDAO().makePersistent(pack);
//        getPackDoc().addCimSmgsItem(this);
//    }




    //////////////////// Smgs2 print templates


    public List<CimSmgsGruz> getAndGroupAllgryzes()
    {
        List<CimSmgsGruz> allGryzes = new ArrayList<>();
        for (CimSmgsCarList car : this.getCimSmgsCarLists().values()) {
            for (CimSmgsGruz gruz : car.getCimSmgsGruzs().values()) {
                boolean add = true;
                for (CimSmgsGruz gruzFromlist : allGryzes) {
                    if (
                            (StringUtils.defaultString(gruzFromlist.getKgvn()).equals(StringUtils.defaultString(gruz.getKgvn()))) &&
                                    (StringUtils.defaultString(gruzFromlist.getEkgvn()).equals(StringUtils.defaultString(gruz.getEkgvn()))) &&
                                    (StringUtils.defaultString(gruzFromlist.getNzgr()).equals(StringUtils.defaultString(gruz.getNzgr()))) &&
                                    (StringUtils.defaultString(gruzFromlist.getUpak()).equals(StringUtils.defaultString(gruz.getUpak())))) {
                        if (gruz.getPlaces() != null)
                            gruzFromlist.setPlaces((gruzFromlist.getPlaces() != null ? gruzFromlist.getPlaces() : 0) + gruz.getPlaces());
                        if (gruz.getMassa() != null)
                            gruzFromlist.setMassa((gruzFromlist.getMassa() != null ? gruzFromlist.getMassa().add(gruz.getMassa()) : gruz.getMassa()));
                        gruzFromlist.getCimSmgsDanGruzs().putAll(gruz.getCimSmgsDanGruzs());
                        add = false;
                    }
                }
                if (add) {
                    CimSmgsGruz temp = new CimSmgsGruz();

                    temp.setKgvn(gruz.getKgvn());
                    temp.setEkgvn(gruz.getEkgvn());
                    temp.setNzgr(gruz.getNzgr());
                    temp.setNzgrEu(gruz.getNzgrEu());
                    temp.setMassa(gruz.getMassa());
                    temp.setPlaces(gruz.getPlaces());
                    temp.setPlacest(gruz.getPlacest());
                    temp.setUpak(gruz.getUpak());

                    temp.getCimSmgsDanGruzs().putAll(gruz.getCimSmgsDanGruzs());
                    allGryzes.add(temp);
                }
            }
        }
        return  allGryzes;
    }

    /**
     * Пересчитываем общий весс тары бруто для контейнерной перевозки
     */
    public void reCalculateTaraBruttoKont()
    {
        if(this.isContOtpr())
        {
            BigDecimal totalTara = new BigDecimal(0);
            BigDecimal totalMassa = new BigDecimal(0);
            for (CimSmgsCarList carList:getCimSmgsCarLists().values()) {
                for (CimSmgsKonList konList:carList.getCimSmgsKonLists().values()) {
                    if(konList.getTaraKont()!=null)
                        totalTara=totalTara.add(new BigDecimal(konList.getTaraKont()));
                    for (CimSmgsGruz gruz:konList.getCimSmgsGruzs().values()) {
                        if(gruz.getMassa()!=null)
                            totalMassa=totalMassa.add(gruz.getMassa());
                    }
                }
            }
            this.setG24N(totalMassa);
            this.setG24T(totalTara);
            this.setG24B(totalTara.add(totalMassa));
        }
    }
    /**
     * Пересчитываем общий весс тары бруто для контейнерной и вагонной перевозки
     */
    public void reCalculateTaraBruttoKontAll() {
        if (this.isContOtpr()) {
            reCalculateTaraBruttoKont();
        }
        else {
            BigDecimal totalTara = new BigDecimal(0);
            BigDecimal totalMassa = new BigDecimal(0);
            for (CimSmgsCarList carList : getCimSmgsCarLists().values()) {
                if (carList.getTaraVag() != null)
                    totalTara = totalTara.add(carList.getTaraVag());
                for (CimSmgsGruz gruz : carList.getCimSmgsGruzs().values()) {
                    if (gruz.getMassa() != null)
                        totalMassa = totalMassa.add(gruz.getMassa());
                }
            }
            this.setG24N(totalMassa);
            this.setG24T(totalTara);
            this.setG24B(totalTara.add(totalMassa));
        }
    }
    private boolean shouldPrintAdmCodes(){
        return  StringUtils.defaultString(getG12()).equals("22");
    }


    ////// DOP LIST
    public boolean hasDopList() {
        switch (docType1.intValue()) {
            case 7:  // smgs2
                return (zayav_otpr_c != null && zayav_otpr_c == 1) ||
                        (g141c != null && g141c == 1) ||
                        (g26c != null && g26c == 1) ||
                        (g7c != null && g7c == 1);
            default:
                return false;
        }
    }


    public boolean isContOtpr() {
        return getG25() == null || getG25() == 2;
    }

    public boolean notForDefaultView() {
        return getType() == 1 || getType() == 10 || getType() == 7 || getType() == 12 || getType() == 11 || getType() == 14;
    }

    public Long getHidCsGraph() {
        return hidCsGraph;
    }

    public void setHidCsGraph(Long hidCsGraph) {
        this.hidCsGraph = hidCsGraph;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CimSmgs cimSmgs1 = (CimSmgs) o;
        return Objects.equals(hid, cimSmgs1.hid) &&
                Objects.equals(g1, cimSmgs1.g1) &&
                Objects.equals(g2, cimSmgs1.g2) &&
                Objects.equals(g3, cimSmgs1.g3) &&
                Objects.equals(g4, cimSmgs1.g4) &&
                Objects.equals(g5, cimSmgs1.g5) &&
                Objects.equals(g6, cimSmgs1.g6) &&
                Objects.equals(g7, cimSmgs1.g7) &&
                Objects.equals(g8, cimSmgs1.g8) &&
                Objects.equals(g9, cimSmgs1.g9) &&
                Objects.equals(g10, cimSmgs1.g10) &&
                Objects.equals(g11, cimSmgs1.g11) &&
                Objects.equals(g12, cimSmgs1.g12) &&
                Objects.equals(g13, cimSmgs1.g13) &&
                Objects.equals(g141, cimSmgs1.g141) &&
                Objects.equals(g142, cimSmgs1.g142) &&
                Objects.equals(g15, cimSmgs1.g15) &&
                Objects.equals(g16, cimSmgs1.g16) &&
                Objects.equals(g161, cimSmgs1.g161) &&
                Objects.equals(g17, cimSmgs1.g17) &&
                Objects.equals(g18, cimSmgs1.g18) &&
                Objects.equals(g181, cimSmgs1.g181) &&
                Objects.equals(g19, cimSmgs1.g19) &&
                Objects.equals(g20, cimSmgs1.g20) &&
                Objects.equals(g21, cimSmgs1.g21) &&
                Objects.equals(g22, cimSmgs1.g22) &&
                Objects.equals(g23, cimSmgs1.g23) &&
                Objects.equals(g24, cimSmgs1.g24) &&
                Objects.equals(g25, cimSmgs1.g25) &&
                Objects.equals(g26, cimSmgs1.g26) &&
                Objects.equals(g27, cimSmgs1.g27) &&
                Objects.equals(g28, cimSmgs1.g28) &&
                Objects.equals(g281, cimSmgs1.g281) &&
                Objects.equals(g29, cimSmgs1.g29) &&
                Objects.equals(g30, cimSmgs1.g30) &&
                Objects.equals(g301, cimSmgs1.g301) &&
                Objects.equals(un, cimSmgs1.un) &&
                Objects.equals(trans, cimSmgs1.trans) &&
                Objects.equals(g40, cimSmgs1.g40) &&
                Objects.equals(g44, cimSmgs1.g44) &&
                Objects.equals(g191, cimSmgs1.g191) &&
                Objects.equals(g192, cimSmgs1.g192) &&
                Objects.equals(g193, cimSmgs1.g193) &&
                Objects.equals(g48, cimSmgs1.g48) &&
                Objects.equals(g41, cimSmgs1.g41) &&
                Objects.equals(g45, cimSmgs1.g45) &&
                Objects.equals(ga491, cimSmgs1.ga491) &&
                Objects.equals(gb491, cimSmgs1.gb491) &&
                Objects.equals(ga492, cimSmgs1.ga492) &&
                Objects.equals(gb492, cimSmgs1.gb492) &&
                Objects.equals(ga493, cimSmgs1.ga493) &&
                Objects.equals(gb493, cimSmgs1.gb493) &&
                Objects.equals(ga494, cimSmgs1.ga494) &&
                Objects.equals(gb494, cimSmgs1.gb494) &&
                Objects.equals(ga50, cimSmgs1.ga50) &&
                Objects.equals(gb50, cimSmgs1.gb50) &&
                Objects.equals(ga52, cimSmgs1.ga52) &&
                Objects.equals(gb52, cimSmgs1.gb52) &&
                Objects.equals(ga51, cimSmgs1.ga51) &&
                Objects.equals(gb51, cimSmgs1.gb51) &&
                Objects.equals(ga53, cimSmgs1.ga53) &&
                Objects.equals(gb53, cimSmgs1.gb53) &&
                Objects.equals(ga54, cimSmgs1.ga54) &&
                Objects.equals(gb54, cimSmgs1.gb54) &&
                Objects.equals(ga55, cimSmgs1.ga55) &&
                Objects.equals(gb55, cimSmgs1.gb55) &&
                Objects.equals(ga56, cimSmgs1.ga56) &&
                Objects.equals(gb56, cimSmgs1.gb56) &&
                Objects.equals(ga57, cimSmgs1.ga57) &&
                Objects.equals(gb57, cimSmgs1.gb57) &&
                Objects.equals(g591, cimSmgs1.g591) &&
                Objects.equals(g592, cimSmgs1.g592) &&
                Objects.equals(g593, cimSmgs1.g593) &&
                Objects.equals(g594, cimSmgs1.g594) &&
                Objects.equals(g595, cimSmgs1.g595) &&
                Objects.equals(g596, cimSmgs1.g596) &&
                Objects.equals(g597, cimSmgs1.g597) &&
                Objects.equals(g598, cimSmgs1.g598) &&
                Objects.equals(g60, cimSmgs1.g60) &&
                Objects.equals(g61, cimSmgs1.g61) &&
                Objects.equals(g611, cimSmgs1.g611) &&
                Objects.equals(g612, cimSmgs1.g612) &&
                Objects.equals(g43, cimSmgs1.g43) &&
                Objects.equals(g47, cimSmgs1.g47) &&
                Objects.equals(g63, cimSmgs1.g63) &&
                Objects.equals(g64, cimSmgs1.g64) &&
                Objects.equals(g65, cimSmgs1.g65) &&
                Objects.equals(g651, cimSmgs1.g651) &&
                Objects.equals(g652, cimSmgs1.g652) &&
                Objects.equals(ga66, cimSmgs1.ga66) &&
                Objects.equals(gb661, cimSmgs1.gb661) &&
                Objects.equals(gb662, cimSmgs1.gb662) &&
                Objects.equals(g67, cimSmgs1.g67) &&
                Objects.equals(g691, cimSmgs1.g691) &&
                Objects.equals(g692, cimSmgs1.g692) &&
                Objects.equals(g693, cimSmgs1.g693) &&
                Objects.equals(g694, cimSmgs1.g694) &&
                Objects.equals(g68, cimSmgs1.g68) &&
                Objects.equals(g62, cimSmgs1.g62) &&
                Objects.equals(g621, cimSmgs1.g621) &&
                Objects.equals(g622, cimSmgs1.g622) &&
                Objects.equals(g38, cimSmgs1.g38) &&
                Objects.equals(g39, cimSmgs1.g39) &&
                Objects.equals(g18B1, cimSmgs1.g18B1) &&
                Objects.equals(g18B2, cimSmgs1.g18B2) &&
                Objects.equals(ga581, cimSmgs1.ga581) &&
                Objects.equals(gb581, cimSmgs1.gb581) &&
                Objects.equals(ga582, cimSmgs1.ga582) &&
                Objects.equals(gb582, cimSmgs1.gb582) &&
                Objects.equals(ga583, cimSmgs1.ga583) &&
                Objects.equals(gb583, cimSmgs1.gb583) &&
                Objects.equals(ga584, cimSmgs1.ga584) &&
                Objects.equals(gb584, cimSmgs1.gb584) &&
                Objects.equals(ga585, cimSmgs1.ga585) &&
                Objects.equals(gb585, cimSmgs1.gb585) &&
                Objects.equals(ga586, cimSmgs1.ga586) &&
                Objects.equals(gb586, cimSmgs1.gb586) &&
                Objects.equals(g20100, cimSmgs1.g20100) &&
                Objects.equals(g42, cimSmgs1.g42) &&
                Objects.equals(g46, cimSmgs1.g46) &&
                Objects.equals(g11_1, cimSmgs1.g11_1) &&
                Objects.equals(g12_1, cimSmgs1.g12_1) &&
                Objects.equals(g13_1, cimSmgs1.g13_1) &&
                Objects.equals(g41_1, cimSmgs1.g41_1) &&
                Objects.equals(g42_1, cimSmgs1.g42_1) &&
                Objects.equals(g43_1, cimSmgs1.g43_1) &&
                Objects.equals(hidCim, cimSmgs1.hidCim) &&
                Objects.equals(hidCsGraph, cimSmgs1.hidCsGraph) &&
                Objects.equals(hidIcf, cimSmgs1.hidIcf) &&
                Objects.equals(hidSp, cimSmgs1.hidSp) &&
                Objects.equals(hidSmgs, cimSmgs1.hidSmgs) &&
                Objects.equals(iftminId, cimSmgs1.iftminId) &&
                Objects.equals(iftminOut, cimSmgs1.iftminOut) &&
                Objects.equals(iftminIn, cimSmgs1.iftminIn) &&
                Objects.equals(iftminId2, cimSmgs1.iftminId2) &&
                Objects.equals(iftminOut2, cimSmgs1.iftminOut2) &&
                Objects.equals(iftminIn2, cimSmgs1.iftminIn2) &&
                Objects.equals(g121, cimSmgs1.g121) &&
                Objects.equals(g24N, cimSmgs1.g24N) &&
                Objects.equals(g24T, cimSmgs1.g24T) &&
                Objects.equals(g24B, cimSmgs1.g24B) &&
                Objects.equals(statusBr, cimSmgs1.statusBr) &&
                Objects.equals(altered, cimSmgs1.altered) &&
                Objects.equals(g1r, cimSmgs1.g1r) &&
                Objects.equals(g14, cimSmgs1.g14) &&
                Objects.equals(g4r, cimSmgs1.g4r) &&
                Objects.equals(g7r, cimSmgs1.g7r) &&
                Objects.equals(g9r, cimSmgs1.g9r) &&
                Objects.equals(g101, cimSmgs1.g101) &&
                Objects.equals(g101r, cimSmgs1.g101r) &&
                Objects.equals(g102, cimSmgs1.g102) &&
                Objects.equals(g102r, cimSmgs1.g102r) &&
                Objects.equals(g13r, cimSmgs1.g13r) &&
                Objects.equals(g15r, cimSmgs1.g15r) &&
                Objects.equals(g162, cimSmgs1.g162) &&
                Objects.equals(g162r, cimSmgs1.g162r) &&
                Objects.equals(g163, cimSmgs1.g163) &&
                Objects.equals(g163r, cimSmgs1.g163r) &&
                Objects.equals(g18r, cimSmgs1.g18r) &&
                Objects.equals(g29r, cimSmgs1.g29r) &&
                Objects.equals(profile, cimSmgs1.profile) &&
                Objects.equals(targGr, cimSmgs1.targGr) &&
                Objects.equals(avFields, cimSmgs1.avFields) &&
                Objects.equals(g1c, cimSmgs1.g1c) &&
                Objects.equals(g4c, cimSmgs1.g4c) &&
                Objects.equals(g7c, cimSmgs1.g7c) &&
                Objects.equals(g9c, cimSmgs1.g9c) &&
                Objects.equals(g13c, cimSmgs1.g13c) &&
                Objects.equals(g15c, cimSmgs1.g15c) &&
                Objects.equals(g18c, cimSmgs1.g18c) &&
                Objects.equals(g20c, cimSmgs1.g20c) &&
                Objects.equals(numClaim, cimSmgs1.numClaim) &&
                Objects.equals(g15_1, cimSmgs1.g15_1) &&
                Objects.equals(g16_1, cimSmgs1.g16_1) &&
                Objects.equals(g16r, cimSmgs1.g16r) &&
                Objects.equals(g17_1, cimSmgs1.g17_1) &&
                Objects.equals(g18_1, cimSmgs1.g18_1) &&
                Objects.equals(g18r_1, cimSmgs1.g18r_1) &&
                Objects.equals(g19_1, cimSmgs1.g19_1) &&
                Objects.equals(g19r, cimSmgs1.g19r) &&
                Objects.equals(g45_1, cimSmgs1.g45_1) &&
                Objects.equals(g46_1, cimSmgs1.g46_1) &&
                Objects.equals(g46r, cimSmgs1.g46r) &&
                Objects.equals(g47_1, cimSmgs1.g47_1) &&
                Objects.equals(g48_1, cimSmgs1.g48_1) &&
                Objects.equals(g48r, cimSmgs1.g48r) &&
                Objects.equals(g49, cimSmgs1.g49) &&
                Objects.equals(g49r, cimSmgs1.g49r) &&
                Objects.equals(g201, cimSmgs1.g201) &&
                Objects.equals(g202, cimSmgs1.g202) &&
                Objects.equals(g202r, cimSmgs1.g202r) &&
                Objects.equals(g203, cimSmgs1.g203) &&
                Objects.equals(g204, cimSmgs1.g204) &&
                Objects.equals(g205, cimSmgs1.g205) &&
                Objects.equals(g206, cimSmgs1.g206) &&
                Objects.equals(g206r, cimSmgs1.g206r) &&
                Objects.equals(g207, cimSmgs1.g207) &&
                Objects.equals(g207r, cimSmgs1.g207r) &&
                Objects.equals(g208, cimSmgs1.g208) &&
                Objects.equals(g209, cimSmgs1.g209) &&
                Objects.equals(g209r, cimSmgs1.g209r) &&
                Objects.equals(g2010, cimSmgs1.g2010) &&
                Objects.equals(g2011, cimSmgs1.g2011) &&
                Objects.equals(g2012, cimSmgs1.g2012) &&
                Objects.equals(g2013, cimSmgs1.g2013) &&
                Objects.equals(g2014, cimSmgs1.g2014) &&
                Objects.equals(g2014r, cimSmgs1.g2014r) &&
                Objects.equals(g2015, cimSmgs1.g2015) &&
                Objects.equals(g2016, cimSmgs1.g2016) &&
                Objects.equals(g2017, cimSmgs1.g2017) &&
                Objects.equals(g2017r, cimSmgs1.g2017r) &&
                Objects.equals(g2011r, cimSmgs1.g2011r) &&
                Objects.equals(g110, cimSmgs1.g110) &&
                Objects.equals(g111, cimSmgs1.g111) &&
                Objects.equals(g112, cimSmgs1.g112) &&
                Objects.equals(g410, cimSmgs1.g410) &&
                Objects.equals(g411, cimSmgs1.g411) &&
                Objects.equals(g412, cimSmgs1.g412) &&
                Objects.equals(ready, cimSmgs1.ready) &&
                Objects.equals(g171, cimSmgs1.g171) &&
                Objects.equals(g2018, cimSmgs1.g2018) &&
                Objects.equals(g2018r, cimSmgs1.g2018r) &&
                Objects.equals(g_10_3r, cimSmgs1.g_10_3r) &&
                Objects.equals(g_16_33r, cimSmgs1.g_16_33r) &&
                Objects.equals(g44_1, cimSmgs1.g44_1) &&
                Objects.equals(status, cimSmgs1.status) &&
                Objects.equals(btlc_status, cimSmgs1.btlc_status) &&
                Objects.equals(tdg_status1, cimSmgs1.tdg_status1) &&
                Objects.equals(tdg_status2, cimSmgs1.tdg_status2) &&
                Objects.equals(greenRail_status, cimSmgs1.greenRail_status) &&
                Objects.equals(zayav_otpr, cimSmgs1.zayav_otpr) &&
                Objects.equals(zayav_otpr_c, cimSmgs1.zayav_otpr_c) &&
                Objects.equals(g141c, cimSmgs1.g141c) &&
                Objects.equals(g26c, cimSmgs1.g26c) &&
                Objects.equals(ga661, cimSmgs1.ga661) &&
                Objects.equals(ga662, cimSmgs1.ga662) &&
                Objects.equals(g23b, cimSmgs1.g23b) &&
                Objects.equals(g74_1, cimSmgs1.g74_1) &&
                Objects.equals(g74_2, cimSmgs1.g74_2) &&
                Objects.equals(type, cimSmgs1.type) &&
                Objects.equals(gs_48, cimSmgs1.gs_48) &&
                Objects.equals(wdefnc, cimSmgs1.wdefnc) &&
                Objects.equals(gs_22, cimSmgs1.gs_22) &&
                Objects.equals(gs_24, cimSmgs1.gs_24) &&
                Objects.equals(gs_141_1, cimSmgs1.gs_141_1) &&
                Objects.equals(gs_141_2, cimSmgs1.gs_141_2) &&
                Objects.equals(gs_66_1, cimSmgs1.gs_66_1) &&
                Objects.equals(g18B1a, cimSmgs1.g18B1a) &&
                Objects.equals(g18B1b, cimSmgs1.g18B1b) &&
                Objects.equals(g18B1c, cimSmgs1.g18B1c) &&
                Objects.equals(g18B1d, cimSmgs1.g18B1d) &&
                Objects.equals(amount, cimSmgs1.amount) &&
                Objects.equals(aviso_num, cimSmgs1.aviso_num) &&
                Objects.equals(aviso_dat, cimSmgs1.aviso_dat) &&
                Objects.equals(aviso_cod_dat, cimSmgs1.aviso_cod_dat) &&
                Objects.equals(aviso_stavka, cimSmgs1.aviso_stavka) &&
                Objects.equals(g11_prim, cimSmgs1.g11_prim) &&
                Objects.equals(g_1_5k, cimSmgs1.g_1_5k) &&
                Objects.equals(g_4_5k, cimSmgs1.g_4_5k) &&
                Objects.equals(route != null ? route.getHid() : "", cimSmgs1.route != null ? cimSmgs1.route.getHid() : "") &&
                Objects.equals(packDoc != null ? packDoc.getHid() : "", cimSmgs1.packDoc != null ? cimSmgs1.packDoc.getHid() : "") &&
                Objects.equals(g4prim, cimSmgs1.g4prim) &&
                Objects.equals(guInf, cimSmgs1.guInf) &&
                Objects.equals(perevozchik, cimSmgs1.perevozchik) &&
                Objects.equals(tarifShema, cimSmgs1.tarifShema) &&
                Objects.equals(tarifVOtpr, cimSmgs1.tarifVOtpr) &&
                Objects.equals(platezhKm, cimSmgs1.platezhKm) &&
                Objects.equals(platezhRub, cimSmgs1.platezhRub) &&
                Objects.equals(platezhKop, cimSmgs1.platezhKop) &&
                Objects.equals(provozPlata, cimSmgs1.provozPlata) &&
                Objects.equals(zpuInfo, cimSmgs1.zpuInfo) &&
                Objects.equals(trueInfo, cimSmgs1.trueInfo) &&
                Objects.equals(vizaNo, cimSmgs1.vizaNo) &&
                Objects.equals(perevozSign, cimSmgs1.perevozSign) &&
                Objects.equals(perevozDate, cimSmgs1.perevozDate) &&
                Objects.equals(sborCennost1, cimSmgs1.sborCennost1) &&
                Objects.equals(sborCennost2, cimSmgs1.sborCennost2) &&
                Objects.equals(otprItogo, cimSmgs1.otprItogo) &&
                Objects.equals(tbcNomer, cimSmgs1.tbcNomer) &&
                Objects.equals(tbcStatus, cimSmgs1.tbcStatus) &&
                Objects.equals(zakazNo, cimSmgs1.zakazNo) &&
                Objects.equals(cim, cimSmgs1.cim) &&
                Objects.equals(incoterms, cimSmgs1.incoterms) &&
                Objects.equals(kodUslPost, cimSmgs1.kodUslPost) &&
                Objects.equals(frankofracht, cimSmgs1.frankofracht) &&
                Objects.equals(otmPoluch, cimSmgs1.otmPoluch) &&
                Objects.equals(vidKontOtpr, cimSmgs1.vidKontOtpr) &&
                Objects.equals(platform, cimSmgs1.platform) &&
                Objects.equals(docNum, cimSmgs1.docNum) &&
                Objects.equals(tehUslG12, cimSmgs1.tehUslG12) &&
                Objects.equals(grOtpFio, cimSmgs1.grOtpFio) &&
                Objects.equals(g104, cimSmgs1.g104) &&
                Objects.equals(g164, cimSmgs1.g164) &&
                Objects.equals(npoezd, cimSmgs1.npoezd) &&
                Objects.equals(vagPrim, cimSmgs1.vagPrim) &&
                Objects.equals(nettoPref, cimSmgs1.nettoPref) &&
                Objects.equals(taraPref, cimSmgs1.taraPref) &&
                Objects.equals(bruttoPref, cimSmgs1.bruttoPref) &&
                Objects.equals(kontKol, cimSmgs1.kontKol) &&
                Objects.equals(g2_1, cimSmgs1.g2_1) &&
                Objects.equals(g5_1, cimSmgs1.g5_1) &&
                Objects.equals(docType1, cimSmgs1.docType1) &&
                Objects.equals(plat, cimSmgs1.plat) &&
                Objects.equals(plat1, cimSmgs1.plat1) &&
                Objects.equals(gu, cimSmgs1.gu) &&
                Objects.equals(sborCennost11, cimSmgs1.sborCennost11) &&
                Objects.equals(sborCennost21, cimSmgs1.sborCennost21) &&
                Objects.equals(sborCennost22, cimSmgs1.sborCennost22) &&
                Objects.equals(ftsNomer, cimSmgs1.ftsNomer) &&
                Objects.equals(ftsStatus, cimSmgs1.ftsStatus) &&
                Objects.equals(zpuInfo1, cimSmgs1.zpuInfo1) &&
                Objects.equals(index_p, cimSmgs1.index_p) &&
                Objects.equals(n_ppv, cimSmgs1.n_ppv) &&
                Objects.equals(nppr, cimSmgs1.nppr) &&
                Objects.equals(dprb, cimSmgs1.dprb) &&
                Objects.equals(g_2inn, cimSmgs1.g_2inn) &&
                Objects.equals(g_5inn, cimSmgs1.g_5inn) &&
                Objects.equals(ftsDocId, cimSmgs1.ftsDocId) &&
                Objects.equals(g_24_bcn, cimSmgs1.g_24_bcn) &&
                Objects.equals(g36, cimSmgs1.g36) &&
                Objects.equals(g25Txt, cimSmgs1.g25Txt) &&
                Objects.equals(g2_, cimSmgs1.g2_) &&
                Objects.equals(g5_, cimSmgs1.g5_) &&
                Objects.equals(n_packet, cimSmgs1.n_packet) &&
                Objects.equals(g7_, cimSmgs1.g7_) &&
                Objects.equals(g3_, cimSmgs1.g3_) &&
                Objects.equals(sort, cimSmgs1.sort) &&
                Objects.equals(kind, cimSmgs1.kind) &&
                Objects.equals(send_br, cimSmgs1.send_br) &&
                Objects.equals(src, cimSmgs1.src) &&
                Objects.equals(src, cimSmgs1.g1_dop_info) &&
                Objects.equals(src, cimSmgs1.g4_dop_info) &&
                Objects.equals(src, cimSmgs1.g16_dop_info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12, g13, g141, g142, g15, g16, g161, g17, g18, g181, g19, g20, g21,  g22,  g23, g24, g25,
                g26, g27, g28, g281, g29, g30, g301, un, trans, g40, g44, g191, g192, g193, g48, g41, g45, ga491, gb491, ga492, gb492, ga493, gb493, ga494, gb494, ga50, gb50, ga52,
                gb52, ga51, gb51, ga53, gb53, ga54, gb54, ga55, gb55, ga56, gb56, ga57, gb57, g591, g592, g593, g594, g595, g596, g597, g598, g60, g61, g611, g612, g43, g47, g63, g64,
                g65, g651, g652, ga66, gb661, gb662, g67, g691, g692, g693, g694, g68, g62, g621, g622, g38, g39, g18B1, g18B2, ga581, gb581, ga582, gb582, ga583, gb583, ga584, gb584,
                ga585, gb585, ga586, gb586, g20100, g42, g46, g11_1, g12_1, g13_1, g41_1, g42_1, g43_1,hidCsGraph, hidCim, hidIcf, hidSp, hidSmgs, iftminId, iftminOut, iftminIn, iftminId2, iftminOut2,
                iftminIn2, g121, g24N, g24T, g24B, statusBr, altered, g1r, g14, g4r, g7r, g9r, g101, g101r, g102, g102r, g13r, g15r, g162, g162r, g163, g163r, g18r, g29r, profile, targGr,
                avFields, g1c, g4c, g7c, g9c, g13c, g15c, g18c, g20c, numClaim, g15_1, g16_1, g16r, g17_1, g18_1, g18r_1, g19_1, g19r, g45_1, g46_1, g46r, g47_1, g48_1, g48r, g49, g49r, g201,
                g202, g202r, g203, g204, g205, g206, g206r, g207, g207r, g208, g209, g209r, g2010, g2011, g2012, g2013, g2014, g2014r, g2015, g2016, g2017, g2017r, g2011r, g110, g111, g112,
                g410, g411, g412, ready, g171, g2018, g2018r, g_10_3r, g_16_33r, g44_1, status, btlc_status, tdg_status1, tdg_status2, greenRail_status, zayav_otpr, zayav_otpr_c, g141c, g26c,
                ga661, ga662, g23b, g74_1, g74_2, type, gs_48, wdefnc, gs_22, gs_24, gs_141_1, gs_141_2, gs_66_1, g18B1a, g18B1b, g18B1c, g18B1d, amount, aviso_num, aviso_dat, aviso_cod_dat, aviso_stavka,
                g11_prim, g_1_5k, g_4_5k, route != null ? route.getHid() : "", packDoc != null ? packDoc.getHid() : "", g4prim, guInf, perevozchik, tarifShema, tarifVOtpr, platezhKm, platezhRub, platezhKop, provozPlata, zpuInfo, trueInfo, vizaNo, perevozSign,
                perevozDate, sborCennost1, sborCennost2, otprItogo, tbcNomer, tbcStatus, zakazNo, cim, incoterms, kodUslPost, frankofracht, otmPoluch, vidKontOtpr, platform, docNum, tehUslG12,
                grOtpFio, g104, g164, npoezd, vagPrim, nettoPref, taraPref, bruttoPref, kontKol, g2_1, g5_1, docType1, plat, plat1, gu, sborCennost11, sborCennost21, sborCennost22, ftsNomer,
                ftsStatus, zpuInfo1, index_p, n_ppv, nppr, dprb, g_2inn, g_5inn, ftsDocId, g_24_bcn, g36, g25Txt, g2_, g5_, n_packet, g7_, g3_, sort, kind, send_br, src, g1_dop_info, g4_dop_info, g16_dop_info);
    }

    public Otpravka calcOtpravka() {
        for (CimSmgsCarList vag : getCimSmgsCarLists().values()) {
            if (!vag.getCimSmgsKonLists().isEmpty()) {
                return Otpravka.CONT;
            }
        }
        for (CimSmgsCarList vag : getCimSmgsCarLists().values()) {
            if (!vag.getCimSmgsGruzs().isEmpty()) {
                return Otpravka.VAG;
            }
        }
        if (getG25() != null) {
            if (getG25() == 2) {
                return Otpravka.CONT;
            } else if (getG25() == 1) {
                return Otpravka.VAG;
            }
        }
        return Otpravka.UNKNOWN;
    }

    public int calcVags() {
        return getCimSmgsCarLists().size();
    }

    public int calcConts() {
        int count = 0;
        for (CimSmgsCarList vag : getCimSmgsCarLists().values()) {
            count += vag.getCimSmgsKonLists().size();
        }
        return count;
    }

    public List<String> calcNvags() {
        return getCimSmgsCarLists().values().stream().map(CimSmgsCarList::getNvag).filter(StringUtils::isNotBlank).collect(Collectors.toList());
    }

    public List<String> calcUtiNs() {
        return
                getCimSmgsCarLists().values().stream().
                        map(cimSmgsCarList -> cimSmgsCarList.getCimSmgsKonLists().values()).
                        flatMap(Collection::stream).
                        map(CimSmgsKonList::getUtiN).
                        filter(StringUtils::isNotBlank).
                        collect(Collectors.toList());
    }


    enum Otpravka {
        VAG, CONT, UNKNOWN
    }

    /**
     * Преобразует пломбы документа в строку
     * @return строка пломб
     */
    public String plombsToString()
    {
        StringBuilder plombs= new StringBuilder();
        for (CimSmgsPlomb plomb : this.getCimSmgsPlombs().values()) {
            if (plomb.getKpl() != null) {
                for (int i = 0; i < plomb.getKpl(); i++) {
                    if (plomb.getZnak() != null) {
                        if (plombs.length() > 0)
                            plombs.append(",");
                        plombs.append(plomb.getZnak().replaceAll("\n",""));
                    }
                }
            }
            else {
                if (plomb.getZnak() != null) {
                    if (plombs.length() > 0)
                        plombs.append(",");
                    plombs.append(plomb.getZnak());
                }
            }
        }
        return plombs.toString();
    }

    public void deletePlombsFromKonList(CimSmgsKonList konList) {
        CimSmgsCarList carList = konList.getCimSmgsCarList();

        konList.getCimSmgsPlombs().clear();
        carList.getCimSmgsPlombs().clear();

        List<Short> pl2del = new ArrayList<>();
        for (Short sort : this.getCimSmgsPlombs().keySet()) {
            CimSmgsPlomb plomb = this.getCimSmgsPlombs().get(sort);
            if (plomb.getCimSmgsKonList().getHid().equals(konList.getHid()))
                pl2del.add(sort);
        }
        for (Short sort : pl2del) {
            this.getCimSmgsPlombs().remove(sort);
        }
    }
    public void addPlombs2konList(List<String>plombs, CimSmgsKonList konList){
        for (String plombString:plombs) {
            CimSmgsPlomb plomb = new CimSmgsPlomb();
            plomb.setZnak(plombString);
            plomb.setSort((short) konList.getCimSmgsPlombs().size());
            plomb.setKpl((short) 1);
            konList.addCimSmgsPlombItem(plomb);
            this.addPlomb(plomb);
        }
    }

    /**
     * Меняет тип отправки на противоположный (контейнерная/вагонная)
     */
    public void revertSmgsType(){
        if(this.isContOtpr()){
            this.setG25((byte) 1);
            for (CimSmgsCarList carList:this.getCimSmgsCarLists().values()) {
                for (CimSmgsKonList konList:carList.getCimSmgsKonLists().values()) {
                    // переносим пломбы на вагон с контейнера
                    for (CimSmgsPlomb plomb:konList.getCimSmgsPlombs().values()) {
                        plomb.setCimSmgsKonList(null);
                        plomb.setCimSmgsCarList(carList);
                        plomb.setSort((short) carList.getCimSmgsPlombs().size());
                        carList.addCimSmgsPlombItem(plomb);
                    }
                    konList.getCimSmgsPlombs().clear();
                    // переносим грузы на вагон с контейнера
                    for (CimSmgsGruz gruz: konList.getCimSmgsGruzs().values()) {
                        gruz.setCimSmgsKonList(null);
                        gruz.setCimSmgsCarList(carList);
                        gruz.setSort( carList.getCimSmgsGruzs().size());
                        carList.addCimSmgsGruzItem(gruz);
                    }
                    konList.getCimSmgsGruzs().clear();

                    // переносим документы с контейнера на вагон
                    for (CimSmgsDocs docs:konList.getCimSmgsDocses9().values()) {
                        docs.setCimSmgsCarList(carList);
                        docs.setCimSmgsKonList(null);
                        docs.setSort(carList.getCimSmgsDocses9().size());
                        carList.addCimSmgsDocsItem(docs);
                    }
                    konList.getCimSmgsDocses9().clear();
                    carList.getCimSmgsKonLists().clear();
                }
            }
        }else{
            this.setG25((byte) 2);
            for (CimSmgsCarList carList:this.getCimSmgsCarLists().values()) {
                CimSmgsKonList newKonList = new CimSmgsKonList();
                newKonList.setSort((byte) 0);
                carList.addCimSmgsKonListItem(newKonList);
                // переносим пломбы на контейнер c вагона
                for (CimSmgsPlomb plomb:carList.getCimSmgsPlombs().values()) {
                    plomb.setCimSmgsKonList(newKonList);
                    plomb.setCimSmgsCarList(carList);
                    plomb.setSort((short) newKonList.getCimSmgsPlombs().size());
                    newKonList.addCimSmgsPlombItem(plomb);
                }
                carList.getCimSmgsPlombs().clear();
                // переносим грузы на контейнер c вагона
                for (CimSmgsGruz gruz: carList.getCimSmgsGruzs().values()) {

                    gruz.setCimSmgsKonList(newKonList);
                    gruz.setCimSmgsCarList(carList);
                    gruz.setSort( newKonList.getCimSmgsGruzs().size());
                    newKonList.addCimSmgsGruzItem(gruz);
                }

                // переносим документы на контейнер c вагона
                for (CimSmgsDocs docs:carList.getCimSmgsDocses9().values()) {
                    docs.setCimSmgsCarList(carList);
                    docs.setCimSmgsKonList(newKonList);
                    docs.setSort(newKonList.getCimSmgsDocses9().size());
                    newKonList.addCimSmgsDocsItem(docs);
                }
                carList.getCimSmgsDocses9().clear();
            }
        }
    }

    /**
     * Генерирует строку пломб для документов CIM
     * @return строку пломб
     */

    public String generateCimPlombString(){
        List<String> plombString= new ArrayList<>();

        for (CimSmgsCarList carList: cimSmgsCarLists.values()) {
            for (CimSmgsPlomb plomb: carList.getCimSmgsPlombs().values()) {
                plombString.add(
                        (plomb.getKpl()!=null?(plomb.getKpl()+"x "):"")+
                                StringUtils.defaultString(plomb.getZnak()));
            }

            for (CimSmgsKonList konList:carList.getCimSmgsKonLists().values()) {
                for (CimSmgsPlomb plomb: konList.getCimSmgsPlombs().values()) {
                    plombString.add(
                            (plomb.getKpl()!=null?(plomb.getKpl()+"x "):"")+
                                    StringUtils.defaultString(plomb.getZnak()));
                }
            }
        }

        if(plombString.size()==0)
            return "verschlüsse / пломбы 0 (Siehe Nachweisung / см.ведомость)";

        return  String.join(", ",plombString);
    }


    public List<CimSmgsGruz> getAllGruzs(){
        List<CimSmgsGruz> gruzs = new ArrayList<>();

        for(CimSmgsCarList carList: getCimSmgsCarLists().values()){
            if(isContOtpr()) {
                for(CimSmgsKonList konList: carList.getCimSmgsKonLists().values()){
                    gruzs.addAll(konList.getCimSmgsGruzs().values());
                }
            }else{
                gruzs.addAll(carList.getCimSmgsGruzs().values());
            }
        }

        return gruzs;
    }
}
