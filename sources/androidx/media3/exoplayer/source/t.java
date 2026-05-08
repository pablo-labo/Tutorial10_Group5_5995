package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.h;
import defpackage.emf;
import defpackage.grf;
import defpackage.ij9;
import defpackage.vjg;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends c<Void> {
    public final h k;

    public t(h hVar) {
        this.k = hVar;
    }

    public h.b B(h.b bVar) {
        return bVar;
    }

    public abstract void C(emf emfVar);

    public final void D() {
        A(null, this.k);
    }

    public void E() {
        D();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final ij9 d() {
        return this.k.d();
    }

    @Override // androidx.media3.exoplayer.source.h
    public void f(ij9 ij9Var) {
        this.k.f(ij9Var);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final boolean n() {
        return this.k.n();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final emf p() {
        return this.k.p();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void t(grf grfVar) {
        this.j = grfVar;
        this.i = vjg.p(null);
        E();
    }

    @Override // androidx.media3.exoplayer.source.c
    public final h.b w(Void r1, h.b bVar) {
        return B(bVar);
    }

    @Override // androidx.media3.exoplayer.source.c
    public final long x(Object obj, long j) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final int y(int i, Object obj) {
        return i;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final void z(Object obj, a aVar, emf emfVar) {
        C(emfVar);
    }
}
