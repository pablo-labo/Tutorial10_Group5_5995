package com.facebook.react.bridge;

import android.content.Context;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import defpackage.f84;
import defpackage.hh1;
import defpackage.l5;
import defpackage.r6;
import defpackage.s55;
import defpackage.z3;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class BridgeReactContext extends ReactApplicationContext {
    private static final String EARLY_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.";
    private static final String EARLY_NATIVE_MODULE_EXCEPTION_MESSAGE = "Trying to call native module before CatalystInstance has been set!";
    private static final String LATE_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module after the React instance was destroyed.";
    private static final String LATE_NATIVE_MODULE_EXCEPTION_MESSAGE = "Trying to call native module after CatalystInstance has been destroyed!";
    private static final String TAG = "BridgeReactContext";
    private CatalystInstance mCatalystInstance;
    private volatile boolean mDestroyed;

    @f84
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    public BridgeReactContext(Context context) {
        super(context);
        this.mDestroyed = false;
    }

    private void raiseCatalystInstanceMissingException() {
        throw new IllegalStateException(this.mDestroyed ? LATE_NATIVE_MODULE_EXCEPTION_MESSAGE : EARLY_NATIVE_MODULE_EXCEPTION_MESSAGE);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        this.mDestroyed = true;
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            catalystInstance.lambda$onNativeException$6();
        }
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        hh1.n(catalystInstance);
        return catalystInstance;
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public UIManager getFabricUIManager() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        Objects.requireNonNull(catalystInstance);
        return catalystInstance.getFabricUIManager();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CallInvokerHolder getJSCallInvokerHolder() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.getJSCallInvokerHolder();
        }
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        T t;
        if (this.mCatalystInstance != null) {
            InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
            return (interopModuleRegistry == null || (t = (T) interopModuleRegistry.getInteropModule(cls)) == null) ? (T) this.mCatalystInstance.getJSModule(cls) : t;
        }
        if (this.mDestroyed) {
            r6.g(LATE_JS_ACCESS_EXCEPTION_MESSAGE);
            return null;
        }
        r6.g(EARLY_JS_ACCESS_EXCEPTION_MESSAGE);
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.getJavaScriptContextHolder();
        }
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        hh1.n(this.mCatalystInstance);
        return (T) this.mCatalystInstance.getNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection<NativeModule> getNativeModules() {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        hh1.n(this.mCatalystInstance);
        return this.mCatalystInstance.getNativeModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public String getSourceURL() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance == null) {
            return null;
        }
        return catalystInstance.getSourceURL();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception exc) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        boolean z = catalystInstance != null;
        boolean z2 = (catalystInstance == null || catalystInstance.isDestroyed()) ? false : true;
        boolean z3 = getJSExceptionHandler() != null;
        if (z2 && z3) {
            getJSExceptionHandler().handleException(exc);
            return;
        }
        s55.g("ReactNative", "Unable to handle Exception - catalystInstanceVariableExists: " + z + " - isCatalystInstanceAlive: " + z2 + " - hasExceptionHandler: " + z3, exc);
        z3.q(exc);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public boolean hasActiveCatalystInstance() {
        return hasActiveReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        return (catalystInstance == null || catalystInstance.isDestroyed()) ? false : true;
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public boolean hasCatalystInstance() {
        return this.mCatalystInstance != null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        hh1.n(this.mCatalystInstance);
        return this.mCatalystInstance.hasNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.mCatalystInstance != null;
    }

    public void initializeWithInstance(CatalystInstance catalystInstance) {
        if (catalystInstance == null) {
            l5.q("CatalystInstance cannot be null.");
            return;
        }
        if (this.mCatalystInstance != null) {
            r6.g("ReactContext has been already initialized");
            return;
        }
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot initialize ReactContext after it has been destroyed."));
        }
        this.mCatalystInstance = catalystInstance;
        initializeMessageQueueThreads(catalystInstance.getReactQueueConfiguration());
        initializeInteropModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public boolean isBridgeless() {
        return false;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int i, String str, Callback callback) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        hh1.n(catalystInstance);
        catalystInstance.registerSegment(i, str);
        hh1.n(callback);
        callback.invoke(new Object[0]);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(String str) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        hh1.n(this.mCatalystInstance);
        return this.mCatalystInstance.getNativeModule(str);
    }
}
