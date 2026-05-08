package defpackage;

import defpackage.s62;
import defpackage.vi8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class jxa implements s62 {
    public final Map<kwf, kwf> a;
    public final vi8.a b;
    public final bj8 c;
    public final aj8 d;

    public jxa(HashMap map, vi8.a aVar, bj8 bj8Var, aj8 aj8Var) {
        aVar.getClass();
        bj8Var.getClass();
        aj8Var.getClass();
        this.a = map;
        this.b = aVar;
        this.c = bj8Var;
        this.d = aj8Var;
    }

    @Override // defpackage.fyf
    public final txf A(lwf lwfVar, int i) {
        return s62.a.n(lwfVar, i);
    }

    @Override // defpackage.fyf
    public final boolean B(zi8 zi8Var) {
        zi8Var.getClass();
        return zi8Var instanceof hla;
    }

    @Override // defpackage.fyf
    public final boolean C(fdd fddVar) {
        return s62.a.L(fddVar);
    }

    @Override // defpackage.fyf
    public final mge D(fdd fddVar) {
        return s62.a.j(fddVar);
    }

    @Override // defpackage.fyf
    public final mge E(zi8 zi8Var) {
        return s62.a.h(zi8Var);
    }

    @Override // defpackage.fyf
    public final boolean F(lwf lwfVar) {
        return s62.a.F(lwfVar);
    }

    @Override // defpackage.fyf
    public final boolean G(lwf lwfVar) {
        return s62.a.y(lwfVar);
    }

    @Override // defpackage.fyf
    public final dwf H(zi8 zi8Var, int i) {
        return s62.a.m(zi8Var, i);
    }

    @Override // defpackage.fyf
    public final cwf I(fdd fddVar) {
        return s62.a.c(fddVar);
    }

    @Override // defpackage.fyf
    public final zi8 J(zi8 zi8Var) {
        return s62.a.X(this, zi8Var);
    }

    @Override // defpackage.fyf
    public final boolean K(txf txfVar, lwf lwfVar) {
        return s62.a.u(txfVar, lwfVar);
    }

    @Override // defpackage.fyf
    public final int L(zi8 zi8Var) {
        return s62.a.b(zi8Var);
    }

    @Override // defpackage.fyf
    public final boolean M(fdd fddVar) {
        return s62.a.A(fddVar);
    }

    @Override // defpackage.fyf
    public final boolean N(dwf dwfVar) {
        return s62.a.J(dwfVar);
    }

    @Override // defpackage.fyf
    public final nyf O(dwf dwfVar) {
        return s62.a.r(dwfVar);
    }

    @Override // defpackage.fyf
    public final lha P(px1 px1Var) {
        return s62.a.U(px1Var);
    }

    @Override // defpackage.fyf
    public final wxf Q(lx1 lx1Var) {
        return s62.a.R(lx1Var);
    }

    @Override // defpackage.fyf
    public final mge R(jh5 jh5Var) {
        return s62.a.M(jh5Var);
    }

    @Override // defpackage.fyf
    public final mge S(zi8 zi8Var) {
        mge mgeVarM;
        zi8Var.getClass();
        jh5 jh5VarG = s62.a.g(zi8Var);
        if (jh5VarG != null && (mgeVarM = s62.a.M(jh5VarG)) != null) {
            return mgeVarM;
        }
        mge mgeVarH = s62.a.h(zi8Var);
        mgeVarH.getClass();
        return mgeVarH;
    }

    @Override // defpackage.fyf
    public final Collection<zi8> T(lwf lwfVar) {
        return s62.a.T(lwfVar);
    }

    @Override // defpackage.fyf
    public final boolean U(lwf lwfVar) {
        return s62.a.z(lwfVar);
    }

    @Override // defpackage.fyf
    public final kwf V(fdd fddVar) {
        return s62.a.V(fddVar);
    }

    @Override // defpackage.fyf
    public final boolean W(fdd fddVar) {
        return s62.a.C(s62.a.V(fddVar));
    }

    @Override // defpackage.fyf
    public final px1 X(mge mgeVar) {
        return s62.a.d(this, mgeVar);
    }

    @Override // defpackage.fyf
    public final t62 Y(fdd fddVar) {
        return s62.a.S(this, fddVar);
    }

    @Override // defpackage.fyf
    public final Collection<zi8> Z(fdd fddVar) {
        return s62.a.Q(this, fddVar);
    }

    @Override // defpackage.fyf
    public final boolean a(px1 px1Var) {
        return px1Var instanceof ix1;
    }

    @Override // defpackage.fyf
    public final p7g a0(zi8 zi8Var) {
        return s62.a.O(zi8Var);
    }

    @Override // defpackage.fyf
    public final int b(cwf cwfVar) {
        cwfVar.getClass();
        if (cwfVar instanceof fdd) {
            return s62.a.b((zi8) cwfVar);
        }
        if (cwfVar instanceof ts0) {
            return ((ts0) cwfVar).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(cwfVar);
        l.i(sb, ", ", fwc.a.b(cwfVar.getClass()));
        return 0;
    }

    @Override // defpackage.s62
    public final mge b0(fdd fddVar) {
        return s62.a.Y(fddVar, true);
    }

    @Override // defpackage.fyf
    public final boolean c(zi8 zi8Var) {
        zi8Var.getClass();
        jh5 jh5VarG = s62.a.g(zi8Var);
        return (jh5VarG != null ? s62.a.f(jh5VarG) : null) != null;
    }

    @Override // defpackage.gyf
    public final boolean c0(fdd fddVar, fdd fddVar2) {
        return s62.a.v(fddVar, fddVar2);
    }

    @Override // defpackage.fyf
    public final p7g d(dwf dwfVar) {
        return s62.a.o(this, dwfVar);
    }

    @Override // defpackage.fyf
    public final boolean d0(lwf lwfVar, lwf lwfVar2) {
        lwfVar.getClass();
        lwfVar2.getClass();
        if (!(lwfVar instanceof kwf)) {
            l5.q("Failed requirement.");
            return false;
        }
        if (!(lwfVar2 instanceof kwf)) {
            l5.q("Failed requirement.");
            return false;
        }
        if (s62.a.a(lwfVar, lwfVar2)) {
            return true;
        }
        kwf kwfVar = (kwf) lwfVar;
        kwf kwfVar2 = (kwf) lwfVar2;
        if (this.b.a(kwfVar, kwfVar2)) {
            return true;
        }
        Map<kwf, kwf> map = this.a;
        if (map != null) {
            kwf kwfVar3 = map.get(kwfVar);
            kwf kwfVar4 = map.get(kwfVar2);
            if (kwfVar3 != null && kwfVar3.equals(kwfVar2)) {
                return true;
            }
            if (kwfVar4 != null && kwfVar4.equals(kwfVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fyf
    public final boolean e(lwf lwfVar) {
        return s62.a.D(lwfVar);
    }

    @Override // defpackage.fyf
    public final boolean e0(fdd fddVar) {
        fddVar.getClass();
        mge mgeVarH = s62.a.h(fddVar);
        return (mgeVarH != null ? s62.a.d(this, r0(mgeVarH)) : null) != null;
    }

    @Override // defpackage.fyf
    public final boolean f(lwf lwfVar) {
        return s62.a.x(lwfVar);
    }

    @Override // defpackage.fyf
    public final jh5 f0(zi8 zi8Var) {
        return s62.a.g(zi8Var);
    }

    @Override // defpackage.fyf
    public final boolean g(fdd fddVar) {
        fddVar.getClass();
        return s62.a.F(g0(fddVar)) && !s62.a.G(fddVar);
    }

    @Override // defpackage.fyf
    public final kwf g0(zi8 zi8Var) {
        zi8Var.getClass();
        mge mgeVarH = s62.a.h(zi8Var);
        if (mgeVarH == null) {
            mgeVarH = S(zi8Var);
        }
        return s62.a.V(mgeVarH);
    }

    @Override // defpackage.fyf
    public final boolean h(fdd fddVar) {
        fddVar.getClass();
        return s62.a.x(s62.a.V(fddVar));
    }

    @Override // defpackage.fyf
    public final boolean h0(lwf lwfVar) {
        return s62.a.C(lwfVar);
    }

    @Override // defpackage.fyf
    public final dwf i(fdd fddVar, int i) {
        fddVar.getClass();
        if (i < 0 || i >= s62.a.b(fddVar)) {
            return null;
        }
        return s62.a.m(fddVar, i);
    }

    @Override // defpackage.fyf
    public final px1 i0(fdd fddVar) {
        fddVar.getClass();
        return s62.a.d(this, r0(fddVar));
    }

    @Override // defpackage.fyf
    public final nyf j(txf txfVar) {
        return s62.a.s(txfVar);
    }

    @Override // defpackage.fyf
    public final boolean j0(lwf lwfVar) {
        return s62.a.w(lwfVar);
    }

    @Override // defpackage.s62
    public final mge k(jh5 jh5Var) {
        return s62.a.W(jh5Var);
    }

    @Override // defpackage.fyf
    public final boolean k0(px1 px1Var) {
        return s62.a.I(px1Var);
    }

    @Override // defpackage.fyf
    public final p7g l(px1 px1Var) {
        return s62.a.N(px1Var);
    }

    @Override // defpackage.fyf
    public final dwf l0(cwf cwfVar, int i) {
        cwfVar.getClass();
        if (cwfVar instanceof oge) {
            return s62.a.m((zi8) cwfVar, i);
        }
        if (cwfVar instanceof ts0) {
            dwf dwfVar = ((ts0) cwfVar).get(i);
            dwfVar.getClass();
            return dwfVar;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(cwfVar);
        l.i(sb, ", ", fwc.a.b(cwfVar.getClass()));
        return null;
    }

    @Override // defpackage.s62
    public final mge m(jh5 jh5Var) {
        return s62.a.M(jh5Var);
    }

    @Override // defpackage.fyf
    public final boolean m0(zi8 zi8Var) {
        zi8Var.getClass();
        return !wl7.b(s62.a.V(S(zi8Var)), s62.a.V(v(zi8Var)));
    }

    @Override // defpackage.fyf
    public final hx1 n(px1 px1Var) {
        return s62.a.k(px1Var);
    }

    @Override // defpackage.fyf
    public final boolean n0(zi8 zi8Var) {
        return s62.a.E(zi8Var);
    }

    @Override // defpackage.fyf
    public final boolean o(zi8 zi8Var) {
        zi8Var.getClass();
        return s62.a.E(S(zi8Var)) != s62.a.E(v(zi8Var));
    }

    @Override // defpackage.fyf
    public final void o0(fdd fddVar, lwf lwfVar) {
    }

    @Override // defpackage.fyf
    public final boolean p(zi8 zi8Var) {
        zi8Var.getClass();
        mge mgeVarH = s62.a.h(zi8Var);
        return (mgeVarH != null ? s62.a.e(mgeVarH) : null) != null;
    }

    @Override // defpackage.s62
    public final p7g p0(oge ogeVar, oge ogeVar2) {
        return s62.a.l(this, ogeVar, ogeVar2);
    }

    @Override // defpackage.s62
    public final mge q(ui8 ui8Var) {
        return s62.a.h(ui8Var);
    }

    public final iwf q0() {
        aj8 aj8Var = this.d;
        aj8Var.getClass();
        bj8 bj8Var = this.c;
        bj8Var.getClass();
        return new iwf(true, true, this, aj8Var, bj8Var);
    }

    @Override // defpackage.fyf
    public final boolean r(fdd fddVar) {
        fddVar.getClass();
        return s62.a.e(fddVar) != null;
    }

    public final oge r0(fdd fddVar) {
        mge mgeVar;
        fddVar.getClass();
        fs3 fs3VarE = s62.a.e(fddVar);
        return (fs3VarE == null || (mgeVar = fs3VarE.b) == null) ? (oge) fddVar : mgeVar;
    }

    @Override // defpackage.fyf
    public final rxf s(myf myfVar) {
        return s62.a.p(myfVar);
    }

    @Override // defpackage.fyf
    public final boolean t(fdd fddVar) {
        return s62.a.K(fddVar);
    }

    @Override // defpackage.fyf
    public final int u(lwf lwfVar) {
        return s62.a.P(lwfVar);
    }

    @Override // defpackage.fyf
    public final mge v(zi8 zi8Var) {
        mge mgeVarW;
        zi8Var.getClass();
        jh5 jh5VarG = s62.a.g(zi8Var);
        if (jh5VarG != null && (mgeVarW = s62.a.W(jh5VarG)) != null) {
            return mgeVarW;
        }
        mge mgeVarH = s62.a.h(zi8Var);
        mgeVarH.getClass();
        return mgeVarH;
    }

    @Override // defpackage.fyf
    public final mge w(fdd fddVar) {
        return s62.a.Y(fddVar, false);
    }

    @Override // defpackage.fyf
    public final p7g x(ArrayList arrayList) {
        mge mgeVar;
        int size = arrayList.size();
        if (size == 0) {
            r6.g("Expected some types");
            return null;
        }
        if (size == 1) {
            return (p7g) z92.j1(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            p7g p7gVar = (p7g) it.next();
            z = z || pnb.D(p7gVar);
            if (p7gVar instanceof mge) {
                mgeVar = (mge) p7gVar;
            } else {
                if (!(p7gVar instanceof jh5)) {
                    l.g();
                    return null;
                }
                if (p7gVar instanceof oe4) {
                    return p7gVar;
                }
                mgeVar = ((jh5) p7gVar).b;
                z2 = true;
            }
            arrayList2.add(mgeVar);
        }
        if (z) {
            return lx4.c(kx4.k0, arrayList.toString());
        }
        if (!z2) {
            return mxf.a.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(t92.r0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(w74.G((p7g) it2.next()));
        }
        mxf mxfVar = mxf.a;
        return yi8.a(mxfVar.b(arrayList2), mxfVar.b(arrayList3));
    }

    @Override // defpackage.fyf
    public final yxf y(zi8 zi8Var) {
        return s62.a.i(zi8Var);
    }

    @Override // defpackage.fyf
    public final mge z(jh5 jh5Var) {
        return s62.a.W(jh5Var);
    }
}
