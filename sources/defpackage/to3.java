package defpackage;

import androidx.media3.exoplayer.f;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class to3 implements f {
    public final qk3 a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final long h;
    public final HashMap<sdb, a> i;
    public long j;

    public static class a {
        public boolean a;
        public int b;
    }

    public to3() {
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
        this.g = false;
        this.h = vjg.O(0L);
        this.i = new HashMap<>();
        this.j = -1L;
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
        if (jMin <= 0 || jC >= jMin) {
            return true;
        }
        return !this.g && this.a.a() >= l();
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.f
    public final long c() {
        return this.h;
    }

    @Override // androidx.media3.exoplayer.f
    public final qk3 d() {
        return this.a;
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean e(f.a aVar) {
        a aVar2 = this.i.get(aVar.a);
        aVar2.getClass();
        boolean z = true;
        boolean z2 = this.a.a() >= l();
        long jMin = this.b;
        float f = aVar.c;
        if (f > 1.0f) {
            jMin = Math.min(vjg.z(jMin, f), this.c);
        }
        long jMax = Math.max(jMin, 500000L);
        long j = aVar.b;
        if (j < jMax) {
            if (!this.g && z2) {
                z = false;
            }
            aVar2.a = z;
            if (!z && j < 500000) {
                zkd.T("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.c || z2) {
            aVar2.a = false;
        }
        return aVar2.a;
    }

    @Override // androidx.media3.exoplayer.f
    public final boolean f() {
        Iterator<a> it = this.i.values().iterator();
        while (it.hasNext()) {
            if (it.next().a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.f
    public final void g(sdb sdbVar) {
        HashMap<sdb, a> map = this.i;
        if (map.remove(sdbVar) != null) {
            m();
        }
        if (map.isEmpty()) {
            this.j = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.f
    public final void h(sdb sdbVar) {
        if (this.i.remove(sdbVar) != null) {
            m();
        }
    }

    @Override // androidx.media3.exoplayer.f
    public final void i(sdb sdbVar) {
        long id = Thread.currentThread().getId();
        long j = this.j;
        ka2.p("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.j = id;
        HashMap<sdb, a> map = this.i;
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
        a aVar2 = this.i.get(aVar.a);
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
                                break;
                        }
                        return;
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        aVar2.b = iMax;
        m();
    }

    public final int l() {
        Iterator<a> it = this.i.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().b;
        }
        return i;
    }

    public final void m() {
        boolean zIsEmpty = this.i.isEmpty();
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
