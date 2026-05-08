package defpackage;

import android.os.SystemClock;
import defpackage.sz7;

/* JADX INFO: loaded from: classes2.dex */
public final class qz7 implements Runnable {
    public final /* synthetic */ sz7 a;

    public qz7(sz7 sz7Var) {
        this.a = sz7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vs4 vs4Var;
        int i;
        sz7 sz7Var = this.a;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (sz7Var) {
            vs4Var = sz7Var.e;
            i = sz7Var.f;
            sz7Var.e = null;
            sz7Var.f = 0;
            sz7Var.g = sz7.c.c;
            sz7Var.i = jUptimeMillis;
        }
        try {
            if (sz7.d(vs4Var, i)) {
                sz7Var.b.a(vs4Var, i);
            }
        } finally {
            vs4.h(vs4Var);
            sz7Var.b();
        }
    }
}
