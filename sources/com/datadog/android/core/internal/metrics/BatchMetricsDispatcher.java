package com.datadog.android.core.internal.metrics;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.configuration.DataUploadConfiguration;
import com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.datadog.android.core.internal.persistence.file.advanced.FeatureFileOrchestrator;
import com.datadog.android.core.internal.time.TimeProvider;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.gu5;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.r6;
import defpackage.vve;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u0004\u0018\u00010\u0003*\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020%2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020%H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020%H\u0016¢\u0006\u0004\b-\u0010+J\u000f\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010+R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u0016\u00103\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/datadog/android/core/internal/metrics/BatchMetricsDispatcher;", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor$Callback;", "", "featureName", "Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;", "uploadConfiguration", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "filePersistenceConfig", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/time/TimeProvider;", "dateTimeProvider", "<init>", "(Ljava/lang/String;Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/time/TimeProvider;)V", "Ljava/io/File;", "file", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "deletionReason", "", "", "resolveBatchDeletedMetricAttributes", "(Ljava/io/File;Lcom/datadog/android/core/internal/metrics/RemovalReason;)Ljava/util/Map;", "Lcom/datadog/android/core/internal/metrics/BatchClosedMetadata;", "batchMetadata", "resolveBatchClosedMetricAttributes", "(Ljava/io/File;Lcom/datadog/android/core/internal/metrics/BatchClosedMetadata;)Ljava/util/Map;", "logger", "", "nameAsTimestampSafe", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)Ljava/lang/Long;", "resolveTrackName", "(Ljava/lang/String;)Ljava/lang/String;", "resolveFileOriginAsConsent", "(Ljava/io/File;)Ljava/lang/String;", "batchFile", "removalReason", "Lj6g;", "sendBatchDeletedMetric", "(Ljava/io/File;Lcom/datadog/android/core/internal/metrics/RemovalReason;)V", "sendBatchClosedMetric", "(Ljava/io/File;Lcom/datadog/android/core/internal/metrics/BatchClosedMetadata;)V", "onStarted", "()V", "onResumed", "onStopped", "onPaused", "Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/internal/time/TimeProvider;", "trackName", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInBackground", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class BatchMetricsDispatcher implements MetricsDispatcher, ProcessLifecycleMonitor.Callback {
    public static final String BATCH_AGE_KEY = "batch_age";
    public static final String BATCH_CLOSED_MESSAGE = "[Mobile Metric] Batch Closed";
    public static final String BATCH_CLOSED_TYPE_VALUE = "batch closed";
    public static final String BATCH_DELETED_MESSAGE = "[Mobile Metric] Batch Deleted";
    public static final String BATCH_DELETED_TYPE_VALUE = "batch deleted";
    public static final String BATCH_DURATION_KEY = "batch_duration";
    public static final String BATCH_EVENTS_COUNT_KEY = "batch_events_count";
    public static final String BATCH_REMOVAL_KEY = "batch_removal_reason";
    public static final String BATCH_SIZE_KEY = "batch_size";
    public static final String FILE_NAME = "filename";
    public static final String FORCE_NEW_KEY = "forced_new";
    public static final String IN_BACKGROUND_KEY = "in_background";
    public static final String LOGS_TRACK_NAME = "logs";
    public static final String RUM_TRACK_NAME = "rum";
    public static final String SR_RESOURCES_TRACK_NAME = "sr-resources";
    public static final String SR_TRACK_NAME = "sr";
    public static final String THREAD_NAME = "thread";
    public static final String TRACE_TRACK_NAME = "trace";
    public static final String TRACKING_CONSENT_KEY = "consent";
    public static final String TRACK_KEY = "track";
    public static final String TYPE_KEY = "metric_type";
    public static final String UPLOADER_DELAY_KEY = "uploader_delay";
    public static final String UPLOADER_DELAY_MAX_KEY = "max";
    public static final String UPLOADER_DELAY_MIN_KEY = "min";
    public static final String UPLOADER_WINDOW_KEY = "uploader_window";
    public static final String WRONG_FILE_NAME_MESSAGE_FORMAT = "Unable to parse the file name as a timestamp: %s";
    private final TimeProvider dateTimeProvider;
    private final FilePersistenceConfig filePersistenceConfig;
    private final InternalLogger internalLogger;
    private final AtomicBoolean isInBackground;
    private final String trackName;
    private final DataUploadConfiguration uploadConfiguration;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.metrics.BatchMetricsDispatcher$nameAsTimestampSafe$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ File $this_nameAsTimestampSafe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File file) {
            super(0);
            this.$this_nameAsTimestampSafe = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.ENGLISH, BatchMetricsDispatcher.WRONG_FILE_NAME_MESSAGE_FORMAT, Arrays.copyOf(new Object[]{this.$this_nameAsTimestampSafe.getName()}, 1));
        }
    }

    public BatchMetricsDispatcher(String str, DataUploadConfiguration dataUploadConfiguration, FilePersistenceConfig filePersistenceConfig, InternalLogger internalLogger, TimeProvider timeProvider) {
        str.getClass();
        filePersistenceConfig.getClass();
        internalLogger.getClass();
        timeProvider.getClass();
        this.uploadConfiguration = dataUploadConfiguration;
        this.filePersistenceConfig = filePersistenceConfig;
        this.internalLogger = internalLogger;
        this.dateTimeProvider = timeProvider;
        this.trackName = resolveTrackName(str);
        this.isInBackground = new AtomicBoolean(true);
    }

    private final Long nameAsTimestampSafe(File file, InternalLogger internalLogger) {
        String name = file.getName();
        name.getClass();
        Long lC = vve.C(name);
        if (lC == null) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) new AnonymousClass1(file), (Throwable) null, false, (Map) null, 56, (Object) null);
        }
        return lC;
    }

    private final Map<String, Object> resolveBatchClosedMetricAttributes(File file, BatchClosedMetadata batchMetadata) {
        Long lNameAsTimestampSafe = nameAsTimestampSafe(file, this.internalLogger);
        if (lNameAsTimestampSafe == null) {
            return null;
        }
        long lastTimeWasUsedInMs$dd_sdk_android_core_release = batchMetadata.getLastTimeWasUsedInMs$dd_sdk_android_core_release() - lNameAsTimestampSafe.longValue();
        if (lastTimeWasUsedInMs$dd_sdk_android_core_release < 0) {
            return null;
        }
        return lc9.a0(new Pair(TRACK_KEY, this.trackName), new Pair("metric_type", BATCH_CLOSED_TYPE_VALUE), new Pair(BATCH_DURATION_KEY, Long.valueOf(lastTimeWasUsedInMs$dd_sdk_android_core_release)), new Pair(UPLOADER_WINDOW_KEY, Long.valueOf(this.filePersistenceConfig.getRecentDelayMs())), new Pair(BATCH_SIZE_KEY, Long.valueOf(FileExtKt.lengthSafe(file, this.internalLogger))), new Pair(BATCH_EVENTS_COUNT_KEY, Long.valueOf(batchMetadata.getEventsCount$dd_sdk_android_core_release())), new Pair(FORCE_NEW_KEY, Boolean.valueOf(batchMetadata.getForcedNew$dd_sdk_android_core_release())), new Pair(TRACKING_CONSENT_KEY, resolveFileOriginAsConsent(file)), new Pair(FILE_NAME, file.getName()), new Pair(THREAD_NAME, Thread.currentThread().getName()));
    }

    private final Map<String, Object> resolveBatchDeletedMetricAttributes(File file, RemovalReason deletionReason) {
        Long lNameAsTimestampSafe = nameAsTimestampSafe(file, this.internalLogger);
        if (lNameAsTimestampSafe == null) {
            return null;
        }
        long deviceTimestamp = this.dateTimeProvider.getDeviceTimestamp() - lNameAsTimestampSafe.longValue();
        if (deviceTimestamp < 0) {
            return null;
        }
        Pair pair = new Pair(TRACK_KEY, this.trackName);
        Pair pair2 = new Pair("metric_type", BATCH_DELETED_TYPE_VALUE);
        Pair pair3 = new Pair(BATCH_AGE_KEY, Long.valueOf(deviceTimestamp));
        DataUploadConfiguration dataUploadConfiguration = this.uploadConfiguration;
        Pair pair4 = new Pair(UPLOADER_DELAY_MIN_KEY, dataUploadConfiguration != null ? Long.valueOf(dataUploadConfiguration.getMinDelayMs()) : null);
        DataUploadConfiguration dataUploadConfiguration2 = this.uploadConfiguration;
        return lc9.a0(pair, pair2, pair3, new Pair(UPLOADER_DELAY_KEY, lc9.a0(pair4, new Pair(UPLOADER_DELAY_MAX_KEY, dataUploadConfiguration2 != null ? Long.valueOf(dataUploadConfiguration2.getMaxDelayMs()) : null))), new Pair(UPLOADER_WINDOW_KEY, Long.valueOf(this.filePersistenceConfig.getRecentDelayMs())), new Pair(BATCH_REMOVAL_KEY, deletionReason.toString()), new Pair(IN_BACKGROUND_KEY, Boolean.valueOf(this.isInBackground.get())), new Pair(TRACKING_CONSENT_KEY, resolveFileOriginAsConsent(file)), new Pair(FILE_NAME, file.getName()), new Pair(THREAD_NAME, Thread.currentThread().getName()));
    }

    private final String resolveFileOriginAsConsent(File file) {
        File parentFile = file.getParentFile();
        String name = parentFile != null ? parentFile.getName() : null;
        if (name == null) {
            return null;
        }
        FeatureFileOrchestrator.Companion companion = FeatureFileOrchestrator.INSTANCE;
        if (companion.getIS_PENDING_DIR_REG_EX$dd_sdk_android_core_release().d(name)) {
            String string = TrackingConsent.PENDING.toString();
            Locale locale = Locale.US;
            return r6.f(locale, string, locale);
        }
        if (!companion.getIS_GRANTED_DIR_REG_EX$dd_sdk_android_core_release().d(name)) {
            return null;
        }
        String string2 = TrackingConsent.GRANTED.toString();
        Locale locale2 = Locale.US;
        return r6.f(locale2, string2, locale2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final String resolveTrackName(String featureName) {
        switch (featureName.hashCode()) {
            case -1067396926:
                if (featureName.equals("tracing")) {
                    return "trace";
                }
                return null;
            case 113290:
                if (featureName.equals("rum")) {
                    return "rum";
                }
                return null;
            case 3327407:
                if (featureName.equals("logs")) {
                    return "logs";
                }
                return null;
            case 456014590:
                if (featureName.equals("session-replay")) {
                    return SR_TRACK_NAME;
                }
                return null;
            case 2144122390:
                if (featureName.equals("session-replay-resources")) {
                    return SR_RESOURCES_TRACK_NAME;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onPaused() {
        this.isInBackground.set(true);
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onResumed() {
        this.isInBackground.set(false);
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onStarted() {
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onStopped() {
    }

    @Override // com.datadog.android.core.internal.metrics.MetricsDispatcher
    public void sendBatchClosedMetric(File batchFile, BatchClosedMetadata batchMetadata) {
        Map<String, Object> mapResolveBatchClosedMetricAttributes;
        batchFile.getClass();
        batchMetadata.getClass();
        if (this.trackName == null || !FileExtKt.existsSafe(batchFile, this.internalLogger) || (mapResolveBatchClosedMetricAttributes = resolveBatchClosedMetricAttributes(batchFile, batchMetadata)) == null) {
            return;
        }
        InternalLogger.DefaultImpls.logMetric$default(this.internalLogger, BatchMetricsDispatcher$sendBatchClosedMetric$1$1.INSTANCE, mapResolveBatchClosedMetricAttributes, 1.5f, null, 8, null);
    }

    @Override // com.datadog.android.core.internal.metrics.MetricsDispatcher
    public void sendBatchDeletedMetric(File batchFile, RemovalReason removalReason) {
        Map<String, Object> mapResolveBatchDeletedMetricAttributes;
        batchFile.getClass();
        removalReason.getClass();
        if (!removalReason.includeInMetrics$dd_sdk_android_core_release() || this.trackName == null || (mapResolveBatchDeletedMetricAttributes = resolveBatchDeletedMetricAttributes(batchFile, removalReason)) == null) {
            return;
        }
        InternalLogger.DefaultImpls.logMetric$default(this.internalLogger, BatchMetricsDispatcher$sendBatchDeletedMetric$1$1.INSTANCE, mapResolveBatchDeletedMetricAttributes, 1.5f, null, 8, null);
    }
}
