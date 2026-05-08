package com.datadog.android.core.internal.data.upload;

import com.datadog.android.core.configuration.UploadSchedulerStrategy;
import com.datadog.android.core.internal.configuration.DataUploadConfiguration;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.gf9;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J1\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/DefaultUploadSchedulerStrategy;", "Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "uploadConfiguration", "Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;", "(Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;)V", "currentDelays", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "getUploadConfiguration$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;", "decreaseInterval", "previousDelay", "getMsDelayUntilNextUpload", "featureName", "uploadAttempts", "", "lastStatusCode", RumFeature.EVENT_THROWABLE_PROPERTY, "", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Throwable;)J", "increaseInterval", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DefaultUploadSchedulerStrategy implements UploadSchedulerStrategy {
    public static final double DECREASE_PERCENT = 0.9d;
    public static final double INCREASE_PERCENT = 1.1d;
    private final ConcurrentHashMap<String, Long> currentDelays;
    private final DataUploadConfiguration uploadConfiguration;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long NETWORK_ERROR_DELAY_MS = 60000;

    public DefaultUploadSchedulerStrategy(DataUploadConfiguration dataUploadConfiguration) {
        dataUploadConfiguration.getClass();
        this.uploadConfiguration = dataUploadConfiguration;
        this.currentDelays = new ConcurrentHashMap<>();
    }

    private final long decreaseInterval(long previousDelay) {
        return Math.max(this.uploadConfiguration.getMinDelayMs(), gf9.c(previousDelay * 0.9d));
    }

    private final long increaseInterval(long previousDelay, Throwable throwable) {
        return throwable instanceof IOException ? NETWORK_ERROR_DELAY_MS : Math.min(this.uploadConfiguration.getMaxDelayMs(), gf9.c(previousDelay * 1.1d));
    }

    @Override // com.datadog.android.core.configuration.UploadSchedulerStrategy
    public long getMsDelayUntilNextUpload(String featureName, int uploadAttempts, Integer lastStatusCode, Throwable throwable) {
        Long lPutIfAbsent;
        featureName.getClass();
        ConcurrentHashMap<String, Long> concurrentHashMap = this.currentDelays;
        Long lValueOf = concurrentHashMap.get(featureName);
        if (lValueOf == null && (lPutIfAbsent = concurrentHashMap.putIfAbsent(featureName, (lValueOf = Long.valueOf(this.uploadConfiguration.getDefaultDelayMs())))) != null) {
            lValueOf = lPutIfAbsent;
        }
        Long l = lValueOf;
        long jIncreaseInterval = (uploadAttempts <= 0 || throwable != null || lastStatusCode == null || lastStatusCode.intValue() != 202) ? increaseInterval(l.longValue(), throwable) : decreaseInterval(l.longValue());
        this.currentDelays.put(featureName, Long.valueOf(jIncreaseInterval));
        return jIncreaseInterval;
    }

    /* JADX INFO: renamed from: getUploadConfiguration$dd_sdk_android_core_release, reason: from getter */
    public final DataUploadConfiguration getUploadConfiguration() {
        return this.uploadConfiguration;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/DefaultUploadSchedulerStrategy$Companion;", "", "()V", "DECREASE_PERCENT", "", "INCREASE_PERCENT", "NETWORK_ERROR_DELAY_MS", "", "getNETWORK_ERROR_DELAY_MS$dd_sdk_android_core_release", "()J", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getNETWORK_ERROR_DELAY_MS$dd_sdk_android_core_release() {
            return DefaultUploadSchedulerStrategy.NETWORK_ERROR_DELAY_MS;
        }

        private Companion() {
        }
    }
}
