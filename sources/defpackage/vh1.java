package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class vh1 implements u20, t20 {
    public final b36 a;
    public final Object b = new Object();
    public CountDownLatch c;

    public vh1(b36 b36Var) {
        this.a = b36Var;
    }

    @Override // defpackage.u20
    public final void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.c;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // defpackage.t20
    public final void g(Bundle bundle) {
        synchronized (this.b) {
            try {
                cr8 cr8Var = cr8.c;
                cr8Var.J("Logging event _ae to Firebase Analytics with params " + bundle);
                this.c = new CountDownLatch(1);
                this.a.g(bundle);
                cr8Var.J("Awaiting app exception callback from Analytics...");
                try {
                    if (this.c.await(500L, TimeUnit.MILLISECONDS)) {
                        cr8Var.J("App exception callback received from Analytics listener.");
                    } else {
                        cr8Var.K(null, "Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
