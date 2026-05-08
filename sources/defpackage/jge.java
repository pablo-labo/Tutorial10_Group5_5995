package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class jge<T> implements Future<T> {
    public final CountDownLatch a = new CountDownLatch(1);
    public Bitmap b;
    public ExecutionException c;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (!this.a.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for result");
        }
        ExecutionException executionException = this.c;
        if (executionException == null) {
            return (T) this.b;
        }
        throw new ExecutionException(executionException);
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
        ExecutionException executionException = this.c;
        if (executionException == null) {
            return (T) this.b;
        }
        throw new ExecutionException(executionException);
    }
}
