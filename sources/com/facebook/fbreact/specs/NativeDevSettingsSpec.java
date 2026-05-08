package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevSettings";

    public NativeDevSettingsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @f84
    public abstract void addListener(String str);

    @ReactMethod
    @f84
    public abstract void addMenuItem(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DevSettings";
    }

    @ReactMethod
    @f84
    public void onFastRefresh() {
    }

    @ReactMethod
    @f84
    public void openDebugger() {
    }

    @ReactMethod
    @f84
    public abstract void reload();

    @ReactMethod
    @f84
    public void reloadWithReason(String str) {
    }

    @ReactMethod
    @f84
    public abstract void removeListeners(double d);

    @ReactMethod
    @f84
    public abstract void setHotLoadingEnabled(boolean z);

    @ReactMethod
    @f84
    public abstract void setIsShakeToShowDevMenuEnabled(boolean z);

    @ReactMethod
    @f84
    public abstract void setProfilingEnabled(boolean z);

    @ReactMethod
    @f84
    public abstract void toggleElementInspector();
}
