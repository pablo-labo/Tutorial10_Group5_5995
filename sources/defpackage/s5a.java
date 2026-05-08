package defpackage;

import defpackage.ha;
import defpackage.p5a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s5a implements ga<p5a.b> {
    public static final s5a a = new s5a();
    public static final List<String> b = u63.a0("id", "key", "messageIdOfInvite", "message");

    @Override // defpackage.ga
    public final p5a.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        String strA = null;
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
                strA = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "id");
            throw null;
        }
        if (str2 == null) {
            mh2.q(mb8Var, "key");
            throw null;
        }
        if (str3 != null) {
            return new p5a.b(str, str2, str3, strA);
        }
        mh2.q(mb8Var, "messageIdOfInvite");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p5a.b bVar) {
        p5a.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("id");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("key");
        gVar.b(hc8Var, lb3Var, bVar2.b);
        hc8Var.u0("messageIdOfInvite");
        gVar.b(hc8Var, lb3Var, bVar2.c);
        hc8Var.u0("message");
        ha.i.b(hc8Var, lb3Var, bVar2.d);
    }
}
