package com.datadog.android.rum.internal.debug;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/datadog/android/rum/internal/debug/RumDebugListener;", "", "", "", "viewNames", "Lj6g;", "onReceiveRumActiveViews", "(Ljava/util/List;)V", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface RumDebugListener {
    void onReceiveRumActiveViews(List<String> viewNames);
}
