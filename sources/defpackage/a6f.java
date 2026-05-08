package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a6f {
    public final String a;
    public final int b;
    public final ah2 c;

    public a6f(String str, int i, ah2 ah2Var) {
        this.a = str;
        this.b = i;
        this.c = ah2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a6f) {
            a6f a6fVar = (a6f) obj;
            return this.a.equals(a6fVar.a) && this.b == a6fVar.b && this.c == a6fVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + w40.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbH = w40.h(this.b, "TabConfig(count=", this.a, ", title=", ", view=");
        sbH.append(this.c);
        sbH.append(")");
        return sbH.toString();
    }
}
