package defpackage;

import defpackage.g53;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j53 implements ga<g53.b> {
    public static final j53 a = new j53();
    public static final List<String> b = u63.Z("createJobSeekerProfileResumeFileTempUrls");

    @Override // defpackage.ga
    public final g53.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        g53.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            i53 i53Var = i53.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(i53Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (g53.a) objA;
        }
        return new g53.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, g53.b bVar) {
        g53.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("createJobSeekerProfileResumeFileTempUrls");
        i53 i53Var = i53.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(i53Var, false);
        g53.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
