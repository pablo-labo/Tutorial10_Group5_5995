package defpackage;

import android.content.Context;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;

/* JADX INFO: loaded from: classes2.dex */
public final class aj1 {
    public ou8 a = null;
    public ou8 b = null;
    public ou8 c = null;
    public ou8 d = null;
    public ou8 e = null;
    public ou8 f = null;
    public ou8 g = null;
    public ou8 h = null;
    public ou8 i = null;
    public ou8 j = null;
    public ou8 k = null;
    public ou8 l = null;
    public ou8 m = null;

    public aj1(int i) {
    }

    public static cn2 a(q03 q03Var, q03 q03Var2, q03 q03Var3, q03 q03Var4, float f, float f2) {
        float f3 = q03Var.b;
        float f4 = q03Var3.b;
        float f5 = f3 + f4;
        float f6 = q03Var.a;
        float f7 = q03Var2.a;
        float f8 = f6 + f7;
        float f9 = q03Var2.b;
        float f10 = q03Var4.b;
        float f11 = f9 + f10;
        float f12 = q03Var3.a;
        float f13 = q03Var4.a;
        float f14 = f12 + f13;
        float fMin = f5 > 0.0f ? Math.min(f2 / f5, 1.0f) : 0.0f;
        float fMin2 = f8 > 0.0f ? Math.min(f / f8, 1.0f) : 0.0f;
        float fMin3 = f11 > 0.0f ? Math.min(f2 / f11, 1.0f) : 0.0f;
        float fMin4 = f14 > 0.0f ? Math.min(f / f14, 1.0f) : 0.0f;
        return new cn2(new q03(Math.min(fMin2, fMin) * f6, Math.min(fMin2, fMin) * f3), new q03(Math.min(fMin3, fMin2) * f7, Math.min(fMin3, fMin2) * f9), new q03(Math.min(fMin4, fMin) * f12, Math.min(fMin4, fMin) * f4), new q03(Math.min(fMin4, fMin3) * f13, Math.min(fMin4, fMin3) * f10));
    }

    public final boolean b() {
        return (this.a == null && this.b == null && this.c == null && this.d == null && this.e == null && this.f == null && this.g == null && this.h == null && this.i == null && this.j == null && this.k == null && this.l == null && this.m == null) ? false : true;
    }

    public final cn2 c(int i, Context context, float f, float f2) {
        context.getClass();
        q03 q03Var = new q03(0.0f, 0.0f);
        if (i == 0) {
            ou8 ou8Var = this.j;
            if (ou8Var == null && (ou8Var = this.f) == null && (ou8Var = this.b) == null) {
                ou8Var = this.a;
            }
            q03 q03Var2 = ou8Var != null ? new q03(ou8Var, f, f2) : q03Var;
            ou8 ou8Var2 = this.l;
            if (ou8Var2 == null && (ou8Var2 = this.g) == null && (ou8Var2 = this.c) == null) {
                ou8Var2 = this.a;
            }
            q03 q03Var3 = ou8Var2 != null ? new q03(ou8Var2, f, f2) : q03Var;
            ou8 ou8Var3 = this.k;
            if (ou8Var3 == null && (ou8Var3 = this.h) == null && (ou8Var3 = this.d) == null) {
                ou8Var3 = this.a;
            }
            q03 q03Var4 = ou8Var3 != null ? new q03(ou8Var3, f, f2) : q03Var;
            ou8 ou8Var4 = this.m;
            if (ou8Var4 == null && (ou8Var4 = this.i) == null && (ou8Var4 = this.e) == null) {
                ou8Var4 = this.a;
            }
            if (ou8Var4 != null) {
                q03Var = new q03(ou8Var4, f, f2);
            }
            return a(q03Var2, q03Var3, q03Var4, q03Var, f, f2);
        }
        if (i != 1) {
            l5.q("Expected?.resolved layout direction");
            return null;
        }
        boolean z = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
        ou8 ou8Var5 = this.l;
        if (z) {
            if (ou8Var5 == null && (ou8Var5 = this.g) == null && (ou8Var5 = this.c) == null) {
                ou8Var5 = this.a;
            }
            q03 q03Var5 = ou8Var5 != null ? new q03(ou8Var5, f, f2) : q03Var;
            ou8 ou8Var6 = this.j;
            if (ou8Var6 == null && (ou8Var6 = this.f) == null && (ou8Var6 = this.b) == null) {
                ou8Var6 = this.a;
            }
            q03 q03Var6 = ou8Var6 != null ? new q03(ou8Var6, f, f2) : q03Var;
            ou8 ou8Var7 = this.m;
            if (ou8Var7 == null && (ou8Var7 = this.i) == null && (ou8Var7 = this.e) == null) {
                ou8Var7 = this.a;
            }
            q03 q03Var7 = ou8Var7 != null ? new q03(ou8Var7, f, f2) : q03Var;
            ou8 ou8Var8 = this.k;
            if (ou8Var8 == null && (ou8Var8 = this.h) == null && (ou8Var8 = this.d) == null) {
                ou8Var8 = this.a;
            }
            if (ou8Var8 != null) {
                q03Var = new q03(ou8Var8, f, f2);
            }
            return a(q03Var5, q03Var6, q03Var7, q03Var, f, f2);
        }
        if (ou8Var5 == null && (ou8Var5 = this.g) == null && (ou8Var5 = this.b) == null) {
            ou8Var5 = this.a;
        }
        q03 q03Var8 = ou8Var5 != null ? new q03(ou8Var5, f, f2) : q03Var;
        ou8 ou8Var9 = this.j;
        if (ou8Var9 == null && (ou8Var9 = this.f) == null && (ou8Var9 = this.c) == null) {
            ou8Var9 = this.a;
        }
        q03 q03Var9 = ou8Var9 != null ? new q03(ou8Var9, f, f2) : q03Var;
        ou8 ou8Var10 = this.m;
        if (ou8Var10 == null && (ou8Var10 = this.h) == null && (ou8Var10 = this.d) == null) {
            ou8Var10 = this.a;
        }
        q03 q03Var10 = ou8Var10 != null ? new q03(ou8Var10, f, f2) : q03Var;
        ou8 ou8Var11 = this.k;
        if (ou8Var11 == null && (ou8Var11 = this.i) == null && (ou8Var11 = this.e) == null) {
            ou8Var11 = this.a;
        }
        if (ou8Var11 != null) {
            q03Var = new q03(ou8Var11, f, f2);
        }
        return a(q03Var8, q03Var9, q03Var10, q03Var, f, f2);
    }

    public final void d(zi1 zi1Var, ou8 ou8Var) {
        zi1Var.getClass();
        switch (zi1Var.ordinal()) {
            case 0:
                this.a = ou8Var;
                break;
            case 1:
                this.b = ou8Var;
                break;
            case 2:
                this.c = ou8Var;
                break;
            case 3:
                this.e = ou8Var;
                break;
            case 4:
                this.d = ou8Var;
                break;
            case 5:
                this.f = ou8Var;
                break;
            case 6:
                this.g = ou8Var;
                break;
            case 7:
                this.h = ou8Var;
                break;
            case 8:
                this.i = ou8Var;
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                this.m = ou8Var;
                break;
            case 10:
                this.l = ou8Var;
                break;
            case 11:
                this.k = ou8Var;
                break;
            case 12:
                this.j = ou8Var;
                break;
            default:
                l.g();
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj1)) {
            return false;
        }
        aj1 aj1Var = (aj1) obj;
        return wl7.b(this.a, aj1Var.a) && wl7.b(this.b, aj1Var.b) && wl7.b(this.c, aj1Var.c) && wl7.b(this.d, aj1Var.d) && wl7.b(this.e, aj1Var.e) && wl7.b(this.f, aj1Var.f) && wl7.b(this.g, aj1Var.g) && wl7.b(this.h, aj1Var.h) && wl7.b(this.i, aj1Var.i) && wl7.b(this.j, aj1Var.j) && wl7.b(this.k, aj1Var.k) && wl7.b(this.l, aj1Var.l) && wl7.b(this.m, aj1Var.m);
    }

    public final int hashCode() {
        ou8 ou8Var = this.a;
        int iHashCode = (ou8Var == null ? 0 : ou8Var.hashCode()) * 31;
        ou8 ou8Var2 = this.b;
        int iHashCode2 = (iHashCode + (ou8Var2 == null ? 0 : ou8Var2.hashCode())) * 31;
        ou8 ou8Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (ou8Var3 == null ? 0 : ou8Var3.hashCode())) * 31;
        ou8 ou8Var4 = this.d;
        int iHashCode4 = (iHashCode3 + (ou8Var4 == null ? 0 : ou8Var4.hashCode())) * 31;
        ou8 ou8Var5 = this.e;
        int iHashCode5 = (iHashCode4 + (ou8Var5 == null ? 0 : ou8Var5.hashCode())) * 31;
        ou8 ou8Var6 = this.f;
        int iHashCode6 = (iHashCode5 + (ou8Var6 == null ? 0 : ou8Var6.hashCode())) * 31;
        ou8 ou8Var7 = this.g;
        int iHashCode7 = (iHashCode6 + (ou8Var7 == null ? 0 : ou8Var7.hashCode())) * 31;
        ou8 ou8Var8 = this.h;
        int iHashCode8 = (iHashCode7 + (ou8Var8 == null ? 0 : ou8Var8.hashCode())) * 31;
        ou8 ou8Var9 = this.i;
        int iHashCode9 = (iHashCode8 + (ou8Var9 == null ? 0 : ou8Var9.hashCode())) * 31;
        ou8 ou8Var10 = this.j;
        int iHashCode10 = (iHashCode9 + (ou8Var10 == null ? 0 : ou8Var10.hashCode())) * 31;
        ou8 ou8Var11 = this.k;
        int iHashCode11 = (iHashCode10 + (ou8Var11 == null ? 0 : ou8Var11.hashCode())) * 31;
        ou8 ou8Var12 = this.l;
        int iHashCode12 = (iHashCode11 + (ou8Var12 == null ? 0 : ou8Var12.hashCode())) * 31;
        ou8 ou8Var13 = this.m;
        return iHashCode12 + (ou8Var13 != null ? ou8Var13.hashCode() : 0);
    }

    public final String toString() {
        return "BorderRadiusStyle(uniform=" + this.a + ", topLeft=" + this.b + ", topRight=" + this.c + ", bottomLeft=" + this.d + ", bottomRight=" + this.e + ", topStart=" + this.f + ", topEnd=" + this.g + ", bottomStart=" + this.h + ", bottomEnd=" + this.i + ", startStart=" + this.j + ", startEnd=" + this.k + ", endStart=" + this.l + ", endEnd=" + this.m + ")";
    }
}
