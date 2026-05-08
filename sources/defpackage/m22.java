package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m22 extends gr6 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final gr6[] g;

    public m22(String str, int i, int i2, long j, long j2, gr6[] gr6VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = gr6VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m22.class != obj.getClass()) {
            return false;
        }
        m22 m22Var = (m22) obj;
        return this.c == m22Var.c && this.d == m22Var.d && this.e == m22Var.e && this.f == m22Var.f && this.b.equals(m22Var.b) && Arrays.equals(this.g, m22Var.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
