package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zl implements ga<yl> {
    public static final zl a = new zl();

    @Override // defpackage.ga
    public final yl a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, yl ylVar) {
        yl ylVar2 = ylVar;
        hc8Var.getClass();
        lb3Var.getClass();
        ylVar2.getClass();
        hc8Var.u0("resumeId");
        ha.a.b(hc8Var, lb3Var, ylVar2.a);
        hc8Var.u0("certifications");
        List<xj> list = ylVar2.b;
        list.getClass();
        hc8Var.m();
        for (Object obj : list) {
            hc8Var.j();
            yj.a.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
