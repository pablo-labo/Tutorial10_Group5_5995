package defpackage;

import android.content.res.AssetManager;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeArrayInterface;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
@sy3
public final class xm1 implements CatalystInstance {
    public final ReactHostImpl a;

    public xm1(ReactHostImpl reactHostImpl) {
        reactHostImpl.getClass();
        this.a = reactHostImpl;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        notThreadSafeBridgeIdleDebugListener.getClass();
        throw new UnsupportedOperationException("Unimplemented method 'addBridgeIdleDebugListener'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void callFunction(String str, String str2, NativeArray nativeArray) {
        str.getClass();
        str2.getClass();
        throw new UnsupportedOperationException("Unimplemented method 'callFunction'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    /* JADX INFO: renamed from: destroy */
    public final void lambda$onNativeException$6() {
        throw new UnsupportedOperationException("Unimplemented method 'destroy'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void extendNativeModules(NativeModuleRegistry nativeModuleRegistry) {
        nativeModuleRegistry.getClass();
        throw new UnsupportedOperationException("Unimplemented method 'extendNativeModules'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @sy3
    public final UIManager getFabricUIManager() {
        throw new UnsupportedOperationException("Unimplemented method 'getFabricUIManager'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @sy3
    public final CallInvokerHolder getJSCallInvokerHolder() {
        CallInvokerHolderImpl jSCallInvokerHolder;
        ReactHostImpl reactHostImpl = this.a;
        ReactInstance reactInstance = reactHostImpl.l;
        if (reactInstance != null) {
            jSCallInvokerHolder = reactInstance.getJSCallInvokerHolder();
        } else {
            reactHostImpl.u("getJSCallInvokerHolder()", "Tried to get JSCallInvokerHolder while instance is not ready", null);
            jSCallInvokerHolder = null;
        }
        jSCallInvokerHolder.getClass();
        return jSCallInvokerHolder;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        cls.getClass();
        ReactContext reactContextA = this.a.a();
        if (reactContextA != null) {
            return (T) reactContextA.getJSModule(cls);
        }
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @sy3
    public final JavaScriptContextHolder getJavaScriptContextHolder() {
        ReactInstance reactInstance = this.a.l;
        JavaScriptContextHolder javaScriptContextHolder = reactInstance != null ? reactInstance.g : null;
        javaScriptContextHolder.getClass();
        return javaScriptContextHolder;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final NativeMethodCallInvokerHolder getNativeMethodCallInvokerHolder() {
        throw new UnsupportedOperationException("Unimplemented method 'getNativeMethodCallInvokerHolder'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final NativeModule getNativeModule(String str) {
        str.getClass();
        ReactInstance reactInstance = this.a.l;
        if (reactInstance != null) {
            return reactInstance.e(str);
        }
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final Collection<NativeModule> getNativeModules() {
        Collection<NativeModule> modules;
        ReactInstance reactInstance = this.a.l;
        return (reactInstance == null || (modules = reactInstance.b.getModules()) == null) ? zr4.a : modules;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final ReactQueueConfiguration getReactQueueConfiguration() {
        ReactInstance reactInstance = this.a.l;
        ReactQueueConfigurationImpl reactQueueConfigurationImpl = reactInstance != null ? reactInstance.e : null;
        reactQueueConfigurationImpl.getClass();
        return reactQueueConfigurationImpl;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final RuntimeExecutor getRuntimeExecutor() {
        ReactHostImpl reactHostImpl = this.a;
        ReactInstance reactInstance = reactHostImpl.l;
        if (reactInstance != null) {
            return reactInstance.getBufferedRuntimeExecutor();
        }
        reactHostImpl.u("getRuntimeExecutor()", "Tried to get runtime executor while instance is not ready", null);
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final RuntimeScheduler getRuntimeScheduler() {
        throw new UnsupportedOperationException("Unimplemented method 'getRuntimeScheduler'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final String getSourceURL() {
        throw new UnsupportedOperationException("Unimplemented method 'getSourceURL'");
    }

    @Override // com.facebook.react.bridge.MemoryPressureListener
    public final void handleMemoryPressure(int i) {
        throw new UnsupportedOperationException("Unimplemented method 'handleMemoryPressure'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        nmc nmcVar;
        cls.getClass();
        ReactInstance reactInstance = this.a.l;
        if (reactInstance == null || (nmcVar = (nmc) cls.getAnnotation(nmc.class)) == null) {
            return false;
        }
        return reactInstance.b.hasModule(nmcVar.name());
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final boolean hasRunJSBundle() {
        throw new UnsupportedOperationException("Unimplemented method 'hasRunJSBundle'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void initialize() {
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.JSInstance
    public final void invokeCallback(int i, NativeArrayInterface nativeArrayInterface) {
        nativeArrayInterface.getClass();
        throw new UnsupportedOperationException("Unimplemented method 'invokeCallback'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final boolean isDestroyed() {
        throw new UnsupportedOperationException("Unimplemented method 'isDestroyed'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public final void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
        assetManager.getClass();
        str.getClass();
        throw new UnsupportedOperationException("Unimplemented method 'loadScriptFromAssets'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public final void loadScriptFromFile(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        throw new UnsupportedOperationException("Unimplemented method 'loadScriptFromFile'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public final void loadSplitBundleFromFile(String str, String str2) {
        str.getClass();
        str2.getClass();
        throw new UnsupportedOperationException("Unimplemented method 'loadSplitBundleFromFile'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void registerSegment(int i, String str) {
        str.getClass();
        throw new UnsupportedOperationException("Unimplemented method 'registerSegment'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        notThreadSafeBridgeIdleDebugListener.getClass();
        throw new UnsupportedOperationException("Unimplemented method 'removeBridgeIdleDebugListener'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void runJSBundle() {
        throw new UnsupportedOperationException("Unimplemented method 'runJSBundle'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @sy3
    public final void setFabricUIManager(UIManager uIManager) {
        uIManager.getClass();
        throw new UnsupportedOperationException("Unimplemented method 'setFabricUIManager'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final void setGlobalVariable(String str, String str2) {
        str.getClass();
        str2.getClass();
        throw new UnsupportedOperationException("Unimplemented method 'setGlobalVariable'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public final void setSourceURLs(String str, String str2) {
        str.getClass();
        str2.getClass();
        throw new UnsupportedOperationException("Unimplemented method 'setSourceURLs'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @sy3
    public final void setTurboModuleRegistry(TurboModuleRegistry turboModuleRegistry) {
        turboModuleRegistry.getClass();
        throw new UnsupportedOperationException("Unimplemented method 'setTurboModuleRegistry'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public final <T extends NativeModule> T getNativeModule(Class<T> cls) {
        cls.getClass();
        return (T) this.a.o(cls);
    }
}
