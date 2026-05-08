package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d52 {
    public final String a;
    public final String b;

    public d52(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d52)) {
            return false;
        }
        d52 d52Var = (d52) obj;
        return wl7.b(this.a, d52Var.a) && wl7.b(this.b, d52Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return akb.k("ClaimJobSeekerSlugInput(firstName=", this.a, ", lastName=", this.b, ")");
    }
}
