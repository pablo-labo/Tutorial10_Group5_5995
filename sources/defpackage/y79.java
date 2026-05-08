package defpackage;

import defpackage.trc;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class y79<K, V> {
    public final long a;
    public final LinkedHashMap b = new LinkedHashMap(0, 0.75f, true);
    public long c;

    public y79(long j) {
        this.a = j;
        if (j > 0) {
            return;
        }
        l5.q("maxSize <= 0");
        throw null;
    }

    public void a(K k, V v, V v2) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        if (this.c == -1) {
            Iterator<T> it = this.b.entrySet().iterator();
            long jC = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                jC += c(entry.getKey(), entry.getValue());
            }
            this.c = jC;
        }
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c(K k, V v) throws Exception {
        try {
            long j = ((trc.b) v).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + k + ", " + v + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.c = -1L;
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(long j) {
        while (b() > j) {
            LinkedHashMap linkedHashMap = this.b;
            if (linkedHashMap.isEmpty()) {
                if (b() == 0) {
                    return;
                }
                r6.g("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) z92.N0(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.c = b() - c(key, value);
                a(key, value, null);
            }
        }
    }
}
