package defpackage;

import defpackage.c7e;
import defpackage.e69;
import defpackage.fe9;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gw5 extends sc2 {
    public final ArrayList i;

    public static final class a {
        public static final a a = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw5(xpb xpbVar, tc2 tc2Var) {
        super(tc2Var, xpbVar);
        tc2Var.getClass();
        this.i = z92.h1(this.h, u63.Z(new f96()));
    }

    @Override // defpackage.fe9
    public final List<ee9<fe9.a>> c() {
        return this.i;
    }

    @Override // defpackage.sc2
    public final void f(e69.a aVar, gd9 gd9Var, xpb xpbVar) {
        int i = aVar.c;
        int i2 = aVar.b;
        String str = aVar.d;
        gd9Var.getClass();
        if (!(gd9Var instanceof dw5) || !((dw5) gd9Var).f) {
            super.f(aVar, gd9Var, xpbVar);
            return;
        }
        int i3 = i2;
        while (i3 < str.length() && str.charAt(i3) != '[') {
            i3++;
        }
        if (i3 == str.length()) {
            super.f(aVar, gd9Var, xpbVar);
            return;
        }
        Character chV0 = ut0.v0(((tc2) gd9Var).b);
        int i4 = i - i2;
        int i5 = i3 + i4;
        xpbVar.b.addAll(u63.a0(new c7e.a(new oh7(i, i5, 1), (chV0 != null && chV0.charValue() == '>') ? zd9.c : ((chV0 != null && chV0.charValue() == '.') || (chV0 != null && chV0.charValue() == ')')) ? zd9.C : zd9.z), new c7e.a(new oh7(i5, Math.min(hd9.d(gd9Var, str) + i4, aVar.c()), 1), ak2.f)));
    }
}
