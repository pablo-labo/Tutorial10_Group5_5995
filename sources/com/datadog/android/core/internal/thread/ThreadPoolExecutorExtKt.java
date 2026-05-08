package com.datadog.android.core.internal.thread;

import com.datadog.android.api.InternalLogger;
import defpackage.nic;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\u001c\u0010\u0005\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"MAX_SLEEP_DURATION_IN_MS", "", "isIdle", "", "Ljava/util/concurrent/ThreadPoolExecutor;", "waitToIdle", "timeoutInMs", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "dd-sdk-android-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class ThreadPoolExecutorExtKt {
    public static final long MAX_SLEEP_DURATION_IN_MS = 10;

    public static final boolean isIdle(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.getClass();
        return threadPoolExecutor.getTaskCount() - threadPoolExecutor.getCompletedTaskCount() <= 0;
    }

    public static final boolean waitToIdle(ThreadPoolExecutor threadPoolExecutor, long j, InternalLogger internalLogger) {
        threadPoolExecutor.getClass();
        internalLogger.getClass();
        long jNanoTime = System.nanoTime();
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long jE = nic.E(j, 0L, 10L);
        while (!isIdle(threadPoolExecutor)) {
            boolean zSleepSafe = ThreadExtKt.sleepSafe(jE, internalLogger);
            if (System.nanoTime() - jNanoTime >= nanos || zSleepSafe) {
                return isIdle(threadPoolExecutor);
            }
        }
        return true;
    }
}
