package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class n74 implements o74 {
    public final ScheduledFuture a;

    public n74(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.o74
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
