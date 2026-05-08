package defpackage;

import defpackage.gwf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class pt8 extends tx9 {
    public final tx9 a;
    public final TypeSubstitutor b;
    public TypeSubstitutor c;
    public ArrayList d;
    public ArrayList e;
    public k62 f;

    public pt8(tx9 tx9Var, TypeSubstitutor typeSubstitutor) {
        this.a = tx9Var;
        this.b = typeSubstitutor;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void D0(int r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt8.D0(int):void");
    }

    @Override // defpackage.t52
    public final m52 C() {
        return this.a.C();
    }

    public final TypeSubstitutor G0() {
        if (this.c == null) {
            TypeSubstitutor typeSubstitutor = this.b;
            if (typeSubstitutor.a.e()) {
                this.c = typeSubstitutor;
            } else {
                List<rxf> parameters = this.a.j().getParameters();
                this.d = new ArrayList(parameters.size());
                this.c = pg8.P(parameters, typeSubstitutor.g(), this, this.d);
                ArrayList arrayList = this.d;
                arrayList.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((rxf) obj).Q()) {
                        arrayList2.add(obj);
                    }
                }
                this.e = arrayList2;
            }
        }
        return this.c;
    }

    @Override // defpackage.t52
    public final in9 H(byf byfVar) {
        return t(byfVar, b04.h(yz3.d(this)));
    }

    @Override // defpackage.t52
    public final boolean H0() {
        return this.a.H0();
    }

    @Override // defpackage.t52
    public final hsc J0() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tx9
    public final in9 K(bj8 bj8Var) {
        if (bj8Var == null) {
            D0(13);
            throw null;
        }
        in9 in9VarK = this.a.K(bj8Var);
        if (!this.b.a.e()) {
            return new vxe(in9VarK, G0());
        }
        if (in9VarK != null) {
            return in9VarK;
        }
        D0(14);
        throw null;
    }

    @Override // defpackage.t52
    public final in9 T() {
        in9 in9VarT = this.a.T();
        if (in9VarT != null) {
            return in9VarT;
        }
        D0(28);
        throw null;
    }

    @Override // defpackage.t52
    public final hlg<mge> U() {
        hlg<mge> hlgVarU = this.a.U();
        if (hlgVarU == null) {
            return null;
        }
        boolean z = hlgVarU instanceof ee7;
        ylg ylgVar = ylg.INVARIANT;
        TypeSubstitutor typeSubstitutor = this.b;
        if (z) {
            ee7 ee7Var = (ee7) hlgVarU;
            n8a n8aVar = ee7Var.a;
            mge mgeVar = (mge) ee7Var.b;
            if (mgeVar != null && !typeSubstitutor.a.e()) {
                mgeVar = (mge) G0().j(mgeVar, ylgVar);
            }
            return new ee7(n8aVar, mgeVar);
        }
        if (!(hlgVarU instanceof j1a)) {
            l.g();
            return null;
        }
        ArrayList<Pair> arrayList = ((j1a) hlgVarU).a;
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        for (Pair pair : arrayList) {
            n8a n8aVar2 = (n8a) pair.a();
            mge mgeVar2 = (mge) ((fdd) pair.b());
            if (mgeVar2 != null && !typeSubstitutor.a.e()) {
                mgeVar2 = (mge) G0().j(mgeVar2, ylgVar);
            }
            arrayList2.add(new Pair(n8aVar2, mgeVar2));
        }
        return new j1a(arrayList2);
    }

    @Override // defpackage.t52
    public final in9 W() {
        in9 in9VarK = K(b04.h(yz3.d(this.a)));
        if (in9VarK != null) {
            return in9VarK;
        }
        D0(12);
        throw null;
    }

    @Override // defpackage.zm9
    public final boolean X() {
        return this.a.X();
    }

    @Override // defpackage.t52
    public final List<hsc> Y() {
        List<hsc> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D0(17);
        throw null;
    }

    @Override // defpackage.tx9, defpackage.t52, defpackage.aj3
    public final t52 a() {
        t52 t52VarA = this.a.a();
        if (t52VarA != null) {
            return t52VarA;
        }
        D0(21);
        throw null;
    }

    @Override // defpackage.t52
    public final boolean a0() {
        return this.a.a0();
    }

    @Override // defpackage.qxe
    public final cj3 b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.a.e() ? this : new pt8(this, TypeSubstitutor.f(typeSubstitutor.g(), G0().g()));
        }
        D0(23);
        throw null;
    }

    @Override // defpackage.aj3
    public final aj3 d() {
        aj3 aj3VarD = this.a.d();
        if (aj3VarD != null) {
            return aj3VarD;
        }
        D0(22);
        throw null;
    }

    @Override // defpackage.t52
    public final boolean e0() {
        return this.a.e0();
    }

    @Override // defpackage.t52
    public final c62 f() {
        c62 c62VarF = this.a.f();
        if (c62VarF != null) {
            return c62VarF;
        }
        D0(25);
        throw null;
    }

    @Override // defpackage.cj3
    public final qne g() {
        return qne.p;
    }

    @Override // defpackage.ie0
    public final lf0 getAnnotations() {
        lf0 annotations = this.a.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        D0(19);
        throw null;
    }

    @Override // defpackage.aj3
    public final n8a getName() {
        n8a name = this.a.getName();
        if (name != null) {
            return name;
        }
        D0(20);
        throw null;
    }

    @Override // defpackage.t52, defpackage.zm9, defpackage.fj3
    public final e04 getVisibility() {
        e04 visibility = this.a.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        D0(27);
        throw null;
    }

    @Override // defpackage.zm9
    public final boolean i0() {
        return this.a.i0();
    }

    @Override // defpackage.zm9
    public final boolean isExternal() {
        return this.a.isExternal();
    }

    @Override // defpackage.t52
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // defpackage.v62
    public final kwf j() {
        kwf kwfVarJ = this.a.j();
        if (this.b.a.e()) {
            if (kwfVarJ != null) {
                return kwfVarJ;
            }
            D0(0);
            throw null;
        }
        if (this.f == null) {
            TypeSubstitutor typeSubstitutorG0 = G0();
            Collection<ui8> collectionB = kwfVarJ.b();
            ArrayList arrayList = new ArrayList(collectionB.size());
            Iterator<ui8> it = collectionB.iterator();
            while (it.hasNext()) {
                arrayList.add(typeSubstitutorG0.j(it.next(), ylg.INVARIANT));
            }
            this.f = new k62(this, this.d, arrayList, j29.e);
        }
        k62 k62Var = this.f;
        if (k62Var != null) {
            return k62Var;
        }
        D0(1);
        throw null;
    }

    @Override // defpackage.t52
    public final Collection<m52> k() {
        Collection<m52> collectionK = this.a.k();
        ArrayList arrayList = new ArrayList(collectionK.size());
        for (m52 m52Var : collectionK) {
            arrayList.add(((m52) m52Var.F0().l(m52Var.a()).h(m52Var.r()).b(m52Var.getVisibility()).m(m52Var.f()).g().build()).b(G0()));
        }
        return arrayList;
    }

    @Override // defpackage.t52
    public final in9 l0() {
        in9 in9VarL0 = this.a.l0();
        if (in9VarL0 != null) {
            return in9VarL0;
        }
        D0(15);
        throw null;
    }

    @Override // defpackage.t52
    public final t52 m0() {
        return this.a.m0();
    }

    @Override // defpackage.t52, defpackage.v62
    public final mge o() {
        gwf gwfVarE;
        List<wxf> listD = kyf.d(j().getParameters());
        lf0 annotations = getAnnotations();
        if (annotations.isEmpty()) {
            gwf.b.getClass();
            gwfVarE = gwf.c;
        } else {
            gwf.a aVar = gwf.b;
            List listZ = u63.Z(new of0(annotations));
            aVar.getClass();
            gwfVarE = gwf.a.e(listZ);
        }
        return yi8.d(W(), gwfVarE, j(), listD, false);
    }

    @Override // defpackage.aj3
    public final <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return (R) ej3Var.h(this, d);
    }

    @Override // defpackage.t52, defpackage.w62
    public final List<rxf> p() {
        G0();
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            return arrayList;
        }
        D0(30);
        throw null;
    }

    @Override // defpackage.t52, defpackage.zm9
    public final ax9 r() {
        ax9 ax9VarR = this.a.r();
        if (ax9VarR != null) {
            return ax9VarR;
        }
        D0(26);
        throw null;
    }

    @Override // defpackage.t52
    public final boolean s() {
        return this.a.s();
    }

    @Override // defpackage.tx9
    public final in9 t(byf byfVar, bj8 bj8Var) {
        if (bj8Var == null) {
            D0(6);
            throw null;
        }
        in9 in9VarT = this.a.t(byfVar, bj8Var);
        if (!this.b.a.e()) {
            return new vxe(in9VarT, G0());
        }
        if (in9VarT != null) {
            return in9VarT;
        }
        D0(7);
        throw null;
    }

    @Override // defpackage.t52
    public final Collection<t52> x() {
        Collection<t52> collectionX = this.a.x();
        if (collectionX != null) {
            return collectionX;
        }
        D0(31);
        throw null;
    }

    @Override // defpackage.w62
    public final boolean y() {
        return this.a.y();
    }
}
