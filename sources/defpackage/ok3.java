package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ok3<T, R> extends nk3<T, R> implements lu2<R> {
    public zb8 a;
    public Object b;
    public lu2<Object> c;
    public Object d;

    @Override // defpackage.nk3
    public final void a(Object obj, ac8 ac8Var) {
        this.c = ac8Var;
        this.b = obj;
    }

    @Override // defpackage.lu2
    public final v03 getContext() {
        return vr4.a;
    }

    @Override // defpackage.lu2
    public final void resumeWith(Object obj) {
        this.c = null;
        this.d = obj;
    }
}
