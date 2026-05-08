package defpackage;

import android.util.Log;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class c33 {
    public final /* synthetic */ g33 a;

    public c33(g33 g33Var) {
        this.a = g33Var;
    }

    public final void a(nbe nbeVar, Thread thread, Throwable th) {
        g33 g33Var = this.a;
        synchronized (g33Var) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    dkg.a(g33Var.e.b(new d33(g33Var, System.currentTimeMillis(), th, thread, nbeVar)));
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
                }
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            }
        }
    }
}
