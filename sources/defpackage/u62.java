package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u62 implements kwf {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kwf) && obj.hashCode() == hashCode()) {
            kwf kwfVar = (kwf) obj;
            if (kwfVar.getParameters().size() == getParameters().size()) {
                v62 v62VarD = d();
                v62 v62VarD2 = kwfVar.d();
                if (v62VarD2 == null || lx4.f(v62VarD) || yz3.o(v62VarD) || lx4.f(v62VarD2) || yz3.o(v62VarD2)) {
                    return false;
                }
                return f(v62VarD2);
            }
        }
        return false;
    }

    public abstract boolean f(v62 v62Var);

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        v62 v62VarD = d();
        int iIdentityHashCode = (lx4.f(v62VarD) || yz3.o(v62VarD)) ? System.identityHashCode(this) : yz3.g(v62VarD).a.hashCode();
        this.a = iIdentityHashCode;
        return iIdentityHashCode;
    }
}
