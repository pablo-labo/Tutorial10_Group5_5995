package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkmf;", "", "<init>", "()V", "okio"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public class kmf {
    public static final a d = new a();
    public boolean a;
    public long b;
    public long c;

    public static final class a extends kmf {
        @Override // defpackage.kmf
        public final kmf d(long j) {
            return this;
        }

        @Override // defpackage.kmf
        public final void f() {
        }

        @Override // defpackage.kmf
        public final kmf g(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            return this;
        }
    }

    public kmf a() {
        this.a = false;
        return this;
    }

    public kmf b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        r6.g("No deadline");
        return 0L;
    }

    public kmf d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getA() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public kmf g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        h5.k(r6.c(j, "timeout < 0: "));
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public long getC() {
        return this.c;
    }
}
