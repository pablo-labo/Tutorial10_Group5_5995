package defpackage;

import defpackage.cla;
import defpackage.cng;
import defpackage.cqd;
import defpackage.cze;
import defpackage.in9;
import defpackage.j29;
import defpackage.lf0;
import defpackage.s5c;
import defpackage.u4c;
import defpackage.v5c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class v04 extends x0 implements aj3 {
    public final qne V;
    public final a62 W;
    public final ax9 X;
    public final ws3 Y;
    public final c62 Z;
    public final h04 a0;
    public final jn9 b0;
    public final b c0;
    public final cqd<a> d0;
    public final u4c e;
    public final c e0;
    public final xf1 f;
    public final aj3 f0;
    public final sma<m52> g0;
    public final fla<Collection<m52>> h0;
    public final sma<t52> i0;
    public final fla<Collection<t52>> j0;
    public final sma<hlg<mge>> k0;
    public final s5c.a l0;
    public final lf0 m0;

    public final class a extends j14 {
        public final bj8 g;
        public final fla<Collection<aj3>> h;
        public final fla<Collection<ui8>> i;
        public final /* synthetic */ v04 j;

        public a(v04 v04Var, bj8 bj8Var) {
            bj8Var.getClass();
            this.j = v04Var;
            h04 h04Var = v04Var.a0;
            u4c u4cVar = v04Var.e;
            List<b5c> listR0 = u4cVar.r0();
            listR0.getClass();
            List<g5c> listD0 = u4cVar.D0();
            listD0.getClass();
            List<k5c> listH0 = u4cVar.H0();
            listH0.getClass();
            List<Integer> listC0 = u4cVar.C0();
            listC0.getClass();
            List<Integer> list = listC0;
            o8a o8aVar = v04Var.a0.b;
            ArrayList arrayList = new ArrayList(t92.r0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q8a.b(o8aVar, ((Number) it.next()).intValue()));
            }
            int i = 0;
            super(h04Var, listR0, listD0, listH0, new r04(arrayList, i));
            this.g = bj8Var;
            j29 j29Var = this.b.a.a;
            s04 s04Var = new s04(this, i);
            j29Var.getClass();
            this.h = new j29.h(j29Var, s04Var);
            j29 j29Var2 = this.b.a.a;
            t04 t04Var = new t04(this, i);
            j29Var2.getClass();
            this.i = new j29.h(j29Var2, t04Var);
        }

        @Override // defpackage.j14, defpackage.jn9, defpackage.in9
        public final Collection b(n8a n8aVar, dia diaVar) {
            n8aVar.getClass();
            s(n8aVar, diaVar);
            return this.c.b(n8aVar, diaVar);
        }

        @Override // defpackage.j14, defpackage.jn9, defpackage.z4d
        public final v62 d(n8a n8aVar, dia diaVar) {
            t52 t52VarInvoke;
            n8aVar.getClass();
            diaVar.getClass();
            s(n8aVar, diaVar);
            c cVar = this.j.e0;
            return (cVar == null || (t52VarInvoke = cVar.b.invoke(n8aVar)) == null) ? super.d(n8aVar, diaVar) : t52VarInvoke;
        }

        @Override // defpackage.j14, defpackage.jn9, defpackage.in9
        public final Collection<sfe> e(n8a n8aVar, dia diaVar) {
            n8aVar.getClass();
            s(n8aVar, diaVar);
            return super.e(n8aVar, diaVar);
        }

        @Override // defpackage.jn9, defpackage.z4d
        public final Collection<aj3> f(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
            lz3Var.getClass();
            return this.h.invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r0v3, types: [zr4] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
        @Override // defpackage.j14
        public final void h(ArrayList arrayList, Function1 function1) {
            ?? arrayList2;
            c cVar = this.j.e0;
            if (cVar != null) {
                Set<n8a> setKeySet = cVar.a.keySet();
                arrayList2 = new ArrayList();
                for (n8a n8aVar : setKeySet) {
                    n8aVar.getClass();
                    t52 t52VarInvoke = cVar.b.invoke(n8aVar);
                    if (t52VarInvoke != null) {
                        arrayList2.add(t52VarInvoke);
                    }
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = zr4.a;
            }
            arrayList.addAll(arrayList2);
        }

        @Override // defpackage.j14
        public final void j(n8a n8aVar, ArrayList arrayList) {
            n8aVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator<ui8> it = this.i.invoke().iterator();
            while (it.hasNext()) {
                arrayList2.addAll(it.next().n().e(n8aVar, dia.c));
            }
            h04 h04Var = this.b;
            arrayList.addAll(h04Var.a.n.d(n8aVar, this.j));
            ArrayList arrayList3 = new ArrayList(arrayList);
            h04Var.a.q.a().h(n8aVar, arrayList2, arrayList3, this.j, new u04(arrayList));
        }

        @Override // defpackage.j14
        public final void k(n8a n8aVar, ArrayList arrayList) {
            n8aVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator<ui8> it = this.i.invoke().iterator();
            while (it.hasNext()) {
                arrayList2.addAll(it.next().n().b(n8aVar, dia.c));
            }
            ArrayList arrayList3 = new ArrayList(arrayList);
            this.b.a.q.a().h(n8aVar, arrayList2, arrayList3, this.j, new u04(arrayList));
        }

        @Override // defpackage.j14
        public final a62 l(n8a n8aVar) {
            n8aVar.getClass();
            return this.j.W.d(n8aVar);
        }

        @Override // defpackage.j14
        public final Set<n8a> n() {
            List<ui8> listB = this.j.c0.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                Set<n8a> setG = ((ui8) it.next()).n().g();
                if (setG == null) {
                    return null;
                }
                w92.w0(linkedHashSet, setG);
            }
            return linkedHashSet;
        }

        @Override // defpackage.j14
        public final Set<n8a> o() {
            v04 v04Var = this.j;
            List<ui8> listB = v04Var.c0.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                w92.w0(linkedHashSet, ((ui8) it.next()).n().a());
            }
            linkedHashSet.addAll(this.b.a.n.b(v04Var));
            return linkedHashSet;
        }

        @Override // defpackage.j14
        public final Set<n8a> p() {
            List<ui8> listB = this.j.c0.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                w92.w0(linkedHashSet, ((ui8) it.next()).n().c());
            }
            return linkedHashSet;
        }

        @Override // defpackage.j14
        public final boolean r(r14 r14Var) {
            return this.b.a.o.c(this.j, r14Var);
        }

        public final void s(n8a n8aVar, dia diaVar) {
            n8aVar.getClass();
            diaVar.getClass();
            this.b.a.i.getClass();
            this.j.getClass();
        }
    }

    public final class b extends y0 {
        public final fla<List<rxf>> c;

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            h04 h04Var = v04.this.a0;
            super(h04Var.a.a);
            j29 j29Var = h04Var.a.a;
            nx1 nx1Var = new nx1(v04.this, 2);
            j29Var.getClass();
            this.c = new j29.h(j29Var, nx1Var);
        }

        @Override // defpackage.y0, defpackage.kwf
        public final v62 d() {
            return v04.this;
        }

        @Override // defpackage.kwf
        public final boolean e() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v2 */
        @Override // defpackage.a5
        public final Collection<ui8> g() {
            String strC;
            mq5 mq5VarA;
            v04 v04Var = v04.this;
            u4c u4cVar = v04Var.e;
            h04 h04Var = v04Var.a0;
            hyf hyfVar = h04Var.d;
            u4cVar.getClass();
            List<j5c> listG0 = u4cVar.G0();
            boolean zIsEmpty = listG0.isEmpty();
            ?? arrayList = listG0;
            if (zIsEmpty) {
                arrayList = 0;
            }
            if (arrayList == 0) {
                List<Integer> listF0 = u4cVar.F0();
                listF0.getClass();
                List<Integer> list = listF0;
                arrayList = new ArrayList(t92.r0(list, 10));
                for (Integer num : list) {
                    num.getClass();
                    arrayList.add(hyfVar.a(num.intValue()));
                }
            }
            Iterable iterable = (Iterable) arrayList;
            ArrayList arrayList2 = new ArrayList(t92.r0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(h04Var.h.g((j5c) it.next()));
            }
            ArrayList arrayListH1 = z92.h1(arrayList2, h04Var.a.n.a(v04Var));
            ArrayList<cla.b> arrayList3 = new ArrayList();
            Iterator it2 = arrayListH1.iterator();
            while (it2.hasNext()) {
                v62 v62VarD = ((ui8) it2.next()).M0().d();
                cla.b bVar = v62VarD instanceof cla.b ? (cla.b) v62VarD : null;
                if (bVar != null) {
                    arrayList3.add(bVar);
                }
            }
            if (!arrayList3.isEmpty()) {
                sw4 sw4Var = h04Var.a.h;
                ArrayList arrayList4 = new ArrayList(t92.r0(arrayList3, 10));
                for (cla.b bVar2 : arrayList3) {
                    a62 a62VarF = b04.f(bVar2);
                    if (a62VarF == null || (mq5VarA = a62VarF.a()) == null || (strC = mq5VarA.a.a) == null) {
                        strC = bVar2.getName().c();
                        strC.getClass();
                    }
                    arrayList4.add(strC);
                }
                sw4Var.a(v04Var, arrayList4);
            }
            return z92.z1(arrayListH1);
        }

        @Override // defpackage.kwf
        public final List<rxf> getParameters() {
            return this.c.invoke();
        }

        @Override // defpackage.a5
        public final cze j() {
            return cze.a.a;
        }

        @Override // defpackage.y0
        /* JADX INFO: renamed from: p */
        public final t52 d() {
            return v04.this;
        }

        public final String toString() {
            String str = v04.this.getName().a;
            str.getClass();
            return str;
        }
    }

    public final class c {
        public final LinkedHashMap a;
        public final on9<n8a, t52> b;
        public final fla<Set<n8a>> c;

        public c() {
            List<z4c> listO0 = v04.this.e.o0();
            listO0.getClass();
            List<z4c> list = listO0;
            int iV = kc9.V(t92.r0(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
            for (Object obj : list) {
                linkedHashMap.put(q8a.b(v04.this.a0.b, ((z4c) obj).v()), obj);
            }
            this.a = linkedHashMap;
            v04 v04Var = v04.this;
            int i = 0;
            this.b = v04Var.a0.a.a.d(new w04(i, this, v04Var));
            j29 j29Var = v04.this.a0.a.a;
            x04 x04Var = new x04(this, i);
            j29Var.getClass();
            this.c = new j29.h(j29Var, x04Var);
        }
    }

    public /* synthetic */ class d extends qv5 implements Function1<bj8, a> {
        @Override // kotlin.jvm.functions.Function1
        public final a invoke(bj8 bj8Var) {
            bj8 bj8Var2 = bj8Var;
            bj8Var2.getClass();
            return new a((v04) this.receiver, bj8Var2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public v04(h04 h04Var, u4c u4cVar, o8a o8aVar, xf1 xf1Var, qne qneVar) {
        c62 c62Var;
        jn9 kteVar;
        super(h04Var.a.a, q8a.a(o8aVar, u4cVar.q0()).f());
        h04Var.getClass();
        u4cVar.getClass();
        o8aVar.getClass();
        xf1Var.getClass();
        qneVar.getClass();
        this.e = u4cVar;
        this.f = xf1Var;
        this.V = qneVar;
        this.W = q8a.a(o8aVar, u4cVar.q0());
        this.X = v5c.a((d5c) ch5.e.c(u4cVar.p0()));
        this.Y = w5c.a((q5c) ch5.d.c(u4cVar.p0()));
        u4c.c cVar = (u4c.c) ch5.f.c(u4cVar.p0());
        int i = cVar == null ? -1 : v5c.a.b[cVar.ordinal()];
        c62 c62Var2 = c62.ENUM_CLASS;
        c62 c62Var3 = c62.CLASS;
        switch (i) {
            case 1:
            default:
                c62Var = c62Var3;
                break;
            case 2:
                c62Var3 = c62.INTERFACE;
                c62Var = c62Var3;
                break;
            case 3:
                c62Var = c62Var2;
                break;
            case 4:
                c62Var3 = c62.ENUM_ENTRY;
                c62Var = c62Var3;
                break;
            case 5:
                c62Var3 = c62.ANNOTATION_CLASS;
                c62Var = c62Var3;
                break;
            case 6:
            case 7:
                c62Var3 = c62.OBJECT;
                c62Var = c62Var3;
                break;
        }
        this.Z = c62Var;
        List<l5c> listI0 = u4cVar.I0();
        listI0.getClass();
        m5c m5cVarJ0 = u4cVar.J0();
        m5cVarJ0.getClass();
        hyf hyfVar = new hyf(m5cVarJ0);
        cng cngVar = cng.b;
        p5c p5cVarK0 = u4cVar.K0();
        p5cVarK0.getClass();
        h04 h04VarA = h04Var.a(this, listI0, o8aVar, hyfVar, cng.a.a(p5cVarK0), xf1Var);
        g04 g04Var = h04VarA.a;
        j29 j29Var = g04Var.a;
        this.a0 = h04VarA;
        boolean zBooleanValue = ch5.m.c(u4cVar.p0()).booleanValue();
        int i2 = 1;
        int i3 = 0;
        if (c62Var == c62Var2) {
            kteVar = new kte(j29Var, this, zBooleanValue || wl7.b(g04Var.s.a(), Boolean.TRUE));
        } else {
            kteVar = in9.b.b;
        }
        this.b0 = kteVar;
        this.c0 = new b();
        cqd.a aVar = cqd.e;
        bj8 bj8VarC = g04Var.q.c();
        d dVar = new d(1, this, a.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0);
        aVar.getClass();
        j29Var.getClass();
        bj8VarC.getClass();
        this.d0 = new cqd<>(this, j29Var, dVar, bj8VarC);
        this.e0 = c62Var == c62Var2 ? new c() : null;
        aj3 aj3Var = h04Var.c;
        this.f0 = aj3Var;
        n04 n04Var = new n04(this, i3);
        j29Var.getClass();
        this.g0 = new j29.f(j29Var, n04Var);
        o04 o04Var = new o04(this, i3);
        j29Var.getClass();
        this.h0 = new j29.h(j29Var, o04Var);
        yo1 yo1Var = new yo1(this, i2);
        j29Var.getClass();
        this.i0 = new j29.f(j29Var, yo1Var);
        q73 q73Var = new q73(this, 1);
        j29Var.getClass();
        this.j0 = new j29.h(j29Var, q73Var);
        p04 p04Var = new p04(this, i3);
        j29Var.getClass();
        this.k0 = new j29.f(j29Var, p04Var);
        o8a o8aVar2 = h04VarA.b;
        hyf hyfVar2 = h04VarA.d;
        v04 v04Var = aj3Var instanceof v04 ? (v04) aj3Var : null;
        this.l0 = new s5c.a(u4cVar, o8aVar2, hyfVar2, qneVar, v04Var != null ? v04Var.l0 : null);
        this.m0 = !ch5.c.c(u4cVar.p0()).booleanValue() ? lf0.a.a : new kja(j29Var, new q04(this, 0));
    }

    @Override // defpackage.t52
    public final m52 C() {
        return this.g0.invoke();
    }

    @Override // defpackage.t52
    public final boolean H0() {
        return ch5.h.c(this.e.p0()).booleanValue();
    }

    @Override // defpackage.tx9
    public final in9 K(bj8 bj8Var) {
        bj8Var.getClass();
        return this.d0.a(bj8Var);
    }

    public final a K0() {
        return (a) this.d0.a(this.a0.a.q.c());
    }

    public final mge L0(n8a n8aVar) {
        Iterator it = K0().b(n8aVar, dia.V).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((d4c) next).O() == null) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        d4c d4cVar = (d4c) obj;
        return (mge) (d4cVar != null ? d4cVar.getType() : null);
    }

    @Override // defpackage.t52
    public final hlg<mge> U() {
        return this.k0.invoke();
    }

    @Override // defpackage.zm9
    public final boolean X() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    @Override // defpackage.x0, defpackage.t52
    public final List<hsc> Y() {
        h04 h04Var = this.a0;
        hyf hyfVar = h04Var.d;
        u4c u4cVar = this.e;
        u4cVar.getClass();
        List<j5c> listN0 = u4cVar.n0();
        boolean zIsEmpty = listN0.isEmpty();
        ?? arrayList = listN0;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> listM0 = u4cVar.m0();
            listM0.getClass();
            List<Integer> list = listM0;
            arrayList = new ArrayList(t92.r0(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(hyfVar.a(num.intValue()));
            }
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(t92.r0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(new isc(J0(), new nt2(this, h04Var.h.g((j5c) it.next()), null), lf0.a.a));
        }
        return arrayList2;
    }

    @Override // defpackage.t52
    public final boolean a0() {
        return ch5.f.c(this.e.p0()) == u4c.c.COMPANION_OBJECT;
    }

    @Override // defpackage.aj3
    public final aj3 d() {
        return this.f0;
    }

    @Override // defpackage.t52
    public final boolean e0() {
        return ch5.l.c(this.e.p0()).booleanValue();
    }

    @Override // defpackage.t52
    public final c62 f() {
        return this.Z;
    }

    @Override // defpackage.cj3
    public final qne g() {
        return this.V;
    }

    @Override // defpackage.ie0
    public final lf0 getAnnotations() {
        return this.m0;
    }

    @Override // defpackage.t52, defpackage.zm9, defpackage.fj3
    public final e04 getVisibility() {
        return this.Y;
    }

    @Override // defpackage.zm9
    public final boolean i0() {
        return ch5.j.c(this.e.p0()).booleanValue();
    }

    @Override // defpackage.zm9
    public final boolean isExternal() {
        return ch5.i.c(this.e.p0()).booleanValue();
    }

    @Override // defpackage.t52
    public final boolean isInline() {
        if (!ch5.k.c(this.e.p0()).booleanValue()) {
            return false;
        }
        xf1 xf1Var = this.f;
        int i = xf1Var.b;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = xf1Var.c;
            if (i2 >= 4 && (i2 > 4 || xf1Var.d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.v62
    public final kwf j() {
        return this.c0;
    }

    @Override // defpackage.t52
    public final Collection<m52> k() {
        return this.h0.invoke();
    }

    @Override // defpackage.t52
    public final in9 l0() {
        return this.b0;
    }

    @Override // defpackage.t52
    public final t52 m0() {
        return this.i0.invoke();
    }

    @Override // defpackage.t52, defpackage.w62
    public final List<rxf> p() {
        return this.a0.h.b();
    }

    @Override // defpackage.t52, defpackage.zm9
    public final ax9 r() {
        return this.X;
    }

    @Override // defpackage.t52
    public final boolean s() {
        return ch5.k.c(this.e.p0()).booleanValue() && this.f.a(1, 4, 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(i0() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // defpackage.t52
    public final Collection<t52> x() {
        return this.j0.invoke();
    }

    @Override // defpackage.w62
    public final boolean y() {
        return ch5.g.c(this.e.p0()).booleanValue();
    }
}
