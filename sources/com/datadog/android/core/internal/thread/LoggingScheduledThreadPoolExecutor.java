package com.datadog.android.core.internal.thread;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.BackPressureStrategy;
import com.datadog.android.core.internal.thread.LoggingScheduledThreadPoolExecutor;
import defpackage.gu5;
import defpackage.j6;
import defpackage.u63;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/datadog/android/core/internal/thread/LoggingScheduledThreadPoolExecutor;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "", "corePoolSize", "", "executorContext", "Lcom/datadog/android/api/InternalLogger;", "logger", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "backPressureStrategy", "<init>", "(ILjava/lang/String;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/configuration/BackPressureStrategy;)V", "Ljava/lang/Runnable;", "r", "", "t", "Lj6g;", "afterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class LoggingScheduledThreadPoolExecutor extends ScheduledThreadPoolExecutor implements AutoCloseable {
    private final BackPressureStrategy backPressureStrategy;
    private final InternalLogger logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggingScheduledThreadPoolExecutor(int i, final String str, final InternalLogger internalLogger, final BackPressureStrategy backPressureStrategy) {
        super(i, new DatadogThreadFactory(str), new RejectedExecutionHandler() { // from class: k49
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                LoggingScheduledThreadPoolExecutor._init_$lambda$0(internalLogger, str, backPressureStrategy, runnable, threadPoolExecutor);
            }
        });
        str.getClass();
        internalLogger.getClass();
        backPressureStrategy.getClass();
        this.logger = internalLogger;
        this.backPressureStrategy = backPressureStrategy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(InternalLogger internalLogger, String str, BackPressureStrategy backPressureStrategy, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        internalLogger.getClass();
        str.getClass();
        backPressureStrategy.getClass();
        if (runnable != null) {
            internalLogger.log(InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5<String>) new LoggingScheduledThreadPoolExecutor$1$1(runnable), (Throwable) null, false, j6.c("executor.context", str));
            backPressureStrategy.getOnItemDropped().invoke(runnable);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);
        ThreadExtKt.loggingAfterExecute(r, t, this.logger);
    }

    @Override // java.lang.AutoCloseable
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
}
