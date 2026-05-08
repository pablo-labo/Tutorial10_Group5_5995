package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z79<T, Y> {
    public final LinkedHashMap a = new LinkedHashMap(100, 0.75f, true);
    public final long b;
    public long c;

    public static final class a<Y> {
        public final Y a;
        public final int b;

        public a(Y y, int i) {
            this.a = y;
            this.b = i;
        }
    }

    public z79(long j) {
        this.b = j;
    }

    public final synchronized Y a(T t) {
        a aVar;
        aVar = (a) this.a.get(t);
        return aVar != null ? aVar.a : null;
    }

    public int b(Y y) {
        return 1;
    }

    public void c(T t, Y y) {
    }

    public final synchronized Y d(T t, Y y) {
        int iB = b(y);
        long j = iB;
        if (j >= this.b) {
            c(t, y);
            return null;
        }
        if (y != null) {
            this.c += j;
        }
        a aVar = (a) this.a.put(t, y == null ? null : new a(y, iB));
        if (aVar != null) {
            this.c -= (long) aVar.b;
            if (!aVar.a.equals(y)) {
                c(t, aVar.a);
            }
        }
        e(this.b);
        return aVar != null ? aVar.a : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.c -= (long) aVar.b;
            Object key = entry.getKey();
            it.remove();
            c(key, aVar.a);
        }
    }
}
