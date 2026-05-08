package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xsf extends wle {
    public final wle f;
    public final boolean g;
    public final boolean h;
    public Function1<Object, j6g> i;
    public final long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsf(wle wleVar, Function1<Object, j6g> function1, boolean z, boolean z2) {
        Function1<Object, j6g> function1E;
        super(0L, zle.e);
        nf nfVar = ame.a;
        this.f = wleVar;
        this.g = z;
        this.h = z2;
        this.i = ame.k(function1, (wleVar == null || (function1E = wleVar.e()) == null) ? ame.j.f : function1E, z);
        this.j = hh1.u();
    }

    @Override // defpackage.wle
    public final void c() {
        wle wleVar;
        this.c = true;
        if (!this.h || (wleVar = this.f) == null) {
            return;
        }
        wleVar.c();
    }

    @Override // defpackage.wle
    public final zle d() {
        return v().d();
    }

    @Override // defpackage.wle
    public final Function1 e() {
        return this.i;
    }

    @Override // defpackage.wle
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.wle
    public final long g() {
        return v().g();
    }

    @Override // defpackage.wle
    public final Function1<Object, j6g> i() {
        return null;
    }

    @Override // defpackage.wle
    public final void k() {
        ee3.A();
        throw null;
    }

    @Override // defpackage.wle
    public final void l() {
        ee3.A();
        throw null;
    }

    @Override // defpackage.wle
    public final void m() {
        v().m();
    }

    @Override // defpackage.wle
    public final void n(pse pseVar) {
        v().n(pseVar);
    }

    @Override // defpackage.wle
    public final wle u(Function1<Object, j6g> function1) {
        Function1<Object, j6g> function1K = ame.k(function1, this.i, true);
        return !this.g ? ame.g(v().u(null), function1K, true) : v().u(function1K);
    }

    public final wle v() {
        wle wleVar = this.f;
        return wleVar == null ? ame.j : wleVar;
    }
}
