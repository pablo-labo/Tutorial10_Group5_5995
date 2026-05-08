package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.log.LogAttributes;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class rc3 implements doe, f4a {
    public final sc3 b;
    public final long d;
    public final g39 f;
    public volatile WeakReference<rc3> g;
    public final InternalLogger h;
    public final AtomicLong e = new AtomicLong();
    public final long c = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());

    public rc3(sc3 sc3Var, g39 g39Var, InternalLogger internalLogger) {
        this.b = sc3Var;
        this.f = g39Var;
        this.h = internalLogger;
        x7b x7bVar = sc3Var.b;
        this.d = x7bVar.u();
        x7bVar.x(this);
    }

    @Override // defpackage.f4a
    public final void a() {
        this.b.b.t(this, false);
    }

    @Override // defpackage.doe
    public final void b() {
        long j = this.d;
        if (j > 0) {
            j(this.b.b.u() - j);
        } else {
            j(TimeUnit.MICROSECONDS.toNanos(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()) - this.c));
        }
    }

    @Override // defpackage.doe
    public final doe c(String str, String str2) {
        this.b.h(str2, str);
        return this;
    }

    @Override // defpackage.doe
    public final doe d() {
        this.b.h("client", "span.kind");
        return this;
    }

    @Override // defpackage.f4a
    public final rc3 e() {
        this.b.k = true;
        return this;
    }

    @Override // defpackage.doe
    public final eoe f() {
        return this.b;
    }

    @Override // defpackage.doe
    public final doe g(Integer num) {
        this.b.h(num, LogAttributes.HTTP_STATUS_CODE);
        return this;
    }

    @Override // defpackage.f4a
    public final rc3 h(String str) {
        this.b.i = str;
        return this;
    }

    @Override // defpackage.doe
    public final doe i(Map map) {
        this.f.log(map, this);
        return this;
    }

    public final void j(long j) {
        if (this.e.compareAndSet(0L, Math.max(1L, j))) {
            this.b.b.o(this);
            return;
        }
        this.h.log(InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5<String>) new nj(this, 9), (Throwable) null, false, (Map<String, ? extends Object>) new HashMap());
    }

    public final Integer k() {
        int iC = this.b.c();
        if (iC == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(iC);
    }

    public final Map<String, Object> l() {
        Map<String, Object> mapUnmodifiableMap;
        sc3 sc3Var = this.b;
        synchronized (sc3Var) {
            mapUnmodifiableMap = Collections.unmodifiableMap(sc3Var.g);
        }
        return mapUnmodifiableMap;
    }

    public final void m(String str, String str2) {
        this.b.h(str2, str);
    }

    public final String toString() {
        return this.b.toString() + ", duration_ns=" + this.e;
    }
}
