package com.datadog.android.log;

import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.core.internal.utils.MapUtilsKt;
import com.datadog.android.core.sampling.RateBasedSampler;
import com.datadog.android.log.internal.LogsFeature;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.log.internal.logger.CombinedLogHandler;
import com.datadog.android.log.internal.logger.DatadogLogHandler;
import com.datadog.android.log.internal.logger.LogHandler;
import com.datadog.android.log.internal.logger.LogcatLogHandler;
import com.datadog.android.log.internal.logger.NoOpLogHandler;
import com.datadog.android.log.model.LogEvent;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.bs4;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.wve;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 A2\u00020\u0001:\u0002BAB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ;\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ;\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0007¢\u0006\u0004\b\u0011\u0010\u000eJ;\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ;\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0007¢\u0006\u0004\b\u0013\u0010\u000eJC\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017JU\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0007¢\u0006\u0004\b\u0016\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010!J\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b&\u0010!JK\u0010-\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b+\u0010,J_\u0010-\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010!J\u0017\u00100\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010!J#\u00104\u001a\u00020\f2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020201H\u0002¢\u0006\u0004\b4\u00105R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010\u0005R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/datadog/android/log/Logger;", "", "Lcom/datadog/android/log/internal/logger/LogHandler;", "handler", "<init>", "(Lcom/datadog/android/log/internal/logger/LogHandler;)V", "", "message", "", RumFeature.EVENT_THROWABLE_PROPERTY, "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lj6g;", "v", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "d", "i", "w", "e", "wtf", "", "priority", "log", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "errorKind", "errorMessage", "errorStacktrace", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "key", "value", "addAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", "removeAttribute", "(Ljava/lang/String;)V", "addTag", "(Ljava/lang/String;Ljava/lang/String;)V", "tag", "removeTag", "removeTagsWithKey", "level", "localAttributes", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "internalLog$dd_sdk_android_logs_release", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;Ljava/lang/Long;)V", "internalLog", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;)V", "addTagInternal", "removeTagInternal", "Lkotlin/Function1;", "", "keyFilter", "safelyRemoveTagsWithKey", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/datadog/android/log/internal/logger/LogHandler;", "getHandler$dd_sdk_android_logs_release", "()Lcom/datadog/android/log/internal/logger/LogHandler;", "setHandler$dd_sdk_android_logs_release", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "tags", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getTags$dd_sdk_android_logs_release", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "Companion", "Builder", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class Logger {
    public static final float DEFAULT_SAMPLE_RATE = 100.0f;
    public static final String SDK_NOT_INITIALIZED_WARNING_MESSAGE = "You're trying to create a Logger instance, but the SDK was not yet initialized. This Logger will not be able to send any messages. Please initialize the Datadog SDK first before creating a new Logger instance.";
    private final ConcurrentHashMap<String, Object> attributes;
    private LogHandler handler;
    private final CopyOnWriteArraySet<String> tags;

    /* JADX INFO: renamed from: com.datadog.android.log.Logger$removeTagsWithKey$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements Function1<String, Boolean> {
        final /* synthetic */ String $prefix;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$prefix = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            str.getClass();
            return Boolean.valueOf(wve.K(str, this.$prefix, false));
        }
    }

    public Logger(LogHandler logHandler) {
        logHandler.getClass();
        this.handler = logHandler;
        this.attributes = new ConcurrentHashMap<>();
        this.tags = new CopyOnWriteArraySet<>();
    }

    private final void addTagInternal(String tag) {
        this.tags.add(tag);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d$default(Logger logger, String str, Throwable th, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            map = bs4.a;
        }
        logger.d(str, th, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e$default(Logger logger, String str, Throwable th, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            map = bs4.a;
        }
        logger.e(str, th, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i$default(Logger logger, String str, Throwable th, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            map = bs4.a;
        }
        logger.i(str, th, map);
    }

    private final void internalLog(int level, String message, String errorKind, String errorMessage, String errorStacktrace, Map<String, ? extends Object> localAttributes, Long timestamp) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.attributes);
        linkedHashMap.putAll(localAttributes);
        this.handler.handleLog(level, message, errorKind, errorMessage, errorStacktrace, linkedHashMap, new HashSet(this.tags), timestamp);
    }

    public static /* synthetic */ void internalLog$dd_sdk_android_logs_release$default(Logger logger, int i, String str, Throwable th, Map map, Long l, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            l = null;
        }
        logger.internalLog$dd_sdk_android_logs_release(i, str, th, map, l);
    }

    public static /* synthetic */ void internalLog$default(Logger logger, int i, String str, String str2, String str3, String str4, Map map, Long l, int i2, Object obj) {
        logger.internalLog(i, str, str2, str3, str4, map, (i2 & 64) != 0 ? null : l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void log$default(Logger logger, int i, String str, String str2, String str3, String str4, Map map, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            map = bs4.a;
        }
        logger.log(i, str, str2, str3, str4, map);
    }

    private final void removeTagInternal(String tag) {
        this.tags.remove(tag);
    }

    private final void safelyRemoveTagsWithKey(Function1<? super String, Boolean> keyFilter) {
        Object[] array = this.tags.toArray(new String[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : array) {
            if (keyFilter.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        this.tags.removeAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v$default(Logger logger, String str, Throwable th, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            map = bs4.a;
        }
        logger.v(str, th, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void w$default(Logger logger, String str, Throwable th, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            map = bs4.a;
        }
        logger.w(str, th, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void wtf$default(Logger logger, String str, Throwable th, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            map = bs4.a;
        }
        logger.wtf(str, th, map);
    }

    public final void addAttribute(String key, Object value) {
        key.getClass();
        ConcurrentHashMap<String, Object> concurrentHashMap = this.attributes;
        if (value == null) {
            concurrentHashMap.put(key, MapUtilsKt.getNULL_MAP_VALUE());
        } else {
            concurrentHashMap.put(key, value);
        }
    }

    public final void addTag(String key, String value) {
        key.getClass();
        value.getClass();
        addTagInternal(key + ":" + value);
    }

    public final void d(String message, Throwable throwable, Map<String, ? extends Object> attributes) {
        message.getClass();
        attributes.getClass();
        internalLog$dd_sdk_android_logs_release$default(this, 3, message, throwable, attributes, null, 16, null);
    }

    public final void e(String message, Throwable throwable, Map<String, ? extends Object> attributes) {
        message.getClass();
        attributes.getClass();
        internalLog$dd_sdk_android_logs_release$default(this, 6, message, throwable, attributes, null, 16, null);
    }

    /* JADX INFO: renamed from: getHandler$dd_sdk_android_logs_release, reason: from getter */
    public final LogHandler getHandler() {
        return this.handler;
    }

    public final CopyOnWriteArraySet<String> getTags$dd_sdk_android_logs_release() {
        return this.tags;
    }

    public final void i(String message, Throwable throwable, Map<String, ? extends Object> attributes) {
        message.getClass();
        attributes.getClass();
        internalLog$dd_sdk_android_logs_release$default(this, 4, message, throwable, attributes, null, 16, null);
    }

    public final void internalLog$dd_sdk_android_logs_release(int level, String message, Throwable throwable, Map<String, ? extends Object> localAttributes, Long timestamp) {
        message.getClass();
        localAttributes.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.attributes);
        linkedHashMap.putAll(localAttributes);
        this.handler.handleLog(level, message, throwable, linkedHashMap, new HashSet(this.tags), timestamp);
    }

    public final void log(int priority, String message, String errorKind, String errorMessage, String errorStacktrace, Map<String, ? extends Object> attributes) {
        message.getClass();
        attributes.getClass();
        internalLog$default(this, priority, message, errorKind, errorMessage, errorStacktrace, attributes, null, 64, null);
    }

    public final void removeAttribute(String key) {
        key.getClass();
        this.attributes.remove(key);
    }

    public final void removeTag(String tag) {
        tag.getClass();
        removeTagInternal(tag);
    }

    public final void removeTagsWithKey(String key) {
        key.getClass();
        safelyRemoveTagsWithKey(new AnonymousClass1(key.concat(":")));
    }

    public final void setHandler$dd_sdk_android_logs_release(LogHandler logHandler) {
        logHandler.getClass();
        this.handler = logHandler;
    }

    public final void v(String message, Throwable throwable, Map<String, ? extends Object> attributes) {
        message.getClass();
        attributes.getClass();
        internalLog$dd_sdk_android_logs_release$default(this, 2, message, throwable, attributes, null, 16, null);
    }

    public final void w(String message, Throwable throwable, Map<String, ? extends Object> attributes) {
        message.getClass();
        attributes.getClass();
        internalLog$dd_sdk_android_logs_release$default(this, 5, message, throwable, attributes, null, 16, null);
    }

    public final void wtf(String message, Throwable throwable, Map<String, ? extends Object> attributes) {
        message.getClass();
        attributes.getClass();
        internalLog$dd_sdk_android_logs_release$default(this, 7, message, throwable, attributes, null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void log$default(Logger logger, int i, String str, Throwable th, Map map, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            th = null;
        }
        if ((i2 & 8) != 0) {
            map = bs4.a;
        }
        logger.log(i, str, th, map);
    }

    public final void d(String str, Throwable th) {
        str.getClass();
        d$default(this, str, th, null, 4, null);
    }

    public final void e(String str, Throwable th) {
        str.getClass();
        e$default(this, str, th, null, 4, null);
    }

    public final void i(String str, Throwable th) {
        str.getClass();
        i$default(this, str, th, null, 4, null);
    }

    public final void v(String str, Throwable th) {
        str.getClass();
        v$default(this, str, th, null, 4, null);
    }

    public final void w(String str, Throwable th) {
        str.getClass();
        w$default(this, str, th, null, 4, null);
    }

    public final void wtf(String str, Throwable th) {
        str.getClass();
        wtf$default(this, str, th, null, 4, null);
    }

    public final void d(String str) {
        str.getClass();
        d$default(this, str, null, null, 6, null);
    }

    public final void e(String str) {
        str.getClass();
        e$default(this, str, null, null, 6, null);
    }

    public final void i(String str) {
        str.getClass();
        i$default(this, str, null, null, 6, null);
    }

    public final void v(String str) {
        str.getClass();
        v$default(this, str, null, null, 6, null);
    }

    public final void w(String str) {
        str.getClass();
        w$default(this, str, null, null, 6, null);
    }

    public final void wtf(String str) {
        str.getClass();
        wtf$default(this, str, null, null, 6, null);
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\nJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\fJ\u0010\u0010\"\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/datadog/android/log/Logger$Builder;", "", "sdkCore", "Lcom/datadog/android/api/SdkCore;", "(Lcom/datadog/android/api/SdkCore;)V", "bundleWithRumEnabled", "", "bundleWithTraceEnabled", "logcatLogsEnabled", "loggerName", "", "minDatadogLogsPriority", "", "networkInfoEnabled", "sampleRate", "", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "serviceName", "build", "Lcom/datadog/android/log/Logger;", "buildDatadogHandler", "Lcom/datadog/android/log/internal/logger/LogHandler;", "logsFeature", "Lcom/datadog/android/log/internal/LogsFeature;", "buildLogcatHandler", "setBundleWithRumEnabled", "enabled", "setBundleWithTraceEnabled", "setLogcatLogsEnabled", "setName", "name", "setNetworkInfoEnabled", "setRemoteLogThreshold", "minLogThreshold", "setRemoteSampleRate", "setService", "service", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Builder {
        private boolean bundleWithRumEnabled;
        private boolean bundleWithTraceEnabled;
        private boolean logcatLogsEnabled;
        private String loggerName;
        private int minDatadogLogsPriority;
        private boolean networkInfoEnabled;
        private float sampleRate;
        private final FeatureSdkCore sdkCore;
        private String serviceName;

        public Builder(SdkCore sdkCore) {
            sdkCore.getClass();
            this.sdkCore = (FeatureSdkCore) sdkCore;
            this.bundleWithTraceEnabled = true;
            this.bundleWithRumEnabled = true;
            this.sampleRate = 100.0f;
            this.minDatadogLogsPriority = -1;
        }

        private final LogHandler buildDatadogHandler(FeatureSdkCore sdkCore, LogsFeature logsFeature) {
            if (logsFeature == null) {
                InternalLogger.DefaultImpls.log$default(sdkCore.getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) Logger$Builder$buildDatadogHandler$1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
                return new NoOpLogHandler();
            }
            String packageName$dd_sdk_android_logs_release = this.loggerName;
            if (packageName$dd_sdk_android_logs_release == null) {
                packageName$dd_sdk_android_logs_release = logsFeature.getPackageName();
            }
            String str = packageName$dd_sdk_android_logs_release;
            String service = this.serviceName;
            if (service == null) {
                service = sdkCore.getService();
            }
            DatadogLogGenerator datadogLogGenerator = new DatadogLogGenerator(service);
            DataWriter<LogEvent> dataWriter$dd_sdk_android_logs_release = logsFeature.getDataWriter$dd_sdk_android_logs_release();
            int i = this.minDatadogLogsPriority;
            return new DatadogLogHandler(str, datadogLogGenerator, sdkCore, dataWriter$dd_sdk_android_logs_release, this.networkInfoEnabled, this.bundleWithTraceEnabled, this.bundleWithRumEnabled, new RateBasedSampler(this.sampleRate), i);
        }

        private final LogHandler buildLogcatHandler(SdkCore sdkCore) {
            String service = this.serviceName;
            if (service == null) {
                service = sdkCore != null ? sdkCore.getService() : null;
                if (service == null) {
                    service = "unknown";
                }
            }
            return new LogcatLogHandler(service, true, false, 4, null);
        }

        public final Logger build() {
            FeatureScope feature = this.sdkCore.getFeature("logs");
            LogsFeature logsFeature = feature != null ? (LogsFeature) feature.unwrap() : null;
            boolean z = this.sampleRate > 0.0f;
            return new Logger((z && this.logcatLogsEnabled) ? new CombinedLogHandler(buildDatadogHandler(this.sdkCore, logsFeature), buildLogcatHandler(this.sdkCore)) : z ? buildDatadogHandler(this.sdkCore, logsFeature) : this.logcatLogsEnabled ? buildLogcatHandler(this.sdkCore) : new NoOpLogHandler());
        }

        public final Builder setBundleWithRumEnabled(boolean enabled) {
            this.bundleWithRumEnabled = enabled;
            return this;
        }

        public final Builder setBundleWithTraceEnabled(boolean enabled) {
            this.bundleWithTraceEnabled = enabled;
            return this;
        }

        public final Builder setLogcatLogsEnabled(boolean enabled) {
            this.logcatLogsEnabled = enabled;
            return this;
        }

        public final Builder setName(String name) {
            name.getClass();
            this.loggerName = name;
            return this;
        }

        public final Builder setNetworkInfoEnabled(boolean enabled) {
            this.networkInfoEnabled = enabled;
            return this;
        }

        public final Builder setRemoteLogThreshold(int minLogThreshold) {
            this.minDatadogLogsPriority = minLogThreshold;
            return this;
        }

        public final Builder setRemoteSampleRate(float sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        public final Builder setService(String service) {
            service.getClass();
            this.serviceName = service;
            return this;
        }

        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Builder(SdkCore sdkCore, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Datadog.getInstance$default(null, 1, null) : sdkCore);
        }
    }

    public final void log(int i, String str, String str2, String str3, String str4) {
        str.getClass();
        log$default(this, i, str, str2, str3, str4, null, 32, null);
    }

    public final void log(int i, String str, Throwable th) {
        str.getClass();
        log$default(this, i, str, th, null, 8, null);
    }

    public final void log(int priority, String message, Throwable throwable, Map<String, ? extends Object> attributes) {
        message.getClass();
        attributes.getClass();
        internalLog$dd_sdk_android_logs_release$default(this, priority, message, throwable, attributes, null, 16, null);
    }

    public final void log(int i, String str) {
        str.getClass();
        log$default(this, i, str, null, null, 12, null);
    }

    public final void addTag(String tag) {
        tag.getClass();
        addTagInternal(tag);
    }
}
