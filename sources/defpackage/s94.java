package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s94 {
    public static final boolean a(r94 r94Var, long j) {
        if (!r94Var.a.c0) {
            return false;
        }
        pe7 pe7Var = us3.f(r94Var).t0.c;
        if (!pe7Var.J0.c0) {
            return false;
        }
        long jA0 = pe7Var.a0(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA0 & 4294967295L));
        long j2 = r94Var.g0;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }
}
