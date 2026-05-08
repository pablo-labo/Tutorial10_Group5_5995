package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.StreamKey;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.hls.playlist.a;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.source.a;
import androidx.media3.exoplayer.source.g;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.c;
import defpackage.ac5;
import defpackage.an3;
import defpackage.ao3;
import defpackage.bj6;
import defpackage.e47;
import defpackage.ee3;
import defpackage.g7;
import defpackage.gf3;
import defpackage.grf;
import defpackage.ij9;
import defpackage.jj9;
import defpackage.ka2;
import defpackage.ojh;
import defpackage.qk3;
import defpackage.qq3;
import defpackage.ri6;
import defpackage.sdb;
import defpackage.ti6;
import defpackage.vjg;
import defpackage.wi6;
import defpackage.xge;
import defpackage.yi6;
import defpackage.yn3;
import defpackage.zn3;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource extends a {
    public final ti6 h;
    public final yn3 i;
    public final ee3 j;
    public final b k;
    public final androidx.media3.exoplayer.upstream.b l;
    public final boolean m;
    public final int n;
    public final androidx.media3.exoplayer.hls.playlist.a o;
    public final long p;
    public ij9.e q;
    public grf r;
    public ij9 s;

    public static final class Factory implements h.a {
        public final yn3 a;
        public zn3 b;
        public qq3 c;
        public final an3 h = new an3();
        public final ao3 e = new ao3();
        public final g7 f = androidx.media3.exoplayer.hls.playlist.a.d0;
        public final androidx.media3.exoplayer.upstream.a i = new androidx.media3.exoplayer.upstream.a();
        public final ee3 g = new ee3(16);
        public final int k = 1;
        public final long l = -9223372036854775807L;
        public final boolean j = true;
        public boolean d = true;

        public Factory(a.InterfaceC0038a interfaceC0038a) {
            this.a = new yn3(interfaceC0038a);
        }

        @Override // androidx.media3.exoplayer.source.h.a
        public final h a(ij9 ij9Var) {
            ij9Var.b.getClass();
            if (this.b == null) {
                zn3 zn3Var = new zn3();
                zn3Var.a = new qq3();
                this.b = zn3Var;
            }
            qq3 qq3Var = this.c;
            if (qq3Var != null) {
                this.b.a = qq3Var;
            }
            zn3 zn3Var2 = this.b;
            zn3Var2.b = this.d;
            List<StreamKey> list = ij9Var.b.e;
            boolean zIsEmpty = list.isEmpty();
            ao3 ao3Var = this.e;
            yi6 ac5Var = ao3Var;
            if (!zIsEmpty) {
                ac5Var = new ac5(ao3Var, list);
            }
            b bVarB = this.h.b(ij9Var);
            this.f.getClass();
            yn3 yn3Var = this.a;
            androidx.media3.exoplayer.upstream.a aVar = this.i;
            return new HlsMediaSource(ij9Var, yn3Var, zn3Var2, this.g, bVarB, aVar, new androidx.media3.exoplayer.hls.playlist.a(yn3Var, aVar, ac5Var), this.l, this.j, this.k);
        }

        @Override // androidx.media3.exoplayer.source.h.a
        public final void b(qq3 qq3Var) {
            this.c = qq3Var;
        }

        @Override // androidx.media3.exoplayer.source.h.a
        @Deprecated
        public final void c(boolean z) {
            this.d = z;
        }

        @Override // androidx.media3.exoplayer.source.h.a
        public final void d() {
        }
    }

    static {
        jj9.a("media3.exoplayer.hls");
    }

    public HlsMediaSource(ij9 ij9Var, yn3 yn3Var, zn3 zn3Var, ee3 ee3Var, b bVar, androidx.media3.exoplayer.upstream.a aVar, androidx.media3.exoplayer.hls.playlist.a aVar2, long j, boolean z, int i) {
        this.s = ij9Var;
        this.q = ij9Var.c;
        this.i = yn3Var;
        this.h = zn3Var;
        this.j = ee3Var;
        this.k = bVar;
        this.l = aVar;
        this.o = aVar2;
        this.p = j;
        this.m = z;
        this.n = i;
    }

    public static b.c w(long j, List list) {
        b.c cVar = null;
        for (int i = 0; i < list.size(); i++) {
            b.c cVar2 = (b.c) list.get(i);
            long j2 = cVar2.e;
            if (j2 > j || !cVar2.a0) {
                if (j2 > j) {
                    break;
                }
            } else {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final boolean a(ij9 ij9Var) {
        ij9 ij9VarD = d();
        ij9.f fVar = ij9VarD.b;
        fVar.getClass();
        ij9.f fVar2 = ij9Var.b;
        return fVar2 != null && fVar2.a.equals(fVar.a) && fVar2.e.equals(fVar.e) && Objects.equals(fVar2.c, fVar.c) && ij9VarD.c.equals(ij9Var.c);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final synchronized ij9 d() {
        return this.s;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final synchronized void f(ij9 ij9Var) {
        this.s = ij9Var;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void h(g gVar) {
        wi6 wi6Var = (wi6) gVar;
        wi6Var.b.j(wi6Var);
        for (bj6 bj6Var : wi6Var.i0) {
            if (bj6Var.s0) {
                for (bj6.b bVar : bj6Var.k0) {
                    bVar.j();
                    DrmSession drmSession = bVar.h;
                    if (drmSession != null) {
                        drmSession.f(bVar.e);
                        bVar.h = null;
                        bVar.g = null;
                    }
                }
            }
            ri6 ri6Var = bj6Var.d;
            ri6Var.g.a(ri6Var.e[ri6Var.r.p()]);
            ri6Var.n = null;
            bj6Var.Y.e(bj6Var);
            bj6Var.g0.removeCallbacksAndMessages(null);
            bj6Var.w0 = true;
            bj6Var.h0.clear();
        }
        wi6Var.f0 = null;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void m() throws IOException {
        androidx.media3.exoplayer.hls.playlist.a aVar = this.o;
        Loader loader = aVar.V;
        if (loader != null) {
            loader.a();
        }
        Uri uri = aVar.Z;
        if (uri != null) {
            aVar.b(uri);
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final g o(h.b bVar, qk3 qk3Var, long j) {
        i.a aVarQ = q(bVar);
        a.C0043a c0043a = new a.C0043a(this.d.c, 0, bVar);
        grf grfVar = this.r;
        sdb sdbVar = this.g;
        ka2.r(sdbVar);
        return new wi6(this.h, this.o, this.i, grfVar, this.k, c0043a, this.l, aVarQ, qk3Var, this.j, this.m, this.n, sdbVar);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void t(grf grfVar) {
        this.r = grfVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        sdb sdbVar = this.g;
        ka2.r(sdbVar);
        androidx.media3.exoplayer.drm.b bVar = this.k;
        bVar.a(looperMyLooper, sdbVar);
        bVar.f();
        i.a aVarQ = q(null);
        ij9.f fVar = d().b;
        fVar.getClass();
        Uri uri = fVar.a;
        androidx.media3.exoplayer.hls.playlist.a aVar = this.o;
        aVar.getClass();
        aVar.W = vjg.p(null);
        aVar.f = aVarQ;
        aVar.X = this;
        Map map = Collections.EMPTY_MAP;
        ka2.s(uri, "The uri must be set.");
        c cVar = new c(aVar.a.a.a(), new gf3(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, aVar.b.a());
        ka2.q(aVar.V == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        aVar.V = loader;
        loader.f(cVar, aVar, aVar.c.b(cVar.c));
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void v() {
        androidx.media3.exoplayer.hls.playlist.a aVar = this.o;
        aVar.Z = null;
        aVar.a0 = null;
        aVar.Y = null;
        aVar.c0 = -9223372036854775807L;
        aVar.V.e(null);
        aVar.V = null;
        HashMap<Uri, a.b> map = aVar.d;
        Iterator<a.b> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().b.e(null);
        }
        aVar.W.removeCallbacksAndMessages(null);
        aVar.W = null;
        map.clear();
        this.k.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(androidx.media3.exoplayer.hls.playlist.b bVar) {
        long j;
        xge xgeVar;
        long j2;
        long jO;
        long j3;
        boolean z = bVar.p;
        boolean z2 = bVar.g;
        e47 e47Var = bVar.r;
        long j4 = bVar.u;
        long jO2 = bVar.e;
        int i = bVar.d;
        long j5 = bVar.h;
        long jC0 = z ? vjg.c0(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jC0 : -9223372036854775807L;
        androidx.media3.exoplayer.hls.playlist.a aVar = this.o;
        aVar.Y.getClass();
        ojh ojhVar = new ojh(13);
        long j7 = 0;
        if (aVar.b0) {
            b.g gVar = bVar.v;
            long j8 = j5 - aVar.c0;
            boolean z3 = bVar.o;
            long j9 = z3 ? j8 + j4 : -9223372036854775807L;
            long jO3 = bVar.p ? vjg.O(vjg.A(this.p)) - (j5 + j4) : 0L;
            long j10 = this.q.a;
            if (j10 != -9223372036854775807L) {
                jO = vjg.O(j10);
            } else {
                if (jO2 != -9223372036854775807L) {
                    j2 = j4 - jO2;
                } else {
                    j2 = gVar.d;
                    if (j2 == -9223372036854775807L || bVar.n == -9223372036854775807L) {
                        j2 = gVar.c;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * bVar.m;
                        }
                    }
                }
                jO = j2 + jO3;
            }
            long j11 = j4 + jO3;
            long j12 = vjg.j(jO, jO3, j11);
            ij9.e eVar = d().c;
            boolean z4 = eVar.d == -3.4028235E38f && eVar.e == -3.4028235E38f && gVar.c == -9223372036854775807L && gVar.d == -9223372036854775807L;
            ij9.e.a aVar2 = new ij9.e.a();
            aVar2.a = vjg.c0(j12);
            aVar2.d = z4 ? 1.0f : this.q.d;
            aVar2.e = z4 ? 1.0f : this.q.e;
            ij9.e eVar2 = new ij9.e(aVar2);
            this.q = eVar2;
            if (jO2 == -9223372036854775807L) {
                jO2 = j11 - vjg.O(eVar2.a);
            }
            if (z2) {
                j7 = jO2;
            } else {
                b.c cVarW = w(jO2, bVar.s);
                if (cVarW != null) {
                    j3 = cVarW.e;
                } else if (!e47Var.isEmpty()) {
                    b.e eVar3 = (b.e) e47Var.get(vjg.c(e47Var, Long.valueOf(jO2), true));
                    b.c cVarW2 = w(jO2, eVar3.b0);
                    j3 = cVarW2 != null ? cVarW2.e : eVar3.e;
                }
                j7 = j3;
            }
            xgeVar = new xge(j6, jC0, j9, bVar.u, j8, j7, true, !z3, i == 2 && bVar.f, ojhVar, d(), this.q);
        } else {
            if (jO2 == -9223372036854775807L || e47Var.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jO2 != j4) {
                    jO2 = ((b.e) e47Var.get(vjg.c(e47Var, Long.valueOf(jO2), true))).e;
                }
                j = jO2;
            }
            long j13 = bVar.u;
            xgeVar = new xge(j6, jC0, j13, j13, 0L, j, true, false, true, ojhVar, d(), null);
        }
        u(xgeVar);
    }
}
