package defpackage;

import defpackage.jwa;

/* JADX INFO: loaded from: classes.dex */
public final class lwa {
    public static void a(gb4 gb4Var, jwa jwaVar, long j) {
        ib5 ib5Var = ib5.a;
        if (jwaVar instanceof jwa.b) {
            qtc qtcVar = ((jwa.b) jwaVar).a;
            float f = qtcVar.a;
            gb4Var.D1(j, (((long) Float.floatToRawIntBits(qtcVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), b(qtcVar), 1.0f, ib5Var, null, 3);
            return;
        }
        if (!(jwaVar instanceof jwa.c)) {
            if (jwaVar instanceof jwa.a) {
                gb4Var.D(((jwa.a) jwaVar).a, j, 1.0f, ib5Var);
                return;
            } else {
                l.g();
                return;
            }
        }
        jwa.c cVar = (jwa.c) jwaVar;
        m80 m80Var = cVar.b;
        if (m80Var != null) {
            gb4Var.D(m80Var, j, 1.0f, ib5Var);
            return;
        }
        zfd zfdVar = cVar.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (zfdVar.h >> 32));
        gb4Var.p0(j, (((long) Float.floatToRawIntBits(zfdVar.a)) << 32) | (((long) Float.floatToRawIntBits(zfdVar.b)) & 4294967295L), (((long) Float.floatToRawIntBits(zfdVar.b())) << 32) | (((long) Float.floatToRawIntBits(zfdVar.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), ib5Var);
    }

    public static final long b(qtc qtcVar) {
        float f = qtcVar.c - qtcVar.a;
        return (((long) Float.floatToRawIntBits(qtcVar.d - qtcVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }
}
