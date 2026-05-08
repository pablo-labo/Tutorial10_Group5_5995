package defpackage;

import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CountDownLatch b;

    public /* synthetic */ yf3(CountDownLatch countDownLatch, int i) {
        this.a = i;
        this.b = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CountDownLatch countDownLatch = this.b;
        switch (i) {
            case 0:
                DatadogRumMonitor.waitForPendingEvents$lambda$7(countDownLatch);
                break;
            default:
                countDownLatch.countDown();
                break;
        }
    }
}
