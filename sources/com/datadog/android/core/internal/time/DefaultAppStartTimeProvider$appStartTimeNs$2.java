package com.datadog.android.core.internal.time;

import android.os.Process;
import android.os.SystemClock;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.system.BuildSdkVersionProvider;
import defpackage.gu5;
import defpackage.mj8;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DefaultAppStartTimeProvider$appStartTimeNs$2 extends mj8 implements gu5<Long> {
    final /* synthetic */ BuildSdkVersionProvider $buildSdkVersionProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAppStartTimeProvider$appStartTimeNs$2(BuildSdkVersionProvider buildSdkVersionProvider) {
        super(0);
        this.$buildSdkVersionProvider = buildSdkVersionProvider;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.gu5
    public final Long invoke() {
        long startupTimeNs$dd_sdk_android_core_release;
        if (this.$buildSdkVersionProvider.getVersion() >= 24) {
            startupTimeNs$dd_sdk_android_core_release = System.nanoTime() - TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime());
        } else {
            startupTimeNs$dd_sdk_android_core_release = DatadogCore.INSTANCE.getStartupTimeNs$dd_sdk_android_core_release();
        }
        return Long.valueOf(startupTimeNs$dd_sdk_android_core_release);
    }
}
