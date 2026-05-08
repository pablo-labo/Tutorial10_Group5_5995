package com.datadog.android.core.internal.time;

import com.datadog.android.core.internal.system.BuildSdkVersionProvider;
import defpackage.boa;
import defpackage.qt8;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/datadog/android/core/internal/time/DefaultAppStartTimeProvider;", "Lcom/datadog/android/core/internal/time/AppStartTimeProvider;", "buildSdkVersionProvider", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "(Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;)V", "appStartTimeNs", "", "getAppStartTimeNs", "()J", "appStartTimeNs$delegate", "Lkotlin/Lazy;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DefaultAppStartTimeProvider implements AppStartTimeProvider {

    /* JADX INFO: renamed from: appStartTimeNs$delegate, reason: from kotlin metadata */
    private final Lazy appStartTimeNs;

    public DefaultAppStartTimeProvider(BuildSdkVersionProvider buildSdkVersionProvider) {
        buildSdkVersionProvider.getClass();
        this.appStartTimeNs = boa.E(qt8.b, new DefaultAppStartTimeProvider$appStartTimeNs$2(buildSdkVersionProvider));
    }

    @Override // com.datadog.android.core.internal.time.AppStartTimeProvider
    public long getAppStartTimeNs() {
        return ((Number) this.appStartTimeNs.getValue()).longValue();
    }

    public DefaultAppStartTimeProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DefaultAppStartTimeProvider(BuildSdkVersionProvider buildSdkVersionProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }
}
