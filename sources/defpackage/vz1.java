package defpackage;

import defpackage.in9;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class vz1 implements in9 {
    public final String b;
    public final in9[] c;

    public static final class a {
        public static in9 a(String str, Iterable iterable) {
            lke lkeVar = new lke();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                in9 in9Var = (in9) it.next();
                if (in9Var != in9.b.b) {
                    if (in9Var instanceof vz1) {
                        w92.x0(lkeVar, ((vz1) in9Var).c);
                    } else {
                        lkeVar.add(in9Var);
                    }
                }
            }
            int i = lkeVar.a;
            return i != 0 ? i != 1 ? new vz1(str, (in9[]) lkeVar.toArray(new in9[0])) : (in9) lkeVar.get(0) : in9.b.b;
        }
    }

    public vz1(String str, in9[] in9VarArr) {
        this.b = str;
        this.c = in9VarArr;
    }

    @Override // defpackage.in9
    public final Set<n8a> a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (in9 in9Var : this.c) {
            w92.w0(linkedHashSet, in9Var.a());
        }
        return linkedHashSet;
    }

    @Override // defpackage.in9
    public final Collection b(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        in9[] in9VarArr = this.c;
        int length = in9VarArr.length;
        if (length == 0) {
            return zr4.a;
        }
        if (length == 1) {
            return in9VarArr[0].b(n8aVar, diaVar);
        }
        Collection collectionA = null;
        for (in9 in9Var : in9VarArr) {
            collectionA = aqd.a(collectionA, in9Var.b(n8aVar, diaVar));
        }
        return collectionA == null ? is4.a : collectionA;
    }

    @Override // defpackage.in9
    public final Set<n8a> c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (in9 in9Var : this.c) {
            w92.w0(linkedHashSet, in9Var.c());
        }
        return linkedHashSet;
    }

    @Override // defpackage.z4d
    public final v62 d(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        v62 v62Var = null;
        for (in9 in9Var : this.c) {
            v62 v62VarD = in9Var.d(n8aVar, diaVar);
            if (v62VarD != null) {
                if (!(v62VarD instanceof w62) || !((zm9) v62VarD).i0()) {
                    return v62VarD;
                }
                if (v62Var == null) {
                    v62Var = v62VarD;
                }
            }
        }
        return v62Var;
    }

    @Override // defpackage.in9
    public final Collection<sfe> e(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        in9[] in9VarArr = this.c;
        int length = in9VarArr.length;
        if (length == 0) {
            return zr4.a;
        }
        if (length == 1) {
            return in9VarArr[0].e(n8aVar, diaVar);
        }
        Collection<sfe> collectionA = null;
        for (in9 in9Var : in9VarArr) {
            collectionA = aqd.a(collectionA, in9Var.e(n8aVar, diaVar));
        }
        return collectionA == null ? is4.a : collectionA;
    }

    @Override // defpackage.z4d
    public final Collection<aj3> f(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
        lz3Var.getClass();
        in9[] in9VarArr = this.c;
        int length = in9VarArr.length;
        if (length == 0) {
            return zr4.a;
        }
        if (length == 1) {
            return in9VarArr[0].f(lz3Var, function1);
        }
        Collection<aj3> collectionA = null;
        for (in9 in9Var : in9VarArr) {
            collectionA = aqd.a(collectionA, in9Var.f(lz3Var, function1));
        }
        return collectionA == null ? is4.a : collectionA;
    }

    @Override // defpackage.in9
    public final Set<n8a> g() {
        return kn9.a(ut0.d0(this.c));
    }

    public final String toString() {
        return this.b;
    }
}
