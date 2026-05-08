package defpackage;

import defpackage.f55;

/* JADX INFO: loaded from: classes3.dex */
public final class a95 implements f55 {
    @Override // defpackage.f55
    public final f55.a a() {
        return f55.a.c;
    }

    @Override // defpackage.f55
    public final f55.b b(fv1 fv1Var, fv1 fv1Var2, t52 t52Var) {
        fv1Var.getClass();
        fv1Var2.getClass();
        boolean z = fv1Var2 instanceof d4c;
        f55.b bVar = f55.b.c;
        if (!z || !(fv1Var instanceof d4c)) {
            return bVar;
        }
        d4c d4cVar = (d4c) fv1Var2;
        d4c d4cVar2 = (d4c) fv1Var;
        return !wl7.b(d4cVar.getName(), d4cVar2.getName()) ? bVar : (c0h.A(d4cVar) && c0h.A(d4cVar2)) ? f55.b.a : (c0h.A(d4cVar) || c0h.A(d4cVar2)) ? f55.b.b : bVar;
    }
}
