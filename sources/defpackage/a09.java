package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a09 {
    public final String a;
    public final boolean b;

    public a09(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a09)) {
            return false;
        }
        a09 a09Var = (a09) obj;
        return wl7.b(this.a, a09Var.a) && this.b == a09Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadUrlEvent(url=" + this.a + ", clearHistory=" + this.b + ")";
    }
}
