package com.datadog.android.rum.internal.anr;

import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/datadog/android/rum/internal/anr/ANRException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", BatchMetricsDispatcher.THREAD_NAME, "Ljava/lang/Thread;", "(Ljava/lang/Thread;)V", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ANRException extends Exception {
    public ANRException(Thread thread) {
        thread.getClass();
        setStackTrace(thread.getStackTrace());
    }
}
