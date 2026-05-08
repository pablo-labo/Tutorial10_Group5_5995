package defpackage;

import defpackage.e8g;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h8g implements ga<e8g.b> {
    public static final h8g a = new h8g();
    public static final List<String> b = u63.Z("readCursor");

    @Override // defpackage.ga
    public final e8g.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Date date = null;
        while (mb8Var.D1(b) == 0) {
            date = (Date) lb3Var.e(qg3.a).a(mb8Var, lb3Var);
        }
        if (date != null) {
            return new e8g.b(date);
        }
        mh2.q(mb8Var, "readCursor");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e8g.b bVar) {
        e8g.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("readCursor");
        lb3Var.e(qg3.a).b(hc8Var, lb3Var, bVar2.a);
    }
}
