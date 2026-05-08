package com.datadog.android.rum.internal.tracking;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.internal.system.BuildSdkVersionProvider;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker;
import com.datadog.android.rum.internal.utils.ComponentPredicateExtKt;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import com.datadog.android.rum.tracking.ComponentPredicate;
import defpackage.d2f;
import defpackage.gu5;
import defpackage.gy0;
import defpackage.sy3;
import defpackage.u63;
import defpackage.wl7;
import defpackage.zve;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001;BQ\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010%\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0005H\u0017¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0005H\u0017¢\u0006\u0004\b)\u0010(R.\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010-R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010.R\u0016\u0010\u001a\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/datadog/android/rum/internal/tracking/OreoFragmentLifecycleCallbacks;", "Lcom/datadog/android/rum/internal/tracking/FragmentLifecycleCallbacks;", "Landroid/app/Activity;", "Landroid/app/FragmentManager$FragmentLifecycleCallbacks;", "Lkotlin/Function1;", "Landroid/app/Fragment;", "", "", "", "argumentsProvider", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "componentPredicate", "Lcom/datadog/android/rum/internal/RumFeature;", "rumFeature", "Lcom/datadog/android/rum/RumMonitor;", "rumMonitor", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/rum/internal/RumFeature;Lcom/datadog/android/rum/RumMonitor;Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;)V", "fragment", "", "isNotAViewFragment", "(Landroid/app/Fragment;)Z", "activity", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lj6g;", "register", "(Landroid/app/Activity;Lcom/datadog/android/api/SdkCore;)V", "unregister", "(Landroid/app/Activity;)V", "Landroid/app/FragmentManager;", "fm", "f", "Landroid/os/Bundle;", "savedInstanceState", "onFragmentActivityCreated", "(Landroid/app/FragmentManager;Landroid/app/Fragment;Landroid/os/Bundle;)V", "onFragmentResumed", "(Landroid/app/FragmentManager;Landroid/app/Fragment;)V", "onFragmentStopped", "Lkotlin/jvm/functions/Function1;", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Lcom/datadog/android/rum/internal/RumFeature;", "Lcom/datadog/android/rum/RumMonitor;", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Ljava/util/concurrent/ScheduledExecutorService;", "executor$delegate", "Lkotlin/Lazy;", "getExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class OreoFragmentLifecycleCallbacks extends FragmentManager.FragmentLifecycleCallbacks implements FragmentLifecycleCallbacks<Activity> {
    private static final Companion Companion = new Companion(null);
    private static final String REPORT_FRAGMENT_NAME = "androidx.lifecycle.ReportFragment";
    private static final long STOP_VIEW_DELAY_MS = 200;
    private final Function1<Fragment, Map<String, Object>> argumentsProvider;
    private final BuildSdkVersionProvider buildSdkVersionProvider;
    private final ComponentPredicate<Fragment> componentPredicate;

    /* JADX INFO: renamed from: executor$delegate, reason: from kotlin metadata */
    private final Lazy executor;
    private final RumFeature rumFeature;
    private final RumMonitor rumMonitor;
    private FeatureSdkCore sdkCore;

    /* JADX WARN: Multi-variable type inference failed */
    public OreoFragmentLifecycleCallbacks(Function1<? super Fragment, ? extends Map<String, ? extends Object>> function1, ComponentPredicate<Fragment> componentPredicate, RumFeature rumFeature, RumMonitor rumMonitor, BuildSdkVersionProvider buildSdkVersionProvider) {
        function1.getClass();
        componentPredicate.getClass();
        rumFeature.getClass();
        rumMonitor.getClass();
        buildSdkVersionProvider.getClass();
        this.argumentsProvider = function1;
        this.componentPredicate = componentPredicate;
        this.rumFeature = rumFeature;
        this.rumMonitor = rumMonitor;
        this.buildSdkVersionProvider = buildSdkVersionProvider;
        this.executor = new d2f(new OreoFragmentLifecycleCallbacks$executor$2(this));
    }

    public static /* synthetic */ void a(OreoFragmentLifecycleCallbacks oreoFragmentLifecycleCallbacks, Fragment fragment) {
        onFragmentStopped$lambda$2(oreoFragmentLifecycleCallbacks, fragment);
    }

    private final ScheduledExecutorService getExecutor() {
        return (ScheduledExecutorService) this.executor.getValue();
    }

    private final InternalLogger getInternalLogger() {
        FeatureSdkCore featureSdkCore = this.sdkCore;
        if (featureSdkCore == null) {
            return InternalLogger.INSTANCE.getUNBOUND();
        }
        if (featureSdkCore != null) {
            return featureSdkCore.getInternalLogger();
        }
        wl7.g("sdkCore");
        throw null;
    }

    private final boolean isNotAViewFragment(Fragment fragment) {
        return fragment.getClass().getName().equals(REPORT_FRAGMENT_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFragmentStopped$lambda$2(OreoFragmentLifecycleCallbacks oreoFragmentLifecycleCallbacks, Fragment fragment) {
        oreoFragmentLifecycleCallbacks.getClass();
        fragment.getClass();
        ComponentPredicate<Fragment> componentPredicate = oreoFragmentLifecycleCallbacks.componentPredicate;
        InternalLogger internalLogger = oreoFragmentLifecycleCallbacks.getInternalLogger();
        if (componentPredicate.accept(fragment)) {
            try {
                RumMonitor.DefaultImpls.stopView$default(oreoFragmentLifecycleCallbacks.rumMonitor, fragment, null, 2, null);
            } catch (Exception e) {
                InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) ComponentPredicateExtKt.AnonymousClass1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            }
        }
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    @sy3
    public void onFragmentActivityCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) {
        fm.getClass();
        f.getClass();
        super.onFragmentActivityCreated(fm, f, savedInstanceState);
        if (isNotAViewFragment(f)) {
            return;
        }
        Context context = f.getContext();
        if (!(f instanceof DialogFragment) || context == null || this.sdkCore == null) {
            return;
        }
        Dialog dialog = ((DialogFragment) f).getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        GesturesTracker gesturesTracker = this.rumFeature.getActionTrackingStrategy().getGesturesTracker();
        FeatureSdkCore featureSdkCore = this.sdkCore;
        if (featureSdkCore != null) {
            gesturesTracker.startTracking(window, context, featureSdkCore);
        } else {
            wl7.g("sdkCore");
            throw null;
        }
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    @sy3
    public void onFragmentResumed(FragmentManager fm, Fragment f) {
        fm.getClass();
        f.getClass();
        super.onFragmentResumed(fm, f);
        if (isNotAViewFragment(f)) {
            return;
        }
        ComponentPredicate<Fragment> componentPredicate = this.componentPredicate;
        InternalLogger internalLogger = getInternalLogger();
        if (componentPredicate.accept(f)) {
            try {
                String viewName = this.componentPredicate.getViewName(f);
                if (viewName == null || zve.U(viewName)) {
                    viewName = ViewUtilsKt.resolveViewUrl(f);
                }
                this.rumMonitor.startView(f, viewName, (Map) this.argumentsProvider.invoke(f));
            } catch (Exception e) {
                InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) ComponentPredicateExtKt.AnonymousClass1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            }
        }
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    @sy3
    public void onFragmentStopped(FragmentManager fm, Fragment f) {
        fm.getClass();
        f.getClass();
        super.onFragmentStopped(fm, f);
        if (isNotAViewFragment(f)) {
            return;
        }
        ScheduledExecutorService executor = getExecutor();
        FeatureSdkCore featureSdkCore = this.sdkCore;
        if (featureSdkCore == null) {
            wl7.g("sdkCore");
            throw null;
        }
        ConcurrencyExtKt.scheduleSafe(executor, "Delayed view stop", 200L, TimeUnit.MILLISECONDS, featureSdkCore.getInternalLogger(), new gy0(4, this, f));
    }

    @Override // com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks
    public void register(Activity activity, SdkCore sdkCore) {
        activity.getClass();
        sdkCore.getClass();
        this.sdkCore = (FeatureSdkCore) sdkCore;
        if (this.buildSdkVersionProvider.getVersion() >= 26) {
            activity.getFragmentManager().registerFragmentLifecycleCallbacks(this, true);
        }
    }

    @Override // com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks
    public void unregister(Activity activity) {
        activity.getClass();
        if (this.buildSdkVersionProvider.getVersion() >= 26) {
            activity.getFragmentManager().unregisterFragmentLifecycleCallbacks(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/tracking/OreoFragmentLifecycleCallbacks$Companion;", "", "()V", "REPORT_FRAGMENT_NAME", "", "STOP_VIEW_DELAY_MS", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ OreoFragmentLifecycleCallbacks(Function1 function1, ComponentPredicate componentPredicate, RumFeature rumFeature, RumMonitor rumMonitor, BuildSdkVersionProvider buildSdkVersionProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, componentPredicate, rumFeature, rumMonitor, (i & 16) != 0 ? BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }
}
