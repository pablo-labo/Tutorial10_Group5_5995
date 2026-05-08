package defpackage;

import defpackage.o7d;

/* JADX INFO: loaded from: classes3.dex */
public final class lt0 {
    public static final int a;

    static {
        Object aVar;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            aVar = property != null ? vve.B(10, property) : null;
        } catch (Throwable th) {
            aVar = new o7d.a(th);
        }
        Integer num = (Integer) (aVar instanceof o7d.a ? null : aVar);
        a = num != null ? num.intValue() : 2097152;
    }
}
