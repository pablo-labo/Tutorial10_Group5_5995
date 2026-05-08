package com.datadog.android.rum.internal.vitals;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.system.BuildSdkVersionProvider;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.rs5;
import defpackage.ut7;
import defpackage.w92;
import defpackage.wl7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0002NOB5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u001d\u0010\u0017J!\u0010 \u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b$\u0010#J\u0017\u0010%\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b%\u0010#J\u0017\u0010&\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b&\u0010#J\u001f\u0010(\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u001eH\u0017¢\u0006\u0004\b(\u0010!J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b)\u0010#J\u0017\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00101R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00102R&\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u000204038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R2\u0010;\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110:09038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u00108R$\u0010>\u001a\u0004\u0018\u00010=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010E\u001a\b\u0018\u00010DR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010H\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/JankStatsActivityLifecycleListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lut7$a;", "Lcom/datadog/android/rum/internal/vitals/VitalObserver;", "vitalObserver", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/rum/internal/vitals/JankStatsProvider;", "jankStatsProvider", "", "screenRefreshRate", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Lcom/datadog/android/rum/internal/vitals/VitalObserver;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/rum/internal/vitals/JankStatsProvider;DLcom/datadog/android/core/internal/system/BuildSdkVersionProvider;)V", "Landroid/view/Window;", "window", "Landroid/app/Activity;", "activity", "Lj6g;", "trackActivity", "(Landroid/view/Window;Landroid/app/Activity;)V", "trackWindowJankStats", "(Landroid/view/Window;)V", "", "isKnownWindow", "trackWindowMetrics", "(ZLandroid/view/Window;Landroid/app/Activity;)V", "registerMetricListener", "unregisterMetricListener", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Lrs5;", "volatileFrameData", "onFrame", "(Lrs5;)V", "Lcom/datadog/android/rum/internal/vitals/VitalObserver;", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/rum/internal/vitals/JankStatsProvider;", "D", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "Ljava/util/WeakHashMap;", "Lut7;", "activeWindowsListener", "Ljava/util/WeakHashMap;", "getActiveWindowsListener$dd_sdk_android_rum_release", "()Ljava/util/WeakHashMap;", "", "Ljava/lang/ref/WeakReference;", "activeActivities", "getActiveActivities$dd_sdk_android_rum_release", "Landroid/view/Display;", "display", "Landroid/view/Display;", "getDisplay$dd_sdk_android_rum_release", "()Landroid/view/Display;", "setDisplay$dd_sdk_android_rum_release", "(Landroid/view/Display;)V", "Lcom/datadog/android/rum/internal/vitals/JankStatsActivityLifecycleListener$DDFrameMetricsListener;", "frameMetricsListener", "Lcom/datadog/android/rum/internal/vitals/JankStatsActivityLifecycleListener$DDFrameMetricsListener;", "", "frameDeadline", "J", "getFrameDeadline$dd_sdk_android_rum_release", "()J", "setFrameDeadline$dd_sdk_android_rum_release", "(J)V", "Companion", "DDFrameMetricsListener", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class JankStatsActivityLifecycleListener implements Application.ActivityLifecycleCallbacks, ut7.a {
    public static final String JANK_STATS_TRACKING_ALREADY_DISABLED_ERROR = "Trying to disable JankStats instance which was already disabled before, this shouldn't happen.";
    public static final String JANK_STATS_TRACKING_DISABLE_ERROR = "Failed to disable JankStats tracking";
    private static final double MAX_FPS = 60.0d;
    private static final double MIN_FPS = 1.0d;
    private static final long SIXTEEN_MS_NS = 16666666;
    private static final double SIXTY_FPS = 60.0d;
    private final WeakHashMap<Window, List<WeakReference<Activity>>> activeActivities;
    private final WeakHashMap<Window, ut7> activeWindowsListener;
    private BuildSdkVersionProvider buildSdkVersionProvider;
    private Display display;
    private long frameDeadline;
    private DDFrameMetricsListener frameMetricsListener;
    private final InternalLogger internalLogger;
    private final JankStatsProvider jankStatsProvider;
    private double screenRefreshRate;
    private final VitalObserver vitalObserver;
    private static final double ONE_SECOND_NS = 1.0E9d;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/JankStatsActivityLifecycleListener$DDFrameMetricsListener;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "<init>", "(Lcom/datadog/android/rum/internal/vitals/JankStatsActivityLifecycleListener;)V", "Landroid/view/Window;", "window", "Landroid/view/FrameMetrics;", "frameMetrics", "", "dropCountSinceLastInvocation", "Lj6g;", "onFrameMetricsAvailable", "(Landroid/view/Window;Landroid/view/FrameMetrics;I)V", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public final class DDFrameMetricsListener implements Window.OnFrameMetricsAvailableListener {
        public DDFrameMetricsListener() {
        }

        @Override // android.view.Window.OnFrameMetricsAvailableListener
        public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int dropCountSinceLastInvocation) {
            window.getClass();
            frameMetrics.getClass();
            JankStatsActivityLifecycleListener.this.setFrameDeadline$dd_sdk_android_rum_release(frameMetrics.getMetric(13));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$onActivityStopped$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements Function1<WeakReference<Activity>, Boolean> {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(WeakReference<Activity> weakReference) {
            weakReference.getClass();
            return Boolean.valueOf(weakReference.get() == null || wl7.b(weakReference.get(), this.$activity));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$onActivityStopped$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        final /* synthetic */ Window $window;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Window window) {
            super(0);
            this.$window = window;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Disabling jankStats for window " + this.$window;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$trackWindowJankStats$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06141 extends mj8 implements gu5<String> {
        final /* synthetic */ Window $window;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06141(Window window) {
            super(0);
            this.$window = window;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Resuming jankStats for window " + this.$window;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$trackWindowJankStats$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06152 extends mj8 implements gu5<String> {
        final /* synthetic */ Window $window;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06152(Window window) {
            super(0);
            this.$window = window;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Starting jankStats for window " + this.$window;
        }
    }

    public JankStatsActivityLifecycleListener(VitalObserver vitalObserver, InternalLogger internalLogger, JankStatsProvider jankStatsProvider, double d, BuildSdkVersionProvider buildSdkVersionProvider) {
        vitalObserver.getClass();
        internalLogger.getClass();
        jankStatsProvider.getClass();
        buildSdkVersionProvider.getClass();
        this.vitalObserver = vitalObserver;
        this.internalLogger = internalLogger;
        this.jankStatsProvider = jankStatsProvider;
        this.screenRefreshRate = d;
        this.buildSdkVersionProvider = buildSdkVersionProvider;
        this.activeWindowsListener = new WeakHashMap<>();
        this.activeActivities = new WeakHashMap<>();
        this.frameDeadline = SIXTEEN_MS_NS;
    }

    private final void registerMetricListener(Window window) {
        if (this.frameMetricsListener == null) {
            this.frameMetricsListener = new DDFrameMetricsListener();
        }
        Handler handler = new Handler(Looper.getMainLooper());
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null || !viewPeekDecorView.isHardwareAccelerated()) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) C06132.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        DDFrameMetricsListener dDFrameMetricsListener = this.frameMetricsListener;
        if (dDFrameMetricsListener != null) {
            try {
                window.addOnFrameMetricsAvailableListener(dDFrameMetricsListener, handler);
            } catch (IllegalStateException e) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) JankStatsActivityLifecycleListener$registerMetricListener$1$1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            }
        }
    }

    private final void trackActivity(Window window, Activity activity) {
        List<WeakReference<Activity>> arrayList = this.activeActivities.get(window);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(new WeakReference<>(activity));
        this.activeActivities.put(window, arrayList);
    }

    private final void trackWindowJankStats(Window window) {
        ut7 ut7Var = this.activeWindowsListener.get(window);
        InternalLogger internalLogger = this.internalLogger;
        if (ut7Var != null) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.DEBUG, InternalLogger.Target.MAINTAINER, (gu5) new C06141(window), (Throwable) null, false, (Map) null, 56, (Object) null);
            ut7Var.b.Q(true);
            ut7Var.c = true;
            return;
        }
        InternalLogger.Level level = InternalLogger.Level.DEBUG;
        InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
        InternalLogger.DefaultImpls.log$default(internalLogger, level, target, (gu5) new C06152(window), (Throwable) null, false, (Map) null, 56, (Object) null);
        ut7 ut7VarCreateJankStatsAndTrack = this.jankStatsProvider.createJankStatsAndTrack(window, this, this.internalLogger);
        if (ut7VarCreateJankStatsAndTrack == null) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, target, (gu5) C06163.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        } else {
            this.activeWindowsListener.put(window, ut7VarCreateJankStatsAndTrack);
        }
    }

    @SuppressLint({"NewApi"})
    private final void trackWindowMetrics(boolean isKnownWindow, Window window, Activity activity) {
        if (this.buildSdkVersionProvider.getVersion() >= 31 && !isKnownWindow) {
            registerMetricListener(window);
        } else if (this.display == null && this.buildSdkVersionProvider.getVersion() == 30) {
            Object systemService = activity.getSystemService("display");
            systemService.getClass();
            this.display = ((DisplayManager) systemService).getDisplay(0);
        }
    }

    private final void unregisterMetricListener(Window window) {
        try {
            window.removeOnFrameMetricsAvailableListener(this.frameMetricsListener);
        } catch (IllegalArgumentException e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) C06171.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
        }
    }

    public final WeakHashMap<Window, List<WeakReference<Activity>>> getActiveActivities$dd_sdk_android_rum_release() {
        return this.activeActivities;
    }

    public final WeakHashMap<Window, ut7> getActiveWindowsListener$dd_sdk_android_rum_release() {
        return this.activeWindowsListener;
    }

    /* JADX INFO: renamed from: getDisplay$dd_sdk_android_rum_release, reason: from getter */
    public final Display getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: getFrameDeadline$dd_sdk_android_rum_release, reason: from getter */
    public final long getFrameDeadline() {
        return this.frameDeadline;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"NewApi"})
    public void onActivityDestroyed(Activity activity) {
        activity.getClass();
        List<WeakReference<Activity>> list = this.activeActivities.get(activity.getWindow());
        if (list == null || list.isEmpty()) {
            this.activeWindowsListener.remove(activity.getWindow());
            this.activeActivities.remove(activity.getWindow());
            if (this.buildSdkVersionProvider.getVersion() >= 31) {
                Window window = activity.getWindow();
                window.getClass();
                unregisterMetricListener(window);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        activity.getClass();
        outState.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        activity.getClass();
        Window window = activity.getWindow();
        window.getClass();
        trackActivity(window, activity);
        boolean zContainsKey = this.activeWindowsListener.containsKey(window);
        trackWindowJankStats(window);
        trackWindowMetrics(zContainsKey, window, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        Window window = activity.getWindow();
        if (!this.activeActivities.containsKey(window)) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        }
        List<WeakReference<Activity>> arrayList = this.activeActivities.get(window);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        w92.B0(arrayList, new AnonymousClass2(activity));
        this.activeActivities.put(window, arrayList);
        if (arrayList.isEmpty()) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.DEBUG, InternalLogger.Target.MAINTAINER, (gu5) new AnonymousClass3(window), (Throwable) null, false, (Map) null, 56, (Object) null);
            try {
                ut7 ut7Var = this.activeWindowsListener.get(window);
                if (ut7Var != null) {
                    if (!ut7Var.c) {
                        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, (gu5) JankStatsActivityLifecycleListener$onActivityStopped$4$1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
                    } else {
                        ut7Var.b.Q(false);
                        ut7Var.c = false;
                    }
                }
            } catch (IllegalArgumentException e) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, (gu5) AnonymousClass5.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            } catch (NullPointerException e2) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, (gu5) AnonymousClass6.INSTANCE, (Throwable) e2, false, (Map) null, 48, (Object) null);
            }
        }
    }

    @Override // ut7.a
    public void onFrame(rs5 volatileFrameData) {
        volatileFrameData.getClass();
        double d = volatileFrameData.c;
        if (d > 0.0d) {
            double d2 = ONE_SECOND_NS;
            double d3 = d2 / d;
            if (this.buildSdkVersionProvider.getVersion() >= 31) {
                this.screenRefreshRate = d2 / this.frameDeadline;
            } else if (this.buildSdkVersionProvider.getVersion() == 30) {
                this.screenRefreshRate = this.display != null ? r10.getRefreshRate() : 60.0d;
            }
            double d4 = (60.0d / this.screenRefreshRate) * d3;
            double d5 = d4 <= 60.0d ? d4 : 60.0d;
            if (d5 > MIN_FPS) {
                this.vitalObserver.onNewSample(d5);
            }
        }
    }

    public final void setDisplay$dd_sdk_android_rum_release(Display display) {
        this.display = display;
    }

    public final void setFrameDeadline$dd_sdk_android_rum_release(long j) {
        this.frameDeadline = j;
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$onActivityStopped$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Activity stopped but window was not tracked";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$onActivityStopped$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass5 extends mj8 implements gu5<String> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return JankStatsActivityLifecycleListener.JANK_STATS_TRACKING_DISABLE_ERROR;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$onActivityStopped$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass6 extends mj8 implements gu5<String> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return JankStatsActivityLifecycleListener.JANK_STATS_TRACKING_DISABLE_ERROR;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$registerMetricListener$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06132 extends mj8 implements gu5<String> {
        public static final C06132 INSTANCE = new C06132();

        public C06132() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Unable to attach JankStatsListener to window, decorView is null or not hardware accelerated";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$trackWindowJankStats$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06163 extends mj8 implements gu5<String> {
        public static final C06163 INSTANCE = new C06163();

        public C06163() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Unable to create JankStats";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$unregisterMetricListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06171 extends mj8 implements gu5<String> {
        public static final C06171 INSTANCE = new C06171();

        public C06171() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Unable to detach JankStatsListener to window, most probably because it wasn't attached";
        }
    }

    public /* synthetic */ JankStatsActivityLifecycleListener(VitalObserver vitalObserver, InternalLogger internalLogger, JankStatsProvider jankStatsProvider, double d, BuildSdkVersionProvider buildSdkVersionProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vitalObserver, internalLogger, (i & 4) != 0 ? JankStatsProvider.INSTANCE.getDEFAULT() : jankStatsProvider, (i & 8) != 0 ? 60.0d : d, (i & 16) != 0 ? BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }
}
