package defpackage;

import defpackage.g15;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class vs1 {
    public final cva a;
    public final g15.b b;
    public final wt1 c;
    public final lt1 d;
    public final List<vd2> e;
    public final LinkedHashMap f;
    public final ArrayList g;

    public static final class a implements ys1 {
        public final Map<List<Object>, Map<String, Object>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Map<List<Object>, ? extends Map<String, ? extends Object>> map) {
            map.getClass();
            this.a = map;
        }

        @Override // defpackage.ys1
        public final Map<String, Object> a() {
            Map<List<Object>, Map<String, Object>> map = this.a;
            zr4 zr4Var = zr4.a;
            Object objB = b(map.get(zr4Var), zr4Var);
            objB.getClass();
            return (Map) objB;
        }

        public final Object b(Object obj, List<? extends Object> list) {
            if (obj instanceof qt1) {
                return b(this.a.get(list), list);
            }
            if (obj instanceof List) {
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(t92.r0(iterable, 10));
                int i = 0;
                for (Object obj2 : iterable) {
                    int i2 = i + 1;
                    if (i < 0) {
                        u63.o0();
                        throw null;
                    }
                    arrayList.add(b(obj2, z92.g1(Integer.valueOf(i), list)));
                    i = i2;
                }
                return arrayList;
            }
            if (!(obj instanceof Map)) {
                return obj;
            }
            Map map = (Map) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object key2 = entry.getKey();
                key2.getClass();
                linkedHashMap.put(key, b(value, z92.g1((String) key2, list)));
            }
            return linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CacheBatchReaderData(data=" + this.a + ')';
        }
    }

    public static final class b {
        public final g15.b a;
        public final ArrayList b = new ArrayList();

        public b(g15.b bVar) {
            this.a = bVar;
        }
    }

    public static final class c {
        public final String a;
        public final List<Object> b;
        public final List<vd2> c;
        public final String d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, List<? extends Object> list, List<? extends vd2> list2, String str2) {
            str.getClass();
            list2.getClass();
            str2.getClass();
            this.a = str;
            this.b = list;
            this.c = list2;
            this.d = str2;
        }
    }

    public vs1(cva cvaVar, String str, g15.b bVar, wt1 wt1Var, lt1 lt1Var, List list, String str2) {
        str.getClass();
        lt1Var.getClass();
        list.getClass();
        str2.getClass();
        this.a = cvaVar;
        this.b = bVar;
        this.c = wt1Var;
        this.d = lt1Var;
        this.e = list;
        this.f = new LinkedHashMap();
        this.g = new ArrayList();
    }

    public static void a(List list, String str, String str2, b bVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vd2 vd2Var = (vd2) it.next();
            if (vd2Var instanceof pd2) {
                bVar.b.add(vd2Var);
            } else {
                if (!(vd2Var instanceof qd2)) {
                    l.g();
                    return;
                }
                qd2 qd2Var = (qd2) vd2Var;
                if (z92.I0(qd2Var.b, str2) || wl7.b(qd2Var.a, str)) {
                    if (!ojd.j(qd2Var.c, bVar.a.a)) {
                        a(qd2Var.d, str, str2, bVar);
                    }
                }
            }
        }
    }

    public static ArrayList b(List list, String str, g15.b bVar, String str2) {
        b bVar2 = new b(bVar);
        a(list, str, str2, bVar2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : bVar2.b) {
            pd2 pd2Var = (pd2) obj;
            Pair pair = new Pair(pd2Var.a, pd2Var.c);
            Object arrayList = linkedHashMap.get(pair);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(pair, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        Collection<List> collectionValues = linkedHashMap.values();
        ArrayList arrayList2 = new ArrayList(t92.r0(collectionValues, 10));
        for (List list2 : collectionValues) {
            pd2 pd2Var2 = (pd2) z92.O0(list2);
            String str3 = pd2Var2.a;
            ka6 ka6Var = pd2Var2.b;
            str3.getClass();
            ka6Var.getClass();
            List<nd2> list3 = pd2Var2.c;
            List<ld2> list4 = pd2Var2.d;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                w92.w0(arrayList3, ((pd2) it.next()).e);
            }
            arrayList2.add(new pd2(str3, ka6Var, list3, list4, arrayList3));
        }
        return arrayList2;
    }

    public final void c(Object obj, ArrayList arrayList, List list, String str) {
        Pair pair;
        if (obj instanceof qt1) {
            this.g.add(new c(((qt1) obj).a, arrayList, list, str));
            return;
        }
        if (obj instanceof List) {
            int i = 0;
            for (Object obj2 : (Iterable) obj) {
                int i2 = i + 1;
                if (i < 0) {
                    u63.o0();
                    throw null;
                }
                c(obj2, z92.g1(Integer.valueOf(i), arrayList), list, str);
                i = i2;
            }
            return;
        }
        if (obj instanceof Map) {
            Map<String, Object> map = (Map) obj;
            Object obj3 = map.get("__typename");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            g15.b bVar = this.b;
            ArrayList<pd2> arrayListB = b(list, str, bVar, str2);
            ArrayList arrayList2 = new ArrayList();
            for (pd2 pd2Var : arrayListB) {
                Map<String, Object> map2 = bVar.a;
                pd2Var.getClass();
                String str3 = pd2Var.a;
                if (ojd.j(pd2Var.c, map2)) {
                    pair = null;
                } else {
                    Object objA = this.c.a(pd2Var, bVar, map, "");
                    c(objA, z92.g1(str3, arrayList), pd2Var.e, pd2Var.b.M0().d);
                    pair = new Pair(str3, objA);
                }
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            lc9.f0(arrayList2);
        }
    }
}
