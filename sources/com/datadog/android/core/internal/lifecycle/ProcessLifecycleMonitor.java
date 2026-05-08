package com.datadog.android.core.internal.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\nJ!\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#¨\u0006'"}, d2 = {"Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor$Callback;", "callback", "<init>", "(Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor$Callback;)V", "Landroid/app/Activity;", "activity", "Lj6g;", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStarted", "onActivityDestroyed", "Landroid/os/Bundle;", "outState", "onActivitySaveInstanceState", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStopped", "savedInstanceState", "onActivityCreated", "onActivityResumed", "Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor$Callback;", "getCallback", "()Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor$Callback;", "Ljava/util/concurrent/atomic/AtomicInteger;", "activitiesResumedCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "getActivitiesResumedCounter", "()Ljava/util/concurrent/atomic/AtomicInteger;", "activitiesStartedCounter", "getActivitiesStartedCounter", "Ljava/util/concurrent/atomic/AtomicBoolean;", "wasPaused", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getWasPaused", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "wasStopped", "getWasStopped", "Callback", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ProcessLifecycleMonitor implements Application.ActivityLifecycleCallbacks {
    private final AtomicInteger activitiesResumedCounter;
    private final AtomicInteger activitiesStartedCounter;
    private final Callback callback;
    private final AtomicBoolean wasPaused;
    private final AtomicBoolean wasStopped;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor$Callback;", "", "Lj6g;", "onStarted", "()V", "onResumed", "onStopped", "onPaused", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public interface Callback {
        void onPaused();

        void onResumed();

        void onStarted();

        void onStopped();
    }

    public ProcessLifecycleMonitor(Callback callback) {
        callback.getClass();
        this.callback = callback;
        this.activitiesResumedCounter = new AtomicInteger(0);
        this.activitiesStartedCounter = new AtomicInteger(0);
        this.wasPaused = new AtomicBoolean(true);
        this.wasStopped = new AtomicBoolean(true);
    }

    public final AtomicInteger getActivitiesResumedCounter() {
        return this.activitiesResumedCounter;
    }

    public final AtomicInteger getActivitiesStartedCounter() {
        return this.activitiesStartedCounter;
    }

    public final Callback getCallback() {
        return this.callback;
    }

    public final AtomicBoolean getWasPaused() {
        return this.wasPaused;
    }

    public final AtomicBoolean getWasStopped() {
        return this.wasStopped;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        if (this.activitiesResumedCounter.decrementAndGet() != 0 || this.wasPaused.getAndSet(true)) {
            return;
        }
        this.callback.onPaused();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
        if (this.activitiesResumedCounter.incrementAndGet() == 1 && this.wasPaused.getAndSet(false)) {
            this.callback.onResumed();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        activity.getClass();
        outState.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        activity.getClass();
        if (this.activitiesStartedCounter.incrementAndGet() == 1 && this.wasStopped.getAndSet(false)) {
            this.callback.onStarted();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        if (this.activitiesStartedCounter.decrementAndGet() == 0 && this.wasPaused.get()) {
            this.callback.onStopped();
            this.wasStopped.set(true);
        }
    }
}
