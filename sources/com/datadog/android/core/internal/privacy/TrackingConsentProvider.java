package com.datadog.android.core.internal.privacy;

import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.privacy.TrackingConsent;
import com.datadog.android.privacy.TrackingConsentProviderCallback;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/core/internal/privacy/TrackingConsentProvider;", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "Lcom/datadog/android/privacy/TrackingConsent;", BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "<init>", "(Lcom/datadog/android/privacy/TrackingConsent;)V", "previous", "new", "Lj6g;", "notifyCallbacks", "(Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/privacy/TrackingConsent;)V", "getConsent", "()Lcom/datadog/android/privacy/TrackingConsent;", "setConsent", "Lcom/datadog/android/privacy/TrackingConsentProviderCallback;", "callback", "registerCallback", "(Lcom/datadog/android/privacy/TrackingConsentProviderCallback;)V", "unregisterCallback", "unregisterAllCallbacks", "()V", "Ljava/util/LinkedList;", "callbacks", "Ljava/util/LinkedList;", "Lcom/datadog/android/privacy/TrackingConsent;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class TrackingConsentProvider implements ConsentProvider {
    private final LinkedList<TrackingConsentProviderCallback> callbacks;
    private volatile TrackingConsent consent;

    public TrackingConsentProvider(TrackingConsent trackingConsent) {
        trackingConsent.getClass();
        this.callbacks = new LinkedList<>();
        this.consent = trackingConsent;
    }

    private final void notifyCallbacks(TrackingConsent previous, TrackingConsent trackingConsent) {
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((TrackingConsentProviderCallback) it.next()).onConsentUpdated(previous, trackingConsent);
        }
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public TrackingConsent getConsent() {
        return this.consent;
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public synchronized void registerCallback(TrackingConsentProviderCallback callback) {
        callback.getClass();
        this.callbacks.add(callback);
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public synchronized void setConsent(TrackingConsent consent) {
        consent.getClass();
        if (consent == this.consent) {
            return;
        }
        TrackingConsent trackingConsent = this.consent;
        this.consent = consent;
        notifyCallbacks(trackingConsent, consent);
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public synchronized void unregisterAllCallbacks() {
        this.callbacks.clear();
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public synchronized void unregisterCallback(TrackingConsentProviderCallback callback) {
        callback.getClass();
        this.callbacks.remove(callback);
    }
}
