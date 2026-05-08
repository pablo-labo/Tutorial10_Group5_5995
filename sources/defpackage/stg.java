package defpackage;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import defpackage.pk6;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class stg {
    public static final String a = String.valueOf(1);
    public static final String b = String.valueOf(0);

    public static class a implements pk6.c {
        public final HashMap a = new HashMap();

        public a(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.a.put(entry.getKey().trim().toLowerCase(Locale.US), entry.getValue());
            }
        }

        public static HashMap b(String str) {
            String[] strArrSplit = str.split(",");
            HashMap map = new HashMap();
            for (String str2 : strArrSplit) {
                if (str2.startsWith("dd=")) {
                    for (String str3 : str2.substring(3).split(";")) {
                        String[] strArrSplit2 = str3.split(":");
                        if (strArrSplit2.length == 2) {
                            map.put(strArrSplit2[0], strArrSplit2[1]);
                        }
                    }
                }
            }
            return map;
        }

        @Override // pk6.c
        public final eoe a(sif sifVar) {
            String str;
            Map map;
            BigInteger bigIntegerB;
            BigInteger bigIntegerC;
            int i;
            HashMap map2 = this.a;
            try {
                Map map3 = Collections.EMPTY_MAP;
                BigInteger bigInteger = BigInteger.ZERO;
                Iterator<Map.Entry<String, String>> it = sifVar.iterator();
                str = null;
                map = map3;
                bigIntegerB = bigInteger;
                bigIntegerC = bigIntegerB;
                i = Integer.MIN_VALUE;
                while (true) {
                    int i2 = 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, String> next = it.next();
                    String lowerCase = next.getKey().toLowerCase(Locale.US);
                    String value = next.getValue();
                    if (value != null) {
                        if (TracingInterceptor.W3C_TRACEPARENT_KEY.equalsIgnoreCase(lowerCase)) {
                            String[] strArrSplit = value.split("-");
                            if (strArrSplit.length == 4 && !"ff".equalsIgnoreCase(strArrSplit[0])) {
                                int length = strArrSplit[1].length();
                                if (length > 32) {
                                    bigIntegerB = BigInteger.ZERO;
                                } else {
                                    bigIntegerB = pk6.b(16, length > 16 ? strArrSplit[1].substring(length - 16) : strArrSplit[1]);
                                    bigIntegerC = pk6.c(16, strArrSplit[2]);
                                    if (Integer.parseInt(strArrSplit[3]) != 1) {
                                        i2 = 0;
                                    }
                                    i = i2;
                                }
                            }
                        } else if (TracingInterceptor.W3C_TRACESTATE_KEY.equalsIgnoreCase(lowerCase)) {
                            str = (String) b(value).get("o");
                        }
                        if (map2.containsKey(lowerCase)) {
                            if (map.isEmpty()) {
                                map = new HashMap();
                            }
                            map.put((String) map2.get(lowerCase), pk6.a(value));
                        }
                    }
                }
            } catch (RuntimeException unused) {
            }
            if (BigInteger.ZERO.equals(bigIntegerB)) {
                if (!map.isEmpty()) {
                    return new a8f(str, map);
                }
                return null;
            }
            l55 l55Var = new l55(bigIntegerB, bigIntegerC, i, str, Collections.EMPTY_MAP, map);
            l55Var.g.set(true);
            return l55Var;
        }
    }

    public static class b implements pk6.d {
        @Override // pk6.d
        public final void a(sc3 sc3Var, uif uifVar) {
            try {
                String string = sc3Var.d.toString(16);
                Locale locale = Locale.US;
                String lowerCase = string.toLowerCase(locale);
                String lowerCase2 = sc3Var.e.toString(16).toLowerCase(locale);
                String str = sc3Var.c() > 0 ? stg.a : stg.b;
                rc3 rc3VarW = sc3Var.b.w();
                String str2 = rc3VarW != null ? rc3VarW.b.m : sc3Var.m;
                uifVar.a(TracingInterceptor.W3C_TRACEPARENT_KEY, "00-" + zve.Z(32, lowerCase) + "-" + zve.Z(16, lowerCase2) + "-0" + str);
                StringBuilder sb = new StringBuilder("dd=s:");
                sb.append(str);
                sb.append(";p:");
                sb.append(lowerCase2);
                if (str2 != null) {
                    sb.append(";o:");
                    sb.append(str2.toLowerCase(locale));
                }
                uifVar.a(TracingInterceptor.W3C_TRACESTATE_KEY, sb.toString());
            } catch (NumberFormatException unused) {
            }
        }
    }
}
