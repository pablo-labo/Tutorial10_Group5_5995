package defpackage;

import defpackage.c7e;
import defpackage.e69;
import defpackage.fe9;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class sc2 extends fe9<fe9.a> {
    public fe9.a g;
    public final List<ee9<fe9.a>> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc2(gd9 gd9Var, xpb xpbVar) {
        super(gd9Var, xpbVar);
        gd9Var.getClass();
        this.g = new fe9.a(gd9Var, gd9Var, this.c);
        this.h = u63.a0(new w82(), new wj6(), new z82(), new xae(), new th1(), new bz8(), new nx0(), new nk6(), new xx8());
    }

    @Override // defpackage.fe9
    public final List<ce9> b(e69.a aVar, xpb xpbVar) {
        return aVar.b == -1 ? zr4.a : super.b(aVar, xpbVar);
    }

    @Override // defpackage.fe9
    public final fe9.a d() {
        return this.g;
    }

    public void f(e69.a aVar, gd9 gd9Var, xpb xpbVar) {
        gd9Var.getClass();
        if (gd9Var.g() == 0) {
            return;
        }
        int i = aVar.c;
        int iMin = Math.min(hd9.d(gd9Var, aVar.d) + (i - aVar.b), aVar.c());
        Character chV0 = ut0.v0(gd9Var.c());
        xpbVar.b.addAll(u63.Z(new c7e.a(new oh7(i, iMin, 1), (chV0 != null && chV0.charValue() == '>') ? zd9.c : ((chV0 != null && chV0.charValue() == '.') || (chV0 != null && chV0.charValue() == ')')) ? zd9.C : zd9.z)));
    }
}
