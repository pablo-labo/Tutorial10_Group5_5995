package com.datadog.android.core.internal;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.TimeInfo;
import com.datadog.android.api.feature.Feature;
import com.datadog.android.api.feature.FeatureContextUpdateReceiver;
import com.datadog.android.api.feature.FeatureEventReceiver;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.logger.SdkInternalLogger;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver;
import com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.ab8;
import defpackage.bs4;
import defpackage.j6g;
import defpackage.zr4;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003rstB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJC\u0010\u0010\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00020\u00062\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010#\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\t2 \u0010\"\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e0!\u0012\u0004\u0012\u00020\u00060 H\u0016¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u00102\u001a\u00020\tH\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\u0003J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u000203H\u0016¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001d0DH\u0016¢\u0006\u0004\bE\u0010FJ\u0011\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bH\u0010IR\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010N\u001a\u00020M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010LR\u0014\u0010W\u001a\u00020T8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0016\u0010b\u001a\u0004\u0018\u00010_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\u0017R\u0014\u0010g\u001a\u00020d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0016\u0010k\u001a\u0004\u0018\u00010h8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0016\u0010n\u001a\u0004\u0018\u00010>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010q\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006u"}, d2 = {"Lcom/datadog/android/core/internal/NoOpInternalSdkCore;", "Lcom/datadog/android/core/InternalSdkCore;", "<init>", "()V", "Lcom/datadog/android/privacy/TrackingConsent;", BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "Lj6g;", "setTrackingConsent", "(Lcom/datadog/android/privacy/TrackingConsent;)V", "", "id", "name", "email", "", "", "extraInfo", "setUserInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "addUserProperties", "(Ljava/util/Map;)V", "clearAllData", "", "isCoreActive", "()Z", "Lcom/datadog/android/api/feature/Feature;", "feature", "registerFeature", "(Lcom/datadog/android/api/feature/Feature;)V", "featureName", "Lcom/datadog/android/api/feature/FeatureScope;", "getFeature", "(Ljava/lang/String;)Lcom/datadog/android/api/feature/FeatureScope;", "Lkotlin/Function1;", "", "updateCallback", "updateFeatureContext", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getFeatureContext", "(Ljava/lang/String;)Ljava/util/Map;", "Lcom/datadog/android/api/feature/FeatureEventReceiver;", "receiver", "setEventReceiver", "(Ljava/lang/String;Lcom/datadog/android/api/feature/FeatureEventReceiver;)V", "removeEventReceiver", "(Ljava/lang/String;)V", "Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;", "listener", "setContextUpdateReceiver", "(Ljava/lang/String;Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;)V", "removeContextUpdateReceiver", "executorContext", "Ljava/util/concurrent/ExecutorService;", "createSingleThreadExecutorService", "(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "createScheduledExecutorService", "(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;", "", "data", "writeLastViewEvent", "([B)V", "deleteLastViewEvent", "", "anrTimestamp", "writeLastFatalAnrSent", "(J)V", "getPersistenceExecutorService", "()Ljava/util/concurrent/ExecutorService;", "", "getAllFeatures", "()Ljava/util/List;", "Lcom/datadog/android/api/context/DatadogContext;", "getDatadogContext", "()Lcom/datadog/android/api/context/DatadogContext;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/datadog/android/api/context/TimeInfo;", "time", "Lcom/datadog/android/api/context/TimeInfo;", "getTime", "()Lcom/datadog/android/api/context/TimeInfo;", "getService", "service", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/api/context/NetworkInfo;", "getNetworkInfo", "()Lcom/datadog/android/api/context/NetworkInfo;", "networkInfo", "getTrackingConsent", "()Lcom/datadog/android/privacy/TrackingConsent;", "trackingConsent", "Ljava/io/File;", "getRootStorageDir", "()Ljava/io/File;", "rootStorageDir", "isDeveloperModeEnabled", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getFirstPartyHostResolver", "()Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostResolver", "Lab8;", "getLastViewEvent", "()Lab8;", "lastViewEvent", "getLastFatalAnrSent", "()Ljava/lang/Long;", "lastFatalAnrSent", "getAppStartTimeNs", "()J", "appStartTimeNs", "NoOpExecutorService", "NoOpScheduledExecutorService", "NoOpScheduledFuture", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpInternalSdkCore implements InternalSdkCore {
    public static final NoOpInternalSdkCore INSTANCE = new NoOpInternalSdkCore();
    private static final String name = "no-op";
    private static final TimeInfo time;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a\"\u0004\b\u0000\u0010\u00172\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a\"\u0004\b\u0000\u0010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001eJ\u001f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001fJ9\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\n\"\u0004\b\u0000\u0010\u00172\u0016\u0010!\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#JK\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\n\"\u0004\b\u0000\u0010\u00172\u0016\u0010!\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0018\u00010 2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\"\u0010$J/\u0010%\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\u0016\u0010!\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0018\u00010 H\u0016¢\u0006\u0004\b%\u0010&JA\u0010%\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\u0016\u0010!\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0018\u00010 2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b%\u0010'¨\u0006("}, d2 = {"Lcom/datadog/android/core/internal/NoOpInternalSdkCore$NoOpExecutorService;", "Ljava/util/concurrent/ExecutorService;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "Lj6g;", "execute", "(Ljava/lang/Runnable;)V", "shutdown", "", "shutdownNow", "()Ljava/util/List;", "", "isShutdown", "()Z", "isTerminated", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)Z", "T", "Ljava/util/concurrent/Callable;", "task", "Ljava/util/concurrent/Future;", "submit", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "result", "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "", "tasks", "invokeAll", "(Ljava/util/Collection;)Ljava/util/List;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;", "invokeAny", "(Ljava/util/Collection;)Ljava/lang/Object;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class NoOpExecutorService implements ExecutorService, AutoCloseable {
        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long timeout, TimeUnit unit) {
            return true;
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            boolean zIsTerminated;
            if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
                return;
            }
            shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) {
            return new ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> tasks) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return true;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return true;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            return new ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable task) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable task, T result) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> task) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) {
            return new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a\"\u0004\b\u0000\u0010\u00172\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a\"\u0004\b\u0000\u0010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001eJ\u001f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001fJ9\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\n\"\u0004\b\u0000\u0010\u00172\u0016\u0010!\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#JK\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\n\"\u0004\b\u0000\u0010\u00172\u0016\u0010!\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0018\u00010 2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\"\u0010$J/\u0010%\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\u0016\u0010!\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0018\u00010 H\u0016¢\u0006\u0004\b%\u0010&JA\u0010%\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\u0016\u0010!\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0018\u00010 2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b%\u0010'J=\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+\"\u0004\b\u0000\u0010(2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00182\u0006\u0010*\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b,\u0010-J/\u0010,\u001a\u0006\u0012\u0002\b\u00030+2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b,\u0010.J7\u00101\u001a\u0006\u0012\u0002\b\u00030+2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b1\u00102J7\u00103\u001a\u0006\u0012\u0002\b\u00030+2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b3\u00102¨\u00064"}, d2 = {"Lcom/datadog/android/core/internal/NoOpInternalSdkCore$NoOpScheduledExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "Lj6g;", "execute", "(Ljava/lang/Runnable;)V", "shutdown", "", "shutdownNow", "()Ljava/util/List;", "", "isShutdown", "()Z", "isTerminated", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)Z", "T", "Ljava/util/concurrent/Callable;", "task", "Ljava/util/concurrent/Future;", "submit", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "result", "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "", "tasks", "invokeAll", "(Ljava/util/Collection;)Ljava/util/List;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;", "invokeAny", "(Ljava/util/Collection;)Ljava/lang/Object;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "V", "callable", "delay", "Ljava/util/concurrent/ScheduledFuture;", "schedule", "(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "initialDelay", "period", "scheduleAtFixedRate", "(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "scheduleWithFixedDelay", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class NoOpScheduledExecutorService implements ScheduledExecutorService, AutoCloseable {
        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long timeout, TimeUnit unit) {
            return true;
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            boolean zIsTerminated;
            if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
                return;
            }
            shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) {
            return new ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> tasks) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return true;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return true;
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
            return new NoOpScheduledFuture();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
            return new NoOpScheduledFuture();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
            return new NoOpScheduledFuture();
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            return new ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable task) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable task, T result) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> task) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) {
            return new ArrayList();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
            return new NoOpScheduledFuture();
        }
    }

    static {
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        time = new TimeInfo(timeUnit.toNanos(jCurrentTimeMillis), timeUnit.toNanos(jCurrentTimeMillis), 0L, 0L);
    }

    private NoOpInternalSdkCore() {
    }

    @Override // com.datadog.android.api.SdkCore
    public void addUserProperties(Map<String, ? extends Object> extraInfo) {
        extraInfo.getClass();
    }

    @Override // com.datadog.android.api.SdkCore
    public void clearAllData() {
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public ScheduledExecutorService createScheduledExecutorService(String executorContext) {
        executorContext.getClass();
        return new NoOpScheduledExecutorService();
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public ExecutorService createSingleThreadExecutorService(String executorContext) {
        executorContext.getClass();
        return new NoOpExecutorService();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public void deleteLastViewEvent() {
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public List<FeatureScope> getAllFeatures() {
        return zr4.a;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public long getAppStartTimeNs() {
        return 0L;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public DatadogContext getDatadogContext() {
        return null;
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public FeatureScope getFeature(String featureName) {
        featureName.getClass();
        return null;
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public Map<String, Object> getFeatureContext(String featureName) {
        featureName.getClass();
        return bs4.a;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public FirstPartyHostHeaderTypeResolver getFirstPartyHostResolver() {
        return new DefaultFirstPartyHostHeaderTypeResolver(bs4.a);
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public InternalLogger getInternalLogger() {
        return new SdkInternalLogger(this, null, null, 6, null);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public Long getLastFatalAnrSent() {
        return null;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public ab8 getLastViewEvent() {
        return null;
    }

    @Override // com.datadog.android.api.SdkCore
    public String getName() {
        return name;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public NetworkInfo getNetworkInfo() {
        return new NetworkInfo(NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null, 126, null);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public ExecutorService getPersistenceExecutorService() {
        return new NoOpExecutorService();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public File getRootStorageDir() {
        return null;
    }

    @Override // com.datadog.android.api.SdkCore
    public String getService() {
        return "";
    }

    @Override // com.datadog.android.api.SdkCore
    public TimeInfo getTime() {
        return time;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public TrackingConsent getTrackingConsent() {
        return TrackingConsent.NOT_GRANTED;
    }

    @Override // com.datadog.android.api.SdkCore
    public boolean isCoreActive() {
        return false;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    /* JADX INFO: renamed from: isDeveloperModeEnabled */
    public boolean getIsDeveloperModeEnabled() {
        return false;
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public void registerFeature(Feature feature) {
        feature.getClass();
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public void removeContextUpdateReceiver(String featureName, FeatureContextUpdateReceiver listener) {
        featureName.getClass();
        listener.getClass();
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public void removeEventReceiver(String featureName) {
        featureName.getClass();
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public void setContextUpdateReceiver(String featureName, FeatureContextUpdateReceiver listener) {
        featureName.getClass();
        listener.getClass();
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public void setEventReceiver(String featureName, FeatureEventReceiver receiver) {
        featureName.getClass();
        receiver.getClass();
    }

    @Override // com.datadog.android.api.SdkCore
    public void setTrackingConsent(TrackingConsent consent) {
        consent.getClass();
    }

    @Override // com.datadog.android.api.SdkCore
    public void setUserInfo(String id, String name2, String email, Map<String, ? extends Object> extraInfo) {
        extraInfo.getClass();
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public void updateFeatureContext(String featureName, Function1<? super Map<String, Object>, j6g> updateCallback) {
        featureName.getClass();
        updateCallback.getClass();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public void writeLastFatalAnrSent(long anrTimestamp) {
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public void writeLastViewEvent(byte[] data) {
        data.getClass();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\r\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ \u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016¨\u0006\u0015"}, d2 = {"Lcom/datadog/android/core/internal/NoOpInternalSdkCore$NoOpScheduledFuture;", "O", "Ljava/util/concurrent/ScheduledFuture;", "()V", "cancel", "", "mayInterruptIfRunning", "compareTo", "", "other", "Ljava/util/concurrent/Delayed;", "get", "()Ljava/lang/Object;", "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "getDelay", "isCancelled", "isDone", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class NoOpScheduledFuture<O> implements ScheduledFuture<O> {
        @Override // java.util.concurrent.Future
        public boolean cancel(boolean mayInterruptIfRunning) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public O get() throws ExecutionException {
            throw new ExecutionException("Unsupported", new UnsupportedOperationException());
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit unit) {
            return 0L;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Delayed other) {
            return 0;
        }

        @Override // java.util.concurrent.Future
        public O get(long timeout, TimeUnit unit) throws ExecutionException {
            throw new ExecutionException("Unsupported", new UnsupportedOperationException());
        }
    }
}
