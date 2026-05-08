package defpackage;

import defpackage.cqe;
import defpackage.dqe;
import defpackage.xpe;

/* JADX INFO: loaded from: classes2.dex */
public final class eqe {
    public static final boolean a;
    public static final xpe.a b;
    public static final cqe.a c;
    public static final dqe.a d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = xpe.b;
            c = cqe.b;
            d = dqe.b;
        } else {
            b = null;
            c = null;
            d = null;
        }
    }
}
