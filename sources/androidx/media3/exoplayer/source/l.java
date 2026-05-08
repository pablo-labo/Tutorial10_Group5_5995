package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.source.g;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.o;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import defpackage.aj6;
import defpackage.ayd;
import defpackage.br6;
import defpackage.dhb;
import defpackage.dq1;
import defpackage.dr6;
import defpackage.gf3;
import defpackage.hn3;
import defpackage.ia7;
import defpackage.js9;
import defpackage.ka2;
import defpackage.l3c;
import defpackage.m55;
import defpackage.nn2;
import defpackage.o55;
import defpackage.ote;
import defpackage.p35;
import defpackage.p4;
import defpackage.qk3;
import defpackage.ql0;
import defpackage.qr3;
import defpackage.rjd;
import defpackage.sn2;
import defpackage.st9;
import defpackage.u0a;
import defpackage.u54;
import defpackage.uz8;
import defpackage.vjg;
import defpackage.wpf;
import defpackage.x71;
import defpackage.xpf;
import defpackage.yyc;
import defpackage.zkd;
import defpackage.zpf;
import defpackage.zxd;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class l implements g, o55, Loader.a<a>, Loader.e, o.c {
    public static final Map<String, String> F0;
    public static final androidx.media3.common.a G0;
    public long A0;
    public boolean B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public final m V;
    public final qk3 W;
    public final String X;
    public final long Y;
    public final androidx.media3.common.a Z;
    public final Uri a;
    public final long a0;
    public final androidx.media3.datasource.a b;
    public final Loader b0;
    public final androidx.media3.exoplayer.drm.b c;
    public final dq1 c0;
    public final androidx.media3.exoplayer.upstream.b d;
    public final sn2 d0;
    public final i.a e;
    public final p4 e0;
    public final a.C0043a f;
    public final aj6 f0;
    public final Handler g0;
    public g.a h0;
    public dr6 i0;
    public o[] j0;
    public c[] k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public d p0;
    public zxd q0;
    public long r0;
    public boolean s0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public int x0;
    public boolean y0;
    public long z0;

    public final class a implements Loader.d {
        public final Uri a;
        public final ote b;
        public final k c;
        public final l d;
        public final sn2 e;
        public volatile boolean g;
        public long i;
        public gf3 j;
        public zpf k;
        public boolean l;
        public final dhb f = new dhb();
        public boolean h = true;

        public a(Uri uri, androidx.media3.datasource.a aVar, dq1 dq1Var, l lVar, sn2 sn2Var) {
            this.a = uri;
            this.b = new ote(aVar);
            this.c = dq1Var;
            this.d = lVar;
            this.e = sn2Var;
            uz8.c.getAndIncrement();
            this.j = c(0L);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.d
        public final void a() {
            androidx.media3.datasource.a br6Var;
            m55 m55Var;
            int i;
            int iB = 0;
            while (iB == 0 && !this.g) {
                try {
                    long j = this.f.a;
                    gf3 gf3VarC = c(j);
                    this.j = gf3VarC;
                    long jB = this.b.b(gf3VarC);
                    if (this.g) {
                        if (iB != 1 && ((dq1) this.c).a() != -1) {
                            this.f.a = ((dq1) this.c).a();
                        }
                        nn2.i(this.b);
                        return;
                    }
                    if (jB != -1) {
                        jB += j;
                        l lVar = l.this;
                        lVar.g0.post(new qr3(lVar, 4));
                    }
                    long j2 = jB;
                    l.this.i0 = dr6.d(this.b.a.e());
                    ote oteVar = this.b;
                    dr6 dr6Var = l.this.i0;
                    if (dr6Var == null || (i = dr6Var.f) == -1) {
                        br6Var = oteVar;
                    } else {
                        br6Var = new br6(oteVar, i, this);
                        zpf zpfVarD = l.this.D(new c(0, true));
                        this.k = zpfVarD;
                        zpfVarD.d(l.G0);
                    }
                    ((dq1) this.c).b(br6Var, this.a, this.b.a.e(), j, j2, this.d);
                    if (l.this.i0 != null && (m55Var = ((dq1) this.c).b) != null) {
                        m55 m55VarF = m55Var.f();
                        if (m55VarF instanceof u0a) {
                            ((u0a) m55VarF).r = true;
                        }
                    }
                    if (this.h) {
                        k kVar = this.c;
                        long j3 = this.i;
                        m55 m55Var2 = ((dq1) kVar).b;
                        m55Var2.getClass();
                        m55Var2.d(j, j3);
                        this.h = false;
                    }
                    while (iB == 0 && !this.g) {
                        try {
                            this.e.a();
                            k kVar2 = this.c;
                            dhb dhbVar = this.f;
                            dq1 dq1Var = (dq1) kVar2;
                            m55 m55Var3 = dq1Var.b;
                            m55Var3.getClass();
                            hn3 hn3Var = dq1Var.c;
                            hn3Var.getClass();
                            iB = m55Var3.b(hn3Var, dhbVar);
                            long jA = ((dq1) this.c).a();
                            if (jA > l.this.Y + j) {
                                sn2 sn2Var = this.e;
                                synchronized (sn2Var) {
                                    sn2Var.b = false;
                                }
                                l lVar2 = l.this;
                                lVar2.g0.post(lVar2.f0);
                                j = jA;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iB == 1) {
                        iB = 0;
                    } else if (((dq1) this.c).a() != -1) {
                        this.f.a = ((dq1) this.c).a();
                    }
                    nn2.i(this.b);
                } catch (Throwable th) {
                    if (iB != 1 && ((dq1) this.c).a() != -1) {
                        this.f.a = ((dq1) this.c).a();
                    }
                    nn2.i(this.b);
                    throw th;
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.d
        public final void b() {
            this.g = true;
        }

        public final gf3 c(long j) {
            Map map = Collections.EMPTY_MAP;
            String str = l.this.X;
            Map<String, String> map2 = l.F0;
            Uri uri = this.a;
            ka2.s(uri, "The uri must be set.");
            return new gf3(uri, 0L, 1, null, map2, j, -1L, str, 6);
        }
    }

    public final class b implements rjd {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        @Override // defpackage.rjd
        public final void a() throws IOException {
            int i = this.a;
            l lVar = l.this;
            lVar.j0[i].y();
            Loader loader = lVar.b0;
            int iB = lVar.d.b(lVar.t0);
            IOException iOException = loader.c;
            if (iOException != null) {
                throw iOException;
            }
            Loader.c<? extends Loader.d> cVar = loader.b;
            if (cVar != null) {
                if (iB == Integer.MIN_VALUE) {
                    iB = cVar.a;
                }
                IOException iOException2 = cVar.e;
                if (iOException2 != null && cVar.f > iB) {
                    throw iOException2;
                }
            }
        }

        @Override // defpackage.rjd
        public final boolean b() {
            l lVar = l.this;
            return !lVar.G() && lVar.j0[this.a].w(lVar.D0);
        }

        @Override // defpackage.rjd
        public final int m(long j) throws Throwable {
            l lVar = l.this;
            if (lVar.G()) {
                return 0;
            }
            int i = this.a;
            lVar.B(i);
            o oVar = lVar.j0[i];
            int iU = oVar.u(j, lVar.D0);
            oVar.F(iU);
            if (iU == 0) {
                lVar.C(i);
            }
            return iU;
        }

        @Override // defpackage.rjd
        public final int o(ql0 ql0Var, DecoderInputBuffer decoderInputBuffer, int i) {
            l lVar = l.this;
            if (lVar.G()) {
                return -3;
            }
            int i2 = this.a;
            lVar.B(i2);
            int iB = lVar.j0[i2].B(ql0Var, decoderInputBuffer, i, lVar.D0);
            if (iB == -3) {
                lVar.C(i2);
            }
            return iB;
        }
    }

    public static final class c {
        public final int a;
        public final boolean b;

        public c(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return (this.a * 31) + (this.b ? 1 : 0);
        }
    }

    public static final class d {
        public final xpf a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public d(xpf xpfVar, boolean[] zArr) {
            this.a = xpfVar;
            this.b = zArr;
            int i = xpfVar.a;
            this.c = new boolean[i];
            this.d = new boolean[i];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        F0 = Collections.unmodifiableMap(map);
        a.C0036a c0036a = new a.C0036a();
        c0036a.a = "icy";
        c0036a.m = st9.p("application/x-icy");
        G0 = new androidx.media3.common.a(c0036a);
    }

    public l(Uri uri, androidx.media3.datasource.a aVar, dq1 dq1Var, androidx.media3.exoplayer.drm.b bVar, a.C0043a c0043a, androidx.media3.exoplayer.upstream.b bVar2, i.a aVar2, m mVar, qk3 qk3Var, String str, int i, androidx.media3.common.a aVar3, long j, yyc yycVar) {
        this.a = uri;
        this.b = aVar;
        this.c = bVar;
        this.f = c0043a;
        this.d = bVar2;
        this.e = aVar2;
        this.V = mVar;
        this.W = qk3Var;
        this.X = str;
        this.Y = i;
        this.Z = aVar3;
        this.b0 = yycVar != null ? new Loader(yycVar) : new Loader("ProgressiveMediaPeriod");
        this.c0 = dq1Var;
        this.a0 = j;
        this.d0 = new sn2();
        this.e0 = new p4(this, 2);
        this.f0 = new aj6(this, 4);
        this.g0 = vjg.p(null);
        this.k0 = new c[0];
        this.j0 = new o[0];
        this.A0 = -9223372036854775807L;
        this.t0 = 1;
    }

    public final void A() {
        long j = this.a0;
        if (this.E0 || this.m0 || !this.l0 || this.q0 == null) {
            return;
        }
        for (o oVar : this.j0) {
            if (oVar.v() == null) {
                return;
            }
        }
        sn2 sn2Var = this.d0;
        synchronized (sn2Var) {
            sn2Var.b = false;
        }
        int length = this.j0.length;
        wpf[] wpfVarArr = new wpf[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            androidx.media3.common.a aVarV = this.j0[i].v();
            aVarV.getClass();
            String str = aVarV.n;
            boolean zK = st9.k(str);
            boolean z = zK || st9.o(str);
            zArr[i] = z;
            this.n0 = z | this.n0;
            this.o0 = j != -9223372036854775807L && length == 1 && st9.m(str);
            dr6 dr6Var = this.i0;
            if (dr6Var != null) {
                int i2 = dr6Var.a;
                if (zK || this.k0[i].b) {
                    js9 js9Var = aVarV.l;
                    js9 js9Var2 = js9Var == null ? new js9(dr6Var) : js9Var.a(dr6Var);
                    a.C0036a c0036aA = aVarV.a();
                    c0036aA.k = js9Var2;
                    aVarV = new androidx.media3.common.a(c0036aA);
                }
                if (zK && aVarV.h == -1 && aVarV.i == -1 && i2 != -1) {
                    a.C0036a c0036aA2 = aVarV.a();
                    c0036aA2.h = i2;
                    aVarV = new androidx.media3.common.a(c0036aA2);
                }
            }
            int iC = this.c.c(aVarV);
            a.C0036a c0036aA3 = aVarV.a();
            c0036aA3.N = iC;
            androidx.media3.common.a aVar = new androidx.media3.common.a(c0036aA3);
            wpfVarArr[i] = new wpf(Integer.toString(i), aVar);
            this.w0 = aVar.t | this.w0;
        }
        this.p0 = new d(new xpf(wpfVarArr), zArr);
        if (this.o0 && this.r0 == -9223372036854775807L) {
            this.r0 = j;
            this.q0 = new l3c(this, this.q0);
        }
        this.V.x(this.r0, this.q0, this.s0);
        this.m0 = true;
        g.a aVar2 = this.h0;
        aVar2.getClass();
        aVar2.a(this);
    }

    public final void B(int i) {
        w();
        d dVar = this.p0;
        boolean[] zArr = dVar.d;
        if (zArr[i]) {
            return;
        }
        androidx.media3.common.a aVar = dVar.a.a(i).d[0];
        this.e.b(st9.i(aVar.n), aVar, 0, null, this.z0);
        zArr[i] = true;
    }

    public final void C(int i) {
        w();
        if (this.B0) {
            if ((!this.n0 || this.p0.b[i]) && !this.j0[i].w(false)) {
                this.A0 = 0L;
                this.B0 = false;
                this.v0 = true;
                this.z0 = 0L;
                this.C0 = 0;
                for (o oVar : this.j0) {
                    oVar.C(false);
                }
                g.a aVar = this.h0;
                aVar.getClass();
                aVar.b(this);
            }
        }
    }

    public final zpf D(c cVar) {
        int length = this.j0.length;
        for (int i = 0; i < length; i++) {
            if (cVar.equals(this.k0[i])) {
                return this.j0[i];
            }
        }
        if (this.l0) {
            zkd.T("ProgressiveMediaPeriod", "Extractor added new track (id=" + cVar.a + ") after finishing tracks.");
            return new u54();
        }
        androidx.media3.exoplayer.drm.b bVar = this.c;
        bVar.getClass();
        o oVar = new o(this.W, bVar, this.f);
        oVar.f = this;
        int i2 = length + 1;
        c[] cVarArr = (c[]) Arrays.copyOf(this.k0, i2);
        cVarArr[length] = cVar;
        String str = vjg.a;
        this.k0 = cVarArr;
        o[] oVarArr = (o[]) Arrays.copyOf(this.j0, i2);
        oVarArr[length] = oVar;
        this.j0 = oVarArr;
        return oVar;
    }

    public final void E(zxd zxdVar) {
        this.q0 = this.i0 == null ? zxdVar : new zxd.b(-9223372036854775807L);
        this.r0 = zxdVar.k();
        boolean z = !this.y0 && zxdVar.k() == -9223372036854775807L;
        this.s0 = z;
        this.t0 = z ? 7 : 1;
        if (this.m0) {
            this.V.x(this.r0, zxdVar, z);
        } else {
            A();
        }
    }

    public final void F() {
        a aVar = new a(this.a, this.b, this.c0, this, this.d0);
        if (this.m0) {
            ka2.q(z());
            long j = this.r0;
            if (j != -9223372036854775807L && this.A0 > j) {
                this.D0 = true;
                this.A0 = -9223372036854775807L;
                return;
            }
            zxd zxdVar = this.q0;
            zxdVar.getClass();
            long j2 = zxdVar.e(this.A0).a.b;
            long j3 = this.A0;
            aVar.f.a = j2;
            aVar.i = j3;
            aVar.h = true;
            aVar.l = false;
            for (o oVar : this.j0) {
                oVar.t = this.A0;
            }
            this.A0 = -9223372036854775807L;
        }
        this.C0 = x();
        this.b0.f(aVar, this, this.d.b(this.t0));
    }

    public final boolean G() {
        return this.v0 || z();
    }

    @Override // androidx.media3.exoplayer.source.o.c
    public final void a() {
        this.g0.post(this.e0);
    }

    @Override // defpackage.o55
    public final void b(zxd zxdVar) {
        this.g0.post(new x71(3, this, zxdVar));
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long c(long j, ayd aydVar) {
        w();
        if (!this.q0.h()) {
            return 0L;
        }
        zxd.a aVarE = this.q0.e(j);
        return aydVar.a(j, aVarE.a.a, aVarE.b.a);
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean d() {
        boolean z;
        if (!this.b0.d()) {
            return false;
        }
        sn2 sn2Var = this.d0;
        synchronized (sn2Var) {
            z = sn2Var.b;
        }
        return z;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean e(androidx.media3.exoplayer.g gVar) {
        if (this.D0) {
            return false;
        }
        Loader loader = this.b0;
        if (loader.c() || this.B0) {
            return false;
        }
        if ((this.m0 || this.Z != null) && this.x0 == 0) {
            return false;
        }
        boolean zD = this.d0.d();
        if (loader.d()) {
            return zD;
        }
        F();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long f(p35[] p35VarArr, boolean[] zArr, rjd[] rjdVarArr, boolean[] zArr2, long j) {
        p35 p35Var;
        w();
        d dVar = this.p0;
        xpf xpfVar = dVar.a;
        boolean[] zArr3 = dVar.c;
        int i = this.x0;
        int i2 = 0;
        for (int i3 = 0; i3 < p35VarArr.length; i3++) {
            rjd rjdVar = rjdVarArr[i3];
            if (rjdVar != null && (p35VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((b) rjdVar).a;
                ka2.q(zArr3[i4]);
                this.x0--;
                zArr3[i4] = false;
                rjdVarArr[i3] = null;
            }
        }
        boolean z = !this.u0 ? j == 0 || this.o0 : i != 0;
        for (int i5 = 0; i5 < p35VarArr.length; i5++) {
            if (rjdVarArr[i5] == null && (p35Var = p35VarArr[i5]) != null) {
                ka2.q(p35Var.length() == 1);
                ka2.q(p35Var.f(0) == 0);
                int iB = xpfVar.b(p35Var.m());
                ka2.q(!zArr3[iB]);
                this.x0++;
                zArr3[iB] = true;
                this.w0 = p35Var.q().t | this.w0;
                rjdVarArr[i5] = new b(iB);
                zArr2[i5] = true;
                if (!z) {
                    o oVar = this.j0[iB];
                    z = (oVar.s() == 0 || oVar.E(j, true)) ? false : true;
                }
            }
        }
        if (this.x0 == 0) {
            this.B0 = false;
            this.v0 = false;
            this.w0 = false;
            Loader loader = this.b0;
            if (loader.d()) {
                o[] oVarArr = this.j0;
                int length = oVarArr.length;
                while (i2 < length) {
                    oVarArr[i2].j();
                    i2++;
                }
                loader.b();
            } else {
                this.D0 = false;
                for (o oVar2 : this.j0) {
                    oVar2.C(false);
                }
            }
        } else if (z) {
            j = i(j);
            while (i2 < rjdVarArr.length) {
                if (rjdVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.u0 = true;
        return j;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final Loader.b g(Loader.d dVar, long j, long j2, IOException iOException, int i) {
        Loader.b bVar;
        zxd zxdVar;
        a aVar = (a) dVar;
        ote oteVar = aVar.b;
        Uri uri = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        vjg.c0(aVar.i);
        vjg.c0(this.r0);
        long jA = this.d.a(new b.c(iOException, i));
        if (jA == -9223372036854775807L) {
            bVar = Loader.f;
        } else {
            int iX = x();
            int i2 = iX > this.C0 ? 1 : 0;
            if (this.y0 || !((zxdVar = this.q0) == null || zxdVar.k() == -9223372036854775807L)) {
                this.C0 = iX;
            } else if (!this.m0 || G()) {
                this.v0 = this.m0;
                this.z0 = 0L;
                this.C0 = 0;
                for (o oVar : this.j0) {
                    oVar.C(false);
                }
                aVar.f.a = 0L;
                aVar.i = 0L;
                aVar.h = true;
                aVar.l = false;
            } else {
                this.B0 = true;
                bVar = Loader.e;
            }
            bVar = new Loader.b(i2, jA);
        }
        this.e.e(uz8Var, 1, -1, null, 0, null, aVar.i, this.r0, iOException, !bVar.a());
        return bVar;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long h() {
        return s();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    @Override // androidx.media3.exoplayer.source.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long i(long r10) {
        /*
            r9 = this;
            r9.w()
            androidx.media3.exoplayer.source.l$d r0 = r9.p0
            boolean[] r0 = r0.b
            zxd r1 = r9.q0
            boolean r1 = r1.h()
            if (r1 == 0) goto L10
            goto L12
        L10:
            r10 = 0
        L12:
            r1 = 0
            r9.v0 = r1
            long r2 = r9.z0
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L1e
            r2 = r3
            goto L1f
        L1e:
            r2 = r1
        L1f:
            r9.z0 = r10
            boolean r4 = r9.z()
            if (r4 == 0) goto L2a
            r9.A0 = r10
            return r10
        L2a:
            int r4 = r9.t0
            r5 = 7
            androidx.media3.exoplayer.upstream.Loader r6 = r9.b0
            if (r4 == r5) goto L71
            boolean r4 = r9.D0
            if (r4 != 0) goto L3b
            boolean r4 = r6.d()
            if (r4 == 0) goto L71
        L3b:
            androidx.media3.exoplayer.source.o[] r4 = r9.j0
            int r4 = r4.length
            r5 = r1
        L3f:
            if (r5 >= r4) goto L6e
            androidx.media3.exoplayer.source.o[] r7 = r9.j0
            r7 = r7[r5]
            int r8 = r7.s()
            if (r8 != 0) goto L4e
            if (r2 == 0) goto L4e
            goto L6b
        L4e:
            boolean r8 = r9.o0
            if (r8 == 0) goto L59
            int r8 = r7.q
            boolean r7 = r7.D(r8)
            goto L5f
        L59:
            boolean r8 = r9.D0
            boolean r7 = r7.E(r10, r8)
        L5f:
            if (r7 != 0) goto L6b
            boolean r7 = r0[r5]
            if (r7 != 0) goto L69
            boolean r7 = r9.n0
            if (r7 != 0) goto L6b
        L69:
            r3 = r1
            goto L6e
        L6b:
            int r5 = r5 + 1
            goto L3f
        L6e:
            if (r3 == 0) goto L71
            goto La1
        L71:
            r9.B0 = r1
            r9.A0 = r10
            r9.D0 = r1
            r9.w0 = r1
            boolean r0 = r6.d()
            if (r0 == 0) goto L90
            androidx.media3.exoplayer.source.o[] r9 = r9.j0
            int r0 = r9.length
        L82:
            if (r1 >= r0) goto L8c
            r2 = r9[r1]
            r2.j()
            int r1 = r1 + 1
            goto L82
        L8c:
            r6.b()
            return r10
        L90:
            r0 = 0
            r6.c = r0
            androidx.media3.exoplayer.source.o[] r9 = r9.j0
            int r0 = r9.length
            r2 = r1
        L97:
            if (r2 >= r0) goto La1
            r3 = r9[r2]
            r3.C(r1)
            int r2 = r2 + 1
            goto L97
        La1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.l.i(long):long");
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long j() {
        if (this.w0) {
            this.w0 = false;
            return this.z0;
        }
        if (!this.v0) {
            return -9223372036854775807L;
        }
        if (!this.D0 && x() <= this.C0) {
            return -9223372036854775807L;
        }
        this.v0 = false;
        return this.z0;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void k() {
        for (o oVar : this.j0) {
            oVar.C(true);
            DrmSession drmSession = oVar.h;
            if (drmSession != null) {
                drmSession.f(oVar.e);
                oVar.h = null;
                oVar.g = null;
            }
        }
        dq1 dq1Var = this.c0;
        m55 m55Var = dq1Var.b;
        if (m55Var != null) {
            m55Var.release();
            dq1Var.b = null;
        }
        dq1Var.c = null;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void l() throws IOException {
        int iB = this.d.b(this.t0);
        Loader loader = this.b0;
        IOException iOException = loader.c;
        if (iOException != null) {
            throw iOException;
        }
        Loader.c<? extends Loader.d> cVar = loader.b;
        if (cVar != null) {
            if (iB == Integer.MIN_VALUE) {
                iB = cVar.a;
            }
            IOException iOException2 = cVar.e;
            if (iOException2 != null && cVar.f > iB) {
                throw iOException2;
            }
        }
        if (this.D0 && !this.m0) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // defpackage.o55
    public final void m() {
        this.l0 = true;
        this.g0.post(this.e0);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void n(Loader.d dVar, long j, long j2, int i) {
        uz8 uz8Var;
        a aVar = (a) dVar;
        ote oteVar = aVar.b;
        if (i == 0) {
            uz8Var = new uz8(aVar.j);
        } else {
            Uri uri = oteVar.c;
            uz8Var = new uz8(j2, oteVar.d);
        }
        this.e.g(uz8Var, 1, -1, null, 0, null, aVar.i, this.r0, i);
    }

    @Override // defpackage.o55
    public final zpf o(int i, int i2) {
        return D(new c(i, false));
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void p(g.a aVar, long j) {
        this.h0 = aVar;
        androidx.media3.common.a aVar2 = this.Z;
        if (aVar2 == null) {
            this.d0.d();
            F();
        } else {
            o(0, 3).d(aVar2);
            E(new ia7(-9223372036854775807L, new long[]{0}, new long[]{0}));
            m();
            this.A0 = j;
        }
    }

    @Override // androidx.media3.exoplayer.source.g
    public final xpf q() {
        w();
        return this.p0.a;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void r(Loader.d dVar, long j, long j2) {
        a aVar = (a) dVar;
        if (this.r0 == -9223372036854775807L && this.q0 != null) {
            long jY = y(true);
            long j3 = jY == Long.MIN_VALUE ? 0L : jY + 10000;
            this.r0 = j3;
            this.V.x(j3, this.q0, this.s0);
        }
        ote oteVar = aVar.b;
        Uri uri = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        this.d.getClass();
        this.e.d(uz8Var, 1, -1, null, 0, null, aVar.i, this.r0);
        this.D0 = true;
        g.a aVar2 = this.h0;
        aVar2.getClass();
        aVar2.b(this);
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long s() {
        long jY;
        boolean z;
        w();
        if (this.D0 || this.x0 == 0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.A0;
        }
        if (this.n0) {
            int length = this.j0.length;
            jY = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                d dVar = this.p0;
                if (dVar.b[i] && dVar.c[i]) {
                    o oVar = this.j0[i];
                    synchronized (oVar) {
                        z = oVar.w;
                    }
                    if (!z) {
                        jY = Math.min(jY, this.j0[i].p());
                    }
                }
            }
        } else {
            jY = Long.MAX_VALUE;
        }
        if (jY == Long.MAX_VALUE) {
            jY = y(false);
        }
        return jY == Long.MIN_VALUE ? this.z0 : jY;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void t(long j, boolean z) {
        if (this.o0) {
            return;
        }
        w();
        if (z()) {
            return;
        }
        boolean[] zArr = this.p0.c;
        int length = this.j0.length;
        for (int i = 0; i < length; i++) {
            this.j0[i].i(j, z, zArr[i]);
        }
    }

    @Override // androidx.media3.exoplayer.source.p
    public final void u(long j) {
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void v(Loader.d dVar, long j, long j2, boolean z) {
        a aVar = (a) dVar;
        ote oteVar = aVar.b;
        Uri uri = oteVar.c;
        uz8 uz8Var = new uz8(j2, oteVar.d);
        this.d.getClass();
        this.e.c(uz8Var, 1, -1, null, 0, null, aVar.i, this.r0);
        if (z) {
            return;
        }
        for (o oVar : this.j0) {
            oVar.C(false);
        }
        if (this.x0 > 0) {
            g.a aVar2 = this.h0;
            aVar2.getClass();
            aVar2.b(this);
        }
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void w() {
        ka2.q(this.m0);
        this.p0.getClass();
        this.q0.getClass();
    }

    public final int x() {
        int i = 0;
        for (o oVar : this.j0) {
            i += oVar.q + oVar.p;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long y(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            androidx.media3.exoplayer.source.o[] r3 = r5.j0
            int r3 = r3.length
            if (r2 >= r3) goto L24
            if (r6 != 0) goto L15
            androidx.media3.exoplayer.source.l$d r3 = r5.p0
            r3.getClass()
            boolean[] r3 = r3.c
            boolean r3 = r3[r2]
            if (r3 == 0) goto L21
        L15:
            androidx.media3.exoplayer.source.o[] r3 = r5.j0
            r3 = r3[r2]
            long r3 = r3.p()
            long r0 = java.lang.Math.max(r0, r3)
        L21:
            int r2 = r2 + 1
            goto L3
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.l.y(boolean):long");
    }

    public final boolean z() {
        return this.A0 != -9223372036854775807L;
    }
}
