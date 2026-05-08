package defpackage;

import defpackage.s36;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z36 implements ga<s36.f> {
    public static final z36 a = new z36();
    public static final List<String> b = u63.a0("address", "address2", "admin1", "city", "country", "formattedLocation", "location", "postalCode", "state");

    @Override // defpackage.ga
    public final s36.f a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        String strA5 = null;
        String strA6 = null;
        String strA7 = null;
        String strA8 = null;
        String strA9 = null;
        while (true) {
            switch (mb8Var.D1(b)) {
                case 0:
                    strA = ha.i.a(mb8Var, lb3Var);
                    break;
                case 1:
                    strA2 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 2:
                    strA3 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 3:
                    strA4 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 4:
                    strA5 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 5:
                    strA6 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 6:
                    strA7 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 7:
                    strA8 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 8:
                    strA9 = ha.i.a(mb8Var, lb3Var);
                    break;
                default:
                    return new s36.f(strA, strA2, strA3, strA4, strA5, strA6, strA7, strA8, strA9);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s36.f fVar) {
        s36.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("address");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, fVar2.a);
        hc8Var.u0("address2");
        nmaVar.b(hc8Var, lb3Var, fVar2.b);
        hc8Var.u0("admin1");
        nmaVar.b(hc8Var, lb3Var, fVar2.c);
        hc8Var.u0("city");
        nmaVar.b(hc8Var, lb3Var, fVar2.d);
        hc8Var.u0("country");
        nmaVar.b(hc8Var, lb3Var, fVar2.e);
        hc8Var.u0("formattedLocation");
        nmaVar.b(hc8Var, lb3Var, fVar2.f);
        hc8Var.u0("location");
        nmaVar.b(hc8Var, lb3Var, fVar2.g);
        hc8Var.u0("postalCode");
        nmaVar.b(hc8Var, lb3Var, fVar2.h);
        hc8Var.u0("state");
        nmaVar.b(hc8Var, lb3Var, fVar2.i);
    }
}
