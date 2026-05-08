package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.a;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.source.h;
import defpackage.e47;
import defpackage.gf3;
import defpackage.grf;
import defpackage.ij9;
import defpackage.ka2;
import defpackage.oj9;
import defpackage.qk3;
import defpackage.qyc;
import defpackage.st9;
import defpackage.xge;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class r extends a {
    public final gf3 h;
    public final a.InterfaceC0038a i;
    public final androidx.media3.common.a j;
    public final androidx.media3.exoplayer.upstream.b l;
    public final xge n;
    public final ij9 o;
    public grf p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public r(ij9.i iVar, a.InterfaceC0038a interfaceC0038a, androidx.media3.exoplayer.upstream.b bVar) {
        ij9.f fVar;
        this.i = interfaceC0038a;
        this.l = bVar;
        boolean z = true;
        ij9.b.a aVar = new ij9.b.a();
        ij9.d.a aVar2 = new ij9.d.a();
        List list = Collections.EMPTY_LIST;
        qyc qycVar = qyc.e;
        ij9.e.a aVar3 = new ij9.e.a();
        ij9.g gVar = ij9.g.d;
        Uri uri = Uri.EMPTY;
        String string = iVar.a.toString();
        string.getClass();
        e47 e47VarJ = e47.j(e47.n(iVar));
        if (aVar2.b != null && aVar2.a == null) {
            z = false;
        }
        ka2.q(z);
        if (uri != null) {
            fVar = new ij9.f(uri, null, aVar2.a != null ? new ij9.d(aVar2) : null, null, list, null, e47VarJ, -9223372036854775807L);
        } else {
            fVar = null;
        }
        ij9 ij9Var = new ij9(string, new ij9.c(aVar), fVar, new ij9.e(aVar3), oj9.K, gVar);
        this.o = ij9Var;
        a.C0036a c0036a = new a.C0036a();
        String str = iVar.b;
        c0036a.m = st9.p(str == null ? "text/x-unknown" : str);
        c0036a.d = iVar.c;
        c0036a.e = iVar.d;
        c0036a.f = iVar.e;
        c0036a.b = iVar.f;
        String str2 = iVar.g;
        c0036a.a = str2 != null ? str2 : null;
        this.j = new androidx.media3.common.a(c0036a);
        Map map = Collections.EMPTY_MAP;
        Uri uri2 = iVar.a;
        ka2.s(uri2, "The uri must be set.");
        this.h = new gf3(uri2, 0L, 1, null, map, 0L, -1L, null, 1);
        this.n = new xge(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, ij9Var, null);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final ij9 d() {
        return this.o;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void h(g gVar) {
        ((q) gVar).X.e(null);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void m() {
    }

    @Override // androidx.media3.exoplayer.source.h
    public final g o(h.b bVar, qk3 qk3Var, long j) {
        return new q(this.h, this.i, this.p, this.j, this.k, this.l, q(bVar), this.m, null);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void t(grf grfVar) {
        this.p = grfVar;
        u(this.n);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void v() {
    }
}
