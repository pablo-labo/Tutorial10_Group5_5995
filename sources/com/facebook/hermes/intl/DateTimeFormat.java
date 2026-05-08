package com.facebook.hermes.intl;

import android.icu.text.DateFormat;
import com.facebook.hermes.intl.c;
import defpackage.bo6;
import defpackage.co6;
import defpackage.do6;
import defpackage.eo6;
import defpackage.f84;
import defpackage.fo6;
import defpackage.go6;
import defpackage.hbb;
import defpackage.ho6;
import defpackage.in6;
import defpackage.io6;
import defpackage.jo6;
import defpackage.pnb;
import defpackage.xn6;
import defpackage.yn6;
import defpackage.zn6;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@f84
public class DateTimeFormat {
    public final hbb a;
    public final in6<?> b;
    public final in6<?> c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final String g;
    public final Object h;
    public final co6 i;
    public final io6 j;
    public final zn6 k;
    public final jo6 l;
    public final eo6 m;
    public final yn6 n;
    public final bo6 o;
    public final do6 p;
    public final fo6 q;
    public final ho6 r;
    public final xn6 s;
    public final go6 t;
    public final String u;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    @defpackage.f84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DateTimeFormat(java.util.List<java.lang.String> r41, java.util.Map<java.lang.String, java.lang.Object> r42) throws com.facebook.hermes.intl.JSRangeErrorException {
        /*
            Method dump skipped, instruction units count: 1817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.DateTimeFormat.<init>(java.util.List, java.util.Map):void");
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 'A' || cCharAt > 'Z') {
                sb.append(cCharAt);
            } else {
                sb.append((char) (cCharAt + ' '));
            }
        }
        return sb.toString();
    }

    @f84
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String str = (String) c.b(map, "localeMatcher", c.a.b, pnb.d, "best fit");
        String[] strArr = new String[list.size()];
        return str.equals("best fit") ? Arrays.asList(a.c((String[]) list.toArray(strArr))) : Arrays.asList(a.e((String[]) list.toArray(strArr)));
    }

    @f84
    public String format(double d) {
        return this.a.a.format(new Date((long) d));
    }

    @f84
    public List<Map<String, String>> formatToParts(double d) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator toCharacterIterator = this.a.a.formatToCharacterIterator(Double.valueOf(d));
        StringBuilder sb = new StringBuilder();
        for (char cFirst = toCharacterIterator.first(); cFirst != 65535; cFirst = toCharacterIterator.next()) {
            sb.append(cFirst);
            if (toCharacterIterator.getIndex() + 1 == toCharacterIterator.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = toCharacterIterator.getAttributes().keySet().iterator();
                String str = "literal";
                if (it.hasNext()) {
                    AttributedCharacterIterator.Attribute next = it.next();
                    String string = sb.toString();
                    if (next == DateFormat.Field.DAY_OF_WEEK) {
                        str = "weekday";
                    } else if (next == DateFormat.Field.ERA) {
                        str = "era";
                    } else if (next == DateFormat.Field.YEAR) {
                        try {
                            Double.parseDouble(string);
                            str = "year";
                        } catch (NumberFormatException unused) {
                            str = "yearName";
                        }
                    } else if (next == DateFormat.Field.MONTH) {
                        str = "month";
                    } else if (next == DateFormat.Field.DAY_OF_MONTH) {
                        str = "day";
                    } else if (next == DateFormat.Field.HOUR0 || next == DateFormat.Field.HOUR1 || next == DateFormat.Field.HOUR_OF_DAY0 || next == DateFormat.Field.HOUR_OF_DAY1) {
                        str = "hour";
                    } else if (next == DateFormat.Field.MINUTE) {
                        str = "minute";
                    } else if (next == DateFormat.Field.SECOND) {
                        str = "second";
                    } else if (next == DateFormat.Field.TIME_ZONE) {
                        str = "timeZoneName";
                    } else if (next == DateFormat.Field.AM_PM) {
                        str = "dayPeriod";
                    } else if (next.toString().equals("android.icu.text.DateFormat$Field(related year)")) {
                        str = "relatedYear";
                    }
                }
                String string2 = sb.toString();
                sb.setLength(0);
                HashMap map = new HashMap();
                map.put("type", str);
                map.put("value", string2);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @f84
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.c.e());
        linkedHashMap.put("numberingSystem", this.g);
        linkedHashMap.put("calendar", this.e);
        linkedHashMap.put("timeZone", this.u);
        co6 co6Var = co6.e;
        co6 co6Var2 = this.i;
        if (co6Var2 != co6Var) {
            linkedHashMap.put("hourCycle", co6Var2.toString());
            if (co6Var2 == co6.a || co6Var2 == co6.b) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        io6 io6Var = io6.a;
        io6 io6Var2 = this.j;
        if (io6Var2 != io6Var) {
            linkedHashMap.put("weekday", io6Var2.toString());
        }
        zn6 zn6Var = zn6.a;
        zn6 zn6Var2 = this.k;
        if (zn6Var2 != zn6Var) {
            linkedHashMap.put("era", zn6Var2.toString());
        }
        jo6 jo6Var = jo6.a;
        jo6 jo6Var2 = this.l;
        if (jo6Var2 != jo6Var) {
            linkedHashMap.put("year", jo6Var2.toString());
        }
        eo6 eo6Var = eo6.a;
        eo6 eo6Var2 = this.m;
        if (eo6Var2 != eo6Var) {
            linkedHashMap.put("month", eo6Var2.toString());
        }
        yn6 yn6Var = yn6.a;
        yn6 yn6Var2 = this.n;
        if (yn6Var2 != yn6Var) {
            linkedHashMap.put("day", yn6Var2.toString());
        }
        bo6 bo6Var = bo6.a;
        bo6 bo6Var2 = this.o;
        if (bo6Var2 != bo6Var) {
            linkedHashMap.put("hour", bo6Var2.toString());
        }
        do6 do6Var = do6.a;
        do6 do6Var2 = this.p;
        if (do6Var2 != do6Var) {
            linkedHashMap.put("minute", do6Var2.toString());
        }
        fo6 fo6Var = fo6.a;
        fo6 fo6Var2 = this.q;
        if (fo6Var2 != fo6Var) {
            linkedHashMap.put("second", fo6Var2.toString());
        }
        ho6 ho6Var = ho6.a;
        ho6 ho6Var2 = this.r;
        if (ho6Var2 != ho6Var) {
            linkedHashMap.put("timeZoneName", ho6Var2.toString());
        }
        xn6 xn6Var = xn6.a;
        xn6 xn6Var2 = this.s;
        if (xn6Var2 != xn6Var) {
            linkedHashMap.put("dateStyle", xn6Var2.toString());
        }
        go6 go6Var = go6.a;
        go6 go6Var2 = this.t;
        if (go6Var2 != go6Var) {
            linkedHashMap.put("timeStyle", go6Var2.toString());
        }
        return linkedHashMap;
    }
}
