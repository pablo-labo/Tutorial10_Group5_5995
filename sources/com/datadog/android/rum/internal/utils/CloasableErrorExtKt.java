package com.datadog.android.rum.internal.utils;

import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.bs4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", RumFeature.EVENT_THROWABLE_PROPERTY, "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lj6g;", "handleClosableError", "(Ljava/lang/Throwable;Lcom/datadog/android/api/SdkCore;)V", "", "CLOSABLE_ERROR_MESSAGE", "Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class CloasableErrorExtKt {
    public static final String CLOSABLE_ERROR_MESSAGE = "Error while using the closeable";

    public static final void handleClosableError(Throwable th, SdkCore sdkCore) {
        th.getClass();
        sdkCore.getClass();
        GlobalRumMonitor.get(sdkCore).addError(CLOSABLE_ERROR_MESSAGE, RumErrorSource.SOURCE, th, bs4.a);
    }
}
