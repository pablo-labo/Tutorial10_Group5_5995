package com.datadog.android.core.internal.persistence.file.advanced;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.metrics.MetricsDispatcher;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.persistence.file.FileOrchestrator;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator;
import com.datadog.android.core.internal.privacy.ConsentProvider;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.pxc;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/FeatureFileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/file/advanced/ConsentAwareFileOrchestrator;", "consentProvider", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "storageDir", "Ljava/io/File;", "featureName", "", "executorService", "Ljava/util/concurrent/ExecutorService;", "filePersistenceConfig", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "metricsDispatcher", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "(Lcom/datadog/android/core/internal/privacy/ConsentProvider;Ljava/io/File;Ljava/lang/String;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;)V", "pendingOrchestrator", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "grantedOrchestrator", "dataMigrator", "Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;", "Lcom/datadog/android/privacy/TrackingConsent;", "(Lcom/datadog/android/core/internal/privacy/ConsentProvider;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/api/InternalLogger;)V", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class FeatureFileOrchestrator extends ConsentAwareFileOrchestrator {
    private static final String BASE_DIR_NAME_REG_EX = "([a-z]+-)+";
    public static final String GRANTED_DIR = "%s-v2";
    public static final String PENDING_DIR = "%s-pending-v2";
    public static final int VERSION = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final pxc IS_GRANTED_DIR_REG_EX = new pxc("([a-z]+-)+v[0-9]+");
    private static final pxc IS_PENDING_DIR_REG_EX = new pxc("([a-z]+-)+pending-v[0-9]+");

    /* JADX WARN: Illegal instructions before constructor call */
    public FeatureFileOrchestrator(ConsentProvider consentProvider, File file, String str, ExecutorService executorService, FilePersistenceConfig filePersistenceConfig, InternalLogger internalLogger, MetricsDispatcher metricsDispatcher) {
        consentProvider.getClass();
        file.getClass();
        str.getClass();
        executorService.getClass();
        filePersistenceConfig.getClass();
        internalLogger.getClass();
        metricsDispatcher.getClass();
        Locale locale = Locale.US;
        this(consentProvider, new BatchFileOrchestrator(new File(file, String.format(locale, PENDING_DIR, Arrays.copyOf(new Object[]{str}, 1))), filePersistenceConfig, internalLogger, metricsDispatcher), new BatchFileOrchestrator(new File(file, String.format(locale, GRANTED_DIR, Arrays.copyOf(new Object[]{str}, 1))), filePersistenceConfig, internalLogger, metricsDispatcher), new ConsentAwareFileMigrator(new FileMover(internalLogger), internalLogger), executorService, internalLogger);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/FeatureFileOrchestrator$Companion;", "", "<init>", "()V", "Lpxc;", "IS_GRANTED_DIR_REG_EX", "Lpxc;", "getIS_GRANTED_DIR_REG_EX$dd_sdk_android_core_release", "()Lpxc;", "IS_PENDING_DIR_REG_EX", "getIS_PENDING_DIR_REG_EX$dd_sdk_android_core_release", "", "BASE_DIR_NAME_REG_EX", "Ljava/lang/String;", "GRANTED_DIR", "PENDING_DIR", "", "VERSION", "I", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pxc getIS_GRANTED_DIR_REG_EX$dd_sdk_android_core_release() {
            return FeatureFileOrchestrator.IS_GRANTED_DIR_REG_EX;
        }

        public final pxc getIS_PENDING_DIR_REG_EX$dd_sdk_android_core_release() {
            return FeatureFileOrchestrator.IS_PENDING_DIR_REG_EX;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureFileOrchestrator(ConsentProvider consentProvider, FileOrchestrator fileOrchestrator, FileOrchestrator fileOrchestrator2, DataMigrator<TrackingConsent> dataMigrator, ExecutorService executorService, InternalLogger internalLogger) {
        super(consentProvider, fileOrchestrator, fileOrchestrator2, dataMigrator, executorService, internalLogger);
        consentProvider.getClass();
        fileOrchestrator.getClass();
        fileOrchestrator2.getClass();
        dataMigrator.getClass();
        executorService.getClass();
        internalLogger.getClass();
    }
}
