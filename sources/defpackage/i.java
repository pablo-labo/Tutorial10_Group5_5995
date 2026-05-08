package defpackage;

import defpackage.vr1;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static final vr1 a;
    public static final vr1 b;
    public static final vr1 c;
    public static final vr1 d;
    public static final vr1 e;

    static {
        vr1 vr1Var = vr1.c;
        a = vr1.a.c("/");
        b = vr1.a.c("\\");
        c = vr1.a.c("/\\");
        d = vr1.a.c(".");
        e = vr1.a.c("..");
    }

    public static final int a(w5b w5bVar) {
        vr1 vr1Var = w5bVar.a;
        if (vr1Var.h() != 0) {
            if (vr1Var.r(0) != 47) {
                if (vr1Var.r(0) == 92) {
                    if (vr1Var.h() > 2 && vr1Var.r(1) == 92) {
                        vr1 vr1Var2 = b;
                        vr1Var2.getClass();
                        int iN = vr1Var.n(2, vr1Var2.p());
                        return iN == -1 ? vr1Var.h() : iN;
                    }
                } else if (vr1Var.h() > 2 && vr1Var.r(1) == 58 && vr1Var.r(2) == 92) {
                    char cR = (char) vr1Var.r(0);
                    if ('a' <= cR && cR < '{') {
                        return 3;
                    }
                    if ('A' <= cR && cR < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final w5b b(w5b w5bVar, w5b w5bVar2, boolean z) {
        w5bVar2.getClass();
        if (a(w5bVar2) != -1 || w5bVar2.m() != null) {
            return w5bVar2;
        }
        vr1 vr1VarC = c(w5bVar);
        if (vr1VarC == null && (vr1VarC = c(w5bVar2)) == null) {
            vr1VarC = f(w5b.b);
        }
        zn1 zn1Var = new zn1();
        zn1Var.o0(w5bVar.a);
        if (zn1Var.b > 0) {
            zn1Var.o0(vr1VarC);
        }
        zn1Var.o0(w5bVar2.a);
        return d(zn1Var, z);
    }

    public static final vr1 c(w5b w5bVar) {
        vr1 vr1Var = w5bVar.a;
        vr1 vr1Var2 = a;
        if (vr1.o(vr1Var, vr1Var2) != -1) {
            return vr1Var2;
        }
        vr1 vr1Var3 = w5bVar.a;
        vr1 vr1Var4 = b;
        if (vr1.o(vr1Var3, vr1Var4) != -1) {
            return vr1Var4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c A[EDGE_INSN: B:101:0x011c->B:84:0x011c BREAK  A[LOOP:1: B:53:0x00ab->B:116:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.w5b d(defpackage.zn1 r17, boolean r18) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i.d(zn1, boolean):w5b");
    }

    public static final vr1 e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        l5.q(p6.c(b2, "not a directory separator: "));
        return null;
    }

    public static final vr1 f(String str) {
        if (wl7.b(str, "/")) {
            return a;
        }
        if (wl7.b(str, "\\")) {
            return b;
        }
        l5.q(l5.l("not a directory separator: ", str));
        return null;
    }
}
