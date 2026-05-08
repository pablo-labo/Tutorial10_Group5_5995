package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.wc7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gd7 implements ga<wc7.i> {
    public static final List<String> a = u63.a0("accountProfile", "id", "accountId", "emailAddress", "isConfirmed", "isSignedIn", "creationDate");

    public static wc7.i c(mb8 mb8Var, lb3 lb3Var) {
        Boolean bool;
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        Boolean bool2 = null;
        wc7.c cVar = null;
        String str = null;
        Object objA2 = null;
        String str2 = null;
        Boolean bool3 = null;
        Object objA3 = null;
        while (true) {
            switch (mb8Var.D1(a)) {
                case 0:
                    Boolean bool4 = bool2;
                    Boolean bool5 = bool3;
                    ad7 ad7Var = ad7.a;
                    ha.g gVar = ha.a;
                    ena enaVar = new ena(ad7Var, false);
                    if (mb8Var.peek() == mb8.a.Y) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar.a(mb8Var, lb3Var);
                    }
                    cVar = (wc7.c) objA;
                    bool2 = bool4;
                    bool3 = bool5;
                    continue;
                case 1:
                    bool = bool2;
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 2:
                    bool = bool2;
                    objA2 = ha.g.a(mb8Var, lb3Var);
                    break;
                case 3:
                    bool = bool2;
                    str2 = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 4:
                    bool2 = (Boolean) ha.f.a(mb8Var, lb3Var);
                    continue;
                case 5:
                    bool = bool2;
                    bool3 = (Boolean) ha.f.a(mb8Var, lb3Var);
                    break;
                case 6:
                    bool = bool2;
                    objA3 = ha.g.a(mb8Var, lb3Var);
                    break;
                default:
                    Boolean bool6 = bool2;
                    if (str == null) {
                        mh2.q(mb8Var, "id");
                        throw null;
                    }
                    if (objA2 == null) {
                        mh2.q(mb8Var, "accountId");
                        throw null;
                    }
                    if (str2 == null) {
                        mh2.q(mb8Var, "emailAddress");
                        throw null;
                    }
                    if (bool6 == null) {
                        mh2.q(mb8Var, "isConfirmed");
                        throw null;
                    }
                    Boolean bool7 = bool3;
                    boolean zBooleanValue = bool6.booleanValue();
                    if (bool7 == null) {
                        mh2.q(mb8Var, "isSignedIn");
                        throw null;
                    }
                    boolean zBooleanValue2 = bool7.booleanValue();
                    if (objA3 != null) {
                        return new wc7.i(cVar, str, objA2, str2, zBooleanValue, zBooleanValue2, objA3);
                    }
                    mh2.q(mb8Var, "creationDate");
                    throw null;
            }
            bool2 = bool;
        }
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, wc7.i iVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        iVar.getClass();
        hc8Var.u0("accountProfile");
        ad7 ad7Var = ad7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ad7Var, false);
        wc7.c cVar = iVar.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
        hc8Var.u0("id");
        ha.g gVar2 = ha.a;
        gVar2.b(hc8Var, lb3Var, iVar.b);
        hc8Var.u0("accountId");
        ha.g gVar3 = ha.a;
        f.a(hc8Var, iVar.c);
        hc8Var.u0("emailAddress");
        gVar2.b(hc8Var, lb3Var, iVar.d);
        hc8Var.u0("isConfirmed");
        ha.b bVar = ha.f;
        bVar.b(hc8Var, lb3Var, Boolean.valueOf(iVar.e));
        hc8Var.u0("isSignedIn");
        bVar.b(hc8Var, lb3Var, Boolean.valueOf(iVar.f));
        hc8Var.u0("creationDate");
        f.a(hc8Var, iVar.g);
    }
}
