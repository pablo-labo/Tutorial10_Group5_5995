package defpackage;

import defpackage.ljd;
import defpackage.xm9;

/* JADX INFO: loaded from: classes.dex */
public final class srf {

    public static final class a implements goa, ev5 {
        public final /* synthetic */ wi1 a;

        public a(wi1 wi1Var) {
            this.a = wi1Var;
        }

        @Override // defpackage.ev5
        public final vu5<?> c() {
            return this.a;
        }

        @Override // defpackage.goa
        public final /* synthetic */ void d(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof goa) && (obj instanceof ev5)) {
                return this.a == ((ev5) obj).c();
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    @sy3
    public static final xm9 a(g3a g3aVar, dv5 dv5Var) {
        xm9.a<?> aVar;
        xm9 xm9Var = new xm9();
        a aVar2 = new a(new wi1(7, xm9Var, dv5Var));
        xm9.a aVar3 = new xm9.a(g3aVar, aVar2);
        ljd<pz8<?>, xm9.a<?>> ljdVar = xm9Var.l;
        ljd.c<pz8<?>, xm9.a<?>> cVarA = ljdVar.a(g3aVar);
        if (cVarA != null) {
            aVar = cVarA.b;
        } else {
            ljd.c<K, V> cVar = new ljd.c<>(g3aVar, aVar3);
            ljdVar.d++;
            ljd.c cVar2 = ljdVar.b;
            if (cVar2 == null) {
                ljdVar.a = cVar;
                ljdVar.b = cVar;
            } else {
                cVar2.c = cVar;
                cVar.d = cVar2;
                ljdVar.b = cVar;
            }
            aVar = null;
        }
        xm9.a<?> aVar4 = aVar;
        if (aVar4 != null && aVar4.b != aVar2) {
            l5.q("This source was already added with the different observer");
            return null;
        }
        if (aVar4 == null && xm9Var.c > 0) {
            g3aVar.f(aVar3);
        }
        return xm9Var;
    }
}
