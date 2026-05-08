package com.datadog.android.rum;

import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/datadog/android/rum/RumSessionListener;", "", "", RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, "", "isDiscarded", "Lj6g;", "onSessionStarted", "(Ljava/lang/String;Z)V", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface RumSessionListener {
    void onSessionStarted(String sessionId, boolean isDiscarded);
}
