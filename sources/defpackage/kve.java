package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kve extends n3b {
    public final String a;
    public final String b;

    public kve(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kve)) {
            return false;
        }
        kve kveVar = (kve) obj;
        return wl7.b(this.a, kveVar.a) && wl7.b(this.b, kveVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return o6.f(this.a, "='", this.b, "'");
    }
}
