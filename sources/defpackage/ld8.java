package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ld8 implements in9 {
    public static final /* synthetic */ qf8<Object>[] f = {fwc.a.g(new l4c(ld8.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};
    public final mp8 b;
    public final hp8 c;
    public final lp8 d;
    public final fla e;

    public ld8(mp8 mp8Var, nv7 nv7Var, hp8 hp8Var) {
        this.b = mp8Var;
        this.c = hp8Var;
        this.d = new lp8(mp8Var, nv7Var, hp8Var);
        this.e = mp8Var.a.a.f(new kd8(this, 0));
    }

    @Override // defpackage.in9
    public final Set<n8a> a() {
        in9[] in9VarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (in9 in9Var : in9VarArrH) {
            w92.w0(linkedHashSet, in9Var.a());
        }
        linkedHashSet.addAll(this.d.a());
        return linkedHashSet;
    }

    @Override // defpackage.in9
    public final Collection b(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        i(n8aVar, diaVar);
        in9[] in9VarArrH = h();
        this.d.getClass();
        Collection collectionA = zr4.a;
        for (in9 in9Var : in9VarArrH) {
            collectionA = aqd.a(collectionA, in9Var.b(n8aVar, diaVar));
        }
        return collectionA == null ? is4.a : collectionA;
    }

    @Override // defpackage.in9
    public final Set<n8a> c() {
        in9[] in9VarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (in9 in9Var : in9VarArrH) {
            w92.w0(linkedHashSet, in9Var.c());
        }
        linkedHashSet.addAll(this.d.c());
        return linkedHashSet;
    }

    @Override // defpackage.z4d
    public final v62 d(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        i(n8aVar, diaVar);
        lp8 lp8Var = this.d;
        lp8Var.getClass();
        v62 v62Var = null;
        t52 t52VarV = lp8Var.v(n8aVar, null);
        if (t52VarV != null) {
            return t52VarV;
        }
        for (in9 in9Var : h()) {
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
        i(n8aVar, diaVar);
        in9[] in9VarArrH = h();
        Collection<sfe> collectionE = this.d.e(n8aVar, diaVar);
        for (in9 in9Var : in9VarArrH) {
            collectionE = aqd.a(collectionE, in9Var.e(n8aVar, diaVar));
        }
        return collectionE == null ? is4.a : collectionE;
    }

    @Override // defpackage.z4d
    public final Collection<aj3> f(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
        lz3Var.getClass();
        in9[] in9VarArrH = h();
        Collection<aj3> collectionF = this.d.f(lz3Var, function1);
        for (in9 in9Var : in9VarArrH) {
            collectionF = aqd.a(collectionF, in9Var.f(lz3Var, function1));
        }
        return collectionF == null ? is4.a : collectionF;
    }

    @Override // defpackage.in9
    public final Set<n8a> g() {
        HashSet hashSetA = kn9.a(ut0.d0(h()));
        if (hashSetA == null) {
            return null;
        }
        hashSetA.addAll(this.d.g());
        return hashSetA;
    }

    public final in9[] h() {
        return (in9[]) zte.c(this.e, f[0]);
    }

    public final void i(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        rkg.a(this.b.a.n, diaVar, this.c, n8aVar);
    }

    public final String toString() {
        return "scope for " + this.c;
    }
}
