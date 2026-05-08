package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kmg extends hmg {
    public final float V;
    public final float W;
    public final int X;
    public final int Y;
    public final float Z;
    public final String a;
    public final float a0;
    public final List<i6b> b;
    public final float b0;
    public final int c;
    public final float c0;
    public final sn1 d;
    public final float e;
    public final sn1 f;

    public kmg() {
        throw null;
    }

    public kmg(String str, List list, int i, sn1 sn1Var, float f, sn1 sn1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = sn1Var;
        this.e = f;
        this.f = sn1Var2;
        this.V = f2;
        this.W = f3;
        this.X = i2;
        this.Y = i3;
        this.Z = f4;
        this.a0 = f5;
        this.b0 = f6;
        this.c0 = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kmg.class == obj.getClass()) {
            kmg kmgVar = (kmg) obj;
            return wl7.b(this.a, kmgVar.a) && wl7.b(this.d, kmgVar.d) && this.e == kmgVar.e && wl7.b(this.f, kmgVar.f) && this.V == kmgVar.V && this.W == kmgVar.W && this.X == kmgVar.X && this.Y == kmgVar.Y && this.Z == kmgVar.Z && this.a0 == kmgVar.a0 && this.b0 == kmgVar.b0 && this.c0 == kmgVar.c0 && this.c == kmgVar.c && wl7.b(this.b, kmgVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int iG = ia.g(this.b, this.a.hashCode() * 31, 31);
        sn1 sn1Var = this.d;
        int iC = k6.c((iG + (sn1Var != null ? sn1Var.hashCode() : 0)) * 31, this.e, 31);
        sn1 sn1Var2 = this.f;
        return Integer.hashCode(this.c) + k6.c(k6.c(k6.c(k6.c(w40.c(this.Y, w40.c(this.X, k6.c(k6.c((iC + (sn1Var2 != null ? sn1Var2.hashCode() : 0)) * 31, this.V, 31), this.W, 31), 31), 31), this.Z, 31), this.a0, 31), this.b0, 31), this.c0, 31);
    }
}
