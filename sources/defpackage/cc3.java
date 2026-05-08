package defpackage;

import defpackage.jwa;

/* JADX INFO: loaded from: classes.dex */
public final class cc3 extends p03 {
    @Override // defpackage.p03
    public final p03 b(t03 t03Var, t03 t03Var2, t03 t03Var3, t03 t03Var4) {
        return new cc3(t03Var, t03Var2, t03Var3, t03Var4);
    }

    @Override // defpackage.p03
    public final jwa d(long j, float f, float f2, float f3, float f4, vl8 vl8Var) {
        if (f + f2 + f4 + f3 == 0.0f) {
            return new jwa.b(web.a(0L, j));
        }
        m80 m80VarA = p80.a();
        vl8 vl8Var2 = vl8.a;
        float f5 = vl8Var == vl8Var2 ? f : f2;
        m80VarA.j(0.0f, f5);
        m80VarA.n(f5, 0.0f);
        if (vl8Var == vl8Var2) {
            f = f2;
        }
        int i = (int) (j >> 32);
        m80VarA.n(Float.intBitsToFloat(i) - f, 0.0f);
        m80VarA.n(Float.intBitsToFloat(i), f);
        float f6 = vl8Var == vl8Var2 ? f3 : f4;
        int i2 = (int) (j & 4294967295L);
        m80VarA.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2) - f6);
        m80VarA.n(Float.intBitsToFloat(i) - f6, Float.intBitsToFloat(i2));
        if (vl8Var == vl8Var2) {
            f3 = f4;
        }
        m80VarA.n(f3, Float.intBitsToFloat(i2));
        m80VarA.n(0.0f, Float.intBitsToFloat(i2) - f3);
        m80VarA.close();
        return new jwa.a(m80VarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc3)) {
            return false;
        }
        cc3 cc3Var = (cc3) obj;
        return wl7.b(this.a, cc3Var.a) && wl7.b(this.b, cc3Var.b) && wl7.b(this.c, cc3Var.c) && wl7.b(this.d, cc3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CutCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
