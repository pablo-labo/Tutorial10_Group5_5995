package defpackage;

import defpackage.cv8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gv8 implements ga<cv8.c> {
    public static final gv8 a = new gv8();
    public static final List<String> b = u63.Z("collectionTimestamp");

    @Override // defpackage.ga
    public final cv8.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Object objA = null;
        while (mb8Var.D1(b) == 0) {
            objA = ha.m.a(mb8Var, lb3Var);
        }
        return new cv8.c(objA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, cv8.c cVar) {
        cv8.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("collectionTimestamp");
        ha.m.b(hc8Var, lb3Var, cVar2.a);
    }
}
