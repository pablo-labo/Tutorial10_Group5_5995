package com.datadog.android.rum.tracking;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.navigation.e;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.k;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.rum.NoOpRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.event.RumEventMeta;
import com.datadog.android.rum.internal.tracking.AndroidXFragmentLifecycleCallbacks;
import com.datadog.android.rum.internal.utils.ComponentPredicateExtKt;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import defpackage.bs4;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mca;
import defpackage.mj8;
import defpackage.u63;
import defpackage.zve;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B)\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u000f*\u00020\u00122\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0017¢\u0006\u0004\b\u001a\u0010\u0018J)\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0016¢\u0006\u0004\b#\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020*0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010&¨\u00060"}, d2 = {"Lcom/datadog/android/rum/tracking/NavigationViewTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ActivityLifecycleTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "Landroidx/navigation/e$b;", "", "navigationViewId", "", "trackArguments", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Landroidx/navigation/k;", "componentPredicate", "<init>", "(IZLcom/datadog/android/rum/tracking/ComponentPredicate;)V", "Landroid/app/Activity;", RumEventMeta.VIEW_ID_KEY, "Landroidx/navigation/e;", "findNavControllerOrNull", "(Landroid/app/Activity;I)Landroidx/navigation/e;", "Landroidx/fragment/app/g;", "findNavControllerFromNavHostFragmentOrNull", "(Landroidx/fragment/app/g;I)Landroidx/navigation/e;", "activity", "Lj6g;", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "onActivityPaused", "controller", "destination", "Landroid/os/Bundle;", "arguments", "onDestinationChanged", "(Landroidx/navigation/e;Landroidx/navigation/k;Landroid/os/Bundle;)V", "startTracking", "()V", "stopTracking", "I", "Z", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "startedActivity", "Landroid/app/Activity;", "Ljava/util/WeakHashMap;", "Lcom/datadog/android/rum/tracking/NavigationViewTrackingStrategy$NavControllerFragmentLifecycleCallbacks;", "lifecycleCallbackRefs", "Ljava/util/WeakHashMap;", "Landroidx/fragment/app/Fragment;", "predicate", "NavControllerFragmentLifecycleCallbacks", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NavigationViewTrackingStrategy extends ActivityLifecycleTrackingStrategy implements ViewTrackingStrategy, e.b {
    private final ComponentPredicate<k> componentPredicate;
    private WeakHashMap<Activity, NavControllerFragmentLifecycleCallbacks> lifecycleCallbackRefs;
    private final int navigationViewId;
    private final ComponentPredicate<Fragment> predicate;
    private Activity startedActivity;
    private final boolean trackArguments;

    public NavigationViewTrackingStrategy(int i, boolean z, ComponentPredicate<k> componentPredicate) {
        componentPredicate.getClass();
        this.navigationViewId = i;
        this.trackArguments = z;
        this.componentPredicate = componentPredicate;
        this.lifecycleCallbackRefs = new WeakHashMap<>();
        this.predicate = new ComponentPredicate<Fragment>() { // from class: com.datadog.android.rum.tracking.NavigationViewTrackingStrategy$predicate$1
            @Override // com.datadog.android.rum.tracking.ComponentPredicate
            public boolean accept(Fragment component) {
                component.getClass();
                return !NavHostFragment.class.isAssignableFrom(component.getClass());
            }

            @Override // com.datadog.android.rum.tracking.ComponentPredicate
            public String getViewName(Fragment component) {
                component.getClass();
                return null;
            }
        };
    }

    private final e findNavControllerFromNavHostFragmentOrNull(g gVar, int i) {
        Fragment fragmentC = gVar.u().C(i);
        NavHostFragment navHostFragment = fragmentC instanceof NavHostFragment ? (NavHostFragment) fragmentC : null;
        if (navHostFragment != null) {
            return navHostFragment.D();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e findNavControllerOrNull(Activity activity, int i) {
        try {
            e eVarFindNavControllerFromNavHostFragmentOrNull = activity instanceof g ? findNavControllerFromNavHostFragmentOrNull((g) activity, i) : null;
            return eVarFindNavControllerFromNavHostFragmentOrNull == null ? mca.a(activity, i) : eVarFindNavControllerFromNavHostFragmentOrNull;
        } catch (IllegalArgumentException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        k kVarI;
        activity.getClass();
        super.onActivityPaused(activity);
        RumMonitor rumMonitor = (RumMonitor) withSdkCore(NavigationViewTrackingStrategy$onActivityPaused$rumMonitor$1.INSTANCE);
        e eVarFindNavControllerOrNull = findNavControllerOrNull(activity, this.navigationViewId);
        if (eVarFindNavControllerOrNull == null || (kVarI = eVarFindNavControllerOrNull.i()) == null || rumMonitor == null) {
            return;
        }
        RumMonitor.DefaultImpls.stopView$default(rumMonitor, kVarI, null, 2, null);
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        activity.getClass();
        super.onActivityStarted(activity);
        this.startedActivity = activity;
        startTracking();
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        super.onActivityStopped(activity);
        stopTracking();
        this.startedActivity = null;
    }

    @Override // androidx.navigation.e.b
    public void onDestinationChanged(e controller, k destination, Bundle arguments) {
        controller.getClass();
        destination.getClass();
        RumMonitor rumMonitor = (RumMonitor) withSdkCore(NavigationViewTrackingStrategy$onDestinationChanged$rumMonitor$1.INSTANCE);
        ComponentPredicate<k> componentPredicate = this.componentPredicate;
        InternalLogger internalLogger$dd_sdk_android_rum_release = getInternalLogger$dd_sdk_android_rum_release();
        if (componentPredicate.accept(destination)) {
            try {
                Map<String, ? extends Object> mapConvertToRumViewAttributes = this.trackArguments ? BundleExtKt.convertToRumViewAttributes(arguments) : bs4.a;
                String viewName = this.componentPredicate.getViewName(destination);
                if (viewName == null || zve.U(viewName)) {
                    viewName = ViewUtilsKt.resolveViewUrl(destination);
                }
                if (rumMonitor != null) {
                    rumMonitor.startView(destination, viewName, mapConvertToRumViewAttributes);
                }
            } catch (Exception e) {
                InternalLogger.DefaultImpls.log$default(internalLogger$dd_sdk_android_rum_release, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) ComponentPredicateExtKt.AnonymousClass1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            }
        }
    }

    public final void startTracking() {
        Activity activity = this.startedActivity;
        if (activity == null) {
            return;
        }
        withSdkCore(new AnonymousClass1(activity, this));
    }

    public final void stopTracking() {
        e eVarFindNavControllerOrNull;
        NavControllerFragmentLifecycleCallbacks navControllerFragmentLifecycleCallbacksRemove;
        Activity activity = this.startedActivity;
        if (activity == null || (eVarFindNavControllerOrNull = findNavControllerOrNull(activity, this.navigationViewId)) == null) {
            return;
        }
        eVarFindNavControllerOrNull.q.remove(this);
        if (!g.class.isAssignableFrom(activity.getClass()) || (navControllerFragmentLifecycleCallbacksRemove = this.lifecycleCallbackRefs.remove(activity)) == null) {
            return;
        }
        navControllerFragmentLifecycleCallbacksRemove.unregister((g) activity);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/datadog/android/rum/tracking/NavigationViewTrackingStrategy$NavControllerFragmentLifecycleCallbacks;", "Lcom/datadog/android/rum/internal/tracking/AndroidXFragmentLifecycleCallbacks;", "Landroidx/navigation/e;", "navController", "Lkotlin/Function1;", "Landroidx/fragment/app/Fragment;", "", "", "", "argumentsProvider", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "componentPredicate", "Lcom/datadog/android/rum/internal/RumFeature;", "rumFeature", "<init>", "(Landroidx/navigation/e;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/rum/internal/RumFeature;)V", "fragment", "resolveKey", "(Landroidx/fragment/app/Fragment;)Ljava/lang/Object;", "Landroidx/navigation/e;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class NavControllerFragmentLifecycleCallbacks extends AndroidXFragmentLifecycleCallbacks {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Object NO_DESTINATION_FOUND = new Object();
        private final e navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavControllerFragmentLifecycleCallbacks(e eVar, Function1<? super Fragment, ? extends Map<String, ? extends Object>> function1, ComponentPredicate<Fragment> componentPredicate, RumFeature rumFeature) {
            super(function1, componentPredicate, rumFeature, new NoOpRumMonitor());
            eVar.getClass();
            function1.getClass();
            componentPredicate.getClass();
            rumFeature.getClass();
            this.navController = eVar;
        }

        @Override // com.datadog.android.rum.internal.tracking.AndroidXFragmentLifecycleCallbacks
        public Object resolveKey(Fragment fragment) {
            fragment.getClass();
            k kVarI = this.navController.i();
            return kVarI == null ? NO_DESTINATION_FOUND : kVarI;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/datadog/android/rum/tracking/NavigationViewTrackingStrategy$NavControllerFragmentLifecycleCallbacks$Companion;", "", "()V", "NO_DESTINATION_FOUND", "getNO_DESTINATION_FOUND", "()Ljava/lang/Object;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Object getNO_DESTINATION_FOUND() {
                return NavControllerFragmentLifecycleCallbacks.NO_DESTINATION_FOUND;
            }

            private Companion() {
            }
        }
    }

    public /* synthetic */ NavigationViewTrackingStrategy(int i, boolean z, ComponentPredicate componentPredicate, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, (i2 & 4) != 0 ? new AcceptAllNavDestinations() : componentPredicate);
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.tracking.NavigationViewTrackingStrategy$startTracking$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lj6g;", "invoke", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements Function1<FeatureSdkCore, j6g> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ NavigationViewTrackingStrategy this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, NavigationViewTrackingStrategy navigationViewTrackingStrategy) {
            super(1);
            this.$activity = activity;
            this.this$0 = navigationViewTrackingStrategy;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FeatureSdkCore featureSdkCore) {
            featureSdkCore.getClass();
            FeatureScope feature = featureSdkCore.getFeature("rum");
            RumFeature rumFeature = feature != null ? (RumFeature) feature.unwrap() : null;
            Activity activity = this.$activity;
            g gVar = activity instanceof g ? (g) activity : null;
            NavigationViewTrackingStrategy navigationViewTrackingStrategy = this.this$0;
            e eVarFindNavControllerOrNull = navigationViewTrackingStrategy.findNavControllerOrNull(activity, navigationViewTrackingStrategy.navigationViewId);
            if (gVar == null || eVarFindNavControllerOrNull == null || rumFeature == null) {
                return;
            }
            NavControllerFragmentLifecycleCallbacks navControllerFragmentLifecycleCallbacks = new NavControllerFragmentLifecycleCallbacks(eVarFindNavControllerOrNull, NavigationViewTrackingStrategy$startTracking$1$navControllerFragmentCallbacks$1.INSTANCE, this.this$0.predicate, rumFeature);
            Activity activity2 = this.this$0.startedActivity;
            activity2.getClass();
            navControllerFragmentLifecycleCallbacks.register((g) activity2, (SdkCore) featureSdkCore);
            this.this$0.lifecycleCallbackRefs.put(this.this$0.startedActivity, navControllerFragmentLifecycleCallbacks);
            eVarFindNavControllerOrNull.b(this.this$0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(FeatureSdkCore featureSdkCore) {
            invoke2(featureSdkCore);
            return j6g.a;
        }
    }
}
