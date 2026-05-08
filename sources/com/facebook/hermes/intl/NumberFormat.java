package com.facebook.hermes.intl;

import android.icu.text.MeasureFormat;
import android.icu.text.NumberFormat;
import android.icu.text.UFormat;
import android.icu.util.Measure;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.c;
import defpackage.f84;
import defpackage.in6;
import defpackage.ko6;
import defpackage.lo6;
import defpackage.mo6;
import defpackage.no6;
import defpackage.oo6;
import defpackage.pnb;
import defpackage.po6;
import defpackage.qo6;
import defpackage.ro6;
import defpackage.zbb;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@f84
public class NumberFormat {
    public static final String[] v = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};
    public final qo6 a;
    public final String b;
    public final lo6 c;
    public final mo6 d;
    public final String e;
    public final ro6 f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final oo6 m;
    public final po6 n;
    public final zbb o;
    public final boolean p;
    public final String q;
    public final no6 r;
    public final ko6 s;
    public final in6<?> t;
    public final in6<?> u;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0178, code lost:
    
        if (java.util.Arrays.binarySearch(r4, r15.substring(r8 + 5)) >= 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0583 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03b3  */
    @defpackage.f84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NumberFormat(java.util.List<java.lang.String> r32, java.util.Map<java.lang.String, java.lang.Object> r33) throws com.facebook.hermes.intl.JSRangeErrorException {
        /*
            Method dump skipped, instruction units count: 1428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.NumberFormat.<init>(java.util.List, java.util.Map):void");
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 'a' || cCharAt > 'z') {
                sb.append(cCharAt);
            } else {
                sb.append((char) (cCharAt - ' '));
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
        zbb zbbVar = this.o;
        try {
            try {
                UFormat uFormat = zbbVar.a;
                return (!(uFormat instanceof MeasureFormat) || zbbVar.e == null) ? uFormat.format(Double.valueOf(d)) : uFormat.format(new Measure(Double.valueOf(d), zbbVar.e));
            } catch (RuntimeException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).format(d);
            }
        } catch (NumberFormatException unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).format(d);
        }
    }

    @f84
    public List<Map<String, String>> formatToParts(double d) {
        AttributedCharacterIterator toCharacterIterator;
        ArrayList arrayList = new ArrayList();
        zbb zbbVar = this.o;
        try {
            try {
                UFormat uFormat = zbbVar.a;
                toCharacterIterator = (!(uFormat instanceof MeasureFormat) || zbbVar.e == null) ? uFormat.formatToCharacterIterator(Double.valueOf(d)) : uFormat.formatToCharacterIterator(new Measure(Double.valueOf(d), zbbVar.e));
            } catch (NumberFormatException unused) {
                toCharacterIterator = android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).formatToCharacterIterator(Double.valueOf(d));
            } catch (Exception unused2) {
                toCharacterIterator = android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d));
            }
        } catch (RuntimeException unused3) {
            toCharacterIterator = android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d));
        }
        StringBuilder sb = new StringBuilder();
        for (char cFirst = toCharacterIterator.first(); cFirst != 65535; cFirst = toCharacterIterator.next()) {
            sb.append(cFirst);
            if (toCharacterIterator.getIndex() + 1 == toCharacterIterator.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = toCharacterIterator.getAttributes().keySet().iterator();
                String str = "literal";
                if (it.hasNext()) {
                    AttributedCharacterIterator.Attribute next = it.next();
                    if (next == NumberFormat.Field.SIGN) {
                        str = Double.compare(d, 0.0d) >= 0 ? "plusSign" : "minusSign";
                    } else if (next == NumberFormat.Field.INTEGER) {
                        str = Double.isNaN(d) ? "nan" : Double.isInfinite(d) ? "infinity" : "integer";
                    } else if (next == NumberFormat.Field.FRACTION) {
                        str = "fraction";
                    } else if (next == NumberFormat.Field.EXPONENT) {
                        str = "exponentInteger";
                    } else if (next == NumberFormat.Field.EXPONENT_SIGN) {
                        str = "exponentMinusSign";
                    } else if (next == NumberFormat.Field.EXPONENT_SYMBOL) {
                        str = "exponentSeparator";
                    } else if (next == NumberFormat.Field.DECIMAL_SEPARATOR) {
                        str = "decimal";
                    } else if (next == NumberFormat.Field.GROUPING_SEPARATOR) {
                        str = "group";
                    } else if (next == NumberFormat.Field.PERCENT) {
                        str = "percentSign";
                    } else if (next == NumberFormat.Field.PERMILLE) {
                        str = "permilleSign";
                    } else if (next == NumberFormat.Field.CURRENCY) {
                        str = "currency";
                    } else if (next.toString().equals("android.icu.text.NumberFormat$Field(compact)")) {
                        str = "compact";
                    }
                }
                String string = sb.toString();
                sb.setLength(0);
                HashMap map = new HashMap();
                map.put("type", str);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @f84
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.u.e());
        linkedHashMap.put("numberingSystem", this.q);
        qo6 qo6Var = this.a;
        linkedHashMap.put("style", qo6Var.toString());
        if (qo6Var == qo6.c) {
            linkedHashMap.put("currency", this.b);
            linkedHashMap.put("currencyDisplay", this.c.toString());
            linkedHashMap.put("currencySign", this.d.toString());
        } else if (qo6Var == qo6.d) {
            linkedHashMap.put("unit", this.e);
            linkedHashMap.put("unitDisplay", this.f.toString());
        }
        int i = this.h;
        if (i != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i));
        }
        oo6 oo6Var = oo6.a;
        oo6 oo6Var2 = this.m;
        if (oo6Var2 == oo6Var) {
            int i2 = this.l;
            if (i2 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i2));
            }
            int i3 = this.k;
            if (i3 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i3));
            }
        } else if (oo6Var2 == oo6.b) {
            int i4 = this.i;
            if (i4 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i4));
            }
            int i5 = this.j;
            if (i5 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i5));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.g));
        no6 no6Var = this.r;
        linkedHashMap.put("notation", no6Var.toString());
        if (no6Var == no6.c) {
            linkedHashMap.put("compactDisplay", this.s.toString());
        }
        linkedHashMap.put("signDisplay", this.n.toString());
        return linkedHashMap;
    }
}
