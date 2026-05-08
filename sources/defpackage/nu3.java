package defpackage;

import defpackage.ha;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nu3 implements ga<mu3> {
    public static final nu3 a = new nu3();

    @Override // defpackage.ga
    public final mu3 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, mu3 mu3Var) {
        mu3 mu3Var2 = mu3Var;
        hc8Var.getClass();
        lb3Var.getClass();
        mu3Var2.getClass();
        hc8Var.u0("resumeId");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, mu3Var2.a);
        hc8Var.u0("awardIds");
        List<String> list = mu3Var2.b;
        list.getClass();
        hc8Var.m();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            gVar.b(hc8Var, lb3Var, it.next());
        }
        hc8Var.l();
    }
}
