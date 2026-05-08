package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeIntentAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IntentAndroid";

    public NativeIntentAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @f84
    public abstract void canOpenURL(String str, Promise promise);

    @ReactMethod
    @f84
    public abstract void getInitialURL(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IntentAndroid";
    }

    @ReactMethod
    @f84
    public abstract void openSettings(Promise promise);

    @ReactMethod
    @f84
    public abstract void openURL(String str, Promise promise);

    @ReactMethod
    @f84
    public abstract void sendIntent(String str, ReadableArray readableArray, Promise promise);
}
