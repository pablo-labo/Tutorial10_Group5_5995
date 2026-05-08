package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeSettingsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SettingsManager";

    public NativeSettingsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @f84
    public abstract void deleteValues(ReadableArray readableArray);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @f84
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @f84
    public abstract void setValues(ReadableMap readableMap);
}
