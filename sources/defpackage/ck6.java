package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ck6 {
    public final String a;
    public final String b;
    public final String c;

    public ck6(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck6)) {
            return false;
        }
        ck6 ck6Var = (ck6) obj;
        return this.a.equals(ck6Var.a) && this.b.equals(ck6Var.b) && this.c.equals(ck6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return l6.i(u40.f("HostConfig(cc=", this.a, ", hl=", this.b, ", host="), this.c, ")");
    }
}
