package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ux8 {
    public final String a;
    public final String b;

    public ux8(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux8)) {
            return false;
        }
        ux8 ux8Var = (ux8) obj;
        return this.a.equals(ux8Var.a) && wl7.b(this.b, ux8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return akb.k("LinkItem(id=", this.a, ", link=", this.b, ")");
    }
}
