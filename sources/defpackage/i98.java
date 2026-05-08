package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class i98 {
    public static final d47<Integer> a;

    static {
        d47<Integer> d47Var = new d47<>(4);
        Collections.addAll(d47Var, 2, 7, 4, 5);
        a = d47Var;
    }

    public static final int a(yfd yfdVar, vs4 vs4Var) {
        vs4Var.getClass();
        vs4Var.b0();
        Integer numValueOf = Integer.valueOf(vs4Var.d);
        d47<Integer> d47Var = a;
        int iIndexOf = d47Var.indexOf(numValueOf);
        int i = 0;
        if (iIndexOf < 0) {
            l5.q("Only accepts inverted exif orientations");
            return 0;
        }
        int i2 = yfdVar.a;
        if (i2 != -1) {
            if (i2 == -1) {
                r6.g("Rotation is set to use EXIF");
                return 0;
            }
            i = i2;
        }
        Integer num = d47Var.get(((i / 90) + iIndexOf) % d47Var.size());
        num.getClass();
        return num.intValue();
    }

    public static final int b(yfd yfdVar, vs4 vs4Var) {
        int i;
        yfdVar.getClass();
        vs4Var.getClass();
        int i2 = yfdVar.a;
        if (i2 != -2) {
            vs4Var.b0();
            int i3 = vs4Var.c;
            if (i3 == 90 || i3 == 180 || i3 == 270) {
                vs4Var.b0();
                i = vs4Var.c;
            } else {
                i = 0;
            }
            if (i2 == -1) {
                return i;
            }
            if (i2 != -1) {
                return (i2 + i) % 360;
            }
            r6.g("Rotation is set to use EXIF");
        }
        return 0;
    }

    public static final int c(yfd yfdVar, x4d x4dVar, vs4 vs4Var, boolean z) {
        int i;
        int i2;
        vs4Var.getClass();
        if (z && x4dVar != null) {
            int iB = b(yfdVar, vs4Var);
            vs4Var.b0();
            int iA = a.contains(Integer.valueOf(vs4Var.d)) ? a(yfdVar, vs4Var) : 0;
            boolean z2 = iB == 90 || iB == 270 || iA == 5 || iA == 7;
            if (z2) {
                vs4Var.b0();
                i = vs4Var.f;
            } else {
                vs4Var.b0();
                i = vs4Var.e;
            }
            if (z2) {
                vs4Var.b0();
                i2 = vs4Var.e;
            } else {
                vs4Var.b0();
                i2 = vs4Var.f;
            }
            float f = i;
            float f2 = i2;
            float fMax = Math.max(x4dVar.a / f, x4dVar.b / f2);
            if (f * fMax > 2048.0f) {
                fMax = 2048.0f / f;
            }
            if (f2 * fMax > 2048.0f) {
                fMax = 2048.0f / f2;
            }
            int i3 = (int) ((fMax * 8.0f) + 0.6666667f);
            if (i3 <= 8) {
                if (i3 < 1) {
                    return 1;
                }
                return i3;
            }
        }
        return 8;
    }
}
