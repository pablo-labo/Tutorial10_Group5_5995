package com.indeed.android.myjobs.rnnextstepsdashboard;

import android.app.Activity;
import androidx.fragment.app.g;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseNextStepsDashboardModule;
import defpackage.at7;
import defpackage.cr8;
import defpackage.d8c;
import defpackage.ek9;
import defpackage.ft7;
import defpackage.i1g;
import defpackage.j6g;
import defpackage.lr5;
import defpackage.m8c;
import defpackage.nmc;
import defpackage.p9;
import defpackage.xdc;
import defpackage.xj1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseNextStepsDashboardModule.MODULE_NAME)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/indeed/android/myjobs/rnnextstepsdashboard/RNNextStepsDashboardModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseNextStepsDashboardModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "close", "(Lcom/facebook/react/bridge/Promise;)V", "", "rootTag", "showPushOptInModal", "(DLcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNNextStepsDashboardModule extends IndeedRNBridgeBaseNextStepsDashboardModule {
    public static final int $stable = 8;
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNNextStepsDashboardModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$2(RNNextStepsDashboardModule rNNextStepsDashboardModule, Promise promise) {
        try {
            Activity currentActivity = rNNextStepsDashboardModule.reactContext.getCurrentActivity();
            g gVar = currentActivity instanceof g ? (g) currentActivity : null;
            if (gVar == null) {
                promise.reject("ERROR", "Activity is not a FragmentActivity");
                return;
            }
            lr5 lr5VarU = gVar.u();
            lr5VarU.getClass();
            ((i1g) cr8.p(i1g.class)).c(lr5VarU, "RnNextStepsDashboardFragment");
            promise.resolve("SUCCESS");
        } catch (Exception e) {
            promise.reject("ERROR", "Failed to close Next Steps Dashboard: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPushOptInModal$lambda$4(RNNextStepsDashboardModule rNNextStepsDashboardModule, Promise promise) {
        try {
            Activity currentActivity = rNNextStepsDashboardModule.reactContext.getCurrentActivity();
            g gVar = currentActivity instanceof g ? (g) currentActivity : null;
            if (gVar == null) {
                promise.reject("ERROR", "Activity is not a FragmentActivity");
                return;
            }
            if (((at7) cr8.p(at7.class)).a() == ft7.c) {
                promise.resolve(Boolean.TRUE);
                return;
            }
            int i = 0;
            if (!new d8c(false).c(xj1.c, true)) {
                promise.resolve(Boolean.FALSE);
                return;
            }
            m8c m8cVar = new m8c();
            m8cVar.l0 = new xdc(i, promise);
            lr5 lr5VarU = gVar.u();
            lr5VarU.getClass();
            m8cVar.L(lr5VarU, "PushPrimerDialogFragment");
        } catch (Exception e) {
            promise.reject("ERROR", "Failed to show push opt-in modal: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g showPushOptInModal$lambda$4$lambda$3(Promise promise, boolean z) {
        promise.resolve(Boolean.valueOf(z));
        return j6g.a;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseNextStepsDashboardModule
    @ReactMethod
    public void close(Promise promise) {
        promise.getClass();
        if (this.reactContext.hasCurrentActivity()) {
            UiThreadUtil.runOnUiThread(new p9(5, this, promise));
        } else {
            promise.reject("ERROR", "No activity available to close");
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseNextStepsDashboardModule
    @ReactMethod
    public void showPushOptInModal(double rootTag, Promise promise) {
        promise.getClass();
        if (this.reactContext.hasCurrentActivity()) {
            UiThreadUtil.runOnUiThread(new ek9(2, this, promise));
        } else {
            promise.reject("ERROR", "No activity available");
        }
    }
}
