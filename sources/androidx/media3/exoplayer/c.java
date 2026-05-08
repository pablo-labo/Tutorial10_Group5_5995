package androidx.media3.exoplayer;

import androidx.media3.exoplayer.f;
import defpackage.ka2;
import defpackage.o6;
import defpackage.p35;
import defpackage.qk3;
import defpackage.sdb;
import defpackage.vjg;
import defpackage.zkd;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {
    public final qk3 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final HashMap<sdb, a> h;
    public long i;

    public static class a {
        public boolean a;
        public int b;
    }

    public c() {
        qk3 qk3Var = new qk3();
        k("bufferForPlaybackMs", 1000, 0, "0");
        k("bufferForPlaybackAfterRebufferMs", 2000, 0, "0");
        k("minBufferMs", 50000, 1000, "bufferForPlaybackMs");
        k("minBufferMs", 50000, 2000, "bufferForPlaybackAfterRebufferMs");
        k("maxBufferMs", 50000, 50000, "minBufferMs");
        k("backBufferDurationMs", 0, 0, "0");
        this.a = qk3Var;
        long jO = vjg.O(50000L);
        this.b = jO;
        this.c = jO;
        this.d = vjg.O(1000L);
        this.e = vjg.O(2000L);
        this.f = -1;
        this.g = vjg.O(0L);
        this.h = new HashMap<>();
        this.i = -1L;
    }

    public static void k(String str, int i, int i2, String str2) {
        ka2.k(str + " cannot be less than " + str2, i >= i2);
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean a(f.a aVar) {
        long jC = vjg.C(aVar.b, aVar.c);
        long jMin = aVar.d ? this.e : this.d;
        long j = aVar.e;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        return jMin <= 0 || jC >= jMin || this.a.a() >= l();
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.f
    public final long c() {
        return this.g;
    }

    @Override // androidx.media3.exoplayer.f
    public final qk3 d() {
        return this.a;
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean e(f.a aVar) {
        a aVar2 = this.h.get(aVar.a);
        aVar2.getClass();
        boolean z = this.a.a() >= l();
        float f = aVar.c;
        long j = this.c;
        long jMin = this.b;
        if (f > 1.0f) {
            jMin = Math.min(vjg.z(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = aVar.b;
        if (j2 < jMax) {
            aVar2.a = !z;
            if (z && j2 < 500000) {
                zkd.T("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z) {
            aVar2.a = false;
        }
        return aVar2.a;
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean f() {
        Iterator<a> it = this.h.values().iterator();
        while (it.hasNext()) {
            if (it.next().a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.f
    public final void g(sdb sdbVar) {
        if (this.h.remove(sdbVar) != null) {
            boolean zIsEmpty = this.h.isEmpty();
            qk3 qk3Var = this.a;
            if (zIsEmpty) {
                synchronized (qk3Var) {
                    if (qk3Var.a) {
                        qk3Var.b(0);
                    }
                }
            } else {
                qk3Var.b(l());
            }
        }
        if (this.h.isEmpty()) {
            this.i = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.f
    public final void h(sdb sdbVar) {
        if (this.h.remove(sdbVar) != null) {
            boolean zIsEmpty = this.h.isEmpty();
            qk3 qk3Var = this.a;
            if (!zIsEmpty) {
                qk3Var.b(l());
                return;
            }
            synchronized (qk3Var) {
                if (qk3Var.a) {
                    qk3Var.b(0);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.f
    public final void i(sdb sdbVar) {
        long id = Thread.currentThread().getId();
        long j = this.i;
        ka2.p("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.i = id;
        HashMap<sdb, a> map = this.h;
        if (!map.containsKey(sdbVar)) {
            map.put(sdbVar, new a());
        }
        a aVar = map.get(sdbVar);
        aVar.getClass();
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        aVar.b = i;
        aVar.a = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.exoplayer.f
    public final void j(f.a aVar, p35[] p35VarArr) {
        a aVar2 = this.h.get(aVar.a);
        aVar2.getClass();
        int iMax = this.f;
        if (iMax == -1) {
            int length = p35VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    p35 p35Var = p35VarArr[i];
                    if (p35Var != null) {
                        switch (p35Var.m().c) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                o6.h();
                                return;
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        aVar2.b = iMax;
        boolean zIsEmpty = this.h.isEmpty();
        qk3 qk3Var = this.a;
        if (!zIsEmpty) {
            qk3Var.b(l());
            return;
        }
        synchronized (qk3Var) {
            if (qk3Var.a) {
                qk3Var.b(0);
            }
        }
    }

    public final int l() {
        Iterator<a> it = this.h.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().b;
        }
        return i;
    }
}
