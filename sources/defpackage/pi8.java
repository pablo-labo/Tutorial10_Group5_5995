package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pi8 implements c14 {
    public final oi8 a;

    public pi8(oi8 oi8Var, b14 b14Var) {
        this.a = oi8Var;
    }

    @Override // defpackage.c14
    public final String a() {
        return w40.f(new StringBuilder("Class '"), this.a.j().a().a.a, '\'');
    }

    public final String toString() {
        return pi8.class.getSimpleName() + ": " + this.a;
    }
}
