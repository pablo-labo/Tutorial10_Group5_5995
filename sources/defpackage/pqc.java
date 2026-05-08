package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pqc<T> implements mde<T>, rw1<T>, xv5<T> {
    public final /* synthetic */ nde a;

    public pqc(nde ndeVar, uqe uqeVar) {
        this.a = ndeVar;
    }

    @Override // defpackage.mde
    public final List<T> c() {
        return this.a.c();
    }

    @Override // defpackage.xv5
    public final vi5<T> d(v03 v03Var, int i, eo1 eo1Var) {
        return wg2.G(this, v03Var, i, eo1Var);
    }

    @Override // defpackage.vi5
    public final Object e(wi5<? super T> wi5Var, lu2<?> lu2Var) throws Throwable {
        this.a.e(wi5Var, lu2Var);
        return g13.a;
    }
}
