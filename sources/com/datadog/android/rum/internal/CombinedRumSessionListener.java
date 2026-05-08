package com.datadog.android.rum.internal;

import com.datadog.android.rum.RumSessionListener;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/CombinedRumSessionListener;", "Lcom/datadog/android/rum/RumSessionListener;", "", "listeners", "<init>", "([Lcom/datadog/android/rum/RumSessionListener;)V", "", RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, "", "isDiscarded", "Lj6g;", "onSessionStarted", "(Ljava/lang/String;Z)V", "[Lcom/datadog/android/rum/RumSessionListener;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class CombinedRumSessionListener implements RumSessionListener {
    private final RumSessionListener[] listeners;

    public CombinedRumSessionListener(RumSessionListener... rumSessionListenerArr) {
        rumSessionListenerArr.getClass();
        this.listeners = rumSessionListenerArr;
    }

    @Override // com.datadog.android.rum.RumSessionListener
    public void onSessionStarted(String sessionId, boolean isDiscarded) {
        sessionId.getClass();
        for (RumSessionListener rumSessionListener : this.listeners) {
            rumSessionListener.onSessionStarted(sessionId, isDiscarded);
        }
    }
}
