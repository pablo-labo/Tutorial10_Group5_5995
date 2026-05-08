package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rne implements l85 {
    public final g37 a;
    public final String b;
    public final we3 c;

    public rne(g37 g37Var, String str, we3 we3Var) {
        this.a = g37Var;
        this.b = str;
        this.c = we3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rne)) {
            return false;
        }
        rne rneVar = (rne) obj;
        return wl7.b(this.a, rneVar.a) && wl7.b(this.b, rneVar.b) && this.c == rneVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ')';
    }
}
