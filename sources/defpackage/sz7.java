package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class sz7 {
    public final Executor a;
    public final a b;
    public final qz7 c = new qz7(this);
    public final rz7 d = new rz7(this);
    public vs4 e = null;
    public int f = 0;
    public c g = c.a;
    public long h = 0;
    public long i = 0;

    public interface a {
        void a(vs4 vs4Var, int i);
    }

    public static class b {
        public static ScheduledExecutorService a;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final /* synthetic */ c[] e;

        static {
            c cVar = new c("IDLE", 0);
            a = cVar;
            c cVar2 = new c("QUEUED", 1);
            b = cVar2;
            c cVar3 = new c("RUNNING", 2);
            c = cVar3;
            c cVar4 = new c("RUNNING_AND_PENDING", 3);
            d = cVar4;
            e = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) e.clone();
        }
    }

    public sz7(Executor executor, a aVar) {
        this.a = executor;
        this.b = aVar;
    }

    public static boolean d(vs4 vs4Var, int i) {
        return w81.a(i) || w81.h(i, 4) || vs4.W(vs4Var);
    }

    public final void a(long j) {
        rz7 rz7Var = this.d;
        if (j <= 0) {
            rz7Var.run();
            return;
        }
        if (b.a == null) {
            b.a = Executors.newSingleThreadScheduledExecutor();
        }
        b.a.schedule(rz7Var, j, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        long jMax;
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.g == c.d) {
                    jMax = Math.max(this.i + 100, jUptimeMillis);
                    this.h = jUptimeMillis;
                    this.g = c.b;
                    z = true;
                } else {
                    this.g = c.a;
                    jMax = 0;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            a(jMax - jUptimeMillis);
        }
    }

    public final void c() {
        long jMax;
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (d(this.e, this.f)) {
                    int iOrdinal = this.g.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 2) {
                            this.g = c.d;
                        }
                        jMax = 0;
                        z = false;
                    } else {
                        jMax = Math.max(this.i + 100, jUptimeMillis);
                        this.h = jUptimeMillis;
                        this.g = c.b;
                        z = true;
                    }
                    if (z) {
                        a(jMax - jUptimeMillis);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(vs4 vs4Var, int i) {
        vs4 vs4Var2;
        if (!d(vs4Var, i)) {
            return false;
        }
        synchronized (this) {
            vs4Var2 = this.e;
            this.e = vs4.a(vs4Var);
            this.f = i;
        }
        vs4.h(vs4Var2);
        return true;
    }
}
