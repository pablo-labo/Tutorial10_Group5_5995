package defpackage;

import defpackage.xp5;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wp5<V> extends h91 implements Future<V> {
    public boolean cancel(boolean z) {
        return ((xp5.a) this).b.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return ((xp5.a) this).b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return ((xp5.a) this).b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return ((xp5.a) this).b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return ((xp5.a) this).b.get(j, timeUnit);
    }
}
