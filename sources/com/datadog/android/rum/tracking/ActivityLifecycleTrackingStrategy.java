package com.datadog.android.rum.tracking;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum._RumInternalProxy;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.wl7;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0018\u0010\u0011J!\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001b\u0010\u0011J+\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000\u001dH\u0004¢\u0006\u0004\b \u0010!R\"\u0010\u0006\u001a\u00020\u001e8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/datadog/android/rum/tracking/ActivityLifecycleTrackingStrategy;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lcom/datadog/android/rum/tracking/TrackingStrategy;", "<init>", "()V", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lj6g;", "register", "(Lcom/datadog/android/api/SdkCore;Landroid/content/Context;)V", "unregister", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStarted", "onActivityDestroyed", "Landroid/os/Bundle;", "outState", "onActivitySaveInstanceState", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStopped", "savedInstanceState", "onActivityCreated", "onActivityResumed", "T", "Lkotlin/Function1;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "block", "withSdkCore", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getSdkCore", "()Lcom/datadog/android/api/feature/FeatureSdkCore;", "setSdkCore", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_rum_release", "()Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class ActivityLifecycleTrackingStrategy implements Application.ActivityLifecycleCallbacks, TrackingStrategy {
    public static final String EXTRA_SYNTHETICS_RESULT_ID = "_dd.synthetics.result_id";
    public static final String EXTRA_SYNTHETICS_TEST_ID = "_dd.synthetics.test_id";
    protected FeatureSdkCore sdkCore;

    public final InternalLogger getInternalLogger$dd_sdk_android_rum_release() {
        return this.sdkCore != null ? getSdkCore().getInternalLogger() : InternalLogger.INSTANCE.getUNBOUND();
    }

    public final FeatureSdkCore getSdkCore() {
        FeatureSdkCore featureSdkCore = this.sdkCore;
        if (featureSdkCore != null) {
            return featureSdkCore;
        }
        wl7.g("sdkCore");
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        _RumInternalProxy internalProxy;
        activity.getClass();
        if (this.sdkCore == null || (internalProxy = GlobalRumMonitor.get(getSdkCore()).getInternalProxy()) == null) {
            return;
        }
        Intent intent = activity.getIntent();
        intent.getClass();
        internalProxy.setSyntheticsAttributeFromIntent$dd_sdk_android_rum_release(intent);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        activity.getClass();
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public void register(SdkCore sdkCore, Context context) {
        sdkCore.getClass();
        context.getClass();
        if (!(context instanceof Application)) {
            InternalLogger.DefaultImpls.log$default(((FeatureSdkCore) sdkCore).getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        } else {
            setSdkCore((FeatureSdkCore) sdkCore);
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void setSdkCore(FeatureSdkCore featureSdkCore) {
        featureSdkCore.getClass();
        this.sdkCore = featureSdkCore;
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public void unregister(Context context) {
        if (context instanceof Application) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this);
        }
    }

    public final <T> T withSdkCore(Function1<? super FeatureSdkCore, ? extends T> block) {
        block.getClass();
        if (this.sdkCore != null) {
            return block.invoke(getSdkCore());
        }
        InternalLogger.DefaultImpls.log$default(InternalLogger.INSTANCE.getUNBOUND(), InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) C06241.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        return null;
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy$register$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "In order to use the RUM automatic tracking feature you will have to use the Application context when initializing the SDK";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy$withSdkCore$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06241 extends mj8 implements gu5<String> {
        public static final C06241 INSTANCE = new C06241();

        public C06241() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "RUM feature is not initialized yet, you need to register it with a SDK instance by calling SdkCore#registerFeature method. Cannot provide SDK instance for view tracking.";
        }
    }
}
