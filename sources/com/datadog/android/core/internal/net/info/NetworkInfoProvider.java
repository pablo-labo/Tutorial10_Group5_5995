package com.datadog.android.core.internal.net.info;

import android.content.Context;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lj6g;", "register", "(Landroid/content/Context;)V", "unregister", "Lcom/datadog/android/api/context/NetworkInfo;", "getLatestNetworkInfo", "()Lcom/datadog/android/api/context/NetworkInfo;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface NetworkInfoProvider {
    NetworkInfo getLatestNetworkInfo();

    void register(Context context);

    void unregister(Context context);
}
