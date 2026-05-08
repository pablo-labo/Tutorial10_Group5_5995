package defpackage;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import defpackage.pk6;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class uf3 implements pk6.c {
    public final HashMap a = new HashMap();

    public uf3(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.a.put(entry.getKey().trim().toLowerCase(Locale.US), entry.getValue());
        }
    }

    @Override // pk6.c
    public final eoe a(sif sifVar) {
        eoe eoeVar;
        String str;
        HashMap map = this.a;
        try {
            Map map2 = Collections.EMPTY_MAP;
            BigInteger bigInteger = BigInteger.ZERO;
            Map map3 = map2;
            Map map4 = map3;
            BigInteger bigIntegerC = bigInteger;
            int i = Integer.MIN_VALUE;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            for (Map.Entry<String, String> entry : sifVar) {
                String lowerCase = entry.getKey().toLowerCase(Locale.US);
                String value = entry.getValue();
                if (value != null) {
                    if (TracingInterceptor.DATADOG_LEAST_SIGNIFICANT_64_BITS_TRACE_ID_HEADER.equalsIgnoreCase(lowerCase)) {
                        str2 = value;
                        eoeVar = null;
                    } else if (TracingInterceptor.DATADOG_TAGS_HEADER.equalsIgnoreCase(lowerCase)) {
                        String[] strArrSplit = value.split(",");
                        int length = strArrSplit.length;
                        eoeVar = null;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                str = null;
                                break;
                            }
                            String[] strArrSplit2 = strArrSplit[i2].split("=");
                            int i3 = i2;
                            if (strArrSplit2.length >= 2 && "_dd.p.tid".equals(strArrSplit2[0])) {
                                str = strArrSplit2[1];
                                break;
                            }
                            i2 = i3 + 1;
                        }
                        str3 = str;
                    } else {
                        eoeVar = null;
                        if (TracingInterceptor.DATADOG_SPAN_ID_HEADER.equalsIgnoreCase(lowerCase)) {
                            bigIntegerC = pk6.c(10, value);
                        } else if (TracingInterceptor.DATADOG_SAMPLING_PRIORITY_HEADER.equalsIgnoreCase(lowerCase)) {
                            i = Integer.parseInt(value);
                        } else if (TracingInterceptor.DATADOG_ORIGIN_HEADER.equalsIgnoreCase(lowerCase)) {
                            str4 = value;
                        } else if (lowerCase.startsWith("ot-baggage-")) {
                            if (map3.isEmpty()) {
                                map3 = new HashMap();
                            }
                            map3.put(lowerCase.replace("ot-baggage-", ""), pk6.a(value));
                        }
                    }
                    if (map.containsKey(lowerCase)) {
                        try {
                            if (map4.isEmpty()) {
                                map4 = new HashMap();
                            }
                            map4.put((String) map.get(lowerCase), pk6.a(value));
                        } catch (RuntimeException unused) {
                            return eoeVar;
                        }
                    }
                }
            }
            if (str2 != null && str3 != null) {
                bve bveVarB = pk6.b(16, str3 + hh1.X(16, hh1.L(str2)));
                if (!BigInteger.ZERO.equals(bveVarB)) {
                    l55 l55Var = new l55(bveVarB, bigIntegerC, i, str4, map3, map4);
                    l55Var.g.set(true);
                    return l55Var;
                }
                if (str4 == null && map4.isEmpty()) {
                    return null;
                }
                return new a8f(str4, map4);
            }
            return new a8f(str4, map4);
        } catch (RuntimeException unused2) {
            return null;
        }
    }
}
