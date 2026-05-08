package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class rf5 {
    public final q33 a;

    public rf5(q33 q33Var) {
        this.a = q33Var;
    }

    public static rf5 a() {
        rf5 rf5Var = (rf5) pf5.c().b(rf5.class);
        if (rf5Var != null) {
            return rf5Var;
        }
        ja.k("FirebaseCrashlytics component is not present.");
        return null;
    }

    public final void b(Throwable th) {
        if (th == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        g33 g33Var = this.a.g;
        Thread threadCurrentThread = Thread.currentThread();
        g33Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        a33 a33Var = g33Var.e;
        i33 i33Var = new i33(g33Var, jCurrentTimeMillis, th, threadCurrentThread);
        a33Var.getClass();
        a33Var.a(new z23(i33Var));
    }
}
