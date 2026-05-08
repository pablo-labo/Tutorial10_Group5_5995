package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d6 extends a6 {
    public static d6 e;
    public static final b5d f = b5d.b;
    public static final b5d g = b5d.a;
    public mif c;
    public f5e d;

    @Override // defpackage.a6
    public final int[] a(int i) {
        int iE;
        if (c().length() > 0 && i < c().length()) {
            try {
                f5e f5eVar = this.d;
                if (f5eVar == null) {
                    wl7.g("node");
                    throw null;
                }
                qtc qtcVarG = f5eVar.g();
                int iRound = Math.round(qtcVarG.d - qtcVarG.b);
                if (i <= 0) {
                    i = 0;
                }
                mif mifVar = this.c;
                if (mifVar == null) {
                    wl7.g("layoutResult");
                    throw null;
                }
                int iD = mifVar.b.d(i);
                mif mifVar2 = this.c;
                if (mifVar2 == null) {
                    wl7.g("layoutResult");
                    throw null;
                }
                float f2 = mifVar2.b.f(iD) + iRound;
                mif mifVar3 = this.c;
                if (mifVar3 == null) {
                    wl7.g("layoutResult");
                    throw null;
                }
                float f3 = mifVar3.b.f(r0.f - 1);
                mif mifVar4 = this.c;
                if (f2 < f3) {
                    if (mifVar4 == null) {
                        wl7.g("layoutResult");
                        throw null;
                    }
                    iE = mifVar4.b.e(f2);
                } else {
                    if (mifVar4 == null) {
                        wl7.g("layoutResult");
                        throw null;
                    }
                    iE = mifVar4.b.f;
                }
                return b(i, e(iE - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.a6
    public final int[] d(int i) {
        int iE;
        if (c().length() > 0 && i > 0) {
            try {
                f5e f5eVar = this.d;
                if (f5eVar == null) {
                    wl7.g("node");
                    throw null;
                }
                qtc qtcVarG = f5eVar.g();
                int iRound = Math.round(qtcVarG.d - qtcVarG.b);
                int length = c().length();
                if (length <= i) {
                    i = length;
                }
                mif mifVar = this.c;
                if (mifVar == null) {
                    wl7.g("layoutResult");
                    throw null;
                }
                int iD = mifVar.b.d(i);
                mif mifVar2 = this.c;
                if (mifVar2 == null) {
                    wl7.g("layoutResult");
                    throw null;
                }
                float f2 = mifVar2.b.f(iD) - iRound;
                if (f2 > 0.0f) {
                    mif mifVar3 = this.c;
                    if (mifVar3 == null) {
                        wl7.g("layoutResult");
                        throw null;
                    }
                    iE = mifVar3.b.e(f2);
                } else {
                    iE = 0;
                }
                if (i == c().length() && iE < iD) {
                    iE++;
                }
                return b(e(iE, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int e(int i, b5d b5dVar) {
        mif mifVar = this.c;
        if (mifVar == null) {
            wl7.g("layoutResult");
            throw null;
        }
        int iG = mifVar.g(i);
        mif mifVar2 = this.c;
        if (mifVar2 == null) {
            wl7.g("layoutResult");
            throw null;
        }
        b5d b5dVarH = mifVar2.h(iG);
        mif mifVar3 = this.c;
        if (b5dVar != b5dVarH) {
            if (mifVar3 != null) {
                return mifVar3.g(i);
            }
            wl7.g("layoutResult");
            throw null;
        }
        if (mifVar3 != null) {
            return mifVar3.b.c(i, false) - 1;
        }
        wl7.g("layoutResult");
        throw null;
    }
}
