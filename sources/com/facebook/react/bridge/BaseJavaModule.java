package com.facebook.react.bridge;

import defpackage.f84;
import defpackage.hh1;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseJavaModule implements NativeModule {
    public static final String METHOD_TYPE_ASYNC = "async";
    public static final String METHOD_TYPE_PROMISE = "promise";
    public static final String METHOD_TYPE_SYNC = "sync";
    protected CxxCallbackImpl mEventEmitterCallback;
    private final ReactApplicationContext mReactApplicationContext;

    public BaseJavaModule(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return false;
    }

    public Map<String, Object> getConstants() {
        return null;
    }

    public final ReactApplicationContext getReactApplicationContext() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        hh1.o(reactApplicationContext, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        return reactApplicationContext;
    }

    public final ReactApplicationContext getReactApplicationContextIfActiveOrWarn() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
            return this.mReactApplicationContext;
        }
        ReactSoftExceptionLogger.logSoftException("ReactNative", new RuntimeException("React Native Instance has already disappeared: requested by " + getName()));
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void initialize() {
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
    }

    @f84
    public void setEventEmitterCallback(CxxCallbackImpl cxxCallbackImpl) {
        this.mEventEmitterCallback = cxxCallbackImpl;
    }

    public BaseJavaModule() {
        this(null);
    }
}
