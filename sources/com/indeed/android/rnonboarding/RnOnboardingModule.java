package com.indeed.android.rnonboarding;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseOnboardingNativeModule;
import defpackage.a9c;
import defpackage.ai8;
import defpackage.b24;
import defpackage.boa;
import defpackage.cr8;
import defpackage.fwc;
import defpackage.gu5;
import defpackage.j6;
import defpackage.j6g;
import defpackage.jq7;
import defpackage.kq7;
import defpackage.ky0;
import defpackage.lr5;
import defpackage.m91;
import defpackage.mh2;
import defpackage.mj8;
import defpackage.my0;
import defpackage.nmc;
import defpackage.qpd;
import defpackage.qt8;
import defpackage.rq7;
import defpackage.uqe;
import defpackage.ura;
import defpackage.vh8;
import defpackage.wi0;
import defpackage.xh8;
import defpackage.z92;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseOnboardingNativeModule.MODULE_NAME)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/indeed/android/rnonboarding/RnOnboardingModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseOnboardingNativeModule;", "Lxh8;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/indeed/android/rnonboarding/RnOnboardingFragment;", "getRnOnboardingFragment", "()Lcom/indeed/android/rnonboarding/RnOnboardingFragment;", "", "surfaceFactors", "", "isSkippedAllQuestions", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "onCompleteOnboarding", "(Ljava/lang/String;ZLcom/facebook/react/bridge/Promise;)V", "", "rootTag", "triggerPushPrimer", "(DLcom/facebook/react/bridge/Promise;)V", "requestAndDetectLocation", "(Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lb24;", "detectLocationHandler$delegate", "Lkotlin/Lazy;", "getDetectLocationHandler", "()Lb24;", "detectLocationHandler", "rnonboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RnOnboardingModule extends IndeedRNBridgeBaseOnboardingNativeModule implements xh8 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: detectLocationHandler$delegate, reason: from kotlin metadata */
    private final Lazy detectLocationHandler;
    private final ReactApplicationContext reactContext;

    public static final class a extends mj8 implements gu5<b24> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RnOnboardingModule rnOnboardingModule) {
            super(0);
            this.$this_inject = rnOnboardingModule;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [b24, java.lang.Object] */
        @Override // defpackage.gu5
        public final b24 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(b24.class), a9cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RnOnboardingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
        this.detectLocationHandler = boa.E(qt8.a, new a(this));
    }

    private final b24 getDetectLocationHandler() {
        return (b24) this.detectLocationHandler.getValue();
    }

    private final RnOnboardingFragment getRnOnboardingFragment() throws RnOnboardingModuleFragmentDetachmentException {
        FragmentManager childFragmentManager;
        List<Fragment> listF;
        Fragment fragment;
        Activity currentActivity = this.reactContext.getCurrentActivity();
        currentActivity.getClass();
        lr5 lr5VarU = ((wi0) currentActivity).u();
        lr5VarU.getClass();
        List<Fragment> listF2 = lr5VarU.c.f();
        listF2.getClass();
        Fragment fragment2 = (Fragment) z92.Q0(listF2);
        if (fragment2 == null || (childFragmentManager = fragment2.getChildFragmentManager()) == null || (listF = childFragmentManager.c.f()) == null || (fragment = (Fragment) z92.Q0(listF)) == null) {
            throw new RnOnboardingModuleFragmentDetachmentException();
        }
        return (RnOnboardingFragment) fragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCompleteOnboarding$lambda$1(RnOnboardingFragment rnOnboardingFragment, Map map) {
        rq7 rq7Var = (rq7) cr8.p(rq7.class);
        FragmentManager parentFragmentManager = rnOnboardingFragment.getParentFragmentManager();
        parentFragmentManager.getClass();
        rq7Var.f(parentFragmentManager, mh2.k(rnOnboardingFragment), new jq7.i(map), "rnonboarding");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void triggerPushPrimer$lambda$3(FragmentManager fragmentManager, Promise promise) {
        m91 m91Var = new m91(promise, 10);
        fragmentManager.getClass();
        ura uraVar = new ura();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        uraVar.j0 = m91Var;
        aVar.c("OnboardingPushPrimerFragment");
        uraVar.K(aVar, "OnboardingPushPrimerFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g triggerPushPrimer$lambda$3$lambda$2(Promise promise, boolean z) {
        promise.resolve(Boolean.valueOf(z));
        return j6g.a;
    }

    @Override // defpackage.xh8
    public vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseOnboardingNativeModule
    @ReactMethod
    public void onCompleteOnboarding(String surfaceFactors, boolean isSkippedAllQuestions, Promise promise) throws RnOnboardingModuleFragmentDetachmentException {
        surfaceFactors.getClass();
        promise.getClass();
        ((kq7) cr8.p(kq7.class)).e("Onboarding", "OnboardingCompleted", true);
        ((kq7) cr8.p(kq7.class)).e("Onboarding", "AllQuestionsSkipped", isSkippedAllQuestions);
        RnOnboardingFragment rnOnboardingFragment = getRnOnboardingFragment();
        Map mapC = j6.c("onboardingData", surfaceFactors);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapC.entrySet()) {
            if (((CharSequence) entry.getValue()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        UiThreadUtil.runOnUiThread(new ky0(7, rnOnboardingFragment, linkedHashMap));
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseOnboardingNativeModule
    @ReactMethod
    public void requestAndDetectLocation(Promise promise) throws RnOnboardingModuleFragmentDetachmentException {
        promise.getClass();
        RnOnboardingFragment rnOnboardingFragment = getRnOnboardingFragment();
        b24 detectLocationHandler = getDetectLocationHandler();
        detectLocationHandler.getClass();
        detectLocationHandler.c = promise;
        uqe uqeVar = detectLocationHandler.d;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        detectLocationHandler.d = null;
        if (rnOnboardingFragment.j()) {
            getDetectLocationHandler().b();
        } else {
            rnOnboardingFragment.A();
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseOnboardingNativeModule
    @ReactMethod
    public void triggerPushPrimer(double rootTag, Promise promise) {
        promise.getClass();
        Activity currentActivity = this.reactContext.getCurrentActivity();
        currentActivity.getClass();
        lr5 lr5VarU = ((wi0) currentActivity).u();
        lr5VarU.getClass();
        UiThreadUtil.runOnUiThread(new my0(5, lr5VarU, promise));
    }
}
