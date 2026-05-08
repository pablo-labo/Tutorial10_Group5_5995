package defpackage;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class u15 extends u71 {
    public final /* synthetic */ String a;
    public final /* synthetic */ ExecutorService b;

    public u15(String str, ExecutorService executorService) {
        this.a = str;
        this.b = executorService;
    }

    @Override // defpackage.u71
    public final void a() {
        String str = this.a;
        ExecutorService executorService = this.b;
        try {
            String strConcat = "Executing shutdown hook for ".concat(str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strConcat, null);
            }
            executorService.shutdown();
            if (executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                return;
            }
            String strConcat2 = str.concat(" did not shut down in the allocated time. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strConcat2, null);
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            String strM = l5.m("Interrupted while waiting for ", str, " to shut down. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strM, null);
            }
            executorService.shutdownNow();
        }
    }
}
