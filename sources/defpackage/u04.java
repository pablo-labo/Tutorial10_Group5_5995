package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class u04 extends h91 {
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u04(ArrayList arrayList) {
        super(8);
        this.b = arrayList;
    }

    @Override // defpackage.h91
    public final void p(hv1 hv1Var) {
        hv1Var.getClass();
        ixa.r(hv1Var, null);
        this.b.add(hv1Var);
    }

    @Override // defpackage.h91
    public final void r(hv1 hv1Var, hv1 hv1Var2) {
        hv1Var2.getClass();
        if (hv1Var2 instanceof mv5) {
            ((mv5) hv1Var2).R0(d14.a, hv1Var);
        }
    }
}
