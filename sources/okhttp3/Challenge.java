package okhttp3;

import defpackage.akb;
import defpackage.r6;
import defpackage.wl7;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Challenge;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Challenge {
    public final String a;
    public final Map<String, String> b;

    public Challenge(String str, Map<String, String> map) {
        String strF;
        this.a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                strF = r6.f(locale, key, locale);
            } else {
                strF = null;
            }
            linkedHashMap.put(strF, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        this.b = mapUnmodifiableMap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return challenge.a.equals(this.a) && wl7.b(challenge.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + akb.d(899, 31, this.a);
    }

    public final String toString() {
        return this.a + " authParams=" + this.b;
    }
}
