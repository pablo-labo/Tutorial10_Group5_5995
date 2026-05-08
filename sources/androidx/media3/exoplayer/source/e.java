package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.g;
import androidx.media3.exoplayer.source.h;
import defpackage.ayd;
import defpackage.p35;
import defpackage.qk3;
import defpackage.rjd;
import defpackage.vjg;
import defpackage.xpf;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e implements g, g.a {
    public boolean V;
    public long W = -9223372036854775807L;
    public final h.b a;
    public final long b;
    public final qk3 c;
    public h d;
    public g e;
    public g.a f;

    public e(h.b bVar, qk3 qk3Var, long j) {
        this.a = bVar;
        this.c = qk3Var;
        this.b = j;
    }

    @Override // androidx.media3.exoplayer.source.g.a
    public final void a(g gVar) {
        g.a aVar = this.f;
        String str = vjg.a;
        aVar.a(this);
    }

    @Override // androidx.media3.exoplayer.source.p.a
    public final void b(p pVar) {
        g.a aVar = this.f;
        String str = vjg.a;
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long c(long j, ayd aydVar) {
        g gVar = this.e;
        String str = vjg.a;
        return gVar.c(j, aydVar);
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean d() {
        g gVar = this.e;
        return gVar != null && gVar.d();
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean e(androidx.media3.exoplayer.g gVar) {
        g gVar2 = this.e;
        return gVar2 != null && gVar2.e(gVar);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long f(p35[] p35VarArr, boolean[] zArr, rjd[] rjdVarArr, boolean[] zArr2, long j) {
        long j2 = this.W;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.W = -9223372036854775807L;
        g gVar = this.e;
        String str = vjg.a;
        return gVar.f(p35VarArr, zArr, rjdVarArr, zArr2, j);
    }

    public final void g(h.b bVar) {
        long j = this.W;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        h hVar = this.d;
        hVar.getClass();
        g gVarO = hVar.o(bVar, this.c, j);
        this.e = gVarO;
        if (this.f != null) {
            gVarO.p(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long h() {
        g gVar = this.e;
        String str = vjg.a;
        return gVar.h();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long i(long j) {
        g gVar = this.e;
        String str = vjg.a;
        return gVar.i(j);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long j() {
        g gVar = this.e;
        String str = vjg.a;
        return gVar.j();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void l() throws IOException {
        try {
            g gVar = this.e;
            if (gVar != null) {
                gVar.l();
                return;
            }
            h hVar = this.d;
            if (hVar != null) {
                hVar.m();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void p(g.a aVar, long j) {
        this.f = aVar;
        g gVar = this.e;
        if (gVar != null) {
            long j2 = this.W;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            gVar.p(this, j2);
        }
    }

    @Override // androidx.media3.exoplayer.source.g
    public final xpf q() {
        g gVar = this.e;
        String str = vjg.a;
        return gVar.q();
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long s() {
        g gVar = this.e;
        String str = vjg.a;
        return gVar.s();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void t(long j, boolean z) {
        g gVar = this.e;
        String str = vjg.a;
        gVar.t(j, z);
    }

    @Override // androidx.media3.exoplayer.source.p
    public final void u(long j) {
        g gVar = this.e;
        String str = vjg.a;
        gVar.u(j);
    }
}
