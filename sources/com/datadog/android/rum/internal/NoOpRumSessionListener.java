package com.datadog.android.rum.internal;

import com.datadog.android.rum.RumSessionListener;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/internal/NoOpRumSessionListener;", "Lcom/datadog/android/rum/RumSessionListener;", "<init>", "()V", "", RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, "", "isDiscarded", "Lj6g;", "onSessionStarted", "(Ljava/lang/String;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpRumSessionListener implements RumSessionListener {
    public boolean equals(Object other) {
        return other != null && (other instanceof NoOpRumSessionListener);
    }

    public int hashCode() {
        return 0;
    }

    @Override // com.datadog.android.rum.RumSessionListener
    public void onSessionStarted(String sessionId, boolean isDiscarded) {
        sessionId.getClass();
    }
}
