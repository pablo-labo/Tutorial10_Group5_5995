package com.datadog.android.log.internal;

import android.content.Context;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.api.feature.FeatureEventReceiver;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.api.feature.StorageBackedFeature;
import com.datadog.android.api.net.RequestFactory;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.api.storage.FeatureStorageConfiguration;
import com.datadog.android.api.storage.NoOpDataWriter;
import com.datadog.android.core.feature.event.JvmCrash;
import com.datadog.android.core.internal.utils.MapUtilsKt;
import com.datadog.android.event.EventMapper;
import com.datadog.android.event.MapperSerializer;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.log.internal.domain.LogGenerator;
import com.datadog.android.log.internal.domain.event.LogEventMapperWrapper;
import com.datadog.android.log.internal.domain.event.LogEventSerializer;
import com.datadog.android.log.internal.storage.LogsDataWriter;
import com.datadog.android.log.model.LogEvent;
import defpackage.d2f;
import defpackage.gu5;
import defpackage.is4;
import defpackage.j6g;
import defpackage.kc9;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.wl7;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0001UB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u000e\u0010\u0015\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00112\u000e\u0010\u0015\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J!\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0014H\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u001aH\u0017¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R(\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00109\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\"\u0010=\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010 R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001a0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\bH\u0010>\u001a\u0004\bI\u0010@R\u001b\u0010O\u001a\u00020J8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010Q\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T¨\u0006V"}, d2 = {"Lcom/datadog/android/log/internal/LogsFeature;", "Lcom/datadog/android/api/feature/StorageBackedFeature;", "Lcom/datadog/android/api/feature/FeatureEventReceiver;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "", "customEndpointUrl", "Lcom/datadog/android/event/EventMapper;", "Lcom/datadog/android/log/model/LogEvent;", "eventMapper", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Ljava/lang/String;Lcom/datadog/android/event/EventMapper;)V", "Lcom/datadog/android/api/storage/DataWriter;", "createDataWriter", "(Lcom/datadog/android/event/EventMapper;)Lcom/datadog/android/api/storage/DataWriter;", "Lcom/datadog/android/core/feature/event/JvmCrash$Logs;", "jvmCrash", "Lj6g;", "sendJvmCrashLog", "(Lcom/datadog/android/core/feature/event/JvmCrash$Logs;)V", "", "data", "sendNdkCrashLog", "(Ljava/util/Map;)V", "sendSpanLog", "key", "", "value", "addAttribute$dd_sdk_android_logs_release", "(Ljava/lang/String;Ljava/lang/Object;)V", "addAttribute", "removeAttribute$dd_sdk_android_logs_release", "(Ljava/lang/String;)V", "removeAttribute", "getAttributes$dd_sdk_android_logs_release", "()Ljava/util/Map;", "getAttributes", "Landroid/content/Context;", "appContext", "onInitialize", "(Landroid/content/Context;)V", "onStop", "()V", "event", "onReceive", "(Ljava/lang/Object;)V", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/event/EventMapper;", "getEventMapper$dd_sdk_android_logs_release", "()Lcom/datadog/android/event/EventMapper;", "dataWriter", "Lcom/datadog/android/api/storage/DataWriter;", "getDataWriter$dd_sdk_android_logs_release", "()Lcom/datadog/android/api/storage/DataWriter;", "setDataWriter$dd_sdk_android_logs_release", "(Lcom/datadog/android/api/storage/DataWriter;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInitialized$dd_sdk_android_logs_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "packageName", "Ljava/lang/String;", "getPackageName$dd_sdk_android_logs_release", "()Ljava/lang/String;", "setPackageName$dd_sdk_android_logs_release", "Lcom/datadog/android/log/internal/domain/DatadogLogGenerator;", "logGenerator", "Lcom/datadog/android/log/internal/domain/DatadogLogGenerator;", "Ljava/util/concurrent/ConcurrentHashMap;", "attributes", "Ljava/util/concurrent/ConcurrentHashMap;", "name", "getName", "Lcom/datadog/android/api/net/RequestFactory;", "requestFactory$delegate", "Lkotlin/Lazy;", "getRequestFactory", "()Lcom/datadog/android/api/net/RequestFactory;", "requestFactory", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "storageConfiguration", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "getStorageConfiguration", "()Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "Companion", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class LogsFeature implements StorageBackedFeature, FeatureEventReceiver {
    private static final String ATTRIBUTES_EVENT_KEY = "attributes";
    private static final String LOGGER_NAME_EVENT_KEY = "loggerName";
    public static final long MAX_WRITE_WAIT_TIMEOUT_MS = 500;
    private static final String MESSAGE_EVENT_KEY = "message";
    public static final String NDK_CRASH_EVENT_MISSING_MANDATORY_FIELDS_WARNING = "Logs feature received a NDK crash event where one or more mandatory (loggerName, message, timestamp, attributes) fields are either missing or have wrong type.";
    private static final String NETWORK_INFO_EVENT_KEY = "networkInfo";
    public static final String SPAN_LOG_EVENT_MISSING_MANDATORY_FIELDS_WARNING = "Logs feature received a Span log event where one or more mandatory (loggerName, message, timestamp, attributes) fields are either missing or have wrong type.";
    private static final String TIMESTAMP_EVENT_KEY = "timestamp";
    private static final String TYPE_EVENT_KEY = "type";
    public static final String UNKNOWN_EVENT_TYPE_PROPERTY_VALUE = "Logs feature received an event with unknown value of \"type\" property=%s.";
    public static final String UNSUPPORTED_EVENT_TYPE = "Logs feature receive an event of unsupported type=%s.";
    private static final String USER_INFO_EVENT_KEY = "userInfo";
    private final ConcurrentHashMap<String, Object> attributes;
    private DataWriter<LogEvent> dataWriter;
    private final EventMapper<LogEvent> eventMapper;
    private final AtomicBoolean initialized;
    private final DatadogLogGenerator logGenerator;
    private final String name;
    private String packageName;

    /* JADX INFO: renamed from: requestFactory$delegate, reason: from kotlin metadata */
    private final Lazy requestFactory;
    private final FeatureSdkCore sdkCore;
    private final FeatureStorageConfiguration storageConfiguration;

    /* JADX INFO: renamed from: com.datadog.android.log.internal.LogsFeature$onReceive$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ Object $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj) {
            super(0);
            this.$event = obj;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, LogsFeature.UNSUPPORTED_EVENT_TYPE, Arrays.copyOf(new Object[]{this.$event.getClass().getCanonicalName()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.log.internal.LogsFeature$onReceive$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        final /* synthetic */ Object $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object obj) {
            super(0);
            this.$event = obj;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, LogsFeature.UNKNOWN_EVENT_TYPE_PROPERTY_VALUE, Arrays.copyOf(new Object[]{((Map) this.$event).get("type")}, 1));
        }
    }

    public LogsFeature(FeatureSdkCore featureSdkCore, String str, EventMapper<LogEvent> eventMapper) {
        featureSdkCore.getClass();
        eventMapper.getClass();
        this.sdkCore = featureSdkCore;
        this.eventMapper = eventMapper;
        this.dataWriter = new NoOpDataWriter();
        this.initialized = new AtomicBoolean(false);
        this.packageName = "";
        this.logGenerator = new DatadogLogGenerator(null, 1, 0 == true ? 1 : 0);
        this.attributes = new ConcurrentHashMap<>();
        this.name = "logs";
        this.requestFactory = new d2f(new LogsFeature$requestFactory$2(str, this));
        this.storageConfiguration = FeatureStorageConfiguration.INSTANCE.getDEFAULT();
    }

    private final DataWriter<LogEvent> createDataWriter(EventMapper<LogEvent> eventMapper) {
        return new LogsDataWriter(new MapperSerializer(new LogEventMapperWrapper(eventMapper, this.sdkCore.getInternalLogger()), new LogEventSerializer(this.sdkCore.getInternalLogger(), null, 2, 0 == true ? 1 : 0)), this.sdkCore.getInternalLogger());
    }

    private final void sendJvmCrashLog(JvmCrash.Logs jvmCrash) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Map<String, Object> attributes$dd_sdk_android_logs_release = getAttributes$dd_sdk_android_logs_release();
        FeatureScope feature = this.sdkCore.getFeature(getName());
        if (feature != null) {
            FeatureScope.DefaultImpls.withWriteContext$default(feature, false, new C05611(jvmCrash, attributes$dd_sdk_android_logs_release, countDownLatch), 1, null);
        }
        try {
            countDownLatch.await(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) C05622.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
        }
    }

    private final void sendNdkCrashLog(Map<?, ?> data) {
        LinkedHashMap linkedHashMap;
        Object obj = data.get("timestamp");
        Long l = obj instanceof Long ? (Long) obj : null;
        Object obj2 = data.get("message");
        String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = data.get(LOGGER_NAME_EVENT_KEY);
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = data.get("attributes");
        Map map = obj4 instanceof Map ? (Map) obj4 : null;
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() instanceof String) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(kc9.V(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                Object key = entry2.getKey();
                key.getClass();
                linkedHashMap3.put((String) key, entry2.getValue());
            }
            linkedHashMap = linkedHashMap3;
        } else {
            linkedHashMap = null;
        }
        Object obj5 = data.get(NETWORK_INFO_EVENT_KEY);
        NetworkInfo networkInfo = obj5 instanceof NetworkInfo ? (NetworkInfo) obj5 : null;
        Object obj6 = data.get(USER_INFO_EVENT_KEY);
        UserInfo userInfo = obj6 instanceof UserInfo ? (UserInfo) obj6 : null;
        if (str2 == null || str == null || l == null || linkedHashMap == null) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) C05631.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        FeatureScope feature = this.sdkCore.getFeature(getName());
        if (feature != null) {
            FeatureScope.DefaultImpls.withWriteContext$default(feature, false, new C05642(str, linkedHashMap, l, str2, userInfo, networkInfo), 1, null);
        }
    }

    private final void sendSpanLog(Map<?, ?> data) {
        LinkedHashMap linkedHashMap;
        Object obj = data.get("timestamp");
        Long l = obj instanceof Long ? (Long) obj : null;
        Object obj2 = data.get("message");
        String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = data.get(LOGGER_NAME_EVENT_KEY);
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = data.get("attributes");
        Map map = obj4 instanceof Map ? (Map) obj4 : null;
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() instanceof String) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(kc9.V(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                Object key = entry2.getKey();
                key.getClass();
                linkedHashMap3.put((String) key, entry2.getValue());
            }
            linkedHashMap = linkedHashMap3;
        } else {
            linkedHashMap = null;
        }
        if (str2 == null || str == null || linkedHashMap == null || l == null) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) C05651.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        FeatureScope feature = this.sdkCore.getFeature(getName());
        if (feature != null) {
            FeatureScope.DefaultImpls.withWriteContext$default(feature, false, new C05662(str, linkedHashMap, l, str2), 1, null);
        }
    }

    public final void addAttribute$dd_sdk_android_logs_release(String key, Object value) {
        key.getClass();
        ConcurrentHashMap<String, Object> concurrentHashMap = this.attributes;
        if (value == null) {
            concurrentHashMap.put(key, MapUtilsKt.getNULL_MAP_VALUE());
        } else {
            concurrentHashMap.put(key, value);
        }
    }

    public final Map<String, Object> getAttributes$dd_sdk_android_logs_release() {
        return lc9.g0(this.attributes);
    }

    public final DataWriter<LogEvent> getDataWriter$dd_sdk_android_logs_release() {
        return this.dataWriter;
    }

    public final EventMapper<LogEvent> getEventMapper$dd_sdk_android_logs_release() {
        return this.eventMapper;
    }

    /* JADX INFO: renamed from: getInitialized$dd_sdk_android_logs_release, reason: from getter */
    public final AtomicBoolean getInitialized() {
        return this.initialized;
    }

    @Override // com.datadog.android.api.feature.Feature
    public String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getPackageName$dd_sdk_android_logs_release, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public RequestFactory getRequestFactory() {
        return (RequestFactory) this.requestFactory.getValue();
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public FeatureStorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    @Override // com.datadog.android.api.feature.Feature
    public void onInitialize(Context appContext) {
        appContext.getClass();
        this.sdkCore.setEventReceiver(getName(), this);
        String packageName = appContext.getPackageName();
        packageName.getClass();
        this.packageName = packageName;
        this.dataWriter = createDataWriter(this.eventMapper);
        this.initialized.set(true);
    }

    @Override // com.datadog.android.api.feature.FeatureEventReceiver
    public void onReceive(Object event) {
        event.getClass();
        if (event instanceof JvmCrash.Logs) {
            sendJvmCrashLog((JvmCrash.Logs) event);
            return;
        }
        if (!(event instanceof Map)) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new AnonymousClass1(event), (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        Map<?, ?> map = (Map) event;
        if (wl7.b(map.get("type"), "ndk_crash")) {
            sendNdkCrashLog(map);
        } else if (wl7.b(map.get("type"), "span_log")) {
            sendSpanLog(map);
        } else {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new AnonymousClass2(event), (Throwable) null, false, (Map) null, 56, (Object) null);
        }
    }

    @Override // com.datadog.android.api.feature.Feature
    public void onStop() {
        this.sdkCore.removeEventReceiver(getName());
        this.dataWriter = new NoOpDataWriter();
        this.packageName = "";
        this.initialized.set(false);
        this.attributes.clear();
    }

    public final void removeAttribute$dd_sdk_android_logs_release(String key) {
        key.getClass();
        this.attributes.remove(key);
    }

    public final void setDataWriter$dd_sdk_android_logs_release(DataWriter<LogEvent> dataWriter) {
        dataWriter.getClass();
        this.dataWriter = dataWriter;
    }

    public final void setPackageName$dd_sdk_android_logs_release(String str) {
        str.getClass();
        this.packageName = str;
    }

    /* JADX INFO: renamed from: com.datadog.android.log.internal.LogsFeature$sendJvmCrashLog$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05622 extends mj8 implements gu5<String> {
        public static final C05622 INSTANCE = new C05622();

        public C05622() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Log event write operation wait was interrupted.";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.log.internal.LogsFeature$sendNdkCrashLog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05631 extends mj8 implements gu5<String> {
        public static final C05631 INSTANCE = new C05631();

        public C05631() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return LogsFeature.NDK_CRASH_EVENT_MISSING_MANDATORY_FIELDS_WARNING;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.log.internal.LogsFeature$sendSpanLog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05651 extends mj8 implements gu5<String> {
        public static final C05651 INSTANCE = new C05651();

        public C05651() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return LogsFeature.SPAN_LOG_EVENT_MISSING_MANDATORY_FIELDS_WARNING;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.log.internal.LogsFeature$sendSpanLog$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lcom/datadog/android/api/storage/EventBatchWriter;", "eventBatchWriter", "Lj6g;", "invoke", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/storage/EventBatchWriter;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C05662 extends mj8 implements Function2<DatadogContext, EventBatchWriter, j6g> {
        final /* synthetic */ Map<String, Object> $attributes;
        final /* synthetic */ String $loggerName;
        final /* synthetic */ String $message;
        final /* synthetic */ Long $timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05662(String str, Map<String, ? extends Object> map, Long l, String str2) {
            super(2);
            this.$message = str;
            this.$attributes = map;
            this.$timestamp = l;
            this.$loggerName = str2;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            datadogContext.getClass();
            eventBatchWriter.getClass();
            DatadogLogGenerator datadogLogGenerator = LogsFeature.this.logGenerator;
            String name = Thread.currentThread().getName();
            String str = this.$message;
            Map<String, Object> map = this.$attributes;
            long jLongValue = this.$timestamp.longValue();
            name.getClass();
            LogsFeature.this.getDataWriter$dd_sdk_android_logs_release().write(eventBatchWriter, LogGenerator.DefaultImpls.generateLog$default(datadogLogGenerator, 2, str, null, map, is4.a, jLongValue, name, datadogContext, true, this.$loggerName, false, true, null, null, null, 28672, null), EventType.DEFAULT);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ j6g invoke(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            invoke2(datadogContext, eventBatchWriter);
            return j6g.a;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.log.internal.LogsFeature$sendNdkCrashLog$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lcom/datadog/android/api/storage/EventBatchWriter;", "eventBatchWriter", "Lj6g;", "invoke", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/storage/EventBatchWriter;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C05642 extends mj8 implements Function2<DatadogContext, EventBatchWriter, j6g> {
        final /* synthetic */ Map<String, Object> $attributes;
        final /* synthetic */ String $loggerName;
        final /* synthetic */ String $message;
        final /* synthetic */ NetworkInfo $networkInfo;
        final /* synthetic */ Long $timestamp;
        final /* synthetic */ UserInfo $userInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05642(String str, Map<String, ? extends Object> map, Long l, String str2, UserInfo userInfo, NetworkInfo networkInfo) {
            super(2);
            this.$message = str;
            this.$attributes = map;
            this.$timestamp = l;
            this.$loggerName = str2;
            this.$userInfo = userInfo;
            this.$networkInfo = networkInfo;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            datadogContext.getClass();
            eventBatchWriter.getClass();
            DatadogLogGenerator datadogLogGenerator = LogsFeature.this.logGenerator;
            String name = Thread.currentThread().getName();
            String str = this.$message;
            Map<String, Object> map = this.$attributes;
            long jLongValue = this.$timestamp.longValue();
            name.getClass();
            LogsFeature.this.getDataWriter$dd_sdk_android_logs_release().write(eventBatchWriter, LogGenerator.DefaultImpls.generateLog$default(datadogLogGenerator, 9, str, null, map, is4.a, jLongValue, name, datadogContext, true, this.$loggerName, false, false, this.$userInfo, this.$networkInfo, null, 16384, null), EventType.CRASH);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ j6g invoke(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            invoke2(datadogContext, eventBatchWriter);
            return j6g.a;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.log.internal.LogsFeature$sendJvmCrashLog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lcom/datadog/android/api/storage/EventBatchWriter;", "eventBatchWriter", "Lj6g;", "invoke", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/storage/EventBatchWriter;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C05611 extends mj8 implements Function2<DatadogContext, EventBatchWriter, j6g> {
        final /* synthetic */ Map<String, Object> $attributes;
        final /* synthetic */ JvmCrash.Logs $jvmCrash;
        final /* synthetic */ CountDownLatch $lock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05611(JvmCrash.Logs logs, Map<String, ? extends Object> map, CountDownLatch countDownLatch) {
            super(2);
            this.$jvmCrash = logs;
            this.$attributes = map;
            this.$lock = countDownLatch;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            datadogContext.getClass();
            eventBatchWriter.getClass();
            DatadogLogGenerator datadogLogGenerator = LogsFeature.this.logGenerator;
            String loggerName = this.$jvmCrash.getLoggerName();
            LogsFeature.this.getDataWriter$dd_sdk_android_logs_release().write(eventBatchWriter, datadogLogGenerator.generateLog(9, this.$jvmCrash.getMessage(), this.$jvmCrash.getThrowable(), this.$attributes, is4.a, this.$jvmCrash.getTimestamp(), this.$jvmCrash.getThreadName(), datadogContext, true, loggerName, true, true, null, null, this.$jvmCrash.getThreads()), EventType.CRASH);
            this.$lock.countDown();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ j6g invoke(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            invoke2(datadogContext, eventBatchWriter);
            return j6g.a;
        }
    }
}
