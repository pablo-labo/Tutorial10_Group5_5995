package defpackage;

import defpackage.e69;
import defpackage.fe9;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w82 implements ee9<fe9.a> {
    @Override // defpackage.ee9
    public final List<ce9> a(e69.a aVar, xpb xpbVar, fe9.a aVar2) {
        Integer numA;
        e69.a aVarE;
        aVar2.getClass();
        gd9 gd9Var = aVar2.a;
        int iD = hd9.d(aVar2.b, aVar.d);
        int i = aVar.b;
        zr4 zr4Var = zr4.a;
        if (iD <= i && (numA = aVar.a()) != null && (aVarE = aVar.e(numA.intValue())) != null) {
            gd9Var.getClass();
            String str = aVarE.d;
            int iD2 = hd9.d(gd9Var, str);
            int i2 = aVarE.b;
            if (i2 < iD2 + 4) {
                if (iD2 <= i2) {
                    while (str.charAt(iD2) != '\t') {
                        if (iD2 != i2) {
                            iD2++;
                        }
                    }
                }
            }
            return u63.Z(new v82(aVar, gd9Var, xpbVar));
        }
        return zr4Var;
    }

    @Override // defpackage.ee9
    public final boolean b(e69.a aVar, gd9 gd9Var) {
        aVar.getClass();
        gd9Var.getClass();
        return false;
    }
}
