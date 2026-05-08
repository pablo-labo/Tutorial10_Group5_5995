package com.datadog.android.rum.tracking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.utils.ComponentPredicateExtKt;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import defpackage.bs4;
import defpackage.d2f;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.p9;
import defpackage.u63;
import defpackage.wl7;
import defpackage.zve;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010.\u001a\u0004\u0018\u00010+*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/datadog/android/rum/tracking/ActivityViewTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ActivityLifecycleTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "", "trackExtras", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Landroid/app/Activity;", "componentPredicate", "<init>", "(ZLcom/datadog/android/rum/tracking/ComponentPredicate;)V", "Lcom/datadog/android/rum/RumMonitor;", "getRumMonitor", "()Lcom/datadog/android/rum/RumMonitor;", "Landroid/content/Intent;", "intent", "", "", "", "convertToRumAttributes", "(Landroid/content/Intent;)Ljava/util/Map;", "activity", "Lj6g;", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityStopped", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "getTrackExtras$dd_sdk_android_rum_release", "()Z", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "getComponentPredicate$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Ljava/util/concurrent/ScheduledExecutorService;", "executor$delegate", "Lkotlin/Lazy;", "getExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Landroid/os/Bundle;", "getSafeExtras", "(Landroid/content/Intent;)Landroid/os/Bundle;", "safeExtras", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ActivityViewTrackingStrategy extends ActivityLifecycleTrackingStrategy implements ViewTrackingStrategy {
    public static final String INTENT_ACTION_TAG = "view.intent.action";
    public static final String INTENT_URI_TAG = "view.intent.uri";
    private static final long STOP_VIEW_DELAY_MS = 200;
    private final ComponentPredicate<Activity> componentPredicate;

    /* JADX INFO: renamed from: executor$delegate, reason: from kotlin metadata */
    private final Lazy executor;
    private final boolean trackExtras;

    /* JADX INFO: renamed from: com.datadog.android.rum.tracking.ActivityViewTrackingStrategy$getRumMonitor$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/datadog/android/rum/RumMonitor;", "it", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements Function1<FeatureSdkCore, RumMonitor> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final RumMonitor invoke(FeatureSdkCore featureSdkCore) {
            featureSdkCore.getClass();
            return GlobalRumMonitor.get(featureSdkCore);
        }
    }

    public ActivityViewTrackingStrategy(boolean z, ComponentPredicate<Activity> componentPredicate) {
        componentPredicate.getClass();
        this.trackExtras = z;
        this.componentPredicate = componentPredicate;
        this.executor = new d2f(new ActivityViewTrackingStrategy$executor$2(this));
    }

    private final Map<String, Object> convertToRumAttributes(Intent intent) {
        if (intent == null) {
            return bs4.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String action = intent.getAction();
        if (action != null) {
            linkedHashMap.put(INTENT_ACTION_TAG, action);
        }
        String dataString = intent.getDataString();
        if (dataString != null) {
            linkedHashMap.put(INTENT_URI_TAG, dataString);
        }
        linkedHashMap.putAll(BundleExtKt.convertToRumViewAttributes(getSafeExtras(intent)));
        return linkedHashMap;
    }

    private final ScheduledExecutorService getExecutor() {
        return (ScheduledExecutorService) this.executor.getValue();
    }

    private final RumMonitor getRumMonitor() {
        return (RumMonitor) withSdkCore(AnonymousClass1.INSTANCE);
    }

    private final Bundle getSafeExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            InternalLogger.DefaultImpls.log$default(this.getInternalLogger$dd_sdk_android_rum_release(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) ActivityViewTrackingStrategy$safeExtras$1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityStopped$lambda$2(ActivityViewTrackingStrategy activityViewTrackingStrategy, Activity activity) {
        activityViewTrackingStrategy.getClass();
        activity.getClass();
        ComponentPredicate<Activity> componentPredicate = activityViewTrackingStrategy.componentPredicate;
        InternalLogger internalLogger$dd_sdk_android_rum_release = activityViewTrackingStrategy.getInternalLogger$dd_sdk_android_rum_release();
        if (componentPredicate.accept(activity)) {
            try {
                RumMonitor rumMonitor = activityViewTrackingStrategy.getRumMonitor();
                if (rumMonitor != null) {
                    RumMonitor.DefaultImpls.stopView$default(rumMonitor, activity, null, 2, null);
                }
            } catch (Exception e) {
                InternalLogger.DefaultImpls.log$default(internalLogger$dd_sdk_android_rum_release, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) ComponentPredicateExtKt.AnonymousClass1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            }
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ActivityViewTrackingStrategy.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        ActivityViewTrackingStrategy activityViewTrackingStrategy = (ActivityViewTrackingStrategy) other;
        return this.trackExtras == activityViewTrackingStrategy.trackExtras && wl7.b(this.componentPredicate, activityViewTrackingStrategy.componentPredicate);
    }

    public final ComponentPredicate<Activity> getComponentPredicate$dd_sdk_android_rum_release() {
        return this.componentPredicate;
    }

    /* JADX INFO: renamed from: getTrackExtras$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getTrackExtras() {
        return this.trackExtras;
    }

    public int hashCode() {
        return this.componentPredicate.hashCode() + (Boolean.hashCode(this.trackExtras) * 31);
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
        super.onActivityResumed(activity);
        ComponentPredicate<Activity> componentPredicate = this.componentPredicate;
        InternalLogger internalLogger$dd_sdk_android_rum_release = getInternalLogger$dd_sdk_android_rum_release();
        if (componentPredicate.accept(activity)) {
            try {
                String viewName = this.componentPredicate.getViewName(activity);
                if (viewName == null || zve.U(viewName)) {
                    viewName = ViewUtilsKt.resolveViewUrl(activity);
                }
                Map<String, ? extends Object> mapConvertToRumAttributes = this.trackExtras ? convertToRumAttributes(activity.getIntent()) : bs4.a;
                RumMonitor rumMonitor = getRumMonitor();
                if (rumMonitor != null) {
                    rumMonitor.startView(activity, viewName, mapConvertToRumAttributes);
                }
            } catch (Exception e) {
                InternalLogger.DefaultImpls.log$default(internalLogger$dd_sdk_android_rum_release, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) ComponentPredicateExtKt.AnonymousClass1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            }
        }
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        super.onActivityStopped(activity);
        ConcurrencyExtKt.scheduleSafe(getExecutor(), "Delayed view stop", 200L, TimeUnit.MILLISECONDS, getInternalLogger$dd_sdk_android_rum_release(), new p9(0, this, activity));
    }

    public /* synthetic */ ActivityViewTrackingStrategy(boolean z, ComponentPredicate componentPredicate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new AcceptAllActivities() : componentPredicate);
    }

    public ActivityViewTrackingStrategy(boolean z) {
        this(z, null, 2, 0 == true ? 1 : 0);
    }
}
