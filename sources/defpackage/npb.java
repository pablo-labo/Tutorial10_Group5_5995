package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class npb<T> implements mpb<T>, g4a<T> {
    public final /* synthetic */ g4a<T> a;
    public final v03 b;

    public npb(g4a<T> g4aVar, v03 v03Var) {
        this.a = g4aVar;
        this.b = v03Var;
    }

    @Override // defpackage.e13
    public final v03 getCoroutineContext() {
        return this.b;
    }

    @Override // defpackage.ese
    public final T getValue() {
        return this.a.getValue();
    }

    @Override // defpackage.g4a
    public final void setValue(T t) {
        this.a.setValue(t);
    }
}
