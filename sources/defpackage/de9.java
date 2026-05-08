package defpackage;

import defpackage.ce9;
import defpackage.e69;
import defpackage.xpb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class de9 implements ce9 {
    public final gd9 a;
    public final xpb.a b;
    public int c;
    public ce9.c d;

    public de9(gd9 gd9Var, xpb.a aVar) {
        gd9Var.getClass();
        this.a = gd9Var;
        this.b = aVar;
        this.c = -2;
    }

    @Override // defpackage.ce9
    public final int a(e69.a aVar) {
        int i = aVar.c;
        if (this.d != null) {
            return i + 1;
        }
        int i2 = this.c;
        if (i2 != -1 && i2 <= i) {
            this.c = g(aVar);
        }
        return this.c;
    }

    @Override // defpackage.ce9
    public final gd9 b() {
        return this.a;
    }

    @Override // defpackage.ce9
    public final ce9.c d(e69.a aVar, gd9 gd9Var) {
        gd9Var.getClass();
        int i = this.c;
        int i2 = aVar.c;
        if (i != i2 && this.d != null) {
            return ce9.c.e;
        }
        ce9.c cVar = ce9.c.d;
        if (i == -1 || i > i2) {
            return cVar;
        }
        if (i < i2 && !f(aVar)) {
            return cVar;
        }
        ce9.c cVar2 = this.d;
        return cVar2 != null ? cVar2 : h(aVar, gd9Var);
    }

    @Override // defpackage.ce9
    public final boolean e(ce9.a aVar) {
        if (aVar == ce9.a.c) {
            aVar = ce9.a.a;
        }
        aVar.a(this.b, i());
        return aVar != ce9.a.d;
    }

    public abstract int g(e69.a aVar);

    public abstract ce9.c h(e69.a aVar, gd9 gd9Var);

    public abstract en6 i();
}
