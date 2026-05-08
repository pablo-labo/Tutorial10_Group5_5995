package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g96 extends h91 {
    public final /* synthetic */ ArrayList<aj3> b;
    public final /* synthetic */ h96 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g96(ArrayList<aj3> arrayList, h96 h96Var) {
        super(8);
        this.b = arrayList;
        this.c = h96Var;
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
        throw new IllegalStateException(("Conflict in scope of " + this.c.b + ": " + hv1Var + " vs " + hv1Var2).toString());
    }
}
