package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kkf {
    public final kb2 a;
    public final nzf b;
    public final ede c;

    public kkf(kb2 kb2Var, nzf nzfVar, ede edeVar) {
        this.a = kb2Var;
        this.b = nzfVar;
        this.c = edeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkf)) {
            return false;
        }
        kkf kkfVar = (kkf) obj;
        return wl7.b(this.a, kkfVar.a) && wl7.b(this.b, kkfVar.b) && wl7.b(this.c, kkfVar.c);
    }

    public final int hashCode() {
        kb2 kb2Var = this.a;
        int iHashCode = (kb2Var == null ? 0 : kb2Var.hashCode()) * 31;
        nzf nzfVar = this.b;
        int iHashCode2 = (iHashCode + (nzfVar == null ? 0 : nzfVar.hashCode())) * 31;
        ede edeVar = this.c;
        return iHashCode2 + (edeVar != null ? edeVar.hashCode() : 0);
    }

    public final String toString() {
        return "ThemeParameters(colors=" + this.a + ", typography=" + this.b + ", shapes=" + this.c + ')';
    }
}
