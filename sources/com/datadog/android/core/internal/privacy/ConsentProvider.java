package com.datadog.android.core.internal.privacy;

import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.privacy.TrackingConsent;
import com.datadog.android.privacy.TrackingConsentProviderCallback;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "", "Lcom/datadog/android/privacy/TrackingConsent;", "getConsent", "()Lcom/datadog/android/privacy/TrackingConsent;", BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "Lj6g;", "setConsent", "(Lcom/datadog/android/privacy/TrackingConsent;)V", "Lcom/datadog/android/privacy/TrackingConsentProviderCallback;", "callback", "registerCallback", "(Lcom/datadog/android/privacy/TrackingConsentProviderCallback;)V", "unregisterCallback", "unregisterAllCallbacks", "()V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface ConsentProvider {
    TrackingConsent getConsent();

    void registerCallback(TrackingConsentProviderCallback callback);

    void setConsent(TrackingConsent consent);

    void unregisterAllCallbacks();

    void unregisterCallback(TrackingConsentProviderCallback callback);
}
