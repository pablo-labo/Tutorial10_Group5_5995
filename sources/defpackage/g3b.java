package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g3b {
    public final k80 a;
    public final int b;
    public final int c;

    public g3b(k80 k80Var, int i, int i2) {
        this.a = k80Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g3b) {
            g3b g3bVar = (g3b) obj;
            if (this.a == g3bVar.a && this.b == g3bVar.b && this.c == g3bVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + w40.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return k6.h(sb, this.c, ')');
    }
}
