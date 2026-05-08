package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.v03;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hb0 extends y03 {
    public static final d2f b0 = boa.D(a.a);
    public static final b c0 = new b();
    public boolean X;
    public boolean Y;
    public final ib0 a0;
    public final Choreographer c;
    public final Handler d;
    public final Object e = new Object();
    public final zs0<Runnable> f = new zs0<>();
    public ArrayList V = new ArrayList();
    public ArrayList W = new ArrayList();
    public final c Z = new c();

    public static final class a extends mj8 implements gu5<v03> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final v03 invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                eq3 eq3Var = a74.a;
                choreographer = (Choreographer) u63.i0(m89.a, new gb0(2, null));
            }
            hb0 hb0Var = new hb0(choreographer, nf6.a(Looper.getMainLooper()));
            return v03.a.C0438a.c(hb0Var, hb0Var.a0);
        }
    }

    public static final class b extends ThreadLocal<v03> {
        @Override // java.lang.ThreadLocal
        public final v03 initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null) {
                hb0 hb0Var = new hb0(choreographer, nf6.a(looperMyLooper));
                return v03.a.C0438a.c(hb0Var, hb0Var.a0);
            }
            r6.g("no Looper on this thread");
            return null;
        }
    }

    public static final class c implements Choreographer.FrameCallback, Runnable {
        public c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            hb0.this.d.removeCallbacks(this);
            hb0.J1(hb0.this);
            hb0 hb0Var = hb0.this;
            synchronized (hb0Var.e) {
                if (hb0Var.Y) {
                    hb0Var.Y = false;
                    ArrayList arrayList = hb0Var.V;
                    hb0Var.V = hb0Var.W;
                    hb0Var.W = arrayList;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                    }
                    arrayList.clear();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            hb0.J1(hb0.this);
            hb0 hb0Var = hb0.this;
            synchronized (hb0Var.e) {
                try {
                    if (hb0Var.V.isEmpty()) {
                        hb0Var.c.removeFrameCallback(this);
                        hb0Var.Y = false;
                    }
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public hb0(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.a0 = new ib0(choreographer, this);
    }

    public static final void J1(hb0 hb0Var) {
        Runnable runnableRemoveFirst;
        boolean z;
        do {
            synchronized (hb0Var.e) {
                zs0<Runnable> zs0Var = hb0Var.f;
                runnableRemoveFirst = zs0Var.isEmpty() ? null : zs0Var.removeFirst();
            }
            while (runnableRemoveFirst != null) {
                runnableRemoveFirst.run();
                synchronized (hb0Var.e) {
                    zs0<Runnable> zs0Var2 = hb0Var.f;
                    runnableRemoveFirst = zs0Var2.isEmpty() ? null : zs0Var2.removeFirst();
                }
            }
            synchronized (hb0Var.e) {
                if (hb0Var.f.isEmpty()) {
                    z = false;
                    hb0Var.X = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.y03
    public final void v1(v03 v03Var, Runnable runnable) {
        synchronized (this.e) {
            try {
                this.f.addLast(runnable);
                if (!this.X) {
                    this.X = true;
                    this.d.post(this.Z);
                    if (!this.Y) {
                        this.Y = true;
                        this.c.postFrameCallback(this.Z);
                    }
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
