package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a77<T> {
    public final us9 a;
    public final T b;
    public final T c;
    public final us9 d;
    public final String e;
    public final a62 f;

    /* JADX WARN: Multi-variable type inference failed */
    public a77(us9 us9Var, Object obj, us9 us9Var2, us9 us9Var3, String str, a62 a62Var) {
        str.getClass();
        a62Var.getClass();
        this.a = us9Var;
        this.b = obj;
        this.c = us9Var2;
        this.d = us9Var3;
        this.e = str;
        this.f = a62Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a77)) {
            return false;
        }
        a77 a77Var = (a77) obj;
        return this.a.equals(a77Var.a) && wl7.b(this.b, a77Var.b) && wl7.b(this.c, a77Var.c) && this.d.equals(a77Var.d) && wl7.b(this.e, a77Var.e) && wl7.b(this.f, a77Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        T t = this.b;
        int iHashCode2 = (iHashCode + (t == null ? 0 : t.hashCode())) * 31;
        T t2 = this.c;
        return this.f.hashCode() + akb.d((this.d.hashCode() + ((iHashCode2 + (t2 != null ? t2.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.a + ", compilerVersion=" + this.b + ", languageVersion=" + this.c + ", expectedVersion=" + this.d + ", filePath=" + this.e + ", classId=" + this.f + ')';
    }
}
