package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class k74 implements k0d {
    public final Function1<m74, l74> a;
    public l74 b;

    /* JADX WARN: Multi-variable type inference failed */
    public k74(Function1<? super m74, ? extends l74> function1) {
        this.a = function1;
    }

    @Override // defpackage.k0d
    public final void b() {
        this.b = this.a.invoke(to4.a);
    }

    @Override // defpackage.k0d
    public final void d() {
    }

    @Override // defpackage.k0d
    public final void e() {
        l74 l74Var = this.b;
        if (l74Var != null) {
            l74Var.dispose();
        }
        this.b = null;
    }
}
