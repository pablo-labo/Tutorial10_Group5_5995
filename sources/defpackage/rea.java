package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rea extends wle {
    public final Function1<Object, j6g> f;
    public final wle g;

    public rea(long j, zle zleVar, Function1<Object, j6g> function1, wle wleVar) {
        super(j, zleVar);
        this.f = function1;
        this.g = wleVar;
        wleVar.k();
    }

    @Override // defpackage.wle
    public final void c() {
        if (this.c) {
            return;
        }
        long j = this.b;
        wle wleVar = this.g;
        if (j != wleVar.g()) {
            a();
        }
        wleVar.l();
        super.c();
    }

    @Override // defpackage.wle
    public final Function1 e() {
        return this.f;
    }

    @Override // defpackage.wle
    public final boolean f() {
        return true;
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
    }

    @Override // defpackage.wle
    public final void n(pse pseVar) {
        nf nfVar = ame.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.wle
    public final wle u(Function1 function1) {
        return new rea(this.b, this.a, ame.k(function1, this.f, true), this.g);
    }
}
