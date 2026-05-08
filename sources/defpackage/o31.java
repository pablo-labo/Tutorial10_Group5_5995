package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o31 {
    public final v31 a;
    public final String b;
    public final x21 c;
    public final wrf<?, byte[]> d;
    public final dt4 e;

    public o31(v31 v31Var, String str, x21 x21Var, wrf wrfVar, dt4 dt4Var) {
        this.a = v31Var;
        this.b = str;
        this.c = x21Var;
        this.d = wrfVar;
        this.e = dt4Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o31)) {
            return false;
        }
        o31 o31Var = (o31) obj;
        return this.a.equals(o31Var.a) && this.b.equals(o31Var.b) && this.c.equals(o31Var.c) && this.d.equals(o31Var.d) && this.e.equals(o31Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }
}
