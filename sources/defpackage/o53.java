package defpackage;

import defpackage.ha;
import defpackage.l53;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o53 implements ga<l53.b> {
    public static final o53 a = new o53();
    public static final List<String> b = u63.Z("createJobSeekerProfileUploadResumeFileTempUrl");

    @Override // defpackage.ga
    public final l53.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        l53.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            n53 n53Var = n53.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(n53Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (l53.a) objA;
        }
        return new l53.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, l53.b bVar) {
        l53.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("createJobSeekerProfileUploadResumeFileTempUrl");
        n53 n53Var = n53.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(n53Var, false);
        l53.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
