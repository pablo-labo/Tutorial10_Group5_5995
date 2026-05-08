package defpackage;

import defpackage.ha;
import defpackage.i08;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l08 implements ga<i08.b> {
    public static final l08 a = new l08();
    public static final List<String> b = u63.Z("status");

    @Override // defpackage.ga
    public final i08.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        h08 h08Var = null;
        while (mb8Var.D1(b) == 0) {
            ha.g gVar = ha.a;
            o08 o08Var = o08.a;
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = o08Var.a(mb8Var, lb3Var);
            }
            h08Var = (h08) objA;
        }
        return new i08.b(h08Var);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, i08.b bVar) {
        i08.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("status");
        ha.g gVar = ha.a;
        o08 o08Var = o08.a;
        h08 h08Var = bVar2.a;
        if (h08Var == null) {
            hc8Var.H1();
        } else {
            o08Var.b(hc8Var, lb3Var, h08Var);
        }
    }
}
