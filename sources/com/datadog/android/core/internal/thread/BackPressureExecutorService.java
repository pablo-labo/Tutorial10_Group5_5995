package com.datadog.android.core.internal.thread;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.BackPressureStrategy;
import com.datadog.android.core.thread.FlushableExecutorService;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.u63;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\b\u0000\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/datadog/android/core/internal/thread/BackPressureExecutorService;", "Ljava/util/concurrent/ThreadPoolExecutor;", "Lcom/datadog/android/core/thread/FlushableExecutorService;", "Lcom/datadog/android/api/InternalLogger;", "logger", "", "executorContext", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "backpressureStrategy", "<init>", "(Lcom/datadog/android/api/InternalLogger;Ljava/lang/String;Lcom/datadog/android/core/configuration/BackPressureStrategy;)V", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "e", "Lj6g;", "onDrainException", "(Ljava/lang/RuntimeException;)V", "", "Ljava/lang/Runnable;", "destination", "drainTo", "(Ljava/util/Collection;)V", "r", "", "t", "afterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "Lcom/datadog/android/api/InternalLogger;", "getLogger", "()Lcom/datadog/android/api/InternalLogger;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class BackPressureExecutorService extends ThreadPoolExecutor implements FlushableExecutorService, AutoCloseable {
    private static final int CORE_POOL_SIZE = 1;
    private static final long THREAD_POOL_MAX_KEEP_ALIVE_MS = 5000;
    private final InternalLogger logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackPressureExecutorService(InternalLogger internalLogger, String str, BackPressureStrategy backPressureStrategy) {
        super(1, 1, THREAD_POOL_MAX_KEEP_ALIVE_MS, TimeUnit.MILLISECONDS, new BackPressuredBlockingQueue(internalLogger, str, backPressureStrategy), new DatadogThreadFactory(str));
        internalLogger.getClass();
        str.getClass();
        backPressureStrategy.getClass();
        this.logger = internalLogger;
    }

    private final void onDrainException(RuntimeException e) {
        InternalLogger.DefaultImpls.log$default(this.logger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) AnonymousClass1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);
        ThreadExtKt.loggingAfterExecute(r, t, this.logger);
    }

    @Override // com.datadog.android.core.thread.FlushableExecutorService, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.datadog.android.core.thread.FlushableExecutorService
    public void drainTo(Collection<Runnable> destination) {
        destination.getClass();
        try {
            getQueue().drainTo(destination);
        } catch (ClassCastException e) {
            onDrainException(e);
        } catch (IllegalArgumentException e2) {
            onDrainException(e2);
        } catch (NullPointerException e3) {
            onDrainException(e3);
        } catch (UnsupportedOperationException e4) {
            onDrainException(e4);
        }
    }

    public final InternalLogger getLogger() {
        return this.logger;
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.thread.BackPressureExecutorService$onDrainException$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Unable to drain BackPressureExecutorService queue";
        }
    }
}
