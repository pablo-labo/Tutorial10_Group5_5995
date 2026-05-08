package com.swmansion.gesturehandler;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeRNGestureHandlerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNGestureHandlerModule";

    public NativeRNGestureHandlerModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @f84
    public abstract void attachGestureHandler(double d, double d2, double d3);

    @ReactMethod
    @f84
    public abstract void createGestureHandler(String str, double d, ReadableMap readableMap);

    @ReactMethod
    @f84
    public abstract void dropGestureHandler(double d);

    @ReactMethod
    @f84
    public abstract void flushOperations();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerModule";
    }

    @ReactMethod
    @f84
    public abstract void handleClearJSResponder();

    @ReactMethod
    @f84
    public abstract void handleSetJSResponder(double d, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @f84
    public abstract boolean install();

    @ReactMethod
    @f84
    public abstract void updateGestureHandler(double d, ReadableMap readableMap);
}
