package defpackage;

import defpackage.b53;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e53 implements ga<b53.b> {
    public static final e53 a = new e53();
    public static final List<String> b = u63.Z("createJobSeekerProfileRenderedResumeDownloadTempUrls");

    @Override // defpackage.ga
    public final b53.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        b53.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            d53 d53Var = d53.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(d53Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (b53.a) objA;
        }
        return new b53.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, b53.b bVar) {
        b53.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("createJobSeekerProfileRenderedResumeDownloadTempUrls");
        d53 d53Var = d53.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(d53Var, false);
        b53.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
