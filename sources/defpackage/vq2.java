package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vq2 implements lx9 {
    public final Function1<mzg, j6g> b;
    public mzg c;

    /* JADX WARN: Multi-variable type inference failed */
    public vq2(Function1<? super mzg, j6g> function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vq2) && ((vq2) obj).b == this.b;
    }

    @Override // defpackage.lx9
    public final void h(px9 px9Var) {
        mzg mzgVar = (mzg) px9Var.g(ka2.b0);
        if (wl7.b(mzgVar, this.c)) {
            return;
        }
        this.c = mzgVar;
        this.b.invoke(mzgVar);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
