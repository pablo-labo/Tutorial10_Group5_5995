package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class fw1 implements gw1 {
    public final ScheduledFuture a;

    public fw1(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.gw1
    public final void b(Throwable th) {
        this.a.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.a + ']';
    }
}
