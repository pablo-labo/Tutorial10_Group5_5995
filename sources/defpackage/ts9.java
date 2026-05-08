package defpackage;

import androidx.media3.common.a;
import defpackage.js9;

/* JADX INFO: loaded from: classes.dex */
public final class ts9 {
    public static uf9 a(js9 js9Var, String str) {
        int i = 0;
        while (true) {
            js9.a[] aVarArr = js9Var.a;
            if (i >= aVarArr.length) {
                return null;
            }
            js9.a aVar = aVarArr[i];
            if (aVar instanceof uf9) {
                uf9 uf9Var = (uf9) aVar;
                if (uf9Var.a.equals(str)) {
                    return uf9Var;
                }
            }
            i++;
        }
    }

    public static yg0 b(g4b g4bVar) {
        int iJ = g4bVar.j();
        if (g4bVar.j() != 1684108385) {
            zkd.T("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iJ2 = g4bVar.j();
        byte[] bArr = ll1.a;
        int i = iJ2 & 16777215;
        String str = i == 13 ? "image/jpeg" : i == 14 ? "image/png" : null;
        if (str == null) {
            g7.j(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        g4bVar.K(4);
        int i2 = iJ - 16;
        byte[] bArr2 = new byte[i2];
        g4bVar.h(0, bArr2, i2);
        return new yg0(3, str, null, bArr2);
    }

    public static ohf c(int i, g4b g4bVar, String str) {
        int iJ = g4bVar.j();
        if (g4bVar.j() == 1684108385 && iJ >= 22) {
            g4bVar.K(10);
            int iD = g4bVar.D();
            if (iD > 0) {
                String strC = p6.c(iD, "");
                int iD2 = g4bVar.D();
                if (iD2 > 0) {
                    strC = strC + "/" + iD2;
                }
                return new ohf(str, null, e47.n(strC));
            }
        }
        zkd.T("MetadataUtil", "Failed to parse index/count attribute: ".concat(w0a.a(i)));
        return null;
    }

    public static int d(g4b g4bVar) {
        int iJ = g4bVar.j();
        if (g4bVar.j() == 1684108385) {
            g4bVar.K(8);
            int i = iJ - 16;
            if (i == 1) {
                return g4bVar.x();
            }
            if (i == 2) {
                return g4bVar.D();
            }
            if (i == 3) {
                return g4bVar.A();
            }
            if (i == 4 && (g4bVar.a[g4bVar.b] & 128) == 0) {
                return g4bVar.B();
            }
        }
        zkd.T("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static gr6 e(int i, String str, g4b g4bVar, boolean z, boolean z2) {
        int iD = d(g4bVar);
        if (z2) {
            iD = Math.min(1, iD);
        }
        if (iD >= 0) {
            return z ? new ohf(str, null, e47.n(Integer.toString(iD))) : new jc2("und", str, Integer.toString(iD));
        }
        zkd.T("MetadataUtil", "Failed to parse uint8 attribute: ".concat(w0a.a(i)));
        return null;
    }

    public static ohf f(int i, g4b g4bVar, String str) {
        int iJ = g4bVar.j();
        if (g4bVar.j() == 1684108385) {
            g4bVar.K(8);
            return new ohf(str, null, e47.n(g4bVar.t(iJ - 16)));
        }
        zkd.T("MetadataUtil", "Failed to parse text attribute: ".concat(w0a.a(i)));
        return null;
    }

    public static void g(int i, js9 js9Var, a.C0036a c0036a, js9 js9Var2, js9... js9VarArr) {
        if (js9Var2 == null) {
            js9Var2 = new js9(new js9.a[0]);
        }
        if (js9Var != null) {
            int i2 = 0;
            while (true) {
                js9.a[] aVarArr = js9Var.a;
                if (i2 >= aVarArr.length) {
                    break;
                }
                js9.a aVar = aVarArr[i2];
                if (aVar instanceof uf9) {
                    uf9 uf9Var = (uf9) aVar;
                    if (!uf9Var.a.equals("com.android.capture.fps")) {
                        js9Var2 = js9Var2.a(uf9Var);
                    } else if (i == 2) {
                        js9Var2 = js9Var2.a(uf9Var);
                    }
                }
                i2++;
            }
        }
        for (js9 js9Var3 : js9VarArr) {
            js9Var2 = js9Var2.b(js9Var3);
        }
        if (js9Var2.a.length > 0) {
            c0036a.k = js9Var2;
        }
    }
}
