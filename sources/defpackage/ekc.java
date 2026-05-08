package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: loaded from: classes2.dex */
public class ekc {
    public final Activity a;
    public wnc b;
    public final String c;
    public final Bundle d;
    public final a94 e;
    public final wmc f;
    public final rkc g;
    public poc h;
    public final boolean i;

    public ekc(Activity activity, rkc rkcVar, String str, Bundle bundle) {
        activity.getClass();
        this.i = ie7.g0.enableFabricRenderer();
        this.a = activity;
        this.c = str;
        this.d = bundle;
        this.e = new a94();
        this.g = rkcVar;
    }

    public wnc a() {
        wnc wncVar = new wnc(this.a);
        wncVar.setIsFabric(this.i);
        return wncVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.w24 b() {
        /*
            r3 = this;
            qmc r0 = defpackage.ie7.g0
            boolean r0 = r0.enableBridgelessArchitecture()
            r1 = 0
            if (r0 == 0) goto L1c
            rkc r0 = r3.g
            if (r0 == 0) goto L12
            w24 r2 = r0.getH()
            goto L13
        L12:
            r2 = r1
        L13:
            if (r2 == 0) goto L1c
            if (r0 == 0) goto L36
            w24 r3 = r0.getH()
            return r3
        L1c:
            wmc r3 = r3.f
            if (r3 == 0) goto L36
            boolean r0 = r3.e()
            r2 = 1
            if (r0 != r2) goto L36
            fmc r0 = r3.a()
            if (r0 == 0) goto L36
            fmc r3 = r3.a()
            if (r3 == 0) goto L36
            w24 r3 = r3.h
            return r3
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekc.b():w24");
    }

    @sy3
    public final fmc c() {
        wmc wmcVar = this.f;
        if (wmcVar == null) {
            r6.g("Cannot get ReactInstanceManager without a ReactNativeHost.");
            return null;
        }
        fmc fmcVarA = wmcVar.a();
        fmcVarA.getClass();
        return fmcVarA;
    }

    public final void d(String str) {
        Bundle bundle = this.d;
        str.getClass();
        if (ie7.g0.enableBridgelessArchitecture()) {
            rkc rkcVar = this.g;
            if (this.h == null && rkcVar != null) {
                this.h = rkcVar.b(this.a, str, bundle);
            }
            poc pocVar = this.h;
            if (pocVar != null) {
                pocVar.start();
                return;
            }
            return;
        }
        if (this.b != null) {
            r6.g("Cannot loadApp while app is already running.");
            return;
        }
        wnc wncVarA = a();
        this.b = wncVarA;
        wmc wmcVar = this.f;
        if (wmcVar != null) {
            fmc fmcVarA = wmcVar.a();
            Trace.beginSection(jpf.g("startReactApplication"));
            try {
                UiThreadUtil.assertOnUiThread();
                hh1.m(wncVarA.a == null, "This root view has already been attached to a catalyst instance manager");
                wncVarA.a = fmcVarA;
                wncVarA.b = str;
                wncVarA.c = bundle;
                fmcVarA.getClass();
                s55.b(fmc.z, "ReactInstanceManager.createReactContextInBackground()");
                UiThreadUtil.assertOnUiThread();
                if (!fmcVarA.r) {
                    fmcVarA.r = true;
                    fmcVarA.l();
                }
                if (ie7.g0.enableEagerRootViewAttachment()) {
                    if (!wncVarA.c0) {
                        DisplayMetrics displayMetrics = wncVarA.getContext().getResources().getDisplayMetrics();
                        wncVarA.d0 = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
                        wncVarA.e0 = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
                    }
                    wncVarA.d();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(int i, int i2, Intent intent, boolean z) {
        fmc fmcVarA;
        ReactContext reactContextE;
        rkc rkcVar;
        boolean zEnableBridgelessArchitecture = ie7.g0.enableBridgelessArchitecture();
        Activity activity = this.a;
        if (zEnableBridgelessArchitecture && (rkcVar = this.g) != null && z) {
            rkcVar.onActivityResult(activity, i, i2, intent);
            return;
        }
        wmc wmcVar = this.f;
        if (wmcVar == null || !wmcVar.e() || !z || (fmcVarA = wmcVar.a()) == null || (reactContextE = fmcVarA.e()) == null) {
            return;
        }
        reactContextE.onActivityResult(activity, i, i2, intent);
    }

    public final boolean f() {
        fmc fmcVarA;
        rkc rkcVar;
        if (ie7.g0.enableBridgelessArchitecture() && (rkcVar = this.g) != null) {
            rkcVar.f();
            return true;
        }
        wmc wmcVar = this.f;
        if (wmcVar == null || !wmcVar.e()) {
            return false;
        }
        wmc wmcVar2 = this.f;
        if (wmcVar2 != null && (fmcVarA = wmcVar2.a()) != null) {
            UiThreadUtil.assertOnUiThread();
            BridgeReactContext bridgeReactContext = fmcVarA.l;
            if (bridgeReactContext == null) {
                s55.n(fmc.z, "Instance detached from instance manager");
                fmcVarA.h();
                return true;
            }
            DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) bridgeReactContext.getNativeModule(DeviceEventManagerModule.class);
            if (deviceEventManagerModule != null) {
                deviceEventManagerModule.emitHardwareBackPressed();
            }
        }
        return true;
    }

    public final void g() {
        w24 w24VarB = b();
        if (w24VarB == null) {
            return;
        }
        if (!(w24VarB instanceof zyc)) {
            w24VarB.w();
            return;
        }
        if (!ie7.g0.enableBridgelessArchitecture()) {
            UiThreadUtil.runOnUiThread(new l60(this, 2));
            return;
        }
        rkc rkcVar = this.g;
        if (rkcVar != null) {
            rkcVar.d("ReactDelegate.reload()");
        }
    }

    public final void h() {
        BridgeReactContext bridgeReactContext;
        if (ie7.g0.enableBridgelessArchitecture()) {
            poc pocVar = this.h;
            if (pocVar != null) {
                pocVar.stop();
            }
            this.h = null;
            return;
        }
        wnc wncVar = this.b;
        if (wncVar != null) {
            UiThreadUtil.assertOnUiThread();
            fmc fmcVar = wncVar.a;
            if (fmcVar != null && wncVar.f) {
                UiThreadUtil.assertOnUiThread();
                if (fmcVar.a.remove(wncVar) && (bridgeReactContext = fmcVar.l) != null && bridgeReactContext.hasActiveReactInstance()) {
                    fmc.d(wncVar, bridgeReactContext);
                }
                wncVar.f = false;
            }
            wncVar.a = null;
            wncVar.V = false;
            this.b = null;
        }
    }

    @sy3
    public ekc(Activity activity, wmc wmcVar, String str, Bundle bundle, boolean z) {
        activity.getClass();
        ie7.g0.enableFabricRenderer();
        this.i = z;
        this.a = activity;
        this.c = str;
        this.d = bundle;
        this.e = new a94();
        this.f = wmcVar;
    }
}
