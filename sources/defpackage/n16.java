package defpackage;

import defpackage.ha;
import defpackage.k16;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n16 implements ga<k16.b> {
    public static final n16 a = new n16();
    public static final List<String> b = u63.a0("id", "fileName", "fileType", "uploadTimestamp", "mediaType", "fileDescription", "extension", "clientApp", "standardHashCode");

    @Override // defpackage.ga
    public final k16.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String strA = null;
        u18 u18Var = null;
        Object objA2 = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        String strA5 = null;
        String strA6 = null;
        while (true) {
            switch (mb8Var.D1(b)) {
                case 0:
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 1:
                    strA = ha.i.a(mb8Var, lb3Var);
                    break;
                case 2:
                    ha.g gVar = ha.a;
                    v18 v18Var = v18.a;
                    if (mb8Var.peek() == mb8.a.Y) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = v18Var.a(mb8Var, lb3Var);
                    }
                    u18Var = (u18) objA;
                    break;
                case 3:
                    objA2 = ha.m.a(mb8Var, lb3Var);
                    break;
                case 4:
                    strA2 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 5:
                    strA3 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 6:
                    strA4 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 7:
                    strA5 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 8:
                    strA6 = ha.i.a(mb8Var, lb3Var);
                    break;
                default:
                    if (str != null) {
                        return new k16.b(str, strA, u18Var, objA2, strA2, strA3, strA4, strA5, strA6);
                    }
                    mh2.q(mb8Var, "id");
                    throw null;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, k16.b bVar) {
        k16.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("fileName");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, bVar2.b);
        hc8Var.u0("fileType");
        v18 v18Var = v18.a;
        u18 u18Var = bVar2.c;
        if (u18Var == null) {
            hc8Var.H1();
        } else {
            v18Var.b(hc8Var, lb3Var, u18Var);
        }
        hc8Var.u0("uploadTimestamp");
        ha.m.b(hc8Var, lb3Var, bVar2.d);
        hc8Var.u0("mediaType");
        nmaVar.b(hc8Var, lb3Var, bVar2.e);
        hc8Var.u0("fileDescription");
        nmaVar.b(hc8Var, lb3Var, bVar2.f);
        hc8Var.u0("extension");
        nmaVar.b(hc8Var, lb3Var, bVar2.g);
        hc8Var.u0("clientApp");
        nmaVar.b(hc8Var, lb3Var, bVar2.h);
        hc8Var.u0("standardHashCode");
        nmaVar.b(hc8Var, lb3Var, bVar2.i);
    }
}
