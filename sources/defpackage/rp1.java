package defpackage;

import defpackage.ere;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class rp1 {
    public static final Map<mq5, n8a> a;
    public static final LinkedHashMap b;
    public static final Set<mq5> c;
    public static final Set<n8a> d;

    static {
        nq5 nq5Var = ere.a.j;
        Pair pair = new Pair(nq5Var.a(n8a.h("name")).g(), ere.d);
        Pair pair2 = new Pair(nq5Var.a(n8a.h("ordinal")).g(), n8a.h("ordinal"));
        Pair pair3 = new Pair(wab.e(ere.a.C, "size"), n8a.h("size"));
        mq5 mq5Var = ere.a.G;
        Map<mq5, n8a> mapA0 = lc9.a0(pair, pair2, pair3, new Pair(wab.e(mq5Var, "size"), n8a.h("size")), new Pair(ere.a.e.a(n8a.h("length")).g(), n8a.h("length")), new Pair(wab.e(mq5Var, "keys"), n8a.h("keySet")), new Pair(wab.e(mq5Var, "values"), n8a.h("values")), new Pair(wab.e(mq5Var, "entries"), n8a.h("entrySet")), new Pair(wab.e(ere.a.a0, "size"), n8a.h("length")), new Pair(wab.e(ere.a.b0, "size"), n8a.h("length")), new Pair(wab.e(ere.a.c0, "size"), n8a.h("length")));
        a = mapA0;
        Set<Map.Entry<mq5, n8a>> setEntrySet = mapA0.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(t92.r0(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((mq5) entry.getKey()).a.f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair4 : arrayList) {
            n8a n8aVar = (n8a) pair4.e();
            Object arrayList2 = linkedHashMap.get(n8aVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(n8aVar, arrayList2);
            }
            ((List) arrayList2).add((n8a) pair4.d());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kc9.V(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            iterable.getClass();
            linkedHashMap2.put(key, z92.z1(z92.D1(iterable)));
        }
        b = linkedHashMap2;
        Map<mq5, n8a> map = a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<mq5, n8a> entry3 : map.entrySet()) {
            String str = iw7.a;
            a62 a62VarG = iw7.g(entry3.getKey().b().a);
            a62VarG.getClass();
            linkedHashSet.add(a62VarG.a().a(entry3.getValue()));
        }
        Set<mq5> setKeySet = a.keySet();
        c = setKeySet;
        Set<mq5> set = setKeySet;
        ArrayList arrayList3 = new ArrayList(t92.r0(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((mq5) it2.next()).a.f());
        }
        d = z92.E1(arrayList3);
    }
}
