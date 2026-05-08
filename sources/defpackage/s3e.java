package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s3e {
    public final jf6 a;
    public final long b;
    public final r3e c;
    public final boolean d;

    public s3e(jf6 jf6Var, long j, r3e r3eVar, boolean z) {
        this.a = jf6Var;
        this.b = j;
        this.c = r3eVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3e)) {
            return false;
        }
        s3e s3eVar = (s3e) obj;
        return this.a == s3eVar.a && ooa.c(this.b, s3eVar.b) && this.c == s3eVar.c && this.d == s3eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ia.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) ooa.h(this.b));
        sb.append(", anchor=");
        sb.append(this.c);
        sb.append(", visible=");
        return m6.i(sb, this.d, ')');
    }
}
