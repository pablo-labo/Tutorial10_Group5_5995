package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b22<T> implements wi5<T> {
    public final g6e<T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public b22(g6e<? super T> g6eVar) {
        g6eVar.getClass();
        this.a = g6eVar;
    }

    @Override // defpackage.wi5
    public final Object a(T t, lu2<? super j6g> lu2Var) {
        Object objB = this.a.b(lu2Var, t);
        return objB == g13.a ? objB : j6g.a;
    }
}
