package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class knf {
    public final en6 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public knf(en6 en6Var, int i, int i2, int i3, int i4) {
        this.a = en6Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knf)) {
            return false;
        }
        knf knfVar = (knf) obj;
        return wl7.b(this.a, knfVar.a) && this.b == knfVar.b && this.c == knfVar.c && this.d == knfVar.d && this.e == knfVar.e;
    }

    public final int hashCode() {
        en6 en6Var = this.a;
        return Integer.hashCode(this.e) + w40.c(this.d, w40.c(this.c, w40.c(this.b, (en6Var == null ? 0 : en6Var.hashCode()) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenInfo(type=");
        sb.append(this.a);
        sb.append(", tokenStart=");
        sb.append(this.b);
        sb.append(", tokenEnd=");
        sb.append(this.c);
        sb.append(", rawIndex=");
        sb.append(this.d);
        sb.append(", normIndex=");
        return k6.h(sb, this.e, ')');
    }
}
