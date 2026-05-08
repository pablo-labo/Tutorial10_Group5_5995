package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeLinkingManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "LinkingManager";

    public NativeLinkingManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @f84
    public abstract void addListener(String str);

    @ReactMethod
    @f84
    public abstract void canOpenURL(String str, Promise promise);

    @ReactMethod
    @f84
    public abstract void getInitialURL(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @f84
    public abstract void openSettings(Promise promise);

    @ReactMethod
    @f84
    public abstract void openURL(String str, Promise promise);

    @ReactMethod
    @f84
    public abstract void removeListeners(double d);
}
