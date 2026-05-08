package defpackage;

import defpackage.g37;

/* JADX INFO: loaded from: classes.dex */
public final class q95 implements g37 {
    public uqc V;
    public final w5b a;
    public final pa5 b;
    public final String c;
    public final AutoCloseable d;
    public final Object e = new Object();
    public boolean f;

    public q95(w5b w5bVar, pa5 pa5Var, String str, AutoCloseable autoCloseable) {
        this.a = w5bVar;
        this.b = pa5Var;
        this.c = str;
        this.d = autoCloseable;
    }

    @Override // defpackage.g37
    public final w5b C1() {
        w5b w5bVar;
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            w5bVar = this.a;
        }
        return w5bVar;
    }

    @Override // defpackage.g37
    public final to1 K1() {
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            uqc uqcVar = this.V;
            if (uqcVar != null) {
                return uqcVar;
            }
            uqc uqcVarK = c0h.k(this.b.m(this.a));
            this.V = uqcVarK;
            return uqcVarK;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.e
            monitor-enter(r0)
            r1 = 1
            r2.f = r1     // Catch: java.lang.Throwable -> L1e
            uqc r1 = r2.V     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L10
            r1.close()     // Catch: java.lang.RuntimeException -> Le java.lang.Exception -> L10 java.lang.Throwable -> L1e
            goto L10
        Le:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1e
        L10:
            java.lang.AutoCloseable r2 = r2.d     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1a
            defpackage.l5.o(r2)     // Catch: java.lang.RuntimeException -> L18 java.lang.Exception -> L1a java.lang.Throwable -> L1e
            goto L1a
        L18:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1e
        L1a:
            j6g r2 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return
        L1e:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q95.close():void");
    }

    @Override // defpackage.g37
    public final pa5 getFileSystem() {
        return this.b;
    }

    @Override // defpackage.g37
    public final g37.a getMetadata() {
        return null;
    }
}
