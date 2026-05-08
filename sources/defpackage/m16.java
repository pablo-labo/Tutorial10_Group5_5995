package defpackage;

import defpackage.ha;
import defpackage.k16;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m16 implements ga<k16.a> {
    public static final m16 a = new m16();
    public static final List<String> b = u63.Z("jobSeekerProfile");

    @Override // defpackage.ga
    public final k16.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        k16.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            o16 o16Var = o16.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(o16Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (k16.c) objA;
        }
        return new k16.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, k16.a aVar) {
        k16.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("jobSeekerProfile");
        o16 o16Var = o16.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(o16Var, false);
        k16.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
