package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y07 implements l85 {
    public final k07 a;
    public final boolean b;
    public final we3 c;

    public y07(k07 k07Var, boolean z, we3 we3Var) {
        this.a = k07Var;
        this.b = z;
        this.c = we3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y07)) {
            return false;
        }
        y07 y07Var = (y07) obj;
        return this.a.equals(y07Var.a) && this.b == y07Var.b && this.c == y07Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ia.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ')';
    }
}
