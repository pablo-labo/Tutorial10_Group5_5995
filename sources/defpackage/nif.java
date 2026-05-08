package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nif {
    public final mif a;
    public sl8 b = null;
    public sl8 c;

    public nif(mif mifVar, sl8 sl8Var) {
        this.a = mifVar;
        this.c = sl8Var;
    }

    public final long a(long j) {
        qtc qtcVarJ;
        sl8 sl8Var = this.b;
        qtc qtcVar = qtc.e;
        if (sl8Var != null) {
            if (sl8Var.d()) {
                sl8 sl8Var2 = this.c;
                qtcVarJ = sl8Var2 != null ? sl8Var2.J(sl8Var, true) : null;
            } else {
                qtcVarJ = qtcVar;
            }
            if (qtcVarJ != null) {
                qtcVar = qtcVarJ;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = qtcVar.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = qtcVar.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = qtcVar.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = qtcVar.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        mif mifVar = this.a;
        int iE = mifVar.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= mifVar.e(iE) && Float.intBitsToFloat(i) <= mifVar.f(iE);
    }

    public final long d(long j) {
        sl8 sl8Var;
        sl8 sl8Var2 = this.b;
        if (sl8Var2 != null) {
            if (!sl8Var2.d()) {
                sl8Var2 = null;
            }
            if (sl8Var2 != null && (sl8Var = this.c) != null) {
                sl8 sl8Var3 = sl8Var.d() ? sl8Var : null;
                if (sl8Var3 != null) {
                    return sl8Var2.G(sl8Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        sl8 sl8Var;
        sl8 sl8Var2 = this.b;
        if (sl8Var2 != null) {
            if (!sl8Var2.d()) {
                sl8Var2 = null;
            }
            if (sl8Var2 != null && (sl8Var = this.c) != null) {
                sl8 sl8Var3 = sl8Var.d() ? sl8Var : null;
                if (sl8Var3 != null) {
                    return sl8Var3.G(sl8Var2, j);
                }
            }
        }
        return j;
    }
}
