package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jef {
    public static void a(jhf jhfVar, qdf qdfVar, mif mifVar, sl8 sl8Var, whf whfVar, boolean z, roa roaVar) {
        if (z) {
            int iC = roaVar.c(kjf.e(jhfVar.b));
            String str = kef.a;
            qtc qtcVarB = iC < mifVar.a.a.b.length() ? mifVar.b(iC) : iC != 0 ? mifVar.b(iC - 1) : new qtc(0.0f, 0.0f, 1.0f, (int) (kef.a(qdfVar.b, qdfVar.g, qdfVar.h, kef.a, 1) & 4294967295L));
            float f = qtcVarB.b;
            float f2 = qtcVarB.a;
            long jA0 = sl8Var.a0((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            qtc qtcVarA = web.a((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jA0 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jA0 >> 32)))) << 32), (((long) Float.floatToRawIntBits(qtcVarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(qtcVarB.d - f)) & 4294967295L));
            if (wl7.b(whfVar.a.b.get(), whfVar)) {
                whfVar.b.f(qtcVarA);
            }
        }
    }
}
