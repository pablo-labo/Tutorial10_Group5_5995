package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n22 extends gr6 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final gr6[] f;

    public n22(String str, boolean z, boolean z2, String[] strArr, gr6[] gr6VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = gr6VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n22.class != obj.getClass()) {
            return false;
        }
        n22 n22Var = (n22) obj;
        return this.c == n22Var.c && this.d == n22Var.d && this.b.equals(n22Var.b) && Arrays.equals(this.e, n22Var.e) && Arrays.equals(this.f, n22Var.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
