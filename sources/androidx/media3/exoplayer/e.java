package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.g;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.p;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.adb;
import defpackage.ayd;
import defpackage.bdb;
import defpackage.cdb;
import defpackage.cp3;
import defpackage.cy0;
import defpackage.d82;
import defpackage.e47;
import defpackage.emf;
import defpackage.fqf;
import defpackage.gqf;
import defpackage.ij9;
import defpackage.js9;
import defpackage.k81;
import defpackage.ka2;
import defpackage.m20;
import defpackage.n2f;
import defpackage.n60;
import defpackage.ox0;
import defpackage.p35;
import defpackage.q20;
import defpackage.qyc;
import defpackage.rjd;
import defpackage.rl3;
import defpackage.rng;
import defpackage.sdb;
import defpackage.sf6;
import defpackage.sn2;
import defpackage.so3;
import defpackage.sz8;
import defpackage.t2f;
import defpackage.vjg;
import defpackage.w1d;
import defpackage.wee;
import defpackage.wqe;
import defpackage.wqf;
import defpackage.x1d;
import defpackage.xdb;
import defpackage.xj9;
import defpackage.xpf;
import defpackage.yj9;
import defpackage.zf3;
import defpackage.zkd;
import defpackage.zsd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Handler.Callback, g.a, j.a, rng {
    public static final long U0 = vjg.c0(10000);
    public boolean A0;
    public long B0;
    public boolean C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public g J0;
    public long K0;
    public long L0;
    public int M0;
    public boolean N0;
    public ExoPlaybackException O0;
    public long P0;
    public ExoPlayer.c Q0;
    public long R0;
    public boolean S0;
    public float T0;
    public final k81 V;
    public final sf6 W;
    public final bdb X;
    public final Looper Y;
    public final emf.d Z;
    public final x1d[] a;
    public final emf.b a0;
    public final l[] b;
    public final long b0;
    public final boolean[] c;
    public final boolean c0;
    public final fqf d;
    public final cp3 d0;
    public final gqf e;
    public final ArrayList<d> e0;
    public final androidx.media3.exoplayer.f f;
    public final d82 f0;
    public final q20 g0;
    public final h h0;
    public final i i0;
    public final sz8 j0;
    public final long k0;
    public final sdb l0;
    public final m20 m0;
    public final sf6 n0;
    public final boolean o0;
    public final cy0 p0;
    public ayd q0;
    public zsd r0;
    public boolean s0;
    public boolean t0;
    public g u0;
    public adb v0;
    public C0046e w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    public class a implements k.a {
        public a() {
        }

        @Override // androidx.media3.exoplayer.k.a
        public final void a() {
            e.this.G0 = true;
        }

        @Override // androidx.media3.exoplayer.k.a
        public final void b() {
            e eVar = e.this;
            if (eVar.s0) {
                eVar.r0.getClass();
            } else if (!eVar.H0) {
                return;
            }
            eVar.W.k(2);
        }
    }

    public static final class b {
        public final ArrayList a;
        public final wee b;
        public final int c;
        public final long d;

        public b() {
            throw null;
        }

        public b(ArrayList arrayList, wee weeVar, int i, long j) {
            this.a = arrayList;
            this.b = weeVar;
            this.c = i;
            this.d = j;
        }
    }

    public static class c {
        public final int a;
        public final int b;
        public final int c;
        public final wee d;

        public c(int i, int i2, int i3, wee weeVar) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = weeVar;
        }
    }

    public static final class d implements Comparable<d> {
        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            dVar.getClass();
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.e$e, reason: collision with other inner class name */
    public static final class C0046e {
        public boolean a;
        public adb b;
        public int c;
        public boolean d;
        public int e;

        public C0046e(adb adbVar) {
            this.b = adbVar;
        }

        public final void a(int i) {
            this.a |= i > 0;
            this.c += i;
        }
    }

    public static final class f {
        public final h.b a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public f(h.b bVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.a = bVar;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    public static final class g {
        public final emf a;
        public final int b;
        public final long c;

        public g(emf emfVar, int i, long j) {
            this.a = emfVar;
            this.b = i;
            this.c = j;
        }
    }

    public e(Context context, k[] kVarArr, k[] kVarArr2, fqf fqfVar, gqf gqfVar, androidx.media3.exoplayer.f fVar, k81 k81Var, int i, boolean z, m20 m20Var, ayd aydVar, so3 so3Var, long j, Looper looper, n2f n2fVar, q20 q20Var, sdb sdbVar, final rng rngVar) {
        Looper looper2;
        ExoPlayer.c cVar = ExoPlayer.c.a;
        this.R0 = -9223372036854775807L;
        this.g0 = q20Var;
        this.d = fqfVar;
        this.e = gqfVar;
        this.f = fVar;
        this.V = k81Var;
        this.D0 = i;
        this.E0 = z;
        this.q0 = aydVar;
        this.j0 = so3Var;
        this.k0 = j;
        boolean z2 = false;
        this.y0 = false;
        this.f0 = n2fVar;
        this.l0 = sdbVar;
        this.Q0 = cVar;
        this.m0 = m20Var;
        this.T0 = 1.0f;
        this.r0 = zsd.b;
        this.P0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        this.b0 = fVar.c();
        this.c0 = fVar.b();
        emf.a aVar = emf.a;
        adb adbVarK = adb.k(gqfVar);
        this.v0 = adbVarK;
        this.w0 = new C0046e(adbVarK);
        this.b = new l[kVarArr.length];
        this.c = new boolean[kVarArr.length];
        l.a aVarB = fqfVar.b();
        this.a = new x1d[kVarArr.length];
        boolean z3 = false;
        for (int i2 = 0; i2 < kVarArr.length; i2++) {
            kVarArr[i2].u(i2, sdbVar, n2fVar);
            this.b[i2] = kVarArr[i2].v();
            if (aVarB != null) {
                androidx.media3.exoplayer.b bVar = (androidx.media3.exoplayer.b) this.b[i2];
                synchronized (bVar.a) {
                    bVar.g0 = aVarB;
                }
            }
            k kVar = kVarArr2[i2];
            if (kVar != null) {
                kVar.u(i2, sdbVar, n2fVar);
                z3 = true;
            }
            this.a[i2] = new x1d(kVarArr[i2], kVarArr2[i2], i2);
        }
        this.o0 = z3;
        this.d0 = new cp3(this, n2fVar);
        this.e0 = new ArrayList<>();
        this.Z = new emf.d();
        this.a0 = new emf.b();
        ka2.q(fqfVar.a == null);
        fqfVar.a = this;
        fqfVar.b = k81Var;
        this.N0 = true;
        t2f t2fVarC = n2fVar.c(looper, null);
        this.n0 = t2fVarC;
        this.h0 = new h(m20Var, t2fVarC, new q20(this, 3));
        this.i0 = new i(this, m20Var, t2fVarC, sdbVar);
        bdb bdbVar = new bdb();
        this.X = bdbVar;
        synchronized (bdbVar.a) {
            try {
                if (bdbVar.b == null) {
                    if (bdbVar.d == 0 && bdbVar.c == null) {
                        z2 = true;
                    }
                    ka2.q(z2);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    bdbVar.c = handlerThread;
                    handlerThread.start();
                    bdbVar.b = bdbVar.c.getLooper();
                }
                bdbVar.d++;
                looper2 = bdbVar.b;
            } finally {
            }
        }
        this.Y = looper2;
        t2f t2fVarC2 = n2fVar.c(looper2, this);
        this.W = t2fVarC2;
        this.p0 = new cy0(context, looper2, this);
        t2fVarC2.e(35, new rng() { // from class: o35
            @Override // defpackage.rng
            public final void e(long j2, long j3, a aVar2, MediaFormat mediaFormat) {
                rngVar.e(j2, j3, aVar2, mediaFormat);
                this.a.e(j2, j3, aVar2, mediaFormat);
            }
        }).b();
    }

    public static Pair<Object, Long> S(emf emfVar, g gVar, boolean z, int i, boolean z2, emf.d dVar, emf.b bVar) {
        int iT;
        emf emfVar2 = gVar.a;
        if (emfVar.p()) {
            return null;
        }
        emf emfVar3 = emfVar2.p() ? emfVar : emfVar2;
        try {
            Pair<Object, Long> pairI = emfVar3.i(dVar, bVar, gVar.b, gVar.c);
            if (!emfVar.equals(emfVar3)) {
                if (emfVar.b(pairI.first) == -1) {
                    if (!z || (iT = T(dVar, bVar, i, z2, pairI.first, emfVar3, emfVar)) == -1) {
                        return null;
                    }
                    return emfVar.i(dVar, bVar, iT, -9223372036854775807L);
                }
                if (emfVar3.g(pairI.first, bVar).f && emfVar3.m(bVar.c, dVar, 0L).m == emfVar3.b(pairI.first)) {
                    return emfVar.i(dVar, bVar, emfVar.g(pairI.first, bVar).c, gVar.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(emf.d dVar, emf.b bVar, int i, boolean z, Object obj, emf emfVar, emf emfVar2) {
        emf.d dVar2 = dVar;
        emf emfVar3 = emfVar;
        Object obj2 = emfVar3.m(emfVar3.g(obj, bVar).c, dVar, 0L).a;
        for (int i2 = 0; i2 < emfVar2.o(); i2++) {
            if (emfVar2.m(i2, dVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iB = emfVar3.b(obj);
        int iH = emfVar3.h();
        int iB2 = -1;
        int i3 = 0;
        while (i3 < iH && iB2 == -1) {
            emf emfVar4 = emfVar3;
            int iD = emfVar4.d(iB, bVar, dVar2, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = emfVar2.b(emfVar4.l(iD));
            i3++;
            emfVar3 = emfVar4;
            iB = iD;
            dVar2 = dVar;
        }
        if (iB2 == -1) {
            return -1;
        }
        return emfVar2.f(iB2, bVar, false).c;
    }

    public static boolean z(xj9 xj9Var) {
        if (xj9Var != null) {
            try {
                androidx.media3.exoplayer.source.g gVar = xj9Var.a;
                if (xj9Var.e) {
                    for (rjd rjdVar : xj9Var.c) {
                        if (rjdVar != null) {
                            rjdVar.a();
                        }
                    }
                } else {
                    gVar.l();
                }
                if ((!xj9Var.e ? 0L : gVar.h()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, h.b bVar) {
        h hVar = this.h0;
        xj9 xj9Var = hVar.l;
        if (xj9Var != null && xj9Var.g.a.equals(bVar)) {
            x1d x1dVar = this.a[i];
            xj9 xj9Var2 = hVar.l;
            int i2 = x1dVar.d;
            boolean z = (i2 == 2 || i2 == 4) && x1dVar.c(xj9Var2) == x1dVar.a;
            boolean z2 = x1dVar.d == 3 && x1dVar.c(xj9Var2) == x1dVar.c;
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final void A0(emf emfVar, h.b bVar, emf emfVar2, h.b bVar2, long j, boolean z) {
        boolean zR0 = r0(emfVar, bVar);
        Object obj = bVar.a;
        if (!zR0) {
            cdb cdbVar = bVar.b() ? cdb.d : this.v0.o;
            cp3 cp3Var = this.d0;
            if (cp3Var.e().equals(cdbVar)) {
                return;
            }
            this.W.l(16);
            cp3Var.g(cdbVar);
            x(this.v0.o, cdbVar.a, false, false);
            return;
        }
        emf.b bVar3 = this.a0;
        int i = emfVar.g(obj, bVar3).c;
        emf.d dVar = this.Z;
        emfVar.n(i, dVar);
        ij9.e eVar = dVar.i;
        so3 so3Var = (so3) this.j0;
        so3Var.getClass();
        so3Var.c = vjg.O(eVar.a);
        so3Var.f = vjg.O(eVar.b);
        so3Var.g = vjg.O(eVar.c);
        float f2 = eVar.d;
        if (f2 == -3.4028235E38f) {
            f2 = 0.97f;
        }
        so3Var.j = f2;
        float f3 = eVar.e;
        if (f3 == -3.4028235E38f) {
            f3 = 1.03f;
        }
        so3Var.i = f3;
        if (f2 == 1.0f && f3 == 1.0f) {
            so3Var.c = -9223372036854775807L;
        }
        so3Var.a();
        if (j != -9223372036854775807L) {
            so3Var.d = m(emfVar, obj, j);
            so3Var.a();
            return;
        }
        if (!Objects.equals(!emfVar2.p() ? emfVar2.m(emfVar2.g(bVar2.a, bVar3).c, dVar, 0L).a : null, dVar.a) || z) {
            so3Var.d = -9223372036854775807L;
            so3Var.a();
        }
    }

    public final boolean B() {
        xj9 xj9Var = this.h0.j;
        long j = xj9Var.g.e;
        if (xj9Var.e) {
            return j == -9223372036854775807L || this.v0.s < j || !q0();
        }
        return false;
    }

    public final void B0(boolean z, boolean z2) {
        this.A0 = z;
        this.B0 = (!z || z2) ? -9223372036854775807L : this.f0.d();
    }

    public final void C() {
        boolean zE;
        if (z(this.h0.m)) {
            xj9 xj9Var = this.h0.m;
            long jP = p(!xj9Var.e ? 0L : xj9Var.a.h());
            xj9 xj9Var2 = this.h0.j;
            long j = this.K0;
            long j2 = xj9Var.p;
            if (xj9Var != xj9Var2) {
                j -= j2;
                j2 = xj9Var.g.b;
            }
            long j3 = j - j2;
            long j4 = r0(this.v0.a, xj9Var.g.a) ? ((so3) this.j0).h : -9223372036854775807L;
            sdb sdbVar = this.l0;
            emf emfVar = this.v0.a;
            h.b bVar = xj9Var.g.a;
            float f2 = this.d0.e().a;
            boolean z = this.v0.l;
            f.a aVar = new f.a(sdbVar, emfVar, bVar, j3, jP, f2, this.A0, j4);
            zE = this.f.e(aVar);
            xj9 xj9Var3 = this.h0.j;
            if (!zE && xj9Var3.e && jP < 500000 && (this.b0 > 0 || this.c0)) {
                xj9Var3.a.t(this.v0.s, false);
                zE = this.f.e(aVar);
            }
        } else {
            zE = false;
        }
        this.C0 = zE;
        if (zE) {
            xj9 xj9Var4 = this.h0.m;
            xj9Var4.getClass();
            g.a aVar2 = new g.a();
            aVar2.a = this.K0 - xj9Var4.p;
            float f3 = this.d0.e().a;
            ka2.l(f3 > 0.0f || f3 == -3.4028235E38f);
            aVar2.b = f3;
            long j5 = this.B0;
            ka2.l(j5 >= 0 || j5 == -9223372036854775807L);
            aVar2.c = j5;
            androidx.media3.exoplayer.g gVar = new androidx.media3.exoplayer.g(aVar2);
            ka2.q(xj9Var4.m == null);
            xj9Var4.a.e(gVar);
        }
        v0();
    }

    public final void D() {
        h hVar = this.h0;
        hVar.l();
        xj9 xj9Var = hVar.n;
        if (xj9Var != null) {
            androidx.media3.exoplayer.source.g gVar = xj9Var.a;
            if ((!xj9Var.d || xj9Var.e) && !gVar.d()) {
                emf emfVar = this.v0.a;
                if (xj9Var.e) {
                    gVar.s();
                }
                if (this.f.f()) {
                    if (!xj9Var.d) {
                        long j = xj9Var.g.b;
                        xj9Var.d = true;
                        gVar.p(this, j);
                        return;
                    }
                    g.a aVar = new g.a();
                    aVar.a = this.K0 - xj9Var.p;
                    float f2 = this.d0.e().a;
                    ka2.l(f2 > 0.0f || f2 == -3.4028235E38f);
                    aVar.b = f2;
                    long j2 = this.B0;
                    ka2.l(j2 >= 0 || j2 == -9223372036854775807L);
                    aVar.c = j2;
                    androidx.media3.exoplayer.g gVar2 = new androidx.media3.exoplayer.g(aVar);
                    ka2.q(xj9Var.m == null);
                    gVar.e(gVar2);
                }
            }
        }
    }

    public final void E() {
        C0046e c0046e = this.w0;
        adb adbVar = this.v0;
        boolean z = c0046e.a | (c0046e.b != adbVar);
        c0046e.a = z;
        c0046e.b = adbVar;
        if (z) {
            androidx.media3.exoplayer.d dVar = (androidx.media3.exoplayer.d) this.g0.b;
            dVar.j.i(new n60(3, dVar, c0046e));
            this.w0 = new C0046e(this.v0);
        }
    }

    public final void F(int i) {
        x1d x1dVar = this.a[i];
        try {
            xj9 xj9Var = this.h0.j;
            xj9Var.getClass();
            k kVarC = x1dVar.c(xj9Var);
            kVarC.getClass();
            kVarC.n();
        } catch (IOException | RuntimeException e) {
            int iP = x1dVar.a.p();
            if (iP != 3 && iP != 5) {
                throw e;
            }
            gqf gqfVar = this.h0.j.o;
            zkd.x("ExoPlayerImplInternal", "Disabling track due to error: ".concat(androidx.media3.common.a.c(((p35[]) gqfVar.c)[i].q())), e);
            gqf gqfVar2 = new gqf((w1d[]) ((w1d[]) gqfVar.b).clone(), (p35[]) ((p35[]) gqfVar.c).clone(), (wqf) gqfVar.d, gqfVar.e);
            ((w1d[]) gqfVar2.b)[i] = null;
            ((p35[]) gqfVar2.c)[i] = null;
            i(i);
            xj9 xj9Var2 = this.h0.j;
            xj9Var2.a(gqfVar2, this.v0.s, false, new boolean[xj9Var2.j.length]);
        }
    }

    public final void G(final int i, final boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.n0.i(new Runnable() { // from class: n35
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = this.a;
                    m20 m20Var = eVar.m0;
                    x1d[] x1dVarArr = eVar.a;
                    int i2 = i;
                    m20Var.c0(i2, x1dVarArr[i2].a.p(), z);
                }
            });
        }
    }

    public final void H() throws Throwable {
        v(this.i0.b(), true);
    }

    public final void I(c cVar) throws Throwable {
        emf emfVarB;
        this.w0.a(1);
        int i = cVar.a;
        int i2 = cVar.b;
        int i3 = cVar.c;
        wee weeVar = cVar.d;
        i iVar = this.i0;
        ArrayList arrayList = iVar.b;
        ka2.l(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        iVar.j = weeVar;
        if (i == i2 || i == i3) {
            emfVarB = iVar.b();
        } else {
            int iMin = Math.min(i, i3);
            int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int iO = ((i.c) arrayList.get(iMin)).d;
            vjg.N(i, i2, i3, arrayList);
            while (iMin <= iMax) {
                i.c cVar2 = (i.c) arrayList.get(iMin);
                cVar2.d = iO;
                iO += cVar2.a.o.e.o();
                iMin++;
            }
            emfVarB = iVar.b();
        }
        v(emfVarB, false);
    }

    public final void J() {
        this.w0.a(1);
        O(false, false, false, true);
        this.f.i(this.l0);
        m0(this.v0.a.p() ? 4 : 2);
        adb adbVar = this.v0;
        boolean z = adbVar.l;
        y0(this.p0.d(adbVar.e, z), adbVar.n, adbVar.m, z);
        rl3 rl3VarA = this.V.a();
        i iVar = this.i0;
        ArrayList arrayList = iVar.b;
        ka2.q(!iVar.k);
        iVar.l = rl3VarA;
        for (int i = 0; i < arrayList.size(); i++) {
            i.c cVar = (i.c) arrayList.get(i);
            iVar.e(cVar);
            iVar.g.add(cVar);
        }
        iVar.k = true;
        this.W.k(2);
    }

    public final void K(sn2 sn2Var) {
        bdb bdbVar = this.X;
        sf6 sf6Var = this.W;
        try {
            O(true, false, true, false);
            L();
            this.f.g(this.l0);
            cy0 cy0Var = this.p0;
            cy0Var.c = null;
            cy0Var.a();
            cy0Var.c(0);
            this.d.d();
            m0(1);
        } finally {
            sf6Var.d();
            bdbVar.a();
            sn2Var.d();
        }
    }

    public final void L() {
        for (int i = 0; i < this.a.length; i++) {
            androidx.media3.exoplayer.b bVar = (androidx.media3.exoplayer.b) this.b[i];
            synchronized (bVar.a) {
                bVar.g0 = null;
            }
            x1d x1dVar = this.a[i];
            x1dVar.a.release();
            x1dVar.e = false;
            k kVar = x1dVar.c;
            if (kVar != null) {
                kVar.release();
                x1dVar.f = false;
            }
        }
    }

    public final void M(int i, int i2, wee weeVar) throws Throwable {
        this.w0.a(1);
        i iVar = this.i0;
        iVar.getClass();
        ka2.l(i >= 0 && i <= i2 && i2 <= iVar.b.size());
        iVar.j = weeVar;
        iVar.g(i, i2);
        v(iVar.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.e.N():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.e.O(boolean, boolean, boolean, boolean):void");
    }

    public final void P() {
        xj9 xj9Var = this.h0.j;
        this.z0 = xj9Var != null && xj9Var.g.i && this.y0;
    }

    public final void Q(long j) {
        xj9 xj9Var = this.h0.j;
        long j2 = j + (xj9Var == null ? 1000000000000L : xj9Var.p);
        this.K0 = j2;
        this.d0.a.a(j2);
        for (x1d x1dVar : this.a) {
            long j3 = this.K0;
            k kVarC = x1dVar.c(xj9Var);
            if (kVarC != null) {
                kVarC.B(j3);
            }
        }
        for (xj9 xj9Var2 = r0.j; xj9Var2 != null; xj9Var2 = xj9Var2.m) {
            for (p35 p35Var : (p35[]) xj9Var2.o.c) {
                if (p35Var != null) {
                    p35Var.j();
                }
            }
        }
    }

    public final void R(emf emfVar, emf emfVar2) {
        if (emfVar.p() && emfVar2.p()) {
            return;
        }
        ArrayList<d> arrayList = this.e0;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    public final void U(long j) {
        boolean z;
        if (this.s0) {
            this.r0.getClass();
            z = true;
        } else {
            z = false;
        }
        adb adbVar = this.v0;
        long j2 = U0;
        if (z) {
            jMin = adbVar.e != 3 ? j2 : 1000L;
            for (x1d x1dVar : this.a) {
                long j3 = this.K0;
                long j4 = this.L0;
                k kVar = x1dVar.c;
                k kVar2 = x1dVar.a;
                long jR = x1d.g(kVar2) ? kVar2.r(j3, j4) : Long.MAX_VALUE;
                if (kVar != null && kVar.getState() != 0) {
                    jR = Math.min(jR, kVar.r(j3, j4));
                }
                jMin = Math.min(jMin, vjg.c0(jR));
            }
            if (this.v0.m()) {
                xj9 xj9Var = this.h0.j;
                if ((xj9Var != null ? xj9Var.m : null) != null) {
                    if ((vjg.O(jMin) * this.v0.o.a) + this.K0 >= r1.e()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (adbVar.e != 3 || q0()) {
            jMin = j2;
        }
        this.W.j(j + jMin);
    }

    public final void V(boolean z) {
        h.b bVar = this.h0.j.g.a;
        long jX = X(bVar, this.v0.s, true, false);
        if (jX != this.v0.s) {
            adb adbVar = this.v0;
            this.v0 = y(bVar, jX, adbVar.c, adbVar.d, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:6|(1:8)(4:10|(1:12)(1:13)|14|(3:16|(1:18)(1:19)|20)(11:21|(1:23)(1:24)|126|25|125|(1:27)(7:31|(3:33|(1:35)|36)(26:39|(12:130|41|(1:54)(3:47|(1:51)|52)|55|56|119|57|(1:64)|65|66|67|68)(1:75)|121|76|(1:78)(1:79)|117|80|(1:82)(1:84)|83|85|86|(1:88)(1:89)|90|115|91|92|128|93|94|123|95|96|38|97|67|68)|110|108|72|113|114)|37|38|97|67|68))|9|126|25|125|(0)(0)|37|38|97|67|68) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:39|(9:(14:(12:130|41|(1:54)(3:47|(1:51)|52)|55|56|119|57|(1:64)|65|66|67|68)(1:75)|115|91|92|128|93|94|123|95|96|38|97|67|68)|117|80|(1:82)(1:84)|83|85|86|(1:88)(1:89)|90)|121|76|(1:78)(1:79)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(8:(12:130|41|(1:54)(3:47|(1:51)|52)|55|56|119|57|(1:64)|65|66|67|68)(1:75)|123|95|96|38|97|67|68)|115|91|92|128|93|94) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x017d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x017e, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x017f, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0187, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x018a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x018b, code lost:
    
        r10 = r2;
        r2 = r6;
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        r9 = r2;
        r2 = r6;
        r3 = r11;
        r5 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7 A[Catch: all -> 0x00aa, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00aa, blocks: (B:27:0x00a7, B:33:0x00b6, B:35:0x00ba, B:36:0x00bd, B:43:0x00d4, B:47:0x00dc, B:51:0x00eb, B:52:0x00f0), top: B:125:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(androidx.media3.exoplayer.e.g r20, boolean r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.e.W(androidx.media3.exoplayer.e$g, boolean):void");
    }

    public final long X(h.b bVar, long j, boolean z, boolean z2) {
        x1d[] x1dVarArr;
        u0();
        B0(false, true);
        if (z2 || this.v0.e == 3) {
            m0(2);
        }
        h hVar = this.h0;
        xj9 xj9Var = hVar.j;
        xj9 xj9Var2 = xj9Var;
        while (xj9Var2 != null && !bVar.equals(xj9Var2.g.a)) {
            xj9Var2 = xj9Var2.m;
        }
        if (z || xj9Var != xj9Var2 || (xj9Var2 != null && xj9Var2.p + j < 0)) {
            int i = 0;
            while (true) {
                x1dVarArr = this.a;
                if (i >= x1dVarArr.length) {
                    break;
                }
                i(i);
                i++;
            }
            this.R0 = -9223372036854775807L;
            if (xj9Var2 != null) {
                while (hVar.j != xj9Var2) {
                    hVar.a();
                }
                hVar.p(xj9Var2);
                xj9Var2.p = 1000000000000L;
                l(new boolean[x1dVarArr.length], hVar.k.e());
                xj9Var2.h = true;
            }
        }
        h();
        if (xj9Var2 != null) {
            androidx.media3.exoplayer.source.g gVar = xj9Var2.a;
            hVar.p(xj9Var2);
            if (!xj9Var2.e) {
                xj9Var2.g = xj9Var2.g.b(j);
            } else if (xj9Var2.f) {
                j = gVar.i(j);
                gVar.t(j - this.b0, this.c0);
            }
            Q(j);
            C();
        } else {
            hVar.b();
            Q(j);
        }
        u(false);
        this.W.k(2);
        return j;
    }

    public final void Y(j jVar) {
        jVar.getClass();
        sf6 sf6Var = this.W;
        if (jVar.e != this.Y) {
            sf6Var.e(15, jVar).b();
            return;
        }
        synchronized (jVar) {
        }
        try {
            jVar.a.m(jVar.c, jVar.d);
            jVar.a(true);
            int i = this.v0.e;
            if (i == 3 || i == 2) {
                sf6Var.k(2);
            }
        } catch (Throwable th) {
            jVar.a(true);
            throw th;
        }
    }

    public final void Z(j jVar) {
        Looper looper = jVar.e;
        if (looper.getThread().isAlive()) {
            this.f0.c(looper, null).i(new zf3(2, this, jVar));
        } else {
            zkd.T("TAG", "Trying to send message on a dead thread.");
            jVar.a(false);
        }
    }

    @Override // androidx.media3.exoplayer.source.g.a
    public final void a(androidx.media3.exoplayer.source.g gVar) {
        this.W.e(8, gVar).b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(defpackage.ox0 r7, boolean r8) {
        /*
            r6 = this;
            fqf r0 = r6.d
            r0.f(r7)
            if (r8 == 0) goto L8
            goto L9
        L8:
            r7 = 0
        L9:
            cy0 r8 = r6.p0
            ox0 r0 = r8.d
            boolean r0 = java.util.Objects.equals(r0, r7)
            if (r0 != 0) goto L46
            r8.d = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L1b
        L19:
            r3 = r0
            goto L3a
        L1b:
            int r2 = r7.c
            r3 = 3
            r4 = 2
            java.lang.String r5 = "AudioFocusManager"
            switch(r2) {
                case 0: goto L34;
                case 1: goto L32;
                case 2: goto L30;
                case 3: goto L19;
                case 4: goto L30;
                case 5: goto L3a;
                case 6: goto L3a;
                case 7: goto L3a;
                case 8: goto L3a;
                case 9: goto L3a;
                case 10: goto L3a;
                case 11: goto L2c;
                case 12: goto L3a;
                case 13: goto L3a;
                case 14: goto L32;
                case 15: goto L24;
                case 16: goto L2a;
                default: goto L24;
            }
        L24:
            java.lang.String r7 = "Unidentified audio usage: "
            defpackage.g7.j(r2, r7, r5)
            goto L19
        L2a:
            r3 = 4
            goto L3a
        L2c:
            int r7 = r7.a
            if (r7 != r1) goto L3a
        L30:
            r3 = r4
            goto L3a
        L32:
            r3 = r1
            goto L3a
        L34:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            defpackage.zkd.T(r5, r7)
            goto L32
        L3a:
            r8.f = r3
            if (r3 == r1) goto L40
            if (r3 != 0) goto L41
        L40:
            r0 = r1
        L41:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            defpackage.ka2.k(r7, r0)
        L46:
            adb r7 = r6.v0
            boolean r0 = r7.l
            int r1 = r7.n
            int r2 = r7.m
            int r7 = r7.e
            int r7 = r8.d(r7, r0)
            r6.y0(r7, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.e.a0(ox0, boolean):void");
    }

    @Override // androidx.media3.exoplayer.source.p.a
    public final void b(p pVar) {
        this.W.e(9, (androidx.media3.exoplayer.source.g) pVar).b();
    }

    public final void b0(boolean z, sn2 sn2Var) {
        if (this.F0 != z) {
            this.F0 = z;
            if (!z) {
                for (x1d x1dVar : this.a) {
                    x1dVar.j();
                }
            }
        }
        if (sn2Var != null) {
            sn2Var.d();
        }
    }

    public final void c(b bVar, int i) throws Throwable {
        this.w0.a(1);
        i iVar = this.i0;
        if (i == -1) {
            i = iVar.b.size();
        }
        v(iVar.a(i, bVar.a, bVar.b), false);
    }

    public final void c0(b bVar) throws Throwable {
        this.w0.a(1);
        int i = bVar.c;
        wee weeVar = bVar.b;
        ArrayList arrayList = bVar.a;
        if (i != -1) {
            this.J0 = new g(new xdb(arrayList, weeVar), bVar.c, bVar.d);
        }
        i iVar = this.i0;
        ArrayList arrayList2 = iVar.b;
        iVar.g(0, arrayList2.size());
        v(iVar.a(arrayList2.size(), arrayList, weeVar), false);
    }

    public final void d() {
        for (x1d x1dVar : this.a) {
            zsd zsdVar = this.s0 ? this.r0 : null;
            x1dVar.a.m(18, zsdVar);
            k kVar = x1dVar.c;
            if (kVar != null) {
                kVar.m(18, zsdVar);
            }
        }
    }

    public final void d0(boolean z) {
        this.y0 = z;
        P();
        if (this.z0) {
            h hVar = this.h0;
            if (hVar.k != hVar.j) {
                V(true);
                u(false);
            }
        }
    }

    @Override // defpackage.rng
    public final void e(long j, long j2, androidx.media3.common.a aVar, MediaFormat mediaFormat) {
        if (this.t0) {
            this.W.c(37).b();
        }
    }

    public final void e0(cdb cdbVar) {
        this.W.l(16);
        cp3 cp3Var = this.d0;
        cp3Var.g(cdbVar);
        cdb cdbVarE = cp3Var.e();
        x(cdbVarE, cdbVarE.a, true, true);
    }

    public final boolean f() {
        if (!this.o0) {
            return false;
        }
        for (x1d x1dVar : this.a) {
            if (x1dVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final void f0(ExoPlayer.c cVar) {
        this.Q0 = cVar;
        emf emfVar = this.v0.a;
        h hVar = this.h0;
        hVar.i = cVar;
        hVar.i.getClass();
        if (hVar.r.isEmpty()) {
            return;
        }
        hVar.o(new ArrayList());
    }

    public final void g() {
        N();
        V(true);
    }

    public final void g0(int i) {
        this.D0 = i;
        emf emfVar = this.v0.a;
        h hVar = this.h0;
        hVar.g = i;
        int iT = hVar.t(emfVar);
        if ((iT & 1) != 0) {
            V(true);
        } else if ((iT & 2) != 0) {
            h();
        }
        u(false);
    }

    public final void h() {
        k kVar;
        if (this.o0 && f()) {
            for (x1d x1dVar : this.a) {
                int iB = x1dVar.b();
                if (x1dVar.e()) {
                    int i = x1dVar.d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        kVar = x1dVar.a;
                    } else {
                        kVar = x1dVar.c;
                        kVar.getClass();
                    }
                    x1dVar.a(kVar, this.d0);
                    x1dVar.h(z);
                    x1dVar.d = i2;
                }
                this.I0 -= iB - x1dVar.b();
            }
            this.R0 = -9223372036854775807L;
        }
    }

    public final void h0(boolean z) throws Throwable {
        if (!z) {
            this.t0 = false;
            this.W.l(37);
            g gVar = this.u0;
            if (gVar != null) {
                W(gVar, false);
                this.u0 = null;
            }
        }
        this.s0 = z;
        d();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        xj9 xj9Var;
        h.b bVar;
        xj9 xj9Var2;
        int i2;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    this.w0.a(1);
                    y0(this.p0.d(this.v0.e, z), i3 >> 4, i3 & 15, z);
                    break;
                case 2:
                    j();
                    break;
                case 3:
                    W((g) message.obj, true);
                    break;
                case 4:
                    e0((cdb) message.obj);
                    break;
                case 5:
                    j0((ayd) message.obj);
                    break;
                case 6:
                    t0(false, true);
                    break;
                case 7:
                    K((sn2) message.obj);
                    return true;
                case 8:
                    w((androidx.media3.exoplayer.source.g) message.obj);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    s((androidx.media3.exoplayer.source.g) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case 11:
                    g0(message.arg1);
                    break;
                case 12:
                    k0(message.arg1 != 0);
                    break;
                case 13:
                    b0(message.arg1 != 0, (sn2) message.obj);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    Y((j) message.obj);
                    break;
                case 15:
                    Z((j) message.obj);
                    break;
                case 16:
                    cdb cdbVar = (cdb) message.obj;
                    x(cdbVar, cdbVar.a, true, false);
                    break;
                case 17:
                    c0((b) message.obj);
                    break;
                case 18:
                    c((b) message.obj, message.arg1);
                    break;
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    I((c) message.obj);
                    break;
                case 20:
                    M(message.arg1, message.arg2, (wee) message.obj);
                    break;
                case 21:
                    l0((wee) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    d0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    g();
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    x0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    f0((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case RendererMetrics.SAMPLES /* 30 */:
                    Pair pair = (Pair) message.obj;
                    o0(pair.first, (sn2) pair.second);
                    break;
                case 31:
                    a0((ox0) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    p0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    q(message.arg1);
                    break;
                case 34:
                    r();
                    break;
                case 35:
                    n0((rng) message.obj);
                    break;
                case 36:
                    h0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.t0 = false;
                    g gVar = this.u0;
                    if (gVar != null) {
                        W(gVar, false);
                        this.u0 = null;
                    }
                    break;
                case 38:
                    i0((zsd) message.obj);
                    break;
            }
        } catch (ParserException e) {
            int i4 = e.dataType;
            if (i4 == 1) {
                i2 = e.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i4 == 4) {
                    i2 = e.contentIsMalformed ? 3002 : 3004;
                }
                t(e, i);
            }
            i = i2;
            t(e, i);
        } catch (DataSourceException e2) {
            t(e2, e2.reason);
        } catch (ExoPlaybackException e3) {
            e = e3;
            int i5 = e.type;
            h hVar = this.h0;
            if (i5 == 1 && (xj9Var2 = hVar.k) != null && e.mediaPeriodId == null) {
                e = e.b(xj9Var2.g.a);
            }
            int i6 = e.type;
            sf6 sf6Var = this.W;
            if (i6 == 1 && (bVar = e.mediaPeriodId) != null && A(e.rendererIndex, bVar)) {
                this.S0 = true;
                h();
                xj9 xj9VarH = hVar.h();
                xj9 xj9Var3 = hVar.j;
                if (xj9Var3 != xj9VarH) {
                    while (xj9Var3 != null) {
                        xj9 xj9Var4 = xj9Var3.m;
                        if (xj9Var4 == xj9VarH) {
                            break;
                        }
                        xj9Var3 = xj9Var4;
                    }
                }
                hVar.p(xj9Var3);
                if (this.v0.e != 4) {
                    C();
                    sf6Var.k(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.O0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.O0;
                }
                if (e.type == 1 && hVar.j != hVar.k) {
                    while (true) {
                        xj9Var = hVar.j;
                        if (xj9Var == hVar.k) {
                            break;
                        }
                        hVar.a();
                    }
                    ka2.n(xj9Var);
                    E();
                    yj9 yj9Var = xj9Var.g;
                    h.b bVar2 = yj9Var.a;
                    long j = yj9Var.b;
                    this.v0 = y(bVar2, j, yj9Var.c, j, true, 0);
                }
                if (e.isRecoverable && (this.O0 == null || (i = e.errorCode) == 5004 || i == 5003)) {
                    zkd.U("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.O0 == null) {
                        this.O0 = e;
                    }
                    sf6Var.h(sf6Var.e(25, e));
                } else {
                    zkd.x("ExoPlayerImplInternal", "Playback error", e);
                    t0(true, false);
                    this.v0 = this.v0.f(e);
                }
            }
        } catch (DrmSession.DrmSessionException e4) {
            t(e4, e4.errorCode);
        } catch (BehindLiveWindowException e5) {
            t(e5, 1002);
        } catch (IOException e6) {
            t(e6, 2000);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            zkd.x("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            t0(true, false);
            this.v0 = this.v0.f(exoPlaybackException2);
        }
        E();
        return true;
    }

    public final void i(int i) {
        x1d[] x1dVarArr = this.a;
        int iB = x1dVarArr[i].b();
        x1d x1dVar = x1dVarArr[i];
        k kVar = x1dVar.a;
        cp3 cp3Var = this.d0;
        x1dVar.a(kVar, cp3Var);
        k kVar2 = x1dVar.c;
        if (kVar2 != null) {
            boolean z = (kVar2.getState() == 0 || x1dVar.d == 3) ? false : true;
            x1dVar.a(kVar2, cp3Var);
            x1dVar.h(false);
            if (z) {
                k kVar3 = x1dVar.a;
                kVar2.getClass();
                kVar2.m(17, kVar3);
            }
        }
        x1dVar.d = 0;
        G(i, false);
        this.I0 -= iB;
    }

    public final void i0(zsd zsdVar) {
        this.r0 = zsdVar;
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x08ad  */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71, types: [int] */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r4v54, types: [androidx.media3.exoplayer.j$b, androidx.media3.exoplayer.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34, types: [androidx.media3.exoplayer.j$b, androidx.media3.exoplayer.k, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 2265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.e.j():void");
    }

    public final void j0(ayd aydVar) {
        this.q0 = aydVar;
    }

    public final void k(xj9 xj9Var, int i, boolean z, long j) {
        x1d x1dVar = this.a[i];
        if (x1dVar.f()) {
            return;
        }
        boolean z2 = xj9Var == this.h0.j;
        gqf gqfVar = xj9Var.o;
        w1d w1dVar = ((w1d[]) gqfVar.b)[i];
        p35 p35Var = ((p35[]) gqfVar.c)[i];
        boolean z3 = q0() && this.v0.e == 3;
        boolean z4 = !z && z3;
        this.I0++;
        rjd rjdVar = xj9Var.c[i];
        long j2 = xj9Var.p;
        h.b bVar = xj9Var.g.a;
        k kVar = x1dVar.c;
        int length = p35Var != null ? p35Var.length() : 0;
        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[length];
        for (int i2 = 0; i2 < length; i2++) {
            p35Var.getClass();
            aVarArr[i2] = p35Var.e(i2);
        }
        int i3 = x1dVar.d;
        cp3 cp3Var = this.d0;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            x1dVar.e = true;
            x1dVar.a.s(w1dVar, aVarArr, rjdVar, z4, z2, j, j2, bVar);
            cp3Var.a(x1dVar.a);
        } else {
            x1dVar.f = true;
            kVar.getClass();
            kVar.s(w1dVar, aVarArr, rjdVar, z4, z2, j, j2, bVar);
            cp3Var.a(kVar);
        }
        a aVar = new a();
        k kVarC = x1dVar.c(xj9Var);
        kVarC.getClass();
        kVarC.m(11, aVar);
        if (z3 && z2) {
            x1dVar.l();
        }
    }

    public final void k0(boolean z) {
        this.E0 = z;
        emf emfVar = this.v0.a;
        h hVar = this.h0;
        hVar.h = z;
        int iT = hVar.t(emfVar);
        if ((iT & 1) != 0) {
            V(true);
        } else if ((iT & 2) != 0) {
            h();
        }
        u(false);
    }

    public final void l(boolean[] zArr, long j) {
        x1d[] x1dVarArr;
        e eVar;
        long j2;
        xj9 xj9Var = this.h0.k;
        gqf gqfVar = xj9Var.o;
        int i = 0;
        while (true) {
            x1dVarArr = this.a;
            if (i >= x1dVarArr.length) {
                break;
            }
            if (!gqfVar.c(i)) {
                x1dVarArr[i].j();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < x1dVarArr.length) {
            if (gqfVar.c(i2) && x1dVarArr[i2].c(xj9Var) == null) {
                eVar = this;
                j2 = j;
                eVar.k(xj9Var, i2, zArr[i2], j2);
            } else {
                eVar = this;
                j2 = j;
            }
            i2++;
            this = eVar;
            j = j2;
        }
    }

    public final void l0(wee weeVar) throws Throwable {
        this.w0.a(1);
        i iVar = this.i0;
        int size = iVar.b.size();
        if (weeVar.getLength() != size) {
            weeVar = weeVar.f().h(0, size);
        }
        iVar.j = weeVar;
        v(iVar.b(), false);
    }

    public final long m(emf emfVar, Object obj, long j) {
        emf.b bVar = this.a0;
        int i = emfVar.g(obj, bVar).c;
        emf.d dVar = this.Z;
        emfVar.n(i, dVar);
        if (dVar.e != -9223372036854775807L && dVar.a() && dVar.h) {
            return vjg.O(vjg.A(dVar.f) - dVar.e) - (j + bVar.e);
        }
        return -9223372036854775807L;
    }

    public final void m0(int i) {
        adb adbVar = this.v0;
        if (adbVar.e != i) {
            if (i != 2) {
                this.P0 = -9223372036854775807L;
            }
            if (i != 3 && adbVar.p) {
                this.v0 = adbVar.i(false);
            }
            this.v0 = this.v0.h(i);
        }
    }

    public final long n(xj9 xj9Var) {
        if (xj9Var == null) {
            return 0L;
        }
        long jMax = xj9Var.p;
        if (!xj9Var.e) {
            return jMax;
        }
        int i = 0;
        while (true) {
            x1d[] x1dVarArr = this.a;
            if (i >= x1dVarArr.length) {
                return jMax;
            }
            if (x1dVarArr[i].c(xj9Var) != null) {
                k kVarC = x1dVarArr[i].c(xj9Var);
                Objects.requireNonNull(kVarC);
                long jA = kVarC.A();
                if (jA == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jA, jMax);
            }
            i++;
        }
    }

    public final void n0(rng rngVar) {
        for (x1d x1dVar : this.a) {
            k kVar = x1dVar.a;
            if (kVar.p() == 2) {
                kVar.m(7, rngVar);
                k kVar2 = x1dVar.c;
                if (kVar2 != null) {
                    kVar2.m(7, rngVar);
                }
            }
        }
    }

    public final Pair<h.b, Long> o(emf emfVar) {
        if (emfVar.p()) {
            return Pair.create(adb.u, 0L);
        }
        Pair<Object, Long> pairI = emfVar.i(this.Z, this.a0, emfVar.a(this.E0), -9223372036854775807L);
        h.b bVarR = this.h0.r(emfVar, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (bVarR.b()) {
            Object obj = bVarR.a;
            emf.b bVar = this.a0;
            emfVar.g(obj, bVar);
            jLongValue = bVarR.c == bVar.f(bVarR.b) ? bVar.g.b : 0L;
        }
        return Pair.create(bVarR, Long.valueOf(jLongValue));
    }

    public final void o0(Object obj, sn2 sn2Var) {
        for (x1d x1dVar : this.a) {
            k kVar = x1dVar.a;
            if (kVar.p() == 2) {
                int i = x1dVar.d;
                if (i == 4 || i == 1) {
                    k kVar2 = x1dVar.c;
                    kVar2.getClass();
                    kVar2.m(1, obj);
                } else {
                    kVar.m(1, obj);
                }
            }
        }
        int i2 = this.v0.e;
        if (i2 == 3 || i2 == 2) {
            this.W.k(2);
        }
        if (sn2Var != null) {
            sn2Var.d();
        }
    }

    public final long p(long j) {
        xj9 xj9Var = this.h0.m;
        if (xj9Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.K0 - xj9Var.p));
    }

    public final void p0(float f2) {
        this.T0 = f2;
        float f3 = f2 * this.p0.g;
        for (x1d x1dVar : this.a) {
            k kVar = x1dVar.a;
            if (kVar.p() == 1) {
                kVar.m(2, Float.valueOf(f3));
                k kVar2 = x1dVar.c;
                if (kVar2 != null) {
                    kVar2.m(2, Float.valueOf(f3));
                }
            }
        }
    }

    public final void q(int i) {
        adb adbVar = this.v0;
        y0(i, adbVar.n, adbVar.m, adbVar.l);
    }

    public final boolean q0() {
        adb adbVar = this.v0;
        return adbVar.l && adbVar.n == 0;
    }

    public final void r() {
        p0(this.T0);
    }

    public final boolean r0(emf emfVar, h.b bVar) {
        if (bVar.b() || emfVar.p()) {
            return false;
        }
        int i = emfVar.g(bVar.a, this.a0).c;
        emf.d dVar = this.Z;
        emfVar.n(i, dVar);
        return dVar.a() && dVar.h && dVar.e != -9223372036854775807L;
    }

    public final void s(androidx.media3.exoplayer.source.g gVar) {
        h hVar = this.h0;
        xj9 xj9Var = hVar.m;
        if (xj9Var != null && xj9Var.a == gVar) {
            hVar.n(this.K0);
            C();
            return;
        }
        xj9 xj9Var2 = hVar.n;
        if (xj9Var2 == null || xj9Var2.a != gVar) {
            return;
        }
        D();
    }

    public final void s0() {
        xj9 xj9Var = this.h0.j;
        if (xj9Var == null) {
            return;
        }
        gqf gqfVar = xj9Var.o;
        int i = 0;
        while (true) {
            x1d[] x1dVarArr = this.a;
            if (i >= x1dVarArr.length) {
                return;
            }
            if (gqfVar.c(i)) {
                x1dVarArr[i].l();
            }
            i++;
        }
    }

    public final void t(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        xj9 xj9Var = this.h0.j;
        if (xj9Var != null) {
            exoPlaybackException = exoPlaybackException.b(xj9Var.g.a);
        }
        zkd.x("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        t0(false, false);
        this.v0 = this.v0.f(exoPlaybackException);
    }

    public final void t0(boolean z, boolean z2) {
        O(z || !this.F0, false, true, false);
        this.w0.a(z2 ? 1 : 0);
        this.f.h(this.l0);
        this.p0.d(1, this.v0.l);
        m0(1);
    }

    public final void u(boolean z) {
        xj9 xj9Var = this.h0.m;
        h.b bVar = xj9Var == null ? this.v0.b : xj9Var.g.a;
        boolean zEquals = this.v0.k.equals(bVar);
        if (!zEquals) {
            this.v0 = this.v0.c(bVar);
        }
        adb adbVar = this.v0;
        adbVar.q = xj9Var == null ? adbVar.s : xj9Var.d();
        adb adbVar2 = this.v0;
        adbVar2.r = p(adbVar2.q);
        if ((!zEquals || z) && xj9Var != null && xj9Var.e) {
            w0(xj9Var.g.a, xj9Var.n, xj9Var.o);
        }
    }

    public final void u0() {
        cp3 cp3Var = this.d0;
        cp3Var.f = false;
        wqe wqeVar = cp3Var.a;
        if (wqeVar.b) {
            wqeVar.a(wqeVar.w());
            wqeVar.b = false;
        }
        for (x1d x1dVar : this.a) {
            k kVar = x1dVar.c;
            k kVar2 = x1dVar.a;
            if (x1d.g(kVar2) && kVar2.getState() == 2) {
                kVar2.stop();
            }
            if (kVar != null && kVar.getState() != 0 && kVar.getState() == 2) {
                kVar.stop();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0201  */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [emf] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v22 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [emf] */
    /* JADX WARN: Type inference failed for: r2v15, types: [adb] */
    /* JADX WARN: Type inference failed for: r37v0, types: [androidx.media3.exoplayer.e] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(defpackage.emf r38, boolean r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1125
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.e.v(emf, boolean):void");
    }

    public final void v0() {
        xj9 xj9Var = this.h0.m;
        boolean z = this.C0 || (xj9Var != null && xj9Var.a.d());
        adb adbVar = this.v0;
        if (z != adbVar.g) {
            this.v0 = adbVar.b(z);
        }
    }

    public final void w(androidx.media3.exoplayer.source.g gVar) {
        xj9 xj9Var;
        e eVar;
        h hVar = this.h0;
        xj9 xj9Var2 = hVar.m;
        cp3 cp3Var = this.d0;
        if (xj9Var2 != null && xj9Var2.a == gVar) {
            xj9Var2.getClass();
            if (!xj9Var2.e) {
                float f2 = cp3Var.e().a;
                adb adbVar = this.v0;
                xj9Var2.f(f2, adbVar.a, adbVar.l);
            }
            w0(xj9Var2.g.a, xj9Var2.n, xj9Var2.o);
            if (xj9Var2 == hVar.j) {
                Q(xj9Var2.g.b);
                l(new boolean[this.a.length], hVar.k.e());
                xj9Var2.h = true;
                adb adbVar2 = this.v0;
                h.b bVar = adbVar2.b;
                long j = xj9Var2.g.b;
                eVar = this;
                eVar.v0 = y(bVar, j, adbVar2.c, j, false, 5);
            } else {
                eVar = this;
            }
            eVar.C();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= hVar.r.size()) {
                xj9Var = null;
                break;
            }
            xj9Var = (xj9) hVar.r.get(i);
            if (xj9Var.a == gVar) {
                break;
            } else {
                i++;
            }
        }
        if (xj9Var != null) {
            ka2.q(!xj9Var.e);
            float f3 = cp3Var.e().a;
            adb adbVar3 = this.v0;
            xj9Var.f(f3, adbVar3.a, adbVar3.l);
            xj9 xj9Var3 = hVar.n;
            if (xj9Var3 == null || xj9Var3.a != gVar) {
                return;
            }
            D();
        }
    }

    public final void w0(h.b bVar, xpf xpfVar, gqf gqfVar) {
        h hVar = this.h0;
        xj9 xj9Var = hVar.m;
        xj9Var.getClass();
        xj9 xj9Var2 = hVar.j;
        long j = this.K0;
        long j2 = xj9Var.p;
        if (xj9Var != xj9Var2) {
            j -= j2;
            j2 = xj9Var.g.b;
        }
        long j3 = j - j2;
        long jP = p(xj9Var.d());
        long j4 = r0(this.v0.a, xj9Var.g.a) ? ((so3) this.j0).h : -9223372036854775807L;
        emf emfVar = this.v0.a;
        float f2 = this.d0.e().a;
        boolean z = this.v0.l;
        this.f.j(new f.a(this.l0, emfVar, bVar, j3, jP, f2, this.A0, j4), (p35[]) gqfVar.c);
    }

    public final void x(cdb cdbVar, float f2, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.w0.a(1);
            }
            this.v0 = this.v0.g(cdbVar);
        }
        float f3 = cdbVar.a;
        xj9 xj9Var = this.h0.j;
        while (true) {
            i = 0;
            if (xj9Var == null) {
                break;
            }
            p35[] p35VarArr = (p35[]) xj9Var.o.c;
            int length = p35VarArr.length;
            while (i < length) {
                p35 p35Var = p35VarArr[i];
                if (p35Var != null) {
                    p35Var.h(f3);
                }
                i++;
            }
            xj9Var = xj9Var.m;
        }
        x1d[] x1dVarArr = this.a;
        int length2 = x1dVarArr.length;
        while (i < length2) {
            x1d x1dVar = x1dVarArr[i];
            float f4 = cdbVar.a;
            x1dVar.a.x(f2, f4);
            k kVar = x1dVar.c;
            if (kVar != null) {
                kVar.x(f2, f4);
            }
            i++;
        }
    }

    public final void x0(List list, int i, int i2) throws Throwable {
        this.w0.a(1);
        i iVar = this.i0;
        iVar.getClass();
        ArrayList arrayList = iVar.b;
        ka2.l(i >= 0 && i <= i2 && i2 <= arrayList.size());
        ka2.l(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((i.c) arrayList.get(i3)).a.f((ij9) list.get(i3 - i));
        }
        v(iVar.b(), false);
    }

    public final adb y(h.b bVar, long j, long j2, long j3, boolean z, int i) {
        qyc qycVarF;
        boolean z2;
        this.N0 = (!this.N0 && j == this.v0.s && bVar.equals(this.v0.b)) ? false : true;
        P();
        adb adbVar = this.v0;
        xpf xpfVar = adbVar.h;
        gqf gqfVar = adbVar.i;
        List<js9> list = adbVar.j;
        if (this.i0.k) {
            xj9 xj9Var = this.h0.j;
            xpfVar = xj9Var == null ? xpf.d : xj9Var.n;
            gqfVar = xj9Var == null ? this.e : xj9Var.o;
            p35[] p35VarArr = (p35[]) gqfVar.c;
            e47.a aVar = new e47.a();
            boolean z3 = false;
            for (p35 p35Var : p35VarArr) {
                if (p35Var != null) {
                    js9 js9Var = p35Var.e(0).l;
                    if (js9Var == null) {
                        aVar.c(new js9(new js9.a[0]));
                    } else {
                        aVar.c(js9Var);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                qycVarF = aVar.f();
            } else {
                e47.b bVar2 = e47.b;
                qycVarF = qyc.e;
            }
            list = qycVarF;
            if (xj9Var != null) {
                yj9 yj9Var = xj9Var.g;
                if (yj9Var.c != j2) {
                    xj9Var.g = yj9Var.a(j2);
                }
            }
            x1d[] x1dVarArr = this.a;
            h hVar = this.h0;
            xj9 xj9Var2 = hVar.j;
            if (xj9Var2 == hVar.k && xj9Var2 != null) {
                gqf gqfVar2 = xj9Var2.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= x1dVarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (gqfVar2.c(i2)) {
                        if (x1dVarArr[i2].a.p() != 1) {
                            z2 = false;
                            break;
                        }
                        if (((w1d[]) gqfVar2.b)[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.H0) {
                    this.H0 = z5;
                    if (!z5 && this.v0.p) {
                        this.W.k(2);
                    }
                }
            }
        } else if (!bVar.equals(adbVar.b)) {
            xpfVar = xpf.d;
            gqfVar = this.e;
            list = qyc.e;
        }
        gqf gqfVar3 = gqfVar;
        List<js9> list2 = list;
        xpf xpfVar2 = xpfVar;
        if (z) {
            C0046e c0046e = this.w0;
            if (!c0046e.d || c0046e.e == 5) {
                c0046e.a = true;
                c0046e.d = true;
                c0046e.e = i;
            } else {
                ka2.l(i == 5);
            }
        }
        adb adbVar2 = this.v0;
        return adbVar2.d(bVar, j, j2, j3, p(adbVar2.q), xpfVar2, gqfVar3, list2);
    }

    public final void y0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = 0;
        }
        adb adbVar = this.v0;
        if (adbVar.l == z2 && adbVar.n == i2 && adbVar.m == i3) {
            return;
        }
        this.v0 = adbVar.e(i3, i2, z2);
        B0(false, false);
        h hVar = this.h0;
        for (xj9 xj9Var = hVar.j; xj9Var != null; xj9Var = xj9Var.m) {
            for (p35 p35Var : (p35[]) xj9Var.o.c) {
                if (p35Var != null) {
                    p35Var.n(z2);
                }
            }
        }
        if (!q0()) {
            u0();
            z0();
            adb adbVar2 = this.v0;
            if (adbVar2.p) {
                this.v0 = adbVar2.i(false);
            }
            hVar.n(this.K0);
            return;
        }
        int i4 = this.v0.e;
        sf6 sf6Var = this.W;
        if (i4 != 3) {
            if (i4 == 2) {
                sf6Var.k(2);
                return;
            }
            return;
        }
        cp3 cp3Var = this.d0;
        cp3Var.f = true;
        wqe wqeVar = cp3Var.a;
        if (!wqeVar.b) {
            wqeVar.d = wqeVar.a.d();
            wqeVar.b = true;
        }
        s0();
        sf6Var.k(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z0() {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.e.z0():void");
    }
}
