//package com.example.WGR_hibernate6.model.cimsmgs;
//
//import com.example.WGR_hibernate6.commons.money2str;
//import com.example.WGR_hibernate6.model.Status;
//import org.apache.commons.lang3.StringUtils;
//
//import java.math.BigDecimal;
//import java.text.SimpleDateFormat;
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class CimSmgsPrint{
//    final public String DOP_LIST_PRINT_CS2 = "Смотри доп. лист";
//    final public String SEE_IN_VED = "Согласно ведомости";
//public static final BigDecimal EPD_DOC_TYPE_HID = new BigDecimal(0);
//public static final String DOC_TYPE_HID_PROP_NAME = "docType1";
//public static final byte EPD_DOC_TYPE = 0;
//public final static String LIST_DOP_RU = "см. Лист дополнений";
//public static final String TABLE_DELIMITER="%%%;;;";
//public final static  String PRINT_TABLE_DELIMITER =" "+TABLE_DELIMITER+" ";
//
//private final FastDateFormat df= FastDateFormat.getInstance("dd.MM.yyyy");
//    public boolean isEpd() {
//        return this.getDocType1() != null && this.getDocType1().equals(EPD_DOC_TYPE_HID);
//    }
//
//    public String buildG15r_cs() {
//        return StringUtils.defaultString(this.g15r);
//    }
//
//    public String buildG15r_csPrint() {
//        if (getG15c() != null && getG15c() == 1) {
////            return LIST_DOP_RU;
//            return getText("form.labelDopList");
//        } else {
//            return buildG15r_cs();
//        }
//    }
//    public String g20Disp4Print() {
//        String _g20a = (g201 != null ? g201 : "") + " ";
//        String _g20b = (g2010 != null ? g2010 : "") + "(" + (g2011 != null ? g2011 : "") + ") ";
//        String _g20c = (g206 != null ? g206 : "") + " " + (g202 != null ? g202 : "") + " " + (g203 != null ? g203 : "") + " "
//                + (g204 != null ? g204 : "") + " " + (g205 != null ? g205 : "") + " " + (g207 != null ? g207 : "") + " " + (g209 != null ? g209 : "");
//        String _g20d = /* (g2012 != null ? g2012 : "") + " " + */(g2013 != null ? g2013 : "") + " " + (g2014 != null ? g2014 : "") + " "
//                + (g2015 != null ? g2015 : "") + " " + (g2016 != null ? g2016 : "") + " " + (g2017 != null ? g2017 : "")
//                + (g2018 != null && g2018.length() > 0 ? "<br/>" + g2018 : "");
//
//        String _g20ar = (g201 != null ? g201 : "") + " ";
//        String _g20br = (g2010 != null ? g2010 : "") + "(" + (g2011r != null ? g2011r : "") + ") ";
//        String _g20cr = (g206r != null ? g206r : "") + " " + (g202r != null ? g202r : "") + " " + (g203 != null ? g203 : "") + " "
//                + (g204 != null ? g204 : "") + " " + (g205 != null ? g205 : "") + " " + (g207r != null ? g207r : "") + " "
//                + (g209r != null ? g209r : "");
//        String _g20dr = /* (g2012 != null ? g2012 : "") + " " + */(g2013 != null ? g2013 : "") + " " + (g2014r != null ? g2014r : "") + " "
//                + (g2015 != null ? g2015 : "") + " " + (g2016 != null ? g2016 : "") + " " + (g2017r != null ? g2017r : "")
//                + (g2018r != null && g2018r.length() > 0 ? "<br/>" + g2018r : "");
//
//        return _g20a + _g20b + _g20c + _g20d + "<br/>" + _g20ar + _g20br + _g20cr + _g20dr;
//    }
//
//    public String g1Disp4Print() {
//        String _g1a = (g1 != null ? g1 : "");
//        String _g1b = (g19_1 != null ? g19_1 : "") +
//                // (g15_1 != null ? g15_1 : "") + " " +
//                (g17_1 != null ? " " + g17_1 : "") + (g18_1 != null ? " " + g18_1 : "");
//        String _g1c = (g16_1 != null ? g16_1 : "") + (g110 != null ? " " + g110 : "");
//        String _g1 = _g1a + (_g1a != null && _g1a.trim().length() > 0 ? "<br/>" : "") + _g1b
//                + (_g1b != null && _g1b.trim().length() > 0 ? "<br/>" : "") + _g1c;
//
//        String _g1ra = (g1r != null ? g1r : "");
//        String _g1rb = (g19r != null ? g19r : "") +
//                // (g15_1 != null ? g15_1 : "") + " " +
//                (g17_1 != null ? " " + g17_1 : "") + (g18r_1 != null ? " " + g18r_1 : "") + (g2_1 != null ? "<br/>" + g2_1 : "");
//        String _g1rc = (g16r != null ? g16r : "") + (g110 != null ? " " + g110 : "");
//        String _g1r = _g1ra + (_g1ra != null && _g1ra.trim().length() > 0 ? "<br/>" : "") + _g1rb
//                + (_g1rb != null && _g1rb.trim().length() > 0 ? "<br/>" : "") + _g1rc;
//        return (_g1.length() > 0 ? _g1 + "<br/>" : "") + _g1r;
//    }
//
//    /**
//     * Generates print string for g1 smgs2.
//     *
//     * @return print string
//     */
//    public String buildG1Print() {
//
//        // если печатать в доп лист
//        if (getG1c() != null && getG1c() == 1) {
//            return DOP_LIST_PRINT_CS2;
//        }
//
//        return  buildG1String();
//    }
//
//    /**
//     * Формируем строку отправителя для графы 1 SMGS2
//     * @return
//     */
//    public String buildG1String()
//    {
//        StringBuilder result = new StringBuilder();
//        StringBuilder row1 = new StringBuilder();
//        StringBuilder row2 = new StringBuilder();
//        StringBuilder row3 = new StringBuilder();
//
//        // 1 row
//        //name ru
//        row1.append(StringUtils.isNotBlank(g1r) ? g1r : "");
//
//        // 2 row
//        // adress ru
//        if (StringUtils.isNotBlank(g19r)) {
//            row2.append(g19r);
//        }
//        //city
//        if (StringUtils.isNotBlank(g18r_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g18r_1);
//        }
//        //country
//        if (StringUtils.isNotBlank(g16r)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g16r);
//        }
//        //index
//        if (StringUtils.isNotBlank(g17_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g17_1);
//        }
//        //ОКПО
//        if (StringUtils.isNotBlank(g2)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append("ОКПО ").append(g2);
//        }
//        //ИИН
//        if (StringUtils.isNotBlank(g_2inn)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append("ИИН ").append(g_2inn);
//        }
//
//        //row 3
//        // dop_info
//        if (StringUtils.isNotBlank(g1_dop_info)) {
//            row3.append(g1_dop_info);
//        }
//        // result
//        if (row1.length() > 0) {
//            result.append(row1);
//            result.append("\n");
//        }
//        if (row2.length() > 0) {
//            result.append(row2);
//            result.append("\n");
//        }
//        if (row3.length() > 0) {
//            result.append(row3);
//        }
//
//        return result.toString();
//    }
//
//    public String buildG1CsPrint() {
//        if (getG1c() != null && getG1c() == 1) {
//            return getText("form.labelDopList");
//        } else {
//            return buildG1Cs();
//        }
//    }
//
//    /**
//     * Generates print string for g1 CIM/SMGS.
//     *
//     * @return print string
//     */
//    public String buildG1Cs() {
//        StringBuilder result = new StringBuilder();
//        StringBuilder _g1 = new StringBuilder();
//        StringBuilder _g1r = new StringBuilder();
//        StringBuilder row1 = new StringBuilder();
//        StringBuilder row2 = new StringBuilder();
//        StringBuilder row3 = new StringBuilder();
//// non-ru part
//        // 1 row
//        //name
//        row1.append(StringUtils.isNotBlank(g1) ? g1 : "");
//        // 2 row
//        // adress
//        if (StringUtils.isNotBlank(g19_1)) {
//            row2.append(g19_1);
//        }
//        //city
//        if (StringUtils.isNotBlank(g18_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g18_1);
//        }
//        //country
//        if (StringUtils.isNotBlank(g16_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g16_1);
//        }
//        //index
//        if (StringUtils.isNotBlank(g17_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g17_1);
//        }
//        //VAT
//        if (StringUtils.isNotBlank(g110)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append("VAT ").append(g110);
//        }
//
//        if (row1.length() > 0) {
//            _g1.append(row1);
//            _g1.append("\n");
//        }
//        if (row2.length() > 0) {
//            _g1.append(row2);
//        }
//        row1.setLength(0);
//        row2.setLength(0);
//        // ru part
//        // 1 row
//        //name
//        row1.append(StringUtils.isNotBlank(g1r) ? g1r : "");
//        // 2 row
//        // adress
//        if (StringUtils.isNotBlank(g19r)) {
//            row2.append(g19r);
//        }
//        //city
//        if (StringUtils.isNotBlank(g18r_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g18r_1);
//        }
//        //country
//        if (StringUtils.isNotBlank(g16r)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g16r);
//        }
//        //index
//        if (StringUtils.isNotBlank(g17_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g17_1);
//        }
//        //VAT
//        if (StringUtils.isNotBlank(g110)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append("VAT ").append(g110);
//        }
//        //row 3
//        // dop_info
//        if (StringUtils.isNotBlank(g1_dop_info)) {
//            row3.append(g1_dop_info);
//        }
//        if (row1.length() > 0) {
//            _g1r.append(row1);
//            _g1r.append("\n");
//        }
//        if (row2.length() > 0) {
//            _g1r.append(row2);
//            _g1r.append("\n");
//        }
//        if (row3.length() > 0) {
//            _g1r.append(row3);
//        }
//        result.append("");
//        if (_g1.length() > 0)
//            result.append(_g1).append("\n");
//        if (_g1r.length() > 0)
//            result.append(_g1r);
//
//        return result.toString();
//    }
//
//    /**
//     * Generates print string for g2 smgs2.
//     *
//     * @return print string
//     */
//    public String buildG2Cs2Print() {
//        StringBuilder stringBuilder = new StringBuilder();
//
//        stringBuilder.append(g162r != null ? g162r + " " : "").append(g163r != null ? g163r : "");
//        stringBuilder.append("\n");
//        stringBuilder.append(g16_dop_info != null ? g16_dop_info : "");
//
//        return stringBuilder.toString();
//    }
//
//    /**
//     * Гр2. Станция отправления - код станции
//     *
//     * @return строкадля печати
//     */
//    public String buildG17_Print() {
//        return
//                (shouldPrintAdmCodes()?(StringUtils.defaultString(this.getG171())+" "):"")+
//                        StringUtils.defaultString(g17).trim();
//    }
//
//    public String buildGuG2Print() {
//        StringBuffer g = new StringBuffer();
//        if (g2_1 != null) {
//            g.append(g2_1);
//        }
//        return g.toString();
//    }
//
//    public String buildGuG5Print() {
//        StringBuffer g = new StringBuffer();
//        if (g5_1 != null) {
//            g.append(g5_1);
//        }
//
//        return g.toString();
//    }
//
//    public String g1Disp4PrintCim() {
//        String naim, strn, addr, nl = "<br/>";
//        naim = getG1() != null ? getG1() + nl : "";
//        strn = (getG_1_5k() != null ? getG_1_5k() + " " : "") + (getG16_1() != null ? getG16_1() : "");
//        if (strn.length() > 0) strn += nl;
//        addr = (getG18_1() != null ? getG18_1() + " " : "") + (getG19_1() != null ? getG19_1() : "");
//        return naim + strn + addr;
//    }
//
//    /**
//     * generates print string for g1 CIM.
//     *
//     * @return print string
//     */
//    public String buildG1CimPrint() {
//        StringBuilder result = new StringBuilder();
//        StringBuilder row1 = new StringBuilder();
//        StringBuilder row2 = new StringBuilder();
//        StringBuilder row3 = new StringBuilder();
//
//        // 1 row
//        //name
//        row1.append(StringUtils.isNotBlank(g1) ? g1 : "");
//        // 2 row
//        // adress
//        if (StringUtils.isNotBlank(g19_1)) {
//            row2.append(g19_1);
//        }
//        //city
//        if (StringUtils.isNotBlank(g18_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g18_1);
//        }
//        //country
//        if (StringUtils.isNotBlank(g16_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g16_1);
//        }
//        //index
//        if (StringUtils.isNotBlank(g17_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g17_1);
//        }
//        //VAT
//        if (StringUtils.isNotBlank(g110)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append("ОКПО ").append(g110);
//        }
//        //row 3
//        // dop_info
//        if (StringUtils.isNotBlank(g1_dop_info)) {
//            row3.append(g1_dop_info);
//        }
//        if (row1.length() > 0) {
//            result.append(row1);
//            result.append("\n");
//        }
//        if (row2.length() > 0) {
//            result.append(row2);
//            result.append("\n");
//        }
//        if (row3.length() > 0) {
//            result.append(row3);
//        }
//        return result.toString();
//    }
//
//    public String buildG1SlovNPrint() {
//        String naim, strn, addr, nl = "\n";
//        naim = getG1() != null ? getG1() + nl : "";
//        strn = (getG_1_5k() != null ? getG_1_5k() + " " : "") + (getG16_1() != null ? getG16_1() : "");
//        if (strn.length() > 0) strn += nl;
//        addr = (getG18_1() != null ? getG18_1() + " " : "") + (getG19_1() != null ? getG19_1() : "");
//        return naim + strn + addr;
//    }
//
//    public String g1Disp4PrintCmr() {
//        String naim, strn, addr, nl = "<br/>";
//        naim = getG1r() != null ? getG1r() : "";
//        strn = (getG_1_5k() != null ? getG_1_5k() + " " : "") + (getG16r() != null ? getG16r() : "");
//        addr = (getG18r_1() != null ? getG18r_1() + " " : "") + (getG19r() != null ? getG19r() : "");
//        return naim + nl + addr + nl + strn;
//    }
//
//    public String buildG1CmrPrint() {
//        String naim, strn, addr, nl = "\n";
//        naim = getG1r() != null ? getG1r() : "";
//        strn = (getG_1_5k() != null ? getG_1_5k() + " " : "") + (getG16r() != null ? getG16r() : "");
//        addr = (getG18r_1() != null ? getG18r_1() + " " : "") + (getG19r() != null ? getG19r() : "");
//        return naim + nl + addr + nl + strn;
//    }
//
//    public String g4Disp4PrintCim() {
//        String naim, strn, addr, nl = "<br/>";
//        naim = getG4() != null ? getG4() + nl : "";
//        strn = (getG_4_5k() != null ? getG_4_5k() + " " : "") + (getG46_1() != null ? getG46_1() : "");
//        if (strn.length() > 0) strn += nl;
//        addr = (getG48_1() != null ? getG48_1() + " " : "") + (getG49() != null ? getG49() : "");
//        return naim + strn + addr;
//    }
//
//    /**
//     * generates print string for g4 CIM
//     *
//     * @return print string
//     */
//    public String buildG4CimPrint() {
//        StringBuilder result = new StringBuilder();
//        StringBuilder row1 = new StringBuilder();
//        StringBuilder row2 = new StringBuilder();
//        StringBuilder row3 = new StringBuilder();
//
//        // 1 row
//        //name
//        row1.append(StringUtils.isNotBlank(g4) ? g4 : "");
//        // 2 row
//        // adress
//        if (StringUtils.isNotBlank(g49)) {
//            row2.append(g49);
//        }
//        //city
//        if (StringUtils.isNotBlank(g48_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g48_1);
//        }
//        //country
//        if (StringUtils.isNotBlank(g46_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g46_1);
//        }
//        //index
//        if (StringUtils.isNotBlank(g47_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g47_1);
//        }
//        //VAT
//        if (StringUtils.isNotBlank(g410)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append("ОКПО ").append(g410);
//        }
//        //row 3
//        // dop_info
//        if (StringUtils.isNotBlank(g4_dop_info)) {
//            row3.append(g4_dop_info);
//        }
//        if (row1.length() > 0) {
//            result.append(row1);
//            result.append("\n");
//        }
//        if (row2.length() > 0) {
//            result.append(row2);
//            result.append("\n");
//        }
//        if (row3.length() > 0) {
//            result.append(row3);
//        }
//        return result.toString();
//    }
//
//
//
//    public String buildG5SlovNPrint() {
//        String naim, strn, addr, nl = "\n";
//        naim = getG4() != null ? getG4() + nl : "";
//        strn = (getG_4_5k() != null ? getG_4_5k() + " " : "") + (getG46_1() != null ? getG46_1() : "");
//        if (strn.length() > 0) strn += nl;
//        addr = (getG48_1() != null ? getG48_1() + " " : "") + (getG49() != null ? getG49() : "");
//        return naim + strn + addr;
//    }
//
//    public String g4Disp4PrintCmr() {
//        String naim, strn, addr, nl = "<br/>";
//        naim = getG4r() != null ? getG4r() : "";
//        strn = (getG_4_5k() != null ? getG_4_5k() + " " : "") + (getG46r() != null ? getG46r() : "");
//        addr = (getG48r() != null ? getG48r() + " " : "") + (getG49r() != null ? getG49r() : "");
//        return naim + nl + addr + nl + strn;
//    }
//
//    public String buildG2CmrPrint() {
//        String naim, strn, addr, nl = "\n";
//        naim = getG4r() != null ? getG4r() : "";
//        strn = (getG_4_5k() != null ? getG_4_5k() + " " : "") + (getG46r() != null ? getG46r() : "");
//        addr = (getG48r() != null ? getG48r() + " " : "") + (getG49r() != null ? getG49r() : "");
//        return naim + nl + addr + nl + strn;
//    }
//    public String g4Disp4Print() {
//        String _g4a = (g4 != null ? g4 : "");
//        String _g4b = (g49 != null ? g49 : "") + (g45_1 != null ? " " + g45_1 : "") + (g47_1 != null ? " " + g47_1 : "")
//                + (g48_1 != null ? " " + g48_1 : "");
//        String _g4c = (g46_1 != null ? g46_1 : "") + (g410 != null ? " " + g410 : "");
//        String _g4 = _g4a + (_g4a != null && _g4a.trim().length() > 0 ? "<br/>" : "") + _g4b
//                + (_g4b != null && _g4b.trim().length() > 0 ? "<br/>" : "") + _g4c;
//
//        String _g4ra = (g4r != null ? g4r : "");
//        String _g4rb = (g49r != null ? g49r : "") + (g45_1 != null ? " " + g45_1 : "") + (g47_1 != null ? " " + g47_1 : "")
//                + (g48r != null ? " " + g48r : "") + (g5_1 != null ? "<br/>" + g5_1 : "");
//        String _g4rc = (g46r != null ? g46r : "") + (g410 != null ? " " + g410 : "");
//        String _g4r = _g4ra + (_g4ra != null && _g4ra.trim().length() > 0 ? "<br/>" : "") + _g4rb
//                + (_g4rb != null && _g4rb.trim().length() > 0 ? "<br/>" : "") + _g4rc;
//        return (_g4.length() > 0 ? _g4 + "<br/>" : "") + _g4r;
//    }
//
//    /**
//     * Generates print string for g4 smgs2.
//     *
//     * @return print string
//     */
//    public String buildG4Print() {
//
//        // если печатать в доп лист
//        if (getG4c() != null && getG4c() == 1) {
//            return DOP_LIST_PRINT_CS2;
//        }
//
//        return buildG4String();
//    }
//    /**
//     * Формируем строку получателя для графы 4 SMGS2
//     * @return
//     */
//    public String buildG4String()
//    {
//        StringBuilder result = new StringBuilder();
//        StringBuilder row1 = new StringBuilder();
//        StringBuilder row2 = new StringBuilder();
//        StringBuilder row3 = new StringBuilder();
//
//        // 1 row
//        //name ru
//        row1.append(StringUtils.isNotBlank(g4r) ? g4r : "");
//
//        // 2 row
//        // adress ru
//        if (StringUtils.isNotBlank(g49r)) {
//            row2.append(g49r);
//        }
//        //city
//        if (StringUtils.isNotBlank(g48r)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g48r);
//        }
//        //country
//        if (StringUtils.isNotBlank(g46r)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g46r);
//        }
//        //index
//        if (StringUtils.isNotBlank(g47_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g47_1);
//        }
//        //ОКПО
//        if (StringUtils.isNotBlank(g5)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append("ОКПО ").append(g5);
//        }
//        //ИИН
//        if (StringUtils.isNotBlank(g_5inn)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append("ИИН ").append(g_5inn);
//        }
//        //row 3
//        // g4_dop_info
//        if (StringUtils.isNotBlank(g4_dop_info)) {
//            row3.append(g4_dop_info);
//        }
//
//        // result
//        result.append(row1.length() > 0 ? row1 : "");
//        if (row2.length() > 0) {
//            result.append(result.length() > 0 ? "\n" : "");
//            result.append(row2);
//        }
//
//        if (row3.length() > 0) {
//            result.append(result.length() > 0 ? "\n" : "");
//            result.append(row3);
//        }
//
//        return result.toString();
//    }
//
//    public String buildG4CsPrint() {
//        if (getG4c() != null && getG4c() == 1) {
//            return getText("form.labelDopList");
//        } else {
//            return buildG4Cs();
//        }
//    }
//
//
//
//    /**
//     * Generates print string for g4 CIM/SMGS.
//     *
//     * @return string for print
//     */
//    public String buildG4Cs() {
//        StringBuilder result = new StringBuilder();
//        StringBuilder _g4 = new StringBuilder();
//        StringBuilder _g4r = new StringBuilder();
//        StringBuilder row1 = new StringBuilder();
//        StringBuilder row2 = new StringBuilder();
//        StringBuilder row3 = new StringBuilder();
//
//// non-ru part
//        // 1 row
//        //name
//        row1.append(StringUtils.isNotBlank(g4) ? g4 : "");
//        // 2 row
//        // adress
//        if (StringUtils.isNotBlank(g49)) {
//            row2.append(g49);
//        }
//        //city
//        if (StringUtils.isNotBlank(g48_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g48_1);
//        }
//        //country
//        if (StringUtils.isNotBlank(g46_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g46_1);
//        }
//        //index
//        if (StringUtils.isNotBlank(g47_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g47_1);
//        }
//        //VAT
//        if (StringUtils.isNotBlank(g410)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append("VAT ").append(g410);
//        }
//        if (row1.length() > 0) {
//            _g4.append(row1);
//            _g4.append("\n");
//        }
//        if (row2.length() > 0) {
//            _g4.append(row2);
//        }
//        row1.setLength(0);
//        row2.setLength(0);
//        // ru part
//        // 1 row
//        //name
//        row1.append(StringUtils.isNotBlank(g4r) ? g4r : "");
//        // 2 row
//        // adress
//        if (StringUtils.isNotBlank(g49r)) {
//            row2.append(g49r);
//        }
//        //city
//        if (StringUtils.isNotBlank(g48r)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g48r);
//        }
//        //country
//        if (StringUtils.isNotBlank(g46r)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g46r);
//        }
//        //index
//        if (StringUtils.isNotBlank(g47_1)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append(g47_1);
//        }
//        //VAT
//        if (StringUtils.isNotBlank(g410)) {
//            if (StringUtils.isNotBlank(row2))
//                row2.append(", ");
//            row2.append("VAT ").append(g410);
//        }
//        //row 3
//        // dop_info
//        if (StringUtils.isNotBlank(g4_dop_info)) {
//            row3.append(g4_dop_info);
//        }
//        if (row1.length() > 0) {
//            _g4r.append(row1);
//            _g4r.append("\n");
//        }
//        if (row2.length() > 0) {
//            _g4r.append(row2);
//            _g4r.append("\n");
//        }
//        if (row3.length() > 0) {
//            _g4r.append(row3);
//        }
//        result.append("");
//        if (_g4.length() > 0)
//            result.append(_g4).append("\n");
//        if (_g4r.length() > 0)
//            result.append(_g4r);
//
//        return result.toString();
//    }
//
//    public String buildG5Print() {
//        return g5;
//    }
//
//    /**
//     * Гр5. Станция назначения - справа, сверху
//     *
//     * @return строкадля печати
//     */
//    public String buildG121_Print() {
//
//        return (shouldPrintAdmCodes()?(getG12()+" "):"")+ StringUtils.defaultString(g121);
//    }
//
//    public String buildG10CsPrint() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(StringUtils.defaultString(getG101()));
//        sb.append(StringUtils.isNotBlank(getG101r()) ? "\n" + getG101r() : "");
//        return sb.toString();
//    }
//
//    public String buildG10_1CsPrint() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(StringUtils.defaultString(getG102()));
//        sb.append(StringUtils.isNotBlank(getG102r()) ? "\n" + getG102r() : "");
//        return sb.toString();
//    }
//
//    public String buildG15CsPrint() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(StringUtils.defaultString(getG15()));
//        sb.append(StringUtils.isNotBlank(getG15r()) ? "\n" + getG15r() : "");
//        return sb.toString();
//    }
//
//    public String buildG16CsPrint() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(StringUtils.defaultString(getG162()));
//        sb.append(StringUtils.isNotBlank(getG162r()) ? "\n" + getG162r() : "");
//        return sb.toString();
//    }
//
//    public String buildG16_1CsPrint() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(StringUtils.defaultString(getG163()));
//        sb.append(StringUtils.isNotBlank(getG163r()) ? "\n" + getG163r() : "");
//        return sb.toString();
//    }
//
//    public String buildG18CsPrint() {
//        if (getG18c() != null && getG18c() == 1) {
////            return LIST_DOP_RU;
//            return getText("form.labelDopList");
//        } else {
//            return buildG18Cs();
//        }
//    }
//
//    public String buildG18bCsPrint() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(StringUtils.defaultString(getG18B1()));
//        sb.append(StringUtils.isNotBlank(getG18B1a()) ? "\n" + getG18B1a() : "");
//        sb.append(StringUtils.isNotBlank(getG18B1b()) ? "\n" + getG18B1b() : "");
//        sb.append(StringUtils.isNotBlank(getG18B1c()) ? "\n" + getG18B1c() : "");
//        sb.append(StringUtils.isNotBlank(getG18B1d()) ? "\n" + getG18B1d() : "");
//        return sb.toString();
//    }
//
//    public String buildG17CsPrint() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(StringUtils.defaultString(getG171()));
//        sb.append(StringUtils.isNotBlank(getG17()) ? " " + getG17() : "");
//        return sb.toString();
//    }
//
//
//    public String g7Disp4Print() {
//        String _f7 = "";
//        String _f7_1 = "";
//        CimSmgsDocs docs[] = cimSmgsDocses7.values().toArray(new CimSmgsDocs[0]);
//        Arrays.sort(docs, new CimSmgs.Compare());
//
//        for (CimSmgsDocs elem : docs) {
//            if (elem.getText() != null && elem.getText().length() > 0)
//                _f7 = _f7 + (elem.getCode() != null ? "7." + elem.getCode() + ". " : "")
//                        + (elem.getText() != null ? elem.getText() + "&nbsp;&nbsp;" : "");
//            if (elem.getText2() != null && elem.getText2().length() > 0)
//                _f7_1 = _f7_1 + (elem.getCode() != null ? "7." + elem.getCode() + ". " : "")
//                        + (elem.getText2() != null ? elem.getText2() + "&nbsp;&nbsp;" : "");
//        }
//
//        String _f722 = "";
//        String _f722_1 = "";
//        for (CimSmgsPlatel elem : cimSmgsPlatels.values()) {
//            _f722 += (elem.getDorR() != null ? "Оплата по " + elem.getDorR() : "")
//                    + (elem.getPlatR() != null ? " производится через " + elem.getPlatR() : "")
//                    + (elem.getKplat() != null ? " код плательщика " + elem.getKplat() : "")
//                    + (elem.getKplat1() != null ? "\\п/к" + elem.getKplat1() : "") + (elem.getKplat2() != null ? "\\" + elem.getKplat2() : "")
//                    + (elem.getPrimR() != null ? " " + elem.getPrimR() : "") + " ";
//            _f722_1 += (elem.getDor() != null ? elem.getDor() : "") + (elem.getPlat() != null ? " " + elem.getPlat() : "")
//                    + (elem.getKplat() != null ? " " + elem.getKplat() : "") + (elem.getKplat1() != null ? "\\" + elem.getKplat1() : "")
//                    + (elem.getKplat2() != null ? "\\" + elem.getKplat2() : "") + (elem.getPrim() != null ? " " + elem.getPrim() : "") + " ";
//        }
//        _f7 += _f722;
//        _f7_1 += _f722_1;
//
//        _f7 += (getG694() != null && getG694().length() > 0) ? getG694() : "";
//
//        return _f7_1 + _f7;
//    }
//
//    public String buildG7Cs() {
//        StringBuffer _f7 = new StringBuffer();
//        CimSmgsDocs docs[] = cimSmgsDocses7.values().toArray(new CimSmgsDocs[0]);
//
//        for (CimSmgsDocs elem : docs) {
//            _f7.append(elem.getCode() != null ? elem.getCode() + "." : "");
//            _f7.append(elem.getText() != null ? " " + elem.getText() : "");
//            _f7.append(elem.getText() != null && elem.getText2() != null ? " /" : "");
//            _f7.append(elem.getText2() != null ? " " + elem.getText2() : "");
//            _f7.append("\n");
//        }
//
//        return _f7.toString();
//    }
//    public String buildG18Cs(){
//
//        StringBuffer _f722 = new StringBuffer();
//        _f722.append(StringUtils.defaultString(getG18()));
//        _f722.append(StringUtils.isNotBlank(getG18r()) ? "\n" + getG18r() : "");
//
//        if (cimSmgsPlatels.size() > 0) {
//            _f722.append("\n");
//        }
//
//        for (CimSmgsPlatel elem : cimSmgsPlatels.values()) {
////            _f722.append("Оплата по ");
//            _f722.append(elem.getDorR() != null ? elem.getDorR() : "");
//            _f722.append(elem.getDorR() != null && elem.getDor() != null ? " / " : "");
//            _f722.append(elem.getDor() != null ? elem.getDor() : "");
//            _f722.append(elem.getCodPer() != null?" "+elem.getCodPer() : "");
//            _f722.append(elem.getNamePer() != null && elem.getCodPer() != null ? "/ " : "");
//            _f722.append(elem.getNamePer() != null ? elem.getNamePer() : "");
////            _f722.append(" производится через ");
//            _f722.append(elem.getPlatR() != null ? elem.getPlatR() : "");
//            _f722.append(elem.getPlatR() != null && elem.getPlat() != null ? " / " : "");
//            _f722.append(elem.getPlat() != null ? elem.getPlat() : "");
//            _f722.append(elem.getPrimR() != null && elem.getPrim() != null ? " способ оплаты " : "");
//            _f722.append(elem.getPrimR() != null ? elem.getPrimR() : "");
//            _f722.append(elem.getPrimR() != null && elem.getPrim() != null ? " / " : "");
//            _f722.append(elem.getPrim() != null ? elem.getPrim() : "");
//            _f722.append(elem.getKplat() != null ? " код плательщика " + elem.getKplat() : "");
//            _f722.append(elem.getKplat1() != null ? " п/к " + elem.getKplat1() : "");
//            _f722.append(elem.getKplat3() != null ? " п/к " + elem.getKplat3() : "");
//            _f722.append(";").append("\n");
//        }
//        if (cimSmgsPlatels.size() > 0) {
//            _f722.append("\n");
//        }
//        _f722.append(getG4prim() != null ? getG4prim() : "");
//
//        delLastSimbolIfEqual("\n", _f722);
//        return _f722.toString();
//    }
//
//    public String buildG7CsPrint() {
//        if (getG7c() != null && getG7c() == 1) {
////            return LIST_DOP_RU;
//            return getText("form.labelDopList");
//        } else {
//            return buildG7Cs();
//        }
//    }
//
//    private void delLastSimbolIfEqual(String simbol, StringBuffer source) {
//        int lastInx;
//        if ((source != null && source.length() > 0) || (lastInx = source.lastIndexOf(simbol)) == -1) {
//            return;
//        }
//
//        if ((lastInx + 1) == source.length()) {
//            source.replace(lastInx, source.length(), "");
//        }
//    }
//
//
//    public String g7Disp4PrintSmgs() {
//        String _f7 = "";
//        String _f7_1 = "";
//        String _f722 = "";
//        CimSmgsDocs docs[] = cimSmgsDocses7.values().toArray(new CimSmgsDocs[0]);
//        Arrays.sort(docs, new CimSmgs.Compare());
//        for (CimSmgsPlatel elem : cimSmgsPlatels.values()) {
//            if ((elem.getDor() != null) || (elem.getDorR() != null)) {
//                _f722 += "оплата по " +
//                        (elem.getDor() != null ? elem.getDor() : "") + " " +
//                        (elem.getDorR() != null ? elem.getDorR() : "") + " ";
//            }
//            if (elem.getPlat() != null || elem.getPlatR() != null) {
//                _f722 += "производится через " +
//                        (elem.getPlat() != null ? elem.getPlat() : "") + " " +
//                        (elem.getPlatR() != null ? elem.getPlatR() : "") + " ";
//            }
//            if (elem.getPrim() != null || elem.getPrimR() != null) {
//                _f722 += " " + (elem.getPrim() != null ? elem.getPrim() + " " : "") +
//                        (elem.getPrimR() != null ? elem.getPrimR() + " " : "");
//            }
//            _f722 += (elem.getKplat() != null ? "код плательщика " + elem.getKplat() : "") +
//                    (elem.getKplat1() != null ? " п/к " + elem.getKplat1() : "") +
//                    (elem.getKplat2() != null ? "/" + elem.getKplat2() : "") +
//                    "<br/>";
//        }
//        _f722 += (g4prim != null ? g4prim : "");
//
//        return _f722.trim();
//    }
//
//    /**
//     * Строим графу 23 для печати
//     *
//     * @return строкадля печати
//     */
//    public String buildG4SmgsPrint() {
//        String _f7 = "";
//        String _f7_1 = "";
////        String _f722 = "";
//        StringBuilder _f722 = new StringBuilder();
//        CimSmgsDocs docs[] = cimSmgsDocses7.values().toArray(new CimSmgsDocs[0]);
//        Arrays.sort(docs, new CimSmgs.Compare());
//        for (CimSmgsPlatel elem : cimSmgsPlatels.values()) {
//            if(_f722.length()>0)
//                _f722.append("\n");
//
//            if (elem.getDorR() != null) {
//                _f722.append(elem.getDorR()).append(" ");
//            }
//            if (elem.getPlatR() != null) {
//                _f722.append(elem.getPlatR()).append(" ");
//            }
//            if (elem.getPrimR() != null) {
//                _f722.append(elem.getPrimR()).append(" ");
//            }
//            if (elem.getKplat() != null) {
//                _f722.append("код: ").append(elem.getKplat());
//            }
//
//            if (elem.getKplat1() != null) {
//                if (elem.getKplat() != null)
//                    _f722.append("/");
//                _f722.append(elem.getKplat1());
//            }
//
//            if (elem.getKplat3() != null) {
//                if (elem.getKplat() != null || elem.getKplat1() != null)
//                    _f722.append("/");
//                _f722.append(elem.getKplat3());
//            }
//
//            if (elem.getPrim() != null) {
//                _f722.append(elem.getPrim()).append(" ");
//            }
//
//            if (elem.getnDog() != null) {
//                _f722.append(elem.getnDog()).append(" ");
//            }
//
//            if (elem.getDatDog() != null) {
//                _f722.append(new SimpleDateFormat("dd.MM.yyyy").format(elem.getDatDog()));
//            }
//        }
//
//        return _f722.toString();
//    }
//
//    public String buildG6Print() {
//        StringBuilder sb = new StringBuilder();
//        if (StringUtils.isNotBlank(getG15())) {
//            sb.append(getG15());
//            sb.append("\n");
//        }
//        if (StringUtils.isNotBlank(getG15r())) {
//            sb.append(getG15r());
//        }
//        return sb.toString();
//    }
//
//    public String buildG6CsPrint() {
//        return StringUtils.defaultString(getG6());
//    }
//
//    public String buildGuCennostPrint() {
//        return StringUtils.defaultString(getG27());
//    }
//
//    public String buildG19CsPrint() {
//        final String text = "Siehe Nachweisung\nсм. Ведомость";
//
//        switch (getCimSmgsCarLists().size()) {
//            case 1:
//                if (countConts() > 1) {
//                    return text;
//                } else {
//                    return getCimSmgsCarLists().values().iterator().next().vag4CimSmgs1();
//                }
//            case 0:
//                return "";
//            default:
//                return text;
//        }
////        return getCimSmgsCarLists().size() > 0 ? getCimSmgsCarLists().values().iterator().next().vag4CimSmgs1() : "";
//    }
//
//
//
//    public String buildG19GrPdCsPrint() {
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 && !isGroupContOtpr()) {
//            CimSmgsCarList vag = getCimSmgsCarLists().values().iterator().next();
//            result = vag.getGrPod() != null && vag.getGrPod().intValue() > 0 ? vag.getGrPod().toString() : "";
//        }
//        return result;
//    }
//
//    public String buildG19KlOsCsPrint() {
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 && !isGroupContOtpr()) {
//            CimSmgsCarList vag = getCimSmgsCarLists().values().iterator().next();
//            result = vag.getKolOs() != null && vag.getKolOs() > 0 ? vag.getKolOs().toString() : "";
//        }
//        return result;
//    }
//
//    public String buildG19TrVgCsPrint() {
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 && !isGroupContOtpr()) {
//            CimSmgsCarList vag = getCimSmgsCarLists().values().iterator().next();
//            result = vag.getTaraVag() != null && vag.getTaraVag().intValue() > 0 ? vag.getTaraVag().toString() : "";
//        }
//        return result;
//    }
//
//    /**
//     * Графа 9 CimSmgs
//     * @return
//     */
//    public String buildG9CsPrint() {
//        final String text = "Siehe Nachweisung\nсм. Ведомость";
//
//        if (getG9c() != null && getG9c() == 1) {
//            return getText("form.labelDopList");
//        }
//        if(getCimSmgsCarLists().size()>1)
//            return text;
//
//        HashMap<String, String> map = new HashMap<>();
//        StringBuilder print = new StringBuilder();
//        int count = 0;
//        boolean used[] = new boolean[cimSmgsDocses9.values().size()];
//        Arrays.fill(used, false);
//        for (CimSmgsDocs elem : cimSmgsDocses9.values()) {
//            String mapRec;
//            StringBuilder strRec = new StringBuilder();
//            String keyText=elem.getText()+
//                    (elem.getText2()!=null?(elem.getText2().trim().isEmpty()
//                            ?""
//                            :(elem.getText()!=null&&elem.getText().trim().isEmpty()?" ":"-")+elem.getText2()):"");
//            mapRec = map.get(keyText);
//            strRec.append((mapRec != null) ? mapRec : "");
//
//            if (strRec.length() > 0&&(elem.getNdoc() != null||elem.getDat() != null))
//                strRec.append(", ");
//            strRec.append(elem.getNdoc() != null ? (elem.getNdoc() + " ") : "");
//            strRec.append(elem.getDat() != null ? "от " + new SimpleDateFormat("dd.MM.yyyy").format(elem.getDat()) + " " : "");
//            map.put(keyText, strRec.toString());
//        }
//        for (String s : map.keySet()) {
//            print
//                    .append((s==null||s.isEmpty()) ? "" : s)
//                    .append((s!=null&&!s.isEmpty()&&map.get(s)!=null&&!map.get(s).isEmpty()) ? " :" : "")
//                    .append(map.get(s)).append("\n");
//        }
//
//        return print.toString();
//    }
//
//    public String buildG2012CsPrint() {
//        StringBuilder sb = new StringBuilder();
//        int plombsCount = 0;
//        int vagsCount = getCimSmgsCarLists().size();
//        int contsCount = 0;
//        String delim = "";
//
//        for (CimSmgsCarList vag : getCimSmgsCarLists().values()) {
//            if (isContOtpr()) {
//                for (CimSmgsKonList cont : vag.getCimSmgsKonLists().values()) {
//                    for (CimSmgsPlomb plomb : cont.getCimSmgsPlombs().values()) {
//                        if (vagsCount == 1 && vag.getCimSmgsKonLists().size() == 1) {
//                            sb.append(delim);
//                            sb.append(plomb.plomb4CsPrint());
//                            delim = ", ";
//                        }
//                        plombsCount += plomb.getKpl() != null ? plomb.getKpl() : 0;
//                    }
//                    contsCount++;
//                }
//            } else {
//                for (CimSmgsPlomb plomb : vag.getCimSmgsPlombs().values()) {
//                    if (vagsCount == 1) {
//                        sb.append(delim);
//                        sb.append(plomb.plomb4CsPrint());
//                        delim = ", ";
//                    }
//                    plombsCount += plomb.getKpl() != null ? plomb.getKpl() : 0;
//                }
//            }
//        }
//
//        if (isGroupContOtpr()) {
//            sb
//                    .append("verschlüsse / пломбы ")
//                    .append(plombsCount)
//                    .append(" (Siehe Nachweisung / см.ведомость)");
//        }
//        return sb.toString();
//    }
//
//    public String buildG27Print() {
//        return getCimSmgsCarLists().size() > 0 ? getCimSmgsCarLists().values().iterator().next().getNvag() : "";
//    }
//
//    public String buildG21CsPrint() {
//        return getG21() != null && getG21() == 1 ? "X" : "";
//    }
//
//    public String buildG22CsPrint() {
//        return getG22() != null && getG22() == 1 ? "X" : "";
//    }
//
//    public String buildCimPrint() {
//        return getCim() != null && getCim() == 1 ? "X" : "";
//    }
//
//    public String buildG28Print() {
//        BigDecimal res = null;
//        if (getCimSmgsCarLists().size() > 0 && (res = getCimSmgsCarLists().values().iterator().next().getGrPod()) != null) {
//            return res.toString();
//        }
//        return "";
//    }
//
//    public String buildG21_1CmrPrint() {
//        return StringUtils.defaultString(g28);
//    }
//
//    public String buildG29Print() {
//        Byte res = null;
//        if (getCimSmgsCarLists().size() > 0 && (res = getCimSmgsCarLists().values().iterator().next().getKolOs()) != null) {
//            return res.toString();
//        }
//        return "";
//
//    }
//
//    public String buildG30Print() {
//        BigDecimal res = null;
//        if (getCimSmgsCarLists().size() > 0 && (res = getCimSmgsCarLists().values().iterator().next().getTaraVag()) != null) {
//            return res.toString();
//        }
//        return "";
//    }
//
//    public String buildG30CsPrint() {
//        return StringUtils.defaultString(getG30());
//    }
//
//    public String buildG20_1CsPrint() {
//        Map<Byte, CimSmgsKonList> konList;
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 && (konList = getCimSmgsCarLists().values().iterator().next().getCimSmgsKonLists()).size() > 0) {
//            result = StringUtils.defaultString(konList.values().iterator().next().kon4CimSmgs1());
//        }
//        return result;
//    }
//
//    public String buildG20_2CsPrint() {
//        if (getG20c() != null && getG20c() == 1) {
////            return LIST_DOP_RU;
//            return getText("form.labelDopList");
//        } else {
//            StringBuilder sb = new StringBuilder();
//            for (CimSmgsCarList vag : getCimSmgsCarLists().values()) {
//                for (CimSmgsKonList kon : vag.getCimSmgsKonLists().values()) {
//                    if (kon.getCimSmgsGruzs() != null && kon.getCimSmgsGruzs().size() > 0) {
//                        if (kon.getCimSmgsGruzs().size() > 1) {
//                            sb.append("Сборный груз: Sammelgut:\n");
//                        }
//                        for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                            sb.append(gruz.gruz4CimSmgs1());
//                            sb.append("\n");
//                        }
//                    }
//
//                }
//            }
//            return sb.toString();
//        }
//    }
//
//    public String buildG20_2CsEuPrint() {
//        return buildG20_2CsEuPrint(false);
//    }
//
//    public String buildG20_2CsEuPrint(boolean forDoplist) {
//        StringBuilder sb = new StringBuilder();
//        int contsCount = 0;
//        boolean withDopList = !forDoplist && getG20c() != null && getG20c() == 1;
//        CimSmgsKonList firstCont = null;
//        Map<String, CimSmgsGruz> gruzTempMap = new TreeMap<>();
//
//        for (CimSmgsCarList car : getCimSmgsCarLists().values()) {
//            if (isContOtpr()) {
//                for (CimSmgsKonList cont : car.getCimSmgsKonLists().values()) {
//                    if (!withDopList) {
//                        // group grys by code gng
//                        for (CimSmgsGruz gruz : cont.getCimSmgsGruzs().values()) {
//                            buildCsGruzPrint(gruzTempMap, gruz);
//                        }
//                    }
//
//                    if (firstCont == null) {
//                        firstCont = cont;
//                    }
//                    contsCount++;
//                }
//            } else {
//                if (!withDopList) {
//                    // group grys by code gng
//                    for (CimSmgsGruz gruz : car.getCimSmgsGruzs().values()) {
//                        buildCsGruzPrint(gruzTempMap, gruz);
//                    }
//                }
//            }
//        }
//
//        if (contsCount == 1) {
//            sb.append(firstCont.kont4CsPrint());
//        } else if (contsCount > 1) {
//            sb.append(contsCount + " Containers / " + contsCount + " контейнер.");
//        }
//
//        if (withDopList) {
//            sb.append("\n" + LIST_DOP_RU);
//        } else {
//            int index = 0;
//            for (CimSmgsGruz gruz : gruzTempMap.values()) {
//                sb.append("\n");
//                sb.append(gruz.gruz4CimSmgsEu(index, isGroupContOtpr(), gruzTempMap.size()));
//                index++;
//            }
//
//            sb.append("\n");
//            sb.append(StringUtils.defaultString(g11_prim));
//        }
//
//        return sb.toString();
//    }
//
//    private void buildCsGruzPrint(Map<String, CimSmgsGruz> gruzTempMap, CimSmgsGruz gruz) {
//        String kgvn = String.valueOf(StringUtils.isNotBlank(gruz.getKgvn()) ? gruz.getKgvn() : -1);
//        CimSmgsGruz gruzTemp = gruzTempMap.get(kgvn);
//        if (gruzTemp == null) {
//            gruzTemp = new CimSmgsGruz();
//
//            gruzTemp.setEkgvn(gruz.getEkgvn());
//            gruzTemp.setEnzgr(gruz.getEnzgr());
//            gruzTemp.setKgvn(kgvn);
//            gruzTemp.setMassa(gruz.getMassa());
//            gruzTemp.setNzgr(gruz.getNzgr());
//            gruzTemp.setNzgrEu(gruz.getNzgrEu());
//            gruzTemp.setPlaces(gruz.getPlaces());
//            gruzTemp.setUpak(gruz.getUpak());
//            gruzTemp.setUpakForeign(gruz.getUpakForeign());
//            gruzTemp.setPlaces(0);
//            gruzTemp.setMassa(BigDecimal.ZERO);
//            gruzTemp.upakGroupsDe(new HashMap<String, Integer>());
//            gruzTemp.upakGroupsRu(new HashMap<String, Integer>());
//            gruzTemp.setCimSmgsDanGruzs(gruz.getCimSmgsDanGruzs());
//
//            gruzTempMap.put(kgvn, gruzTemp);
//        }
//
//        Integer places = gruz.getPlaces() == null ? 0 : gruz.getPlaces();
//        gruzTemp.setPlaces(
//                (gruzTemp.getPlaces() == null ? 0 : gruzTemp.getPlaces()) + places
//        );
//        gruzTemp.setMassa(
//                (gruzTemp.getMassa() == null ? BigDecimal.ZERO : gruzTemp.getMassa())
//                        .add(
//                                gruz.getMassa() == null ? BigDecimal.ZERO : gruz.getMassa()
//                        )
//        );
//
//        String upak = StringUtils.isNotBlank(gruz.getUpak()) && StringUtils.isNotBlank(gruz.getUpak().trim()) ? gruz.getUpak().trim() : "Место";
//        Integer tempPlaces = gruzTemp.upakGroupsRu().get(upak);
//        if (tempPlaces == null) {
//            tempPlaces = 0;
//            gruzTemp.upakGroupsRu().put(upak, tempPlaces);
//        }
//        gruzTemp.upakGroupsRu().put(upak, tempPlaces + places);
//
//        upak = StringUtils.isNotBlank(gruz.getUpakForeign()) && StringUtils.isNotBlank(gruz.getUpakForeign().trim()) ? gruz.getUpakForeign().trim() : "Kolli";
//        tempPlaces = gruzTemp.upakGroupsDe().get(upak);
//        if (tempPlaces == null) {
//            tempPlaces = 0;
//            gruzTemp.upakGroupsDe().put(upak, tempPlaces);
//        }
//        gruzTemp.upakGroupsDe().put(upak, tempPlaces + places);
//    }
//
//    public String buildG20Cs() {
//        StringBuilder sb = new StringBuilder();
//        final String nl = "\n";
////        String prefix = "";
//        for (CimSmgsCarList vag : getCimSmgsCarLists().values()) {
//            for (CimSmgsKonList kon : vag.getCimSmgsKonLists().values()) {
//                sb.append(kon.kon4CimSmgs1());
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sb.append(nl);
////                    prefix = nl;
//                    sb.append(gruz.gruz4CimSmgs1());
//                    sb.append(nl);
//                    sb.append(gruz.mesta4CimSmgs1());
//                }
//                break;
//            }
//            break;
//        }
//
//        return sb.toString();
//    }
//
//
//    public String buildG20_3CsPrint() {
//
//
//        StringBuilder sb = new StringBuilder();
//        for (CimSmgsCarList vag : getCimSmgsCarLists().values()) {
//            for (CimSmgsKonList kon : vag.getCimSmgsKonLists().values()) {
//                if (kon.getCimSmgsGruzs() != null && kon.getCimSmgsGruzs().size() > 0) {
//                    for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                        sb.append("\n");
//                        String upak = gruz.upak4CimSmgs1();
//                        if (upak.length() > 0) {
//                            sb.append(upak);
//                            sb.append("\n");
//                        }
//                        sb.append(gruz.mesta4CimSmgs1());
//                        sb.append("\n");
//                        sb.append("\n");
//                    }
//                }
//            }
//        }
//        return sb.toString();
//    }
//
//    public String buildGuKont1Print() {
//        Map<Byte, CimSmgsKonList> konList;
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 && (konList = getCimSmgsCarLists().values().iterator().next().getCimSmgsKonLists()).size() > 0) {
//            result = StringUtils.defaultString(konList.values().iterator().next().getOwnerKod());
//        }
//        return result;
//    }
//
//    public String buildGuKont2Print() {
//        Map<Byte, CimSmgsKonList> konList;
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 && (konList = getCimSmgsCarLists().values().iterator().next().getCimSmgsKonLists()).size() > 0) {
//            result = StringUtils.defaultString(konList.values().iterator().next().getUtiN());
//        }
//        return result;
//    }
//
//    public String buildGuKont3Print() {
//        Map<Byte, CimSmgsKonList> konList;
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 && (konList = getCimSmgsCarLists().values().iterator().next().getCimSmgsKonLists()).size() > 0) {
//            result = StringUtils.defaultString(konList.values().iterator().next().getVid());
//        }
//        return result;
//    }
//
//    public String buildGuKont4Print() {
//        Map<Byte, CimSmgsKonList> konList;
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 && (konList = getCimSmgsCarLists().values().iterator().next().getCimSmgsKonLists()).size() > 0) {
//            result = StringUtils.defaultString(konList.values().iterator().next().getUtiType());
//        }
//        return result;
//    }
//
//    public String buildGuKont5Print() {
//        Map<Byte, CimSmgsKonList> konList;
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 && (konList = getCimSmgsCarLists().values().iterator().next().getCimSmgsKonLists()).size() > 0) {
//            result = StringUtils.defaultString(konList.values().iterator().next().getSpecKon());
//        }
//        return result;
//    }
//
//    public String buildGuVag1Print() {
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0) {
//            result = StringUtils.defaultString(getCimSmgsCarLists().values().iterator().next().getRod());
//        }
//        return result;
//    }
//
//    public String buildGuVag2Print() {
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0) {
//            result = StringUtils.defaultString(getCimSmgsCarLists().values().iterator().next().getNvag());
//        }
//        return result;
//    }
//
//    public String buildGuVag3Print() {
//        String result = "";
//        CimSmgsCarList vag;
//        if (getCimSmgsCarLists().size() > 0) {
//            vag = getCimSmgsCarLists().values().iterator().next();
//            result = vag.getGrPod() != null ? vag.getGrPod().toString() : "";
//        }
//        return result;
//    }
//
//    public String buildGuVag4Print() {
//        String result = "";
//        CimSmgsCarList vag;
//        if (getCimSmgsCarLists().size() > 0) {
//            vag = getCimSmgsCarLists().values().iterator().next();
//            result = vag.getKolOs() != null ? vag.getKolOs().toString() : "";
//        }
//        return result;
//    }
//
//    public String buildGuVag5Print() {
//        String result = "";
//        CimSmgsCarList vag;
//        if (getCimSmgsCarLists().size() > 0) {
//            vag = getCimSmgsCarLists().values().iterator().next();
//            result = vag.getTaraVag() != null ? vag.getTaraVag().toString() : "";
//        }
//        return result;
//    }
//
//    public String buildGuVag6Print() {
//        String result = "";
//        CimSmgsCarList vag;
//        if (getCimSmgsCarLists().size() > 0) {
//            vag = getCimSmgsCarLists().values().iterator().next();
//            result = vag.getMassGross() != null ? vag.getMassGross().toString() : "";
//        }
//        return result;
//    }
//
//    public String buildGuVag7Print() {
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0) {
//            result = StringUtils.defaultString(getCimSmgsCarLists().values().iterator().next().getSpeed());
//        }
//        return result;
//    }
//
//    public String buildGuPlat1Print() {
//        String result = "";
//        if (getCimSmgsPlatels().size() > 0) {
//            result = StringUtils.defaultString(getCimSmgsPlatels().values().iterator().next().getPlatR());
//        }
//        return result;
//    }
//
//    public String buildGuPlat2Print() {
//        String result = "";
//        if (getCimSmgsPlatels().size() > 0) {
//            result = StringUtils.defaultString(getCimSmgsPlatels().values().iterator().next().getKplat());
//        }
//        return result;
//    }
//
//    public String buildPogrKon1Print() {
//        Map<Byte, CimSmgsKonList> konList;
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 && (konList = getCimSmgsCarLists().values().iterator().next().getCimSmgsKonLists()).size() > 0 && Byte.valueOf((byte) 1).equals(konList.values().iterator().next().getPogrKon())) {
//            result = "-----------";
//        }
//        return result;
//    }
//
//    public String buildPogrKon2Print() {
//        Map<Byte, CimSmgsKonList> konList;
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 && (konList = getCimSmgsCarLists().values().iterator().next().getCimSmgsKonLists()).size() > 0 && Byte.valueOf((byte) 2).equals(konList.values().iterator().next().getPogrKon())) {
//            result = "------------";
//        }
//        return result;
//    }
//
//    public String buildG9Print() {
//        Map<Byte, CimSmgsKonList> konList;
//        CimSmgsKonList kon;
//        StringBuilder sb = new StringBuilder();
//        if (getCimSmgsCarLists().size() > 0 && (konList = getCimSmgsCarLists().values().iterator().next().getCimSmgsKonLists()).size() > 0) {
//            kon = konList.values().iterator().next();
//            sb.append(StringUtils.isNotBlank(kon.getUtiN()) ? kon.getUtiN() + " P" + "\n" : "");
//            sb.append(kon.getSizeFoot() != null ? kon.getSizeFoot() + "\n" : "");
//            sb.append(StringUtils.isNotBlank(kon.getPrim()) ? kon.getPrim() : "");
//        }
//        return sb.toString().trim();
//    }
//
//    public String buildG9_1Print() {
//        Map<Byte, CimSmgsKonList> konList;
//        CimSmgsKonList kon;
//        StringBuilder sb = new StringBuilder();
//        if (getCimSmgsCarLists().size() > 0 && (konList = getCimSmgsCarLists().values().iterator().next().getCimSmgsKonLists()).size() > 0) {
//            kon = konList.values().iterator().next();
//            sb.append(StringUtils.isNotBlank(kon.getUtiN()) ? kon.getUtiN() + "\n" : "");
//            sb.append(kon.getSizeFoot() != null ? kon.getSizeFoot() + "\n" : "");
//            sb.append(StringUtils.isNotBlank(kon.getPrim()) ? kon.getPrim() : "");
//        }
//        return sb.toString().trim();
//    }
//
//    public String buildGuKodGrPrint() {
//        Map<Byte, CimSmgsKonList> konList;
//        Map<Integer, CimSmgsGruz> gruzList;
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 &&
//                (konList = getCimSmgsCarLists().values().iterator().next().getCimSmgsKonLists()).size() > 0 &&
//                (gruzList = konList.values().iterator().next().getCimSmgsGruzs()).size() > 0) {
//            result = gruzList.values().iterator().next().kgvn4GuDisp1();
//        }
//        return result;
//    }
//
//    public String buildGuStOtpr1Print() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(StringUtils.isNotBlank(getG162r()) ? getG162r() : "");
//        sb.append(StringUtils.isNotBlank(getG163r()) ? "\n" + getG163r() : "");
//        return sb.toString();
//    }
//
//    public String buildGuStOtpr2Print() {
//        return StringUtils.defaultString(getG692());
//    }
//
//
//    public String buildGuStNazn1Print() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(StringUtils.isNotBlank(getG101r()) ? getG101r() : "");
//        sb.append(StringUtils.isNotBlank(getG102r()) ? "\n" + getG102r() : "");
//        return sb.toString();
//    }
//
//    public String buildGuStNazn2Print() {
//        return StringUtils.defaultString(getG121());
//    }
//
//    public String buildG10Print() {
//        StringBuilder sb = new StringBuilder();
//        String prefix = "";
//        for (CimSmgsCarList vag : getCimSmgsCarLists().values())
//            for (CimSmgsKonList kon : vag.getCimSmgsKonLists().values())
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sb.append(StringUtils.isNotBlank(gruz.getUpak()) ? prefix + gruz.getUpak() : "");
//                    prefix = "\n";
//                }
//        return sb.toString();
//    }
//
//    public String buildGuGrMestaPrint() {
//        StringBuilder sb = new StringBuilder();
//        String prefix = "";
//        for (CimSmgsCarList vag : getCimSmgsCarLists().values())
//            for (CimSmgsKonList kon : vag.getCimSmgsKonLists().values())
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sb.append(gruz.getPlaces() != null ? prefix + gruz.getPlaces() : "");
//                    prefix = "\n";
//                }
//        return sb.toString();
//    }
//
//    public String buildGu29GrNaimPrint() {
//        StringBuilder sb = new StringBuilder();
//        String prefix = "";
//        int grIdx = 1;
//        for (CimSmgsCarList vag : getCimSmgsCarLists().values())
//            for (CimSmgsKonList kon : vag.getCimSmgsKonLists().values()) {
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sb.append(StringUtils.isNotBlank(gruz.getNzgr()) ? prefix + gruz.getNzgr() + "\n" : "");
//                    if (grIdx > 1) {
//                        sb.append(StringUtils.isNotBlank(gruz.getKgvn()) ? "ГНГ " + gruz.getKgvn() + "\n" : "");
//                    }
//                    sb.append(StringUtils.isNotBlank(gruz.getEnzgr()) ? gruz.getEnzgr() + "\n" : "");
//                    sb.append(StringUtils.isNotBlank(gruz.getEkgvn()) ? "ЕТ СНГ  " + gruz.getEkgvn() : "");
//                    grIdx++;
//                    prefix = "\n";
//                }
//            }
//        return sb.toString();
//    }
//
//    public String buildGu27GrNaimPrint() {
//        StringBuilder sb = new StringBuilder();
//        String prefix = "";
//        for (CimSmgsCarList vag : getCimSmgsCarLists().values())
//            for (CimSmgsKonList kon : vag.getCimSmgsKonLists().values()) {
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sb.append(StringUtils.isNotBlank(gruz.getEnzgr()) ? prefix + gruz.getEnzgr() + "\n" : "");
//                    sb.append(StringUtils.isNotBlank(gruz.getEkgvn()) ? "ЕТСНГ-" + gruz.getEkgvn() + "\n" : "");
//                    sb.append(StringUtils.isNotBlank(gruz.getNzgr()) ? gruz.getNzgr() + "\n" : "");
//                    sb.append(StringUtils.isNotBlank(gruz.getKgvn()) ? "ГНГ " + gruz.getKgvn() : "");
//                    prefix = "\n";
//                }
//            }
//        return sb.toString();
//    }
//
//    public String buildGuGrUpakPrint() {
//        StringBuilder sb = new StringBuilder();
//        String prefix = "";
//        for (CimSmgsCarList vag : getCimSmgsCarLists().values())
//            for (CimSmgsKonList kon : vag.getCimSmgsKonLists().values())
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sb.append(StringUtils.isNotBlank(gruz.getUpak()) ? prefix + gruz.getUpak() : "");
//                    prefix = "\n";
//                }
//        return sb.toString();
//    }
//
//    public String buildG11CsPrint() {
//        return StringUtils.defaultString(g11);
//    }
//
//    public String buildG12CsPrint() {
//        return StringUtils.defaultString(g12);
//    }
//
//    public String buildG11Print() {
//        StringBuffer result = new StringBuffer();
//        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values()) {
//                if (kon.getCimSmgsGruzs().size() == 1) {
//                    CimSmgsGruz gruz = kon.getCimSmgsGruzs().values().iterator().next();
//                    if (gruz.getKgvn() != null) {
//                        result.append("ГНГ- ");
//                        result.append(gruz.getKgvn());
//                        result.append("\n");
//                    }
//                    if (gruz.getNzgrEu() != null) {
//                        result.append(gruz.getNzgrEu());
//                        result.append("\n");
//                    }
//                    if (gruz.getNzgr() != null) {
//                        result.append(gruz.getNzgr());
//                        result.append("\n");
//                    }
//
//                    if (gruz.getEkgvn() != null) {
//                        result.append("ЕТ СНГ- ");
//                        result.append(gruz.getEkgvn());
//                        result.append("\n");
//                    }
//                    if (gruz.getEnzgr() != null) {
//                        result.append(gruz.getEnzgr());
//                        result.append("\n");
//                    }
//                    if (gruz.getMassa() != null) {
//                        result.append("Масса- ");
//                        result.append(gruz.getMassa());
//                        result.append(" ");
//                    }
//                    if (gruz.getPlaces() != null) {
//                        result.append("Места- ");
//                        result.append(gruz.getPlaces());
//                        result.append("\n");
//                    }
//                } else {
////                    gruz = kon.getCimSmgsGruzs().get(index);
//                    for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                        if (gruz.getKgvn() != null) {
//                            result.append("ГНГ- ");
//                            result.append(gruz.getKgvn());
//                            result.append(" ");
//                        }
//                        if (gruz.getNzgrEu() != null) {
//                            result.append(gruz.getNzgrEu());
//                            result.append(" ");
//                        }
//                        if (gruz.getNzgr() != null) {
//                            result.append(gruz.getNzgr());
//                            result.append(" ");
//                        }
//                        if (gruz.getEkgvn() != null) {
//                            result.append("ЕТ СНГ- ");
//                            result.append(gruz.getEkgvn());
//                            result.append(" ");
//                        }
//                        if (gruz.getEnzgr() != null) {
//                            result.append(gruz.getEnzgr());
//                            result.append(" ");
//                        }
//                        if (gruz.getMassa() != null) {
//                            result.append("\n");
//                            result.append("Масса- ");
//                            result.append(gruz.getMassa());
//                            result.append(" ");
//                        }
//                        if (gruz.getPlaces() != null) {
//                            result.append("Места- ");
//                            result.append(gruz.getPlaces());
//                            result.append("\n");
//                        }
//                    }
//                }
//            }
//        }
//        return result.toString();
//    }
//
//    public String buildG16Print() {
//        return StringUtils.defaultString(g14);
//    }
//
//    public String buildG13Print() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(getG24N() != null ? "Н-" + getG24N() : "");
//        sb.append(getG24T() != null ? "\nТ-" + getG24T() : "");
//        sb.append(getG24B() != null ? "\nБ-" + getG24B() : "");
//        return sb.toString();
//    }
//
//    public String buildG18Print() {
//        for (CimSmgsCarList car : cimSmgsCarLists.values())
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values()) {
//                return StringUtils.defaultString(kon.getVid());
//            }
//        return "";
//    }
//
//    public String buildG21Print() {
//        return "X";
//    }
//
//    public String buildG21_pl1Print() {
//        return "XXXXXXXXXXXXXXXXXX";
//    }
//
//    public String buildG21_pl2Print() {
//        return "XXXXXXXXXXXXXXXXXX";
//    }
//
//    public String buildG21TxtPrint() {
//        return StringUtils.defaultString(getG25Txt());
//    }
//
//    public String buildG22_1Print() {
//        return (gs_22 != null && gs_22 == 1 ? "X" : "");
//    }
//
//    public String buildG22_2Print() {
//        return (gs_22 != null && gs_22 == 2 ? "X" : "");
//    }
//
//    public String buildG22_pl1Print() {
//        return (gs_22 != null && gs_22 == 2 ? "XXXXXXXXXXXXXXXXXX" : "");
//    }
//
//    public String buildG22_pl2Print() {
//        return (gs_22 != null && gs_22 == 1 ? "XXXXXXXXXXXXXXXXXX" : "");
//    }
//
//    public String buildG22CimPrint() {
//        return (g21 != null && g21 == 1 ? "X" : "");
//    }
//
//    public String buildG12SlovNPrint() {
//        return (g21 != null && g21 == 1 ? "X" : "");
//    }
//
//    public String buildG23CimPrint() {
//        return (g22 != null && g22 == 1 ? "X" : "");
//    }
//
//    public String buildG13SlovNPrint() {
//        return (g22 != null && g22 == 1 ? "X" : "");
//    }
//
//    public String buildG58_1CimPrint() {
//        return (gb661 != null && gb661 == 1 ? "X" : "");
//    }
//
//    public String buildG19Print() {
//        StringBuilder sb = new StringBuilder();
//        for (CimSmgsCarList car : cimSmgsCarLists.values())
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values()) {
//                sb.append(kon.getKodSob() != null ? kon.getKodSob() : "");
//                sb.append(StringUtils.isNotBlank(kon.getUtiN()) ? "  " + kon.getUtiN() + " P" : "");
//            }
//        return sb.toString();
//    }
//
//    public String buildG19_1Print() {
//        StringBuilder sb = new StringBuilder();
//        for (CimSmgsCarList car : cimSmgsCarLists.values())
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values()) {
//                sb.append(kon.getKodSob() != null ? kon.getKodSob() : "");
//                sb.append(StringUtils.isNotBlank(kon.getUtiN()) ? "  " + kon.getUtiN() : "");
//            }
//        return sb.toString();
//    }
//
//    public String buildG20Print() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(StringUtils.isNotBlank(getG18()) ? getG18() : "");
//        sb.append(StringUtils.isNotBlank(getG18r()) ? "\n" + getG18r() : "");
//        return sb.toString();
//    }
//
//    public String g7Disp4PrintCim() {
//        ArrayList<String> arr1 = new ArrayList<String>();
//        ArrayList<String> arr2 = new ArrayList<String>();
//        int diff;
//        StringBuilder result = new StringBuilder();
//
//        for (CimSmgsDocs elem : cimSmgsDocses7.values()) {
//            arr1.add(
//                    (elem.getCode() != null ? "7." + elem.getCode() + " " : "") +
//                            (elem.getText() != null ? elem.getText() + " " : "") +
//                            (elem.getText2() != null ? elem.getText2() : "") +
//                            "<br/>"
//            );
//        }
//        for (CimSmgsPlatel elem : cimSmgsPlatels.values()) {
//            arr2.add(
//                    (elem.getDor() != null ? elem.getDor() + " " : "") +
//                            (elem.getPlat() != null ? elem.getPlat() + " " : "") +
//                            (elem.getPrim() != null ? elem.getPrim() + " " : "") +
//                            (elem.getKplat() != null ? elem.getKplat() + " " : "") +
//                            (elem.getKplat1() != null ? elem.getKplat1() : "") +
//                            "<br/>"
//            );
//        }
//        diff = arr1.size() - arr2.size();
//        if (diff > 0) {
//            do {
//                arr2.add("");
//                diff--;
//            } while (diff > 0);
//        } else if (diff < 0) {
//            do {
//                arr1.add("");
//                diff++;
//            } while (diff < 0);
//        }
//        for (int i = 0; i < arr1.size(); i++) {
//            result.append(arr1.get(i));
//            result.append(arr2.get(i));
//        }
//        return result.toString();
//    }
//
//    public String buildG14SlovNPrint() {
//        StringBuilder result = new StringBuilder();
//        String prefix = "";
//        for (CimSmgsPlatel plat : cimSmgsPlatels.values()) {
//            result.append(prefix);
//            prefix = "\n";
//            result.append(StringUtils.isNotBlank(plat.getPlat()) ? plat.getPlat() : "");
//            result.append(StringUtils.isNotBlank(plat.getPrim()) ? ", " + plat.getPrim() : "");
//            result.append(StringUtils.isNotBlank(plat.getKplat()) ? ", " + plat.getKplat() : "");
//            result.append(StringUtils.isNotBlank(plat.getKplat1()) ? ", " + plat.getKplat1() : "");
//        }
//        return result.toString();
//    }
//
//    public String buildG22SlovNPrint() {
//        StringBuilder result = new StringBuilder();
//        String prefix = "";
//        for (CimSmgsDocs doc : cimSmgsDocses9.values()) {
//            result.append(prefix);
//            prefix = "\n";
//            result.append(StringUtils.isNotBlank(doc.getText2()) ? doc.getText2() : "");
//            result.append(StringUtils.isNotBlank(doc.getNdoc()) ? " " + doc.getNdoc() : "");
//            result.append(doc.getDat() != null ? " " + new SimpleDateFormat("dd.MM.yyyy").format(doc.getDat()) : "");
//            result.append(doc.getNcopy() != null ? " " + doc.getNcopy() : "");
//        }
//        return result.toString();
//    }
//
//    public String buildG7CimPrint() {
//        ArrayList<String> arr1 = new ArrayList<String>();
//        ArrayList<String> arr2 = new ArrayList<String>();
//        int diff;
//        StringBuilder result = new StringBuilder();
//
//        for (CimSmgsDocs elem : cimSmgsDocses7.values()) {
//            arr1.add(
//                    (elem.getCode() != null ? "7." + elem.getCode() + " " : "") +
//                            (elem.getText() != null ? elem.getText() + " " : "") +
//                            (elem.getText2() != null ? elem.getText2() : "") +
//                            "\n"
//            );
//        }
//        for (CimSmgsPlatel elem : cimSmgsPlatels.values()) {
//            arr2.add(
//                    (elem.getDor() != null ? elem.getDor() + " " : "") +
//                            (elem.getPlat() != null ? elem.getPlat() + " " : "") +
//                            (elem.getPrim() != null ? elem.getPrim() + " " : "") +
//                            (elem.getKplat() != null ? elem.getKplat() + " " : "") +
//                            (elem.getKplat1() != null ? elem.getKplat1() : "") +
//                            "\n"
//            );
//        }
//        diff = arr1.size() - arr2.size();
//        if (diff > 0) {
//            do {
//                arr2.add("");
//                diff--;
//            } while (diff > 0);
//        } else if (diff < 0) {
//            do {
//                arr1.add("");
//                diff++;
//            } while (diff < 0);
//        }
//        for (int i = 0; i < arr1.size(); i++) {
//            result.append(arr1.get(i));
//            result.append(arr2.get(i));
//        }
//        return result.toString();
//    }
//
//    public String g9Disp4Print() {
//        String _f9 = "";
//
//        for (CimSmgsDocs elem : cimSmgsDocses9.values()) {
//            if (elem.getText() != null && elem.getText().length() > 0)
//                _f9 += (elem.getText() != null ? elem.getText() + " " : "");
//            if (elem.getText2() != null && elem.getText2().length() > 0)
//                _f9 += (elem.getText2() != null ? elem.getText2() : "");
//            _f9 += "<br/>";
//        }
//
//        return _f9;
//    }
//
//    public String buildG9Cs() {
//        StringBuffer _f9 = new StringBuffer();
//
//        for (CimSmgsDocs elem : cimSmgsDocses9.values()) {
//            _f9.append(buildG9Cs(elem));
//            _f9.append("\n");
//        }
//
//        delLastSimbolIfEqual("\n", _f9);
//
//
//        return _f9.toString();
//    }
//
//    public String buildG9Cs(CimSmgsDocs elem) {
//        StringBuffer _f9 = new StringBuffer();
//        _f9.append(elem.getText() != null ? elem.getText() + " " : "");
//        _f9.append(elem.getText2() != null ? elem.getText2() + " " : "");
//        _f9.append(elem.getNdoc() != null ? elem.getNdoc() + " " : "");
//        _f9.append(elem.getDat() != null ? "от " + new SimpleDateFormat("dd.MM.yyyy").format(elem.getDat()) + " " : "");
//        _f9.append(elem.getNcopy() != null ? elem.getNcopy() + " экз " : "");
//        return _f9.toString();
//
//    }
//
//    public String buildG19Cs(CimSmgsPlomb elem) {
//        StringBuffer _f19 = new StringBuffer();
//        _f19.append(elem.getZnak() != null ? elem.getZnak() + "-" : "");
//        _f19.append(elem.getKpl() != null ? elem.getKpl() : "1");
//        return _f19.toString();
//
//    }
//
//
//    public String buildG9CimPrint() {
//        String _f9 = "";
//        for (CimSmgsDocs elem : cimSmgsDocses9.values()) {
//            _f9 += (elem.getText() != null ? elem.getText() + " " : "");
//            _f9 += (elem.getNdoc() != null ? elem.getNdoc() + " " : "");
//            _f9 += (elem.getDat() != null ? "от " + new SimpleDateFormat("dd.MM.yyyy").format(elem.getDat()) + " " : "");
//            _f9 += (elem.getNcopy() != null ? elem.getNcopy() + " экз " : "");
//            _f9 += "\n";
//        }
//        return _f9;
//    }
//
//    /**
//     * гр. 24 СМГС2
//     * Вид графы [Тип документа]: список документов данного типа вида: [номер документа] от [дата]
//     * документы с одинаковой датой и номер не дублируются
//     * документы группируются по типу
//     * @return
//     */
//    public String buildG23Print() {
//
//        // если печатать в доп лист
//        if (getG9c() != null && getG9c() == 1) {
//            return DOP_LIST_PRINT_CS2;
//        }
//
//        LinkedHashMap<String, Set<String>> printMap = new LinkedHashMap<>();
//        StringBuilder print = new StringBuilder();
//
//        for (CimSmgsDocs elem : cimSmgsDocses9.values()) {
//            String docType = StringUtils.capitalize(StringUtils.defaultString(elem.getText()).trim().toLowerCase());
//            String nDoc= StringUtils.defaultString(elem.getNdoc());
//            String dateStr=elem.getDat() != null ? " от " + df.format(elem.getDat()) : "";
//            String docStr=nDoc+dateStr;
//            if(printMap.get(docType)!=null){
//                printMap.get(docType).add(docStr);
//            }else{
//                Set<String> docs= new LinkedHashSet<>();
//                docs.add(docStr);
//                printMap.put(docType,docs);
//            }
//        }
//        for (String printDocType:printMap.keySet()) {
//            String nums=printMap.get(printDocType).stream().filter(StringUtils::isNotEmpty).collect(Collectors.joining(", "));
//            print.append(printDocType).append(printDocType.isEmpty()||nums.isEmpty()?"": ": ");
//            print.append(nums);
//            print.append("\n");
//        }
//        return print.toString();
//    }
//
//    public String buildG24CimPrint() {
//
//        String nhmDisp="990200";
//        List<CimSmgsGruz> gruzs;
//
//        if(isContOtpr()) {
//            gruzs = getCimSmgsCarLists().values().stream()
//                    .map(CimSmgsCarList::getCimSmgsKonLists)
//                    .map(Map::values)
//                    .flatMap(Collection::stream)
//                    .map(CimSmgsKonList::getCimSmgsGruzs)
//                    .map(Map::values)
//                    .flatMap(Collection::stream)
//                    .collect(Collectors.toList());
//
//        }else {
//            gruzs = getCimSmgsCarLists().values().stream()
//                    .map(CimSmgsCarList::getCimSmgsGruzs)
//                    .map(Map::values)
//                    .flatMap(Collection::stream)
//                    .collect(Collectors.toList());
//        }
//        if(gruzs.size()==0)
//            nhmDisp="";
//        if(gruzs.size()==1)
//            nhmDisp=StringUtils.defaultString(gruzs.get(0).getKgvn());
//        if(nhmDisp.length()>6)
//            nhmDisp=nhmDisp.substring(0,6);
//
//
//        return nhmDisp;
//    }
//
//    public String buildG20SlovNPrint() {
//        return StringUtils.defaultString(g23);
//    }
//
//
//    public String buildG20_1Print() {
//        Iterator<CimSmgsPlatel> it = getCimSmgsPlatels().values().iterator();
//        if (it.hasNext()) {
//            return buildG20Helper(StringUtils.defaultString(it.next().getDorR()));
//        } else {
//            return "";
//        }
//    }
//
//    public String buildG20_2Print() {
//        Iterator<CimSmgsPlatel> it = getCimSmgsPlatels().values().iterator();
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            return buildG20Helper(StringUtils.defaultString(it.next().getDorR()));
//        } else {
//            return "";
//        }
//    }
//
//    public String buildG20_3Print() {
//        Iterator<CimSmgsPlatel> it = getCimSmgsPlatels().values().iterator();
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            return buildG20Helper(StringUtils.defaultString(it.next().getDorR()));
//        } else {
//            return "";
//        }
//    }
//
//    public String buildG20_4Print() {
//        Iterator<CimSmgsPlatel> it = getCimSmgsPlatels().values().iterator();
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            return buildG20Helper(StringUtils.defaultString(it.next().getDorR()));
//        } else {
//            return "";
//        }
//    }
//
//    public String buildG20_5Print() {
//        Iterator<CimSmgsPlatel> it = getCimSmgsPlatels().values().iterator();
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            return buildG20Helper(StringUtils.defaultString(it.next().getDorR()));
//        } else {
//            return "";
//        }
//    }
//
//    public String buildG45_11Print() {
//        Iterator<CimSmgsPlomb> it = getCimSmgsPlombs().values().iterator();
//        Short kpl;
//        if (it.hasNext()) {
//            kpl = it.next().getKpl();
//            return kpl != null ? kpl.toString() : "";
//        } else {
//            return "";
//        }
//    }
//
//    public String buildG45_21Print() {
//        Iterator<CimSmgsPlomb> it = getCimSmgsPlombs().values().iterator();
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        Short kpl;
//        if (it.hasNext()) {
//            kpl = it.next().getKpl();
//            return kpl != null ? kpl.toString() : "";
//        } else {
//            return "";
//        }
//    }
//
//    public String buildG45_31Print() {
//        Iterator<CimSmgsPlomb> it = getCimSmgsPlombs().values().iterator();
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        Short kpl;
//        if (it.hasNext()) {
//            kpl = it.next().getKpl();
//            return kpl != null ? kpl.toString() : "";
//        } else {
//            return "";
//        }
//    }
//
//    public String buildG45_12Print() {
//        Iterator<CimSmgsPlomb> it = getCimSmgsPlombs().values().iterator();
//        if (it.hasNext()) {
//            return StringUtils.defaultString(it.next().getZnak());
//        } else {
//            return "";
//        }
//    }
//
//    public String buildGuZpu11Print() {
//        Iterator<CimSmgsPlomb> it = getCimSmgsPlombs().values().iterator();
//        if (it.hasNext()) {
//            return StringUtils.defaultString(it.next().getType());
//        } else {
//            return "";
//        }
//    }
//
//    public String buildGuZpu12Print() {
//        Iterator<CimSmgsPlomb> it = getCimSmgsPlombs().values().iterator();
//        if (it.hasNext()) {
//            return StringUtils.defaultString(it.next().getZnak());
//        } else {
//            return "";
//        }
//    }
//
//    public String buildG45_22Print() {
//        Iterator<CimSmgsPlomb> it = getCimSmgsPlombs().values().iterator();
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            return StringUtils.defaultString(it.next().getZnak());
//        } else {
//            return "";
//        }
//    }
//
//    public String buildGuZpu22Print() {
//        Iterator<CimSmgsPlomb> it = getCimSmgsPlombs().values().iterator();
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            return StringUtils.defaultString(it.next().getZnak());
//        } else {
//            return "";
//        }
//    }
//
//    public String buildGuZpu32Print() {
//        Iterator<CimSmgsPlomb> it = getCimSmgsPlombs().values().iterator();
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            return StringUtils.defaultString(it.next().getZnak());
//        } else {
//            return "";
//        }
//    }
//
//    public String buildPerevozDatePrint() {
//        return getPerevozDate() != null ? new SimpleDateFormat("dd.MM.yyyy").format(getPerevozDate()) : "";
//    }
//
//    public String buildGuVvozPrint() {
//        Map<Byte, CimSmgsKonList> konList;
//        CimSmgsKonList kon;
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 &&
//                (konList = getCimSmgsCarLists().values().iterator().next().getCimSmgsKonLists()).size() > 0) {
//            kon = konList.values().iterator().next();
//            result = kon.getVvoz() != null ? new SimpleDateFormat("dd.MM.yyyy").format(kon.getVvoz()) : "";
//        }
//        return result;
//    }
//
//    public String buildGuPogruzkaPrint() {
//        Map<Byte, CimSmgsKonList> konList;
//        CimSmgsKonList kon;
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 &&
//                (konList = getCimSmgsCarLists().values().iterator().next().getCimSmgsKonLists()).size() > 0) {
//            kon = konList.values().iterator().next();
//            result = kon.getPogruzka() != null ? new SimpleDateFormat("dd.MM.yyyy").format(kon.getPogruzka()) : "";
//        }
//        return result;
//    }
//
//    public String buildGuZajavNoPrint() {
//        Map<Byte, CimSmgsKonList> konList;
//        String result = "";
//        if (getCimSmgsCarLists().size() > 0 &&
//                (konList = getCimSmgsCarLists().values().iterator().next().getCimSmgsKonLists()).size() > 0) {
//            result = StringUtils.defaultString(konList.values().iterator().next().getZajavNo());
//        }
//        return result;
//    }
//
//    public String buildGuZpu42Print() {
//        Iterator<CimSmgsPlomb> it = getCimSmgsPlombs().values().iterator();
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            return StringUtils.defaultString(it.next().getZnak());
//        } else {
//            return "";
//        }
//    }
//
//    public String buildGuZpu21Print() {
//        Iterator<CimSmgsPlomb> it = getCimSmgsPlombs().values().iterator();
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            return StringUtils.defaultString(it.next().getType());
//        } else {
//            return "";
//        }
//    }
//
//    public String buildGuZpu31Print() {
//        Iterator<CimSmgsPlomb> it = getCimSmgsPlombs().values().iterator();
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            return StringUtils.defaultString(it.next().getType());
//        } else {
//            return "";
//        }
//    }
//
//    public String buildGuZpu41Print() {
//        Iterator<CimSmgsPlomb> it = getCimSmgsPlombs().values().iterator();
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            return StringUtils.defaultString(it.next().getType());
//        } else {
//            return "";
//        }
//    }
//
//    public String buildG45_32Print() {
//        Iterator<CimSmgsPlomb> it = getCimSmgsPlombs().values().iterator();
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            it.next();
//        } else {
//            return "";
//        }
//        if (it.hasNext()) {
//            return StringUtils.defaultString(it.next().getZnak());
//        } else {
//            return "";
//        }
//    }
//
//    public String g5Disp4PrintCmr() {
//        String _f9 = "";
//        for (CimSmgsDocs elem : cimSmgsDocses9.values()) {
//            _f9 += (elem.getText() != null ? elem.getText() + " " : "");
//            _f9 += (elem.getNdoc() != null ? elem.getNdoc() + " " : "");
//            _f9 += (elem.getDat() != null ? "от " + new SimpleDateFormat("dd.MM.yyyy").format(elem.getDat()) + " " : "");
//            _f9 += (elem.getNcopy() != null ? elem.getNcopy() + " экз " : "");
//            _f9 += "<br/>";
//        }
//        return _f9;
//    }
//
//    public String buildG5CmrPrint() {
//        String _f9 = "";
//        for (CimSmgsDocs elem : cimSmgsDocses9.values()) {
//            _f9 += (elem.getText() != null ? elem.getText() + " " : "");
//            _f9 += (elem.getNdoc() != null ? elem.getNdoc() + " " : "");
//            _f9 += (elem.getDat() != null ? "от " + new SimpleDateFormat("dd.MM.yyyy").format(elem.getDat()) + " " : "");
//            _f9 += (elem.getNcopy() != null ? elem.getNcopy() + " экз " : "");
//            _f9 += "\n";
//        }
//        return _f9;
//    }
//
//    public String g9Disp4PrintGu29k() {
//        String _f9 = "";
//        for (CimSmgsDocs elem : cimSmgsDocses9.values()) {
//            _f9 += (elem.getText() != null ? elem.getText() + " " : "");
//            _f9 += (elem.getNdoc() != null ? elem.getNdoc() + " " : "");
//            _f9 += (elem.getDat() != null ? "от " + new SimpleDateFormat("dd.MM.yyyy").format(elem.getDat()) + " " : "");
//            _f9 += (elem.getNcopy() != null ? elem.getNcopy() + " экз " : "");
//            _f9 += "<br/>";
//        }
//        return _f9;
//    }
//
//    public String buildGuG3Print() {
//        String _f9 = "";
//        for (CimSmgsDocs elem : cimSmgsDocses9.values()) {
//            _f9 += (elem.getText() != null ? elem.getText() + " " : "");
//            _f9 += (elem.getNdoc() != null ? elem.getNdoc() + " " : "");
//            _f9 += (elem.getDat() != null ? "от " + new SimpleDateFormat("dd.MM.yyyy").format(elem.getDat()) + " " : "");
//            _f9 += (elem.getNcopy() != null ? elem.getNcopy() + " экз " : "");
//            _f9 += "\n";
//        }
//        return _f9;
//    }
//
//    public String g13Disp4Print() {
//        String _f13 = "";
//        for (CimSmgsDocs elem : cimSmgsDocses13.values()) {
//            if (elem.getText() != null && elem.getText().length() > 0)
//                _f13 = _f13 + (elem.getCode() != null ? "13." + elem.getCode() + ". " : "") + (elem.getText() != null ? elem.getText() : "")
//                        + "<br/>";
//        }
//        for (CimSmgsDocs elem : cimSmgsDocses13.values()) {
//            if (elem.getText2() != null && elem.getText2().length() > 0)
//                _f13 = _f13 + (elem.getCode() != null ? "13." + elem.getCode() + ". " : "") + (elem.getText2() != null ? elem.getText2() : "")
//                        + "<br/>";
//        }
//
//        return _f13;
//    }
//
//    public String buildG13Cs() {
//        StringBuffer _f13 = new StringBuffer();
//        for (CimSmgsDocs item : cimSmgsDocses13.values()) {
//            _f13.append(item.getCode() != null ? item.getCode() + ". " : "");
//            _f13.append(item.getText() != null ? item.getText() : "");
//            _f13.append(item.getText() != null && item.getText2() != null ? " / " : "");
//            _f13.append(item.getText2() != null ? item.getText2() : "");
//            _f13.append(" ");
//        }
//
//        if (cimSmgsDocses136.size() > 0) _f13.append("6.");
//        for (CimSmgsDocs item : cimSmgsDocses136.values()) {
//            _f13.append(" ");
//            _f13.append(item.getNdoc() != null ? item.getNdoc() + " " : "");
//            _f13.append(item.getText() != null ? item.getText() : "");
//            _f13.append(item.getText() != null && item.getText2() != null ? " / " : "");
//            _f13.append(item.getText2() != null ? item.getText2() : "");
//            _f13.append((item.getText() != null || item.getText2() != null) && item.getText3() != null ? " / " : "");
//            _f13.append(item.getText3() != null ? item.getText3() : "");
//            _f13.append(";");
//        }
//        if (cimSmgsDocses136.size() > 0)
//            _f13.append("\n");
//
//        delLastSimbolIfEqual("\n", _f13);
//
//        return _f13.toString();
//    }
//
//    public String buildG13CsPrint() {
//        if (getG13c() != null && getG13c() == 1) {
////            return LIST_DOP_RU;
//            return getText("form.labelDopList");
//        } else {
//            return buildG13Cs();
//        }
//    }
//
//    public String g13Disp4PrintCim() {
//        String _f13 = "";
//        for (CimSmgsDocs elem : cimSmgsDocses13.values()) {
//            if (elem.getText() != null && elem.getText().length() > 0)
//                _f13 = _f13 + (elem.getCode() != null ? "13." + elem.getCode() + ". " : "") + (elem.getText() != null ? elem.getText() : "")
//                        + "<br/>";
//        }
//        for (CimSmgsDocs elem : cimSmgsDocses13.values()) {
//            if (elem.getText2() != null && elem.getText2().length() > 0)
//                _f13 = _f13 + (elem.getCode() != null ? "13." + elem.getCode() + ". " : "") + (elem.getText2() != null ? elem.getText2() : "")
//                        + "<br/>";
//        }
//
//        return _f13;
//    }
//
//    public String buildG13CimPrint() {
//        String _f13 = "";
//        for (CimSmgsDocs elem : cimSmgsDocses13.values()) {
//            if (elem.getText() != null && elem.getText().length() > 0)
//                _f13 = _f13 + (elem.getCode() != null ? "13." + elem.getCode() + ". " : "") + (elem.getText() != null ? elem.getText() : "")
//                        + "\n";
//        }
//        for (CimSmgsDocs elem : cimSmgsDocses13.values()) {
//            if (elem.getText2() != null && elem.getText2().length() > 0)
//                _f13 = _f13 + (elem.getCode() != null ? "13." + elem.getCode() + ". " : "") + (elem.getText2() != null ? elem.getText2() : "")
//                        + "\n";
//        }
//
//        return _f13;
//    }
//
//    public String g13Disp4PrintSmgs() {
//        String _f13 = "";
//        for (CimSmgsDocs elem : cimSmgsDocses13.values()) {
//            _f13 = _f13 + (elem.getText() != null ? elem.getText() + "  " : "");
//            _f13 = _f13 + (elem.getText2() != null ? elem.getText2() : "");
//            _f13 += " ";
//        }
//
//        return _f13;
//    }
//
//
//    public String buildG7Print() {
//        String _f13 = "";
//        for (CimSmgsDocs elem : cimSmgsDocses13.values()) {
//            _f13 = _f13 + (elem.getText() != null ? elem.getText() + "  " : "");
//            _f13 = _f13 + (elem.getText2() != null ? elem.getText2() : "");
//            _f13 += " ";
//        }
//
//        return _f13;
//    }
//
//    public String buildG8CsPrint() {
//        return g8;
//    }
//
//    public String buildG8Print() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(getG101() != null ? getG101() : "");
//        sb.append(" ");
//        sb.append(getG102() != null ? getG102() : "");
//        if (StringUtils.isNotBlank(getG101()) || StringUtils.isNotBlank(getG102())) {
//            sb.append("\n");
//        }
//        sb.append(getG101r() != null ? getG101r() : "");
//        sb.append(" ");
//        sb.append(getG102r() != null ? getG102r() : "");
//        if (StringUtils.isNotBlank(getG101r()) || StringUtils.isNotBlank(getG102r())) {
//            sb.append("\n");
//        }
//        sb.append(getG_10_3r() != null ? getG_10_3r() : "");
//        return sb.toString();
//    }
//
//    public String gruzGu27vDisp() {
//        StringBuilder sb = new StringBuilder();
//        for (CimSmgsCarList car : cimSmgsCarLists.values())
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values())
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sb.append(StringUtils.isNotEmpty(gruz.getEnzgr()) ? gruz.getEnzgr() : "");
//                    sb.append(StringUtils.isNotEmpty(gruz.getEkgvn()) ? "<br/>" + "ЕТСНГ-" + gruz.getEkgvn() : "");
//                    sb.append(StringUtils.isNotEmpty(gruz.getNzgr()) ? "<br/>" + gruz.getNzgr() : "");
//                    sb.append(StringUtils.isNotEmpty(gruz.getKgvn()) ? "<br/>" + "ГНГ-" + gruz.getKgvn() + "<br/>" : "");
//                }
//
//        return sb.toString();
//    }
//
//    public String buildG6_9CmrPrint() {
//        StringBuilder sb = new StringBuilder();
//        String prefix = "";
//        for (CimSmgsCarList car : cimSmgsCarLists.values())
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values()) {
//                sb.append(kon.gruzyPrintCmr1() + prefix);
//                prefix = "\n";
//            }
//
//        return sb.toString();
//    }
//
//    public String buildG10CmrPrint() {
//        StringBuilder sb = new StringBuilder();
//        String prefix = "";
//        for (CimSmgsCarList car : cimSmgsCarLists.values())
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values())
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sb.append(StringUtils.isNotBlank(gruz.getKgvn()) ? prefix + gruz.getKgvn() : "");
//                    prefix = "\n";
//                }
//
//        return sb.toString();
//    }
//
//    public String buildG11CmrPrint() {
//        StringBuilder sb = new StringBuilder();
//        String prefix = "";
//        for (CimSmgsCarList car : cimSmgsCarLists.values())
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values())
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sb.append(StringUtils.isNotBlank(gruz.g11CmrDisp()) ? prefix + gruz.g11CmrDisp() : "");
//                    prefix = "\n";
//                }
//
//        return sb.toString();
//    }
//
//    public String g14SmgsDisp() {
//        Integer sum = 0;
//        for (CimSmgsCarList car : cimSmgsCarLists.values())
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values())
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sum += gruz.getPlaces() != null ? gruz.getPlaces() : 0;
//                }
//
////		}
//
//        return (sum != 0 ? (new money2str(sum.doubleValue(), "NONE").getMoney2str().toString()) : "");
//    }
//
//    public String buildGuMestaPropPrint() {
//        Integer sum = 0;
//        for (CimSmgsCarList car : cimSmgsCarLists.values())
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values())
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sum += gruz.getPlaces() != null ? gruz.getPlaces() : 0;
//                }
//        return (sum != 0 ? (new money2str(sum.doubleValue(), "NONE").getMoney2str().toString()) : "");
//    }
//
//    public String buildG14Print() {
//        Integer sum = 0;
//        for (CimSmgsCarList car : cimSmgsCarLists.values())
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values())
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sum += gruz.getPlaces() != null ? gruz.getPlaces() : 0;
//                }
//        return (sum != 0 ? (new money2str(sum.doubleValue(), "NONE").getMoney2str().toString()) : "");
//    }
//
//    public String g14Gu27vDisp() {
//        Integer sum = 0;
//        String upak = "";
//        for (CimSmgsCarList car : cimSmgsCarLists.values())
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values())
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sum += gruz.getPlaces() != null ? gruz.getPlaces() : 0;
//                    if (car.getSort() == 0 && kon.getSort() == 0 && gruz.getSort() == 0 && StringUtils.isNotEmpty(gruz.getUpak())) {
//                        upak = gruz.getUpak();
//                    }
//                }
//        return (sum != 0 ? (new money2str(sum.doubleValue(), "NONE").getMoney2str().toString() /*+ " " + upak*/) : "");
//    }
//
//    public String buildGu27MestaPropPrint() {
//        Integer sum = 0;
//        String upak = "";
//        for (CimSmgsCarList car : cimSmgsCarLists.values())
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values())
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sum += gruz.getPlaces() != null ? gruz.getPlaces() : 0;
//                    if (car.getSort() == 0 && kon.getSort() == 0 && gruz.getSort() == 0 && StringUtils.isNotEmpty(gruz.getUpak())) {
//                        upak = gruz.getUpak();
//                    }
//                }
//        return (sum != 0 ? (new money2str(sum.doubleValue(), "NONE").getMoney2str().toString() /*+ " " + upak*/) : "");
//    }
//
//    // CIM нетто  итого
//    public String buildG24NCimPrint() {
//        StringBuilder value = new StringBuilder();
//        if (getG24N() != null) {
//            value.append("N:").append(getG24N());
//        }
//        return value.toString();
//    }
//
//    public String buildG21NSlovNPrint() {
//        StringBuilder value = new StringBuilder();
//        if (getG24N() != null) {
//            value.append(StringUtils.isNotEmpty(getNettoPref()) ? getNettoPref() : "");
//            value.append(getG24N());
//        }
//        return value.toString();
//    }
//
//    public String buildG21TSlovNPrint() {
//        StringBuilder value = new StringBuilder();
//        if (getG24T() != null) {
//            value.append(StringUtils.isNotEmpty(getTaraPref()) ? getTaraPref() : "");
//            value.append(getG24T());
//        }
//        return value.toString();
//    }
//
//    public String buildG21BSlovNPrint() {
//        StringBuilder value = new StringBuilder();
//        if (getG24B() != null) {
//            value.append(StringUtils.isNotEmpty(getBruttoPref()) ? getBruttoPref() : "");
//            value.append(getG24B());
//        }
//        return value.toString();
//    }
//
//    // Cim брутто
//    public String buildG24BCimPrint() {
//        StringBuilder value = new StringBuilder();
//        if (getG24B() != null) {
//            value.append("B:").append(getG24B());
//        }
//        return value.toString();
//    }
//
//    public String g21Disp4PrintCim() {
//        String nl = "<br/>", space = " ", slash = "/", comma = ",";
//        StringBuilder value = new StringBuilder();
//        CimSmgsCarList vag = getCimSmgsCarLists().get((byte) 0);
//        if (vag != null) {
//            for (CimSmgsKonList kon : vag.getCimSmgsKonLists().values()) {
//                if (kon.getSort() == (byte) 0) {
//                    value.append(vag.getCimSmgsKonLists().size());
//                    value.append(kon.getSizeFoot() != null ? "x" + kon.getSizeFoot() + "'" : "");
//                    value.append(StringUtils.isNotEmpty(kon.getKat()) ? space + kon.getKat() : "");
//                }
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    if (StringUtils.isNotEmpty(gruz.getKgvn())) {
//                        value.append(nl + "NHM " + gruz.getKgvn());
//                        nl = "";
//                    }
//                    if (StringUtils.isNotEmpty(gruz.getNzgr())) {
//                        if (nl.length() > 0) space = "";
//                        value.append(nl + space + gruz.getNzgr());
//                    }
//                    nl = "<br/>";
//                    if (StringUtils.isNotEmpty(gruz.getNzgrEu())) {
//                        value.append(nl + gruz.getNzgrEu());
//                    }
//                    if (StringUtils.isNotEmpty(gruz.getNzgrRid())) {
//                        value.append(nl + gruz.getNzgrRid());
//                    }
//                    if (StringUtils.isNotEmpty(gruz.getNzgrRidEu())) {
//                        value.append(nl + gruz.getNzgrRidEu());
//                    }
//                    if (gruz.getPlaces() != null) {
//                        value.append(nl + gruz.getPlaces());
//                    }
//                }
//                value.append(StringUtils.isNotEmpty(kon.getNvag()) ? nl + "ŠR voz." + space + kon.getNvag() : "");
//                value.append(StringUtils.isNotEmpty(kon.getG25()) ? slash + kon.getG25() : "");
//                value.append(nl);
//                value.append(StringUtils.isNotEmpty(kon.getUtiN()) ? kon.getUtiN() : "");
//                value.append(kon.getPrivat() == 1 ? space + "\"P\"" : "");
//                value.append(StringUtils.isNotEmpty(kon.getNettoPref()) ? space + kon.getNettoPref() : "");
//                value.append(kon.getNetto() != null ? space + kon.getNetto() : "");
//                value.append(StringUtils.isNotEmpty(kon.getNettoSuf()) ? kon.getNettoSuf() : "");
//                value.append(StringUtils.isNotEmpty(kon.getTaraPref()) ? space + kon.getTaraPref() : "");
//                value.append(kon.getTara() != null ? space + kon.getTara() : "");
//                value.append(StringUtils.isNotEmpty(kon.getTaraSuf()) ? kon.getTaraSuf() : "");
//                value.append(StringUtils.isNotEmpty(kon.getBruttoPref()) ? space + kon.getBruttoPref() : "");
//                value.append(kon.getBrutto() != null ? space + kon.getBrutto() : "");
//                value.append(StringUtils.isNotEmpty(kon.getBruttoSuf()) ? kon.getBruttoSuf() : "");
//                value.append(StringUtils.isNotEmpty(kon.getVid()) ? slash + kon.getVid() : "");
//                value.append(StringUtils.isNotEmpty(kon.getPrim()) ? nl + kon.getPrim() : "");
//            }
//        }
//
//        if (StringUtils.isNotEmpty(getG11_prim())) {
//            value.append(nl + getG11_prim().replaceAll("\n", "<br/>"));
//        }
//        return value.toString();
//    }
//
//    // Cim тара
//    public String buildG24TCimPrint() {
//        StringBuilder value = new StringBuilder();
//        if (getG24T() != null) {
//            value.append("T:").append(getG24T());
//        }
//        return value.toString();
//    }
//
//
//    public String buildG21CimPrint() {
//        StringBuilder value = new StringBuilder("<html>");
//        String nl = "<br />";
//        int gruzCount=0;
//        Integer totalPlaces=0;
//
////        Считаем общее количество мест и грузов
//        for (CimSmgsCarList cimSmgsCarList:getCimSmgsCarLists().values()) {
//            if(isContOtpr()) {
//                for (CimSmgsKonList konList : cimSmgsCarList.getCimSmgsKonLists().values()) {
//                    for (CimSmgsGruz gruz : konList.getCimSmgsGruzs().values()) {
//                        gruzCount++;
//                        if (gruz.getPlaces() != null)
//                            totalPlaces += gruz.getPlaces();
//                    }
//                }
//            }
//            else {
//                for (CimSmgsGruz gruz : cimSmgsCarList.getCimSmgsGruzs().values()) {
//                    gruzCount++;
//                    if (gruz.getPlaces() != null)
//                        totalPlaces += gruz.getPlaces();
//                }
//            }
//        }
//
//        //Вагон
//        for (CimSmgsCarList carList : getCimSmgsCarLists().values()) {
//            if (isContOtpr()) {
//                // Контейнер
//                for (CimSmgsKonList konList : carList.getCimSmgsKonLists().values()) {
//                    value.append("<span>");
//                    value.append("<b>").append(konList.getUtiN()).append("</b>").append(nl).append("Kod ").append(StringUtils.defaultString(konList.getNotes())).append(nl).append("</span>");
//                    //Пломбы
//                    String plombString = konList.getCimSmgsPlombs().values().stream().map(CimSmgsPlomb::getZnak).filter(StringUtils::isNotBlank).collect(Collectors.joining(","));
//                    if (StringUtils.isNotBlank(plombString))
//                        value.append("<span>Plombe:").append(plombString).append(nl).append("</span>");
//                    //Груз
//                    for (CimSmgsGruz gruz : konList.getCimSmgsGruzs().values()) {
//                        if (gruz.getPlaces() != null)
//                            value.append("<span>Package:").append(totalPlaces).append(nl).append("</span>");
//
//                        if (gruz.getKgvn() != null)
//                            value.append("<span>NHM:").append(gruzCount>1?"990200":gruz.getKgvn()).append(nl).append("</span>");
//                        String gruzStr = StringUtils.isNotBlank(gruz.getNzgrEu()) ? gruz.getNzgrEu() : "...";
//                        value.append("<span>").append(gruzCount>1?"laut Anhang":gruzStr).append(nl).append("</span>");
//
//                        return      value.append("</html>").toString();
//                    }
//                }
//                return      value.append("</html>").toString();
//            }
//            else {
//                //Пломбы
//                String plombString = carList.getCimSmgsPlombs().values().stream().map(CimSmgsPlomb::getZnak).filter(StringUtils::isNotBlank).collect(Collectors.joining(","));
//                if (StringUtils.isNotBlank(plombString))
//                    value.append("<span>Plombe:").append(plombString).append(nl).append("</span>");
//                //Груз
//                for (CimSmgsGruz gruz : carList.getCimSmgsGruzs().values()) {
//                    if (gruz.getPlaces() != null)
//                        value.append("<span>Package:").append(totalPlaces).append(nl).append(nl).append("</span>");
//                    if (gruz.getKgvn() != null)
//                        value.append("<span>NHM:").append(gruzCount>1?"990200":gruz.getKgvn()).append(nl).append("</span>");
//                    String gruzStr = StringUtils.isNotBlank(gruz.getNzgrEu()) ? gruz.getNzgrEu() : "...";
//                    value.append("<span>").append(gruzCount>1?"laut Anhang":gruzStr).append(nl).append("</span>");
//
//
//                    return      value.append("</html>").toString();
//                }
//
//            }
//            return      value.append("</html>").toString();
//        }
//
//        value.append("</html>");
//        return value.toString();
//    }
//
//    public String g13PrintCmr() {
//        String value = "";
//        if (StringUtils.isNotEmpty(getG15())) {
//            value = getG15().replaceAll("\n", "<br/>");
//        }
//        return value;
//    }
//
//    public String buildG13CmrPrint() {
//        return StringUtils.defaultString(getG15());
//    }
//
//    public String g18Disp4PrintCim() {
//        String result = "";
//        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
//            result = car.getNvag() != null ? car.getNvag() : "";
//            break;
//        }
//        result += getVagPrim() != null ? "<br/>" + getVagPrim() : "";
//        return result;
//    }
//
//    /**
//     * гр. 18 CIM
//     * @return
//     */
//    public String buildG18CimPrint() {
//        String result = "";
//        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
//            result = car.getNvag() != null ? car.getNvag() : "";
//            break;
//        }
////        result += getVagPrim() != null ? "\n" + getVagPrim() : "";
//        return result;
//    }
//
//    public String buildG17SlovNPrint() {
//        String result = "";
//        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
//            result = StringUtils.defaultString(car.getNvag());
//            break;
//        }
//        return result;
//    }
//
//    public String buildG18SlovNPrint() {
//        String result = "";
//        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
//            result = car.getTaraVag() != null ? car.getTaraVag().toString() : "";
//            break;
//        }
//        return result;
//    }
//
//    public String buildG19SlovNPrint() {
//        String result = "";
//        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
//            result = car.getKolOs() != null ? car.getKolOs().toString() : "";
//            break;
//        }
//        return result;
//    }
//
//    public String g24NPropis() {
//        String res = "";
//        if (g24N != null) {
//            StringTokenizer st = new StringTokenizer(g24N.toString(), ".");
//            int i = 0;
//            while (st.hasMoreTokens()) {
//                if (i == 0) {
//                    res = (new money2str(Double.parseDouble(st.nextToken()), "NONE").getMoney2str().toString());
//                } else {
//                    res += "." + st.nextToken();
//                }
//                i++;
//            }
//        }
//        return (res.length() > 0 ? res + " кг" : "");
////        return (g24N != null ? (new money2str(g24N.doubleValue(), "NONE").getMoney2str().toString()) : "");
//    }
//
//    public String buildGuMassaPropPrint() {
//        String res = "";
//        if (g24N != null) {
//            StringTokenizer st = new StringTokenizer(g24N.toString(), ".");
//            int i = 0;
//            while (st.hasMoreTokens()) {
//                if (i == 0) {
//                    res = (new money2str(Double.parseDouble(st.nextToken()), "NONE").getMoney2str().toString());
//                } else {
//                    res += "." + st.nextToken();
//                }
//                i++;
//            }
//        }
//        return (res.length() > 0 ? res + " кг" : "");
//    }
//
//
//    public String buildG11UtiPrefsSlovNPrint() {
//        StringBuilder value = new StringBuilder();
//        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values()) {
//                value.append(StringUtils.isNotEmpty(kon.getUtiN()) ? kon.getUtiN().substring(0, 4) + "\n" : "");
//            }
//            break;
//        }
//        return value.toString();
//    }
//
//    public String buildG11UtiNumsSlovNPrint() {
//        StringBuilder value = new StringBuilder();
//        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values()) {
//                value.append(StringUtils.isNotEmpty(kon.getUtiN()) ? kon.getUtiN().substring(4) + "\n" : "");
//            }
//            break;
//        }
//        return value.toString();
//    }
//
//    public String buildG11UtiQuantSlovNPrint() {
//        StringBuilder value = new StringBuilder();
//        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
//            value.append(car.getCimSmgsKonLists().size());
//            break;
//        }
//        return value.toString();
//    }
//
//    public String buildG11UtiNhmSlovNPrint() {
//        StringBuilder value = new StringBuilder();
//        int count = 1;
//        boolean hasGruz = false;
//        CimSmgsGruz gruz;
//        String prefix = "";
//        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values()) {
//
//                if (count == 1) {
//                    hasGruz = kon.getCimSmgsGruzs().size() > 0;
//                    if (hasGruz) {
//                        value.append(kon.getSizeFoot() != null ? kon.getSizeFoot() + "'" : "");
//                        gruz = kon.getCimSmgsGruzs().get((byte) 0);
//                        value.append(StringUtils.isNotEmpty(gruz.getKgvn()) ? " / " + gruz.getKgvn() : "");
//                    }
//                    count++;
//                }
//                if (!hasGruz) {
//                    value.append(prefix);
//                    prefix = "\n";
//                    value.append(kon.getSizeFoot() != null ? kon.getSizeFoot() + "'" : "");
//                    value.append(StringUtils.isNotEmpty(getG23()) ? " / " + getG23() : "");
//                }
//            }
//            break;
//        }
//        return value.toString();
//    }
//
//    public String buildG11SlovNPrint() {
//        StringBuilder value = new StringBuilder();
//        int count = 1;
//        boolean hasGruz = false;
//        String KONTAJNER = "kontajner";
//        String dataStr;
//        CimSmgsGruz gruz;
//        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values()) {
//                if (count == 1) {
//                    hasGruz = kon.getCimSmgsGruzs().size() > 0;
//                    value.append(car.getCimSmgsKonLists().size() + "x");
//                    if (hasGruz) {
//                        value.append("  Ložený " + KONTAJNER);
//                        value.append(StringUtils.isNotEmpty(kon.getKat()) ? " (" + kon.getKat() + ")" : "");
//                        gruz = kon.getCimSmgsGruzs().get((byte) 0);
//                        value.append(StringUtils.isNotEmpty(gruz.getNzgrEu()) ? "\n" + gruz.getNzgrEu() : "");
//                    } else {
//                        value.append("  Prázdny " + KONTAJNER);
//                        value.append(StringUtils.isNotEmpty(getG11_prim()) ? "\n" + getG11_prim() : "");
//                    }
//
//                    count++;
//                }
//                if (hasGruz) {
//                    dataStr = StringUtils.isNotEmpty(kon.getNvag()) ? "\n" + "ŠR vag: " + kon.getNvag() : "";
//                    if (StringUtils.isNotEmpty(kon.getG25())) {
//                        dataStr += StringUtils.isNotEmpty(dataStr) ? "/" + kon.getG25() : "\n" + kon.getG25();
//                    }
//                    value.append(dataStr);
//                }
//                value.append("\n");
//                value.append(StringUtils.isNotEmpty(kon.getUtiN()) ? kon.getUtiN() : "");
//                if (hasGruz) {
//                    value.append(StringUtils.isNotEmpty(kon.getNettoPref()) ? " " + kon.getNettoPref() : "");
//                    value.append(kon.getNetto() != null ? " " + kon.getNetto() : "");
//                    value.append(StringUtils.isNotEmpty(kon.getNettoSuf()) ? kon.getNettoSuf() : "");
//
//                    value.append(StringUtils.isNotEmpty(kon.getTaraPref()) ? " " + kon.getTaraPref() : "");
//                    value.append(kon.getTara() != null ? " " + kon.getTara() : "");
//                    value.append(StringUtils.isNotEmpty(kon.getTaraSuf()) ? kon.getTaraSuf() : "");
//
//                    value.append(StringUtils.isNotEmpty(kon.getBruttoPref()) ? " " + kon.getBruttoPref() : "");
//                    value.append(kon.getBrutto() != null ? " " + kon.getBrutto() : "");
//                    value.append(StringUtils.isNotEmpty(kon.getBruttoSuf()) ? kon.getBruttoSuf() : "");
//
//                    value.append(StringUtils.isNotEmpty(kon.getPrim()) ? " " + kon.getPrim() : "");
//                } else {
//                    dataStr = StringUtils.isNotEmpty(kon.getTaraPref()) ? ", " + kon.getTaraPref() : "";
//                    if (kon.getTara() != null) {
//                        dataStr += StringUtils.isNotEmpty(dataStr) ? "" : ", ";
//                        dataStr += kon.getTara();
//                    }
//                    dataStr += StringUtils.isNotEmpty(dataStr) && StringUtils.isNotEmpty(kon.getTaraSuf()) ? kon.getTaraSuf() : "";
//                    value.append(dataStr);
//
//                    value.append(StringUtils.isNotEmpty(kon.getVid()) ? ", " + kon.getVid() : "");
//
//                    dataStr = StringUtils.isNotEmpty(kon.getNettoPref()) ? ", " + kon.getNettoPref() : "";
//                    if (kon.getNetto() != null) {
//                        dataStr += StringUtils.isNotEmpty(dataStr) ? "" : ", ";
//                        dataStr += kon.getNetto();
//                    }
//                    dataStr += StringUtils.isNotEmpty(dataStr) && StringUtils.isNotEmpty(kon.getNettoSuf()) ? kon.getNettoSuf() : "";
//                    value.append(dataStr);
//                }
//            }
//            break;
//        }
//        return value.toString();
//    }
//
//
//    public String g12SmgsDispMalash() {
//        Integer sum = 0;
//        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values()) {
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sum += gruz.getPlaces() != null ? gruz.getPlaces() : 0;
//                }
//            }
//        }
//
//        return (sum != 0 ? "1<br/>" + sum.toString() : "1");
//    }
//
//    public String g24BDisp4Print() {
//        String res = "";
//        if (g24B != null) {
//            StringTokenizer st = new StringTokenizer(g24B.toString(), ".");
//            int i = 0;
//            while (st.hasMoreTokens()) {
//                if (i == 0) {
//                    res = (new money2str(Double.parseDouble(st.nextToken()), "NONE").getMoney2str().toString());
//                } else {
//                    res += "." + st.nextToken();
//                }
//                i++;
//            }
//        }
//        return (res.length() > 0 ? res + " кг" : "");
//    }
//
//    public String buildG15Print() {
//        String res = "";
//        if (g24B != null) {
//            StringTokenizer st = new StringTokenizer(g24B.toString(), ".");
//            int i = 0;
//            while (st.hasMoreTokens()) {
//                if (i == 0) {
//                    res = (new money2str(Double.parseDouble(st.nextToken()), "NONE").getMoney2str().toString());
//                } else {
//                    res += "." + st.nextToken();
//                }
//                i++;
//            }
//        }
//        return (res.length() > 0 ? res + " кг" : "");
//    }
//
//    public String buildG15SlovNPrint() {
//        return this.g15;
//    }
//
//    public String g11Disp4Print(Byte index) {
//        StringBuffer result = new StringBuffer();
//        for (CimSmgsCarList car : cimSmgsCarLists.values()) {
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values()) {
//                CimSmgsGruz gruz;
//                if (kon.getCimSmgsGruzs().size() == 1) {
//                    gruz = kon.getCimSmgsGruzs().values().iterator().next();
//                    if (gruz.getKgvn() != null) {
//                        result.append("ГНГ- ");
//                        result.append(gruz.getKgvn());
//                        result.append("<br/>");
//                    }
//                    if (gruz.getNzgrEu() != null) {
//                        result.append("<span class=\"chinese\">");
//                        result.append(gruz.getNzgrEu());
//                        result.append("</span>");
//                        result.append("<br/>");
//                    }
//                    if (gruz.getNzgr() != null) {
//                        result.append(gruz.getNzgr());
//                        result.append("<br/>");
//                    }
//
//                    if (gruz.getEkgvn() != null) {
//                        result.append("ЕТ СНГ- ");
//                        result.append(gruz.getEkgvn());
//                        result.append("<br/>");
//                    }
//                    if (gruz.getEnzgr() != null) {
//                        result.append(gruz.getEnzgr());
//                        result.append("<br/>");
//                    }
//                    if (gruz.getMassa() != null) {
//                        result.append("Масса- ");
//                        result.append(gruz.getMassa());
//                        result.append("&nbsp;");
//                    }
//                    if (gruz.getPlaces() != null) {
//                        result.append("Места- ");
//                        result.append(gruz.getPlaces());
//                        result.append("<br/>");
//                    }
//                } else {
//                    gruz = kon.getCimSmgsGruzs().get(index);
////                    for (CimSmgsGruz gruzy : kon.getCimSmgsGruzs().values()) {
//                    if (gruz.getKgvn() != null) {
//                        result.append("ГНГ- ");
//                        result.append(gruz.getKgvn());
//                        result.append("&nbsp;");
//                    }
//                    if (gruz.getNzgrEu() != null) {
//                        result.append("<span class=\"chinese\">");
//                        result.append(gruz.getNzgrEu());
//                        result.append("</span>");
//                        result.append("&nbsp;");
//                    }
//                    if (gruz.getNzgr() != null) {
//                        result.append(gruz.getNzgr());
//                        result.append("&nbsp;");
//                    }
//                    if (gruz.getEkgvn() != null) {
//                        result.append("ЕТ СНГ- ");
//                        result.append(gruz.getEkgvn());
//                        result.append("&nbsp;");
//                    }
//                    if (gruz.getEnzgr() != null) {
//                        result.append(gruz.getEnzgr());
//                        result.append("&nbsp;");
//                    }
//                    if (gruz.getMassa() != null) {
//                        result.append("<br/>");
//                        result.append("Масса- ");
//                        result.append(gruz.getMassa());
//                        result.append("&nbsp;");
//                    }
//                    if (gruz.getPlaces() != null) {
//                        result.append("Места- ");
//                        result.append(gruz.getPlaces());
//                        result.append("<br/>");
//                    }
////                    }
//                }
//            }
//        }
//        return result.toString();
//    }
//
//    public String g15Disp4Print() {
//        BigDecimal sum = new BigDecimal(0);
//
//        for (CimSmgsCarList car : cimSmgsCarLists.values())
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values())
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    sum = sum.add(gruz.getMassa() != null ? gruz.getMassa() : new BigDecimal(0));
//                }
//
////		}
//        return (sum.intValue() != 0 ? (new money2str(sum.doubleValue(), "NONE").getMoney2str().toString()) : "");
//    }
//
//    public String g27Disp4Print() {
//        String _g27 = "";
//        if (g27 != null && g27.trim().length() > 0) {
//            StringTokenizer st = new StringTokenizer(g27);
//            while (st.hasMoreTokens()) {
//                _g27 += st.nextToken().trim() + "<br/>";
//            }
//        }
//        return _g27;
//    }
//
//    public String buildG27CsPrint() {
//        String _g27 = "";
//        if (g27 != null && g27.trim().length() > 0) {
//            StringTokenizer st = new StringTokenizer(g27);
//            while (st.hasMoreTokens()) {
//                _g27 += st.nextToken().trim() + "\n";
//            }
//        }
//        return _g27;
//    }
//
//    public String buildG25Print() {
//        return "X";
//    }
//
//    public String buildG25_1CsPrint() {
//        return (g25 != null && g25 == 1 ? "X" : "");
//    }
//
//    public String buildG25_2CsPrint() {
//        return (g25 != null && g25 == 2 ? "X" : "");
//    }
//
//    public String buildGb661Print() {
//        return getGb661() != null && getGb661() == 1 ? "X" : "";
//    }
//
//    public String buildFrankofrachtPrint() {
//        return getFrankofracht() != null && getFrankofracht() == 1 ? "X" : "";
//    }
//
//    public String buildIncotermsPrint() {
//        return getIncoterms() != null && getIncoterms() == 1 ? "X" : "";
//    }
//
//    public String ga66Disp4Print() {
//        String _ga66 = "";
//        if (ga66 != null && ga66.trim().length() > 0) {
//            StringTokenizer st = new StringTokenizer(ga66, "\n\r");
//            while (st.hasMoreTokens()) {
//                _ga66 += st.nextToken().trim() + "<br/>";
//            }
//        }
//        return _ga66;
//    }
//
//    public String buildGa66CsPrint() {
//        return StringUtils.defaultString(ga66);
//    }
//
//    public String buildGa66Print() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(StringUtils.defaultString(ga66));
//        if (sb.length() > 0) {
//            sb.append("\n");
//        }
//        sb.append(StringUtils.defaultString(ga661));
//        if (sb.length() > 0) {
//            sb.append(" ");
//        }
//        sb.append(StringUtils.defaultString(ga662));
//        return sb.toString();
//    }
//
//    public String g28Disp4Print() {
//        String _g28 = "";
//        if (g28 != null && g28.trim().length() > 0) {
//            StringTokenizer st = new StringTokenizer(g28);
//            while (st.hasMoreTokens()) {
//                _g28 += st.nextToken().trim() + (g281 != null ? " " + new SimpleDateFormat("yy.MM.dd").format(g281) : "") + "<br/>";
//            }
//        }
//        return _g28;
//    }
//
//    /**
//     * Текст - Копия
//     *
//     * @return строкадля печати
//     */
//    public String buildGCopyTextPrint() {
//        for (Status status : getStatuses()) {
//            if (status.getStatusDir().getHid().intValue() == 17) {
//                return "Kopie";
//            }
//        }
//
//        return "";
//    }
//
//    public String buildG28CsPrint() {
//        return StringUtils.defaultString(g28);
//    }
//
//    public String buildG281CsPrint() {
//        return (g281 != null ? " " + new SimpleDateFormat("yy.MM.dd").format(g281) : "");
//    }
//
//    public String buildG281CsEuPrint() {
//        return (g281 != null ? " " + new SimpleDateFormat("yyyy-MM-dd").format(g281) : "");
//    }
//
//    public String gs47Disp() {
//        return (g67 != null ? " " + new SimpleDateFormat("yy.MM.dd").format(g67) : "");
//    }
//
//    public String buildG67Print() {
//        return (g67 != null ? " " + new SimpleDateFormat("yy.MM.dd").format(g67) : "");
//    }
//
//    public String buildG59CimPrint() {
//        return (g67 != null ? " " + new SimpleDateFormat("yy.MM.dd").format(g67) : "");
//    }
//
//    public String buildG47Print() {
//        return (g67 != null ? " " + new SimpleDateFormat("yy.MM.dd").format(g67) : "");
//    }
//
//    public String buildG29_1CimPrint() {
//        return (g281 != null ? " " + new SimpleDateFormat("yy.MM.dd").format(g281) : "");
//    }
//
//    public String buildG21_2CmrPrint() {
//        return (g281 != null ? " " + new SimpleDateFormat("yy.MM.dd").format(g281) : "");
//    }
//
//
//    public Date buildG16Date() {
//        Date res = null;
//
//        if (StringUtils.isNotBlank(g161)) {
//            String[] ss = g161.split("-");
//            if (ss.length >= 2) {
//                String s1 = ss[0];
//                String s2 = ss[1];
//                if (StringUtils.isNotBlank(s1) && StringUtils.isNotBlank(s2)) {
//                    try {
//                        Calendar cal = Calendar.getInstance();
//                        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(s2));
//                        cal.set(Calendar.MONTH, Integer.parseInt(s1) - 1);
//                        cal.set(Calendar.HOUR_OF_DAY, 0);
//                        cal.set(Calendar.MINUTE, 0);
//                        cal.set(Calendar.SECOND, 0);
//                        cal.set(Calendar.MILLISECOND, 0);
//                        Calendar cur = Calendar.getInstance();
//                        cur.add(Calendar.MONTH, 2);
//                        if (cal.after(cur)) {
//                            cal.add(Calendar.YEAR, -1);
//                        }
//                        res = cal.getTime();
//                    } catch (Exception ex) {
//                    }
//                }
//            }
//        }
//
//        return res;
//    }
//
//
//    public String buildG23CsPrint() {
//        StringBuffer result = new StringBuffer("");
//        if (g23 != null && g23.length() > 0) {
//            result.append("NHM-");
//            result.append(g23);
//        }
//        if (g23b != null && g23b.length() > 0) {
//            result.append("\n");
//            result.append("ЕТ СНГ-");
//            result.append(g23b);
//        }
//        return result.toString();
//    }
//
//    public String buildG23CsEuPrint() {
//        StringBuilder result = new StringBuilder("");
//        Map<Integer, String> map = new TreeMap<>();
//
//        StringTokenizer stG23;
//        int count;
//        if (g23 != null && g23.length() > 0) {
//            stG23 = new StringTokenizer(g23, ",");
//            count = stG23.countTokens();
//            for (int i = 0; i < count; i++) {
//                map.put(i, "NHM-" + stG23.nextToken());
//            }
//        }
//
//        if (g23b != null && g23b.length() > 0) {
//            stG23 = new StringTokenizer(g23b, ",");
//            count = stG23.countTokens();
//            for (int i = 0; i < count; i++) {
//                String nhm = map.get(i);
//                if (nhm == null) {
//                    nhm = "";
//                }
//                nhm += "\nЕТ СНГ-" + stG23.nextToken();
//                map.put(i, nhm);
//            }
//        }
//
//        for (String codes : map.values()) {
//            result.append(codes).append("\n");
//        }
//
//        return result.toString();
//    }
//
//
//    public String buildG24CsPrint() {
//        StringBuffer result = new StringBuffer("");
//        if (g24N != null) {
//            result.append("N: ");
//            result.append(g24N);
//        }
//        if (g24T != null) {
//            result.append("\n");
//            result.append("T: ");
//            result.append(g24T);
//        }
//        if (g24B != null) {
//            result.append("\n");
//            result.append("B: ");
//            result.append(g24B);
//            result.append("\n");
//            result.append(g24BDisp4Print());
//        }
//        if (g_24_bcn != null) {
//            result.append("\n");
//            result.append(g_24_bcn);
//        }
//        return result.toString();
//    }
//
//
//    public String buildG29CsPrint() {
//        StringBuffer result = new StringBuffer("");
//        String sep = "";
//        if (g29 != null && g29.length() > 0 && g29r != null && g29r.length() > 0) {
//            sep = "  /  ";
//        }
//        if (g29 != null && g29.length() > 0) {
//            result.append(g29);
//            result.append(sep);
//        }
//        if (g29r != null && g29r.length() > 0) {
//            result.append(g29r);
//        }
//        return result.toString();
//    }
//
//
//    /**
//     * Гр15-18. Наименование груза, род упаковки, кол-во мест, масса
//     *
//     * @return строкадля печати
//     */
//    public String buildG15Cs2Print() {
//
//        StringBuilder result = new StringBuilder();
//        String pre = PRINT_TABLE_DELIMITER;
//        // если печатать в доп лист
//        if (getG15c() != null && getG15c() == 1) {
//            return result.append(DOP_LIST_PRINT_CS2).append(pre).append(pre).append(pre).toString();
//        }
//
//        String prefix = "";
//        int contCount = 0;
//        boolean first = true;
//        String nettoSymbol="Н:";
//        String zeroSymbol="0.000";
//
//        for (CimSmgsCarList car : getCimSmgsCarLists().values()) {
//            contCount = contCount + car.getCimSmgsKonLists().size();
//        }
//
//        List<CimSmgsGruz> allGryzes = getAndGroupAllgryzes();
//
//
//        for (CimSmgsGruz gruz : allGryzes) {
////            result.append(prefix);
//            prefix = PRINT_TABLE_DELIMITER;
//
//
//            if (StringUtils.isNotBlank(gruz.getKgvn())) {
//                result.append("ГНГ-").append(StringUtils.defaultString(gruz.getKgvn()));
//            }
//            if (StringUtils.isNotBlank(gruz.getEkgvn())) {
//                result.append(" ЕТСНГ-").append(StringUtils.defaultString(gruz.getEkgvn()));
//            }
//            result.append("\n");
//            result.append(StringUtils.defaultString(gruz.getNzgr()));
//            result.append("\n");
//            result.append(StringUtils.defaultString(gruz.getNzgrEu()));
//
//            if(gruz.getCimSmgsDanGruzs().size()>0)
//                result.append("\n");
//            for (CimSmgsDanGruz danGruz:gruz.getCimSmgsDanGruzs().values()) {
//                result.append(StringUtils.defaultString(danGruz.getCodDanger()));
//                result.append(danGruz.getNumOon()!=null&&!danGruz.getNumOon().trim().isEmpty()?("/UN"+danGruz.getNumOon()):"");
//                result.append(danGruz.getCarDName()!=null&&!danGruz.getCarDName().trim().isEmpty()?(" "+danGruz.getCarDName()):"");
//                result.append(danGruz.getClazz()!=null&&!danGruz.getClazz().trim().isEmpty()?(" "+danGruz.getClazz()):"");
//                result.append(danGruz.getDangSign()!=null&&!danGruz.getDangSign().trim().isEmpty()?(" ("+danGruz.getDangSign()+")"):"");
//                result.append(danGruz.getGroupPack()!=null&&!danGruz.getGroupPack().trim().isEmpty()?(", "+danGruz.getGroupPack()):"");
//                result.append(danGruz.getEmergenC()!=null&&!danGruz.getEmergenC().trim().isEmpty()?(", AK-"+danGruz.getEmergenC()):"");
//                result.append(danGruz.getStampDName()!=null&&!danGruz.getStampDName().trim().isEmpty()?(", "+danGruz.getStampDName()):"");
//                result.append(danGruz.getDopInfo()!=null&&!danGruz.getDopInfo().trim().isEmpty()?(" - "+danGruz.getDopInfo()):"");
//                result.append("\n");
//            }
//
//            result.append(prefix);
//            if (first && isContOtpr()) {
//                result.append("КОНТЕЙНЕР\n")
//                ;
//            }
//
//
//            if (first)
//                result.append("\n");
//
//            result.append(StringUtils.defaultString(gruz.getUpak()));
//
//            result.append(prefix);
//            if (first) {
//                if (contCount > 0)
//                    result.append(contCount).append("\n-----\n");
//            }
//            result.append(gruz.getPlaces() != null ? gruz.getPlaces() : "");
//            result.append(gruz.getPlacest() != null ?("\n"+gruz.getPlacest()): "");
//            result.append(prefix);
//
//            if (first && gruz.getMassa() != null && !gruz.getMassa().stripTrailingZeros().equals(new BigDecimal(0)))
//            {
//                nettoSymbol="";
//                zeroSymbol="";
//            }
//            first = false;
//            result.append(nettoSymbol).append(gruz.getMassa() != null?gruz.getMassa():zeroSymbol);
//            result.append(prefix);
//
//        }
//
//        if (g11_prim != null) {
//            prefix = PRINT_TABLE_DELIMITER;
//            result.append(g11_prim).append(prefix).append(prefix).append(prefix).append(prefix);
//        }
//        return result.toString();
//    }
//
//
//    /**
//     * Гр 15 Наименование груза как таблица с одной колонкой
//     *
//     * @return строка для печати
//     */
//    public String buildG15v2Cs2Print() {
//        StringBuilder result = new StringBuilder();
//
//        for (CimSmgsCarList car : getCimSmgsCarLists().values()) {
//            for (CimSmgsKonList kont : car.getCimSmgsKonLists().values()) {
//
//                for (CimSmgsGruz gruz : kont.getCimSmgsGruzs().values()) {
//
//                    if (StringUtils.isNotBlank(gruz.getKgvn())) {
//                        result.append("ГНГ-").append(StringUtils.defaultString(gruz.getKgvn()));
//                    }
//                    if (StringUtils.isNotBlank(gruz.getEkgvn())) {
//                        result.append(" ЕТСНГ-").append(StringUtils.defaultString(gruz.getEkgvn()));
//                    }
//                    result.append("\n");
//                    result.append(StringUtils.defaultString(gruz.getNzgr()));
//                    result.append(StringUtils.defaultString(gruz.getNzgrEu()));
//                    result.append("\n");
//                }
//            }
//        }
//        return result.toString();
//    }
//
//    public String buildRoutePrintTextPrint()
//    {
//        if(getRoute()!=null)
//        {
//            return StringUtils.defaultString(getRoute().getPrintText());
//        }
//        return "";
//    }
//    /**
//     * Графа 65 CImSmgs/ Cim
//     * @return
//     */
//    public String buildG65CsPrint()
//    {
//        StringBuilder result = new StringBuilder();
//        String prefix = PRINT_TABLE_DELIMITER;
//
//        // если не заполнены
//        if((StringUtils.isNotBlank(getG65())||StringUtils.isNotBlank(getG651()))&&!docType1.equals(new BigDecimal(21)))
//        {
//            result
//                    .append(StringUtils.defaultString(getG65()))
//                    .append(prefix)
//                    .append(StringUtils.defaultString(getG651()))
//                    .append(prefix)
//                    .append(StringUtils.defaultString(getG652()))
//                    .append(prefix);
//        }
//        else
//        {
//            for (CimSmgsPerevoz perevoz:getCimSmgsPerevoz().values()) {
//                result
//                        .append(StringUtils.defaultString(perevoz.getCodePer()))
//                        .append(" ")
//                        .append(StringUtils.defaultString(perevoz.getNamPer()))
//                        .append(prefix)
//                        .append(StringUtils.defaultString(perevoz.getAdmStBeg()))
//                        .append(" ")
//                        .append(StringUtils.defaultString(perevoz.getCodStBeg()))
//                        .append("   ")
//                        .append(StringUtils.defaultString(perevoz.getAdmStEnd()))
//                        .append(" ")
//                        .append(StringUtils.defaultString(perevoz.getCodStEnd()))
//                        .append(prefix)
//                        .append("1")
//                        .append(prefix);
//            }
//        }
//
//        return result.toString();
//    }
//
//    /**
//     *  Гр 15 итого
//     * @return строка для печати
//     */
//    public String buildPlacesPrint() {
//        int places = 0;
//
//        if(isContOtpr()) {
//            for (CimSmgsCarList car : getCimSmgsCarLists().values()) {
//                for (CimSmgsKonList kont : car.getCimSmgsKonLists().values()) {
//
//                    for (CimSmgsGruz gruz : kont.getCimSmgsGruzs().values()) {
//                        if (gruz.getPlaces() != null)
//                            places = places + gruz.getPlaces();
//                    }
//                }
//            }
//        }
//        else
//        {
//            for (CimSmgsCarList car : getCimSmgsCarLists().values()) {
//                for (CimSmgsGruz gruz : car.getCimSmgsGruzs().values()) {
//                    if (gruz.getPlaces() != null)
//                        places = places + gruz.getPlaces();
//                }
//            }
//        }
//
//        if (places == 0)
//            return "";
//
//        return "ИТОГО:"+ PRINT_TABLE_DELIMITER + Integer.toString(places);
//    }
//
//    public String buildKontsCountPrint() {
//        int countCount = 0;
//        for (CimSmgsCarList car : getCimSmgsCarLists().values()) {
//            if (car.getCimSmgsKonLists() != null)
//                countCount = countCount + car.getCimSmgsKonLists().size();
//        }
//        if (countCount == 0)
//            return "";
//        return "КОНТЕЙНЕРЫ:" + countCount;
//    }
//
//    /**
//     * Гр 16-18 Род упаковки, кол-во мест, масса
//     *
//     * @return строкадля печати
//     */
//    public String buildG161718Cs2Print() {
//        int kontCount = 0;
//        BigDecimal netto = new BigDecimal(0), brutto = new BigDecimal(0), tara = new BigDecimal(0);
//        for (CimSmgsCarList car : getCimSmgsCarLists().values()) {
//
//            kontCount += car.getCimSmgsKonLists().values().size();
//        }
//        int grCount = 0;
//        for (CimSmgsCarList car : getCimSmgsCarLists().values()) {
//
//            for (CimSmgsKonList kon : car.getCimSmgsKonLists().values()) {
//
//                for (CimSmgsGruz gruz : kon.getCimSmgsGruzs().values()) {
//                    if (gruz.getPlaces() != null)
//                        grCount += gruz.getPlaces();
//                    if (gruz.getMassa() != null)
//                        netto = netto.add(gruz.getMassa());
//                }
//            }
//        }
//
//        StringBuilder result = new StringBuilder();
//        String prefix = PRINT_TABLE_DELIMITER;
//        result.append("КОНТЕЙНЕР").append(prefix).append(kontCount).append(prefix).append(netto.doubleValue() > 0 ? "H:" + netto : "").append(prefix)
//                .append("------").append(prefix).append("-").append(prefix).append(g24T != null && g24T.doubleValue() > 0 ? "Т:" + g24T : "").append(prefix)
//                .append("МЕСТА").append(prefix).append(grCount).append(prefix).append(g24B != null ? "Б:" + g24B : "").append(prefix);
//
//        return result.toString();
//    }
//
//    //графа 5
//    public String buildG5Cs2Print() {
//        StringBuilder builder = new StringBuilder();
//        if (getG101r() != null)
//            builder.append(getG101r()).append(" ");
//
//        if (getG102r() != null)
//            builder.append(getG102r()).append("\n");
//
//        if (getG2017() != null)
//            builder.append(getG2017());
//
//        return builder.toString();
//    }
//
//
//    /**
//     * Гр6. Пограничные станции переходов
//     *
//     * @return строкадля печати
//     */
//    public String buildG6Cs2Print() {
//        String _f13 = "";
//        boolean addCode=shouldPrintAdmCodes();
//
//        for (CimSmgsDocs elem : cimSmgsDocses13.values()) {
//            _f13 = _f13 + (elem.getText3() != null ? elem.getText3() + "-" : "");
//            _f13 = _f13 + (elem.getText2() != null ? elem.getText2() + "-" : "");
//            if(addCode)
//                _f13 = _f13 + (elem.getText4() != null ? elem.getText4() + "-" : "");
//            _f13 = _f13 + (elem.getText() != null ? elem.getText() : "");
////            _f13 = _f13 + (elem.getRoad_s_name_r() != null ? elem.getRoad_s_name_r() : "");
//            _f13 += "\n";
//        }
//
//        return _f13;
//    }
//
//    /**
//     * Гр7-12. Вагон
//     *
//     * @return строкадля печати
//     */
//    public String buildG7Cs2Print() {
//        StringBuilder result = new StringBuilder();
//        String prefix = "";
//        if (getCimSmgsCarLists().values().size() < 2) {
//            for (CimSmgsCarList car : getCimSmgsCarLists().values()) {
//                result.append(prefix);
//                prefix = PRINT_TABLE_DELIMITER;
//                result.append(StringUtils.defaultString(car.getNvag()));
//                result.append(
//                        car.getScep() != null && StringUtils.isNotBlank(car.getRefSecNo()) || car.getRefSecKol() != null ?
//                                " PC" +
//                                        (StringUtils.isNotBlank(car.getRefSecNo()) ? " - " + car.getRefSecNo() : "") +
//                                        (car.getRefSecKol() != null ? "(" + car.getRefSecKol() + ")" : "")
//                                :
//                                ""
//                );
//                result.append(StringUtils.isNotBlank(car.getRod()) ? " " + car.getRod() : "");
//                result.append(StringUtils.isNotBlank(car.getKlientName()) ? ", " + car.getKlientName() : "");
//                result.append(StringUtils.isNotBlank(car.getNameSob()) ? ", " + car.getNameSob() : "");
//                result.append(StringUtils.isNotBlank(car.getKlientName2())?("\n\n\n"+car.getKlientName2()):"");
//
//                result.append(prefix);
//                result.append(StringUtils.defaultString(car.getVagOtm()));
//
//                result.append(prefix);
//                result.append(car.getGrPod() != null ? car.getGrPod() : "");
//
//                result.append(prefix);
//                result.append(car.getKolOs() != null ? car.getKolOs() : "");
//
//                result.append(prefix);
//                result.append(car.getTaraVag() != null ? (car.getTaraVag().doubleValue()<1000
//                        ?
//                        car.getTaraVag().multiply(new BigDecimal(1000)).stripTrailingZeros().toPlainString()
//                        :
//                        car.getTaraVag().stripTrailingZeros().toPlainString()) : "");
//                result.append(car.getTaraVagPr() != null
//                        ?
//                        ( "\n"+(car.getTaraVagPr().doubleValue()<1000
//                                ?
//                                car.getTaraVagPr().multiply(new BigDecimal(1000)).stripTrailingZeros().toPlainString()
//                                :
//                                car.getTaraVagPr().stripTrailingZeros().toPlainString()) )
//                        :
//                        "");
//
//                result.append(prefix);
//                result.append(StringUtils.defaultString(car.getCicternType()));
//            }
//        } else {
//            result.append("Согласно ведомости вагонов").append(PRINT_TABLE_DELIMITER).append(PRINT_TABLE_DELIMITER).append(PRINT_TABLE_DELIMITER).append(PRINT_TABLE_DELIMITER).append(PRINT_TABLE_DELIMITER);
//        }
//        return result.toString();
//    }
//
//    /**
//     * Гр19. Пломбы
//     *
//     * @return строкадля печати
//     */
//    public String buildG19Cs2Print() {
//        StringBuilder result = new StringBuilder();
//        // если печатать в доп лист
//        if (getG19c() != null && getG19c() == 1) {
//            result.append(PRINT_TABLE_DELIMITER).append(DOP_LIST_PRINT_CS2);
//            return result.toString();
//        }
//
//        //        Если количество вагонов больше 1, то выводим на печать "Согласно ведомости"
//        if(cimSmgsCarLists.size()>1) {
//            result.append(PRINT_TABLE_DELIMITER).append(SEE_IN_VED);
//            return result.toString();
//        }
//
//        String prefix = "";
//        for (CimSmgsPlomb plomb : getCimSmgsPlombs().values()) {
//            result.append(prefix);
//            prefix = PRINT_TABLE_DELIMITER;
//            result.append(plomb.getKpl() != null ? plomb.getKpl() : "");
//
//            result.append(prefix);
//            result.append(StringUtils.defaultString(plomb.getZnak()));
//        }
//        return result.toString();
//    }
//
//    /**
//     * Гр20. Погружено
//     *
//     * @return строкадля печати
//     */
//    public String buildG20Cs2Print() {
//        if (getG22() == null) {
//            return "";
//        } else {
//            return getG22() == 1 ? "Отправитель" : "Перевозчик";
//        }
//    }
//
//
//
//    /**
//     * Контейнер смгс2
//     *
//     * @return строкадля печати
//     */
//    public String buildGKontCs2Print() {
//        StringBuffer result = new StringBuffer();
//        if (getCimSmgsCarLists().values().size() < 2) {
//            for (CimSmgsCarList car : getCimSmgsCarLists().values()) {
//                for (CimSmgsKonList kont : car.getCimSmgsKonLists().values()) {
//                    result.append(StringUtils.defaultString(kont.getUtiN()));
//                    if (result.length() > 0)
//                        result.append(" - ");
//                    result.append(StringUtils.defaultString(kont.getUtiType()));
//                    result.append(kont.getGrpod() != null ? (" (" + kont.getGrpod() + ") ") : "");
//
//                    result.append("\n");
//                }
//            }
//        } else {
//            if(isContOtpr())
//                result.append("Согласно ведомости контейнеров");
//        }
//        return result.toString();
//    }
//
//
//    /**
//     * Нетто смгс 2
//     *
//     * @return строкадля печати
//     */
//    public String buildG24NCs2Print() {
//
//        // если печатать в доп лист
//        if (getG15c() != null && getG15c() == 1) {
//            return "";
//        }
//
//        return (getG24T() != null&&getG24T().doubleValue()>0) ? "Н: " + getG24T() : "";
//    }
//    /**
//     * Тара смгс 2
//     *
//     * @return строкадля печати
//     */
//    public String buildG24TCs2Print() {
//
//        // если печатать в доп лист
//        if (getG15c() != null && getG15c() == 1) {
//            return "";
//        }
//
//        return (getG24T() != null&&getG24T().doubleValue()>0) ? "Т: " + getG24T() : "";
//    }
//
//    /**
//     * Брутто смгс 2
//     *
//     * @return строкадля печати
//     */
//    public String buildG24BCs2Print() {
//
//        return getG24B() != null ? "Б: " + getG24B() : "";
//    }
//
//
//    /**
//     * Гр22. Перевозчики
//     *
//     * @return строка для печати
//     */
//    public String buildG22Cs2Print() {
//        boolean addCode=shouldPrintAdmCodes();
//
//        StringBuffer result = new StringBuffer();
//        String prefix = "";
//        for (CimSmgsPerevoz perevoz : getCimSmgsPerevoz().values()) {
//            result.append(prefix);
//            prefix = PRINT_TABLE_DELIMITER;
//            result.append(StringUtils.defaultString(perevoz.getNamPer()));
//            if (perevoz.getCodePer() != null && perevoz.getCodePer().length() > 0)
//                result.append(" - ").append(perevoz.getCodePer());
//
//            result.append(prefix);
//            result.append(StringUtils.defaultString(perevoz.getStBeg()))
//                    .append("\n")
//                    .append(StringUtils.defaultString((perevoz.getStEnd())));
//
//            result.append(prefix);
//            result
//                    .append(((addCode?StringUtils.defaultString(perevoz.getAdmStBeg())+" ":"")+ StringUtils.defaultString(perevoz.getCodStBeg()).trim()))
//                    .append("\n")
//                    .append(((addCode?StringUtils.defaultString(perevoz.getAdmStEnd())+" ":"")+ StringUtils.defaultString(perevoz.getCodStEnd()).trim()));
//        }
//        return result.toString();
//    }
//
//    /**
//     * Гр1. Отправитель, подпись
//     *
//     * @return строка для печати
//     */
//    public String buildG14_Print() {
//        return g14;
//    }
//
//
//
//    /**
//     * Гр3. Заявления отправителя
//     *
//     * @return строка для печати
//     */
//    public String buildZayav_otprCs2Print() {
//        return (zayav_otpr_c != null && zayav_otpr_c == 1) ? DOP_LIST_PRINT_CS2 : getZayav_otpr();
//    }
//
//    /**
//     * Гр23. Уплата провозных платежей смгс2
//     *
//     * @return строка для печати
//     */
//    public String buildG23Cs2Print() {
//        return g7c != null && g7c == 1 ? DOP_LIST_PRINT_CS2 : buildG4SmgsPrint();
//    }
//
//    /**
//     * Гр25. Информация, не предн. для перервозчика смгс2
//     *
//     * @return строка для печати
//     */
//    public String buildG25Cs2Print() {
//        return g141c != null && g141c == 1 ? DOP_LIST_PRINT_CS2 : getG15r();
//    }
//
//    /**
//     * Гр28. Отметки для вып. тамож... смгс2
//     *
//     * @return строка для печати
//     */
//    public String buildG28Cs2Print() {
//        return g26c != null && g26c == 1 ? DOP_LIST_PRINT_CS2 : getG26();
//    }
//
//    public String buildEmptyLinePrint() {
//        return "\n";
//    }
//
//    public String buildTitleDLPrint() {
//        return "Дополнительный лист";
//    }
//
//    public String buildGr3TitleDLPrint() {
//        return zayav_otpr_c != null && zayav_otpr_c == 1 ? "Графа 3. Заявления отправителя" : "";
//    }
//
//    public String buildGr3DLPrint() {
//        return zayav_otpr_c != null && zayav_otpr_c == 1 ? getZayav_otpr() : "";
//    }
//
//    public String buildGr23TitleDLPrint() {
//        return g7c != null && g7c == 1 ? "Графа 23. Уплата провозных платежей" : "";
//    }
//
//    public String buildGr23DLPrint() {
//        return g7c != null && g7c == 1 ? buildG4SmgsPrint() : "";
//    }
//
//    public String buildGr25TitleDLPrint() {
//        return g141c != null && g141c == 1 ? "Графа 25. Информация, не предназначенная для перевозчика, № договора на поставку" : "";
//    }
//
//    public String buildGr25DLPrint() {
//        return g141c != null && g141c == 1 ? getG15r() : "";
//    }
//
//    public String buildGr28TitleDLPrint() {
//        return g26c != null && g26c == 1 ? "Графа 28. Отметки для выполнения таможенных и других административных формальностей" : "";
//    }
//
//    public String buildGr28DLPrint() {
//        return g26c != null && g26c == 1 ? getG26() : "";
//    }
//
//    public String buildGr29TitleDLPrint() {
//        return "29. Отправка №";
//    }
//
//    public String buildGr29DLPrint() {
//        return getG694();
//    }
//
//    public String buildG15_cs() {
//        return StringUtils.defaultString(this.g15);
//    }
//
//    public String buildG15_csPrint() {
//        StringBuilder sb = new StringBuilder();
//        if (getG15c() != null && getG15c() == 1) {
////            return LIST_DOP_RU;
//            sb.append(getText("form.labelDopList"));
//        } else {
//            sb.append(buildG15_cs());
//            sb.append("\n");
//            sb.append(buildG15r_cs());
//        }
//
//        return sb.toString();
//    }
//    /**
//     * Перевозчик смгс 2
//     *
//     * @return строка для печати
//     */
//    public String buildPerevozCs2Print() {
//        for (CimSmgsPerevoz perevoz : getCimSmgsPerevoz().values()) {
//            return StringUtils.defaultString(perevoz.getNamPer());
//        }
//        return "";
//    }
//public String g24Disp() {
//        StringBuffer result = new StringBuffer("");
//        if (g24N != null) {
//        result.append("Нетто/Netto ");
//        result.append(g24N);
//        }
//        if (g24T != null) {
//        result.append("<br/>");
//        result.append("Тара/Tara ");
//        result.append(g24T);
//        }
//        if (g24B != null) {
//        result.append("<br/>");
//        result.append("Брутто/Brutto ");
//        result.append(g24B);
//        result.append("<br/>");
//        result.append(g24BDisp4Print());
//        result.append(" кг");
//        }
//        return result.toString();
//        }
//}
