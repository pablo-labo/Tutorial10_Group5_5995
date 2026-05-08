package com.indeed.android.reactnative.rntarebridge.nav;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import androidx.navigation.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTNavigator;
import com.indeed.android.reactnative.rntarebridge.RNTareBridgeDetachmentException;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;
import defpackage.a3;
import defpackage.ai8;
import defpackage.cr8;
import defpackage.fj;
import defpackage.fwc;
import defpackage.iwc;
import defpackage.j6g;
import defpackage.j91;
import defpackage.jq7;
import defpackage.jt7;
import defpackage.kt7;
import defpackage.l;
import defpackage.l5;
import defpackage.lr5;
import defpackage.lt7;
import defpackage.m87;
import defpackage.mh2;
import defpackage.mqc;
import defpackage.ms7;
import defpackage.ndc;
import defpackage.ne;
import defpackage.nmc;
import defpackage.np7;
import defpackage.nq7;
import defpackage.odc;
import defpackage.oq7;
import defpackage.or;
import defpackage.pe0;
import defpackage.pq;
import defpackage.pq7;
import defpackage.qbc;
import defpackage.qpd;
import defpackage.qq7;
import defpackage.ra8;
import defpackage.rdc;
import defpackage.rq7;
import defpackage.tdc;
import defpackage.tv;
import defpackage.ui;
import defpackage.vh8;
import defpackage.wi;
import defpackage.x71;
import defpackage.xh8;
import defpackage.z24;
import defpackage.z92;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseRNJSTNavigator.MODULE_NAME)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0019\u0010\u0013J3\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001f\u0010\u000eJ)\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$¨\u0006%"}, d2 = {"Lcom/indeed/android/reactnative/rntarebridge/nav/RNJSTNavigator;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseRNJSTNavigator;", "Lxh8;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "closeTareSdkDebugModal", "(Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "landingScreen", "from", "navigateTo", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "args", "origin", "openSearchOverlayModal", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "modalScreen", "openModal", "routeName", "routeProps", "stackAction", "showRNModal", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "hideRNModal", "", "preferFullScreenModal", "openProfileResumeDataImportModal", "(ZLjava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNJSTNavigator extends IndeedRNBridgeBaseRNJSTNavigator implements xh8 {
    public static final int $stable = 8;
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNJSTNavigator(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void hideRNModal$lambda$20(RNJSTNavigator rNJSTNavigator, Promise promise) {
        qpd qpdVarD;
        iwc iwcVar;
        try {
            ((np7) cr8.p(np7.class)).a(IndeedRNBridgeBaseRNJSTNavigator.MODULE_NAME, "hideRNModal()");
            if (rNJSTNavigator instanceof ai8) {
                qpdVarD = ((ai8) rNJSTNavigator).d();
                iwcVar = fwc.a;
            } else {
                qpdVarD = (qpd) rNJSTNavigator.getKoin().a.b;
                iwcVar = fwc.a;
            }
            ((qbc) qpdVarD.a(null, iwcVar.b(qbc.class), null)).a();
            promise.resolve(null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNJSTNavigator.MODULE_NAME, "hideRNModal() error", false, e);
            promise.reject("HIDE_MODAL_ERROR", "hideRNModal() error", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void navigateTo$lambda$0(RNJSTNavigator rNJSTNavigator, jq7 jq7Var, String str, Promise promise) throws RNTareBridgeDetachmentException {
        e eVarK;
        Activity currentActivity = rNJSTNavigator.reactContext.getCurrentActivity();
        currentActivity.getClass();
        lr5 lr5VarU = ((g) currentActivity).u();
        lr5VarU.getClass();
        List<Fragment> listF = lr5VarU.c.f();
        listF.getClass();
        Fragment fragment = (Fragment) z92.Q0(listF);
        if (fragment == null || (eVarK = mh2.k(fragment)) == null) {
            throw new RNTareBridgeDetachmentException();
        }
        ((rq7) cr8.p(rq7.class)).f(lr5VarU, eVarK, jq7Var, str);
        promise.resolve(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openModal$lambda$15(ReadableMap readableMap, RNJSTNavigator rNJSTNavigator, String str, Promise promise) {
        nq7<?> aVar;
        int i = 0;
        try {
            ra8 ra8Var = mqc.a;
            if (readableMap == null) {
                throw new IllegalArgumentException("ReadableMap cannot be null");
            }
            qq7 qq7Var = (qq7) mqc.a.d(qq7.Companion.serializer(), mqc.b(readableMap));
            Activity currentActivity = rNJSTNavigator.reactContext.getCurrentActivity();
            currentActivity.getClass();
            lr5 lr5VarU = ((g) currentActivity).u();
            lr5VarU.getClass();
            rq7 rq7Var = (rq7) cr8.p(rq7.class);
            if (qq7Var instanceof qq7.j) {
                aVar = new nq7.h((qq7.j) qq7Var, new ui(promise, 12));
            } else {
                int i2 = 17;
                if (qq7Var instanceof qq7.d) {
                    aVar = new nq7.c((qq7.d) qq7Var, new a3(promise, i2));
                } else if (qq7Var instanceof qq7.m) {
                    aVar = new nq7.k((qq7.m) qq7Var, new tdc(i, promise));
                } else if (qq7Var instanceof qq7.l) {
                    aVar = new nq7.j((qq7.l) qq7Var, new wi(promise, 8));
                } else if (qq7Var instanceof qq7.e) {
                    aVar = new nq7.d((qq7.e) qq7Var, new tv(promise, 19));
                } else {
                    int i3 = 14;
                    if (qq7Var instanceof qq7.i) {
                        aVar = new nq7.g((qq7.i) qq7Var, new pq(promise, i3));
                    } else if (qq7Var instanceof qq7.b) {
                        aVar = new nq7.b((qq7.b) qq7Var, new or(promise, i2));
                    } else if (qq7Var instanceof qq7.k) {
                        aVar = new nq7.i((qq7.k) qq7Var, new fj(promise, i2));
                    } else if (qq7Var instanceof qq7.f) {
                        aVar = new nq7.e((qq7.f) qq7Var, new pe0(promise, 10));
                    } else if (qq7Var instanceof qq7.h) {
                        aVar = new nq7.f((qq7.h) qq7Var, new ndc(i, promise));
                    } else {
                        if (!(qq7Var instanceof qq7.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = new nq7.a((qq7.a) qq7Var, new j91(promise, i3));
                    }
                }
            }
            rq7Var.c(lr5VarU, aVar, str);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNJSTNavigator.MODULE_NAME, "openModal error", false, e);
            promise.reject(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openModal$lambda$15$lambda$10(Promise promise, oq7.b bVar) {
        bVar.getClass();
        promise.resolve(pq7.a(bVar));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openModal$lambda$15$lambda$11(Promise promise, oq7.j jVar) {
        jVar.getClass();
        promise.resolve(pq7.a(jVar));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openModal$lambda$15$lambda$12(Promise promise, oq7.f fVar) {
        fVar.getClass();
        promise.resolve(pq7.a(fVar));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openModal$lambda$15$lambda$13(Promise promise, oq7.g gVar) {
        gVar.getClass();
        promise.resolve(pq7.a(gVar));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openModal$lambda$15$lambda$14(Promise promise, oq7.a aVar) {
        aVar.getClass();
        promise.resolve(pq7.a(aVar));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openModal$lambda$15$lambda$4(Promise promise, oq7.i iVar) {
        iVar.getClass();
        promise.resolve(pq7.a(iVar));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openModal$lambda$15$lambda$5(Promise promise, oq7.d dVar) {
        dVar.getClass();
        promise.resolve(pq7.a(dVar));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openModal$lambda$15$lambda$6(Promise promise, oq7.l lVar) {
        lVar.getClass();
        promise.resolve(pq7.a(lVar));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openModal$lambda$15$lambda$7(Promise promise, oq7.k kVar) {
        kVar.getClass();
        promise.resolve(pq7.a(kVar));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openModal$lambda$15$lambda$8(Promise promise, oq7.e eVar) {
        eVar.getClass();
        promise.resolve(pq7.a(eVar));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openModal$lambda$15$lambda$9(Promise promise, oq7.h hVar) {
        hVar.getClass();
        promise.resolve(pq7.a(hVar));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openProfileResumeDataImportModal$lambda$22(RNJSTNavigator rNJSTNavigator, Promise promise) {
        try {
            Activity currentActivity = rNJSTNavigator.reactContext.getCurrentActivity();
            g gVar = currentActivity instanceof g ? (g) currentActivity : null;
            if (gVar == null) {
                promise.reject(new Exception("Current activity is not a FragmentActivity"));
                return;
            }
            lr5 lr5VarU = gVar.u();
            lr5VarU.getClass();
            ((rq7) cr8.p(rq7.class)).i(lr5VarU, new ne(promise, 13));
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNJSTNavigator.MODULE_NAME, "openProfileResumeDataImportModal error", false, e);
            promise.reject(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openProfileResumeDataImportModal$lambda$22$lambda$21(Promise promise, ms7 ms7Var) {
        ms7Var.getClass();
        int iOrdinal = ms7Var.ordinal();
        if (iOrdinal == 0) {
            promise.resolve("CANCELLED");
        } else if (iOrdinal == 1) {
            promise.resolve("COMPLETED");
        } else {
            if (iOrdinal != 2) {
                l.g();
                return null;
            }
            promise.resolve("CANCELLED");
        }
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openSearchOverlayModal$lambda$3(RNJSTNavigator rNJSTNavigator, jt7 jt7Var, String str, String str2, final Promise promise) throws RNTareBridgeDetachmentException {
        final e eVarK;
        Activity currentActivity = rNJSTNavigator.reactContext.getCurrentActivity();
        currentActivity.getClass();
        final lr5 lr5VarU = ((g) currentActivity).u();
        lr5VarU.getClass();
        List<Fragment> listF = lr5VarU.c.f();
        listF.getClass();
        Fragment fragment = (Fragment) z92.Q0(listF);
        if (fragment == null || (eVarK = mh2.k(fragment)) == null) {
            throw new RNTareBridgeDetachmentException();
        }
        ((rq7) cr8.p(rq7.class)).h(lr5VarU, jt7Var, str, new kt7() { // from class: pdc
            @Override // defpackage.kt7
            public final void a(lt7 lt7Var) {
                RNJSTNavigator.openSearchOverlayModal$lambda$3$lambda$2(promise, lr5VarU, eVarK, lt7Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openSearchOverlayModal$lambda$3$lambda$2(Promise promise, FragmentManager fragmentManager, e eVar, lt7 lt7Var) {
        lt7Var.getClass();
        if (lt7Var instanceof lt7.a) {
            promise.resolve(null);
        } else if (!(lt7Var instanceof lt7.b)) {
            l.g();
        } else {
            UiThreadUtil.runOnUiThread(new odc(0, fragmentManager, eVar, lt7Var));
            promise.resolve(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openSearchOverlayModal$lambda$3$lambda$2$lambda$1(FragmentManager fragmentManager, e eVar, lt7 lt7Var) {
        ((rq7) cr8.p(rq7.class)).f(fragmentManager, eVar, new jq7.a0(((lt7.b) lt7Var).a), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showRNModal$lambda$19(String str, RNJSTNavigator rNJSTNavigator, Promise promise, ReadableMap readableMap, String str2) {
        qpd qpdVarD;
        iwc iwcVar;
        try {
            ((np7) cr8.p(np7.class)).a(IndeedRNBridgeBaseRNJSTNavigator.MODULE_NAME, "showRNModal(" + str + ")");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("routeName", str);
            if (readableMap != null) {
                writableMapCreateMap.putMap("routeProps", readableMap);
            }
            if (str2 != null) {
                writableMapCreateMap.putString("stackAction", str2);
            }
            if (rNJSTNavigator instanceof ai8) {
                qpdVarD = ((ai8) rNJSTNavigator).d();
                iwcVar = fwc.a;
            } else {
                qpdVarD = (qpd) rNJSTNavigator.getKoin().a.b;
                iwcVar = fwc.a;
            }
            ((qbc) qpdVarD.a(null, iwcVar.b(qbc.class), null)).b(writableMapCreateMap);
            promise.resolve(null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNJSTNavigator.MODULE_NAME, l5.m("showRNModal(", str, ") error"), false, e);
            promise.reject("SHOW_MODAL_ERROR", l5.m("showRNModal(", str, ") error"), e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTNavigator
    @ReactMethod
    public void closeTareSdkDebugModal(Promise promise) {
        promise.getClass();
        if (!this.reactContext.hasCurrentActivity()) {
            promise.reject("ERROR", "No activity available");
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        currentActivity.getClass();
        lr5 lr5VarU = ((g) currentActivity).u();
        lr5VarU.getClass();
        ((rq7) cr8.p(rq7.class)).g(lr5VarU);
        promise.resolve(null);
    }

    @Override // defpackage.xh8
    public vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTNavigator, com.facebook.react.bridge.NativeModule
    public String getName() {
        return IndeedRNBridgeBaseRNJSTNavigator.MODULE_NAME;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTNavigator
    @ReactMethod
    public void hideRNModal(Promise promise) {
        promise.getClass();
        if (this.reactContext.hasCurrentActivity()) {
            UiThreadUtil.runOnUiThread(new x71(4, this, promise));
        } else {
            promise.reject("ERROR", "No activity available");
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTNavigator
    @ReactMethod
    public void navigateTo(ReadableMap landingScreen, String from, Promise promise) {
        landingScreen.getClass();
        promise.getClass();
        if (!this.reactContext.hasCurrentActivity()) {
            promise.reject("ERROR", "No activity available");
        } else {
            UiThreadUtil.runOnUiThread(new m87(this, (jq7) mqc.a.d(jq7.Companion.serializer(), mqc.b(landingScreen)), from, promise));
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTNavigator
    @ReactMethod
    public void openModal(final ReadableMap modalScreen, final String from, final Promise promise) {
        modalScreen.getClass();
        promise.getClass();
        if (this.reactContext.hasCurrentActivity()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: sdc
                @Override // java.lang.Runnable
                public final void run() {
                    RNJSTNavigator.openModal$lambda$15(modalScreen, this, from, promise);
                }
            });
        } else {
            promise.reject("ERROR", "No activity available");
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTNavigator
    @ReactMethod
    public void openProfileResumeDataImportModal(boolean preferFullScreenModal, String from, Promise promise) {
        promise.getClass();
        if (this.reactContext.hasCurrentActivity()) {
            UiThreadUtil.runOnUiThread(new z24(3, this, promise));
        } else {
            promise.reject("ERROR", "No activity available");
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTNavigator
    @ReactMethod
    public void openSearchOverlayModal(ReadableMap args, final String origin, final String from, final Promise promise) {
        args.getClass();
        promise.getClass();
        if (!this.reactContext.hasCurrentActivity()) {
            promise.reject("ERROR", "No activity available to open the Search Overlay Modal");
            return;
        }
        final jt7 jt7Var = (jt7) mqc.a.d(jt7.Companion.serializer(), mqc.b(args));
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: qdc
            @Override // java.lang.Runnable
            public final void run() throws RNTareBridgeDetachmentException {
                RNJSTNavigator.openSearchOverlayModal$lambda$3(this.a, jt7Var, origin, from, promise);
            }
        });
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTNavigator
    @ReactMethod
    public void showRNModal(String routeName, ReadableMap routeProps, String stackAction, Promise promise) {
        routeName.getClass();
        promise.getClass();
        if (this.reactContext.hasCurrentActivity()) {
            UiThreadUtil.runOnUiThread(new rdc(routeName, this, promise, routeProps, stackAction));
        } else {
            promise.reject("ERROR", "No activity available");
        }
    }
}
