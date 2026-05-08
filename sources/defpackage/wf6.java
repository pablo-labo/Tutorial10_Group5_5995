package defpackage;

import android.graphics.PointF;
import defpackage.mhf;

/* JADX INFO: loaded from: classes.dex */
public final class wf6 {
    public static final int a(lu8 lu8Var, long j, opg opgVar) {
        mif mifVar;
        long jP;
        int iE;
        nif nifVarD = lu8Var.d();
        if (nifVarD != null && (mifVar = nifVarD.a) != null) {
            q1a q1aVar = mifVar.b;
            sl8 sl8VarC = lu8Var.c();
            if (sl8VarC != null && (iE = e(q1aVar, (jP = sl8VarC.p(j)), opgVar)) != -1) {
                return q1aVar.g(ooa.a(jP, 1, (q1aVar.b(iE) + q1aVar.f(iE)) / 2.0f));
            }
        }
        return -1;
    }

    public static final long b(lu8 lu8Var, qtc qtcVar, qtc qtcVar2, int i) {
        long jF = f(lu8Var, qtcVar, i);
        if (kjf.c(jF)) {
            return kjf.b;
        }
        long jF2 = f(lu8Var, qtcVar2, i);
        if (kjf.c(jF2)) {
            return kjf.b;
        }
        int i2 = (int) (jF >> 32);
        int i3 = (int) (jF2 & 4294967295L);
        return cr8.c(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final boolean c(mif mifVar, int i) {
        int iD = mifVar.b.d(i);
        return i == mifVar.g(iD) || i == mifVar.b.c(iD, false) ? mifVar.h(i) != mifVar.a(i) : mifVar.a(i) != mifVar.a(i - 1);
    }

    public static final long d(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final int e(q1a q1aVar, long j, opg opgVar) {
        float fG = opgVar != null ? opgVar.g() : 0.0f;
        int i = (int) (4294967295L & j);
        int iE = q1aVar.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < q1aVar.f(iE) - fG || Float.intBitsToFloat(i) > q1aVar.b(iE) + fG) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fG) || Float.intBitsToFloat(i2) > q1aVar.d + fG) {
            return -1;
        }
        return iE;
    }

    public static final long f(lu8 lu8Var, qtc qtcVar, int i) {
        mif mifVar;
        nif nifVarD = lu8Var.d();
        q1a q1aVar = (nifVarD == null || (mifVar = nifVarD.a) == null) ? null : mifVar.b;
        sl8 sl8VarC = lu8Var.c();
        return (q1aVar == null || sl8VarC == null) ? kjf.b : q1aVar.h(qtcVar.i(sl8VarC.p(0L)), i, mhf.a.b);
    }

    public static final boolean g(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean h(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean i(int i) {
        int type;
        return (!h(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }
}
