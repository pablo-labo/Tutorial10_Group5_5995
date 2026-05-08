package defpackage;

import defpackage.c7e;
import defpackage.ce9;
import defpackage.e69;
import xpb.a;

/* JADX INFO: loaded from: classes3.dex */
public final class mx0 extends de9 {
    public final kd9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx0(gd9 gd9Var, xpb xpbVar, oh7 oh7Var, int i, int i2) {
        super(gd9Var, xpbVar.new a());
        kd9 kd9Var = pg8.t0;
        gd9Var.getClass();
        int i3 = xpbVar.a;
        iy8 iy8VarS = u63.s();
        int i4 = oh7Var.a;
        int i5 = i3 + i4;
        int i6 = oh7Var.b;
        int i7 = i3 + i6 + 1;
        oh7 oh7Var2 = new oh7(i5, i7, 1);
        kd9 kd9Var2 = zd9.r;
        iy8VarS.add(new c7e.a(oh7Var2, kd9Var2));
        if (i7 != i) {
            iy8VarS.add(new c7e.a(new oh7(i7, i, 1), zd9.s));
        }
        if (i != i2) {
            iy8VarS.add(new c7e.a(new oh7(i, i2, 1), kd9Var2));
        }
        iy8 iy8VarL = iy8VarS.l();
        iy8VarL.getClass();
        xpbVar.b.addAll(iy8VarL);
        switch ((i6 - i4) + 1) {
            case 1:
                kd9Var = pg8.o0;
                break;
            case 2:
                kd9Var = pg8.p0;
                break;
            case 3:
                kd9Var = pg8.q0;
                break;
            case 4:
                kd9Var = pg8.r0;
                break;
            case 5:
                kd9Var = pg8.s0;
                break;
        }
        this.e = kd9Var;
    }

    @Override // defpackage.ce9
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ce9
    public final boolean f(e69.a aVar) {
        return true;
    }

    @Override // defpackage.de9
    public final int g(e69.a aVar) {
        return aVar.c();
    }

    @Override // defpackage.de9
    public final ce9.c h(e69.a aVar, gd9 gd9Var) {
        gd9Var.getClass();
        if (aVar.b != -1) {
            return ce9.c.e;
        }
        return new ce9.c(ce9.a.b, ce9.a.a, ce9.b.a);
    }

    @Override // defpackage.de9
    public final en6 i() {
        return this.e;
    }
}
