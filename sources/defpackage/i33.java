package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class i33 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ g33 d;

    public i33(g33 g33Var, long j, Throwable th, Thread thread) {
        this.d = g33Var;
        this.a = j;
        this.b = th;
        this.c = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g33 g33Var = this.d;
        e43 e43Var = g33Var.n;
        if (e43Var == null || !e43Var.e.get()) {
            long j = this.a / 1000;
            String strE = g33Var.e();
            if (strE == null) {
                Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                return;
            }
            w9e w9eVar = g33Var.m;
            w9eVar.getClass();
            String strConcat = "Persisting non-fatal event for session ".concat(strE);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strConcat, null);
            }
            w9eVar.e(this.b, this.c, strE, "error", j, false);
        }
    }
}
