package defpackage;

import defpackage.xed;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class f82 {
    public final AtomicInteger a = new AtomicInteger(0);
    public final AtomicBoolean b = new AtomicBoolean(false);

    public f82(xed.f fVar) {
    }

    public final boolean a() {
        synchronized (this) {
            if (this.b.get()) {
                return false;
            }
            this.a.incrementAndGet();
            return true;
        }
    }

    public final void b() {
        synchronized (this) {
            this.a.decrementAndGet();
            if (this.a.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            j6g j6gVar = j6g.a;
        }
    }
}
