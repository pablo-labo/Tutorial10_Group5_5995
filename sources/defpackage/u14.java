package defpackage;

import defpackage.cze;
import defpackage.l5c;
import defpackage.lf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u14 extends v2 {
    public final h04 Z;
    public final l5c a0;
    public final k04 b0;

    /* JADX WARN: Illegal instructions before constructor call */
    public u14(h04 h04Var, l5c l5cVar, int i) {
        ylg ylgVar;
        j29 j29Var = h04Var.a.a;
        aj3 aj3Var = h04Var.c;
        n8a n8aVarB = q8a.b(h04Var.b, l5cVar.D());
        l5c.c cVarH = l5cVar.H();
        cVarH.getClass();
        int iOrdinal = cVarH.ordinal();
        if (iOrdinal == 0) {
            ylgVar = ylg.IN_VARIANCE;
        } else if (iOrdinal == 1) {
            ylgVar = ylg.OUT_VARIANCE;
        } else {
            if (iOrdinal != 2) {
                l.g();
                throw null;
            }
            ylgVar = ylg.INVARIANT;
        }
        ylg ylgVar2 = ylgVar;
        super(j29Var, aj3Var, lf0.a.a, n8aVarB, ylgVar2, l5cVar.E(), i, cze.a.a);
        this.Z = h04Var;
        this.a0 = l5cVar;
        this.b0 = new k04(j29Var, new t14(this, 0));
    }

    @Override // defpackage.e5
    public final void M0(ui8 ui8Var) {
        ui8Var.getClass();
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // defpackage.e5
    public final List<ui8> N0() {
        h04 h04Var = this.Z;
        hyf hyfVar = h04Var.d;
        l5c l5cVar = this.a0;
        l5cVar.getClass();
        List<j5c> listG = l5cVar.G();
        boolean zIsEmpty = listG.isEmpty();
        ?? arrayList = listG;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> listF = l5cVar.F();
            listF.getClass();
            List<Integer> list = listF;
            arrayList = new ArrayList(t92.r0(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(hyfVar.a(num.intValue()));
            }
        }
        if (arrayList.isEmpty()) {
            return u63.Z(b04.e(this).n());
        }
        Iterable iterable = (Iterable) arrayList;
        gxf gxfVar = h04Var.h;
        ArrayList arrayList2 = new ArrayList(t92.r0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(gxfVar.g((j5c) it.next()));
        }
        return arrayList2;
    }

    @Override // defpackage.ke0, defpackage.ie0
    public final lf0 getAnnotations() {
        return this.b0;
    }
}
