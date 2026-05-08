package defpackage;

import defpackage.k15;

/* JADX INFO: loaded from: classes.dex */
public final class xb2 implements k15 {
    public final k15 a;
    public final k15.a b;

    public xb2(k15 k15Var, k15.a aVar) {
        k15Var.getClass();
        aVar.getClass();
        this.a = k15Var;
        this.b = aVar;
    }

    @Override // defpackage.k15
    public final k15 a(k15.b<?> bVar) {
        bVar.getClass();
        k15.a aVar = this.b;
        k15.a aVarC = aVar.c(bVar);
        k15 k15Var = this.a;
        if (aVarC != null) {
            return k15Var;
        }
        k15 k15VarA = k15Var.a(bVar);
        return k15VarA == k15Var ? this : k15VarA == wr4.a ? aVar : new xb2(k15VarA, aVar);
    }

    @Override // defpackage.k15
    public final Object b(k15 k15Var, fj2 fj2Var) {
        return fj2Var.invoke(this.a.b(k15Var, fj2Var), this.b);
    }

    @Override // defpackage.k15
    public final <E extends k15.a> E c(k15.b<E> bVar) {
        bVar.getClass();
        while (true) {
            E e = (E) this.b.c(bVar);
            if (e != null) {
                return e;
            }
            k15 k15Var = this.a;
            if (!(k15Var instanceof xb2)) {
                return (E) k15Var.c(bVar);
            }
            this = (xb2) k15Var;
        }
    }
}
