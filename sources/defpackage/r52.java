package defpackage;

import defpackage.cc5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class r52 implements gj3 {
    public final hvc a;
    public final Function1<gv7, Boolean> b;
    public final q52 c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    /* JADX WARN: Multi-variable type inference failed */
    public r52(hvc hvcVar, Function1<? super gv7, Boolean> function1) {
        hvcVar.getClass();
        this.a = hvcVar;
        this.b = function1;
        q52 q52Var = new q52(this, 0);
        this.c = q52Var;
        cc5 cc5Var = new cc5(new y92(hvcVar.t()), true, q52Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cc5.a aVar = new cc5.a(cc5Var);
        while (aVar.hasNext()) {
            Object next = aVar.next();
            n8a name = ((hv7) next).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.d = linkedHashMap;
        cc5 cc5Var2 = new cc5(new y92(this.a.s()), true, this.b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        cc5.a aVar2 = new cc5.a(cc5Var2);
        while (aVar2.hasNext()) {
            Object next2 = aVar2.next();
            linkedHashMap2.put(((bv7) next2).getName(), next2);
        }
        this.e = linkedHashMap2;
        ArrayList arrayListV = this.a.v();
        Function1<gv7, Boolean> function12 = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListV) {
            if (function12.invoke((gv7) obj).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iV = kc9.V(t92.r0(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iV < 16 ? 16 : iV);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((qv7) obj2).getName(), obj2);
        }
        this.f = linkedHashMap3;
    }

    @Override // defpackage.gj3
    public final Set<n8a> a() {
        cc5 cc5Var = new cc5(new y92(this.a.t()), true, this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        cc5.a aVar = new cc5.a(cc5Var);
        while (aVar.hasNext()) {
            linkedHashSet.add(((hv7) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // defpackage.gj3
    public final bv7 b(n8a n8aVar) {
        n8aVar.getClass();
        return (bv7) this.e.get(n8aVar);
    }

    @Override // defpackage.gj3
    public final Set<n8a> c() {
        return this.f.keySet();
    }

    @Override // defpackage.gj3
    public final Set<n8a> d() {
        cc5 cc5Var = new cc5(new y92(this.a.s()), true, this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        cc5.a aVar = new cc5.a(cc5Var);
        while (aVar.hasNext()) {
            linkedHashSet.add(((bv7) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // defpackage.gj3
    public final qv7 e(n8a n8aVar) {
        n8aVar.getClass();
        return (qv7) this.f.get(n8aVar);
    }

    @Override // defpackage.gj3
    public final Collection<hv7> f(n8a n8aVar) {
        n8aVar.getClass();
        List list = (List) this.d.get(n8aVar);
        return list != null ? list : zr4.a;
    }
}
