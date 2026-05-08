package defpackage;

import defpackage.p2e;

/* JADX INFO: loaded from: classes.dex */
public final class k4e {
    public static final qtc a = new qtc(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[jf6.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final boolean a(qtc qtcVar, long j) {
        float f = qtcVar.a;
        float f2 = qtcVar.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = qtcVar.b;
        float f4 = qtcVar.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    public static final long b(j4e j4eVar, long j, p2e.a aVar) {
        sl8 sl8Var;
        sl8 sl8VarD;
        int i;
        float fB;
        uzd uzdVarD = j4eVar.d(aVar);
        if (uzdVarD == null || (sl8Var = j4eVar.m) == null || (sl8VarD = uzdVarD.d()) == null || (i = aVar.b) > uzdVarD.f()) {
            return 9205357640488583168L;
        }
        ooa ooaVar = (ooa) ((gme) j4eVar.t).getValue();
        ooaVar.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sl8VarD.G(sl8Var, ooaVar.a) >> 32));
        long jM = uzdVarD.m(i);
        if (kjf.c(jM)) {
            fB = uzdVarD.e(i);
        } else {
            float fE = uzdVarD.e((int) (jM >> 32));
            float fB2 = uzdVarD.b(((int) (jM & 4294967295L)) - 1);
            fB = nic.B(fIntBitsToFloat, Math.min(fE, fB2), Math.max(fE, fB2));
        }
        if (fB == -1.0f) {
            return 9205357640488583168L;
        }
        if (!th7.b(j, 0L) && Math.abs(fIntBitsToFloat - fB) > ((int) (j >> 32)) / 2) {
            return 9205357640488583168L;
        }
        float fG = uzdVarD.g(i);
        if (fG == -1.0f) {
            return 9205357640488583168L;
        }
        return sl8Var.G(sl8VarD, (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fG)) & 4294967295L));
    }

    public static final qtc c(sl8 sl8Var) {
        qtc qtcVarH = ojh.h(sl8Var);
        long jB = sl8Var.B(qtcVarH.d());
        float f = qtcVarH.c;
        float f2 = qtcVarH.d;
        long jB2 = sl8Var.B((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new qtc(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & 4294967295L)), Float.intBitsToFloat((int) (jB2 >> 32)), Float.intBitsToFloat((int) (jB2 & 4294967295L)));
    }
}
