package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class vxe implements in9 {
    public final in9 b;
    public final TypeSubstitutor c;
    public HashMap d;
    public final d2f e;

    public vxe(in9 in9Var, TypeSubstitutor typeSubstitutor) {
        in9Var.getClass();
        typeSubstitutor.getClass();
        this.b = in9Var;
        new d2f(new n14(typeSubstitutor, 2));
        byf byfVarG = typeSubstitutor.g();
        byfVarG.getClass();
        this.c = TypeSubstitutor.e(pnb.T(byfVarG));
        this.e = new d2f(new nf8(this, 3));
    }

    @Override // defpackage.in9
    public final Set<n8a> a() {
        return this.b.a();
    }

    @Override // defpackage.in9
    public final Collection b(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        return i(this.b.b(n8aVar, diaVar));
    }

    @Override // defpackage.in9
    public final Set<n8a> c() {
        return this.b.c();
    }

    @Override // defpackage.z4d
    public final v62 d(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        v62 v62VarD = this.b.d(n8aVar, diaVar);
        if (v62VarD != null) {
            return (v62) h(v62VarD);
        }
        return null;
    }

    @Override // defpackage.in9
    public final Collection<? extends sfe> e(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        return i(this.b.e(n8aVar, diaVar));
    }

    @Override // defpackage.z4d
    public final Collection<aj3> f(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
        lz3Var.getClass();
        return (Collection) this.e.getValue();
    }

    @Override // defpackage.in9
    public final Set<n8a> g() {
        return this.b.g();
    }

    public final <D extends aj3> D h(D d) {
        TypeSubstitutor typeSubstitutor = this.c;
        if (typeSubstitutor.a.e()) {
            return d;
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        HashMap map = this.d;
        map.getClass();
        Object objB = map.get(d);
        if (objB == null) {
            if (!(d instanceof qxe)) {
                ja.i(d, "Unknown descriptor in scope: ");
                return null;
            }
            objB = ((qxe) d).b(typeSubstitutor);
            if (objB == null) {
                ja.p("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ", d, " substitution fails");
                return null;
            }
            map.put(d, objB);
        }
        return (D) objB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends aj3> Collection<D> i(Collection<? extends D> collection) {
        if (this.c.a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h((aj3) it.next()));
        }
        return linkedHashSet;
    }
}
