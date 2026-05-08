package com.datadog.android.rum.internal.vitals;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/NoOpVitalMonitor;", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "<init>", "()V", "", "getLastSample", "()D", "Lcom/datadog/android/rum/internal/vitals/VitalListener;", "listener", "Lj6g;", "register", "(Lcom/datadog/android/rum/internal/vitals/VitalListener;)V", "unregister", "value", "onNewSample", "(D)V", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpVitalMonitor implements VitalMonitor {
    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public double getLastSample() {
        return 0.0d;
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalObserver
    public void onNewSample(double value) {
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public void register(VitalListener listener) {
        listener.getClass();
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public void unregister(VitalListener listener) {
        listener.getClass();
    }
}
