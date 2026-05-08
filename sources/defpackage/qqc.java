package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qqc extends wle {
    public final Function1<Object, j6g> f;
    public int g;

    public qqc(long j, zle zleVar, Function1<Object, j6g> function1) {
        super(j, zleVar);
        this.f = function1;
        this.g = 1;
    }

    @Override // defpackage.wle
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.g++;
    }

    @Override // defpackage.wle
    public final void l() {
        int i = this.g - 1;
        this.g = i;
        if (i == 0) {
            a();
        }
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
    public final wle u(Function1<Object, j6g> function1) {
        ame.c(this);
        return new rea(this.b, this.a, ame.k(function1, this.f, true), this);
    }
}
