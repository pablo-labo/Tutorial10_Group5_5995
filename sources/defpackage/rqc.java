package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rqc<T> implements fse<T>, rw1<T>, xv5<T> {
    public final /* synthetic */ fse<T> a;
    public final ex7 b;

    public rqc(gse gseVar, ex7 ex7Var) {
        this.a = gseVar;
        this.b = ex7Var;
    }

    @Override // defpackage.mde
    public final List<T> c() {
        return this.a.c();
    }

    @Override // defpackage.xv5
    public final vi5<T> d(v03 v03Var, int i, eo1 eo1Var) {
        return (((i < 0 || i >= 2) && i != -2) || eo1Var != eo1.b) ? wg2.G(this, v03Var, i, eo1Var) : this;
    }

    @Override // defpackage.vi5
    public final Object e(wi5<? super T> wi5Var, lu2<?> lu2Var) {
        return this.a.e(wi5Var, lu2Var);
    }

    @Override // defpackage.fse
    public final T getValue() {
        return this.a.getValue();
    }
}
