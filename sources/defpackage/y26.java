package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.v26;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y26 implements ga<v26.b> {
    public static final y26 a = new y26();
    public static final List<String> b = u63.Z("jobSeekerProfileStructuredDataPreferenceAttributesByCustomClass");

    @Override // defpackage.ga
    public final v26.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        v26.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            z26 z26Var = z26.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(z26Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (v26.c) objA;
        }
        return new v26.b(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, v26.b bVar) {
        v26.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("jobSeekerProfileStructuredDataPreferenceAttributesByCustomClass");
        z26 z26Var = z26.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(z26Var, false);
        v26.c cVar = bVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
