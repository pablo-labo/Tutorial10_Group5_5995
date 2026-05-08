package defpackage;

import defpackage.hv1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class kha implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ kha(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                bj8 bj8Var = (bj8) obj;
                Iterable iterable = (List) ((lha) obj2).e.getValue();
                if (iterable == null) {
                    iterable = zr4.a;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList(t92.r0(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p7g) it.next()).O0(bj8Var));
                }
                return arrayList;
            default:
                yvf yvfVar = (yvf) obj2;
                m52 m52Var = (m52) obj;
                aue aueVar = yvfVar.t0;
                zvf zvfVar = yvfVar.u0;
                lf0 annotations = m52Var.getAnnotations();
                hv1.a aVarF = m52Var.f();
                aVarF.getClass();
                zvf zvfVar2 = yvfVar.u0;
                qne qneVarG = zvfVar2.g();
                qneVarG.getClass();
                yvf yvfVar2 = new yvf(aueVar, zvfVar, m52Var, yvfVar, annotations, aVarF, qneVarG);
                yvf.w0.getClass();
                TypeSubstitutor typeSubstitutorD = zvfVar2.r0() == null ? null : TypeSubstitutor.d(zvfVar2.F());
                if (typeSubstitutorD == null) {
                    return null;
                }
                hsc hscVarL = m52Var.L();
                x3 x3VarB = hscVarL != null ? hscVarL.b(typeSubstitutorD) : null;
                List<hsc> listW0 = m52Var.w0();
                listW0.getClass();
                List<hsc> list = listW0;
                ArrayList arrayList2 = new ArrayList(t92.r0(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((hsc) it2.next()).b(typeSubstitutorD));
                }
                List<rxf> listP = zvfVar2.p();
                List<rlg> listI = yvfVar.i();
                ui8 ui8Var = yvfVar.V;
                ui8Var.getClass();
                yvfVar2.P0(null, x3VarB, arrayList2, listP, listI, ui8Var, ax9.b, zvfVar2.getVisibility());
                return yvfVar2;
        }
    }
}
