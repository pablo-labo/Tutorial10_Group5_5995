package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qq8 {
    public final ekd a;
    public final gd1 b;
    public final z3a<Object, a> c = lnd.b();

    public final class a {
        public final Object a;
        public final Object b;
        public int c;
        public ah2 d;

        public a(int i, Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
            this.c = i;
        }
    }

    public qq8(ekd ekdVar, gd1 gd1Var) {
        this.a = ekdVar;
        this.b = gd1Var;
    }

    public final Function2<b, Integer, j6g> a(int i, Object obj, Object obj2) {
        z3a<Object, a> z3aVar = this.c;
        a aVarD = z3aVar.d(obj);
        if (aVarD != null && aVarD.c == i && wl7.b(aVarD.b, obj2)) {
            ah2 ah2Var = aVarD.d;
            if (ah2Var != null) {
                return ah2Var;
            }
            ah2 ah2Var2 = new ah2(818252804, new pq8(qq8.this, aVarD), true);
            aVarD.d = ah2Var2;
            return ah2Var2;
        }
        a aVar = new a(i, obj, obj2);
        z3aVar.m(obj, aVar);
        ah2 ah2Var3 = aVar.d;
        if (ah2Var3 != null) {
            return ah2Var3;
        }
        ah2 ah2Var4 = new ah2(818252804, new pq8(this, aVar), true);
        aVar.d = ah2Var4;
        return ah2Var4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVarD = this.c.d(obj);
        if (aVarD != null) {
            return aVarD.b;
        }
        c cVar = (c) this.b.invoke();
        int iC = cVar.c(obj);
        if (iC != -1) {
            return cVar.e(iC);
        }
        return null;
    }
}
