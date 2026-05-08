package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.q16;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u16 implements ga<q16.c> {
    public static final u16 a = new u16();
    public static final List<String> b = u63.a0("id", "clientApp", "fileName", "fileType", "mediaType", "fileDescription", "extension", "standardHashCode", "uploadTimestamp");

    @Override // defpackage.ga
    public final q16.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String strA = null;
        String strA2 = null;
        t18 t18Var = null;
        String strA3 = null;
        String strA4 = null;
        String strA5 = null;
        String strA6 = null;
        Object objA2 = null;
        while (true) {
            switch (mb8Var.D1(b)) {
                case 0:
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 1:
                    strA = ha.i.a(mb8Var, lb3Var);
                    break;
                case 2:
                    strA2 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 3:
                    ha.g gVar = ha.a;
                    w18 w18Var = w18.a;
                    if (mb8Var.peek() == mb8.a.Y) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = w18Var.a(mb8Var, lb3Var);
                    }
                    t18Var = (t18) objA;
                    break;
                case 4:
                    strA3 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 5:
                    strA4 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 6:
                    strA5 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 7:
                    strA6 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 8:
                    objA2 = ha.m.a(mb8Var, lb3Var);
                    break;
                default:
                    if (str != null) {
                        return new q16.c(str, strA, strA2, t18Var, strA3, strA4, strA5, strA6, objA2);
                    }
                    mh2.q(mb8Var, "id");
                    throw null;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, q16.c cVar) {
        q16.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("clientApp");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, cVar2.b);
        hc8Var.u0("fileName");
        nmaVar.b(hc8Var, lb3Var, cVar2.c);
        hc8Var.u0("fileType");
        w18 w18Var = w18.a;
        t18 t18Var = cVar2.d;
        if (t18Var == null) {
            hc8Var.H1();
        } else {
            w18Var.b(hc8Var, lb3Var, t18Var);
        }
        hc8Var.u0("mediaType");
        nmaVar.b(hc8Var, lb3Var, cVar2.e);
        hc8Var.u0("fileDescription");
        nmaVar.b(hc8Var, lb3Var, cVar2.f);
        hc8Var.u0("extension");
        nmaVar.b(hc8Var, lb3Var, cVar2.g);
        hc8Var.u0("standardHashCode");
        nmaVar.b(hc8Var, lb3Var, cVar2.h);
        hc8Var.u0("uploadTimestamp");
        ha.m.b(hc8Var, lb3Var, cVar2.i);
    }
}
