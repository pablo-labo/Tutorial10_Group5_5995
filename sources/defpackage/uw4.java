package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uw4 implements c37 {
    public final k07 a;
    public final w27 b;
    public final Throwable c;

    public uw4(k07 k07Var, w27 w27Var, Throwable th) {
        this.a = k07Var;
        this.b = w27Var;
        this.c = th;
    }

    @Override // defpackage.c37
    public final w27 a() {
        return this.b;
    }

    @Override // defpackage.c37
    public final k07 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw4)) {
            return false;
        }
        uw4 uw4Var = (uw4) obj;
        return wl7.b(this.a, uw4Var.a) && wl7.b(this.b, uw4Var.b) && this.c.equals(uw4Var.c);
    }

    public final int hashCode() {
        k07 k07Var = this.a;
        int iHashCode = k07Var == null ? 0 : k07Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ')';
    }
}
