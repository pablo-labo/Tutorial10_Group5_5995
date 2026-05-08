package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import defpackage.dq3;
import defpackage.emf;
import defpackage.fm9;
import defpackage.fr3;
import defpackage.gm9;
import defpackage.grf;
import defpackage.hm9;
import defpackage.ka2;
import defpackage.nj9;
import defpackage.sdb;
import defpackage.uz8;
import defpackage.xl2;
import defpackage.z65;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> extends androidx.media3.exoplayer.source.a {
    public final HashMap<T, b<T>> h = new HashMap<>();
    public Handler i;
    public grf j;

    public final class a implements i, androidx.media3.exoplayer.drm.a {
        public final T a;
        public i.a b;
        public a.C0043a c;

        public a(T t) {
            this.b = c.this.q(null);
            this.c = new a.C0043a(c.this.d.c, 0, null);
            this.a = t;
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void C(int i, h.b bVar, nj9 nj9Var) {
            if (a(i, bVar)) {
                i.a aVar = this.b;
                nj9 nj9VarG = g(nj9Var, bVar);
                aVar.getClass();
                aVar.a(new z65(2, aVar, nj9VarG));
            }
        }

        @Override // androidx.media3.exoplayer.drm.a
        public final void F(int i, h.b bVar) {
            if (a(i, bVar)) {
                this.c.a();
            }
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void G(int i, h.b bVar, nj9 nj9Var) {
            if (a(i, bVar)) {
                i.a aVar = this.b;
                nj9 nj9VarG = g(nj9Var, bVar);
                h.b bVar2 = aVar.b;
                bVar2.getClass();
                aVar.a(new fr3(aVar, bVar2, nj9VarG));
            }
        }

        @Override // androidx.media3.exoplayer.drm.a
        public final void P(int i, h.b bVar, int i2) {
            if (a(i, bVar)) {
                this.c.c(i2);
            }
        }

        @Override // androidx.media3.exoplayer.drm.a
        public final void R(int i, h.b bVar, Exception exc) {
            if (a(i, bVar)) {
                this.c.d(exc);
            }
        }

        @Override // androidx.media3.exoplayer.drm.a
        public final void Z(int i, h.b bVar) {
            if (a(i, bVar)) {
                this.c.b();
            }
        }

        public final boolean a(int i, h.b bVar) {
            h.b bVarW;
            T t = this.a;
            c cVar = c.this;
            if (bVar != null) {
                bVarW = cVar.w(t, bVar);
                if (bVarW == null) {
                    return false;
                }
            } else {
                bVarW = null;
            }
            int iY = cVar.y(i, t);
            i.a aVar = this.b;
            if (aVar.a != iY || !Objects.equals(aVar.b, bVarW)) {
                this.b = new i.a(cVar.c.c, iY, bVarW);
            }
            a.C0043a c0043a = this.c;
            if (c0043a.a == iY && Objects.equals(c0043a.b, bVarW)) {
                return true;
            }
            this.c = new a.C0043a(cVar.d.c, iY, bVarW);
            return true;
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void e0(int i, h.b bVar, uz8 uz8Var, nj9 nj9Var, int i2) {
            if (a(i, bVar)) {
                i.a aVar = this.b;
                nj9 nj9VarG = g(nj9Var, bVar);
                aVar.getClass();
                aVar.a(new fm9(aVar, uz8Var, nj9VarG, i2));
            }
        }

        public final nj9 g(nj9 nj9Var, h.b bVar) {
            long j = nj9Var.f;
            c cVar = c.this;
            T t = this.a;
            long jX = cVar.x(t, j);
            long j2 = nj9Var.g;
            long jX2 = cVar.x(t, j2);
            return (jX == j && jX2 == j2) ? nj9Var : new nj9(nj9Var.a, nj9Var.b, nj9Var.c, nj9Var.d, nj9Var.e, jX, jX2);
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void m0(int i, h.b bVar, uz8 uz8Var, nj9 nj9Var, IOException iOException, boolean z) {
            if (a(i, bVar)) {
                i.a aVar = this.b;
                nj9 nj9VarG = g(nj9Var, bVar);
                aVar.getClass();
                aVar.a(new hm9(aVar, uz8Var, nj9VarG, iOException, z));
            }
        }

        @Override // androidx.media3.exoplayer.drm.a
        public final void s0(int i, h.b bVar) {
            if (a(i, bVar)) {
                this.c.e();
            }
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void t0(int i, h.b bVar, uz8 uz8Var, nj9 nj9Var) {
            if (a(i, bVar)) {
                i.a aVar = this.b;
                nj9 nj9VarG = g(nj9Var, bVar);
                aVar.getClass();
                aVar.a(new gm9(aVar, uz8Var, nj9VarG));
            }
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void x(int i, h.b bVar, uz8 uz8Var, nj9 nj9Var) {
            if (a(i, bVar)) {
                i.a aVar = this.b;
                nj9 nj9VarG = g(nj9Var, bVar);
                aVar.getClass();
                aVar.a(new dq3(aVar, uz8Var, nj9VarG));
            }
        }
    }

    public static final class b<T> {
        public final h a;
        public final xl2 b;
        public final c<T>.a c;

        public b(h hVar, xl2 xl2Var, a aVar) {
            this.a = hVar;
            this.b = xl2Var;
            this.c = aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.media3.exoplayer.source.h$c, xl2] */
    public final void A(final T t, h hVar) {
        HashMap<T, b<T>> map = this.h;
        ka2.l(!map.containsKey(t));
        ?? r1 = new h.c() { // from class: xl2
            @Override // androidx.media3.exoplayer.source.h.c
            public final void a(androidx.media3.exoplayer.source.a aVar, emf emfVar) {
                this.a.z(t, aVar, emfVar);
            }
        };
        a aVar = new a(t);
        map.put(t, new b<>(hVar, r1, aVar));
        Handler handler = this.i;
        handler.getClass();
        hVar.b(handler, aVar);
        Handler handler2 = this.i;
        handler2.getClass();
        hVar.e(handler2, aVar);
        grf grfVar = this.j;
        sdb sdbVar = this.g;
        ka2.r(sdbVar);
        hVar.j(r1, grfVar, sdbVar);
        if (this.b.isEmpty()) {
            hVar.l(r1);
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public void m() {
        Iterator<b<T>> it = this.h.values().iterator();
        while (it.hasNext()) {
            it.next().a.m();
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void r() {
        for (b<T> bVar : this.h.values()) {
            bVar.a.l(bVar.b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void s() {
        for (b<T> bVar : this.h.values()) {
            bVar.a.i(bVar.b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public void v() {
        HashMap<T, b<T>> map = this.h;
        for (b<T> bVar : map.values()) {
            h hVar = bVar.a;
            c<T>.a aVar = bVar.c;
            hVar.k(bVar.b);
            hVar.c(aVar);
            hVar.g(aVar);
        }
        map.clear();
    }

    public abstract h.b w(T t, h.b bVar);

    public long x(Object obj, long j) {
        return j;
    }

    public int y(int i, Object obj) {
        return i;
    }

    public abstract void z(Object obj, androidx.media3.exoplayer.source.a aVar, emf emfVar);
}
