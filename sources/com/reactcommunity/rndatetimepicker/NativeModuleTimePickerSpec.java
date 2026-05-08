package com.reactcommunity.rndatetimepicker;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeModuleTimePickerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCTimePicker";

    public NativeModuleTimePickerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @f84
    public abstract void dismiss(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCTimePicker";
    }

    @ReactMethod
    @f84
    public abstract void open(ReadableMap readableMap, Promise promise);
}
