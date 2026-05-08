package com.datadog.android.trace;

import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.trace.internal.FeatureSdkCoreExtKt;
import com.datadog.android.trace.internal.TracingFeature;
import com.datadog.android.trace.internal.data.NoOpWriter;
import com.datadog.android.trace.internal.handlers.AndroidSpanLogsHandler;
import com.datadog.android.trace.internal.utils.SpanContextExtKt;
import defpackage.doe;
import defpackage.eoe;
import defpackage.g39;
import defpackage.gu5;
import defpackage.h5h;
import defpackage.kc9;
import defpackage.l5;
import defpackage.sy3;
import defpackage.uc3;
import defpackage.un2;
import defpackage.ut0;
import defpackage.wpd;
import defpackage.z92;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00060\u0010R\u00020\u0001*\u00060\u0010R\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00060\u0010R\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/datadog/android/trace/AndroidTracer;", "Luc3;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lun2;", "config", "Lh5h;", "writer", "Ljava/util/Random;", "random", "Lg39;", "logsHandler", "", "bundleWithRum", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lun2;Lh5h;Ljava/util/Random;Lg39;Z)V", "Luc3$b;", "withRumContext", "(Luc3$b;)Luc3$b;", "", "operationName", "buildSpan", "(Ljava/lang/String;)Luc3$b;", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lg39;", "Z", "Companion", "Builder", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class AndroidTracer extends uc3 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_PARTIAL_MIN_FLUSH = 5;
    public static final double DEFAULT_SAMPLE_RATE = 100.0d;
    public static final String DEFAULT_SERVICE_NAME_IS_MISSING_ERROR_MESSAGE = "Default service name is missing during AndroidTracer.Builder creation, did you initialize SDK?";
    public static final String RUM_NOT_ENABLED_ERROR_MESSAGE = "You're trying to bundle the traces with a RUM context, but the RUM feature was not registered/initialized. No RUM context will be attached to your traces in this case.";
    public static final int SPAN_ID_BIT_SIZE = 63;
    public static final String TRACING_NOT_ENABLED_ERROR_MESSAGE = "You're trying to create an AndroidTracer instance, but either the SDK was not initialized or the Tracing feature was not registered/initialized. No tracing data will be sent.";
    private final boolean bundleWithRum;
    private final g39 logsHandler;
    private final FeatureSdkCore sdkCore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTracer(FeatureSdkCore featureSdkCore, un2 un2Var, h5h h5hVar, Random random, g39 g39Var, boolean z) {
        super(un2Var, h5hVar, random);
        featureSdkCore.getClass();
        un2Var.getClass();
        h5hVar.getClass();
        random.getClass();
        g39Var.getClass();
        this.sdkCore = featureSdkCore;
        this.logsHandler = g39Var;
        this.bundleWithRum = z;
        addScopeListener(new wpd() { // from class: com.datadog.android.trace.AndroidTracer.1
            @Override // defpackage.wpd
            public void afterScopeActivated() {
                doe doeVarActiveSpan = AndroidTracer.this.activeSpan();
                eoe eoeVarF = doeVarActiveSpan != null ? doeVarActiveSpan.f() : null;
                if (eoeVarF != null) {
                    String strB = eoeVarF.b();
                    String strTraceIdAsHexString = SpanContextExtKt.traceIdAsHexString(eoeVarF);
                    FeatureSdkCore featureSdkCore2 = AndroidTracer.this.sdkCore;
                    strB.getClass();
                    FeatureSdkCoreExtKt.addActiveTraceToContext(featureSdkCore2, strTraceIdAsHexString, strB);
                }
            }

            @Override // defpackage.wpd
            public void afterScopeClosed() {
                FeatureSdkCoreExtKt.removeActiveTraceFromContext(AndroidTracer.this.sdkCore);
            }
        });
    }

    public static final void logErrorMessage(doe doeVar, String str) {
        INSTANCE.logErrorMessage(doeVar, str);
    }

    public static final void logThrowable(doe doeVar, Throwable th) {
        INSTANCE.logThrowable(doeVar, th);
    }

    private final uc3.b withRumContext(uc3.b bVar) {
        if (this.bundleWithRum) {
            Map<String, Object> featureContext = this.sdkCore.getFeatureContext("rum");
            Object obj = featureContext.get("application_id");
            bVar.b("application_id", obj instanceof String ? (String) obj : null);
            Object obj2 = featureContext.get("session_id");
            bVar.b("session_id", obj2 instanceof String ? (String) obj2 : null);
            Object obj3 = featureContext.get(RumContext.VIEW_ID);
            bVar.b(LogAttributes.RUM_VIEW_ID, obj3 instanceof String ? (String) obj3 : null);
            Object obj4 = featureContext.get(RumContext.ACTION_ID);
            bVar.b(LogAttributes.RUM_ACTION_ID, obj4 instanceof String ? (String) obj4 : null);
        }
        return bVar;
    }

    @Override // defpackage.uc3, defpackage.ppf
    public uc3.b buildSpan(String operationName) {
        operationName.getClass();
        uc3.b bVar = new uc3.b(operationName, scopeManager());
        g39 g39Var = this.logsHandler;
        if (g39Var != null) {
            bVar.h = g39Var;
        }
        InternalLogger internalLogger = this.sdkCore.getInternalLogger();
        if (internalLogger != null) {
            bVar.i = internalLogger;
        }
        return withRumContext(bVar);
    }

    @Override // defpackage.uc3
    public String toString() {
        return l5.l("AndroidTracer/", super.toString());
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/trace/AndroidTracer$Companion;", "", "<init>", "()V", "Ldoe;", "span", "", RumFeature.EVENT_THROWABLE_PROPERTY, "Lj6g;", "logThrowable", "(Ldoe;Ljava/lang/Throwable;)V", "", "message", "logErrorMessage", "(Ldoe;Ljava/lang/String;)V", "", "DEFAULT_PARTIAL_MIN_FLUSH", "I", "", "DEFAULT_SAMPLE_RATE", "D", "DEFAULT_SERVICE_NAME_IS_MISSING_ERROR_MESSAGE", "Ljava/lang/String;", "RUM_NOT_ENABLED_ERROR_MESSAGE", "SPAN_ID_BIT_SIZE", "TRACING_NOT_ENABLED_ERROR_MESSAGE", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void logErrorMessage(doe span, String message) {
            span.getClass();
            message.getClass();
            span.i(kc9.W(new Pair("message", message)));
        }

        public final void logThrowable(doe span, Throwable throwable) {
            span.getClass();
            throwable.getClass();
            span.i(kc9.W(new Pair("error.object", throwable)));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b!\u0010 J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00002\b\b\u0001\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0017\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-J\u000f\u00102\u001a\u00020/H\u0000¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00109R\u001c\u0010:\u001a\u00020\u00158B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010@R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/datadog/android/trace/AndroidTracer$Builder;", "", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lg39;", "logsHandler", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lg39;)V", "Lcom/datadog/android/api/SdkCore;", "(Lcom/datadog/android/api/SdkCore;)V", "Lun2;", "config", "()Lun2;", "Lcom/datadog/android/trace/AndroidTracer;", "build", "()Lcom/datadog/android/trace/AndroidTracer;", "", "Lcom/datadog/android/trace/TracingHeaderType;", "headerTypes", "setTracingHeaderTypes", "(Ljava/util/Set;)Lcom/datadog/android/trace/AndroidTracer$Builder;", "", "service", "setService", "(Ljava/lang/String;)Lcom/datadog/android/trace/AndroidTracer$Builder;", "", "threshold", "setPartialFlushThreshold", "(I)Lcom/datadog/android/trace/AndroidTracer$Builder;", "key", "value", "addGlobalTag", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/trace/AndroidTracer$Builder;", "addTag", "", "enabled", "setBundleWithRumEnabled", "(Z)Lcom/datadog/android/trace/AndroidTracer$Builder;", "", "sampleRate", "setSampleRate", "(D)Lcom/datadog/android/trace/AndroidTracer$Builder;", "Ljava/util/Random;", "random", "withRandom$dd_sdk_android_trace_release", "(Ljava/util/Random;)Lcom/datadog/android/trace/AndroidTracer$Builder;", "withRandom", "Ljava/util/Properties;", "properties$dd_sdk_android_trace_release", "()Ljava/util/Properties;", "properties", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lg39;", "tracingHeaderTypes", "Ljava/util/Set;", "bundleWithRumEnabled", "Z", "D", "serviceName", "Ljava/lang/String;", "getServiceName", "()Ljava/lang/String;", "partialFlushThreshold", "I", "Ljava/util/Random;", "", "globalTags", "Ljava/util/Map;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Builder {
        private boolean bundleWithRumEnabled;
        private final Map<String, String> globalTags;
        private final g39 logsHandler;
        private int partialFlushThreshold;
        private Random random;
        private double sampleRate;
        private final FeatureSdkCore sdkCore;
        private String serviceName;
        private Set<? extends TracingHeaderType> tracingHeaderTypes;

        public Builder(FeatureSdkCore featureSdkCore, g39 g39Var) {
            featureSdkCore.getClass();
            g39Var.getClass();
            this.sdkCore = featureSdkCore;
            this.logsHandler = g39Var;
            this.tracingHeaderTypes = ut0.I0(new TracingHeaderType[]{TracingHeaderType.DATADOG, TracingHeaderType.TRACECONTEXT});
            this.bundleWithRumEnabled = true;
            this.sampleRate = 100.0d;
            this.serviceName = "";
            this.partialFlushThreshold = 5;
            this.random = new SecureRandom();
            this.globalTags = new LinkedHashMap();
        }

        private final un2 config() throws IOException {
            Properties propertiesProperties$dd_sdk_android_trace_release = properties$dd_sdk_android_trace_release();
            un2 un2Var = un2.v0;
            if (propertiesProperties$dd_sdk_android_trace_release != null && !propertiesProperties$dd_sdk_android_trace_release.isEmpty()) {
                un2Var = new un2(propertiesProperties$dd_sdk_android_trace_release, un2Var);
            }
            un2Var.getClass();
            return un2Var;
        }

        private final String getServiceName() {
            String service = this.serviceName;
            if (service.length() == 0) {
                service = this.sdkCore.getService();
                if (service.length() == 0) {
                    InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AndroidTracer$Builder$serviceName$1$1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
                }
            }
            return service;
        }

        @sy3
        public final Builder addGlobalTag(String key, String value) {
            key.getClass();
            value.getClass();
            return addTag(key, value);
        }

        public final Builder addTag(String key, String value) {
            key.getClass();
            value.getClass();
            this.globalTags.put(key, value);
            return this;
        }

        public final AndroidTracer build() throws IOException {
            h5h noOpWriter;
            FeatureScope feature = this.sdkCore.getFeature("tracing");
            TracingFeature tracingFeature = feature != null ? (TracingFeature) feature.unwrap() : null;
            FeatureScope feature2 = this.sdkCore.getFeature("rum");
            if (tracingFeature == null) {
                InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AndroidTracer$Builder$build$1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            }
            if (this.bundleWithRumEnabled && feature2 == null) {
                InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) AndroidTracer$Builder$build$2.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
                this.bundleWithRumEnabled = false;
            }
            FeatureSdkCore featureSdkCore = this.sdkCore;
            un2 un2VarConfig = config();
            if (tracingFeature == null || (noOpWriter = tracingFeature.getLegacyTracerWriter()) == null) {
                noOpWriter = new NoOpWriter();
            }
            return new AndroidTracer(featureSdkCore, un2VarConfig, noOpWriter, this.random, this.logsHandler, this.bundleWithRumEnabled);
        }

        public final Properties properties$dd_sdk_android_trace_release() throws IOException {
            Properties properties = new Properties();
            properties.setProperty("service.name", getServiceName());
            properties.setProperty("trace.partial.flush.min.spans", String.valueOf(this.partialFlushThreshold));
            Map<String, String> map = this.globalTags;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(((Object) entry.getKey()) + ":" + ((Object) entry.getValue()));
            }
            properties.setProperty("tags", z92.W0(arrayList, ",", null, null, null, 62));
            properties.setProperty("trace.sample.rate", String.valueOf(this.sampleRate / 100.0d));
            String strW0 = z92.W0(this.tracingHeaderTypes, ",", null, null, null, 62);
            properties.setProperty("propagation.style.extract", strW0);
            properties.setProperty("propagation.style.inject", strW0);
            return properties;
        }

        public final Builder setBundleWithRumEnabled(boolean enabled) {
            this.bundleWithRumEnabled = enabled;
            return this;
        }

        public final Builder setPartialFlushThreshold(int threshold) {
            this.partialFlushThreshold = threshold;
            return this;
        }

        public final Builder setSampleRate(double sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        public final Builder setService(String service) {
            service.getClass();
            this.serviceName = service;
            return this;
        }

        public final Builder setTracingHeaderTypes(Set<? extends TracingHeaderType> headerTypes) {
            headerTypes.getClass();
            this.tracingHeaderTypes = headerTypes;
            return this;
        }

        public final Builder withRandom$dd_sdk_android_trace_release(Random random) {
            random.getClass();
            this.random = random;
            return this;
        }

        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Builder(SdkCore sdkCore, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Datadog.getInstance$default(null, 1, null) : sdkCore);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(SdkCore sdkCore) {
            sdkCore.getClass();
            FeatureSdkCore featureSdkCore = (FeatureSdkCore) sdkCore;
            this(featureSdkCore, new AndroidSpanLogsHandler(featureSdkCore));
        }
    }
}
