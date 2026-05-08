package defpackage;

import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes3.dex */
public final class cj8 implements Comparable<cj8> {
    public static final cj8 e = new cj8(2, 2, 10);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public cj8(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.d = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + JwtParser.SEPARATOR_CHAR + i2 + JwtParser.SEPARATOR_CHAR + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(cj8 cj8Var) {
        cj8 cj8Var2 = cj8Var;
        cj8Var2.getClass();
        return this.d - cj8Var2.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        cj8 cj8Var = obj instanceof cj8 ? (cj8) obj : null;
        return cj8Var != null && this.d == cj8Var.d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.b);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.c);
        return sb.toString();
    }
}
