package defpackage;

import defpackage.t4c;

/* JADX INFO: loaded from: classes3.dex */
public final class se0 extends l0<af0> implements re0<af0, up2<?>> {
    public final cf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se0(xx9 xx9Var, cla claVar, e8e e8eVar) {
        super(e8eVar);
        xx9Var.getClass();
        e8eVar.getClass();
        this.b = new cf0(xx9Var, claVar);
    }

    @Override // defpackage.re0
    public final up2<?> h(s5c s5cVar, g5c g5cVar, ui8 ui8Var) {
        g5cVar.getClass();
        return null;
    }

    @Override // defpackage.re0
    public final up2<?> j(s5c s5cVar, g5c g5cVar, ui8 ui8Var) {
        g5cVar.getClass();
        t4c.b.c cVar = (t4c.b.c) r5c.a(g5cVar, this.a.i);
        if (cVar == null) {
            return null;
        }
        return this.b.c(ui8Var, cVar, s5cVar.a);
    }

    public final bf0 l(t4c t4cVar, o8a o8aVar) {
        t4cVar.getClass();
        o8aVar.getClass();
        return this.b.a(t4cVar, o8aVar);
    }
}
