package defpackage;

import defpackage.d04;
import defpackage.efe;
import defpackage.ere;
import defpackage.fv7;
import defpackage.ixa;
import defpackage.lf0;
import defpackage.mke;
import defpackage.qp8;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class gp8 extends qp8 {
    public static final /* synthetic */ int v = 0;
    public final t52 n;
    public final hvc o;
    public final boolean p;
    public final fla<List<m52>> q;
    public final fla<Set<n8a>> r;
    public final fla<Set<n8a>> s;
    public final fla<Map<n8a, bv7>> t;
    public final on9<n8a, t52> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp8(mp8 mp8Var, t52 t52Var, hvc hvcVar, boolean z, gp8 gp8Var) {
        super(gp8Var, mp8Var);
        mp8Var.getClass();
        hvcVar.getClass();
        this.n = t52Var;
        this.o = hvcVar;
        this.p = z;
        aue aueVar = mp8Var.a.a;
        this.q = aueVar.f(new bp8(this, mp8Var));
        int i = 3;
        this.r = aueVar.f(new kd8(this, i));
        this.s = aueVar.f(new cp8(this, mp8Var));
        this.t = aueVar.f(new o04(this, i));
        this.u = aueVar.d(new dp8(0, this, mp8Var));
    }

    public static sfe A(sfe sfeVar, kv5 kv5Var, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return sfeVar;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            sfe sfeVar2 = (sfe) it.next();
            if (!sfeVar.equals(sfeVar2) && sfeVar2.s0() == null && D(sfeVar2, kv5Var)) {
                kv5 kv5VarBuild = sfeVar.F0().j().build();
                kv5VarBuild.getClass();
                return (sfe) kv5VarBuild;
            }
        }
        return sfeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.sfe B(defpackage.sfe r4) {
        /*
            java.util.List r0 = r4.i()
            r0.getClass()
            java.lang.Object r0 = defpackage.z92.Z0(r0)
            rlg r0 = (defpackage.rlg) r0
            r1 = 0
            if (r0 == 0) goto L7d
            ui8 r2 = r0.getType()
            kwf r2 = r2.M0()
            v62 r2 = r2.d()
            if (r2 == 0) goto L36
            int r3 = defpackage.b04.a
            nq5 r2 = defpackage.yz3.g(r2)
            r2.getClass()
            boolean r3 = r2.d()
            if (r3 == 0) goto L2e
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 == 0) goto L36
            mq5 r2 = r2.g()
            goto L37
        L36:
            r2 = r1
        L37:
            mq5 r3 = defpackage.ere.g
            boolean r2 = defpackage.wl7.b(r2, r3)
            if (r2 == 0) goto L40
            goto L41
        L40:
            r0 = r1
        L41:
            if (r0 != 0) goto L44
            goto L7d
        L44:
            kv5$a r1 = r4.F0()
            java.util.List r4 = r4.i()
            r4.getClass()
            r2 = 1
            java.util.List r4 = defpackage.z92.K0(r2, r4)
            kv5$a r4 = r1.a(r4)
            ui8 r0 = r0.getType()
            java.util.List r0 = r0.K0()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            wxf r0 = (defpackage.wxf) r0
            ui8 r0 = r0.getType()
            kv5$a r4 = r4.p(r0)
            kv5 r4 = r4.build()
            sfe r4 = (defpackage.sfe) r4
            r0 = r4
            tfe r0 = (defpackage.tfe) r0
            if (r0 == 0) goto L7c
            r0.k0 = r2
        L7c:
            return r4
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp8.B(sfe):sfe");
    }

    public static boolean D(kv5 kv5Var, kv5 kv5Var2) {
        return ixa.e.n(kv5Var2, kv5Var, true).a == ixa.b.a.a && !fv7.a.a(kv5Var2, kv5Var);
    }

    public static boolean E(sfe sfeVar, sfe sfeVar2) {
        int i = mp1.l;
        sfeVar.getClass();
        sfe sfeVarA = sfeVar2;
        if (wl7.b(sfeVar.getName().c(), "removeAt")) {
            sfeVarA = sfeVar2;
            if (wl7.b(vs9.b(sfeVar), qoe.g.e)) {
                sfeVarA = sfeVar2.a();
            }
        }
        sfeVarA.getClass();
        return D(sfeVarA, sfeVar);
    }

    public static sfe F(d4c d4cVar, String str, Function1 function1) {
        sfe sfeVar;
        Iterator it = ((Iterable) function1.invoke(n8a.h(str))).iterator();
        do {
            sfeVar = null;
            if (!it.hasNext()) {
                break;
            }
            sfe sfeVar2 = (sfe) it.next();
            if (sfeVar2.i().size() == 0) {
                qha qhaVar = vi8.a;
                ui8 returnType = sfeVar2.getReturnType();
                if (returnType == null ? false : qhaVar.d(returnType, d4cVar.getType())) {
                    sfeVar = sfeVar2;
                }
            }
        } while (sfeVar == null);
        return sfeVar;
    }

    public static sfe H(d4c d4cVar, Function1 function1) {
        sfe sfeVar;
        ui8 returnType;
        String strC = d4cVar.getName().c();
        strC.getClass();
        Iterator it = ((Iterable) function1.invoke(n8a.h("set".concat(jc8.b(strC) ? strC.substring(2) : ie7.h(strC))))).iterator();
        do {
            sfeVar = null;
            if (!it.hasNext()) {
                break;
            }
            sfe sfeVar2 = (sfe) it.next();
            if (sfeVar2.i().size() == 1 && (returnType = sfeVar2.getReturnType()) != null) {
                n8a n8aVar = ei8.e;
                if (ei8.E(returnType, ere.a.d)) {
                    qha qhaVar = vi8.a;
                    List<rlg> listI = sfeVar2.i();
                    listI.getClass();
                    if (qhaVar.b(((rlg) z92.k1(listI)).getType(), d4cVar.getType())) {
                        sfeVar = sfeVar2;
                    }
                }
            }
        } while (sfeVar == null);
        return sfeVar;
    }

    public static boolean K(sfe sfeVar, kv5 kv5Var) {
        String strA = vs9.a(sfeVar, 2);
        kv5 kv5VarA = kv5Var.a();
        kv5VarA.getClass();
        return strA.equals(vs9.a(kv5VarA, 2)) && !D(sfeVar, kv5Var);
    }

    public final boolean C(d4c d4cVar, Function1<? super n8a, ? extends Collection<? extends sfe>> function1) {
        if (c0h.A(d4cVar)) {
            return false;
        }
        sfe sfeVarG = G(d4cVar, function1);
        sfe sfeVarH = H(d4cVar, function1);
        if (sfeVarG == null) {
            return false;
        }
        if (d4cVar.N()) {
            return sfeVarH != null && sfeVarH.r() == sfeVarG.r();
        }
        return true;
    }

    public final sfe G(d4c d4cVar, Function1<? super n8a, ? extends Collection<? extends sfe>> function1) {
        n8a n8aVar;
        g4c g4cVarC = d4cVar.c();
        String strC = null;
        f4c f4cVar = g4cVarC != null ? (f4c) ooe.b(g4cVarC) : null;
        if (f4cVar != null) {
            ei8.A(f4cVar);
            hv1 hv1VarB = b04.b(b04.i(f4cVar), y32.c);
            if (hv1VarB != null && (n8aVar = rp1.a.get(b04.g(hv1VarB))) != null) {
                strC = n8aVar.c();
            }
        }
        if (strC != null && !ooe.d(this.n, f4cVar)) {
            return F(d4cVar, strC, function1);
        }
        String strC2 = d4cVar.getName().c();
        strC2.getClass();
        return F(d4cVar, jc8.a(strC2), function1);
    }

    public final LinkedHashSet I(n8a n8aVar) {
        Collection<ui8> collectionZ = z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionZ.iterator();
        while (it.hasNext()) {
            w92.w0(linkedHashSet, ((ui8) it.next()).n().e(n8aVar, dia.e));
        }
        return linkedHashSet;
    }

    public final Set<d4c> J(n8a n8aVar) {
        Collection<ui8> collectionZ = z();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionZ.iterator();
        while (it.hasNext()) {
            Collection collectionB = ((ui8) it.next()).n().b(n8aVar, dia.e);
            ArrayList arrayList2 = new ArrayList(t92.r0(collectionB, 10));
            Iterator it2 = collectionB.iterator();
            while (it2.hasNext()) {
                arrayList2.add((d4c) it2.next());
            }
            w92.w0(arrayList, arrayList2);
        }
        return z92.E1(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean L(defpackage.sfe r9) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp8.L(sfe):boolean");
    }

    public final void M(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        this.b.a.n.getClass();
        this.n.getClass();
    }

    public final ArrayList N(n8a n8aVar) {
        Collection<hv7> collectionF = this.e.invoke().f(n8aVar);
        ArrayList arrayList = new ArrayList(t92.r0(collectionF, 10));
        Iterator<T> it = collectionF.iterator();
        while (it.hasNext()) {
            arrayList.add(t((hv7) it.next()));
        }
        return arrayList;
    }

    public final ArrayList O(n8a n8aVar) {
        LinkedHashSet linkedHashSetI = I(n8aVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetI) {
            sfe sfeVar = (sfe) obj;
            sfeVar.getClass();
            if (ooe.b(sfeVar) == null && pp1.a(sfeVar) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.qp8, defpackage.jn9, defpackage.in9
    public final Collection b(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        M(n8aVar, diaVar);
        return super.b(n8aVar, diaVar);
    }

    @Override // defpackage.jn9, defpackage.z4d
    public final v62 d(n8a n8aVar, dia diaVar) {
        on9<n8a, t52> on9Var;
        t52 t52VarInvoke;
        n8aVar.getClass();
        diaVar.getClass();
        M(n8aVar, diaVar);
        gp8 gp8Var = (gp8) this.c;
        return (gp8Var == null || (on9Var = gp8Var.u) == null || (t52VarInvoke = on9Var.invoke(n8aVar)) == null) ? this.u.invoke(n8aVar) : t52VarInvoke;
    }

    @Override // defpackage.qp8, defpackage.jn9, defpackage.in9
    public final Collection<sfe> e(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        M(n8aVar, diaVar);
        return super.e(n8aVar, diaVar);
    }

    @Override // defpackage.qp8
    public final Set<n8a> h(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
        lz3Var.getClass();
        return bbe.o(this.r.invoke(), this.t.invoke().keySet());
    }

    @Override // defpackage.qp8
    public final Set i(lz3 lz3Var, zz3 zz3Var) {
        lz3Var.getClass();
        t52 t52Var = this.n;
        Collection<ui8> collectionB = t52Var.j().b();
        collectionB.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionB.iterator();
        while (it.hasNext()) {
            w92.w0(linkedHashSet, ((ui8) it.next()).n().a());
        }
        fla<gj3> flaVar = this.e;
        linkedHashSet.addAll(flaVar.invoke().a());
        linkedHashSet.addAll(flaVar.invoke().c());
        linkedHashSet.addAll(h(lz3Var, zz3Var));
        mp8 mp8Var = this.b;
        linkedHashSet.addAll(mp8Var.a.x.b(t52Var, mp8Var));
        return linkedHashSet;
    }

    @Override // defpackage.qp8
    public final void j(n8a n8aVar, ArrayList arrayList) throws IllegalAccessException, InvocationTargetException {
        n8aVar.getClass();
        boolean z = this.o.z();
        t52 t52Var = this.n;
        mp8 mp8Var = this.b;
        if (z) {
            fla<gj3> flaVar = this.e;
            if (flaVar.invoke().e(n8aVar) != null) {
                if (arrayList.isEmpty()) {
                    qv7 qv7VarE = flaVar.invoke().e(n8aVar);
                    qv7VarE.getClass();
                    zo8 zo8VarV = ee3.v(mp8Var, qv7VarE);
                    sv7 sv7Var = mp8Var.a;
                    iv7 iv7VarA1 = iv7.a1(t52Var, zo8VarV, qv7VarE.getName(), sv7Var.j.a(qv7VarE), true);
                    ui8 ui8VarD = mp8Var.d.d(qv7VarE.getType(), wab.A(jyf.b, false, null, 6));
                    hsc hscVarP = p();
                    ax9.a.getClass();
                    d04.h hVar = d04.e;
                    zr4 zr4Var = zr4.a;
                    iv7VarA1.Z0(null, hscVarP, zr4Var, zr4Var, zr4Var, ui8VarD, ax9.d, hVar, null);
                    iv7VarA1.b1(false, false);
                    sv7Var.g.getClass();
                    arrayList.add(iv7VarA1);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((sfe) it.next()).i().isEmpty()) {
                            break;
                        }
                    }
                    qv7 qv7VarE2 = flaVar.invoke().e(n8aVar);
                    qv7VarE2.getClass();
                    zo8 zo8VarV2 = ee3.v(mp8Var, qv7VarE2);
                    sv7 sv7Var2 = mp8Var.a;
                    iv7 iv7VarA12 = iv7.a1(t52Var, zo8VarV2, qv7VarE2.getName(), sv7Var2.j.a(qv7VarE2), true);
                    ui8 ui8VarD2 = mp8Var.d.d(qv7VarE2.getType(), wab.A(jyf.b, false, null, 6));
                    hsc hscVarP2 = p();
                    ax9.a.getClass();
                    d04.h hVar2 = d04.e;
                    zr4 zr4Var2 = zr4.a;
                    iv7VarA12.Z0(null, hscVarP2, zr4Var2, zr4Var2, zr4Var2, ui8VarD2, ax9.d, hVar2, null);
                    iv7VarA12.b1(false, false);
                    sv7Var2.g.getClass();
                    arrayList.add(iv7VarA12);
                }
            }
        }
        mp8Var.a.x.f(t52Var, n8aVar, arrayList, mp8Var);
    }

    @Override // defpackage.qp8
    public final gj3 k() {
        return new r52(this.o, z32.c);
    }

    @Override // defpackage.qp8
    public final void m(LinkedHashSet linkedHashSet, n8a n8aVar) {
        n8aVar.getClass();
        LinkedHashSet linkedHashSetI = I(n8aVar);
        ArrayList arrayList = qoe.a;
        if (!qoe.j.contains(n8aVar)) {
            int i = pp1.l;
            if (!qoe.e.contains(n8aVar)) {
                if (!linkedHashSetI.isEmpty()) {
                    Iterator it = linkedHashSetI.iterator();
                    while (it.hasNext()) {
                        if (((kv5) it.next()).isSuspend()) {
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSetI) {
                    if (L((sfe) obj)) {
                        arrayList2.add(obj);
                    }
                }
                w(linkedHashSet, n8aVar, arrayList2, false);
                return;
            }
        }
        int i2 = mke.c;
        mke mkeVarA = mke.b.a();
        LinkedHashSet linkedHashSetW = ygg.w(n8aVar, linkedHashSetI, zr4.a, this.n, sw4.l, this.b.a.u.a());
        x(n8aVar, linkedHashSet, linkedHashSetW, linkedHashSet, new ep8(1, this, gp8.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 0));
        x(n8aVar, linkedHashSet, linkedHashSetW, mkeVarA, new fp8(1, this, gp8.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 0));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetI) {
            if (L((sfe) obj2)) {
                arrayList3.add(obj2);
            }
        }
        w(linkedHashSet, n8aVar, z92.h1(arrayList3, mkeVarA), true);
    }

    @Override // defpackage.qp8
    public final void n(n8a n8aVar, ArrayList arrayList) {
        n8a n8aVar2;
        n8aVar.getClass();
        boolean zW = this.o.w();
        mp8 mp8Var = this.b;
        if (zW) {
            n8aVar2 = n8aVar;
            hv7 hv7Var = (hv7) z92.l1(this.e.invoke().f(n8aVar2));
            if (hv7Var != null) {
                ov7 ov7VarS0 = ov7.S0(this.n, ee3.v(mp8Var, hv7Var), skg.a(hv7Var.getVisibility()), false, hv7Var.getName(), mp8Var.a.j.a(hv7Var), false);
                g4c g4cVarC = jz3.c(ov7VarS0, lf0.a.a);
                ov7VarS0.P0(g4cVarC, null, null, null);
                mp8Var.getClass();
                ui8 ui8VarL = qp8.l(hv7Var, new mp8(mp8Var.a, new gqf(mp8Var, ov7VarS0, hv7Var, 0), mp8Var.c));
                hsc hscVarP = p();
                zr4 zr4Var = zr4.a;
                ov7VarS0.R0(ui8VarL, zr4Var, hscVarP, null, zr4Var);
                g4cVarC.b0 = ui8VarL;
                arrayList.add(ov7VarS0);
            }
        } else {
            n8aVar2 = n8aVar;
        }
        Set<d4c> setJ = J(n8aVar);
        if (setJ.isEmpty()) {
            return;
        }
        int i = mke.c;
        mke mkeVarA = mke.b.a();
        mke mkeVarA2 = mke.b.a();
        int i2 = 2;
        y(setJ, arrayList, mkeVarA, new l4(this, i2));
        y(bbe.n(setJ, mkeVarA), mkeVarA2, null, new b00(this, i2));
        LinkedHashSet linkedHashSetO = bbe.o(setJ, mkeVarA2);
        sv7 sv7Var = mp8Var.a;
        n8a n8aVar3 = n8aVar2;
        arrayList.addAll(ygg.w(n8aVar3, linkedHashSetO, arrayList, this.n, sv7Var.f, sv7Var.u.a()));
    }

    @Override // defpackage.qp8
    public final Set o(lz3 lz3Var) {
        lz3Var.getClass();
        if (this.o.w()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.e.invoke().d());
        Collection<ui8> collectionB = this.n.j().b();
        collectionB.getClass();
        Iterator<T> it = collectionB.iterator();
        while (it.hasNext()) {
            w92.w0(linkedHashSet, ((ui8) it.next()).n().c());
        }
        return linkedHashSet;
    }

    @Override // defpackage.qp8
    public final hsc p() {
        t52 t52Var = this.n;
        if (t52Var != null) {
            int i = yz3.a;
            return t52Var.J0();
        }
        yz3.a(0);
        throw null;
    }

    @Override // defpackage.qp8
    public final aj3 q() {
        return this.n;
    }

    @Override // defpackage.qp8
    public final boolean r(iv7 iv7Var) {
        if (this.o.w()) {
            return false;
        }
        return L(iv7Var);
    }

    @Override // defpackage.qp8
    public final qp8.a s(hv7 hv7Var, ArrayList arrayList, ui8 ui8Var, List list) {
        hv7Var.getClass();
        ((efe.a) this.b.a.e).getClass();
        if (this.n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new qp8.a(ui8Var, list, arrayList, list2);
            }
            t40.q("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"});
            return null;
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.qp8
    public final String toString() {
        return "Lazy Java member scope for " + this.o.h();
    }

    public final void v(ArrayList arrayList, nu7 nu7Var, int i, hv7 hv7Var, ui8 ui8Var, ui8 ui8Var2) {
        n8a name = hv7Var.getName();
        if (ui8Var == null) {
            kyf.a(2);
            throw null;
        }
        p7g p7gVarG = kyf.g(ui8Var, false);
        boolean zR = hv7Var.r();
        p7g p7gVarG2 = ui8Var2 != null ? kyf.g(ui8Var2, false) : null;
        arrayList.add(new slg(nu7Var, null, i, lf0.a.a, name, p7gVarG, zR, false, false, p7gVarG2, this.b.a.j.a(hv7Var)));
    }

    public final void w(LinkedHashSet linkedHashSet, n8a n8aVar, ArrayList arrayList, boolean z) {
        sv7 sv7Var = this.b.a;
        LinkedHashSet<sfe> linkedHashSetW = ygg.w(n8aVar, arrayList, linkedHashSet, this.n, sv7Var.f, sv7Var.u.a());
        if (!z) {
            linkedHashSet.addAll(linkedHashSetW);
            return;
        }
        ArrayList arrayListH1 = z92.h1(linkedHashSet, linkedHashSetW);
        ArrayList arrayList2 = new ArrayList(t92.r0(linkedHashSetW, 10));
        for (sfe sfeVarA : linkedHashSetW) {
            sfe sfeVar = (sfe) ooe.c(sfeVarA);
            if (sfeVar != null) {
                sfeVarA = A(sfeVarA, sfeVar, arrayListH1);
            }
            arrayList2.add(sfeVarA);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(defpackage.n8a r9, java.util.LinkedHashSet r10, java.util.LinkedHashSet r11, java.util.AbstractSet r12, kotlin.jvm.functions.Function1 r13) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp8.x(n8a, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.AbstractSet, kotlin.jvm.functions.Function1):void");
    }

    public final void y(Set set, AbstractCollection abstractCollection, mke mkeVar, Function1 function1) {
        sfe sfeVarH;
        q4c q4cVarJ;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d4c d4cVar = (d4c) it.next();
            ev7 ev7Var = null;
            if (C(d4cVar, function1)) {
                sfe sfeVarG = G(d4cVar, function1);
                sfeVarG.getClass();
                if (d4cVar.N()) {
                    sfeVarH = H(d4cVar, function1);
                    sfeVarH.getClass();
                } else {
                    sfeVarH = null;
                }
                if (sfeVarH != null) {
                    sfeVarH.r();
                    sfeVarG.r();
                }
                ev7 ev7Var2 = new ev7(this.n, sfeVarG, sfeVarH, d4cVar);
                ui8 returnType = sfeVarG.getReturnType();
                returnType.getClass();
                hsc hscVarP = p();
                zr4 zr4Var = zr4.a;
                ev7Var2.R0(returnType, zr4Var, hscVarP, null, zr4Var);
                g4c g4cVarI = jz3.i(ev7Var2, sfeVarG.getAnnotations(), false, sfeVarG.g());
                g4cVarI.a0 = sfeVarG;
                g4cVarI.O0(ev7Var2.getType());
                if (sfeVarH != null) {
                    List<rlg> listI = sfeVarH.i();
                    listI.getClass();
                    rlg rlgVar = (rlg) z92.Q0(listI);
                    if (rlgVar == null) {
                        throw new AssertionError("No parameter found for " + sfeVarH);
                    }
                    q4cVarJ = jz3.j(ev7Var2, sfeVarH.getAnnotations(), rlgVar.getAnnotations(), false, sfeVarH.getVisibility(), sfeVarH.g());
                    q4cVarJ.a0 = sfeVarH;
                } else {
                    q4cVarJ = null;
                }
                ev7Var2.P0(g4cVarI, q4cVarJ, null, null);
                ev7Var = ev7Var2;
            }
            if (ev7Var != null) {
                abstractCollection.add(ev7Var);
                if (mkeVar != null) {
                    mkeVar.add(d4cVar);
                    return;
                }
                return;
            }
        }
    }

    public final Collection<ui8> z() {
        boolean z = this.p;
        t52 t52Var = this.n;
        if (!z) {
            return this.b.a.u.c().z0(t52Var);
        }
        Collection<ui8> collectionB = t52Var.j().b();
        collectionB.getClass();
        return collectionB;
    }
}
