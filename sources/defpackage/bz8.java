package defpackage;

import defpackage.e69;
import defpackage.fe9;
import defpackage.xpb;
import java.util.ArrayList;
import java.util.List;
import xpb.a;

/* JADX INFO: loaded from: classes3.dex */
public final class bz8 implements ee9<fe9.a> {
    @Override // defpackage.ee9
    public final List<ce9> a(e69.a aVar, xpb xpbVar, fe9.a aVar2) {
        Character chV0;
        aVar2.getClass();
        gd9 gd9Var = aVar2.a;
        gd9 gd9Var2 = aVar2.b;
        gd9Var.getClass();
        int i = aVar.b;
        int iD = hd9.d(gd9Var, aVar.d);
        zr4 zr4Var = zr4.a;
        if (i == iD && !wl7.b(gd9Var2, gd9Var) && ((chV0 = ut0.v0(gd9Var2.c())) == null || chV0.charValue() != '>')) {
            boolean[] zArrB = gd9Var2.b();
            zArrB.getClass();
            if (wl7.b(zArrB.length == 0 ? null : Boolean.valueOf(zArrB[zArrB.length - 1]), Boolean.TRUE)) {
                ArrayList arrayList = new ArrayList();
                if (!(((ce9) z92.Z0(aVar2.c)) instanceof az8)) {
                    xpb.a aVar3 = xpbVar.new a();
                    Character chV02 = ut0.v0(gd9Var2.c());
                    chV02.getClass();
                    arrayList.add(new az8(gd9Var2, aVar3, chV02.charValue()));
                }
                arrayList.add(new xy8(gd9Var2, xpbVar.new a()));
                return arrayList;
            }
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
