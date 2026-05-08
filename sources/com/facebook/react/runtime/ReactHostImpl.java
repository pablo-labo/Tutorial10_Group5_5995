package com.facebook.react.runtime;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashBridgeNotAllowedSoftException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.defaults.DefaultReactHostDelegate;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.runtime.a;
import com.facebook.react.uimanager.UIManagerModule;
import defpackage.alc;
import defpackage.c74;
import defpackage.ev5;
import defpackage.f84;
import defpackage.fi6;
import defpackage.gaf;
import defpackage.hh1;
import defpackage.hzh;
import defpackage.ie7;
import defpackage.j6g;
import defpackage.kbc;
import defpackage.ke0;
import defpackage.ku2;
import defpackage.ky1;
import defpackage.m6;
import defpackage.maf;
import defpackage.nlc;
import defpackage.nmc;
import defpackage.q2;
import defpackage.qoc;
import defpackage.qz8;
import defpackage.r91;
import defpackage.rkc;
import defpackage.roc;
import defpackage.s55;
import defpackage.tn3;
import defpackage.vlc;
import defpackage.vu5;
import defpackage.w24;
import defpackage.x15;
import defpackage.x70;
import defpackage.xf7;
import defpackage.ykc;
import defpackage.ym1;
import defpackage.z3;
import defpackage.zm1;
import defpackage.zn9;
import defpackage.zyc;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImpl;", "Lrkc;", "", "message", "Lj6g;", "setPausedInDebuggerMessage", "(Ljava/lang/String;)V", "url", "Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;", "listener", "loadNetworkResource", "(Ljava/lang/String;Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;)V", "", "getHostMetadata", "()Ljava/util/Map;", "hostMetadata", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@f84
public final class ReactHostImpl implements rkc {
    public static final AtomicInteger A = new AtomicInteger(0);
    public final Context a;
    public final DefaultReactHostDelegate b;
    public final ComponentFactory c;
    public final Executor d;
    public final Executor e;
    public final boolean f;
    public final boolean g;
    public final w24 h;
    public final zn9 i;
    public final HashSet j;
    public final com.facebook.react.runtime.a<maf<ReactInstance>> k;
    public ReactInstance l;
    public final com.facebook.react.runtime.a<zm1> m;
    public final AtomicReference<Activity> n;
    public final AtomicReference<WeakReference<Activity>> o;
    public final ke0 p;
    public final hzh q;
    public final int r;
    public nlc s;
    public tn3 t;
    public final CopyOnWriteArrayList u;
    public final CopyOnWriteArrayList v;
    public ReactHostInspectorTarget w;
    public maf<Void> x;
    public maf<ReactInstance> y;
    public maf<Void> z;

    public static final class a {
        public final ReactInstance a;
        public final zm1 b;
        public final boolean c;

        public a(ReactInstance reactInstance, zm1 zm1Var, boolean z) {
            this.a = reactInstance;
            this.b = zm1Var;
            this.c = z;
        }
    }

    public static final class b implements ku2, ev5 {
        public final /* synthetic */ q2 a;

        public b(q2 q2Var) {
            this.a = q2Var;
        }

        @Override // defpackage.ku2
        public final /* synthetic */ Object a(maf mafVar) {
            return this.a.invoke(mafVar);
        }

        @Override // defpackage.ev5
        public final vu5<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ku2) && (obj instanceof ev5)) {
                return this.a == ((ev5) obj).c();
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class c implements w24.a {
        public c() {
        }

        @Override // w24.a
        public final void a() {
            UiThreadUtil.assertOnUiThread();
            ReactHostInspectorTarget reactHostInspectorTarget = ReactHostImpl.this.w;
            if (reactHostInspectorTarget != null) {
                reactHostInspectorTarget.sendDebuggerResumeCommand();
            }
        }
    }

    public ReactHostImpl(Context context, DefaultReactHostDelegate defaultReactHostDelegate, ComponentFactory componentFactory, boolean z) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        maf<Void> mafVar = maf.g;
        this.a = context;
        this.b = defaultReactHostDelegate;
        this.c = componentFactory;
        this.d = executorServiceNewSingleThreadExecutor;
        this.e = x15.a;
        this.f = true;
        this.g = z;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.h = z ? new ym1(applicationContext, new vlc(this), defaultReactHostDelegate.getJsMainModulePath()) : new zyc();
        this.i = new zn9(context);
        this.j = new HashSet();
        maf<Void> mafVar2 = maf.g;
        this.k = new com.facebook.react.runtime.a<>(maf.a.d(null));
        this.m = new com.facebook.react.runtime.a<>(null);
        this.n = new AtomicReference<>();
        this.o = new AtomicReference<>(new WeakReference(null));
        this.p = new ke0();
        hzh hzhVar = new hzh();
        hzhVar.a = LifecycleState.a;
        this.q = hzhVar;
        this.r = A.getAndIncrement();
        this.u = new CopyOnWriteArrayList();
        this.v = new CopyOnWriteArrayList();
    }

    @f84
    private final Map<String, String> getHostMetadata() {
        return x70.c(this.a);
    }

    @f84
    private final void loadNetworkResource(String url, InspectorNetworkRequestListener listener) {
        xf7.a(url, listener);
    }

    @f84
    private final void setPausedInDebuggerMessage(String message) {
        w24 w24Var = this.h;
        if (message == null) {
            w24Var.p();
        } else {
            w24Var.v(message, new c());
        }
    }

    @Override // defpackage.rkc
    public final ReactContext a() {
        return this.m.b();
    }

    @Override // defpackage.rkc
    public final qoc b(Context context, String str, Bundle bundle) {
        context.getClass();
        str.getClass();
        qoc qocVar = new qoc(context, str, bundle);
        roc rocVar = new roc(context, qocVar);
        rocVar.setShouldLogContentAppeared(true);
        qocVar.c(rocVar);
        qocVar.a(this);
        return qocVar;
    }

    @Override // defpackage.rkc
    public final void c(kbc.d dVar) {
        this.u.remove(dVar);
    }

    @Override // defpackage.rkc
    public final maf d(final String str) {
        maf<Void> mafVar = maf.g;
        return maf.a.b(this.d, new Callable() { // from class: skc
            /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    r6 = this;
                    com.facebook.react.runtime.ReactHostImpl r0 = r6.a
                    maf<java.lang.Void> r1 = r0.z
                    java.util.concurrent.Executor r2 = r0.d
                    r3 = 1
                    java.lang.String r6 = r2
                    if (r1 == 0) goto L1d
                    java.lang.String r4 = "reload()"
                    java.lang.String r5 = "Waiting for destroy to finish, before reloading React Native."
                    r0.t(r4, r5)
                    ykc r4 = new ykc
                    r4.<init>(r0, r6, r3)
                    maf r1 = r1.b(r4, r2)
                    if (r1 != 0) goto L21
                L1d:
                    maf r1 = r0.q(r6)
                L21:
                    daf r6 = new daf
                    r6.<init>()
                    x15$a r4 = defpackage.x15.b
                    maf r6 = r1.b(r6, r4)
                    zkc r1 = new zkc
                    r1.<init>(r0, r3)
                    maf r6 = r6.b(r1, r2)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.skc.call():java.lang.Object");
            }
        });
    }

    @Override // defpackage.rkc
    /* JADX INFO: renamed from: e, reason: from getter */
    public final w24 getH() {
        return this.h;
    }

    @Override // defpackage.rkc
    public final boolean f() {
        UiThreadUtil.assertOnUiThread();
        ReactInstance reactInstance = this.l;
        if (reactInstance == null) {
            return false;
        }
        nmc nmcVar = (nmc) DeviceEventManagerModule.class.getAnnotation(nmc.class);
        DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) (nmcVar != null ? reactInstance.e(nmcVar.name()) : null);
        if (deviceEventManagerModule == null) {
            return false;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    @Override // defpackage.rkc
    public final void g(Context context) {
        context.getClass();
        ReactContext reactContextA = a();
        if (reactContextA != null) {
            if (ie7.g0.enableFontScaleChangesUpdatingLayout()) {
                c74.e(reactContextA);
            }
            AppearanceModule appearanceModule = (AppearanceModule) reactContextA.getNativeModule(AppearanceModule.class);
            if (appearanceModule != null) {
                appearanceModule.onConfigurationChanged(context);
            }
        }
    }

    @Override // defpackage.rkc
    public final void h(Activity activity) {
        s("onHostPause(activity)");
        Activity activityN = n();
        if (activityN != null) {
            String simpleName = activityN.getClass().getSimpleName();
            String simpleName2 = activity == null ? "null" : activity.getClass().getSimpleName();
            hh1.m(activity == activityN, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + simpleName + " Paused activity: " + simpleName2);
        }
        if (this.g) {
            this.h.k(false);
        }
        this.t = null;
        this.q.s(a(), activityN);
    }

    @Override // defpackage.rkc
    public final void i(Activity activity) {
        s("onHostDestroy(activity)");
        if (n() == activity) {
            if (this.g) {
                this.h.k(false);
            }
            this.q.r(a());
            v(null);
        }
    }

    @Override // defpackage.rkc
    public final void j(kbc.d dVar) {
        this.u.add(dVar);
    }

    @Override // defpackage.rkc
    public final void k(Activity activity) {
        s("onUserLeaveHint(activity)");
        ReactContext reactContextA = a();
        if (reactContextA != null) {
            reactContextA.onUserLeaveHint(activity);
        }
    }

    @Override // defpackage.rkc
    public final void l(Activity activity, tn3 tn3Var) {
        this.t = tn3Var;
        s("onHostResume(activity)");
        v(activity);
        if (this.g) {
            this.h.k(true);
        }
        ReactContext reactContextA = a();
        hzh hzhVar = this.q;
        LifecycleState lifecycleState = (LifecycleState) hzhVar.a;
        LifecycleState lifecycleState2 = LifecycleState.c;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        if (reactContextA != null) {
            s55.n("BridgelessReact", "ReactContext.onHostResume()");
            reactContextA.onHostResume(activity);
        }
        hzhVar.a = lifecycleState2;
    }

    public final void m(String str, String str2, WritableNativeArray writableNativeArray) {
        str.getClass();
        String str3 = "callFunctionOnModule(\"" + str + "\", \"" + str2 + "\")";
        qz8 qz8Var = new qz8(2, str, str2, writableNativeArray);
        maf<Void> mafVar = maf.g;
        this.k.a().g(new alc(this, str3, qz8Var), x15.b);
    }

    public final Activity n() {
        return this.n.get();
    }

    public final <T extends NativeModule> T o(Class<T> cls) {
        nmc nmcVar;
        if (cls.equals(UIManagerModule.class)) {
            ReactSoftExceptionLogger.logSoftExceptionVerbose("ReactHost", new ReactNoCrashBridgeNotAllowedSoftException("getNativeModule(UIManagerModule.class) cannot be called when the bridge is disabled"));
        }
        ReactInstance reactInstance = this.l;
        if (reactInstance == null || (nmcVar = (nmc) cls.getAnnotation(nmc.class)) == null) {
            return null;
        }
        return (T) reactInstance.e(nmcVar.name());
    }

    @Override // defpackage.rkc
    public final void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        activity.getClass();
        String str = "onActivityResult(activity = \"" + activity + "\", requestCode = \"" + i + "\", resultCode = \"" + i2 + "\", data = \"" + intent + "\")";
        ReactContext reactContextA = a();
        if (reactContextA != null) {
            reactContextA.onActivityResult(activity, i, i2, intent);
        } else {
            u(str, "Tried to access onActivityResult while context is not ready", null);
        }
    }

    @Override // defpackage.rkc
    public final void onHostPause() {
        s("onHostPause()");
        if (this.g) {
            this.h.k(false);
        }
        this.t = null;
        this.q.s(a(), n());
    }

    @Override // defpackage.rkc
    public final void onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        ReactContext reactContextA = a();
        if (reactContextA == null) {
            u("onNewIntent(intent = \"" + intent + "\")", "Tried to access onNewIntent while context is not ready", null);
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) reactContextA.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        reactContextA.onNewIntent(n(), intent);
    }

    @Override // defpackage.rkc
    public final void onWindowFocusChange(boolean z) {
        ReactContext reactContextA = a();
        if (reactContextA != null) {
            reactContextA.onWindowFocusChange(z);
            return;
        }
        u("onWindowFocusChange(hasFocus = \"" + z + "\")", "Tried to access onWindowFocusChange while context is not ready", null);
    }

    public final maf p(Exception exc, final String str) {
        maf<ReactInstance> mafVarA;
        Executor executor = this.d;
        Executor executor2 = this.e;
        String str2 = "getOrCreateDestroyTask()";
        s("getOrCreateDestroyTask()");
        u("getOrCreateDestroyTask()", str, exc);
        maf<Void> mafVar = this.z;
        if (mafVar != null) {
            return mafVar;
        }
        final fi6 fi6Var = new fi6(this, "Destroy", str, str2);
        t("getOrCreateDestroyTask()", "Resetting createReactInstance task ref");
        com.facebook.react.runtime.a<maf<ReactInstance>> aVar = this.k;
        synchronized (aVar) {
            mafVarA = aVar.a();
            aVar.d();
        }
        maf<Void> mafVarA2 = maf.a(mafVarA.b(new alc(fi6Var, this, str), executor2).b(new ku2() { // from class: blc
            @Override // defpackage.ku2
            public final Object a(maf mafVar2) {
                fi6 fi6Var2 = fi6Var;
                ReactHostImpl reactHostImpl = this;
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar2.getClass();
                ReactInstance reactInstance = (ReactInstance) fi6Var2.invoke(mafVar2, "2: Stopping surfaces");
                if (reactInstance == null) {
                    reactHostImpl.u("getOrCreateDestroyTask()", "Skipping surface shutdown: ReactInstance null", null);
                    return mafVar2;
                }
                reactHostImpl.w("getOrCreateDestroyTask()", reactInstance);
                synchronized (reactHostImpl.j) {
                    reactHostImpl.j.clear();
                    j6g j6gVar = j6g.a;
                }
                return mafVar2;
            }
        }, executor).b(new ku2() { // from class: clc
            @Override // defpackage.ku2
            public final Object a(maf mafVar2) {
                fi6 fi6Var2 = fi6Var;
                ReactHostImpl reactHostImpl = this;
                String str3 = str;
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar2.getClass();
                fi6Var2.invoke(mafVar2, "3: Destroying ReactContext");
                Iterator it = reactHostImpl.v.iterator();
                while (it.hasNext()) {
                    ((gu5) it.next()).invoke();
                }
                zm1 zm1VarB = reactHostImpl.m.b();
                if (zm1VarB == null) {
                    reactHostImpl.u("getOrCreateDestroyTask()", "ReactContext is null. Destroy reason: ".concat(str3), null);
                }
                reactHostImpl.t("getOrCreateDestroyTask()", "Destroying MemoryPressureRouter");
                zn9 zn9Var = reactHostImpl.i;
                Context context = reactHostImpl.a;
                zn9Var.getClass();
                context.getClass();
                context.getApplicationContext().unregisterComponentCallbacks(zn9Var);
                if (zm1VarB != null) {
                    reactHostImpl.t("getOrCreateDestroyTask()", "Resetting ReactContext ref");
                    reactHostImpl.m.d();
                    reactHostImpl.t("getOrCreateDestroyTask()", "Destroying ReactContext");
                }
                reactHostImpl.v(null);
                m5d m5dVar = m5d.a;
                synchronized (m5d.class) {
                    m5d.b.clear();
                }
                return mafVar2;
            }
        }, executor2).b(new ku2() { // from class: dlc
            @Override // defpackage.ku2
            public final Object a(maf mafVar2) {
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar2.getClass();
                ReactInstance reactInstance = (ReactInstance) fi6Var.invoke(mafVar2, "4: Destroying ReactInstance");
                ReactHostImpl reactHostImpl = this;
                if (reactInstance == null) {
                    reactHostImpl.u("getOrCreateDestroyTask()", "Skipping ReactInstance.destroy(): ReactInstance null", null);
                } else {
                    reactHostImpl.t("getOrCreateDestroyTask()", "Resetting ReactInstance ptr");
                    reactHostImpl.l = null;
                    reactHostImpl.t("getOrCreateDestroyTask()", "Destroying ReactInstance");
                    reactInstance.d();
                }
                reactHostImpl.t("getOrCreateDestroyTask()", "Resetting start task ref");
                reactHostImpl.x = null;
                reactHostImpl.t("getOrCreateDestroyTask()", "Resetting destroy task ref");
                reactHostImpl.z = null;
                return mafVar2;
            }
        }, executor), new ku2() { // from class: elc
            @Override // defpackage.ku2
            public final Object a(maf mafVar2) {
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar2.getClass();
                boolean zF = mafVar2.f();
                ReactHostImpl reactHostImpl = this.a;
                String str3 = str;
                if (zF) {
                    Exception excC = mafVar2.c();
                    if (excC == null) {
                        r6.g("Required value was null.");
                        return null;
                    }
                    reactHostImpl.u("getOrCreateDestroyTask()", t40.l("React destruction failed. ReactInstance task faulted. Fault reason: ", excC.getMessage(), ". Destroy reason: ", str3), mafVar2.c());
                }
                if (mafVar2.e()) {
                    reactHostImpl.u("getOrCreateDestroyTask()", "React destruction failed. ReactInstance task cancelled. Destroy reason: ".concat(str3), null);
                }
                return null;
            }
        });
        this.z = mafVarA2;
        return mafVarA2;
    }

    public final maf<ReactInstance> q(final String str) {
        maf<ReactInstance> mafVarA;
        Executor executor = this.e;
        Executor executor2 = this.d;
        String str2 = "getOrCreateReloadTask()";
        s("getOrCreateReloadTask()");
        u("getOrCreateReloadTask()", str, null);
        maf<ReactInstance> mafVar = this.y;
        if (mafVar != null) {
            return mafVar;
        }
        final fi6 fi6Var = new fi6(this, "Reload", str, str2);
        t("getOrCreateReloadTask()", "Resetting createReactInstance task ref");
        com.facebook.react.runtime.a<maf<ReactInstance>> aVar = this.k;
        synchronized (aVar) {
            mafVarA = aVar.a();
            aVar.d();
        }
        maf<ReactInstance> mafVarB = mafVarA.b(new ku2() { // from class: tkc
            @Override // defpackage.ku2
            public final Object a(maf mafVar2) {
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar2.getClass();
                ReactHostImpl reactHostImpl = this;
                reactHostImpl.t("getOrCreateReloadTask()", "Starting React Native reload");
                ReactInstance reactInstance = (ReactInstance) fi6Var.invoke(mafVar2, "1: Starting reload");
                reactHostImpl.x(reactInstance);
                zm1 zm1VarB = reactHostImpl.m.b();
                if (zm1VarB == null) {
                    reactHostImpl.u("getOrCreateReloadTask()", "ReactContext is null. Reload reason: ".concat(str), null);
                }
                if (zm1VarB != null && ((LifecycleState) reactHostImpl.q.a) == LifecycleState.c) {
                    reactHostImpl.t("getOrCreateReloadTask()", "Calling ReactContext.onHostPause()");
                    zm1VarB.onHostPause();
                }
                maf<Void> mafVar3 = maf.g;
                return maf.a.d(reactInstance);
            }
        }, executor).b(new ku2() { // from class: ukc
            @Override // defpackage.ku2
            public final Object a(maf mafVar2) {
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar2.getClass();
                ReactInstance reactInstance = (ReactInstance) fi6Var.invoke(mafVar2, "2: Surface shutdown");
                ReactHostImpl reactHostImpl = this;
                if (reactInstance == null) {
                    reactHostImpl.u("getOrCreateReloadTask()", "Skipping surface shutdown: ReactInstance null", null);
                    return mafVar2;
                }
                reactHostImpl.w("getOrCreateReloadTask()", reactInstance);
                return mafVar2;
            }
        }, executor2).b(new ku2() { // from class: vkc
            @Override // defpackage.ku2
            public final Object a(maf mafVar2) {
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar2.getClass();
                fi6Var.invoke(mafVar2, "3: Destroying ReactContext");
                ReactHostImpl reactHostImpl = this;
                CopyOnWriteArrayList copyOnWriteArrayList = reactHostImpl.v;
                a<zm1> aVar2 = reactHostImpl.m;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((gu5) it.next()).invoke();
                }
                nlc nlcVar = reactHostImpl.s;
                if (nlcVar != null) {
                    reactHostImpl.t("getOrCreateReloadTask()", "Removing memory pressure listener");
                    zn9 zn9Var = reactHostImpl.i;
                    zn9Var.getClass();
                    zn9Var.a.remove(nlcVar);
                }
                zm1 zm1VarB = aVar2.b();
                if (zm1VarB != null) {
                    reactHostImpl.t("getOrCreateReloadTask()", "Resetting ReactContext ref");
                    aVar2.d();
                    reactHostImpl.t("getOrCreateReloadTask()", "Destroying ReactContext");
                }
                if (reactHostImpl.g && zm1VarB != null) {
                    reactHostImpl.t("getOrCreateReloadTask()", "Calling DevSupportManager.onReactInstanceDestroyed(reactContext)");
                    reactHostImpl.h.C(zm1VarB);
                }
                return mafVar2;
            }
        }, executor).b(new ku2() { // from class: wkc
            @Override // defpackage.ku2
            public final Object a(maf mafVar2) {
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar2.getClass();
                ReactInstance reactInstance = (ReactInstance) fi6Var.invoke(mafVar2, "4: Destroying ReactInstance");
                ReactHostImpl reactHostImpl = this;
                if (reactInstance == null) {
                    reactHostImpl.u("getOrCreateReloadTask()", "Skipping ReactInstance.destroy(): ReactInstance null", null);
                } else {
                    reactHostImpl.t("getOrCreateReloadTask()", "Resetting ReactInstance ptr");
                    reactHostImpl.l = null;
                    reactHostImpl.t("getOrCreateReloadTask()", "Destroying ReactInstance");
                    reactInstance.d();
                }
                reactHostImpl.t("getOrCreateReloadTask()", "Resetting start task ref");
                reactHostImpl.x = null;
                reactHostImpl.s("getOrCreateReactInstanceTask()");
                return reactHostImpl.k.c(new r91(reactHostImpl));
            }
        }, executor2).b(new ku2() { // from class: xkc
            @Override // defpackage.ku2
            public final Object a(maf mafVar2) {
                fi6 fi6Var2 = fi6Var;
                ReactHostImpl reactHostImpl = this;
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar2.getClass();
                ReactInstance reactInstance = (ReactInstance) fi6Var2.invoke(mafVar2, "5: Restarting surfaces");
                if (reactInstance == null) {
                    reactHostImpl.u("getOrCreateReloadTask()", "Skipping surface restart: ReactInstance null", null);
                    return mafVar2;
                }
                reactHostImpl.t("getOrCreateReloadTask()", "Restarting previously running React Native Surfaces");
                synchronized (reactHostImpl.j) {
                    try {
                        Iterator it = reactHostImpl.j.iterator();
                        while (it.hasNext()) {
                            reactInstance.h((qoc) it.next());
                        }
                        j6g j6gVar = j6g.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return mafVar2;
            }
        }, executor2).b(new ykc(this, str, 0), executor2);
        this.y = mafVarB;
        return mafVarB;
    }

    public final void r(final Exception exc) {
        final String str = "handleHostException(message = \"" + exc.getMessage() + "\")";
        s(str);
        if (this.g) {
            this.h.handleException(exc);
        } else {
            this.b.handleInstanceException(exc);
        }
        maf<Void> mafVar = maf.g;
        maf.a.b(this.d, new Callable() { // from class: slc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final ReactHostImpl reactHostImpl = this.a;
                maf<ReactInstance> mafVar2 = reactHostImpl.y;
                final String str2 = str;
                final Exception exc2 = exc;
                if (mafVar2 == null) {
                    return reactHostImpl.p(exc2, str2);
                }
                reactHostImpl.t("destroy()", "Reloading React Native. Waiting for reload to finish before destroying React Native.");
                return mafVar2.b(new ku2() { // from class: flc
                    @Override // defpackage.ku2
                    public final Object a(maf mafVar3) {
                        AtomicInteger atomicInteger = ReactHostImpl.A;
                        mafVar3.getClass();
                        return reactHostImpl.p(exc2, str2);
                    }
                }, reactHostImpl.d);
            }
        });
    }

    public final void s(String str) {
        String str2 = "ReactHost{" + this.r + "}." + str;
        this.p.getClass();
        s55.n("BridgelessReact", str2);
    }

    @Override // defpackage.rkc
    public final maf start() {
        maf<Void> mafVar = maf.g;
        return maf.a.b(this.d, new Callable() { // from class: tlc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ReactHostImpl reactHostImpl = this.a;
                maf<Void> mafVar2 = reactHostImpl.x;
                if (mafVar2 != null) {
                    return mafVar2;
                }
                reactHostImpl.t("getOrCreateStartTask()", "Schedule");
                maf<Void> mafVarB = reactHostImpl.y(0).b(new zkc(reactHostImpl, 0), reactHostImpl.d);
                reactHostImpl.x = mafVarB;
                return mafVarB;
            }
        });
    }

    public final void t(String str, String str2) {
        StringBuilder sbJ = m6.j(this.r, "ReactHost{", "}.", str, ": ");
        sbJ.append(str2);
        String string = sbJ.toString();
        this.p.getClass();
        s55.n("BridgelessReact", string);
    }

    public final void u(String str, String str2, Exception exc) {
        String str3 = "raiseSoftException(" + str + ")";
        t(str3, str2);
        ReactSoftExceptionLogger.logSoftException("ReactHost", new ReactNoCrashSoftException(z3.m(str3, ": ", str2), exc));
    }

    public final void v(Activity activity) {
        this.n.set(activity);
        if (activity != null) {
            this.o.set(new WeakReference<>(activity));
        }
    }

    public final void w(String str, ReactInstance reactInstance) {
        t(str, "Stopping all React Native surfaces");
        synchronized (this.j) {
            try {
                for (qoc qocVar : this.j) {
                    reactInstance.i(qocVar);
                    UiThreadUtil.runOnUiThread(new ky1(qocVar, 7));
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(ReactInstance reactInstance) {
        if (reactInstance != null) {
            if (InspectorFlags.getFuseboxEnabled()) {
                ReactHostInspectorTarget reactHostInspectorTarget = this.w;
                boolean z = false;
                if (reactHostInspectorTarget != null && reactHostInspectorTarget.isValid()) {
                    z = true;
                }
                hh1.m(z, "Host inspector target destroyed before instance was unregistered");
            }
            reactInstance.unregisterFromInspector();
        }
    }

    public final maf y(final int i) {
        maf<ReactInstance> mafVar = this.y;
        if (mafVar != null) {
            t("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is reloading. Return reload task.");
            return mafVar;
        }
        maf<Void> mafVar2 = this.z;
        if (mafVar2 != null) {
            if (i < 4) {
                t("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down.Wait for teardown to finish, before trying again (try count = " + i + ").");
                ku2 ku2Var = new ku2() { // from class: glc
                    @Override // defpackage.ku2
                    public final Object a(maf mafVar3) {
                        AtomicInteger atomicInteger = ReactHostImpl.A;
                        mafVar3.getClass();
                        return this.a.y(i + 1);
                    }
                };
                Executor executor = this.d;
                executor.getClass();
                return mafVar2.b(new gaf(ku2Var), executor);
            }
            u("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down. Not wait for teardown to finish: reached max retries.", null);
        }
        s("getOrCreateReactInstanceTask()");
        return this.k.c(new r91(this));
    }
}
