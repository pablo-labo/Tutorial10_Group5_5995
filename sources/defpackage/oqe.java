package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oqe<T> implements lu2<T>, h13 {
    public final lu2<T> a;
    public final v03 b;

    /* JADX WARN: Multi-variable type inference failed */
    public oqe(lu2<? super T> lu2Var, v03 v03Var) {
        this.a = lu2Var;
        this.b = v03Var;
    }

    @Override // defpackage.h13
    public final h13 getCallerFrame() {
        lu2<T> lu2Var = this.a;
        if (lu2Var instanceof h13) {
            return (h13) lu2Var;
        }
        return null;
    }

    @Override // defpackage.lu2
    public final v03 getContext() {
        return this.b;
    }

    @Override // defpackage.lu2
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
