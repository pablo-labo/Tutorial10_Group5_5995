package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/react/common/futures/SimpleSettableFuture;", "T", "Ljava/util/concurrent/Future;", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SimpleSettableFuture<T> implements Future<T> {
    public final CountDownLatch a = new CountDownLatch(1);
    public T b;
    public Exception c;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        timeUnit.getClass();
        if (!this.a.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for result");
        }
        Exception exc = this.c;
        if (exc == null) {
            return this.b;
        }
        throw new ExecutionException(exc);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public final T get() throws ExecutionException, InterruptedException {
        this.a.await();
        Exception exc = this.c;
        if (exc == null) {
            return this.b;
        }
        throw new ExecutionException(exc);
    }
}
