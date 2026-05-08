package com.horcrux.svg;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeSvgRenderableModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNSVGRenderableModule";

    public NativeSvgRenderableModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @f84
    public abstract WritableMap getBBox(Double d, ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @f84
    public abstract WritableMap getCTM(Double d);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGRenderableModule";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @f84
    public abstract WritableMap getPointAtLength(Double d, ReadableMap readableMap);

    @ReactMethod
    @f84
    public abstract void getRawResource(String str, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @f84
    public abstract WritableMap getScreenCTM(Double d);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @f84
    public abstract double getTotalLength(Double d);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @f84
    public abstract boolean isPointInFill(Double d, ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @f84
    public abstract boolean isPointInStroke(Double d, ReadableMap readableMap);
}
