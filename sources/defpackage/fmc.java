package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactCxxErrorHandler;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.soloader.SoLoader;
import defpackage.pnc;
import defpackage.w24;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class fmc {
    public static final String z = fmc.class.getSimpleName();
    public volatile LifecycleState b;
    public c c;
    public volatile Thread d;
    public final JavaScriptExecutorFactory e;
    public final String f;
    public final ArrayList g;
    public final w24 h;
    public final boolean i;
    public final boolean j;
    public volatile BridgeReactContext l;
    public final Context m;
    private final JSBundleLoader mBundleLoader;
    public tn3 n;
    public Activity o;
    public ReactInstanceManagerInspectorTarget p;
    public final zn9 t;
    public final JSExceptionHandler u;
    public final UIManagerProvider v;
    public final pnc.a w;
    public ArrayList x;
    public final Set<vnc> a = Collections.synchronizedSet(new HashSet());
    public final Object k = new Object();
    public final List q = Collections.synchronizedList(new ArrayList());
    public volatile boolean r = false;
    public volatile Boolean s = Boolean.FALSE;
    public final boolean y = true;

    public class a implements zya {
        public a() {
        }

        @Override // defpackage.zya
        public final void a(boolean z) {
            UiThreadUtil.runOnUiThread(new emc(this, z));
        }
    }

    public static class b implements ReactInstanceManagerInspectorTarget.TargetDelegate {
        public WeakReference<fmc> a;

        public class a implements w24.a {
            public final /* synthetic */ fmc a;

            public a(fmc fmcVar) {
                this.a = fmcVar;
            }

            @Override // w24.a
            public final void a() {
                UiThreadUtil.assertOnUiThread();
                ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget = this.a.p;
                if (reactInstanceManagerInspectorTarget != null) {
                    reactInstanceManagerInspectorTarget.sendDebuggerResumeCommand();
                }
            }
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public final Map<String, String> getMetadata() {
            fmc fmcVar = this.a.get();
            return x70.c(fmcVar != null ? fmcVar.m : null);
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public final void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
            xf7.a(str, inspectorNetworkRequestListener);
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public final void onReload() {
            UiThreadUtil.runOnUiThread(new sm3(this, 3));
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public final void onSetPausedInDebuggerMessage(String str) {
            fmc fmcVar = this.a.get();
            if (fmcVar == null) {
                return;
            }
            w24 w24Var = fmcVar.h;
            if (str == null) {
                w24Var.p();
            } else {
                w24Var.v(str, new a(fmcVar));
            }
        }
    }

    public class c {
        public final JavaScriptExecutorFactory a;
        public final JSBundleLoader b;

        public c(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            hh1.n(javaScriptExecutorFactory);
            this.a = javaScriptExecutorFactory;
            hh1.n(jSBundleLoader);
            this.b = jSBundleLoader;
        }
    }

    public fmc(Application application, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List list, boolean z2, m34 m34Var, boolean z3, LifecycleState lifecycleState, JSExceptionHandler jSExceptionHandler, fuc fucVar, int i, int i2, UIManagerProvider uIManagerProvider, pnc.a aVar, c0f c0fVar, k24 k24Var, j42 j42Var, x6b x6bVar) {
        s55.b(z, "ReactInstanceManager.ctor()");
        Method method = null;
        try {
            SoLoader.e(application, 0);
            c74.f(application);
            this.m = application;
            this.o = null;
            this.n = null;
            this.e = javaScriptExecutorFactory;
            this.mBundleLoader = jSBundleLoader;
            this.f = str;
            ArrayList arrayList = new ArrayList();
            this.g = arrayList;
            this.i = z2;
            this.j = z3;
            Trace.beginSection(jpf.g("ReactInstanceManager.initDevSupportManager"));
            w24 w24VarA = m34Var.a(application, new dmc(), str, z2, fucVar, i, c0fVar, k24Var, x6bVar);
            this.h = w24VarA;
            Trace.endSection();
            this.b = lifecycleState;
            this.t = new zn9(application);
            this.u = jSExceptionHandler;
            this.w = aVar;
            synchronized (arrayList) {
                try {
                    dkc.a.getClass();
                    arrayList.add(new pz2(this, new cmc(this), i2));
                    if (z2) {
                        arrayList.add(new jh3());
                    }
                    arrayList.addAll(list);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.v = uIManagerProvider;
            j42 j42Var2 = j42Var != null ? j42Var : a50.a;
            if (com.facebook.react.modules.core.a.f == null) {
                com.facebook.react.modules.core.a.f = new com.facebook.react.modules.core.a(j42Var2);
            }
            if (z2) {
                w24VarA.t();
            }
            try {
                method = fmc.class.getMethod("g", Exception.class);
            } catch (NoSuchMethodException e) {
                s55.g("ReactInstanceHolder", "Failed to set cxx error handler function", e);
            }
            ReactCxxErrorHandler.setHandleErrorFunc(this, method);
        } catch (IOException e2) {
            l5.r(e2);
            throw null;
        }
    }

    public static void d(vnc vncVar, ReactContext reactContext) {
        s55.b("ReactNative", "ReactInstanceManager.detachRootViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (vncVar.getState().compareAndSet(1, 0)) {
            int uIManagerType = vncVar.getUIManagerType();
            if (uIManagerType != 2) {
                ((AppRegistry) reactContext.getCatalystInstance().getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(vncVar.getRootViewTag());
                return;
            }
            int rootViewTag = vncVar.getRootViewTag();
            if (rootViewTag != -1) {
                UIManager uIManagerI = dmc.i(reactContext, uIManagerType);
                if (uIManagerI != null) {
                    uIManagerI.stopSurface(rootViewTag);
                } else {
                    s55.n("ReactNative", "Failed to stop surface, UIManager has already gone away");
                }
            } else {
                ReactSoftExceptionLogger.logSoftException(z, new RuntimeException("detachRootViewFromInstance called with ReactRootView with invalid id"));
            }
            UiThreadUtil.assertOnUiThread();
            vncVar.getState().compareAndSet(1, 0);
            ViewGroup rootViewGroup = vncVar.getRootViewGroup();
            rootViewGroup.removeAllViews();
            rootViewGroup.setId(-1);
        }
    }

    public static void j(inc incVar, x9a x9aVar) {
        Iterable<ModuleHolder> jncVar;
        i3f i3fVar = new i3f("processPackage");
        i3fVar.S(incVar.getClass().getSimpleName(), "className");
        i3fVar.T();
        boolean z2 = incVar instanceof lnc;
        if (z2) {
            ((lnc) incVar).b();
        }
        HashMap<String, ModuleHolder> map = x9aVar.b;
        BridgeReactContext bridgeReactContext = x9aVar.a;
        if (incVar instanceof ft8) {
            ft8 ft8Var = (ft8) incVar;
            jncVar = new et8(ft8Var.a(), ft8Var.b().a());
        } else if (incVar instanceof qa1) {
            jncVar = ((qa1) incVar).getNativeModuleIterator$ReactAndroid_release(bridgeReactContext);
        } else {
            s55.b("ReactNative", incVar.getClass().getSimpleName().concat(" is not a LazyReactPackage, falling back to old version."));
            jncVar = new jnc(incVar.createNativeModules(bridgeReactContext));
        }
        for (ModuleHolder moduleHolder : jncVar) {
            String name = moduleHolder.getName();
            ModuleHolder moduleHolder2 = map.get(name);
            if (moduleHolder2 != null && !moduleHolder.getCanOverrideExistingModule()) {
                akb.n(akb.k("\nNative module ", name, " tried to override ", moduleHolder2.getClassName(), ".\n\nCheck the getPackages() method in MainApplication.java, it might be that module is being created twice.\nIf this was your intention, set canOverrideExistingModule=true. This error may also be present if the\npackage is present only once in getPackages() but is also automatically added later during build time\nby autolinking. Try removing the existing entry and rebuild.\n"));
                return;
            }
            map.put(name, moduleHolder);
        }
        if (z2) {
            ((lnc) incVar).a();
        }
        new h3f(11);
        Trace.endSection();
    }

    @Deprecated
    public final void a(wnc wncVar) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.a) {
            try {
                if (this.a.add(wncVar)) {
                    UiThreadUtil.assertOnUiThread();
                    wncVar.getState().compareAndSet(1, 0);
                    ViewGroup rootViewGroup = wncVar.getRootViewGroup();
                    rootViewGroup.removeAllViews();
                    rootViewGroup.setId(-1);
                } else {
                    s55.f("ReactNative", "ReactRoot was attached multiple times");
                }
                ReactContext reactContextE = e();
                if (this.d == null && reactContextE != null) {
                    b(wncVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(final vnc vncVar) {
        final int iAddRootView;
        s55.b("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        if (vncVar.getState().compareAndSet(0, 1)) {
            Trace.beginSection(jpf.g("attachRootViewToInstance"));
            UIManager uIManagerI = dmc.i(this.l, vncVar.getUIManagerType());
            if (uIManagerI == null) {
                r6.g("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
                return;
            }
            Bundle appProperties = vncVar.getAppProperties();
            if (vncVar.getUIManagerType() == 2) {
                iAddRootView = uIManagerI.startSurface(vncVar.getRootViewGroup(), vncVar.getJSModuleName(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), vncVar.getWidthMeasureSpec(), vncVar.getHeightMeasureSpec());
                vncVar.setShouldLogContentAppeared(true);
            } else {
                iAddRootView = uIManagerI.addRootView(vncVar.getRootViewGroup(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties));
                vncVar.setRootViewTag(iAddRootView);
                vncVar.a();
            }
            jpf.a(iAddRootView, "pre_rootView.onAttachedToReactInstance");
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: zlc
                @Override // java.lang.Runnable
                public final void run() {
                    jpf.c(iAddRootView, "pre_rootView.onAttachedToReactInstance");
                    vncVar.c();
                }
            });
            Trace.endSection();
        }
    }

    public final BridgeReactContext c(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        UIManager uIManagerCreateUIManager;
        pnc.a aVar;
        s55.b("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        BridgeReactContext bridgeReactContext = new BridgeReactContext(this.m);
        JSExceptionHandler jSExceptionHandler = this.u;
        if (jSExceptionHandler == null) {
            jSExceptionHandler = this.h;
        }
        bridgeReactContext.setJSExceptionHandler(jSExceptionHandler);
        ArrayList<inc> arrayList = this.g;
        x9a x9aVar = new x9a(bridgeReactContext);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.g) {
            try {
                for (inc incVar : arrayList) {
                    Trace.beginSection(jpf.g("createAndProcessCustomReactPackage"));
                    try {
                        j(incVar, x9aVar);
                        Trace.endSection();
                    } finally {
                        Trace.endSection();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        Trace.beginSection(jpf.g("buildNativeModuleRegistry"));
        try {
            NativeModuleRegistry nativeModuleRegistry = new NativeModuleRegistry(x9aVar.a, x9aVar.b);
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
            CatalystInstanceImpl.Builder jSExceptionHandler2 = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(nativeModuleRegistry).setJSBundleLoader(jSBundleLoader).setJSExceptionHandler(jSExceptionHandler);
            if (this.p == null && InspectorFlags.getFuseboxEnabled()) {
                b bVar = new b();
                bVar.a = new WeakReference<>(this);
                this.p = new ReactInstanceManagerInspectorTarget(bVar);
            }
            CatalystInstanceImpl.Builder inspectorTarget = jSExceptionHandler2.setInspectorTarget(this.p);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
            Trace.beginSection(jpf.g("createCatalystInstance"));
            try {
                CatalystInstanceImpl catalystInstanceImplBuild = inspectorTarget.build();
                Trace.endSection();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
                bridgeReactContext.initializeWithInstance(catalystInstanceImplBuild);
                catalystInstanceImplBuild.getRuntimeScheduler();
                if (ie7.g0.useTurboModules() && (aVar = this.w) != null) {
                    ArrayList arrayList2 = this.g;
                    arrayList2.getClass();
                    List<? extends inc> listZ1 = z92.z1(arrayList2);
                    aVar.a = listZ1;
                    TurboModuleManager turboModuleManager = new TurboModuleManager(catalystInstanceImplBuild.getRuntimeExecutor(), aVar.a(bridgeReactContext, listZ1), catalystInstanceImplBuild.getJSCallInvokerHolder(), catalystInstanceImplBuild.getNativeMethodCallInvokerHolder());
                    catalystInstanceImplBuild.setTurboModuleRegistry(turboModuleManager);
                    Iterator<String> it = turboModuleManager.getEagerInitModuleNames().iterator();
                    while (it.hasNext()) {
                        turboModuleManager.getModule(it.next());
                    }
                }
                UIManagerProvider uIManagerProvider = this.v;
                if (uIManagerProvider != null && (uIManagerCreateUIManager = uIManagerProvider.createUIManager(bridgeReactContext)) != null) {
                    catalystInstanceImplBuild.setFabricUIManager(uIManagerCreateUIManager);
                    uIManagerCreateUIManager.initialize();
                    catalystInstanceImplBuild.setFabricUIManager(uIManagerCreateUIManager);
                }
                ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
                Trace.beginSection(jpf.g("runJSBundle"));
                catalystInstanceImplBuild.runJSBundle();
                return bridgeReactContext;
            } catch (Throwable th2) {
                Trace.endSection();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
            throw th3;
        }
    }

    public final ReactContext e() {
        BridgeReactContext bridgeReactContext;
        synchronized (this.k) {
            bridgeReactContext = this.l;
        }
        return bridgeReactContext;
    }

    public final List<ViewManager> f(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        Trace.beginSection(jpf.g("createAllViewManagers"));
        try {
            if (this.x == null) {
                synchronized (this.g) {
                    try {
                        if (this.x == null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = this.g.iterator();
                            while (it.hasNext()) {
                                arrayList.addAll(((inc) it.next()).createViewManagers(reactApplicationContext));
                            }
                            this.x = arrayList;
                            return arrayList;
                        }
                    } finally {
                    }
                }
            }
            return this.x;
        } finally {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
        }
    }

    public void g(Exception exc) {
        this.h.handleException(exc);
    }

    public final void h() {
        UiThreadUtil.assertOnUiThread();
        tn3 tn3Var = this.n;
        if (tn3Var != null) {
            tn3Var.a();
        }
    }

    public final synchronized void i(boolean z2) {
        try {
            ReactContext reactContextE = e();
            if (reactContextE != null && (z2 || this.b == LifecycleState.b || this.b == LifecycleState.a)) {
                reactContextE.onHostResume(this.o);
            }
            this.b = LifecycleState.c;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void k() {
        s55.b(z, "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        dkc.a.getClass();
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.e;
        JSBundleLoader jSBundleLoader = this.mBundleLoader;
        s55.b("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        c cVar = new c(javaScriptExecutorFactory, jSBundleLoader);
        if (this.d == null) {
            m(cVar);
        } else {
            this.c = cVar;
        }
    }

    public final void l() {
        s55.b(z, "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        dkc.a.getClass();
        UiThreadUtil.assertOnUiThread();
        if (!this.i || this.f == null) {
            k();
            return;
        }
        w24 w24Var = this.h;
        w24Var.getClass();
        if (this.mBundleLoader == null) {
            w24Var.w();
        } else {
            w24Var.E(new a());
        }
    }

    public final void m(c cVar) {
        s55.b("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_START);
        synchronized (this.a) {
            synchronized (this.k) {
                try {
                    if (this.l != null) {
                        o(this.l);
                        this.l = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.d = new Thread(null, new xf3(4, this, cVar), "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.d.start();
    }

    public final void n(BridgeReactContext bridgeReactContext) {
        s55.b("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        Trace.beginSection(jpf.g("setupReactContext"));
        synchronized (this.a) {
            try {
                synchronized (this.k) {
                    this.l = bridgeReactContext;
                }
                CatalystInstance catalystInstance = bridgeReactContext.getCatalystInstance();
                hh1.n(catalystInstance);
                catalystInstance.initialize();
                this.h.B(bridgeReactContext);
                CopyOnWriteArrayList<MemoryPressureListener> copyOnWriteArrayList = this.t.a;
                if (!copyOnWriteArrayList.contains(catalystInstance)) {
                    copyOnWriteArrayList.add(catalystInstance);
                }
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
                Iterator<vnc> it = this.a.iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = 1;
        UiThreadUtil.runOnUiThread(new abc(i, this, (ylc[]) this.q.toArray(new ylc[this.q.size()]), bridgeReactContext));
        bridgeReactContext.runOnJSQueueThread(new amc());
        bridgeReactContext.runOnNativeModulesQueueThread(new bmc());
        Trace.endSection();
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_END);
    }

    public final void o(BridgeReactContext bridgeReactContext) {
        s55.b("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.b == LifecycleState.c) {
            bridgeReactContext.onHostPause();
        }
        synchronized (this.a) {
            try {
                Iterator<vnc> it = this.a.iterator();
                while (it.hasNext()) {
                    d(it.next(), bridgeReactContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zn9 zn9Var = this.t;
        CatalystInstance catalystInstance = bridgeReactContext.getCatalystInstance();
        zn9Var.getClass();
        catalystInstance.getClass();
        zn9Var.a.remove(catalystInstance);
        bridgeReactContext.destroy();
        this.h.C(bridgeReactContext);
    }
}
