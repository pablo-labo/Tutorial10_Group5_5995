package defpackage;

import defpackage.s62;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m4<TAnnotation> {

    public static final class a {
        public final zi8 a;
        public final sw7 b;
        public final txf c;

        public a(zi8 zi8Var, sw7 sw7Var, txf txfVar) {
            this.a = zi8Var;
            this.b = sw7Var;
            this.c = txfVar;
        }
    }

    public static void a(Object obj, ArrayList arrayList, l4 l4Var) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) l4Var.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, l4Var);
            }
        }
    }

    public static lma c(zi8 zi8Var) {
        mge mgeVarH;
        mge mgeVarH2;
        zi8Var.getClass();
        jh5 jh5VarG = s62.a.g(zi8Var);
        if (jh5VarG == null || (mgeVarH = s62.a.M(jh5VarG)) == null) {
            mgeVarH = s62.a.h(zi8Var);
            mgeVarH.getClass();
        }
        if (s62.a.E(mgeVarH)) {
            return lma.b;
        }
        jh5 jh5VarG2 = s62.a.g(zi8Var);
        if (jh5VarG2 == null || (mgeVarH2 = s62.a.W(jh5VarG2)) == null) {
            mgeVarH2 = s62.a.h(zi8Var);
            mgeVarH2.getClass();
        }
        if (s62.a.E(mgeVarH2)) {
            return null;
        }
        return lma.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mma b(defpackage.txf r4) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m4.b(txf):mma");
    }

    public final ArrayList d(zi8 zi8Var) {
        dfe dfeVar = (dfe) this;
        sw7 value = dfeVar.c.c.getValue();
        gf0 gf0VarE = dfeVar.e();
        zi8Var.getClass();
        a aVar = new a(zi8Var, gf0VarE.b(value, ((ui8) zi8Var).getAnnotations()), null);
        l4 l4Var = new l4(this, 0);
        ArrayList arrayList = new ArrayList(1);
        a(aVar, arrayList, l4Var);
        return arrayList;
    }
}
