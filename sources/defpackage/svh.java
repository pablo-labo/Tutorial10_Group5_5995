package defpackage;

import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class svh<V> {
    public static final Object g = new Object();
    public final String a;
    public final nvh<V> b;
    public final V c;
    public final V d;
    public final Object e;
    public volatile V f;

    public svh() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public svh(String str, Object obj, Object obj2, nvh nvhVar) {
        this.e = new Object();
        this.f = null;
        this.a = str;
        this.c = obj;
        this.d = obj2;
        this.b = nvhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V a(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L7
            return r4
        L7:
            awd r4 = defpackage.zte.a
            if (r4 != 0) goto Le
            V r3 = r3.c
            return r3
        Le:
            java.lang.Object r4 = defpackage.svh.g
            monitor-enter(r4)
            boolean r0 = defpackage.awd.s()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L24
            V r0 = r3.f     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            V r3 = r3.c     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r3 = move-exception
            goto L6a
        L20:
            V r3 = r3.f     // Catch: java.lang.Throwable -> L1e
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            return r3
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.List<svh<?>> r4 = defpackage.djh.a     // Catch: java.lang.SecurityException -> L58
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L58
        L2b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L58
            if (r0 == 0) goto L58
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L58
            svh r0 = (defpackage.svh) r0     // Catch: java.lang.SecurityException -> L58
            boolean r1 = defpackage.awd.s()     // Catch: java.lang.SecurityException -> L58
            if (r1 != 0) goto L50
            r1 = 0
            nvh<V> r2 = r0.b     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
            if (r2 == 0) goto L46
            java.lang.Object r1 = r2.zza()     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
        L46:
            java.lang.Object r2 = defpackage.svh.g     // Catch: java.lang.SecurityException -> L58
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L58
            r0.f = r1     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            goto L2b
        L4d:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            throw r4     // Catch: java.lang.SecurityException -> L58
        L50:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L58
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L58
            throw r4     // Catch: java.lang.SecurityException -> L58
        L58:
            nvh<V> r4 = r3.b
            if (r4 != 0) goto L5f
            V r3 = r3.c
            return r3
        L5f:
            java.lang.Object r3 = r4.zza()     // Catch: java.lang.IllegalStateException -> L64 java.lang.SecurityException -> L67
            return r3
        L64:
            V r3 = r3.c
            return r3
        L67:
            V r3 = r3.c
            return r3
        L6a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r3
        L6c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svh.a(java.lang.Object):java.lang.Object");
    }
}
