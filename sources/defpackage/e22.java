package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e22<T> extends d22<T, T> {
    public e22(vi5 vi5Var, v03 v03Var, int i, eo1 eo1Var, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? eo1.a : eo1Var, (i2 & 2) != 0 ? vr4.a : v03Var, vi5Var);
    }

    @Override // defpackage.z12
    public final z12<T> k(v03 v03Var, int i, eo1 eo1Var) {
        return new e22(i, eo1Var, v03Var, this.d);
    }

    @Override // defpackage.z12
    public final vi5<T> l() {
        return (vi5<T>) this.d;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.d22
    public final Object n(wi5<? super T> wi5Var, lu2<? super j6g> lu2Var) {
        Object objE = this.d.e((wi5<? super S>) wi5Var, lu2Var);
        return objE == g13.a ? objE : j6g.a;
    }
}
