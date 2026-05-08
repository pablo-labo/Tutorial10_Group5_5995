package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class kx1 {
    public static final vr0<ui8> a(ui8 ui8Var) {
        bwf bwfVar;
        ui8Var.getClass();
        if (ui8Var.P0() instanceof jh5) {
            vr0<ui8> vr0VarA = a(w74.v(ui8Var));
            vr0<ui8> vr0VarA2 = a(w74.G(ui8Var));
            return new vr0<>(beb.k(yi8.a(w74.v(vr0VarA.a), w74.G(vr0VarA2.a)), ui8Var), beb.k(yi8.a(w74.v(vr0VarA.b), w74.G(vr0VarA2.b)), ui8Var));
        }
        kwf kwfVarM0 = ui8Var.M0();
        boolean z = true;
        if (ui8Var.M0() instanceof lx1) {
            kwfVarM0.getClass();
            wxf wxfVarC = ((lx1) kwfVarM0).c();
            ui8 type = wxfVarC.getType();
            type.getClass();
            ui8 ui8VarH = kyf.h(type, ui8Var.N0());
            ui8VarH.getClass();
            int iOrdinal = wxfVarC.c().ordinal();
            if (iOrdinal == 1) {
                return new vr0<>(ui8VarH, boa.t(ui8Var).p());
            }
            if (iOrdinal == 2) {
                ui8 ui8VarH2 = kyf.h(boa.t(ui8Var).o(), ui8Var.N0());
                ui8VarH2.getClass();
                return new vr0<>(ui8VarH2, ui8VarH);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + wxfVarC);
        }
        if (ui8Var.K0().isEmpty() || ui8Var.K0().size() != kwfVarM0.getParameters().size()) {
            return new vr0<>(ui8Var, ui8Var);
        }
        ArrayList<bwf> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<wxf> listK0 = ui8Var.K0();
        List<rxf> parameters = kwfVarM0.getParameters();
        parameters.getClass();
        for (Pair pair : z92.H1(listK0, parameters)) {
            wxf wxfVar = (wxf) pair.a();
            rxf rxfVar = (rxf) pair.b();
            rxfVar.getClass();
            ylg ylgVarZ = rxfVar.z();
            if (ylgVarZ == null) {
                TypeSubstitutor.a(35);
                throw null;
            }
            if (wxfVar == null) {
                TypeSubstitutor.a(36);
                throw null;
            }
            TypeSubstitutor typeSubstitutor = TypeSubstitutor.b;
            int iOrdinal2 = (wxfVar.b() ? ylg.OUT_VARIANCE : TypeSubstitutor.b(ylgVarZ, wxfVar.c())).ordinal();
            if (iOrdinal2 == 0) {
                ui8 type2 = wxfVar.getType();
                type2.getClass();
                ui8 type3 = wxfVar.getType();
                type3.getClass();
                bwfVar = new bwf(rxfVar, type2, type3);
            } else if (iOrdinal2 == 1) {
                ui8 type4 = wxfVar.getType();
                type4.getClass();
                mge mgeVarP = b04.e(rxfVar).p();
                mgeVarP.getClass();
                bwfVar = new bwf(rxfVar, type4, mgeVarP);
            } else {
                if (iOrdinal2 != 2) {
                    l.g();
                    return null;
                }
                mge mgeVarO = b04.e(rxfVar).o();
                ui8 type5 = wxfVar.getType();
                type5.getClass();
                bwfVar = new bwf(rxfVar, mgeVarO, type5);
            }
            if (wxfVar.b()) {
                arrayList.add(bwfVar);
                arrayList2.add(bwfVar);
            } else {
                vr0<ui8> vr0VarA3 = a(bwfVar.b);
                ui8 ui8Var2 = vr0VarA3.a;
                ui8 ui8Var3 = vr0VarA3.b;
                vr0<ui8> vr0VarA4 = a(bwfVar.c);
                ui8 ui8Var4 = vr0VarA4.a;
                ui8 ui8Var5 = vr0VarA4.b;
                rxf rxfVar2 = bwfVar.a;
                bwf bwfVar2 = new bwf(rxfVar2, ui8Var3, ui8Var4);
                bwf bwfVar3 = new bwf(rxfVar2, ui8Var2, ui8Var5);
                arrayList.add(bwfVar2);
                arrayList2.add(bwfVar3);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            for (bwf bwfVar4 : arrayList) {
                bwfVar4.getClass();
                if (!vi8.a.d(bwfVar4.b, bwfVar4.c)) {
                    break;
                }
            }
            z = false;
        }
        return new vr0<>(z ? boa.t(ui8Var).o() : b(ui8Var, arrayList), b(ui8Var, arrayList2));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.ui8 b(defpackage.ui8 r9, java.util.ArrayList r10) {
        /*
            java.util.List r0 = r9.K0()
            r0.size()
            r10.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.t92.r0(r10, r1)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L19:
            boolean r1 = r10.hasNext()
            r2 = 0
            if (r1 == 0) goto L97
            java.lang.Object r1 = r10.next()
            bwf r1 = (defpackage.bwf) r1
            r1.getClass()
            ui8 r3 = r1.c
            ui8 r4 = r1.b
            rxf r1 = r1.a
            qha r5 = defpackage.vi8.a
            r5.d(r4, r3)
            boolean r5 = defpackage.wl7.b(r4, r3)
            if (r5 != 0) goto L8e
            ylg r5 = r1.z()
            ylg r6 = defpackage.ylg.IN_VARIANCE
            if (r5 != r6) goto L43
            goto L8e
        L43:
            boolean r5 = defpackage.ei8.F(r4)
            ylg r7 = defpackage.ylg.OUT_VARIANCE
            ylg r8 = defpackage.ylg.INVARIANT
            if (r5 == 0) goto L60
            ylg r5 = r1.z()
            if (r5 == r6) goto L60
            yxf r2 = new yxf
            ylg r1 = r1.z()
            if (r7 != r1) goto L5c
            r7 = r8
        L5c:
            r2.<init>(r3, r7)
            goto L93
        L60:
            if (r3 == 0) goto L88
            boolean r2 = defpackage.ei8.y(r3)
            if (r2 == 0) goto L7b
            boolean r2 = r3.N0()
            if (r2 == 0) goto L7b
            yxf r2 = new yxf
            ylg r1 = r1.z()
            if (r6 != r1) goto L77
            r6 = r8
        L77:
            r2.<init>(r4, r6)
            goto L93
        L7b:
            yxf r2 = new yxf
            ylg r1 = r1.z()
            if (r7 != r1) goto L84
            r7 = r8
        L84:
            r2.<init>(r3, r7)
            goto L93
        L88:
            r9 = 140(0x8c, float:1.96E-43)
            defpackage.ei8.a(r9)
            throw r2
        L8e:
            yxf r2 = new yxf
            r2.<init>(r4)
        L93:
            r0.add(r2)
            goto L19
        L97:
            r10 = 6
            ui8 r9 = defpackage.dyf.c(r9, r0, r2, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kx1.b(ui8, java.util.ArrayList):ui8");
    }
}
