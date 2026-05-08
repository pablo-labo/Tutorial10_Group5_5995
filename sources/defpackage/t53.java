package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.q53;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t53 implements ga<q53.b> {
    public static final t53 a = new t53();
    public static final List<String> b = u63.Z("createOffsiteCtkDeviceIdMap");

    @Override // defpackage.ga
    public final q53.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        q53.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            s53 s53Var = s53.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(s53Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (q53.a) objA;
        }
        return new q53.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, q53.b bVar) {
        q53.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("createOffsiteCtkDeviceIdMap");
        s53 s53Var = s53.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(s53Var, false);
        q53.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
