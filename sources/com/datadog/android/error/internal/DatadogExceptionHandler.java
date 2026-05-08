package com.datadog.android.error.internal;

import android.content.Context;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.feature.event.JvmCrash;
import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.core.internal.thread.ThreadPoolExecutorExtKt;
import com.datadog.android.core.internal.utils.ThreadExtKt;
import com.datadog.android.core.internal.utils.WorkManagerUtilsKt;
import com.datadog.android.internal.utils.ThrowableExtKt;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.bs4;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.u63;
import defpackage.w2h;
import defpackage.wl7;
import defpackage.z92;
import defpackage.zve;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\"\u0010\"\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u00040\u00040 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/datadog/android/error/internal/DatadogExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Landroid/content/Context;", "appContext", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Landroid/content/Context;)V", "", RumFeature.EVENT_THROWABLE_PROPERTY, "", "createCrashMessage", "(Ljava/lang/Throwable;)Ljava/lang/String;", "Ljava/lang/Thread;", "crashedThread", "e", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "getThreadDumps", "(Ljava/lang/Thread;Ljava/lang/Throwable;)Ljava/util/List;", "", "", "Ljava/lang/StackTraceElement;", "safeGetAllStacktraces", "()Ljava/util/Map;", "t", "Lj6g;", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "register", "()V", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "contextRef", "Ljava/lang/ref/WeakReference;", "previousHandler", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatadogExceptionHandler implements Thread.UncaughtExceptionHandler {
    public static final String EXECUTOR_NOT_IDLED_WARNING_MESSAGE = "Datadog SDK is in an unexpected state due to an ongoing crash. Some events could be lost.";
    public static final String LOGGER_NAME = "crash";
    public static final long MAX_WAIT_FOR_IDLE_TIME_IN_MS = 100;
    public static final String MESSAGE = "Application crash detected";
    public static final String MISSING_LOGS_FEATURE_INFO = "Logs feature is not registered, won't report crash as log.";
    public static final String MISSING_RUM_FEATURE_INFO = "RUM feature is not registered, won't report crash as RUM event.";
    private final WeakReference<Context> contextRef;
    private Thread.UncaughtExceptionHandler previousHandler;
    private final FeatureSdkCore sdkCore;

    public DatadogExceptionHandler(FeatureSdkCore featureSdkCore, Context context) {
        featureSdkCore.getClass();
        context.getClass();
        this.sdkCore = featureSdkCore;
        this.contextRef = new WeakReference<>(context);
    }

    private final String createCrashMessage(Throwable throwable) {
        String message = throwable.getMessage();
        if (message != null && !zve.U(message)) {
            return message;
        }
        String canonicalName = throwable.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = throwable.getClass().getSimpleName();
        }
        return "Application crash detected: ".concat(canonicalName);
    }

    private final List<ThreadDump> getThreadDumps(Thread crashedThread, Throwable e) {
        String name = crashedThread.getName();
        Thread.State state = crashedThread.getState();
        state.getClass();
        String strAsString = ThreadExtKt.asString(state);
        String strLoggableStackTrace = ThrowableExtKt.loggableStackTrace(e);
        name.getClass();
        ArrayList arrayListD0 = u63.d0(new ThreadDump(name, strAsString, strLoggableStackTrace, true));
        Map<Thread, StackTraceElement[]> mapSafeGetAllStacktraces = safeGetAllStacktraces();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Thread, StackTraceElement[]> entry : mapSafeGetAllStacktraces.entrySet()) {
            if (!wl7.b(entry.getKey(), crashedThread)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((StackTraceElement[]) entry2.getValue()).length != 0) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Thread thread = (Thread) entry3.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry3.getValue();
            String name2 = thread.getName();
            name2.getClass();
            Thread.State state2 = thread.getState();
            state2.getClass();
            arrayList.add(new ThreadDump(name2, ThreadExtKt.asString(state2), ThreadExtKt.loggableStackTrace(stackTraceElementArr), false));
        }
        return z92.h1(arrayListD0, arrayList);
    }

    private final Map<Thread, StackTraceElement[]> safeGetAllStacktraces() {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            allStackTraces.getClass();
            return allStackTraces;
        } catch (SecurityException e) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            return bs4.a;
        }
    }

    public final void register() {
        this.previousHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t, Throwable e) throws Throwable {
        w2h w2hVar;
        t.getClass();
        e.getClass();
        List<ThreadDump> threadDumps = getThreadDumps(t, e);
        FeatureScope feature = this.sdkCore.getFeature("logs");
        if (feature != null) {
            String name = t.getName();
            name.getClass();
            feature.sendEvent(new JvmCrash.Logs(name, e, System.currentTimeMillis(), createCrashMessage(e), "crash", threadDumps));
        } else {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) C05591.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        }
        FeatureScope feature2 = this.sdkCore.getFeature("rum");
        if (feature2 != null) {
            feature2.sendEvent(new JvmCrash.Rum(e, createCrashMessage(e), threadDumps));
        } else {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) AnonymousClass2.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        }
        FeatureSdkCore featureSdkCore = this.sdkCore;
        if (featureSdkCore instanceof InternalSdkCore) {
            ExecutorService persistenceExecutorService = ((InternalSdkCore) featureSdkCore).getPersistenceExecutorService();
            ThreadPoolExecutor threadPoolExecutor = persistenceExecutorService instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) persistenceExecutorService : null;
            if (!(threadPoolExecutor != null ? ThreadPoolExecutorExtKt.waitToIdle(threadPoolExecutor, 100L, this.sdkCore.getInternalLogger()) : true)) {
                InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) AnonymousClass3.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            }
        }
        Context context = this.contextRef.get();
        if (context != null) {
            synchronized (w2h.m) {
                try {
                    w2hVar = w2h.k;
                    if (w2hVar == null) {
                        w2hVar = w2h.l;
                    }
                } finally {
                }
            }
            if (w2hVar != null) {
                WorkManagerUtilsKt.triggerUploadWorker(context, this.sdkCore.getName(), this.sdkCore.getInternalLogger());
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.previousHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t, e);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.error.internal.DatadogExceptionHandler$safeGetAllStacktraces$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Failed to get all threads dump";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.error.internal.DatadogExceptionHandler$uncaughtException$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05591 extends mj8 implements gu5<String> {
        public static final C05591 INSTANCE = new C05591();

        public C05591() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogExceptionHandler.MISSING_LOGS_FEATURE_INFO;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.error.internal.DatadogExceptionHandler$uncaughtException$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogExceptionHandler.MISSING_RUM_FEATURE_INFO;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.error.internal.DatadogExceptionHandler$uncaughtException$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogExceptionHandler.EXECUTOR_NOT_IDLED_WARNING_MESSAGE;
        }
    }
}
