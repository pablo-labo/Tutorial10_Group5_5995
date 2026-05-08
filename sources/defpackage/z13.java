package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z13 {
    public final int a;
    public final String b;
    public final String c;

    public z13(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z13)) {
            return false;
        }
        z13 z13Var = (z13) obj;
        return this.a == z13Var.a && this.b.equals(z13Var.b) && this.c.equals(z13Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return l6.i(m6.j(this.a, "Country(regionCode=", ", name=", this.b, ", flagEmoji="), this.c, ")");
    }
}
