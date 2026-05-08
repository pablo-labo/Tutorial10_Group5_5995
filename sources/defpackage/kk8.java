package defpackage;

import defpackage.ha;
import defpackage.jk8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kk8 implements ga<jk8.a> {
    public static final kk8 a = new kk8();
    public static final List<String> b = u63.a0("contentHash", "fileName", "fileExtension");

    @Override // defpackage.ga
    public final jk8.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                str2 = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                str3 = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "contentHash");
            throw null;
        }
        if (str2 == null) {
            mh2.q(mb8Var, "fileName");
            throw null;
        }
        if (str3 != null) {
            return new jk8.a(str, str2, str3);
        }
        mh2.q(mb8Var, "fileExtension");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jk8.a aVar) {
        jk8.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("contentHash");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, aVar2.a);
        hc8Var.u0("fileName");
        gVar.b(hc8Var, lb3Var, aVar2.b);
        hc8Var.u0("fileExtension");
        gVar.b(hc8Var, lb3Var, aVar2.c);
    }
}
