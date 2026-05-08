package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j6f {

    @b8e("eventName")
    public final String a = "tabMounted";

    @b8e("name")
    public final String b;

    @b8e("path")
    public final String c;

    @b8e("tab")
    public final String d;

    public j6f(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6f)) {
            return false;
        }
        j6f j6fVar = (j6f) obj;
        return this.a.equals(j6fVar.a) && this.b.equals(j6fVar.b) && this.c.equals(j6fVar.c) && this.d.equals(j6fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return z3.n(u40.f("TabMountedEvent(eventName=", this.a, ", name=", this.b, ", path="), this.c, ", tab=", this.d, ")");
    }
}
