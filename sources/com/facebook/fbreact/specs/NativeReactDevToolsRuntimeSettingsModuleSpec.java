package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeReactDevToolsRuntimeSettingsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ReactDevToolsRuntimeSettingsModule";

    public NativeReactDevToolsRuntimeSettingsModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactDevToolsRuntimeSettingsModule";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @f84
    public abstract WritableMap getReloadAndProfileConfig();

    @ReactMethod
    @f84
    public abstract void setReloadAndProfileConfig(ReadableMap readableMap);
}
