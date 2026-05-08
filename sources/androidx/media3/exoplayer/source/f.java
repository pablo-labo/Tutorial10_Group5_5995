package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.h;
import defpackage.ba;
import defpackage.emf;
import defpackage.gq5;
import defpackage.ij9;
import defpackage.jmf;
import defpackage.ka2;
import defpackage.qk3;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class f extends t {
    public final boolean l;
    public final emf.d m;
    public final emf.b n;
    public a o;
    public e p;
    public boolean q;
    public boolean r;
    public boolean s;

    public static final class a extends gq5 {
        public static final Object h = new Object();
        public final Object f;
        public final Object g;

        public a(emf emfVar, Object obj, Object obj2) {
            super(emfVar);
            this.f = obj;
            this.g = obj2;
        }

        @Override // defpackage.gq5, defpackage.emf
        public final int b(Object obj) {
            Object obj2;
            if (h == obj && (obj2 = this.g) != null) {
                obj = obj2;
            }
            return this.e.b(obj);
        }

        @Override // defpackage.gq5, defpackage.emf
        public final emf.b f(int i, emf.b bVar, boolean z) {
            this.e.f(i, bVar, z);
            if (Objects.equals(bVar.b, this.g) && z) {
                bVar.b = h;
            }
            return bVar;
        }

        @Override // defpackage.gq5, defpackage.emf
        public final Object l(int i) {
            Object objL = this.e.l(i);
            return Objects.equals(objL, this.g) ? h : objL;
        }

        @Override // defpackage.gq5, defpackage.emf
        public final emf.d m(int i, emf.d dVar, long j) {
            this.e.m(i, dVar, j);
            if (Objects.equals(dVar.a, this.f)) {
                dVar.a = emf.d.p;
            }
            return dVar;
        }
    }

    public static final class b extends emf {
        public final ij9 e;

        public b(ij9 ij9Var) {
            this.e = ij9Var;
        }

        @Override // defpackage.emf
        public final int b(Object obj) {
            return obj == a.h ? 0 : -1;
        }

        @Override // defpackage.emf
        public final emf.b f(int i, emf.b bVar, boolean z) {
            bVar.i(z ? 0 : null, z ? a.h : null, 0, -9223372036854775807L, 0L, ba.f, true);
            return bVar;
        }

        @Override // defpackage.emf
        public final int h() {
            return 1;
        }

        @Override // defpackage.emf
        public final Object l(int i) {
            return a.h;
        }

        @Override // defpackage.emf
        public final emf.d m(int i, emf.d dVar, long j) {
            dVar.b(emf.d.p, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.j = true;
            return dVar;
        }

        @Override // defpackage.emf
        public final int o() {
            return 1;
        }
    }

    public f(h hVar, boolean z) {
        super(hVar);
        this.l = z && hVar.n();
        this.m = new emf.d();
        this.n = new emf.b();
        emf emfVarP = hVar.p();
        if (emfVarP == null) {
            this.o = new a(new b(hVar.d()), emf.d.p, a.h);
        } else {
            this.o = new a(emfVarP, null, null);
            this.s = true;
        }
    }

    @Override // androidx.media3.exoplayer.source.t
    public final h.b B(h.b bVar) {
        Object obj = bVar.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.h;
        }
        return bVar.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(defpackage.emf r13) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.f.C(emf):void");
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void E() {
        if (this.l) {
            return;
        }
        this.q = true;
        D();
    }

    @Override // androidx.media3.exoplayer.source.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final e o(h.b bVar, qk3 qk3Var, long j) {
        e eVar = new e(bVar, qk3Var, j);
        ka2.q(eVar.d == null);
        eVar.d = this.k;
        if (!this.r) {
            this.p = eVar;
            if (!this.q) {
                this.q = true;
                D();
            }
            return eVar;
        }
        Object obj = bVar.a;
        if (this.o.g != null && obj.equals(a.h)) {
            obj = this.o.g;
        }
        eVar.g(bVar.a(obj));
        return eVar;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final boolean G(long j) {
        e eVar = this.p;
        int iB = this.o.b(eVar.a.a);
        if (iB == -1) {
            return false;
        }
        a aVar = this.o;
        emf.b bVar = this.n;
        aVar.f(iB, bVar, false);
        long j2 = bVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        eVar.W = j;
        return true;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final boolean a(ij9 ij9Var) {
        return this.k.a(ij9Var);
    }

    @Override // androidx.media3.exoplayer.source.t, androidx.media3.exoplayer.source.h
    public final void f(ij9 ij9Var) {
        if (this.s) {
            a aVar = this.o;
            this.o = new a(new jmf(this.o.e, ij9Var), aVar.f, aVar.g);
        } else {
            this.o = new a(new b(ij9Var), emf.d.p, a.h);
        }
        this.k.f(ij9Var);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void h(g gVar) {
        e eVar = (e) gVar;
        if (eVar.e != null) {
            h hVar = eVar.d;
            hVar.getClass();
            hVar.h(eVar.e);
        }
        if (gVar == this.p) {
            this.p = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void v() {
        this.r = false;
        this.q = false;
        super.v();
    }
}
