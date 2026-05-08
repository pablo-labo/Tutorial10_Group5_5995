package com.facebook.react.bridge;

import android.content.res.AssetManager;
import android.os.Trace;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.systrace.TraceListener;
import defpackage.bg;
import defpackage.f84;
import defpackage.hh1;
import defpackage.hy1;
import defpackage.ie7;
import defpackage.iy1;
import defpackage.jpf;
import defpackage.jy1;
import defpackage.ky1;
import defpackage.l6;
import defpackage.ly1;
import defpackage.my1;
import defpackage.nmc;
import defpackage.pyd;
import defpackage.s55;
import defpackage.xn0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
@f84
public class CatalystInstanceImpl implements CatalystInstance {
    private static final AtomicInteger sNextInstanceIdForTrace;
    private volatile boolean mAcceptCalls;
    private final CopyOnWriteArrayList<NotThreadSafeBridgeIdleDebugListener> mBridgeIdleListeners;
    private volatile boolean mDestroyed;
    private UIManager mFabricUIManager;
    private final HybridData mHybridData;
    private boolean mInitialized;
    private ReactInstanceManagerInspectorTarget mInspectorTarget;
    private boolean mJSBundleHasLoaded;
    private final JSBundleLoader mJSBundleLoader;
    private final ArrayList<PendingJSCall> mJSCallsPendingInit;
    private final Object mJSCallsPendingInitLock;
    private final JSExceptionHandler mJSExceptionHandler;
    private final JavaScriptModuleRegistry mJSModuleRegistry;
    private JavaScriptContextHolder mJavaScriptContextHolder;
    private final String mJsPendingCallsTitleForTrace;
    private final NativeModuleRegistry mNativeModuleRegistry;
    private final MessageQueueThread mNativeModulesQueueThread;
    private final AtomicInteger mPendingJSCalls;
    private final ReactQueueConfigurationImpl mReactQueueConfiguration;
    private String mSourceURL;
    private final TraceListener mTraceListener;
    private TurboModuleRegistry mTurboModuleRegistry;

    public static class Builder {
        private ReactInstanceManagerInspectorTarget mInspectorTarget;
        private JSBundleLoader mJSBundleLoader;
        private JSExceptionHandler mJSExceptionHandler;
        private JavaScriptExecutor mJSExecutor;
        private ReactQueueConfigurationSpec mReactQueueConfigurationSpec;
        private NativeModuleRegistry mRegistry;

        public CatalystInstanceImpl build() {
            ReactQueueConfigurationSpec reactQueueConfigurationSpec = this.mReactQueueConfigurationSpec;
            hh1.n(reactQueueConfigurationSpec);
            JavaScriptExecutor javaScriptExecutor = this.mJSExecutor;
            hh1.n(javaScriptExecutor);
            NativeModuleRegistry nativeModuleRegistry = this.mRegistry;
            hh1.n(nativeModuleRegistry);
            JSBundleLoader jSBundleLoader = this.mJSBundleLoader;
            hh1.n(jSBundleLoader);
            JSExceptionHandler jSExceptionHandler = this.mJSExceptionHandler;
            hh1.n(jSExceptionHandler);
            return new CatalystInstanceImpl(reactQueueConfigurationSpec, javaScriptExecutor, nativeModuleRegistry, jSBundleLoader, jSExceptionHandler, this.mInspectorTarget, 0);
        }

        public Builder setInspectorTarget(ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget) {
            this.mInspectorTarget = reactInstanceManagerInspectorTarget;
            return this;
        }

        public Builder setJSBundleLoader(JSBundleLoader jSBundleLoader) {
            this.mJSBundleLoader = jSBundleLoader;
            return this;
        }

        public Builder setJSExceptionHandler(JSExceptionHandler jSExceptionHandler) {
            this.mJSExceptionHandler = jSExceptionHandler;
            return this;
        }

        public Builder setJSExecutor(JavaScriptExecutor javaScriptExecutor) {
            this.mJSExecutor = javaScriptExecutor;
            return this;
        }

        public Builder setReactQueueConfigurationSpec(ReactQueueConfigurationSpec reactQueueConfigurationSpec) {
            this.mReactQueueConfigurationSpec = reactQueueConfigurationSpec;
            return this;
        }

        public Builder setRegistry(NativeModuleRegistry nativeModuleRegistry) {
            this.mRegistry = nativeModuleRegistry;
            return this;
        }
    }

    public static class InstanceCallback {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        public InstanceCallback(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onBatchComplete$0(CatalystInstanceImpl catalystInstanceImpl) {
            catalystInstanceImpl.mNativeModuleRegistry.onBatchComplete();
        }

        public void decrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.decrementPendingJSCalls();
            }
        }

        public void incrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.incrementPendingJSCalls();
            }
        }

        public void onBatchComplete() {
            final CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        CatalystInstanceImpl.InstanceCallback.lambda$onBatchComplete$0(catalystInstanceImpl);
                    }
                });
            }
        }
    }

    public static class JSProfilerTraceListener implements TraceListener {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        public JSProfilerTraceListener(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }

        public void onTraceStarted() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(true);
            }
        }

        public void onTraceStopped() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(false);
            }
        }
    }

    public static class PendingJSCall {
        public NativeArray mArguments;
        public String mMethod;
        public String mModule;

        public PendingJSCall(String str, String str2, NativeArray nativeArray) {
            this.mModule = str;
            this.mMethod = str2;
            this.mArguments = nativeArray;
        }

        public void call(CatalystInstanceImpl catalystInstanceImpl) {
            NativeArray writableNativeArray = this.mArguments;
            if (writableNativeArray == null) {
                writableNativeArray = new WritableNativeArray();
            }
            catalystInstanceImpl.jniCallJSFunction(this.mModule, this.mMethod, writableNativeArray);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.mModule);
            sb.append(".");
            sb.append(this.mMethod);
            sb.append("(");
            NativeArray nativeArray = this.mArguments;
            return l6.i(sb, nativeArray == null ? "" : nativeArray.toString(), ")");
        }
    }

    static {
        BridgeSoLoader.staticInit();
        sNextInstanceIdForTrace = new AtomicInteger(1);
    }

    private CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, JSBundleLoader jSBundleLoader, JSExceptionHandler jSExceptionHandler, ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget) {
        this.mPendingJSCalls = new AtomicInteger(0);
        this.mJsPendingCallsTitleForTrace = "pending_js_calls_instance" + sNextInstanceIdForTrace.getAndIncrement();
        this.mDestroyed = false;
        this.mJSCallsPendingInit = new ArrayList<>();
        this.mJSCallsPendingInitLock = new Object();
        this.mInitialized = false;
        this.mAcceptCalls = false;
        s55.b("ReactNative", "Initializing React Xplat Bridge.");
        Trace.beginSection(jpf.g("createCatalystInstanceImpl"));
        this.mHybridData = initHybrid();
        ReactQueueConfigurationImpl reactQueueConfigurationImplCreate = ReactQueueConfigurationImpl.create(reactQueueConfigurationSpec, new NativeExceptionHandler(this, 0));
        this.mReactQueueConfiguration = reactQueueConfigurationImplCreate;
        this.mBridgeIdleListeners = new CopyOnWriteArrayList<>();
        this.mNativeModuleRegistry = nativeModuleRegistry;
        this.mJSModuleRegistry = new JavaScriptModuleRegistry();
        this.mJSBundleLoader = jSBundleLoader;
        this.mJSExceptionHandler = jSExceptionHandler;
        MessageQueueThread nativeModulesQueueThread = reactQueueConfigurationImplCreate.getNativeModulesQueueThread();
        this.mNativeModulesQueueThread = nativeModulesQueueThread;
        this.mTraceListener = new JSProfilerTraceListener(this);
        this.mInspectorTarget = reactInstanceManagerInspectorTarget;
        Trace.endSection();
        s55.b("ReactNative", "Initializing React Xplat Bridge before initializeBridge");
        Trace.beginSection(jpf.g("initializeCxxBridge"));
        initializeBridge(new InstanceCallback(this), javaScriptExecutor, reactQueueConfigurationImplCreate.getJSQueueThread(), nativeModulesQueueThread, nativeModuleRegistry.getJavaModules(this), nativeModuleRegistry.getCxxModules(), this.mInspectorTarget);
        s55.b("ReactNative", "Initializing React Xplat Bridge after initializeBridge");
        Trace.endSection();
        this.mJavaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementPendingJSCalls() {
        int iDecrementAndGet = this.mPendingJSCalls.decrementAndGet();
        boolean z = iDecrementAndGet == 0;
        pyd.Z(iDecrementAndGet, this.mJsPendingCallsTitleForTrace);
        if (!z || this.mBridgeIdleListeners.isEmpty()) {
            return;
        }
        this.mNativeModulesQueueThread.runOnQueue(new my1(this, 0));
    }

    private native long getJavaScriptContext();

    private <T extends NativeModule> String getNameFromAnnotation(Class<T> cls) {
        nmc nmcVar = (nmc) cls.getAnnotation(nmc.class);
        if (nmcVar != null) {
            return nmcVar.name();
        }
        bg.m(cls.getCanonicalName(), "Could not find @ReactModule annotation in ");
        return null;
    }

    private TurboModuleRegistry getTurboModuleRegistry() {
        if (!ie7.g0.useTurboModules()) {
            return null;
        }
        TurboModuleRegistry turboModuleRegistry = this.mTurboModuleRegistry;
        hh1.o(turboModuleRegistry, "TurboModules are enabled, but mTurboModuleRegistry hasn't been set.");
        return turboModuleRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void incrementPendingJSCalls() {
        int andIncrement = this.mPendingJSCalls.getAndIncrement();
        boolean z = andIncrement == 0;
        pyd.Z(andIncrement + 1, this.mJsPendingCallsTitleForTrace);
        if (!z || this.mBridgeIdleListeners.isEmpty()) {
            return;
        }
        this.mNativeModulesQueueThread.runOnQueue(new ky1(this, 0));
    }

    private static native HybridData initHybrid();

    private native void initializeBridge(InstanceCallback instanceCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2, ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget);

    private native void jniCallJSCallback(int i, NativeArray nativeArray);

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniCallJSFunction(String str, String str2, NativeArray nativeArray);

    private native void jniExtendNativeModules(Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniHandleMemoryPressure(int i);

    private native void jniLoadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    private native void jniLoadScriptFromFile(String str, String str2, boolean z);

    private native void jniRegisterSegment(int i, String str);

    private native void jniSetSourceURL(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decrementPendingJSCalls$5() {
        Iterator<NotThreadSafeBridgeIdleDebugListener> it = this.mBridgeIdleListeners.iterator();
        while (it.hasNext()) {
            it.next().onTransitionToBridgeIdle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$0() {
        this.mJavaScriptContextHolder.clear();
        this.mHybridData.resetNative();
        getReactQueueConfiguration().destroy();
        s55.n("ReactNative", "CatalystInstanceImpl.destroy() end");
        ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$1() {
        TurboModuleRegistry turboModuleRegistry = this.mTurboModuleRegistry;
        if (turboModuleRegistry != null) {
            turboModuleRegistry.invalidate();
        }
        new Thread(new xn0(this, 1), "destroy_react_context").start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$2() {
        this.mNativeModuleRegistry.notifyJSInstanceDestroy();
        UIManager uIManager = this.mFabricUIManager;
        if (uIManager != null) {
            uIManager.invalidate();
        }
        int i = 0;
        boolean z = this.mPendingJSCalls.getAndSet(0) == 0;
        if (!this.mBridgeIdleListeners.isEmpty()) {
            for (NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener : this.mBridgeIdleListeners) {
                if (!z) {
                    notThreadSafeBridgeIdleDebugListener.onTransitionToBridgeIdle();
                }
                notThreadSafeBridgeIdleDebugListener.onBridgeDestroyed();
            }
        }
        getReactQueueConfiguration().getJSQueueThread().runOnQueue(new iy1(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$incrementPendingJSCalls$4() {
        Iterator<NotThreadSafeBridgeIdleDebugListener> it = this.mBridgeIdleListeners.iterator();
        while (it.hasNext()) {
            it.next().onTransitionToBridgeBusy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$3() {
        this.mNativeModuleRegistry.notifyJSInstanceInitialized();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNativeException(Exception exc) {
        this.mJSExceptionHandler.handleException(exc);
        this.mReactQueueConfiguration.getUIQueueThread().runOnQueue(new jy1(this, 0));
    }

    private native void unregisterFromInspector();

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.add(notThreadSafeBridgeIdleDebugListener);
    }

    public void callFunction(PendingJSCall pendingJSCall) {
        if (this.mDestroyed) {
            s55.n("ReactNative", "Calling JS function after bridge has been destroyed: " + pendingJSCall.toString());
            return;
        }
        if (!this.mAcceptCalls) {
            synchronized (this.mJSCallsPendingInitLock) {
                try {
                    if (!this.mAcceptCalls) {
                        this.mJSCallsPendingInit.add(pendingJSCall);
                        return;
                    }
                } finally {
                }
            }
        }
        pendingJSCall.call(this);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    /* JADX INFO: renamed from: destroy, reason: merged with bridge method [inline-methods] */
    public void lambda$onNativeException$6() {
        s55.b("ReactNative", "CatalystInstanceImpl.destroy() start");
        UiThreadUtil.assertOnUiThread();
        if (this.mDestroyed) {
            return;
        }
        ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget = this.mInspectorTarget;
        if (reactInstanceManagerInspectorTarget != null) {
            hh1.m(reactInstanceManagerInspectorTarget.isValid(), "ReactInstanceManager inspector target destroyed before instance was unregistered");
        }
        unregisterFromInspector();
        ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
        this.mDestroyed = true;
        this.mNativeModulesQueueThread.runOnQueue(new hy1(this, 0));
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void extendNativeModules(NativeModuleRegistry nativeModuleRegistry) {
        this.mNativeModuleRegistry.registerModules(nativeModuleRegistry);
        jniExtendNativeModules(nativeModuleRegistry.getJavaModules(this), nativeModuleRegistry.getCxxModules());
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public UIManager getFabricUIManager() {
        return this.mFabricUIManager;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public native CallInvokerHolderImpl getJSCallInvokerHolder();

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        return (T) this.mJSModuleRegistry.getJavaScriptModule(this, cls);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mJavaScriptContextHolder;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public native NativeMethodCallInvokerHolderImpl getNativeMethodCallInvokerHolder();

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(String str) {
        NativeModule module;
        if (getTurboModuleRegistry() != null && (module = getTurboModuleRegistry().getModule(str)) != null) {
            return module;
        }
        if (this.mNativeModuleRegistry.hasModule(str)) {
            return this.mNativeModuleRegistry.getModule(str);
        }
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public Collection<NativeModule> getNativeModules() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mNativeModuleRegistry.getAllModules());
        if (getTurboModuleRegistry() != null) {
            Iterator<NativeModule> it = getTurboModuleRegistry().getModules().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public ReactQueueConfiguration getReactQueueConfiguration() {
        return this.mReactQueueConfiguration;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public native RuntimeExecutor getRuntimeExecutor();

    @Override // com.facebook.react.bridge.CatalystInstance
    public native RuntimeScheduler getRuntimeScheduler();

    @Override // com.facebook.react.bridge.CatalystInstance
    public String getSourceURL() {
        return this.mSourceURL;
    }

    @Override // com.facebook.react.bridge.MemoryPressureListener
    public void handleMemoryPressure(int i) {
        if (this.mDestroyed) {
            return;
        }
        jniHandleMemoryPressure(i);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        String nameFromAnnotation = getNameFromAnnotation(cls);
        if (getTurboModuleRegistry() == null || !getTurboModuleRegistry().hasModule(nameFromAnnotation)) {
            return this.mNativeModuleRegistry.hasModule(nameFromAnnotation);
        }
        return true;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasRunJSBundle() {
        boolean z;
        synchronized (this.mJSCallsPendingInitLock) {
            try {
                z = this.mJSBundleHasLoaded && this.mAcceptCalls;
            } finally {
            }
        }
        return z;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void initialize() {
        s55.b("ReactNative", "CatalystInstanceImpl.initialize()");
        hh1.m(!this.mInitialized, "This catalyst instance has already been initialized");
        hh1.m(this.mAcceptCalls, "RunJSBundle hasn't completed.");
        this.mInitialized = true;
        this.mNativeModulesQueueThread.runOnQueue(new ly1(this, 0));
    }

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.JSInstance
    public void invokeCallback(int i, NativeArrayInterface nativeArrayInterface) {
        if (this.mDestroyed) {
            s55.n("ReactNative", "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallback(i, (NativeArray) nativeArrayInterface);
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromAssets(assetManager, str, z);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromFile(String str, String str2, boolean z) {
        this.mSourceURL = str2;
        jniLoadScriptFromFile(str, str2, z);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadSplitBundleFromFile(String str, String str2) {
        jniLoadScriptFromFile(str, str2, false);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void registerSegment(int i, String str) {
        jniRegisterSegment(i, str);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.remove(notThreadSafeBridgeIdleDebugListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void runJSBundle() {
        s55.b("ReactNative", "CatalystInstanceImpl.runJSBundle()");
        hh1.m(!this.mJSBundleHasLoaded, "JS bundle was already loaded!");
        this.mJSBundleLoader.loadScript(this);
        synchronized (this.mJSCallsPendingInitLock) {
            try {
                this.mAcceptCalls = true;
                Iterator<PendingJSCall> it = this.mJSCallsPendingInit.iterator();
                while (it.hasNext()) {
                    it.next().call(this);
                }
                this.mJSCallsPendingInit.clear();
                this.mJSBundleHasLoaded = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setFabricUIManager(UIManager uIManager) {
        this.mFabricUIManager = uIManager;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public native void setGlobalVariable(String str, String str2);

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setSourceURLs(String str, String str2) {
        this.mSourceURL = str;
        jniSetSourceURL(str2);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setTurboModuleRegistry(TurboModuleRegistry turboModuleRegistry) {
        this.mTurboModuleRegistry = turboModuleRegistry;
    }

    public class NativeExceptionHandler implements QueueThreadExceptionHandler {
        private NativeExceptionHandler() {
        }

        @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
        public void handleException(Exception exc) {
            CatalystInstanceImpl.this.onNativeException(exc);
        }

        public /* synthetic */ NativeExceptionHandler(CatalystInstanceImpl catalystInstanceImpl, int i) {
            this();
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        return (T) getNativeModule(getNameFromAnnotation(cls));
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void callFunction(String str, String str2, NativeArray nativeArray) {
        callFunction(new PendingJSCall(str, str2, nativeArray));
    }

    public /* synthetic */ CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, JSBundleLoader jSBundleLoader, JSExceptionHandler jSExceptionHandler, ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget, int i) {
        this(reactQueueConfigurationSpec, javaScriptExecutor, nativeModuleRegistry, jSBundleLoader, jSExceptionHandler, reactInstanceManagerInspectorTarget);
    }
}
