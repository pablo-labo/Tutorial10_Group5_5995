package com.datadog.android.rum.internal.vitals;

import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/internal/vitals/VitalReaderRunnable;", "Ljava/lang/Runnable;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/vitals/VitalReader;", "reader", "Lcom/datadog/android/rum/internal/vitals/VitalObserver;", "observer", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "", "periodMs", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/rum/internal/vitals/VitalReader;Lcom/datadog/android/rum/internal/vitals/VitalObserver;Ljava/util/concurrent/ScheduledExecutorService;J)V", "Lj6g;", "run", "()V", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getSdkCore", "()Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/rum/internal/vitals/VitalReader;", "getReader", "()Lcom/datadog/android/rum/internal/vitals/VitalReader;", "Lcom/datadog/android/rum/internal/vitals/VitalObserver;", "getObserver", "()Lcom/datadog/android/rum/internal/vitals/VitalObserver;", "Ljava/util/concurrent/ScheduledExecutorService;", "getExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "J", "getPeriodMs", "()J", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class VitalReaderRunnable implements Runnable {
    private final ScheduledExecutorService executor;
    private final VitalObserver observer;
    private final long periodMs;
    private final VitalReader reader;
    private final FeatureSdkCore sdkCore;

    public VitalReaderRunnable(FeatureSdkCore featureSdkCore, VitalReader vitalReader, VitalObserver vitalObserver, ScheduledExecutorService scheduledExecutorService, long j) {
        featureSdkCore.getClass();
        vitalReader.getClass();
        vitalObserver.getClass();
        scheduledExecutorService.getClass();
        this.sdkCore = featureSdkCore;
        this.reader = vitalReader;
        this.observer = vitalObserver;
        this.executor = scheduledExecutorService;
        this.periodMs = j;
    }

    public final ScheduledExecutorService getExecutor() {
        return this.executor;
    }

    public final VitalObserver getObserver() {
        return this.observer;
    }

    public final long getPeriodMs() {
        return this.periodMs;
    }

    public final VitalReader getReader() {
        return this.reader;
    }

    public final FeatureSdkCore getSdkCore() {
        return this.sdkCore;
    }

    @Override // java.lang.Runnable
    public void run() {
        Double vitalData;
        if (RumContext.INSTANCE.fromFeatureContext(this.sdkCore.getFeatureContext("rum")).getViewType() == RumViewScope.RumViewType.FOREGROUND && (vitalData = this.reader.readVitalData()) != null) {
            this.observer.onNewSample(vitalData.doubleValue());
        }
        ConcurrencyExtKt.scheduleSafe(this.executor, "Vitals monitoring", this.periodMs, TimeUnit.MILLISECONDS, this.sdkCore.getInternalLogger(), this);
    }
}
