package com.datadog.android.rum.internal.tracking;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import androidx.fragment.app.k;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker;
import com.datadog.android.rum.internal.utils.ComponentPredicateExtKt;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import com.datadog.android.rum.tracking.ComponentPredicate;
import defpackage.d2f;
import defpackage.gu5;
import defpackage.u63;
import defpackage.vb0;
import defpackage.wl7;
import defpackage.zve;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001ABG\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010#\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0005H\u0017¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0005H\u0017¢\u0006\u0004\b'\u0010&J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010*R4\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R\"\u0010\u0018\u001a\u0002018\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0018\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/datadog/android/rum/internal/tracking/AndroidXFragmentLifecycleCallbacks;", "Lcom/datadog/android/rum/internal/tracking/FragmentLifecycleCallbacks;", "Landroidx/fragment/app/g;", "Landroidx/fragment/app/FragmentManager$k;", "Lkotlin/Function1;", "Landroidx/fragment/app/Fragment;", "", "", "", "argumentsProvider", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "componentPredicate", "Lcom/datadog/android/rum/internal/RumFeature;", "rumFeature", "Lcom/datadog/android/rum/RumMonitor;", "rumMonitor", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/rum/internal/RumFeature;Lcom/datadog/android/rum/RumMonitor;)V", "f", "Lj6g;", "startGesturesTracking", "(Landroidx/fragment/app/Fragment;)V", "activity", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "register", "(Landroidx/fragment/app/g;Lcom/datadog/android/api/SdkCore;)V", "unregister", "(Landroidx/fragment/app/g;)V", "Landroidx/fragment/app/FragmentManager;", "fm", "Landroid/view/View;", "v", "Landroid/os/Bundle;", "savedInstanceState", "onFragmentViewCreated", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;)V", "onFragmentResumed", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V", "onFragmentStopped", "fragment", "resolveKey", "(Landroidx/fragment/app/Fragment;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "getArgumentsProvider$dd_sdk_android_rum_release", "()Lkotlin/jvm/functions/Function1;", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Lcom/datadog/android/rum/internal/RumFeature;", "Lcom/datadog/android/rum/RumMonitor;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getSdkCore", "()Lcom/datadog/android/api/feature/FeatureSdkCore;", "setSdkCore", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "Ljava/util/concurrent/ScheduledExecutorService;", "executor$delegate", "Lkotlin/Lazy;", "getExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class AndroidXFragmentLifecycleCallbacks extends FragmentManager.k implements FragmentLifecycleCallbacks<g> {
    public static final long STOP_VIEW_DELAY_MS = 200;
    private final Function1<Fragment, Map<String, Object>> argumentsProvider;
    private final ComponentPredicate<Fragment> componentPredicate;

    /* JADX INFO: renamed from: executor$delegate, reason: from kotlin metadata */
    private final Lazy executor;
    private final RumFeature rumFeature;
    private final RumMonitor rumMonitor;
    protected FeatureSdkCore sdkCore;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidXFragmentLifecycleCallbacks(Function1<? super Fragment, ? extends Map<String, ? extends Object>> function1, ComponentPredicate<Fragment> componentPredicate, RumFeature rumFeature, RumMonitor rumMonitor) {
        function1.getClass();
        componentPredicate.getClass();
        rumFeature.getClass();
        rumMonitor.getClass();
        this.argumentsProvider = function1;
        this.componentPredicate = componentPredicate;
        this.rumFeature = rumFeature;
        this.rumMonitor = rumMonitor;
        this.executor = new d2f(new AndroidXFragmentLifecycleCallbacks$executor$2(this));
    }

    private final ScheduledExecutorService getExecutor() {
        return (ScheduledExecutorService) this.executor.getValue();
    }

    private final InternalLogger getInternalLogger() {
        return this.sdkCore != null ? getSdkCore().getInternalLogger() : InternalLogger.INSTANCE.getUNBOUND();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFragmentStopped$lambda$2(AndroidXFragmentLifecycleCallbacks androidXFragmentLifecycleCallbacks, Fragment fragment) {
        androidXFragmentLifecycleCallbacks.getClass();
        fragment.getClass();
        ComponentPredicate<Fragment> componentPredicate = androidXFragmentLifecycleCallbacks.componentPredicate;
        InternalLogger internalLogger = androidXFragmentLifecycleCallbacks.getInternalLogger();
        if (componentPredicate.accept(fragment)) {
            try {
                RumMonitor.DefaultImpls.stopView$default(androidXFragmentLifecycleCallbacks.rumMonitor, androidXFragmentLifecycleCallbacks.resolveKey(fragment), null, 2, null);
            } catch (Exception e) {
                InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) ComponentPredicateExtKt.AnonymousClass1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            }
        }
    }

    private final void startGesturesTracking(Fragment f) {
        Context context = f.getContext();
        if (context == null || !(f instanceof f) || this.sdkCore == null) {
            return;
        }
        GesturesTracker gesturesTracker = this.rumFeature.getActionTrackingStrategy().getGesturesTracker();
        Dialog dialog = ((f) f).a0;
        gesturesTracker.startTracking(dialog != null ? dialog.getWindow() : null, context, getSdkCore());
    }

    public final Function1<Fragment, Map<String, Object>> getArgumentsProvider$dd_sdk_android_rum_release() {
        return this.argumentsProvider;
    }

    public final FeatureSdkCore getSdkCore() {
        FeatureSdkCore featureSdkCore = this.sdkCore;
        if (featureSdkCore != null) {
            return featureSdkCore;
        }
        wl7.g("sdkCore");
        throw null;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void onFragmentResumed(FragmentManager fm, Fragment f) {
        fm.getClass();
        f.getClass();
        super.onFragmentResumed(fm, f);
        ComponentPredicate<Fragment> componentPredicate = this.componentPredicate;
        InternalLogger internalLogger = getInternalLogger();
        if (componentPredicate.accept(f)) {
            try {
                Object objResolveKey = resolveKey(f);
                String viewName = this.componentPredicate.getViewName(f);
                if (viewName == null || zve.U(viewName)) {
                    viewName = ViewUtilsKt.resolveViewUrl(f);
                }
                this.rumMonitor.startView(objResolveKey, viewName, (Map) this.argumentsProvider.invoke(f));
            } catch (Exception e) {
                InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) ComponentPredicateExtKt.AnonymousClass1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void onFragmentStopped(FragmentManager fm, Fragment f) {
        fm.getClass();
        f.getClass();
        super.onFragmentStopped(fm, f);
        ConcurrencyExtKt.scheduleSafe(getExecutor(), "Delayed view stop", 200L, TimeUnit.MILLISECONDS, getSdkCore().getInternalLogger(), new vb0(0, this, f));
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void onFragmentViewCreated(FragmentManager fm, Fragment f, View v, Bundle savedInstanceState) {
        fm.getClass();
        f.getClass();
        v.getClass();
        super.onFragmentViewCreated(fm, f, v, savedInstanceState);
        startGesturesTracking(f);
    }

    @Override // com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks
    public void register(g activity, SdkCore sdkCore) {
        activity.getClass();
        sdkCore.getClass();
        setSdkCore((FeatureSdkCore) sdkCore);
        activity.u().n.a.add(new k.a(this, true));
    }

    public Object resolveKey(Fragment fragment) {
        fragment.getClass();
        return fragment;
    }

    public final void setSdkCore(FeatureSdkCore featureSdkCore) {
        featureSdkCore.getClass();
        this.sdkCore = featureSdkCore;
    }

    @Override // com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks
    public void unregister(g activity) {
        activity.getClass();
        activity.u().i0(this);
    }
}
