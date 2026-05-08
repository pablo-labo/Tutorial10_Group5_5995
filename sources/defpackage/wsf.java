package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wsf extends d4a {
    public final d4a p;
    public final boolean q;
    public final boolean r;
    public Function1<Object, j6g> s;
    public Function1<Object, j6g> t;
    public final long u;

    /* JADX WARN: Illegal instructions before constructor call */
    public wsf(d4a d4aVar, Function1<Object, j6g> function1, Function1<Object, j6g> function12, boolean z, boolean z2) {
        Function1<Object, j6g> function1I;
        Function1<Object, j6g> function1E;
        nf nfVar = ame.a;
        super(0L, zle.e, ame.k(function1, (d4aVar == null || (function1E = d4aVar.e()) == null) ? ame.j.f : function1E, z), ame.a(function12, (d4aVar == null || (function1I = d4aVar.i()) == null) ? ame.j.g : function1I));
        this.p = d4aVar;
        this.q = z;
        this.r = z2;
        this.s = this.f;
        this.t = this.g;
        this.u = hh1.u();
    }

    @Override // defpackage.d4a
    public final void B(a4a<pse> a4aVar) {
        ee3.A();
        throw null;
    }

    @Override // defpackage.d4a
    public final d4a C(Function1<Object, j6g> function1, Function1<Object, j6g> function12) {
        Function1<Object, j6g> function1K = ame.k(function1, this.s, true);
        Function1<Object, j6g> function1A = ame.a(function12, this.t);
        return !this.q ? new wsf(D().C(null, function1A), function1K, function1A, false, true) : D().C(function1K, function1A);
    }

    public final d4a D() {
        d4a d4aVar = this.p;
        return d4aVar == null ? ame.j : d4aVar;
    }

    @Override // defpackage.d4a, defpackage.wle
    public final void c() {
        d4a d4aVar;
        this.c = true;
        if (!this.r || (d4aVar = this.p) == null) {
            return;
        }
        d4aVar.c();
    }

    @Override // defpackage.wle
    public final zle d() {
        return D().d();
    }

    @Override // defpackage.d4a, defpackage.wle
    public final Function1 e() {
        return this.s;
    }

    @Override // defpackage.d4a, defpackage.wle
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.wle
    public final long g() {
        return D().g();
    }

    @Override // defpackage.d4a, defpackage.wle
    public final int h() {
        return D().h();
    }

    @Override // defpackage.d4a, defpackage.wle
    public final Function1<Object, j6g> i() {
        return this.t;
    }

    @Override // defpackage.d4a, defpackage.wle
    public final void k() {
        ee3.A();
        throw null;
    }

    @Override // defpackage.d4a, defpackage.wle
    public final void l() {
        ee3.A();
        throw null;
    }

    @Override // defpackage.d4a, defpackage.wle
    public final void m() {
        D().m();
    }

    @Override // defpackage.d4a, defpackage.wle
    public final void n(pse pseVar) {
        D().n(pseVar);
    }

    @Override // defpackage.wle
    public final void r(zle zleVar) {
        ee3.A();
        throw null;
    }

    @Override // defpackage.wle
    public final void s(long j) {
        ee3.A();
        throw null;
    }

    @Override // defpackage.d4a, defpackage.wle
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.d4a, defpackage.wle
    public final wle u(Function1<Object, j6g> function1) {
        Function1<Object, j6g> function1K = ame.k(function1, this.s, true);
        return !this.q ? ame.g(D().u(null), function1K, true) : D().u(function1K);
    }

    @Override // defpackage.d4a
    public final xle w() {
        return D().w();
    }

    @Override // defpackage.d4a
    public final a4a<pse> x() {
        return D().x();
    }

    @Override // defpackage.d4a
    /* JADX INFO: renamed from: y */
    public final Function1<Object, j6g> e() {
        return this.s;
    }
}
