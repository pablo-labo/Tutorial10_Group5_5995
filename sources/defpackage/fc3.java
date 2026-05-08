package defpackage;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class fc3 {

    public static class a {
        public final uf2<?> a;
        public final HashSet b = new HashSet();
        public final HashSet c = new HashSet();

        public a(uf2<?> uf2Var) {
            this.a = uf2Var;
        }
    }

    public static class b {
        public final y8c<?> a;
        public final boolean b;

        public b(y8c y8cVar, boolean z) {
            this.a = y8cVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.a.equals(this.a) && bVar.b == this.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (a aVar : (Set) it2.next()) {
                        for (my3 my3Var : aVar.a.c) {
                            if (my3Var.c == 0) {
                                Set<a> set = (Set) map.get(new b(my3Var.a, my3Var.b == 2));
                                if (set != null) {
                                    for (a aVar2 : set) {
                                        aVar.b.add(aVar2);
                                        aVar2.c.add(aVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<a> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (a aVar3 : hashSet) {
                    if (aVar3.c.isEmpty()) {
                        hashSet2.add(aVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar4 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar4);
                    i++;
                    for (a aVar5 : aVar4.b) {
                        aVar5.c.remove(aVar4);
                        if (aVar5.c.isEmpty()) {
                            hashSet2.add(aVar5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (a aVar6 : hashSet) {
                    if (!aVar6.c.isEmpty() && !aVar6.b.isEmpty()) {
                        arrayList2.add(aVar6.a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            uf2 uf2Var = (uf2) it.next();
            a aVar7 = new a(uf2Var);
            Iterator it4 = uf2Var.b.iterator();
            while (it4.hasNext()) {
                y8c y8cVar = (y8c) it4.next();
                boolean z = uf2Var.e == 0;
                b bVar = new b(y8cVar, !z);
                if (!map.containsKey(bVar)) {
                    map.put(bVar, new HashSet());
                }
                Set set2 = (Set) map.get(bVar);
                if (!set2.isEmpty() && z) {
                    w40.m("Multiple components provide ", y8cVar, ".");
                    return;
                }
                set2.add(aVar7);
            }
        }
    }
}
