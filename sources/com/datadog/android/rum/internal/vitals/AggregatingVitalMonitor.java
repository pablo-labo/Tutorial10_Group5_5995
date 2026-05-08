package com.datadog.android.rum.internal.vitals;

import defpackage.j6g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/AggregatingVitalMonitor;", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "<init>", "()V", "", "value", "Lj6g;", "notifyListeners", "(D)V", "Lcom/datadog/android/rum/internal/vitals/VitalListener;", "listener", "notifyListener", "(Lcom/datadog/android/rum/internal/vitals/VitalListener;D)V", "onNewSample", "getLastSample", "()D", "register", "(Lcom/datadog/android/rum/internal/vitals/VitalListener;)V", "unregister", "lastKnownSample", "D", "", "Lcom/datadog/android/rum/internal/vitals/VitalInfo;", "listeners", "Ljava/util/Map;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class AggregatingVitalMonitor implements VitalMonitor {
    private double lastKnownSample = Double.NaN;
    private final Map<VitalListener, VitalInfo> listeners = new LinkedHashMap();

    private final void notifyListener(VitalListener listener, double value) {
        VitalInfo empty = this.listeners.get(listener);
        if (empty == null) {
            empty = VitalInfo.INSTANCE.getEMPTY();
        }
        int sampleCount = empty.getSampleCount() + 1;
        VitalInfo vitalInfo = new VitalInfo(sampleCount, Math.min(value, empty.getMinValue()), Math.max(value, empty.getMaxValue()), ((empty.getMeanValue() * ((double) empty.getSampleCount())) + value) / ((double) sampleCount));
        listener.onVitalUpdate(vitalInfo);
        synchronized (this.listeners) {
            this.listeners.put(listener, vitalInfo);
            j6g j6gVar = j6g.a;
        }
    }

    private final void notifyListeners(double value) {
        synchronized (this.listeners) {
            try {
                Iterator<VitalListener> it = this.listeners.keySet().iterator();
                while (it.hasNext()) {
                    notifyListener(it.next(), value);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    /* JADX INFO: renamed from: getLastSample, reason: from getter */
    public double getLastKnownSample() {
        return this.lastKnownSample;
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalObserver
    public void onNewSample(double value) {
        this.lastKnownSample = value;
        notifyListeners(value);
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public void register(VitalListener listener) {
        listener.getClass();
        double d = this.lastKnownSample;
        synchronized (this.listeners) {
            this.listeners.put(listener, VitalInfo.INSTANCE.getEMPTY());
            j6g j6gVar = j6g.a;
        }
        if (Double.isNaN(d)) {
            return;
        }
        notifyListener(listener, d);
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public void unregister(VitalListener listener) {
        listener.getClass();
        synchronized (this.listeners) {
            this.listeners.remove(listener);
        }
    }
}
