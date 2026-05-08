package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class njc {
    public final Activity a;
    public final String b;
    public g8b c;
    public mjc d;
    public ekc e;

    public class a extends ekc {
        public a(Activity activity, wmc wmcVar, String str, Bundle bundle, boolean z) {
            super(activity, wmcVar, str, bundle, z);
        }

        @Override // defpackage.ekc
        public final wnc a() {
            wnc wncVarCreateRootView = njc.this.createRootView();
            return wncVarCreateRootView == null ? super.a() : wncVarCreateRootView;
        }
    }

    @Deprecated
    public njc(Activity activity, String str) {
        this.a = activity;
        this.b = str;
    }

    public Bundle composeLaunchOptions() {
        return getLaunchOptions();
    }

    public wnc createRootView() {
        return null;
    }

    public Context getContext() {
        Activity activity = this.a;
        hh1.n(activity);
        return activity;
    }

    public ReactContext getCurrentReactContext() {
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        if (!ie7.g0.enableBridgelessArchitecture()) {
            return ekcVar.c().e();
        }
        rkc rkcVar = ekcVar.g;
        if (rkcVar != null) {
            return rkcVar.a();
        }
        return null;
    }

    public Bundle getLaunchOptions() {
        return null;
    }

    public String getMainComponentName() {
        return this.b;
    }

    public Activity getPlainActivity() {
        return (Activity) getContext();
    }

    public ljc getReactActivity() {
        return (ljc) getContext();
    }

    public ekc getReactDelegate() {
        return this.e;
    }

    public rkc getReactHost() {
        return ((pjc) getPlainActivity().getApplication()).b();
    }

    public fmc getReactInstanceManager() {
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        return ekcVar.c();
    }

    @Deprecated
    public wmc getReactNativeHost() {
        return ((pjc) getPlainActivity().getApplication()).getV();
    }

    public boolean isFabricEnabled() {
        return ie7.g0.enableFabricRenderer();
    }

    public boolean isWideColorGamutEnabled() {
        return false;
    }

    public void loadApp(String str) {
        wnc wncVar;
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        Objects.requireNonNull(str);
        ekcVar.d(str);
        Activity plainActivity = getPlainActivity();
        ekc ekcVar2 = this.e;
        ekcVar2.getClass();
        if (ie7.g0.enableBridgelessArchitecture()) {
            poc pocVar = ekcVar2.h;
            wncVar = pocVar != null ? (wnc) pocVar.b() : null;
        } else {
            wncVar = ekcVar2.b;
        }
        plainActivity.setContentView(wncVar);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        ekcVar.e(i, i2, intent, true);
    }

    public boolean onBackPressed() {
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        return ekcVar.f();
    }

    public void onConfigurationChanged(Configuration configuration) {
        AppearanceModule appearanceModule;
        rkc rkcVar;
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        Activity activity = ekcVar.a;
        if (ie7.g0.enableBridgelessArchitecture() && (rkcVar = ekcVar.g) != null) {
            if (activity != null) {
                rkcVar.g(activity);
                return;
            } else {
                r6.g("Required value was null.");
                return;
            }
        }
        wmc wmcVar = ekcVar.f;
        if (wmcVar == null || !wmcVar.e()) {
            return;
        }
        fmc fmcVarC = ekcVar.c();
        if (activity == null) {
            r6.g("Required value was null.");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextE = fmcVarC.e();
        if (reactContextE == null || (appearanceModule = (AppearanceModule) reactContextE.getNativeModule(AppearanceModule.class)) == null) {
            return;
        }
        appearanceModule.onConfigurationChanged(activity);
    }

    public void onCreate(Bundle bundle) {
        qx0 qx0Var = new qx0(this, 11);
        Trace.beginSection(jpf.g("ReactActivityDelegate.onCreate::init"));
        try {
            qx0Var.run();
        } finally {
            Trace.endSection();
        }
    }

    public void onDestroy() {
        wmc wmcVar;
        fmc fmcVarA;
        rkc rkcVar;
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        ekcVar.h();
        if (ie7.g0.enableBridgelessArchitecture() && (rkcVar = ekcVar.g) != null) {
            rkcVar.i(ekcVar.a);
            return;
        }
        wmc wmcVar2 = ekcVar.f;
        if (wmcVar2 == null || !wmcVar2.e() || (wmcVar = ekcVar.f) == null || (fmcVarA = wmcVar.a()) == null || ekcVar.a != fmcVarA.o) {
            return;
        }
        UiThreadUtil.assertOnUiThread();
        if (fmcVarA.i) {
            fmcVarA.h.k(false);
        }
        synchronized (fmcVarA) {
            try {
                ReactContext reactContextE = fmcVarA.e();
                if (reactContextE != null) {
                    if (fmcVarA.b == LifecycleState.c) {
                        reactContextE.onHostPause();
                        fmcVarA.b = LifecycleState.b;
                    }
                    if (fmcVarA.b == LifecycleState.b) {
                        reactContextE.onHostDestroy(false);
                    }
                }
                fmcVarA.b = LifecycleState.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        fmcVarA.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r3, android.view.KeyEvent r4) {
        /*
            r2 = this;
            ekc r2 = r2.e
            java.util.Objects.requireNonNull(r2)
            wmc r0 = r2.f
            r4.getClass()
            r1 = 90
            if (r3 != r1) goto L35
            qmc r3 = defpackage.ie7.g0
            boolean r3 = r3.enableBridgelessArchitecture()
            r1 = 1
            if (r3 == 0) goto L23
            rkc r2 = r2.g
            if (r2 == 0) goto L20
            w24 r2 = r2.getH()
            goto L21
        L20:
            r2 = 0
        L21:
            if (r2 != 0) goto L31
        L23:
            if (r0 == 0) goto L35
            boolean r2 = r0.e()
            if (r2 != r1) goto L35
            boolean r2 = r0.d()
            if (r2 != r1) goto L35
        L31:
            r4.startTracking()
            return r1
        L35:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njc.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        rkc rkcVar;
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        wmc wmcVar = ekcVar.f;
        if (i != 90) {
            return false;
        }
        if (ie7.g0.enableBridgelessArchitecture() && (rkcVar = ekcVar.g) != null) {
            w24 h = rkcVar.getH();
            if (h == null || (h instanceof zyc)) {
                return false;
            }
            h.A();
            return true;
        }
        if (wmcVar == null || !wmcVar.e() || !wmcVar.d()) {
            return false;
        }
        fmc fmcVarA = wmcVar.a();
        if (fmcVarA != null) {
            UiThreadUtil.assertOnUiThread();
            fmcVarA.h.A();
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        w24 w24VarB = ekcVar.b();
        if (w24VarB == null || (w24VarB instanceof zyc)) {
            return false;
        }
        if (i == 82) {
            w24VarB.A();
            return true;
        }
        a94 a94Var = ekcVar.e;
        if (!wl7.b(a94Var != null ? Boolean.valueOf(a94Var.a(ekcVar.a.getCurrentFocus(), i)) : null, Boolean.TRUE)) {
            return false;
        }
        w24VarB.w();
        return true;
    }

    public boolean onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        rkc rkcVar;
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        Objects.requireNonNull(intent);
        wmc wmcVar = ekcVar.f;
        if (ie7.g0.enableBridgelessArchitecture() && (rkcVar = ekcVar.g) != null) {
            rkcVar.onNewIntent(intent);
            return true;
        }
        if (wmcVar == null || !wmcVar.e()) {
            return false;
        }
        fmc fmcVarA = wmcVar.a();
        if (fmcVarA != null) {
            UiThreadUtil.assertOnUiThread();
            ReactContext reactContextE = fmcVarA.e();
            if (reactContextE == null) {
                s55.n(fmc.z, "Instance detached from instance manager");
                return true;
            }
            String action = intent.getAction();
            Uri data = intent.getData();
            if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) reactContextE.getNativeModule(DeviceEventManagerModule.class)) != null)) {
                deviceEventManagerModule.emitNewIntentReceived(data);
            }
            reactContextE.onNewIntent(fmcVarA.o, intent);
        }
        return true;
    }

    public void onPause() {
        wmc wmcVar;
        fmc fmcVarA;
        rkc rkcVar;
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        if (ie7.g0.enableBridgelessArchitecture() && (rkcVar = ekcVar.g) != null) {
            rkcVar.h(ekcVar.a);
            return;
        }
        wmc wmcVar2 = ekcVar.f;
        if (wmcVar2 != null) {
            if (!wmcVar2.e() || (wmcVar = ekcVar.f) == null || (fmcVarA = wmcVar.a()) == null) {
                return;
            }
            Activity activity = ekcVar.a;
            if (fmcVarA.j) {
                if (fmcVarA.o == null) {
                    s55.f(fmc.z, "ReactInstanceManager.onHostPause called with null activity");
                    for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                        s55.f(fmc.z, stackTraceElement.toString());
                    }
                }
                hh1.l(fmcVarA.o != null);
            }
            Activity activity2 = fmcVarA.o;
            if (activity2 != null) {
                hh1.m(activity == activity2, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + fmcVarA.o.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
            }
            UiThreadUtil.assertOnUiThread();
            fmcVarA.n = null;
            if (fmcVarA.i) {
                fmcVarA.h.k(false);
            }
            synchronized (fmcVarA) {
                try {
                    ReactContext reactContextE = fmcVarA.e();
                    if (reactContextE != null) {
                        if (fmcVarA.b == LifecycleState.a) {
                            reactContextE.onHostResume(fmcVarA.o);
                            reactContextE.onHostPause();
                        } else if (fmcVarA.b == LifecycleState.c) {
                            reactContextE.onHostPause();
                        }
                    }
                    fmcVarA.b = LifecycleState.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.d = new mjc(this, i, strArr, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void onResume() {
        fmc fmcVarA;
        rkc rkcVar;
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        wmc wmcVar = ekcVar.f;
        Activity activity = ekcVar.a;
        if (!(activity instanceof tn3)) {
            throw new ClassCastException(l5.m("Host Activity `", activity.getClass().getSimpleName(), "` does not implement DefaultHardwareBackBtnHandler"));
        }
        if (ie7.g0.enableBridgelessArchitecture() && (rkcVar = ekcVar.g) != null) {
            activity.getClass();
            rkcVar.l(activity, (tn3) activity);
        } else if (wmcVar != null && wmcVar.e() && (fmcVarA = wmcVar.a()) != null) {
            activity.getClass();
            UiThreadUtil.assertOnUiThread();
            fmcVarA.n = (tn3) activity;
            w24 w24Var = fmcVarA.h;
            UiThreadUtil.assertOnUiThread();
            fmcVarA.o = activity;
            if (fmcVarA.i) {
                View decorView = activity.getWindow().getDecorView();
                WeakHashMap<View, prg> weakHashMap = epg.a;
                if (decorView.isAttachedToWindow()) {
                    w24Var.k(true);
                } else {
                    decorView.addOnAttachStateChangeListener(new gmc(fmcVarA, decorView));
                }
            }
            fmcVarA.i(false);
        }
        mjc mjcVar = this.d;
        if (mjcVar != null) {
            mjcVar.invoke(new Object[0]);
            this.d = null;
        }
    }

    public void onUserLeaveHint() {
        fmc fmcVarA;
        Activity activity;
        rkc rkcVar;
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        wmc wmcVar = ekcVar.f;
        Activity activity2 = ekcVar.a;
        if (ie7.g0.enableBridgelessArchitecture() && (rkcVar = ekcVar.g) != null) {
            rkcVar.k(activity2);
            return;
        }
        if (wmcVar == null || !wmcVar.e() || (fmcVarA = wmcVar.a()) == null || (activity = fmcVarA.o) == null || activity2 != activity) {
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextE = fmcVarA.e();
        if (reactContextE != null) {
            reactContextE.onUserLeaveHint(activity2);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        fmc fmcVarA;
        rkc rkcVar;
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        wmc wmcVar = ekcVar.f;
        if (ie7.g0.enableBridgelessArchitecture() && (rkcVar = ekcVar.g) != null) {
            rkcVar.onWindowFocusChange(z);
            return;
        }
        if (wmcVar == null || !wmcVar.e() || (fmcVarA = wmcVar.a()) == null) {
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextE = fmcVarA.e();
        if (reactContextE != null) {
            reactContextE.onWindowFocusChange(z);
        }
    }

    public void requestPermissions(String[] strArr, int i, g8b g8bVar) {
        this.c = g8bVar;
        getPlainActivity().requestPermissions(strArr, i);
    }

    public void setReactRootView(wnc wncVar) {
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        ekcVar.b = wncVar;
    }

    public void setReactSurface(poc pocVar) {
        ekc ekcVar = this.e;
        Objects.requireNonNull(ekcVar);
        ekcVar.h = pocVar;
    }

    public njc(ljc ljcVar, String str) {
        this.a = ljcVar;
        this.b = str;
    }
}
