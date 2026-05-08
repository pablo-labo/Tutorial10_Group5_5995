package defpackage;

import defpackage.j29;
import defpackage.y52;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j14 extends jn9 {
    public static final /* synthetic */ qf8<Object>[] f;
    public final h04 b;
    public final a c;
    public final fla d;
    public final sma e;

    public interface a {
        Set<n8a> a();

        Collection b(n8a n8aVar, dia diaVar);

        Set<n8a> c();

        Collection d(n8a n8aVar, dia diaVar);

        zvf e(n8a n8aVar);

        Set<n8a> f();

        void g(ArrayList arrayList, lz3 lz3Var, Function1 function1);
    }

    public final class b implements a {
        public static final /* synthetic */ qf8<Object>[] j;
        public final LinkedHashMap a;
        public final LinkedHashMap b;
        public final Map<n8a, byte[]> c;
        public final nn9<n8a, Collection<sfe>> d;
        public final nn9<n8a, Collection<d4c>> e;
        public final on9<n8a, zvf> f;
        public final fla g;
        public final fla h;

        public static final class a implements gu5 {
            public final /* synthetic */ n4b a;
            public final /* synthetic */ ByteArrayInputStream b;
            public final /* synthetic */ j14 c;

            public a(n4b n4bVar, ByteArrayInputStream byteArrayInputStream, j14 j14Var) {
                this.a = n4bVar;
                this.b = byteArrayInputStream;
                this.c = j14Var;
            }

            @Override // defpackage.gu5
            public final Object invoke() {
                return ((p3) this.a).c(this.b, this.c.b.a.p);
            }
        }

        static {
            l4c l4cVar = new l4c(b.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0);
            iwc iwcVar = fwc.a;
            j = new qf8[]{iwcVar.g(l4cVar), z3.i(b.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, iwcVar)};
        }

        public b(List<b5c> list, List<g5c> list2, List<k5c> list3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                n8a n8aVarB = q8a.b(j14.this.b.b, ((b5c) ((rp9) obj)).T());
                Object arrayList = linkedHashMap.get(n8aVarB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(n8aVarB, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.a = h(linkedHashMap);
            j14 j14Var = j14.this;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                n8a n8aVarB2 = q8a.b(j14Var.b.b, ((g5c) ((rp9) obj2)).S());
                Object arrayList2 = linkedHashMap2.get(n8aVarB2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(n8aVarB2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.b = h(linkedHashMap2);
            j14.this.b.a.c.getClass();
            j14 j14Var2 = j14.this;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : list3) {
                n8a n8aVarB3 = q8a.b(j14Var2.b.b, ((k5c) ((rp9) obj3)).M());
                Object arrayList3 = linkedHashMap3.get(n8aVarB3);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap3.put(n8aVarB3, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            this.c = h(linkedHashMap3);
            int i = 1;
            this.d = j14.this.b.a.a.g(new x1(this, i));
            this.e = j14.this.b.a.a.g(new k14(this, 0));
            this.f = j14.this.b.a.a.d(new if0(this, i));
            j14 j14Var3 = j14.this;
            j29 j29Var = j14Var3.b.a.a;
            l14 l14Var = new l14(this, j14Var3);
            j29Var.getClass();
            this.g = new j29.h(j29Var, l14Var);
            j14 j14Var4 = j14.this;
            j29 j29Var2 = j14Var4.b.a.a;
            m14 m14Var = new m14(0, this, j14Var4);
            j29Var2.getClass();
            this.h = new j29.h(j29Var2, m14Var);
        }

        public static LinkedHashMap h(LinkedHashMap linkedHashMap) throws IOException {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(kc9.V(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<h3> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(t92.r0(iterable, 10));
                for (h3 h3Var : iterable) {
                    int iE = h3Var.e();
                    int iF = f92.f(iE) + iE;
                    if (iF > 4096) {
                        iF = 4096;
                    }
                    f92 f92VarJ = f92.j(byteArrayOutputStream, iF);
                    f92VarJ.v(iE);
                    h3Var.h(f92VarJ);
                    f92VarJ.k();
                    arrayList.add(j6g.a);
                }
                linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap2;
        }

        @Override // j14.a
        public final Set<n8a> a() {
            return (Set) zte.c(this.g, j[0]);
        }

        @Override // j14.a
        public final Collection b(n8a n8aVar, dia diaVar) {
            n8aVar.getClass();
            return !c().contains(n8aVar) ? zr4.a : (Collection) ((j29.k) this.e).invoke(n8aVar);
        }

        @Override // j14.a
        public final Set<n8a> c() {
            return (Set) zte.c(this.h, j[1]);
        }

        @Override // j14.a
        public final Collection d(n8a n8aVar, dia diaVar) {
            n8aVar.getClass();
            return !a().contains(n8aVar) ? zr4.a : (Collection) ((j29.k) this.d).invoke(n8aVar);
        }

        @Override // j14.a
        public final zvf e(n8a n8aVar) {
            n8aVar.getClass();
            return this.f.invoke(n8aVar);
        }

        @Override // j14.a
        public final Set<n8a> f() {
            return this.c.keySet();
        }

        @Override // j14.a
        public final void g(ArrayList arrayList, lz3 lz3Var, Function1 function1) {
            lz3Var.getClass();
            boolean zA = lz3Var.a(lz3.j);
            dia diaVar = dia.d;
            ym9 ym9Var = ym9.b;
            if (zA) {
                Set<n8a> setC = c();
                ArrayList arrayList2 = new ArrayList();
                for (n8a n8aVar : setC) {
                    if (((Boolean) function1.invoke(n8aVar)).booleanValue()) {
                        arrayList2.addAll(b(n8aVar, diaVar));
                    }
                }
                w92.E0(ym9Var, arrayList2);
                arrayList.addAll(arrayList2);
            }
            if (lz3Var.a(lz3.i)) {
                Set<n8a> setA = a();
                ArrayList arrayList3 = new ArrayList();
                for (n8a n8aVar2 : setA) {
                    if (((Boolean) function1.invoke(n8aVar2)).booleanValue()) {
                        arrayList3.addAll(d(n8aVar2, diaVar));
                    }
                }
                w92.E0(ym9Var, arrayList3);
                arrayList.addAll(arrayList3);
            }
        }
    }

    static {
        l4c l4cVar = new l4c(j14.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
        iwc iwcVar = fwc.a;
        f = new qf8[]{iwcVar.g(l4cVar), z3.i(j14.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0, iwcVar)};
    }

    public j14(h04 h04Var, List<b5c> list, List<g5c> list2, List<k5c> list3, gu5<? extends Collection<n8a>> gu5Var) {
        h04Var.getClass();
        this.b = h04Var;
        g04 g04Var = h04Var.a;
        g04Var.c.getClass();
        this.c = new b(list, list2, list3);
        j29 j29Var = g04Var.a;
        int i = 0;
        h14 h14Var = new h14(gu5Var, i);
        j29Var.getClass();
        this.d = new j29.h(j29Var, h14Var);
        i14 i14Var = new i14(this, i);
        j29Var.getClass();
        this.e = new j29.f(j29Var, i14Var);
    }

    @Override // defpackage.jn9, defpackage.in9
    public final Set<n8a> a() {
        return this.c.a();
    }

    @Override // defpackage.jn9, defpackage.in9
    public Collection b(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        return this.c.b(n8aVar, diaVar);
    }

    @Override // defpackage.jn9, defpackage.in9
    public final Set<n8a> c() {
        return this.c.c();
    }

    @Override // defpackage.jn9, defpackage.z4d
    public v62 d(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        if (!q(n8aVar)) {
            a aVar = this.c;
            if (aVar.f().contains(n8aVar)) {
                return aVar.e(n8aVar);
            }
            return null;
        }
        g04 g04Var = this.b.a;
        a62 a62VarL = l(n8aVar);
        y52 y52Var = g04Var.t;
        Set<a62> set = y52.c;
        y52Var.getClass();
        return (t52) y52Var.b.invoke(new y52.a(a62VarL, null));
    }

    @Override // defpackage.jn9, defpackage.in9
    public Collection<sfe> e(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        return this.c.d(n8aVar, diaVar);
    }

    @Override // defpackage.jn9, defpackage.in9
    public final Set<n8a> g() {
        qf8<Object> qf8Var = f[1];
        sma smaVar = this.e;
        smaVar.getClass();
        qf8Var.getClass();
        return (Set) smaVar.invoke();
    }

    public abstract void h(ArrayList arrayList, Function1 function1);

    public final Collection i(lz3 lz3Var, Function1 function1) {
        zvf zvfVarE;
        lz3Var.getClass();
        ArrayList arrayList = new ArrayList(0);
        if (lz3Var.a(lz3.f)) {
            h(arrayList, function1);
        }
        a aVar = this.c;
        aVar.g(arrayList, lz3Var, function1);
        if (lz3Var.a(lz3.l)) {
            for (n8a n8aVar : m()) {
                if (((Boolean) function1.invoke(n8aVar)).booleanValue()) {
                    g04 g04Var = this.b.a;
                    a62 a62VarL = l(n8aVar);
                    y52 y52Var = g04Var.t;
                    Set<a62> set = y52.c;
                    y52Var.getClass();
                    t52 t52Var = (t52) y52Var.b.invoke(new y52.a(a62VarL, null));
                    if (t52Var != null) {
                        arrayList.add(t52Var);
                    }
                }
            }
        }
        if (lz3Var.a(lz3.g)) {
            for (n8a n8aVar2 : aVar.f()) {
                if (((Boolean) function1.invoke(n8aVar2)).booleanValue() && (zvfVarE = aVar.e(n8aVar2)) != null) {
                    arrayList.add(zvfVarE);
                }
            }
        }
        return r03.i(arrayList);
    }

    public void j(n8a n8aVar, ArrayList arrayList) {
        n8aVar.getClass();
    }

    public void k(n8a n8aVar, ArrayList arrayList) {
        n8aVar.getClass();
    }

    public abstract a62 l(n8a n8aVar);

    public final Set<n8a> m() {
        return (Set) zte.c(this.d, f[0]);
    }

    public abstract Set<n8a> n();

    public abstract Set<n8a> o();

    public abstract Set<n8a> p();

    public boolean q(n8a n8aVar) {
        n8aVar.getClass();
        return m().contains(n8aVar);
    }

    public boolean r(r14 r14Var) {
        return true;
    }
}
