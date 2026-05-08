package defpackage;

import com.datadog.android.core.internal.CoreFeature;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ub9 implements hc8 {
    public Object a;
    public boolean b;
    public final ArrayList c = new ArrayList();

    public static abstract class a {

        /* JADX INFO: renamed from: ub9$a$a, reason: collision with other inner class name */
        public static final class C0430a extends a {
            public final ArrayList a;

            public C0430a(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final String toString() {
                return "List (" + this.a.size() + ')';
            }
        }

        public static final class b extends a {
            public final LinkedHashMap a;
            public String b = null;

            public b(LinkedHashMap linkedHashMap) {
                this.a = linkedHashMap;
            }

            public final String toString() {
                return w40.f(new StringBuilder("Map ("), this.b, ')');
            }
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj2 != null) {
            if (obj instanceof List) {
                if (!(obj2 instanceof List)) {
                    o6.n("Cannot merge ", obj, " with ", obj2);
                    return null;
                }
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() != list2.size()) {
                    o6.n("Cannot merge ", obj, " with ", obj2);
                    return null;
                }
                oh7 oh7VarH = u63.H((Collection) obj);
                ArrayList arrayList = new ArrayList(t92.r0(oh7VarH, 10));
                Iterator<Integer> it = oh7VarH.iterator();
                while (((nh7) it).c) {
                    int iNextInt = ((fh7) it).nextInt();
                    arrayList.add(a(list.get(iNextInt), list2.get(iNextInt)));
                }
                return arrayList;
            }
            if (obj instanceof Map) {
                if (!(obj2 instanceof Map)) {
                    o6.n("Cannot merge ", obj, " with ", obj2);
                    return null;
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                LinkedHashSet<String> linkedHashSetO = bbe.o(map.keySet(), map2.keySet());
                ArrayList arrayList2 = new ArrayList(t92.r0(linkedHashSetO, 10));
                for (String str : linkedHashSetO) {
                    arrayList2.add(new Pair(str, a(map.get(str), map2.get(str))));
                }
                return lc9.f0(arrayList2);
            }
            if (!obj.equals(obj2)) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
        }
        return obj;
    }

    @Override // defpackage.hc8
    public final hc8 C(zgg zggVar) {
        zggVar.getClass();
        p(null);
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 E(long j) {
        p(Long.valueOf(j));
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 F(int i) {
        p(Integer.valueOf(i));
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 H1() {
        p(null);
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 K(double d) {
        p(Double.valueOf(d));
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 M0(za8 za8Var) {
        za8Var.getClass();
        p(za8Var);
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 T0(String str) {
        str.getClass();
        p(str);
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 V(boolean z) {
        p(Boolean.valueOf(z));
        return this;
    }

    @Override // defpackage.hc8
    public final String c() {
        String strValueOf;
        ArrayList<a> arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        for (a aVar : arrayList) {
            if (aVar instanceof a.C0430a) {
                strValueOf = String.valueOf(((a.C0430a) aVar).a.size());
            } else {
                if (!(aVar instanceof a.b)) {
                    l.g();
                    return null;
                }
                strValueOf = ((a.b) aVar).b;
                if (strValueOf == null) {
                    strValueOf = CoreFeature.DEFAULT_APP_VERSION;
                }
            }
            arrayList2.add(strValueOf);
        }
        return z92.W0(arrayList2, ".", null, null, null, 62);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final Object h() {
        if (this.b) {
            return this.a;
        }
        r6.g("Check failed.");
        return null;
    }

    @Override // defpackage.hc8
    public final hc8 j() {
        this.c.add(new a.b(new LinkedHashMap()));
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 l() {
        a aVar = (a) this.c.remove(r0.size() - 1);
        if (aVar instanceof a.C0430a) {
            p(((a.C0430a) aVar).a);
            return this;
        }
        r6.g("Check failed.");
        return null;
    }

    @Override // defpackage.hc8
    public final hc8 m() {
        this.c.add(new a.C0430a(new ArrayList()));
        return this;
    }

    public final void p(Object obj) {
        a aVar = (a) z92.Z0(this.c);
        if (!(aVar instanceof a.b)) {
            if (aVar instanceof a.C0430a) {
                ((a.C0430a) aVar).a.add(obj);
                return;
            } else {
                this.a = obj;
                this.b = true;
                return;
            }
        }
        a.b bVar = (a.b) aVar;
        LinkedHashMap linkedHashMap = bVar.a;
        String str = bVar.b;
        if (str == null) {
            r6.g("Check failed.");
            return;
        }
        if (linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, a(linkedHashMap.get(str), obj));
        } else {
            linkedHashMap.put(str, obj);
        }
        bVar.b = null;
    }

    @Override // defpackage.hc8
    public final hc8 t() {
        a aVar = (a) this.c.remove(r0.size() - 1);
        if (aVar instanceof a.b) {
            p(((a.b) aVar).a);
            return this;
        }
        r6.g("Check failed.");
        return null;
    }

    @Override // defpackage.hc8
    public final hc8 u0(String str) {
        str.getClass();
        a aVar = (a) z92.Y0(this.c);
        if (!(aVar instanceof a.b)) {
            r6.g("Check failed.");
            return null;
        }
        a.b bVar = (a.b) aVar;
        if (bVar.b == null) {
            bVar.b = str;
            return this;
        }
        r6.g("Check failed.");
        return null;
    }
}
