package com.datadog.android.core.internal.net.info;

import android.content.Context;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/core/internal/net/info/NoOpNetworkInfoProvider;", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "<init>", "()V", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lj6g;", "register", "(Landroid/content/Context;)V", "unregister", "Lcom/datadog/android/api/context/NetworkInfo;", "getLatestNetworkInfo", "()Lcom/datadog/android/api/context/NetworkInfo;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpNetworkInfoProvider implements NetworkInfoProvider {
    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public NetworkInfo getLatestNetworkInfo() {
        return new NetworkInfo(null, null, null, null, null, null, null, 127, null);
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public void register(Context context) {
        context.getClass();
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public void unregister(Context context) {
        context.getClass();
    }
}
