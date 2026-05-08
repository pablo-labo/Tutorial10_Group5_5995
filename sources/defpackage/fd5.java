package defpackage;

import defpackage.dd5;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fd5 implements ga<dd5.a> {
    public static final fd5 a = new fd5();
    public static final List<String> b = u63.Z("findEmployers");

    @Override // defpackage.ga
    public final dd5.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        dd5.e eVar = null;
        while (mb8Var.D1(b) == 0) {
            jd5 jd5Var = jd5.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(jd5Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            eVar = (dd5.e) objA;
        }
        return new dd5.a(eVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, dd5.a aVar) {
        dd5.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("findEmployers");
        jd5 jd5Var = jd5.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(jd5Var, false);
        dd5.e eVar = aVar2.a;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
    }
}
