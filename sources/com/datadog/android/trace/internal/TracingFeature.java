package com.datadog.android.trace.internal;

import android.content.Context;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.api.feature.StorageBackedFeature;
import com.datadog.android.api.net.RequestFactory;
import com.datadog.android.api.storage.FeatureStorageConfiguration;
import com.datadog.android.trace.InternalCoreWriterProvider;
import com.datadog.android.trace.event.SpanEventMapper;
import com.datadog.android.trace.internal.data.NoOpCoreTracerWriter;
import com.datadog.android.trace.internal.data.NoOpWriter;
import com.datadog.android.trace.internal.data.OtelTraceWriter;
import com.datadog.android.trace.internal.data.TraceWriter;
import com.datadog.android.trace.internal.domain.event.CoreTracerSpanToSpanEventMapper;
import com.datadog.android.trace.internal.domain.event.DdSpanToSpanEventMapper;
import com.datadog.android.trace.internal.domain.event.SpanEventMapperWrapper;
import com.datadog.android.trace.internal.domain.event.SpanEventSerializer;
import defpackage.d2f;
import defpackage.g5h;
import defpackage.h5h;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010>\u001a\u00020=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/datadog/android/trace/internal/TracingFeature;", "Lcom/datadog/android/trace/InternalCoreWriterProvider;", "Lcom/datadog/android/api/feature/StorageBackedFeature;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "", "customEndpointUrl", "Lcom/datadog/android/trace/event/SpanEventMapper;", "spanEventMapper", "", "networkInfoEnabled", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Ljava/lang/String;Lcom/datadog/android/trace/event/SpanEventMapper;Z)V", "Lh5h;", "createDataWriter", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)Lh5h;", "Lg5h;", "createOtelDataWriter", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)Lg5h;", "Landroid/content/Context;", "appContext", "Lj6g;", "onInitialize", "(Landroid/content/Context;)V", "onStop", "()V", "getCoreTracerWriter", "()Lg5h;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/trace/event/SpanEventMapper;", "getSpanEventMapper$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/event/SpanEventMapper;", "Z", "getNetworkInfoEnabled$dd_sdk_android_trace_release", "()Z", "legacyTracerWriter", "Lh5h;", "getLegacyTracerWriter$dd_sdk_android_trace_release", "()Lh5h;", "setLegacyTracerWriter$dd_sdk_android_trace_release", "(Lh5h;)V", "coreTracerDataWriter", "Lg5h;", "getCoreTracerDataWriter$dd_sdk_android_trace_release", "setCoreTracerDataWriter$dd_sdk_android_trace_release", "(Lg5h;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInitialized$dd_sdk_android_trace_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/datadog/android/api/net/RequestFactory;", "requestFactory$delegate", "Lkotlin/Lazy;", "getRequestFactory", "()Lcom/datadog/android/api/net/RequestFactory;", "requestFactory", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "storageConfiguration", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "getStorageConfiguration", "()Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class TracingFeature implements InternalCoreWriterProvider, StorageBackedFeature {
    public static final String IS_OPENTELEMETRY_ENABLED_CONFIG_KEY = "is_opentelemetry_enabled";
    public static final String OPENTELEMETRY_API_VERSION_CONFIG_KEY = "opentelemetry_api_version";
    private g5h coreTracerDataWriter;
    private final AtomicBoolean initialized;
    private h5h legacyTracerWriter;
    private final String name;
    private final boolean networkInfoEnabled;

    /* JADX INFO: renamed from: requestFactory$delegate, reason: from kotlin metadata */
    private final Lazy requestFactory;
    private final FeatureSdkCore sdkCore;
    private final SpanEventMapper spanEventMapper;
    private final FeatureStorageConfiguration storageConfiguration;

    public TracingFeature(FeatureSdkCore featureSdkCore, String str, SpanEventMapper spanEventMapper, boolean z) {
        featureSdkCore.getClass();
        spanEventMapper.getClass();
        this.sdkCore = featureSdkCore;
        this.spanEventMapper = spanEventMapper;
        this.networkInfoEnabled = z;
        this.legacyTracerWriter = new NoOpWriter();
        this.coreTracerDataWriter = new NoOpCoreTracerWriter();
        this.initialized = new AtomicBoolean(false);
        this.name = "tracing";
        this.requestFactory = new d2f(new TracingFeature$requestFactory$2(str, this));
        this.storageConfiguration = FeatureStorageConfiguration.INSTANCE.getDEFAULT();
    }

    private final h5h createDataWriter(FeatureSdkCore sdkCore) {
        InternalLogger internalLogger = sdkCore.getInternalLogger();
        int i = 2;
        return new TraceWriter(sdkCore, new DdSpanToSpanEventMapper(this.networkInfoEnabled, null, i, 0 == true ? 1 : 0), new SpanEventMapperWrapper(this.spanEventMapper, internalLogger), new SpanEventSerializer(internalLogger, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0), internalLogger);
    }

    private final g5h createOtelDataWriter(FeatureSdkCore sdkCore) {
        InternalLogger internalLogger = sdkCore.getInternalLogger();
        return new OtelTraceWriter(sdkCore, new CoreTracerSpanToSpanEventMapper(this.networkInfoEnabled), new SpanEventMapperWrapper(this.spanEventMapper, internalLogger), new SpanEventSerializer(internalLogger, null, 2, 0 == true ? 1 : 0), internalLogger);
    }

    /* JADX INFO: renamed from: getCoreTracerDataWriter$dd_sdk_android_trace_release, reason: from getter */
    public final g5h getCoreTracerDataWriter() {
        return this.coreTracerDataWriter;
    }

    @Override // com.datadog.android.trace.InternalCoreWriterProvider
    public g5h getCoreTracerWriter() {
        return this.coreTracerDataWriter;
    }

    /* JADX INFO: renamed from: getInitialized$dd_sdk_android_trace_release, reason: from getter */
    public final AtomicBoolean getInitialized() {
        return this.initialized;
    }

    /* JADX INFO: renamed from: getLegacyTracerWriter$dd_sdk_android_trace_release, reason: from getter */
    public final h5h getLegacyTracerWriter() {
        return this.legacyTracerWriter;
    }

    @Override // com.datadog.android.api.feature.Feature
    public String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getNetworkInfoEnabled$dd_sdk_android_trace_release, reason: from getter */
    public final boolean getNetworkInfoEnabled() {
        return this.networkInfoEnabled;
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public RequestFactory getRequestFactory() {
        return (RequestFactory) this.requestFactory.getValue();
    }

    /* JADX INFO: renamed from: getSpanEventMapper$dd_sdk_android_trace_release, reason: from getter */
    public final SpanEventMapper getSpanEventMapper() {
        return this.spanEventMapper;
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public FeatureStorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    @Override // com.datadog.android.api.feature.Feature
    public void onInitialize(Context appContext) {
        appContext.getClass();
        this.legacyTracerWriter = createDataWriter(this.sdkCore);
        this.coreTracerDataWriter = createOtelDataWriter(this.sdkCore);
        this.initialized.set(true);
    }

    @Override // com.datadog.android.api.feature.Feature
    public void onStop() {
        this.legacyTracerWriter = new NoOpWriter();
        this.initialized.set(false);
    }

    public final void setCoreTracerDataWriter$dd_sdk_android_trace_release(g5h g5hVar) {
        g5hVar.getClass();
        this.coreTracerDataWriter = g5hVar;
    }

    public final void setLegacyTracerWriter$dd_sdk_android_trace_release(h5h h5hVar) {
        h5hVar.getClass();
        this.legacyTracerWriter = h5hVar;
    }
}
