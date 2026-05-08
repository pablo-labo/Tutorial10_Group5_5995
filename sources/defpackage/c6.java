package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c6 extends a6 {
    public static c6 d;
    public static final b5d e = b5d.b;
    public static final b5d f = b5d.a;
    public mif c;

    @Override // defpackage.a6
    public final int[] a(int i) {
        int iD;
        if (c().length() > 0 && i < c().length()) {
            mif mifVar = this.c;
            b5d b5dVar = e;
            if (i < 0) {
                if (mifVar == null) {
                    wl7.g("layoutResult");
                    throw null;
                }
                iD = mifVar.b.d(0);
            } else {
                if (mifVar == null) {
                    wl7.g("layoutResult");
                    throw null;
                }
                int iD2 = mifVar.b.d(i);
                iD = e(iD2, b5dVar) == i ? iD2 : iD2 + 1;
            }
            mif mifVar2 = this.c;
            if (mifVar2 == null) {
                wl7.g("layoutResult");
                throw null;
            }
            if (iD < mifVar2.b.f) {
                return b(e(iD, b5dVar), e(iD, f) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.a6
    public final int[] d(int i) {
        int iD;
        if (c().length() > 0 && i > 0) {
            int length = c().length();
            mif mifVar = this.c;
            b5d b5dVar = f;
            if (i > length) {
                if (mifVar == null) {
                    wl7.g("layoutResult");
                    throw null;
                }
                iD = mifVar.b.d(c().length());
            } else {
                if (mifVar == null) {
                    wl7.g("layoutResult");
                    throw null;
                }
                int iD2 = mifVar.b.d(i);
                iD = e(iD2, b5dVar) + 1 == i ? iD2 : iD2 - 1;
            }
            if (iD >= 0) {
                return b(e(iD, e), e(iD, b5dVar) + 1);
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
