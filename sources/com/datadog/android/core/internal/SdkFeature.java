package com.datadog.android.core.internal;

import android.app.Application;
import android.content.Context;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.feature.Feature;
import com.datadog.android.api.feature.FeatureContextUpdateReceiver;
import com.datadog.android.api.feature.FeatureEventReceiver;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.StorageBackedFeature;
import com.datadog.android.api.net.RequestFactory;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.FeatureStorageConfiguration;
import com.datadog.android.api.storage.datastore.DataStoreHandler;
import com.datadog.android.core.configuration.UploadSchedulerStrategy;
import com.datadog.android.core.internal.configuration.DataUploadConfiguration;
import com.datadog.android.core.internal.data.upload.DataFlusher;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.core.internal.data.upload.DataUploadScheduler;
import com.datadog.android.core.internal.data.upload.DataUploader;
import com.datadog.android.core.internal.data.upload.DefaultUploadSchedulerStrategy;
import com.datadog.android.core.internal.data.upload.NoOpDataUploader;
import com.datadog.android.core.internal.data.upload.NoOpUploadScheduler;
import com.datadog.android.core.internal.data.upload.UploadScheduler;
import com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.core.internal.metrics.MetricsDispatcher;
import com.datadog.android.core.internal.metrics.NoOpMetricsDispatcher;
import com.datadog.android.core.internal.persistence.AbstractStorage;
import com.datadog.android.core.internal.persistence.ConsentAwareStorage;
import com.datadog.android.core.internal.persistence.NoOpStorage;
import com.datadog.android.core.internal.persistence.Storage;
import com.datadog.android.core.internal.persistence.datastore.DataStoreFileHandler;
import com.datadog.android.core.internal.persistence.datastore.DataStoreFileHelper;
import com.datadog.android.core.internal.persistence.datastore.DatastoreFileReader;
import com.datadog.android.core.internal.persistence.datastore.DatastoreFileWriter;
import com.datadog.android.core.internal.persistence.datastore.NoOpDataStoreHandler;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.persistence.file.FileOrchestrator;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.datadog.android.core.internal.persistence.file.FileReaderWriter;
import com.datadog.android.core.internal.persistence.file.NoOpFileOrchestrator;
import com.datadog.android.core.internal.persistence.file.advanced.FeatureFileOrchestrator;
import com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter;
import com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader;
import com.datadog.android.core.persistence.PersistenceStrategy;
import com.datadog.android.privacy.TrackingConsentProviderCallback;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.security.Encryption;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u009f\u00012\u00020\u0001:\u0002\u009f\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0015J1\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00112\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$J-\u0010)\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e0&H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b/\u0010-J\u000f\u00102\u001a\u00020\u000eH\u0001¢\u0006\u0004\b1\u0010\u0015J)\u00107\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00106\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b7\u00108J'\u0010?\u001a\u00020\u000e2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J;\u0010D\u001a\u00020C2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010\u0005\u001a\u0002092\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bD\u0010EJ/\u0010H\u001a\u00020C2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010G\u001a\u00020F2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020C2\u0006\u0010%\u001a\u00020\f2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010O\u001a\u00020N2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bO\u0010PJ\u0019\u0010S\u001a\u00020\u000e2\b\u0010R\u001a\u0004\u0018\u00010QH\u0002¢\u0006\u0004\bS\u0010TR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010X\u001a\u0004\bY\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010Z\u001a\u0004\b[\u0010\\R\"\u0010^\u001a\u00020]8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010e\u001a\u00020d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hRD\u0010l\u001a&\u0012\f\u0012\n j*\u0004\u0018\u00010*0* j*\u0012\u0012\f\u0012\n j*\u0004\u0018\u00010*0*\u0018\u00010k0i8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\bl\u0010m\u0012\u0004\bp\u0010\u0015\u001a\u0004\bn\u0010oR \u0010s\u001a\b\u0012\u0004\u0012\u00020r0q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\"\u0010w\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R%\u0010}\u001a\u00020N8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R*\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R,\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001¨\u0006 \u0001"}, d2 = {"Lcom/datadog/android/core/internal/SdkFeature;", "Lcom/datadog/android/api/feature/FeatureScope;", "Lcom/datadog/android/core/internal/CoreFeature;", "coreFeature", "Lcom/datadog/android/api/feature/Feature;", "wrappedFeature", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/core/internal/CoreFeature;Lcom/datadog/android/api/feature/Feature;Lcom/datadog/android/api/InternalLogger;)V", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "", "instanceId", "Lj6g;", "initialize", "(Landroid/content/Context;Ljava/lang/String;)V", "", "isInitialized", "()Z", "clearAllData", "()V", "stop", "forceNewBatch", "Lkotlin/Function2;", "Lcom/datadog/android/api/context/DatadogContext;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "callback", "withWriteContext", "(ZLkotlin/jvm/functions/Function2;)V", "", "event", "sendEvent", "(Ljava/lang/Object;)V", "T", "unwrap", "()Lcom/datadog/android/api/feature/Feature;", "featureName", "", "notifyContextUpdated$dd_sdk_android_core_release", "(Ljava/lang/String;Ljava/util/Map;)V", "notifyContextUpdated", "Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;", "listener", "setContextUpdateListener$dd_sdk_android_core_release", "(Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;)V", "setContextUpdateListener", "removeContextUpdateListener$dd_sdk_android_core_release", "removeContextUpdateListener", "flushStoredData$dd_sdk_android_core_release", "flushStoredData", "Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;", "dataUploadConfiguration", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "filePersistenceConfig", "setupMetricsDispatcher", "(Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;Landroid/content/Context;)V", "Lcom/datadog/android/api/feature/StorageBackedFeature;", "feature", "Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "uploadSchedulerStrategy", "", "maxBatchesPerJob", "setupUploader", "(Lcom/datadog/android/api/feature/StorageBackedFeature;Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;I)V", "Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;", "persistenceStrategyFactory", "Lcom/datadog/android/core/internal/persistence/Storage;", "prepareStorage", "(Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;Lcom/datadog/android/api/feature/StorageBackedFeature;Landroid/content/Context;Ljava/lang/String;Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;)Lcom/datadog/android/core/internal/persistence/Storage;", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "storageConfiguration", "createCustomStorage", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/api/storage/FeatureStorageConfiguration;Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;)Lcom/datadog/android/core/internal/persistence/Storage;", "createFileStorage", "(Ljava/lang/String;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;)Lcom/datadog/android/core/internal/persistence/Storage;", "Lcom/datadog/android/api/net/RequestFactory;", "requestFactory", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "createUploader", "(Lcom/datadog/android/api/net/RequestFactory;)Lcom/datadog/android/core/internal/data/upload/DataUploader;", "Lcom/datadog/android/security/Encryption;", "encryption", "prepareDataStoreHandler", "(Lcom/datadog/android/security/Encryption;)V", "Lcom/datadog/android/core/internal/CoreFeature;", "getCoreFeature$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/CoreFeature;", "Lcom/datadog/android/api/feature/Feature;", "getWrappedFeature$dd_sdk_android_core_release", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "dataStore", "Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "getDataStore", "()Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "setDataStore", "(Lcom/datadog/android/api/storage/datastore/DataStoreHandler;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInitialized$dd_sdk_android_core_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "", "kotlin.jvm.PlatformType", "", "contextUpdateListeners", "Ljava/util/Set;", "getContextUpdateListeners$dd_sdk_android_core_release", "()Ljava/util/Set;", "getContextUpdateListeners$dd_sdk_android_core_release$annotations", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/datadog/android/api/feature/FeatureEventReceiver;", "eventReceiver", "Ljava/util/concurrent/atomic/AtomicReference;", "getEventReceiver$dd_sdk_android_core_release", "()Ljava/util/concurrent/atomic/AtomicReference;", "storage", "Lcom/datadog/android/core/internal/persistence/Storage;", "getStorage$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/Storage;", "setStorage$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/persistence/Storage;)V", "uploader", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "getUploader$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/data/upload/DataUploader;", "setUploader$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/data/upload/DataUploader;)V", "Lcom/datadog/android/core/internal/data/upload/UploadScheduler;", "uploadScheduler", "Lcom/datadog/android/core/internal/data/upload/UploadScheduler;", "getUploadScheduler$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/data/upload/UploadScheduler;", "setUploadScheduler$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/data/upload/UploadScheduler;)V", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "fileOrchestrator", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getFileOrchestrator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "setFileOrchestrator$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;)V", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "metricsDispatcher", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "getMetricsDispatcher$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "setMetricsDispatcher$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;)V", "Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor;", "processLifecycleMonitor", "Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor;", "getProcessLifecycleMonitor$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor;", "setProcessLifecycleMonitor$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor;)V", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class SdkFeature implements FeatureScope {
    public static final String CONTEXT_UPDATE_LISTENER_ALREADY_EXISTS = "Feature \"%s\" already has this listener registered.";
    public static final String NO_EVENT_RECEIVER = "Feature \"%s\" has no event receiver registered, ignoring event.";
    private final Set<FeatureContextUpdateReceiver> contextUpdateListeners;
    private final CoreFeature coreFeature;
    private DataStoreHandler dataStore;
    private final AtomicReference<FeatureEventReceiver> eventReceiver;
    private FileOrchestrator fileOrchestrator;
    private final AtomicBoolean initialized;
    private final InternalLogger internalLogger;
    private MetricsDispatcher metricsDispatcher;
    private ProcessLifecycleMonitor processLifecycleMonitor;
    private Storage storage;
    private UploadScheduler uploadScheduler;
    private DataUploader uploader;
    private final Feature wrappedFeature;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.SdkFeature$sendEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, SdkFeature.NO_EVENT_RECEIVER, Arrays.copyOf(new Object[]{SdkFeature.this.getWrappedFeature().getName()}, 1));
        }
    }

    public SdkFeature(CoreFeature coreFeature, Feature feature, InternalLogger internalLogger) {
        coreFeature.getClass();
        feature.getClass();
        internalLogger.getClass();
        this.coreFeature = coreFeature;
        this.wrappedFeature = feature;
        this.internalLogger = internalLogger;
        this.dataStore = new NoOpDataStoreHandler();
        this.initialized = new AtomicBoolean(false);
        this.contextUpdateListeners = Collections.newSetFromMap(new ConcurrentHashMap());
        this.eventReceiver = new AtomicReference<>(null);
        this.storage = new NoOpStorage();
        this.uploader = new NoOpDataUploader();
        this.uploadScheduler = new NoOpUploadScheduler();
        this.fileOrchestrator = new NoOpFileOrchestrator();
        this.metricsDispatcher = new NoOpMetricsDispatcher();
    }

    private final Storage createCustomStorage(String instanceId, String featureName, FeatureStorageConfiguration storageConfiguration, PersistenceStrategy.Factory persistenceStrategyFactory) {
        return new AbstractStorage(instanceId, featureName, persistenceStrategyFactory, this.coreFeature.getPersistenceExecutorService$dd_sdk_android_core_release(), this.internalLogger, storageConfiguration, this.coreFeature.getTrackingConsentProvider());
    }

    private final Storage createFileStorage(String featureName, FilePersistenceConfig filePersistenceConfig) {
        FeatureFileOrchestrator featureFileOrchestrator = new FeatureFileOrchestrator(this.coreFeature.getTrackingConsentProvider(), this.coreFeature.getStorageDir$dd_sdk_android_core_release(), featureName, this.coreFeature.getPersistenceExecutorService$dd_sdk_android_core_release(), filePersistenceConfig, this.internalLogger, this.metricsDispatcher);
        this.fileOrchestrator = featureFileOrchestrator;
        return new ConsentAwareStorage(this.coreFeature.getPersistenceExecutorService$dd_sdk_android_core_release(), featureFileOrchestrator.getGrantedOrchestrator(), featureFileOrchestrator.getPendingOrchestrator(), BatchFileReaderWriter.INSTANCE.create(this.internalLogger, this.coreFeature.getLocalDataEncryption()), FileReaderWriter.INSTANCE.create(this.internalLogger, this.coreFeature.getLocalDataEncryption()), new FileMover(this.internalLogger), this.internalLogger, filePersistenceConfig, this.metricsDispatcher, this.coreFeature.getTrackingConsentProvider(), featureName);
    }

    private final DataUploader createUploader(RequestFactory requestFactory) {
        return new DataOkHttpUploader(requestFactory, this.internalLogger, this.coreFeature.getOkHttpClient$dd_sdk_android_core_release(), this.coreFeature.getSdkVersion(), this.coreFeature.getAndroidInfoProvider$dd_sdk_android_core_release());
    }

    public static /* synthetic */ void getContextUpdateListeners$dd_sdk_android_core_release$annotations() {
    }

    private final void prepareDataStoreHandler(Encryption encryption) {
        FileReaderWriter fileReaderWriterCreate = FileReaderWriter.INSTANCE.create(this.internalLogger, encryption);
        DataStoreFileHelper dataStoreFileHelper = new DataStoreFileHelper(this.internalLogger);
        String name = this.wrappedFeature.getName();
        File storageDir$dd_sdk_android_core_release = this.coreFeature.getStorageDir$dd_sdk_android_core_release();
        setDataStore(new DataStoreFileHandler(this.coreFeature.getPersistenceExecutorService$dd_sdk_android_core_release(), this.internalLogger, new DatastoreFileReader(dataStoreFileHelper, name, storageDir$dd_sdk_android_core_release, this.internalLogger, new TLVBlockFileReader(this.internalLogger, fileReaderWriterCreate)), new DatastoreFileWriter(dataStoreFileHelper, name, storageDir$dd_sdk_android_core_release, this.internalLogger, fileReaderWriterCreate)));
    }

    private final Storage prepareStorage(DataUploadConfiguration dataUploadConfiguration, StorageBackedFeature wrappedFeature, Context context, String instanceId, PersistenceStrategy.Factory persistenceStrategyFactory) {
        FeatureStorageConfiguration storageConfiguration = wrappedFeature.getStorageConfiguration();
        if (persistenceStrategyFactory != null) {
            return createCustomStorage(instanceId, wrappedFeature.getName(), storageConfiguration, persistenceStrategyFactory);
        }
        long windowDurationMs = this.coreFeature.getBatchSize().getWindowDurationMs();
        FilePersistenceConfig filePersistenceConfigBuildFilePersistenceConfig = this.coreFeature.buildFilePersistenceConfig();
        FilePersistenceConfig filePersistenceConfigCopy = filePersistenceConfigBuildFilePersistenceConfig.copy((96 & 1) != 0 ? filePersistenceConfigBuildFilePersistenceConfig.recentDelayMs : windowDurationMs, (96 & 2) != 0 ? filePersistenceConfigBuildFilePersistenceConfig.maxBatchSize : storageConfiguration.getMaxBatchSize(), (96 & 4) != 0 ? filePersistenceConfigBuildFilePersistenceConfig.maxItemSize : storageConfiguration.getMaxItemSize(), (96 & 8) != 0 ? filePersistenceConfigBuildFilePersistenceConfig.maxItemsPerBatch : storageConfiguration.getMaxItemsPerBatch(), (96 & 16) != 0 ? filePersistenceConfigBuildFilePersistenceConfig.oldFileThreshold : storageConfiguration.getOldBatchThreshold(), (96 & 32) != 0 ? filePersistenceConfigBuildFilePersistenceConfig.maxDiskSpace : 0L, (96 & 64) != 0 ? filePersistenceConfigBuildFilePersistenceConfig.cleanupFrequencyThreshold : 0L);
        setupMetricsDispatcher(dataUploadConfiguration, filePersistenceConfigCopy, context);
        return createFileStorage(wrappedFeature.getName(), filePersistenceConfigCopy);
    }

    private final void setupMetricsDispatcher(DataUploadConfiguration dataUploadConfiguration, FilePersistenceConfig filePersistenceConfig, Context context) {
        BatchMetricsDispatcher batchMetricsDispatcher = new BatchMetricsDispatcher(this.wrappedFeature.getName(), dataUploadConfiguration, filePersistenceConfig, this.internalLogger, this.coreFeature.getTimeProvider());
        if (context instanceof Application) {
            ProcessLifecycleMonitor processLifecycleMonitor = new ProcessLifecycleMonitor(batchMetricsDispatcher);
            this.processLifecycleMonitor = processLifecycleMonitor;
            ((Application) context).registerActivityLifecycleCallbacks(processLifecycleMonitor);
        }
        this.metricsDispatcher = batchMetricsDispatcher;
    }

    private final void setupUploader(StorageBackedFeature feature, UploadSchedulerStrategy uploadSchedulerStrategy, int maxBatchesPerJob) {
        UploadScheduler noOpUploadScheduler;
        if (this.coreFeature.getIsMainProcess()) {
            this.uploader = createUploader(feature.getRequestFactory());
            noOpUploadScheduler = new DataUploadScheduler(feature.getName(), this.storage, this.uploader, this.coreFeature.getContextProvider(), this.coreFeature.getNetworkInfoProvider(), this.coreFeature.getSystemInfoProvider(), uploadSchedulerStrategy, maxBatchesPerJob, this.coreFeature.getUploadExecutorService$dd_sdk_android_core_release(), this.internalLogger);
        } else {
            noOpUploadScheduler = new NoOpUploadScheduler();
        }
        this.uploadScheduler = noOpUploadScheduler;
    }

    public final void clearAllData() {
        this.storage.dropAll();
        getDataStore().clearAllData();
    }

    public final void flushStoredData$dd_sdk_android_core_release() {
        new DataFlusher(this.coreFeature.getContextProvider(), this.fileOrchestrator, BatchFileReaderWriter.INSTANCE.create(this.internalLogger, this.coreFeature.getLocalDataEncryption()), FileReaderWriter.INSTANCE.create(this.internalLogger, this.coreFeature.getLocalDataEncryption()), new FileMover(this.internalLogger), this.internalLogger).flush(this.uploader);
    }

    public final Set<FeatureContextUpdateReceiver> getContextUpdateListeners$dd_sdk_android_core_release() {
        return this.contextUpdateListeners;
    }

    /* JADX INFO: renamed from: getCoreFeature$dd_sdk_android_core_release, reason: from getter */
    public final CoreFeature getCoreFeature() {
        return this.coreFeature;
    }

    @Override // com.datadog.android.api.feature.FeatureScope
    public DataStoreHandler getDataStore() {
        return this.dataStore;
    }

    public final AtomicReference<FeatureEventReceiver> getEventReceiver$dd_sdk_android_core_release() {
        return this.eventReceiver;
    }

    /* JADX INFO: renamed from: getFileOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final FileOrchestrator getFileOrchestrator() {
        return this.fileOrchestrator;
    }

    /* JADX INFO: renamed from: getInitialized$dd_sdk_android_core_release, reason: from getter */
    public final AtomicBoolean getInitialized() {
        return this.initialized;
    }

    /* JADX INFO: renamed from: getInternalLogger$dd_sdk_android_core_release, reason: from getter */
    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    /* JADX INFO: renamed from: getMetricsDispatcher$dd_sdk_android_core_release, reason: from getter */
    public final MetricsDispatcher getMetricsDispatcher() {
        return this.metricsDispatcher;
    }

    /* JADX INFO: renamed from: getProcessLifecycleMonitor$dd_sdk_android_core_release, reason: from getter */
    public final ProcessLifecycleMonitor getProcessLifecycleMonitor() {
        return this.processLifecycleMonitor;
    }

    /* JADX INFO: renamed from: getStorage$dd_sdk_android_core_release, reason: from getter */
    public final Storage getStorage() {
        return this.storage;
    }

    /* JADX INFO: renamed from: getUploadScheduler$dd_sdk_android_core_release, reason: from getter */
    public final UploadScheduler getUploadScheduler() {
        return this.uploadScheduler;
    }

    /* JADX INFO: renamed from: getUploader$dd_sdk_android_core_release, reason: from getter */
    public final DataUploader getUploader() {
        return this.uploader;
    }

    /* JADX INFO: renamed from: getWrappedFeature$dd_sdk_android_core_release, reason: from getter */
    public final Feature getWrappedFeature() {
        return this.wrappedFeature;
    }

    public final void initialize(Context context, String instanceId) {
        SdkFeature sdkFeature;
        context.getClass();
        instanceId.getClass();
        if (this.initialized.get()) {
            return;
        }
        Feature feature = this.wrappedFeature;
        if (feature instanceof StorageBackedFeature) {
            DataUploadConfiguration dataUploadConfiguration = new DataUploadConfiguration(this.coreFeature.getUploadFrequency(), this.coreFeature.getBatchProcessingLevel().getMaxBatchesPerUploadJob());
            UploadSchedulerStrategy customUploadSchedulerStrategy = this.coreFeature.getCustomUploadSchedulerStrategy();
            if (customUploadSchedulerStrategy == null) {
                customUploadSchedulerStrategy = new DefaultUploadSchedulerStrategy(dataUploadConfiguration);
            }
            sdkFeature = this;
            sdkFeature.storage = sdkFeature.prepareStorage(dataUploadConfiguration, (StorageBackedFeature) this.wrappedFeature, context, instanceId, this.coreFeature.getPersistenceStrategyFactory());
            sdkFeature.wrappedFeature.onInitialize(context);
            sdkFeature.setupUploader((StorageBackedFeature) sdkFeature.wrappedFeature, customUploadSchedulerStrategy, dataUploadConfiguration.getMaxBatchesPerUploadJob$dd_sdk_android_core_release());
        } else {
            sdkFeature = this;
            feature.onInitialize(context);
        }
        if (sdkFeature.wrappedFeature instanceof TrackingConsentProviderCallback) {
            sdkFeature.coreFeature.getTrackingConsentProvider().registerCallback((TrackingConsentProviderCallback) sdkFeature.wrappedFeature);
        }
        sdkFeature.prepareDataStoreHandler(sdkFeature.coreFeature.getLocalDataEncryption());
        sdkFeature.initialized.set(true);
        sdkFeature.uploadScheduler.startScheduling();
    }

    public final boolean isInitialized() {
        return this.initialized.get();
    }

    public final void notifyContextUpdated$dd_sdk_android_core_release(String featureName, Map<String, ? extends Object> context) {
        featureName.getClass();
        context.getClass();
        Set<FeatureContextUpdateReceiver> set = this.contextUpdateListeners;
        set.getClass();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            ((FeatureContextUpdateReceiver) it.next()).onContextUpdate(featureName, context);
        }
    }

    public final void removeContextUpdateListener$dd_sdk_android_core_release(FeatureContextUpdateReceiver listener) {
        listener.getClass();
        Set<FeatureContextUpdateReceiver> set = this.contextUpdateListeners;
        set.getClass();
        synchronized (set) {
            this.contextUpdateListeners.remove(listener);
        }
    }

    @Override // com.datadog.android.api.feature.FeatureScope
    public void sendEvent(Object event) {
        event.getClass();
        FeatureEventReceiver featureEventReceiver = this.eventReceiver.get();
        if (featureEventReceiver == null) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) new AnonymousClass1(), (Throwable) null, false, (Map) null, 56, (Object) null);
        } else {
            featureEventReceiver.onReceive(event);
        }
    }

    public final void setContextUpdateListener$dd_sdk_android_core_release(FeatureContextUpdateReceiver listener) {
        listener.getClass();
        Set<FeatureContextUpdateReceiver> set = this.contextUpdateListeners;
        set.getClass();
        synchronized (set) {
            try {
                if (this.contextUpdateListeners.contains(listener)) {
                    InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new SdkFeature$setContextUpdateListener$1$1(this), (Throwable) null, false, (Map) null, 56, (Object) null);
                }
                this.contextUpdateListeners.add(listener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setDataStore(DataStoreHandler dataStoreHandler) {
        dataStoreHandler.getClass();
        this.dataStore = dataStoreHandler;
    }

    public final void setFileOrchestrator$dd_sdk_android_core_release(FileOrchestrator fileOrchestrator) {
        fileOrchestrator.getClass();
        this.fileOrchestrator = fileOrchestrator;
    }

    public final void setMetricsDispatcher$dd_sdk_android_core_release(MetricsDispatcher metricsDispatcher) {
        metricsDispatcher.getClass();
        this.metricsDispatcher = metricsDispatcher;
    }

    public final void setProcessLifecycleMonitor$dd_sdk_android_core_release(ProcessLifecycleMonitor processLifecycleMonitor) {
        this.processLifecycleMonitor = processLifecycleMonitor;
    }

    public final void setStorage$dd_sdk_android_core_release(Storage storage) {
        storage.getClass();
        this.storage = storage;
    }

    public final void setUploadScheduler$dd_sdk_android_core_release(UploadScheduler uploadScheduler) {
        uploadScheduler.getClass();
        this.uploadScheduler = uploadScheduler;
    }

    public final void setUploader$dd_sdk_android_core_release(DataUploader dataUploader) {
        dataUploader.getClass();
        this.uploader = dataUploader;
    }

    public final void stop() {
        if (this.initialized.get()) {
            this.wrappedFeature.onStop();
            if (this.wrappedFeature instanceof TrackingConsentProviderCallback) {
                this.coreFeature.getTrackingConsentProvider().unregisterCallback((TrackingConsentProviderCallback) this.wrappedFeature);
            }
            this.uploadScheduler.stopScheduling();
            this.uploadScheduler = new NoOpUploadScheduler();
            this.storage = new NoOpStorage();
            setDataStore(new NoOpDataStoreHandler());
            this.uploader = new NoOpDataUploader();
            this.fileOrchestrator = new NoOpFileOrchestrator();
            this.metricsDispatcher = new NoOpMetricsDispatcher();
            Context context = this.coreFeature.getContextRef$dd_sdk_android_core_release().get();
            Application application = context instanceof Application ? (Application) context : null;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.processLifecycleMonitor);
            }
            this.processLifecycleMonitor = null;
            this.initialized.set(false);
        }
    }

    @Override // com.datadog.android.api.feature.FeatureScope
    public <T extends Feature> T unwrap() {
        T t = (T) this.wrappedFeature;
        t.getClass();
        return t;
    }

    @Override // com.datadog.android.api.feature.FeatureScope
    public void withWriteContext(boolean forceNewBatch, Function2<? super DatadogContext, ? super EventBatchWriter, j6g> callback) {
        callback.getClass();
        ContextProvider contextProvider = this.coreFeature.getContextProvider();
        if (contextProvider instanceof NoOpContextProvider) {
            return;
        }
        DatadogContext context = contextProvider.getContext();
        this.storage.writeCurrentBatch(context, forceNewBatch, new C05121(callback, context));
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.SdkFeature$withWriteContext$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/api/storage/EventBatchWriter;", "it", "Lj6g;", "invoke", "(Lcom/datadog/android/api/storage/EventBatchWriter;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C05121 extends mj8 implements Function1<EventBatchWriter, j6g> {
        final /* synthetic */ Function2<DatadogContext, EventBatchWriter, j6g> $callback;
        final /* synthetic */ DatadogContext $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05121(Function2<? super DatadogContext, ? super EventBatchWriter, j6g> function2, DatadogContext datadogContext) {
            super(1);
            this.$callback = function2;
            this.$context = datadogContext;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EventBatchWriter eventBatchWriter) {
            eventBatchWriter.getClass();
            this.$callback.invoke(this.$context, eventBatchWriter);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(EventBatchWriter eventBatchWriter) {
            invoke2(eventBatchWriter);
            return j6g.a;
        }
    }
}
