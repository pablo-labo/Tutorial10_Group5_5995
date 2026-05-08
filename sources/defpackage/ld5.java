package defpackage;

import defpackage.dd5;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ld5 implements ga<dd5.g> {
    public static final ld5 a = new ld5();
    public static final List<String> b = u63.a0("url256", "url128", "url64", "url96");

    @Override // defpackage.ga
    public final dd5.g a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                str2 = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                str3 = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    break;
                }
                str4 = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "url256");
            throw null;
        }
        if (str2 == null) {
            mh2.q(mb8Var, "url128");
            throw null;
        }
        if (str3 == null) {
            mh2.q(mb8Var, "url64");
            throw null;
        }
        if (str4 != null) {
            return new dd5.g(str, str2, str3, str4);
        }
        mh2.q(mb8Var, "url96");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, dd5.g gVar) {
        dd5.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("url256");
        ha.g gVar3 = ha.a;
        gVar3.b(hc8Var, lb3Var, gVar2.a);
        hc8Var.u0("url128");
        gVar3.b(hc8Var, lb3Var, gVar2.b);
        hc8Var.u0("url64");
        gVar3.b(hc8Var, lb3Var, gVar2.c);
        hc8Var.u0("url96");
        gVar3.b(hc8Var, lb3Var, gVar2.d);
    }
}
