package defpackage;

import defpackage.ha;
import defpackage.l53;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n53 implements ga<l53.a> {
    public static final n53 a = new n53();
    public static final List<String> b = u63.a0("uploadURL", "fileId");

    @Override // defpackage.ga
    public final l53.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Object objA = null;
        String str = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                objA = ha.g.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (objA == null) {
            mh2.q(mb8Var, "uploadURL");
            throw null;
        }
        if (str != null) {
            return new l53.a(objA, str);
        }
        mh2.q(mb8Var, "fileId");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, l53.a aVar) {
        l53.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("uploadURL");
        ha.g gVar = ha.a;
        f.a(hc8Var, aVar2.a);
        hc8Var.u0("fileId");
        ha.a.b(hc8Var, lb3Var, aVar2.b);
    }
}
