package com.datadog.android.core.internal.persistence.file.advanced;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.core.internal.persistence.file.FileOrchestrator;
import com.datadog.android.core.internal.persistence.file.NoOpFileOrchestrator;
import com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator;
import com.datadog.android.core.internal.privacy.ConsentProvider;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.privacy.TrackingConsent;
import com.datadog.android.privacy.TrackingConsentProviderCallback;
import defpackage.l;
import defpackage.wl7;
import defpackage.z92;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0010\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0!H\u0017¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010\u001aH\u0017¢\u0006\u0004\b$\u0010%J\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0!H\u0017¢\u0006\u0004\b)\u0010#J\u0019\u0010+\u001a\u0004\u0018\u00010\u001a2\u0006\u0010*\u001a\u00020\u001aH\u0017¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0006\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b1\u00100R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u00107R\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010.¨\u0006="}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/ConsentAwareFileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Lcom/datadog/android/privacy/TrackingConsentProviderCallback;", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "consentProvider", "pendingOrchestrator", "grantedOrchestrator", "Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;", "Lcom/datadog/android/privacy/TrackingConsent;", "dataMigrator", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/core/internal/privacy/ConsentProvider;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/api/InternalLogger;)V", "previousConsent", "newConsent", "Lj6g;", "handleConsentChange", "(Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/privacy/TrackingConsent;)V", BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "resolveDelegateOrchestrator", "(Lcom/datadog/android/privacy/TrackingConsent;)Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "", "forceNewFile", "Ljava/io/File;", "getWritableFile", "(Z)Ljava/io/File;", "", "excludeFiles", "getReadableFile", "(Ljava/util/Set;)Ljava/io/File;", "", "getAllFiles", "()Ljava/util/List;", "getRootDir", "()Ljava/io/File;", "", "getRootDirName", "()Ljava/lang/String;", "getFlushableFiles", "file", "getMetadataFile", "(Ljava/io/File;)Ljava/io/File;", "onConsentUpdated", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getPendingOrchestrator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getGrantedOrchestrator$dd_sdk_android_core_release", "Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;", "getDataMigrator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;", "Ljava/util/concurrent/ExecutorService;", "getExecutorService$dd_sdk_android_core_release", "()Ljava/util/concurrent/ExecutorService;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/api/InternalLogger;", "delegateOrchestrator", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class ConsentAwareFileOrchestrator implements FileOrchestrator, TrackingConsentProviderCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final FileOrchestrator NO_OP_ORCHESTRATOR = new NoOpFileOrchestrator();
    private final DataMigrator<TrackingConsent> dataMigrator;
    private volatile FileOrchestrator delegateOrchestrator;
    private final ExecutorService executorService;
    private final FileOrchestrator grantedOrchestrator;
    private final InternalLogger internalLogger;
    private final FileOrchestrator pendingOrchestrator;

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackingConsent.values().length];
            try {
                iArr[TrackingConsent.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackingConsent.GRANTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackingConsent.NOT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConsentAwareFileOrchestrator(ConsentProvider consentProvider, FileOrchestrator fileOrchestrator, FileOrchestrator fileOrchestrator2, DataMigrator<TrackingConsent> dataMigrator, ExecutorService executorService, InternalLogger internalLogger) {
        consentProvider.getClass();
        fileOrchestrator.getClass();
        fileOrchestrator2.getClass();
        dataMigrator.getClass();
        executorService.getClass();
        internalLogger.getClass();
        this.pendingOrchestrator = fileOrchestrator;
        this.grantedOrchestrator = fileOrchestrator2;
        this.dataMigrator = dataMigrator;
        this.executorService = executorService;
        this.internalLogger = internalLogger;
        handleConsentChange(null, consentProvider.getConsent());
        consentProvider.registerCallback(this);
    }

    private final void handleConsentChange(final TrackingConsent previousConsent, final TrackingConsent newConsent) {
        final FileOrchestrator fileOrchestratorResolveDelegateOrchestrator = resolveDelegateOrchestrator(previousConsent);
        final FileOrchestrator fileOrchestratorResolveDelegateOrchestrator2 = resolveDelegateOrchestrator(newConsent);
        ConcurrencyExtKt.submitSafe(this.executorService, "Data migration", this.internalLogger, new Runnable() { // from class: kp2
            @Override // java.lang.Runnable
            public final void run() {
                ConsentAwareFileOrchestrator.handleConsentChange$lambda$0(this.a, previousConsent, fileOrchestratorResolveDelegateOrchestrator, newConsent, fileOrchestratorResolveDelegateOrchestrator2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleConsentChange$lambda$0(ConsentAwareFileOrchestrator consentAwareFileOrchestrator, TrackingConsent trackingConsent, FileOrchestrator fileOrchestrator, TrackingConsent trackingConsent2, FileOrchestrator fileOrchestrator2) {
        consentAwareFileOrchestrator.getClass();
        fileOrchestrator.getClass();
        trackingConsent2.getClass();
        fileOrchestrator2.getClass();
        consentAwareFileOrchestrator.dataMigrator.migrateData(trackingConsent, fileOrchestrator, trackingConsent2, fileOrchestrator2);
        consentAwareFileOrchestrator.delegateOrchestrator = fileOrchestrator2;
    }

    private final FileOrchestrator resolveDelegateOrchestrator(TrackingConsent consent) {
        int i = consent == null ? -1 : WhenMappings.$EnumSwitchMapping$0[consent.ordinal()];
        if (i == -1 || i == 1) {
            return this.pendingOrchestrator;
        }
        if (i == 2) {
            return this.grantedOrchestrator;
        }
        if (i == 3) {
            return NO_OP_ORCHESTRATOR;
        }
        l.g();
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public List<File> getAllFiles() {
        return z92.h1(this.pendingOrchestrator.getAllFiles(), this.grantedOrchestrator.getAllFiles());
    }

    public final DataMigrator<TrackingConsent> getDataMigrator$dd_sdk_android_core_release() {
        return this.dataMigrator;
    }

    /* JADX INFO: renamed from: getExecutorService$dd_sdk_android_core_release, reason: from getter */
    public final ExecutorService getExecutorService() {
        return this.executorService;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public List<File> getFlushableFiles() {
        return this.grantedOrchestrator.getFlushableFiles();
    }

    /* JADX INFO: renamed from: getGrantedOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final FileOrchestrator getGrantedOrchestrator() {
        return this.grantedOrchestrator;
    }

    /* JADX INFO: renamed from: getInternalLogger$dd_sdk_android_core_release, reason: from getter */
    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getMetadataFile(File file) {
        file.getClass();
        FileOrchestrator fileOrchestrator = this.delegateOrchestrator;
        if (fileOrchestrator != null) {
            return fileOrchestrator.getMetadataFile(file);
        }
        wl7.g("delegateOrchestrator");
        throw null;
    }

    /* JADX INFO: renamed from: getPendingOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final FileOrchestrator getPendingOrchestrator() {
        return this.pendingOrchestrator;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getReadableFile(Set<? extends File> excludeFiles) {
        excludeFiles.getClass();
        return this.grantedOrchestrator.getReadableFile(excludeFiles);
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getRootDir() {
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public String getRootDirName() {
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public File getWritableFile(boolean forceNewFile) {
        FileOrchestrator fileOrchestrator = this.delegateOrchestrator;
        if (fileOrchestrator != null) {
            return fileOrchestrator.getWritableFile(forceNewFile);
        }
        wl7.g("delegateOrchestrator");
        throw null;
    }

    @Override // com.datadog.android.privacy.TrackingConsentProviderCallback
    public void onConsentUpdated(TrackingConsent previousConsent, TrackingConsent newConsent) {
        previousConsent.getClass();
        newConsent.getClass();
        handleConsentChange(previousConsent, newConsent);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/ConsentAwareFileOrchestrator$Companion;", "", "()V", "NO_OP_ORCHESTRATOR", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getNO_OP_ORCHESTRATOR$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FileOrchestrator getNO_OP_ORCHESTRATOR$dd_sdk_android_core_release() {
            return ConsentAwareFileOrchestrator.NO_OP_ORCHESTRATOR;
        }

        private Companion() {
        }
    }
}
