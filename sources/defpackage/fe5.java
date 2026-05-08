package defpackage;

import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fe5 implements ga<sd5.l> {
    public static final List<String> a = u63.Z("reason");

    public static sd5.l c(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(a) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str != null) {
            return new sd5.l(str);
        }
        mh2.q(mb8Var, "reason");
        throw null;
    }
}
