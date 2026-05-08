package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ohh {
    public static volatile kki d;
    public final f3i a;
    public final zs1 b;
    public volatile long c;

    public ohh(f3i f3iVar) {
        fib.i(f3iVar);
        this.a = f3iVar;
        this.b = new zs1(1, this, f3iVar);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            this.a.zzm().getClass();
            this.c = System.currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            this.a.zzr().f.a(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        kki kkiVar;
        if (d != null) {
            return d;
        }
        synchronized (ohh.class) {
            try {
                if (d == null) {
                    d = new kki(this.a.zzn().getMainLooper());
                }
                kkiVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kkiVar;
    }
}
