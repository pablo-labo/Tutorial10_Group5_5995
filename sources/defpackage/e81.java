package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e81 extends v1 {
    public ox9<?> b;

    @Override // defpackage.v1
    public final boolean O(kx9<?> kx9Var) {
        return kx9Var == this.b.getKey();
    }

    @Override // defpackage.v1
    public final <T> T V(kx9<T> kx9Var) {
        if (kx9Var != this.b.getKey()) {
            ae7.b("Check failed.");
        }
        return (T) this.b.i();
    }
}
