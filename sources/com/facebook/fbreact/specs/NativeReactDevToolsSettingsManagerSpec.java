package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeReactDevToolsSettingsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ReactDevToolsSettingsManager";

    public NativeReactDevToolsSettingsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @f84
    public abstract String getGlobalHookSettings();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactDevToolsSettingsManager";
    }

    @ReactMethod
    @f84
    public abstract void setGlobalHookSettings(String str);
}
