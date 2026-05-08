package com.datadog.android.rum.internal;

import android.app.ApplicationExitInfo;
import com.datadog.android.api.storage.DataWriter;
import defpackage.ab8;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/LateCrashReporter;", "", "", "event", "Lcom/datadog/android/api/storage/DataWriter;", "rumWriter", "Lj6g;", "handleNdkCrashEvent", "(Ljava/util/Map;Lcom/datadog/android/api/storage/DataWriter;)V", "Landroid/app/ApplicationExitInfo;", "anrExitInfo", "Lab8;", "lastRumViewEventJson", "handleAnrCrash", "(Landroid/app/ApplicationExitInfo;Lab8;Lcom/datadog/android/api/storage/DataWriter;)V", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface LateCrashReporter {
    void handleAnrCrash(ApplicationExitInfo anrExitInfo, ab8 lastRumViewEventJson, DataWriter<Object> rumWriter);

    void handleNdkCrashEvent(Map<?, ?> event, DataWriter<Object> rumWriter);
}
