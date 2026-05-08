package defpackage;

import android.database.SQLException;

/* JADX INFO: loaded from: classes.dex */
public final class rv4<T> {
    public final pv4<T> a;
    public final nv4<T> b;

    public rv4(pv4<T> pv4Var, nv4<T> nv4Var) {
        this.a = pv4Var;
        this.b = nv4Var;
    }

    public static void a(SQLException sQLException) {
        String message = sQLException.getMessage();
        if (message == null) {
            throw sQLException;
        }
        if (!zve.L(message, "unique", true) && !zve.L(message, "2067", false) && !zve.L(message, "1555", false)) {
            throw sQLException;
        }
    }
}
