package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h97 {
    public final String a;
    public final String b;
    public final String c;

    public h97(String str, String str2, String str3) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h97)) {
            return false;
        }
        h97 h97Var = (h97) obj;
        return this.a.equals(h97Var.a) && this.b.equals(h97Var.b) && wl7.b(this.c, h97Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return l6.i(u40.f("IndeedLocale(cc=", this.a, ", hl=", this.b, ", host="), this.c, ")");
    }
}
