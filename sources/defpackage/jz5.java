package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class jz5 implements nfb {
    public final kf5 a;
    public final cw5 b;

    public jz5(kf5 kf5Var, cw5 cw5Var) {
        this.a = kf5Var;
        this.b = cw5Var;
    }

    @Override // defpackage.kf5
    public final int a() {
        return this.b.a[r2.length - 1] * this.a.a();
    }

    @Override // defpackage.kf5
    public final BigInteger b() {
        return this.a.b();
    }

    @Override // defpackage.nfb
    public final cw5 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz5)) {
            return false;
        }
        jz5 jz5Var = (jz5) obj;
        return this.a.equals(jz5Var.a) && this.b.equals(jz5Var.b);
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.b.hashCode(), 16) ^ this.a.hashCode();
    }
}
