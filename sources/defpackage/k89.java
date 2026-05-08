package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k89 extends y03 {
    @Override // defpackage.y03
    public y03 E1(int i) {
        h4.g(i);
        return this;
    }

    public abstract k89 J1();

    @Override // defpackage.y03
    public String toString() {
        k89 k89VarJ1;
        String str;
        eq3 eq3Var = a74.a;
        k89 k89Var = m89.a;
        if (this == k89Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                k89VarJ1 = k89Var.J1();
            } catch (UnsupportedOperationException unused) {
                k89VarJ1 = null;
            }
            str = this == k89VarJ1 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + pi3.f(this);
    }
}
