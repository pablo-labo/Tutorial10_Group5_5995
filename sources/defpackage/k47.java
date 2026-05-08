package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k47 implements jsc {
    public final t52 a;
    public final t52 b;

    public k47(t52 t52Var) {
        this.a = t52Var;
        this.b = t52Var;
    }

    public final boolean equals(Object obj) {
        k47 k47Var = obj instanceof k47 ? (k47) obj : null;
        return this.a.equals(k47Var != null ? k47Var.a : null);
    }

    @Override // defpackage.jsc
    public final ui8 getType() {
        mge mgeVarO = this.a.o();
        mgeVarO.getClass();
        return mgeVarO;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        mge mgeVarO = this.a.o();
        mgeVarO.getClass();
        sb.append(mgeVarO);
        sb.append('}');
        return sb.toString();
    }
}
