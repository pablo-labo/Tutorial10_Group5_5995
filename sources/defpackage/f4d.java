package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class f4d {
    public final ekg a;
    public long b;
    public int c;

    public f4d() {
        if (w74.j0 == null) {
            Pattern pattern = ekg.b;
            w74.j0 = new w74(27);
        }
        w74 w74Var = w74.j0;
        if (ekg.c == null) {
            ekg.c = new ekg(w74Var);
        }
        this.a = ekg.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            ekg r0 = r4.a     // Catch: java.lang.Throwable -> L19
            w74 r0 = r0.a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.b     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f4d.a():boolean");
    }

    public final synchronized void b(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.c = 0;
            }
            return;
        }
        this.c++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double dPow = Math.pow(2.0d, this.c);
                this.a.getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
            } else {
                jMin = 86400000;
            }
            this.a.a.getClass();
            this.b = System.currentTimeMillis() + jMin;
        }
        return;
    }
}
