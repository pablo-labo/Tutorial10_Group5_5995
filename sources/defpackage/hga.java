package defpackage;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hga {
    public static final hga b = new hga(lc9.g0(new a().a));
    public final Map<String, List<String>> a;

    public hga() {
        throw null;
    }

    public hga(Map map) {
        this.a = map;
    }

    public final String a() {
        String lowerCase = TracingInterceptor.HEADER_CT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List<String> list = this.a.get(lowerCase);
        if (list != null) {
            return (String) z92.Z0(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hga) && wl7.b(this.a, ((hga) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.a + ')';
    }

    public static final class a {
        public final LinkedHashMap a;

        public a(hga hgaVar) {
            Map<String, List<String>> map = hgaVar.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), z92.B1((Collection) entry.getValue()));
            }
            this.a = linkedHashMap;
        }

        public final void a(String str, String str2) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            LinkedHashMap linkedHashMap = this.a;
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }

        public final void b(String str) {
            String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            this.a.put(lowerCase, u63.d0(str));
        }

        public a() {
            this.a = new LinkedHashMap();
        }
    }
}
