package com.facebook.react.runtime;

import android.content.res.AssetManager;
import android.os.Trace;
import android.view.ViewGroup;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.defaults.DefaultReactHostDelegate;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.FabricUIManagerBinding;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.modules.core.a;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.uimanager.ComponentNameResolverBinding;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.soloader.SoLoader;
import defpackage.a50;
import defpackage.c74;
import defpackage.dh6;
import defpackage.f84;
import defpackage.g35;
import defpackage.hl9;
import defpackage.ie7;
import defpackage.inc;
import defpackage.jh3;
import defpackage.jpf;
import defpackage.msb;
import defpackage.p6;
import defpackage.pnc;
import defpackage.pqe;
import defpackage.qoc;
import defpackage.qz2;
import defpackage.r6;
import defpackage.rh9;
import defpackage.s55;
import defpackage.tn3;
import defpackage.tqg;
import defpackage.vqg;
import defpackage.w24;
import defpackage.wqg;
import defpackage.z92;
import defpackage.zm1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001:\u0003DEFJ\u0010\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0087 ¢\u0006\u0004\b\u0010\u0010\u0011J\\\u0010$\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0083 ¢\u0006\u0004\b$\u0010%J \u0010(\u001a\u00020\r2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0082 ¢\u0006\u0004\b(\u0010)J \u0010-\u001a\u00020\r2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\bH\u0082 ¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/H\u0082 ¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b2\u0010\u0007J\u0010\u00104\u001a\u000203H\u0082 ¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206H\u0082 ¢\u0006\u0004\b7\u00108J \u0010<\u001a\u00020\r2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\bH\u0082 ¢\u0006\u0004\b<\u0010=J\u0018\u0010?\u001a\u00020\r2\u0006\u0010>\u001a\u000209H\u0082 ¢\u0006\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bA\u0010B\u0012\u0004\bC\u0010\u0011¨\u0006G"}, d2 = {"Lcom/facebook/react/runtime/ReactInstance;", "", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "getJSCallInvokerHolder", "()Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "Lcom/facebook/react/bridge/RuntimeExecutor;", "getBufferedRuntimeExecutor", "()Lcom/facebook/react/bridge/RuntimeExecutor;", "", "moduleName", "methodName", "Lcom/facebook/react/bridge/NativeArray;", "args", "Lj6g;", "callFunctionOnModule", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)V", "unregisterFromInspector", "()V", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "Lcom/facebook/react/bridge/queue/MessageQueueThread;", "jsMessageQueueThread", "nativeModulesMessageQueueThread", "Lcom/facebook/react/modules/core/JavaTimerManager;", "timerManager", "Lcom/facebook/react/runtime/JSTimerExecutor;", "jsTimerExecutor", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;", "jReactExceptionsManager", "Lcom/facebook/react/runtime/BindingsInstaller;", "jBindingsInstaller", "", "isProfiling", "Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "reactHostInspectorTarget", "Lcom/facebook/jni/HybridData;", "initHybrid", "(Lcom/facebook/react/runtime/JSRuntimeFactory;Lcom/facebook/react/bridge/queue/MessageQueueThread;Lcom/facebook/react/bridge/queue/MessageQueueThread;Lcom/facebook/react/modules/core/JavaTimerManager;Lcom/facebook/react/runtime/JSTimerExecutor;Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;Lcom/facebook/react/runtime/BindingsInstaller;ZLcom/facebook/react/runtime/ReactHostInspectorTarget;)Lcom/facebook/jni/HybridData;", "fileName", "sourceURL", "loadJSBundleFromFile", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/res/AssetManager;", "assetManager", "assetURL", "loadJSBundleFromAssets", "(Landroid/content/res/AssetManager;Ljava/lang/String;)V", "Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;", "getNativeMethodCallInvokerHolder", "()Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;", "getUnbufferedRuntimeExecutor", "Lcom/facebook/react/bridge/RuntimeScheduler;", "getRuntimeScheduler", "()Lcom/facebook/react/bridge/RuntimeScheduler;", "", "getJavaScriptContext", "()J", "", "segmentId", "segmentPath", "registerSegmentNative", "(ILjava/lang/String;)V", "pressureLevel", "handleMemoryPressureJs", "(I)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "c", "a", "b", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@f84
public final class ReactInstance {
    public static final b h = new b();
    public final zm1 a;
    public final TurboModuleManager b;
    public final JavaTimerManager c;
    public final a d;
    public final ReactQueueConfigurationImpl e;
    public final FabricUIManager f;
    public final JavaScriptContextHolder g;

    @f84
    private final HybridData mHybridData;

    public static final class a implements wqg {
        public final ArrayList a;
        public final zm1 b;
        public final HashMap c = new HashMap();
        public HashMap d;

        public a(ArrayList arrayList, zm1 zm1Var) {
            this.a = arrayList;
            this.b = zm1Var;
        }

        @Override // defpackage.wqg
        public final Collection<String> a() {
            HashSet hashSet = new HashSet();
            hashSet.addAll(d());
            hashSet.addAll(((HashMap) c()).keySet());
            return hashSet;
        }

        @Override // defpackage.wqg
        public final ViewManager<?, ?> b(String str) {
            ViewManager viewManager;
            ViewManager viewManagerCreateViewManager;
            str.getClass();
            synchronized (this) {
                if (!this.c.containsKey(str)) {
                    Iterator it = this.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            viewManager = null;
                            break;
                        }
                        inc incVar = (inc) it.next();
                        if ((incVar instanceof tqg) && (viewManagerCreateViewManager = ((tqg) incVar).createViewManager(this.b, str)) != null) {
                            this.c.put(str, viewManagerCreateViewManager);
                            viewManager = viewManagerCreateViewManager;
                            break;
                        }
                    }
                } else {
                    viewManager = (ViewManager) this.c.get(str);
                }
            }
            return viewManager != null ? viewManager : (ViewManager) ((HashMap) c()).get(str);
        }

        public final synchronized Map<String, ViewManager<?, ?>> c() {
            try {
                HashMap map = this.d;
                if (map != null) {
                    return map;
                }
                HashMap map2 = new HashMap();
                for (inc incVar : this.a) {
                    if (!(incVar instanceof tqg)) {
                        for (ViewManager viewManager : incVar.createViewManagers(this.b)) {
                            map2.put(viewManager.getName(), viewManager);
                        }
                    }
                }
                this.d = map2;
                return map2;
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized HashSet d() {
            HashSet hashSet;
            try {
                hashSet = new HashSet();
                for (inc incVar : this.a) {
                    if (incVar instanceof tqg) {
                        Collection<String> viewManagerNames = ((tqg) incVar).getViewManagerNames(this.b);
                        if (viewManagerNames == null) {
                            msb.k(this.b, "The ReactPackage called: `" + incVar.getClass().getSimpleName() + "` is returning null for getViewManagerNames(). This is violating the signature of the method. That method should be updated to return an empty collection.");
                        } else {
                            hashSet.addAll(viewManagerNames);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return hashSet;
        }
    }

    public static final class b {
        public static final /* synthetic */ JSTimerExecutor a() {
            return ReactInstance.h.createJSTimerExecutor();
        }

        @f84
        private final JSTimerExecutor createJSTimerExecutor() {
            return ReactInstance.createJSTimerExecutor();
        }
    }

    public final class c implements ReactJsExceptionHandler {
        public final g35 a;

        public c(g35 g35Var) {
            this.a = g35Var;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler
        public final void reportJsException(ReactJsExceptionHandler.ProcessedError processedError) {
            processedError.getClass();
            int i = pqe.a;
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            for (ReactJsExceptionHandler.ProcessedError.StackFrame stackFrame : processedError.getStack()) {
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                if (stackFrame.getColumn() != null) {
                    javaOnlyMap.putDouble("column", r4.intValue());
                }
                if (stackFrame.getLineNumber() != null) {
                    javaOnlyMap.putDouble("lineNumber", r4.intValue());
                }
                javaOnlyMap.putString("file", stackFrame.getFile());
                javaOnlyMap.putString("methodName", stackFrame.getMethodName());
                javaOnlyArray.pushMap(javaOnlyMap);
            }
            JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
            javaOnlyMap2.putString("message", processedError.getMessage());
            String originalMessage = processedError.getOriginalMessage();
            if (originalMessage != null) {
                javaOnlyMap2.putString("originalMessage", originalMessage);
            }
            String name = processedError.getName();
            if (name != null) {
                javaOnlyMap2.putString("name", name);
            }
            String componentStack = processedError.getComponentStack();
            if (componentStack != null) {
                javaOnlyMap2.putString("componentStack", componentStack);
            }
            javaOnlyMap2.putArray("stack", javaOnlyArray);
            javaOnlyMap2.putInt("id", processedError.getId());
            javaOnlyMap2.putBoolean("isFatal", processedError.isFatal());
            javaOnlyMap2.putMap("extraData", processedError.getExtraData());
            try {
                NativeModule nativeModuleE = ReactInstance.this.e("ExceptionsManager");
                if (nativeModuleE == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ((NativeExceptionsManagerSpec) nativeModuleE).reportException(javaOnlyMap2);
            } catch (Exception e) {
                this.a.handleException(e);
            }
        }
    }

    static {
        SoLoader.l("rninstance");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [qlc] */
    public ReactInstance(zm1 zm1Var, DefaultReactHostDelegate defaultReactHostDelegate, ComponentFactory componentFactory, w24 w24Var, g35 g35Var, boolean z, ReactHostInspectorTarget reactHostInspectorTarget) {
        defaultReactHostDelegate.getClass();
        componentFactory.getClass();
        w24Var.getClass();
        this.a = zm1Var;
        Trace.beginSection(jpf.g("ReactInstance.initialize"));
        MessageQueueThreadSpec.Companion companion = MessageQueueThreadSpec.INSTANCE;
        ReactQueueConfigurationImpl reactQueueConfigurationImplCreate = ReactQueueConfigurationImpl.INSTANCE.create(new ReactQueueConfigurationSpec(companion.newBackgroundThreadSpec("v_native"), companion.newBackgroundThreadSpec("v_js")), g35Var);
        this.e = reactQueueConfigurationImplCreate;
        s55.b("ReactInstance", "Calling initializeMessageQueueThreads()");
        zm1Var.initializeMessageQueueThreads(reactQueueConfigurationImplCreate);
        MessageQueueThread jSQueueThread = reactQueueConfigurationImplCreate.getJSQueueThread();
        MessageQueueThread nativeModulesQueueThread = reactQueueConfigurationImplCreate.getNativeModulesQueueThread();
        if (com.facebook.react.modules.core.a.f == null) {
            com.facebook.react.modules.core.a.f = new com.facebook.react.modules.core.a(a50.a);
        }
        w24Var.t();
        JSTimerExecutor jSTimerExecutorA = b.a();
        com.facebook.react.modules.core.a aVar = com.facebook.react.modules.core.a.f;
        if (aVar == null) {
            r6.g("ReactChoreographer needs to be initialized.");
            throw null;
        }
        JavaTimerManager javaTimerManager = new JavaTimerManager(zm1Var, jSTimerExecutorA, aVar, w24Var);
        this.c = javaTimerManager;
        this.mHybridData = initHybrid(defaultReactHostDelegate.getJsRuntimeFactory(), jSQueueThread, nativeModulesQueueThread, javaTimerManager, jSTimerExecutorA, new c(g35Var), defaultReactHostDelegate.getBindingsInstaller(), InspectorFlags.getIsProfilingBuild(), reactHostInspectorTarget);
        this.g = new JavaScriptContextHolder(getJavaScriptContext());
        Trace.beginSection(jpf.g("ReactInstance.initialize#initTurboModules"));
        ArrayList arrayList = new ArrayList();
        final ReactHostImpl reactHostImpl = zm1Var.a;
        arrayList.add(new qz2(reactHostImpl.h, new tn3() { // from class: qlc
            @Override // defpackage.tn3
            public final void a() {
                AtomicInteger atomicInteger = ReactHostImpl.A;
                UiThreadUtil.assertOnUiThread();
                tn3 tn3Var = reactHostImpl.t;
                if (tn3Var != null) {
                    tn3Var.a();
                }
            }
        }));
        if (z) {
            arrayList.add(new jh3());
        }
        arrayList.addAll(defaultReactHostDelegate.getReactPackages());
        pnc.a turboModuleManagerDelegateBuilder = defaultReactHostDelegate.getTurboModuleManagerDelegateBuilder();
        turboModuleManagerDelegateBuilder.getClass();
        List<? extends inc> listZ1 = z92.z1(arrayList);
        turboModuleManagerDelegateBuilder.a = listZ1;
        DefaultTurboModuleManagerDelegate defaultTurboModuleManagerDelegateA = turboModuleManagerDelegateBuilder.a(zm1Var, listZ1);
        RuntimeExecutor unbufferedRuntimeExecutor = getUnbufferedRuntimeExecutor();
        this.b = new TurboModuleManager(unbufferedRuntimeExecutor, defaultTurboModuleManagerDelegateA, getJSCallInvokerHolder(), getNativeMethodCallInvokerHolder());
        Trace.endSection();
        Trace.beginSection(jpf.g("ReactInstance.initialize#initFabric"));
        a aVar2 = new a(arrayList, zm1Var);
        this.d = aVar2;
        ComponentNameResolverBinding.install(unbufferedRuntimeExecutor, new com.facebook.react.runtime.b(this));
        if (ie7.g0.useNativeViewConfigsInBridgelessMode()) {
            HashMap map = new HashMap();
            UIConstantsProviderBinding.install(unbufferedRuntimeExecutor, new p6(12), new hl9(this, map), new rh9(this, map, 2));
        }
        EventBeatManager eventBeatManager = new EventBeatManager();
        FabricUIManager fabricUIManager = new FabricUIManager(zm1Var, new vqg(aVar2), eventBeatManager);
        this.f = fabricUIManager;
        c74.f(zm1Var);
        new FabricUIManagerBinding().b(getBufferedRuntimeExecutor(), getRuntimeScheduler(), fabricUIManager, eventBeatManager, componentFactory);
        fabricUIManager.initialize();
        Trace.endSection();
        Trace.endSection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @f84
    public static final native JSTimerExecutor createJSTimerExecutor();

    private final native long getJavaScriptContext();

    private final native NativeMethodCallInvokerHolderImpl getNativeMethodCallInvokerHolder();

    private final native RuntimeScheduler getRuntimeScheduler();

    private final native RuntimeExecutor getUnbufferedRuntimeExecutor();

    private final native void handleMemoryPressureJs(int pressureLevel);

    @f84
    private final native HybridData initHybrid(JSRuntimeFactory jsRuntimeFactory, MessageQueueThread jsMessageQueueThread, MessageQueueThread nativeModulesMessageQueueThread, JavaTimerManager timerManager, JSTimerExecutor jsTimerExecutor, ReactJsExceptionHandler jReactExceptionsManager, BindingsInstaller jBindingsInstaller, boolean isProfiling, ReactHostInspectorTarget reactHostInspectorTarget);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void loadJSBundleFromAssets(AssetManager assetManager, String assetURL);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void loadJSBundleFromFile(String fileName, String sourceURL);

    private final native void registerSegmentNative(int segmentId, String segmentPath);

    public final native void callFunctionOnModule(String moduleName, String methodName, NativeArray args);

    public final void d() {
        s55.b("ReactInstance", "ReactInstance.destroy() is called.");
        this.e.destroy();
        this.b.invalidate();
        this.f.invalidate();
        JavaTimerManager javaTimerManager = this.c;
        javaTimerManager.getClass();
        WeakHashMap<ReactContext, dh6> weakHashMap = dh6.e;
        ReactApplicationContext reactApplicationContext = javaTimerManager.a;
        dh6.a.a(reactApplicationContext).a.remove(javaTimerManager);
        reactApplicationContext.removeLifecycleEventListener(javaTimerManager);
        javaTimerManager.b();
        if (javaTimerManager.c0) {
            javaTimerManager.c.c(a.EnumC0132a.d, javaTimerManager.Z);
            javaTimerManager.c0 = false;
        }
        this.mHybridData.resetNative();
        this.g.clear();
    }

    public final <T extends NativeModule> T e(String str) {
        T t;
        str.getClass();
        synchronized (this.b) {
            t = (T) this.b.getModule(str);
        }
        return t;
    }

    public final void f(int i) {
        try {
            handleMemoryPressureJs(i);
        } catch (NullPointerException unused) {
            ReactSoftExceptionLogger.logSoftException("ReactInstance", new ReactNoCrashSoftException("Native method handleMemoryPressureJs is called earlier than librninstance.so got ready."));
        }
    }

    public final void g(int i, String str) {
        registerSegmentNative(i, str);
    }

    public final native RuntimeExecutor getBufferedRuntimeExecutor();

    public final native CallInvokerHolderImpl getJSCallInvokerHolder();

    public final void h(qoc qocVar) {
        qocVar.getClass();
        SurfaceHandlerBinding surfaceHandlerBinding = qocVar.a;
        s55.b("ReactInstance", "startSurface() is called with surface: " + surfaceHandlerBinding.d());
        Trace.beginSection(jpf.g("ReactInstance.startSurface"));
        ViewGroup viewGroupB = qocVar.b();
        if (viewGroupB == null) {
            r6.g("Starting surface without a view is not supported, use prerenderSurface instead.");
            return;
        }
        if (viewGroupB.getId() != -1) {
            ReactSoftExceptionLogger.logSoftException("ReactInstance", new IllegalViewOperationException("surfaceView's is NOT equal to View.NO_ID before calling startSurface."));
            viewGroupB.setId(-1);
        }
        boolean zF = surfaceHandlerBinding.f();
        FabricUIManager fabricUIManager = this.f;
        if (zF) {
            fabricUIManager.attachRootView(surfaceHandlerBinding, viewGroupB);
        } else {
            fabricUIManager.startSurface(surfaceHandlerBinding, qocVar.b, viewGroupB);
        }
        Trace.endSection();
    }

    public final void i(qoc qocVar) {
        qocVar.getClass();
        SurfaceHandlerBinding surfaceHandlerBinding = qocVar.a;
        s55.b("ReactInstance", "stopSurface() is called with surface: " + surfaceHandlerBinding.d());
        this.f.stopSurface(surfaceHandlerBinding);
    }

    public final native void unregisterFromInspector();
}
