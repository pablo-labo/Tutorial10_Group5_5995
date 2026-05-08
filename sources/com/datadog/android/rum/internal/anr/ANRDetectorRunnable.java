package com.datadog.android.rum.internal.anr;

import android.os.Handler;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.core.internal.utils.ThreadExtKt;
import com.datadog.android.internal.utils.ThrowableExtKt;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumAttributes;
import com.datadog.android.rum.RumErrorSource;
import defpackage.bs4;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.kc9;
import defpackage.mj8;
import defpackage.u63;
import defpackage.wl7;
import defpackage.z92;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/internal/anr/ANRDetectorRunnable;", "Ljava/lang/Runnable;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Landroid/os/Handler;", "handler", "", "anrThresholdMs", "anrTestDelayMs", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Landroid/os/Handler;JJ)V", "", "Ljava/lang/Thread;", "", "Ljava/lang/StackTraceElement;", "safeGetAllStacktraces", "()Ljava/util/Map;", "Lj6g;", "run", "()V", "stop", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Landroid/os/Handler;", "J", "", "shouldStop", "Z", "Companion", "CallbackRunnable", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ANRDetectorRunnable implements Runnable {
    public static final String ANR_MESSAGE = "Application Not Responding";
    private static final long ANR_TEST_DELAY_MS = 500;
    private static final long ANR_THRESHOLD_MS = 5000;
    private final long anrTestDelayMs;
    private final long anrThresholdMs;
    private final Handler handler;
    private final FeatureSdkCore sdkCore;
    private boolean shouldStop;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/datadog/android/rum/internal/anr/ANRDetectorRunnable$CallbackRunnable;", "Ljava/lang/Object;", "Ljava/lang/Runnable;", "<init>", "()V", "Lj6g;", "run", "", "wasCalled", "()Z", "called", "Z", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class CallbackRunnable implements Runnable {
        private boolean called;

        @Override // java.lang.Runnable
        public synchronized void run() {
            this.called = true;
            notifyAll();
        }

        /* JADX INFO: renamed from: wasCalled, reason: from getter */
        public final boolean getCalled() {
            return this.called;
        }
    }

    public /* synthetic */ ANRDetectorRunnable(FeatureSdkCore featureSdkCore, Handler handler, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureSdkCore, handler, (i & 4) != 0 ? 5000L : j, (i & 8) != 0 ? 500L : j2);
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

    @Override // java.lang.Runnable
    public void run() {
        while (!Thread.interrupted() && !this.shouldStop) {
            try {
                CallbackRunnable callbackRunnable = new CallbackRunnable();
                synchronized (callbackRunnable) {
                    try {
                        if (!this.handler.post(callbackRunnable)) {
                            return;
                        }
                        callbackRunnable.wait(this.anrThresholdMs);
                        if (!callbackRunnable.getCalled()) {
                            Thread thread = this.handler.getLooper().getThread();
                            thread.getClass();
                            ANRException aNRException = new ANRException(thread);
                            String name = thread.getName();
                            name.getClass();
                            Thread.State state = thread.getState();
                            state.getClass();
                            ArrayList arrayListD0 = u63.d0(new ThreadDump(name, ThreadExtKt.asString(state), ThrowableExtKt.loggableStackTrace(aNRException), false));
                            Map<Thread, StackTraceElement[]> mapSafeGetAllStacktraces = safeGetAllStacktraces();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<Thread, StackTraceElement[]> entry : mapSafeGetAllStacktraces.entrySet()) {
                                if (!wl7.b(entry.getKey(), thread)) {
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
                            Iterator it = linkedHashMap2.entrySet().iterator();
                            while (it.hasNext()) {
                                Thread thread2 = (Thread) ((Map.Entry) it.next()).getKey();
                                String name2 = thread2.getName();
                                name2.getClass();
                                Thread.State state2 = thread2.getState();
                                state2.getClass();
                                String strAsString = ThreadExtKt.asString(state2);
                                StackTraceElement[] stackTrace = thread2.getStackTrace();
                                stackTrace.getClass();
                                arrayList.add(new ThreadDump(name2, strAsString, ThreadExtKt.loggableStackTrace(stackTrace), false));
                            }
                            GlobalRumMonitor.get(this.sdkCore).addError(ANR_MESSAGE, RumErrorSource.SOURCE, aNRException, kc9.W(new Pair(RumAttributes.INTERNAL_ALL_THREADS, z92.h1(arrayListD0, arrayList))));
                            callbackRunnable.wait();
                        }
                        j6g j6gVar = j6g.a;
                    } finally {
                    }
                }
                long j = this.anrTestDelayMs;
                if (j > 0) {
                    Thread.sleep(j);
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final void stop() {
        this.shouldStop = true;
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.anr.ANRDetectorRunnable$safeGetAllStacktraces$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Failed to get all stack traces.";
        }
    }

    public ANRDetectorRunnable(FeatureSdkCore featureSdkCore, Handler handler, long j, long j2) {
        featureSdkCore.getClass();
        handler.getClass();
        this.sdkCore = featureSdkCore;
        this.handler = handler;
        this.anrThresholdMs = j;
        this.anrTestDelayMs = j2;
    }
}
