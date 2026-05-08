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
public final class y61 {
    public static final String a = String.valueOf(1);
    public static final String b = String.valueOf(0);

    public static class a implements pk6.c {
        public final HashMap a = new HashMap();

        public a(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.a.put(entry.getKey().trim().toLowerCase(Locale.US), entry.getValue());
            }
        }

        @Override // pk6.c
        public final eoe a(sif sifVar) {
            Map map;
            BigInteger bigIntegerB;
            BigInteger bigIntegerC;
            int i;
            HashMap map2 = this.a;
            try {
                Map map3 = Collections.EMPTY_MAP;
                BigInteger bigInteger = BigInteger.ZERO;
                Iterator<Map.Entry<String, String>> it = sifVar.iterator();
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
                        if (TracingInterceptor.B3M_TRACE_ID_KEY.equalsIgnoreCase(lowerCase)) {
                            int length = value.length();
                            if (length > 32) {
                                bigIntegerB = BigInteger.ZERO;
                            } else {
                                bigIntegerB = pk6.b(16, length > 16 ? value.substring(length - 16) : value);
                            }
                        } else if (TracingInterceptor.B3M_SPAN_ID_KEY.equalsIgnoreCase(lowerCase)) {
                            bigIntegerC = pk6.c(16, value);
                        } else if (TracingInterceptor.B3M_SAMPLING_PRIORITY_KEY.equalsIgnoreCase(lowerCase)) {
                            if (Integer.parseInt(value) != 1) {
                                i2 = 0;
                            }
                            i = i2;
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
                    return new a8f(null, map);
                }
                return null;
            }
            l55 l55Var = new l55(bigIntegerB, bigIntegerC, i, null, Collections.EMPTY_MAP, map);
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
                uifVar.a(TracingInterceptor.B3M_TRACE_ID_KEY, string.toLowerCase(locale));
                uifVar.a(TracingInterceptor.B3M_SPAN_ID_KEY, sc3Var.e.toString(16).toLowerCase(locale));
                if (sc3Var.d()) {
                    uifVar.a(TracingInterceptor.B3M_SAMPLING_PRIORITY_KEY, sc3Var.c() > 0 ? y61.a : y61.b);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }
}
