package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class k7g {
    public static final Set<n8a> a;
    public static final Set<n8a> b;
    public static final HashMap<a62, a62> c;
    public static final HashMap<a62, a62> d;
    public static final LinkedHashSet e;

    static {
        j7g[] j7gVarArrValues = j7g.values();
        ArrayList arrayList = new ArrayList(j7gVarArrValues.length);
        for (j7g j7gVar : j7gVarArrValues) {
            arrayList.add(j7gVar.e());
        }
        a = z92.E1(arrayList);
        i7g[] i7gVarArrValues = i7g.values();
        ArrayList arrayList2 = new ArrayList(i7gVarArrValues.length);
        for (i7g i7gVar : i7gVarArrValues) {
            arrayList2.add(i7gVar.a());
        }
        b = z92.E1(arrayList2);
        c = new HashMap<>();
        d = new HashMap<>();
        lc9.Z(new Pair(i7g.UBYTEARRAY, n8a.h("ubyteArrayOf")), new Pair(i7g.USHORTARRAY, n8a.h("ushortArrayOf")), new Pair(i7g.UINTARRAY, n8a.h("uintArrayOf")), new Pair(i7g.ULONGARRAY, n8a.h("ulongArrayOf")));
        j7g[] j7gVarArrValues2 = j7g.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (j7g j7gVar2 : j7gVarArrValues2) {
            linkedHashSet.add(j7gVar2.a().f());
        }
        e = linkedHashSet;
        for (j7g j7gVar3 : j7g.values()) {
            c.put(j7gVar3.a(), j7gVar3.c());
            d.put(j7gVar3.c(), j7gVar3.a());
        }
    }

    public static final boolean a(ui8 ui8Var) {
        v62 v62VarD;
        if (kyf.m(ui8Var) || (v62VarD = ui8Var.M0().d()) == null) {
            return false;
        }
        aj3 aj3VarD = v62VarD.d();
        return (aj3VarD instanceof lya) && wl7.b(((lya) aj3VarD).h(), ere.l) && a.contains(v62VarD.getName());
    }
}
