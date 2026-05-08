package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tb1 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public tb1(String str, int i, int i2, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb1)) {
            return false;
        }
        tb1 tb1Var = (tb1) obj;
        return this.c == tb1Var.c && this.d == tb1Var.d && Objects.equals(this.a, tb1Var.a) && Objects.equals(this.b, tb1Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
