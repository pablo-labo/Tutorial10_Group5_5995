package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.k;
import defpackage.an3;
import defpackage.dq1;
import defpackage.emf;
import defpackage.g9;
import defpackage.gq5;
import defpackage.grf;
import defpackage.ij9;
import defpackage.in3;
import defpackage.ka2;
import defpackage.p55;
import defpackage.qk3;
import defpackage.sdb;
import defpackage.vjg;
import defpackage.xge;
import defpackage.zxd;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m extends androidx.media3.exoplayer.source.a {
    public final a.InterfaceC0038a h;
    public final k.a i;
    public final androidx.media3.exoplayer.drm.b j;
    public final androidx.media3.exoplayer.upstream.b k;
    public final int l;
    public final androidx.media3.common.a m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public grf r;
    public ij9 s;

    public class a extends gq5 {
        @Override // defpackage.gq5, defpackage.emf
        public final emf.b f(int i, emf.b bVar, boolean z) {
            super.f(i, bVar, z);
            bVar.f = true;
            return bVar;
        }

        @Override // defpackage.gq5, defpackage.emf
        public final emf.d m(int i, emf.d dVar, long j) {
            super.m(i, dVar, j);
            dVar.j = true;
            return dVar;
        }
    }

    public static final class b implements h.a {
        public final a.InterfaceC0038a a;
        public final g9 b;
        public final an3 c;
        public final androidx.media3.exoplayer.upstream.a d;
        public final int e;

        public b(a.InterfaceC0038a interfaceC0038a, in3 in3Var) {
            g9 g9Var = new g9(in3Var, 10);
            an3 an3Var = new an3();
            androidx.media3.exoplayer.upstream.a aVar = new androidx.media3.exoplayer.upstream.a();
            this.a = interfaceC0038a;
            this.b = g9Var;
            this.c = an3Var;
            this.d = aVar;
            this.e = 1048576;
        }

        @Override // androidx.media3.exoplayer.source.h.a
        public final h a(ij9 ij9Var) {
            ij9Var.b.getClass();
            return new m(ij9Var, this.a, this.b, this.c.b(ij9Var), this.d, this.e, null);
        }
    }

    public m(ij9 ij9Var, a.InterfaceC0038a interfaceC0038a, g9 g9Var, androidx.media3.exoplayer.drm.b bVar, androidx.media3.exoplayer.upstream.b bVar2, int i, androidx.media3.common.a aVar) {
        this.s = ij9Var;
        this.h = interfaceC0038a;
        this.i = g9Var;
        this.j = bVar;
        this.k = bVar2;
        this.l = i;
        this.m = aVar;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final boolean a(ij9 ij9Var) {
        ij9.f fVar = d().b;
        fVar.getClass();
        ij9.f fVar2 = ij9Var.b;
        return fVar2 != null && fVar2.a.equals(fVar.a) && fVar2.h == fVar.h && Objects.equals(fVar2.f, fVar.f);
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
        l lVar = (l) gVar;
        if (lVar.m0) {
            for (o oVar : lVar.j0) {
                oVar.j();
                DrmSession drmSession = oVar.h;
                if (drmSession != null) {
                    drmSession.f(oVar.e);
                    oVar.h = null;
                    oVar.g = null;
                }
            }
        }
        lVar.b0.e(lVar);
        lVar.g0.removeCallbacksAndMessages(null);
        lVar.h0 = null;
        lVar.E0 = true;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void m() {
    }

    @Override // androidx.media3.exoplayer.source.h
    public final g o(h.b bVar, qk3 qk3Var, long j) {
        androidx.media3.datasource.a aVarA = this.h.a();
        grf grfVar = this.r;
        if (grfVar != null) {
            aVarA.i(grfVar);
        }
        ij9.f fVar = d().b;
        fVar.getClass();
        Uri uri = fVar.a;
        ka2.r(this.g);
        return new l(uri, aVarA, new dq1((p55) ((g9) this.i).b), this.j, new a.C0043a(this.d.c, 0, bVar), this.k, q(bVar), this, qk3Var, fVar.f, this.l, this.m, vjg.O(fVar.h), null);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void t(grf grfVar) {
        this.r = grfVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        sdb sdbVar = this.g;
        ka2.r(sdbVar);
        androidx.media3.exoplayer.drm.b bVar = this.j;
        bVar.a(looperMyLooper, sdbVar);
        bVar.f();
        w();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void v() {
        this.j.release();
    }

    public final void w() {
        long j = this.o;
        boolean z = this.p;
        boolean z2 = this.q;
        ij9 ij9VarD = d();
        emf xgeVar = new xge(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, ij9VarD, z2 ? ij9VarD.c : null);
        if (this.n) {
            xgeVar = new a(xgeVar);
        }
        u(xgeVar);
    }

    public final void x(long j, zxd zxdVar, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.o;
        }
        boolean zH = zxdVar.h();
        if (!this.n && this.o == j && this.p == zH && this.q == z) {
            return;
        }
        this.o = j;
        this.p = zH;
        this.q = z;
        this.n = false;
        w();
    }
}
