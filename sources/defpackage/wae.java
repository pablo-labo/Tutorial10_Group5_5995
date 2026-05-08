package defpackage;

import defpackage.c7e;
import defpackage.ce9;
import defpackage.e69;
import defpackage.xpb;
import java.util.List;
import xpb.a;

/* JADX INFO: loaded from: classes3.dex */
public final class wae extends de9 {
    public final xpb e;
    public final xpb.a f;
    public kd9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wae(gd9 gd9Var, xpb xpbVar) {
        super(gd9Var, xpbVar.new a());
        gd9Var.getClass();
        this.e = xpbVar;
        this.f = xpbVar.new a();
        this.g = pg8.m0;
    }

    @Override // defpackage.ce9
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ce9
    public final boolean f(e69.a aVar) {
        return aVar.b == -1;
    }

    @Override // defpackage.de9
    public final int g(e69.a aVar) {
        return aVar.c();
    }

    @Override // defpackage.de9
    public final ce9.c h(e69.a aVar, gd9 gd9Var) {
        kd9 kd9Var = pg8.n0;
        gd9Var.getClass();
        int i = aVar.b;
        ce9.c cVar = ce9.c.e;
        if (i != -1) {
            return cVar;
        }
        Integer numA = aVar.a();
        if (numA == null) {
            ce9.a.c cVar2 = ce9.a.b;
            return new ce9.c(cVar2, cVar2, ce9.b.a);
        }
        e69.a aVarE = aVar.e(numA.intValue());
        if (aVarE != null && e69.this.a.charAt(aVarE.c) == '-') {
            this.g = kd9Var;
        }
        int i2 = aVarE != null ? aVarE.c : aVar.c;
        kd9 kd9Var2 = wl7.b(this.g, kd9Var) ? zd9.u : zd9.t;
        xpb.a aVar2 = this.f;
        aVar2.getClass();
        kd9 kd9Var3 = zd9.v;
        kd9Var3.getClass();
        xpb xpbVar = xpb.this;
        xpbVar.b.add(new c7e.a(new oh7(aVar2.a, xpbVar.a, 1), kd9Var3));
        List listZ = u63.Z(new c7e.a(new oh7(i2, aVar.c(), 1), kd9Var2));
        xpb xpbVar2 = this.e;
        xpbVar2.getClass();
        xpbVar2.b.addAll(listZ);
        int iC = aVar.c();
        ce9.c cVar3 = ce9.c.f;
        cVar3.getClass();
        this.c = iC;
        this.d = cVar3;
        return cVar;
    }

    @Override // defpackage.de9
    public final en6 i() {
        return this.g;
    }
}
