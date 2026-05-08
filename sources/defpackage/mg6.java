package defpackage;

import defpackage.pk6;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mg6 implements pk6.c {
    public final HashMap a = new HashMap();

    public mg6(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.a.put(entry.getKey().trim().toLowerCase(Locale.US), entry.getValue());
        }
    }

    @Override // pk6.c
    public final eoe a(sif sifVar) {
        HashMap map = this.a;
        try {
            Map map2 = Collections.EMPTY_MAP;
            BigInteger bigInteger = BigInteger.ZERO;
            Map map3 = map2;
            Map map4 = map3;
            BigInteger bigIntegerB = bigInteger;
            BigInteger bigIntegerC = bigIntegerB;
            for (Map.Entry<String, String> entry : sifVar) {
                String key = entry.getKey();
                Locale locale = Locale.US;
                String lowerCase = key.toLowerCase(locale);
                String value = entry.getValue();
                if (value != null) {
                    if ("Trace-ID".equalsIgnoreCase(lowerCase)) {
                        bigIntegerB = pk6.b(10, value);
                    } else if ("Span-ID".equalsIgnoreCase(lowerCase)) {
                        bigIntegerC = pk6.c(10, value);
                    } else if (lowerCase.startsWith("Baggage-".toLowerCase(locale))) {
                        if (map3.isEmpty()) {
                            map3 = new HashMap();
                        }
                        map3.put(lowerCase.replace("Baggage-".toLowerCase(locale), ""), pk6.a(value));
                    }
                    if (map.containsKey(lowerCase)) {
                        if (map4.isEmpty()) {
                            map4 = new HashMap();
                        }
                        map4.put((String) map.get(lowerCase), pk6.a(value));
                    }
                }
            }
            if (BigInteger.ZERO.equals(bigIntegerB)) {
                if (map4.isEmpty()) {
                    return null;
                }
                return new a8f(null, map4);
            }
            l55 l55Var = new l55(bigIntegerB, bigIntegerC, 1, null, map3, map4);
            l55Var.g.set(true);
            return l55Var;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
