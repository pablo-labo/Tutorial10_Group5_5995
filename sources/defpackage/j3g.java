package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j3g {
    public final String a;
    public final int b;
    public final String c;

    public j3g(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3g)) {
            return false;
        }
        j3g j3gVar = (j3g) obj;
        return wl7.b(this.a, j3gVar.a) && this.b == j3gVar.b && wl7.b(this.c, j3gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + w40.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return l6.i(w40.h(this.b, "UIPRecentSearchCountResult(key=", this.a, ", newCount=", ", status="), this.c, ")");
    }
}
