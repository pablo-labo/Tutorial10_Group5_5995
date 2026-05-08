package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ku9 extends gr6 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public ku9(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ku9.class != obj.getClass()) {
            return false;
        }
        ku9 ku9Var = (ku9) obj;
        return this.b == ku9Var.b && this.c == ku9Var.c && this.d == ku9Var.d && Arrays.equals(this.e, ku9Var.e) && Arrays.equals(this.f, ku9Var.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
