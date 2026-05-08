package com.datadog.android.core.internal.persistence;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.api.storage.FeatureStorageConfiguration;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.datadog.android.core.internal.privacy.ConsentProvider;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.core.persistence.NoOpPersistenceStrategy;
import com.datadog.android.core.persistence.PersistenceStrategy;
import com.datadog.android.privacy.TrackingConsent;
import com.datadog.android.privacy.TrackingConsentProviderCallback;
import defpackage.d2f;
import defpackage.j6g;
import defpackage.l;
import defpackage.n4;
import defpackage.o4;
import defpackage.p4;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b \u0010!J'\u0010'\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0017H\u0017¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001bH\u0017¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010/R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107R\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010;R\u001b\u0010?\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u0014R\u001b\u0010B\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010\u0014R\u0014\u0010C\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lcom/datadog/android/core/internal/persistence/AbstractStorage;", "Lcom/datadog/android/core/internal/persistence/Storage;", "Lcom/datadog/android/privacy/TrackingConsentProviderCallback;", "", "sdkCoreId", "featureName", "Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;", "persistenceStrategyFactory", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "storageConfiguration", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "consentProvider", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/api/storage/FeatureStorageConfiguration;Lcom/datadog/android/core/internal/privacy/ConsentProvider;)V", "Lcom/datadog/android/core/persistence/PersistenceStrategy;", "resolvePersistenceStrategy", "()Lcom/datadog/android/core/persistence/PersistenceStrategy;", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "", "forceNewBatch", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "Lj6g;", "callback", "writeCurrentBatch", "(Lcom/datadog/android/api/context/DatadogContext;ZLkotlin/jvm/functions/Function1;)V", "Lcom/datadog/android/core/internal/persistence/BatchData;", "readNextBatch", "()Lcom/datadog/android/core/internal/persistence/BatchData;", "Lcom/datadog/android/core/internal/persistence/BatchId;", "batchId", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "removalReason", "deleteBatch", "confirmBatchRead", "(Lcom/datadog/android/core/internal/persistence/BatchId;Lcom/datadog/android/core/internal/metrics/RemovalReason;Z)V", "dropAll", "()V", "Lcom/datadog/android/privacy/TrackingConsent;", "previousConsent", "newConsent", "onConsentUpdated", "(Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/privacy/TrackingConsent;)V", "Ljava/lang/String;", "getSdkCoreId$dd_sdk_android_core_release", "()Ljava/lang/String;", "Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;", "getPersistenceStrategyFactory$dd_sdk_android_core_release", "()Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;", "Ljava/util/concurrent/ExecutorService;", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "getStorageConfiguration$dd_sdk_android_core_release", "()Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "grantedPersistenceStrategy$delegate", "Lkotlin/Lazy;", "getGrantedPersistenceStrategy", "grantedPersistenceStrategy", "pendingPersistenceStrategy$delegate", "getPendingPersistenceStrategy", "pendingPersistenceStrategy", "notGrantedPersistenceStrategy", "Lcom/datadog/android/core/persistence/PersistenceStrategy;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class AbstractStorage implements Storage, TrackingConsentProviderCallback {
    private final ConsentProvider consentProvider;
    private final ExecutorService executorService;
    private final String featureName;

    /* JADX INFO: renamed from: grantedPersistenceStrategy$delegate, reason: from kotlin metadata */
    private final Lazy grantedPersistenceStrategy;
    private final InternalLogger internalLogger;
    private final PersistenceStrategy notGrantedPersistenceStrategy;

    /* JADX INFO: renamed from: pendingPersistenceStrategy$delegate, reason: from kotlin metadata */
    private final Lazy pendingPersistenceStrategy;
    private final PersistenceStrategy.Factory persistenceStrategyFactory;
    private final String sdkCoreId;
    private final FeatureStorageConfiguration storageConfiguration;

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackingConsent.values().length];
            try {
                iArr[TrackingConsent.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackingConsent.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackingConsent.NOT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbstractStorage(String str, String str2, PersistenceStrategy.Factory factory, ExecutorService executorService, InternalLogger internalLogger, FeatureStorageConfiguration featureStorageConfiguration, ConsentProvider consentProvider) {
        str2.getClass();
        factory.getClass();
        executorService.getClass();
        internalLogger.getClass();
        featureStorageConfiguration.getClass();
        consentProvider.getClass();
        this.sdkCoreId = str;
        this.featureName = str2;
        this.persistenceStrategyFactory = factory;
        this.executorService = executorService;
        this.internalLogger = internalLogger;
        this.storageConfiguration = featureStorageConfiguration;
        this.consentProvider = consentProvider;
        this.grantedPersistenceStrategy = new d2f(new AbstractStorage$grantedPersistenceStrategy$2(this));
        this.pendingPersistenceStrategy = new d2f(new AbstractStorage$pendingPersistenceStrategy$2(this));
        this.notGrantedPersistenceStrategy = new NoOpPersistenceStrategy();
        consentProvider.registerCallback(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dropAll$lambda$2(AbstractStorage abstractStorage) {
        abstractStorage.getClass();
        abstractStorage.getGrantedPersistenceStrategy().dropAll();
        abstractStorage.getPendingPersistenceStrategy().dropAll();
    }

    private final PersistenceStrategy getGrantedPersistenceStrategy() {
        return (PersistenceStrategy) this.grantedPersistenceStrategy.getValue();
    }

    private final PersistenceStrategy getPendingPersistenceStrategy() {
        return (PersistenceStrategy) this.pendingPersistenceStrategy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConsentUpdated$lambda$3(TrackingConsent trackingConsent, TrackingConsent trackingConsent2, AbstractStorage abstractStorage) {
        trackingConsent.getClass();
        trackingConsent2.getClass();
        abstractStorage.getClass();
        if (trackingConsent == TrackingConsent.PENDING) {
            int i = WhenMappings.$EnumSwitchMapping$0[trackingConsent2.ordinal()];
            if (i == 1) {
                abstractStorage.getPendingPersistenceStrategy().migrateData(abstractStorage.getGrantedPersistenceStrategy());
            } else {
                if (i != 3) {
                    return;
                }
                abstractStorage.getPendingPersistenceStrategy().dropAll();
            }
        }
    }

    private final PersistenceStrategy resolvePersistenceStrategy() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.consentProvider.getConsent().ordinal()];
        if (i == 1) {
            return getGrantedPersistenceStrategy();
        }
        if (i == 2) {
            return getPendingPersistenceStrategy();
        }
        if (i == 3) {
            return this.notGrantedPersistenceStrategy;
        }
        l.g();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeCurrentBatch$lambda$0(AbstractStorage abstractStorage, Function1 function1) {
        abstractStorage.getClass();
        function1.getClass();
        final PersistenceStrategy persistenceStrategyResolvePersistenceStrategy = abstractStorage.resolvePersistenceStrategy();
        function1.invoke(new EventBatchWriter() { // from class: com.datadog.android.core.internal.persistence.AbstractStorage$writeCurrentBatch$1$writer$1
            @Override // com.datadog.android.api.storage.EventBatchWriter
            public byte[] currentMetadata() {
                return persistenceStrategyResolvePersistenceStrategy.currentMetadata();
            }

            @Override // com.datadog.android.api.storage.EventBatchWriter
            public boolean write(RawBatchEvent event, byte[] batchMetadata, EventType eventType) {
                event.getClass();
                eventType.getClass();
                return persistenceStrategyResolvePersistenceStrategy.write(event, batchMetadata, eventType);
            }
        });
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public void confirmBatchRead(BatchId batchId, RemovalReason removalReason, boolean deleteBatch) {
        batchId.getClass();
        removalReason.getClass();
        if (deleteBatch) {
            getGrantedPersistenceStrategy().unlockAndDelete(batchId.getId());
        } else {
            getGrantedPersistenceStrategy().unlockAndKeep(batchId.getId());
        }
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public void dropAll() {
        ConcurrencyExtKt.submitSafe(this.executorService, "Data drop", this.internalLogger, new p4(this, 0));
    }

    /* JADX INFO: renamed from: getPersistenceStrategyFactory$dd_sdk_android_core_release, reason: from getter */
    public final PersistenceStrategy.Factory getPersistenceStrategyFactory() {
        return this.persistenceStrategyFactory;
    }

    /* JADX INFO: renamed from: getSdkCoreId$dd_sdk_android_core_release, reason: from getter */
    public final String getSdkCoreId() {
        return this.sdkCoreId;
    }

    /* JADX INFO: renamed from: getStorageConfiguration$dd_sdk_android_core_release, reason: from getter */
    public final FeatureStorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    @Override // com.datadog.android.privacy.TrackingConsentProviderCallback
    public void onConsentUpdated(TrackingConsent previousConsent, TrackingConsent newConsent) {
        previousConsent.getClass();
        newConsent.getClass();
        ConcurrencyExtKt.submitSafe(this.executorService, "Data migration", this.internalLogger, new n4(0, previousConsent, newConsent, this));
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public BatchData readNextBatch() {
        PersistenceStrategy.Batch batchLockAndReadNext = getGrantedPersistenceStrategy().lockAndReadNext();
        if (batchLockAndReadNext != null) {
            return new BatchData(new BatchId(batchLockAndReadNext.getBatchId()), batchLockAndReadNext.getEvents(), batchLockAndReadNext.getMetadata());
        }
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public void writeCurrentBatch(DatadogContext datadogContext, boolean forceNewBatch, Function1<? super EventBatchWriter, j6g> callback) {
        datadogContext.getClass();
        callback.getClass();
        ConcurrencyExtKt.submitSafe(this.executorService, "Data write", this.internalLogger, new o4(0, this, callback));
    }
}
