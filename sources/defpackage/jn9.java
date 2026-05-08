package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jn9 implements in9 {
    @Override // defpackage.in9
    public Set<n8a> a() {
        Collection<aj3> collectionF = f(lz3.p, uv5.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionF) {
            if (obj instanceof sfe) {
                n8a name = ((sfe) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.in9
    public Collection b(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        return zr4.a;
    }

    @Override // defpackage.in9
    public Set<n8a> c() {
        Collection<aj3> collectionF = f(lz3.q, uv5.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionF) {
            if (obj instanceof sfe) {
                n8a name = ((sfe) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.z4d
    public v62 d(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        return null;
    }

    @Override // defpackage.in9
    public Collection<? extends sfe> e(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        return zr4.a;
    }

    @Override // defpackage.z4d
    public Collection<aj3> f(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
        lz3Var.getClass();
        return zr4.a;
    }

    @Override // defpackage.in9
    public Set<n8a> g() {
        return null;
    }
}
