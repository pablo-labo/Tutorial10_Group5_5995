package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c94 {
    public final String a;
    public final String b;
    public final String c;

    public c94(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c94)) {
            return false;
        }
        c94 c94Var = (c94) obj;
        return this.a.equals(c94Var.a) && this.b.equals(c94Var.b) && this.c.equals(c94Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return l6.i(u40.f("DownloadInfo(url=", this.a, ", contentDisposition=", this.b, ", mimetype="), this.c, ")");
    }
}
