package defpackage;

import defpackage.lf0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class bu4 implements lf0 {
    public final mq5 a;

    public bu4(mq5 mq5Var) {
        mq5Var.getClass();
        this.a = mq5Var;
    }

    @Override // defpackage.lf0
    public final boolean P0(mq5 mq5Var) {
        return lf0.b.b(this, mq5Var);
    }

    @Override // defpackage.lf0
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<af0> iterator() {
        return xr4.a;
    }

    @Override // defpackage.lf0
    public final af0 p(mq5 mq5Var) {
        mq5Var.getClass();
        if (mq5Var.equals(this.a)) {
            return au4.a;
        }
        return null;
    }
}
