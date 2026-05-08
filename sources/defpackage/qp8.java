package defpackage;

import defpackage.efe;
import defpackage.j29;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qp8 extends jn9 {
    public static final /* synthetic */ qf8<Object>[] m;
    public final mp8 b;
    public final qp8 c;
    public final fla<Collection<aj3>> d;
    public final fla<gj3> e;
    public final nn9<n8a, Collection<sfe>> f;
    public final on9<n8a, d4c> g;
    public final nn9<n8a, Collection<sfe>> h;
    public final fla i;
    public final fla j;
    public final fla k;
    public final nn9<n8a, List<d4c>> l;

    public static final class a {
        public final ui8 a;
        public final List<rlg> b;
        public final ArrayList c;
        public final List<String> d;

        public a(ui8 ui8Var, List list, ArrayList arrayList, List list2) {
            this.a = ui8Var;
            this.b = list;
            this.c = arrayList;
            this.d = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ia.f(z3.d(this.c, ia.g(this.b, this.a.hashCode() * 961, 31), 31), 31, false);
        }

        public final String toString() {
            return "MethodSignatureData(returnType=" + this.a + ", receiverType=null, valueParameters=" + this.b + ", typeParameters=" + this.c + ", hasStableParameterNames=false, errors=" + this.d + ')';
        }
    }

    public static final class b {
        public final List<rlg> a;
        public final boolean b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends rlg> list, boolean z) {
            this.a = list;
            this.b = z;
        }
    }

    static {
        l4c l4cVar = new l4c(qp8.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0);
        iwc iwcVar = fwc.a;
        m = new qf8[]{iwcVar.g(l4cVar), z3.i(qp8.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0, iwcVar), z3.i(qp8.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0, iwcVar)};
    }

    public qp8(gp8 gp8Var, mp8 mp8Var) {
        mp8Var.getClass();
        this.b = mp8Var;
        this.c = gp8Var;
        aue aueVar = mp8Var.a.a;
        int i = 3;
        this.d = aueVar.c(new i14(this, i));
        this.e = aueVar.f(new be8(this, i));
        int i2 = 2;
        this.f = aueVar.g(new q52(this, i2));
        int i3 = 1;
        this.g = aueVar.d(new ba3(this, i3));
        this.h = aueVar.g(new x52(this, i3));
        this.i = aueVar.f(new n14(this, i3));
        this.j = aueVar.f(new nf8(this, i2));
        this.k = aueVar.f(new t14(this, 4));
        this.l = aueVar.g(new pp8(this, 0));
    }

    public static ui8 l(hv7 hv7Var, mp8 mp8Var) {
        hv7Var.getClass();
        return mp8Var.d.d(hv7Var.l(), wab.A(jyf.b, hv7Var.c().a.isAnnotation(), null, 6));
    }

    public static b u(mp8 mp8Var, mv5 mv5Var, List list) {
        Pair pair;
        n8a name;
        uw7 uw7Var = mp8Var.d;
        sv7 sv7Var = mp8Var.a;
        xx9 xx9Var = sv7Var.o;
        list.getClass();
        na7 na7VarG1 = z92.G1(list);
        ArrayList arrayList = new ArrayList(t92.r0(na7VarG1, 10));
        Iterator it = na7VarG1.iterator();
        boolean z = false;
        while (true) {
            oa7 oa7Var = (oa7) it;
            if (!oa7Var.a.hasNext()) {
                return new b(z92.z1(arrayList), z);
            }
            ma7 ma7Var = (ma7) oa7Var.next();
            int i = ma7Var.a;
            xw7 xw7Var = (xw7) ma7Var.b;
            zo8 zo8VarV = ee3.v(mp8Var, xw7Var);
            lw7 lw7VarA = wab.A(jyf.b, false, null, 7);
            if (xw7Var.d()) {
                jw7 type = xw7Var.getType();
                bvc bvcVar = type instanceof bvc ? (bvc) type : null;
                if (bvcVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + xw7Var);
                }
                p7g p7gVarC = uw7Var.c(bvcVar, lw7VarA, true);
                pair = new Pair(p7gVarC, xx9Var.l().f(p7gVarC));
            } else {
                pair = new Pair(uw7Var.d(xw7Var.getType(), lw7VarA), null);
            }
            ui8 ui8Var = (ui8) pair.a();
            ui8 ui8Var2 = (ui8) pair.b();
            if (wl7.b(mv5Var.getName().c(), "equals") && list.size() == 1 && xx9Var.l().p().equals(ui8Var)) {
                name = n8a.h("other");
            } else {
                name = xw7Var.getName();
                if (name == null) {
                    z = true;
                }
                if (name == null) {
                    name = n8a.h("p" + i);
                }
            }
            arrayList.add(new slg(mv5Var, null, i, zo8VarV, name, ui8Var, false, false, false, ui8Var2, sv7Var.j.a(xw7Var)));
        }
    }

    @Override // defpackage.jn9, defpackage.in9
    public final Set<n8a> a() {
        return (Set) zte.c(this.i, m[0]);
    }

    @Override // defpackage.jn9, defpackage.in9
    public Collection b(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        return !c().contains(n8aVar) ? zr4.a : (Collection) ((j29.k) this.l).invoke(n8aVar);
    }

    @Override // defpackage.jn9, defpackage.in9
    public final Set<n8a> c() {
        return (Set) zte.c(this.j, m[1]);
    }

    @Override // defpackage.jn9, defpackage.in9
    public Collection<sfe> e(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        return !a().contains(n8aVar) ? zr4.a : (Collection) ((j29.k) this.h).invoke(n8aVar);
    }

    @Override // defpackage.jn9, defpackage.z4d
    public Collection<aj3> f(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
        lz3Var.getClass();
        return this.d.invoke();
    }

    @Override // defpackage.jn9, defpackage.in9
    public final Set<n8a> g() {
        return (Set) zte.c(this.k, m[2]);
    }

    public abstract Set<n8a> h(lz3 lz3Var, Function1<? super n8a, Boolean> function1);

    public abstract Set i(lz3 lz3Var, zz3 zz3Var);

    public void j(n8a n8aVar, ArrayList arrayList) {
        n8aVar.getClass();
    }

    public abstract gj3 k();

    public abstract void m(LinkedHashSet linkedHashSet, n8a n8aVar);

    public abstract void n(n8a n8aVar, ArrayList arrayList);

    public abstract Set o(lz3 lz3Var);

    public abstract hsc p();

    public abstract aj3 q();

    public boolean r(iv7 iv7Var) {
        return true;
    }

    public abstract a s(hv7 hv7Var, ArrayList arrayList, ui8 ui8Var, List list);

    public final iv7 t(hv7 hv7Var) {
        hv7Var.getClass();
        mp8 mp8Var = this.b;
        iv7 iv7VarA1 = iv7.a1(q(), ee3.v(mp8Var, hv7Var), hv7Var.getName(), mp8Var.a.j.a(hv7Var), this.e.invoke().e(hv7Var.getName()) != null && ((ArrayList) hv7Var.i()).isEmpty());
        mp8Var.getClass();
        mp8 mp8Var2 = new mp8(mp8Var.a, new gqf(mp8Var, iv7VarA1, hv7Var, 0), mp8Var.c);
        ArrayList typeParameters = hv7Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(t92.r0(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            rxf rxfVarA = mp8Var2.b.a((pw7) it.next());
            rxfVarA.getClass();
            arrayList.add(rxfVarA);
        }
        b bVarU = u(mp8Var2, iv7VarA1, hv7Var.i());
        a aVarS = s(hv7Var, arrayList, l(hv7Var, mp8Var2), bVarU.a);
        List<String> list = aVarS.d;
        hsc hscVarP = p();
        ArrayList arrayList2 = aVarS.c;
        List<rlg> list2 = aVarS.b;
        ui8 ui8Var = aVarS.a;
        boolean zIsAbstract = hv7Var.isAbstract();
        boolean zIsFinal = hv7Var.isFinal();
        ax9.a.getClass();
        iv7VarA1.Z0(null, hscVarP, zr4.a, arrayList2, list2, ui8Var, zIsAbstract ? ax9.e : !zIsFinal ? ax9.d : ax9.b, skg.a(hv7Var.getVisibility()), bs4.a);
        iv7VarA1.b1(false, bVarU.b);
        if (list.isEmpty()) {
            return iv7VarA1;
        }
        ((efe.a) mp8Var2.a.e).getClass();
        b0.u("Should not be called");
        return null;
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
