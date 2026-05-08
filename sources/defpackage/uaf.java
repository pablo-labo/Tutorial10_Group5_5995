package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class uaf {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final z8a f;

    static {
        String property;
        int i = e3f.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = wea.j(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i2 = e3f.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = wea.k(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = wea.k(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(wea.j(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = z8a.a;
    }
}
