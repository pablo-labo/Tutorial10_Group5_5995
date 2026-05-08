package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class oe7 extends jn9 {
    public final in9 b;

    public oe7(in9 in9Var) {
        in9Var.getClass();
        this.b = in9Var;
    }

    @Override // defpackage.jn9, defpackage.in9
    public final Set<n8a> a() {
        return this.b.a();
    }

    @Override // defpackage.jn9, defpackage.in9
    public final Set<n8a> c() {
        return this.b.c();
    }

    @Override // defpackage.jn9, defpackage.z4d
    public final v62 d(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        v62 v62VarD = this.b.d(n8aVar, diaVar);
        if (v62VarD != null) {
            t52 t52Var = v62VarD instanceof t52 ? (t52) v62VarD : null;
            if (t52Var != null) {
                return t52Var;
            }
            if (v62VarD instanceof zvf) {
                return (zvf) v62VarD;
            }
        }
        return null;
    }

    @Override // defpackage.jn9, defpackage.z4d
    public final Collection f(lz3 lz3Var, Function1 function1) {
        Collection collection;
        lz3Var.getClass();
        int i = lz3.l & lz3Var.b;
        lz3 lz3Var2 = i == 0 ? null : new lz3(i, lz3Var.a);
        if (lz3Var2 == null) {
            collection = zr4.a;
        } else {
            Collection<aj3> collectionF = this.b.f(lz3Var2, function1);
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionF) {
                if (obj instanceof w62) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    @Override // defpackage.jn9, defpackage.in9
    public final Set<n8a> g() {
        return this.b.g();
    }

    public final String toString() {
        return "Classes from " + this.b;
    }
}
