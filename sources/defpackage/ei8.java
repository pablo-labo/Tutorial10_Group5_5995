package defpackage;

import defpackage.ere;
import defpackage.fp1;
import defpackage.j29;
import defpackage.jz;
import defpackage.lf0;
import defpackage.mbb;
import defpackage.rv5;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ei8 {
    public static final n8a e = n8a.n("<built-ins module>");
    public yx9 a;
    public final fla<a> b;
    public final nn9<n8a, t52> c;
    public final j29 d;

    public static class a {
        public final EnumMap a;
        public final HashMap b;

        public a() {
            throw null;
        }

        public a(EnumMap enumMap, HashMap map, HashMap map2) {
            this.a = enumMap;
            this.b = map2;
        }
    }

    public ei8(j29 j29Var) {
        this.d = j29Var;
        this.b = new j29.h(j29Var, new di8(this));
        this.c = j29Var.g(new uq0(this, 1));
    }

    public static boolean A(aj3 aj3Var) {
        if (aj3Var != null) {
            return yz3.i(aj3Var, ip1.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean B(ui8 ui8Var, nq5 nq5Var) {
        if (ui8Var == null) {
            a(97);
            throw null;
        }
        if (nq5Var != null) {
            return J(ui8Var.M0(), nq5Var);
        }
        a(98);
        throw null;
    }

    public static boolean C(ui8 ui8Var, nq5 nq5Var) {
        if (nq5Var != null) {
            return B(ui8Var, nq5Var) && !ui8Var.N0();
        }
        a(135);
        throw null;
    }

    public static boolean D(kv5 kv5Var) {
        if (kv5Var.a().getAnnotations().P0(ere.a.m)) {
            return true;
        }
        if (!(kv5Var instanceof d4c)) {
            return false;
        }
        d4c d4cVar = (d4c) kv5Var;
        boolean zN = d4cVar.N();
        g4c g4cVarC = d4cVar.c();
        p4c p4cVarE = d4cVar.e();
        if (g4cVarC == null || !D(g4cVarC)) {
            return false;
        }
        if (zN) {
            return p4cVarE != null && D(p4cVarE);
        }
        return true;
    }

    public static boolean E(ui8 ui8Var, nq5 nq5Var) {
        if (nq5Var != null) {
            return !ui8Var.N0() && B(ui8Var, nq5Var);
        }
        a(106);
        throw null;
    }

    public static boolean F(ui8 ui8Var) {
        if (ui8Var == null) {
            a(136);
            throw null;
        }
        if (ui8Var != null) {
            return B(ui8Var, ere.a.b) && !kyf.e(ui8Var);
        }
        a(138);
        throw null;
    }

    public static boolean G(ui8 ui8Var) {
        if (ui8Var != null) {
            v62 v62VarD = ui8Var.M0().d();
            return (v62VarD == null || s(v62VarD) == null) ? false : true;
        }
        a(91);
        throw null;
    }

    public static boolean H(ui8 ui8Var) {
        if (ui8Var.N0()) {
            return false;
        }
        v62 v62VarD = ui8Var.M0().d();
        return (v62VarD instanceof t52) && u((t52) v62VarD) != null;
    }

    public static boolean I(ui8 ui8Var) {
        return E(ui8Var, ere.a.f);
    }

    public static boolean J(kwf kwfVar, nq5 nq5Var) {
        if (kwfVar == null) {
            a(101);
            throw null;
        }
        if (nq5Var != null) {
            v62 v62VarD = kwfVar.d();
            return (v62VarD instanceof t52) && b((t52) v62VarD, nq5Var);
        }
        a(102);
        throw null;
    }

    public static boolean K(v62 v62Var) {
        if (v62Var == null) {
            a(10);
            throw null;
        }
        for (aj3 aj3VarD = v62Var; aj3VarD != null; aj3VarD = aj3VarD.d()) {
            if (aj3VarD instanceof lya) {
                return ((lya) aj3VarD).h().c(ere.k);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r23) {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei8.a(int):void");
    }

    public static boolean b(t52 t52Var, nq5 nq5Var) {
        if (t52Var == null) {
            a(103);
            throw null;
        }
        if (nq5Var != null) {
            return t52Var.getName().equals(nq5Var.f()) && nq5Var.equals(yz3.g(t52Var));
        }
        a(104);
        throw null;
    }

    public static bnb s(v62 v62Var) {
        if (v62Var == null) {
            a(77);
            throw null;
        }
        if (ere.a.e0.contains(v62Var.getName())) {
            return (bnb) ere.a.g0.get(yz3.g(v62Var));
        }
        return null;
    }

    public static bnb u(t52 t52Var) {
        if (ere.a.d0.contains(t52Var.getName())) {
            return (bnb) ere.a.f0.get(yz3.g(t52Var));
        }
        return null;
    }

    public static boolean y(ui8 ui8Var) {
        if (ui8Var != null) {
            return B(ui8Var, ere.a.a);
        }
        a(139);
        throw null;
    }

    public static boolean z(ui8 ui8Var) {
        if (ui8Var != null) {
            return B(ui8Var, ere.a.g);
        }
        a(88);
        throw null;
    }

    public final void c(boolean z) {
        n8a n8aVar = e;
        n8aVar.getClass();
        j29 j29Var = this.d;
        yx9 yx9Var = new yx9(n8aVar, j29Var, this, 48);
        this.a = yx9Var;
        fp1.a.getClass();
        yx9Var.W = fp1.a.b.getValue().a(j29Var, this.a, m(), q(), d(), z);
        yx9 yx9Var2 = this.a;
        yx9Var2.getClass();
        yx9Var2.V = new ze4(ut0.E0(new yx9[]{yx9Var2}), 6);
    }

    public jz d() {
        return jz.a.a;
    }

    public final mge e() {
        mge mgeVarO = k("Any").o();
        if (mgeVarO != null) {
            return mgeVarO;
        }
        a(51);
        throw null;
    }

    public final ui8 f(ui8 ui8Var) {
        if (ui8Var == null) {
            a(68);
            throw null;
        }
        ui8 ui8VarG = g(ui8Var);
        if (ui8VarG != null) {
            return ui8VarG;
        }
        bg.n(ui8Var, "not array: ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ui8 g(defpackage.ui8 r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L90
            boolean r1 = z(r4)
            r2 = 0
            if (r1 == 0) goto L26
            java.util.List r3 = r4.K0()
            int r3 = r3.size()
            r1 = 1
            if (r3 == r1) goto L17
            goto L8f
        L17:
            java.util.List r3 = r4.K0()
            java.lang.Object r3 = r3.get(r2)
            wxf r3 = (defpackage.wxf) r3
            ui8 r3 = r3.getType()
            return r3
        L26:
            p7g r4 = defpackage.kyf.g(r4, r2)
            fla<ei8$a> r3 = r3.b
            java.lang.Object r3 = r3.invoke()
            ei8$a r3 = (ei8.a) r3
            java.util.HashMap r3 = r3.b
            java.lang.Object r3 = r3.get(r4)
            ui8 r3 = (defpackage.ui8) r3
            if (r3 == 0) goto L3d
            return r3
        L3d:
            int r3 = defpackage.yz3.a
            kwf r3 = r4.M0()
            v62 r3 = r3.d()
            if (r3 != 0) goto L4b
            r3 = r0
            goto L4f
        L4b:
            xx9 r3 = defpackage.yz3.e(r3)
        L4f:
            if (r3 == 0) goto L8f
            kwf r4 = r4.M0()
            v62 r4 = r4.d()
            if (r4 != 0) goto L5d
        L5b:
            r3 = r0
            goto L8c
        L5d:
            java.util.Set<n8a> r1 = defpackage.k7g.a
            n8a r1 = r4.getName()
            r1.getClass()
            java.util.LinkedHashSet r2 = defpackage.k7g.e
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L6f
            goto L5b
        L6f:
            a62 r4 = defpackage.b04.f(r4)
            if (r4 != 0) goto L76
            goto L5b
        L76:
            java.util.HashMap<a62, a62> r1 = defpackage.k7g.c
            java.lang.Object r4 = r1.get(r4)
            a62 r4 = (defpackage.a62) r4
            if (r4 != 0) goto L81
            goto L5b
        L81:
            t52 r3 = defpackage.rc5.a(r3, r4)
            if (r3 != 0) goto L88
            goto L5b
        L88:
            mge r3 = r3.o()
        L8c:
            if (r3 == 0) goto L8f
            return r3
        L8f:
            return r0
        L90:
            r3 = 70
            a(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei8.g(ui8):ui8");
    }

    public final mge h(p7g p7gVar) {
        if (p7gVar != null) {
            return i(ylg.INVARIANT, p7gVar, lf0.a.a);
        }
        a(83);
        throw null;
    }

    public final mge i(ylg ylgVar, ui8 ui8Var, lf0 lf0Var) {
        if (ui8Var != null) {
            return yi8.b(hwf.d(lf0Var), k("Array"), Collections.singletonList(new yxf(ui8Var, ylgVar)));
        }
        a(79);
        throw null;
    }

    public final t52 j(mq5 mq5Var) {
        if (mq5Var == null) {
            a(12);
            throw null;
        }
        t52 t52VarN = c0h.N(l(), mq5Var);
        if (t52VarN != null) {
            return t52VarN;
        }
        a(13);
        throw null;
    }

    public final t52 k(String str) {
        if (str != null) {
            return (t52) ((j29.k) this.c).invoke(n8a.h(str));
        }
        a(14);
        throw null;
    }

    public final yx9 l() {
        this.a.getClass();
        yx9 yx9Var = this.a;
        if (yx9Var != null) {
            return yx9Var;
        }
        a(7);
        throw null;
    }

    public Iterable<v52> m() {
        List listSingletonList = Collections.singletonList(new bp1(this.d, l()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final mge n() {
        mge mgeVarP = p();
        if (mgeVarP != null) {
            return mgeVarP;
        }
        a(53);
        throw null;
    }

    public final mge o() {
        mge mgeVarO = k("Nothing").o();
        if (mgeVarO != null) {
            return mgeVarO;
        }
        a(49);
        throw null;
    }

    public final mge p() {
        mge mgeVarQ0 = e().Q0(true);
        if (mgeVarQ0 != null) {
            return mgeVarQ0;
        }
        a(52);
        throw null;
    }

    public mbb q() {
        return mbb.b.a;
    }

    public final mge r(bnb bnbVar) {
        if (bnbVar == null) {
            a(73);
            throw null;
        }
        mge mgeVar = (mge) this.b.invoke().a.get(bnbVar);
        if (mgeVar != null) {
            return mgeVar;
        }
        a(74);
        throw null;
    }

    public final mge t(bnb bnbVar) {
        if (bnbVar == null) {
            a(54);
            throw null;
        }
        mge mgeVarO = k(bnbVar.m().c()).o();
        if (mgeVarO != null) {
            return mgeVarO;
        }
        a(55);
        throw null;
    }

    public final mge v() {
        mge mgeVarO = k("String").o();
        if (mgeVarO != null) {
            return mgeVarO;
        }
        a(66);
        throw null;
    }

    public final t52 w(int i) {
        return j(ere.f.a(n8a.h(rv5.d.c.b + i)));
    }

    public final mge x() {
        mge mgeVarO = k("Unit").o();
        if (mgeVarO != null) {
            return mgeVarO;
        }
        a(65);
        throw null;
    }
}
