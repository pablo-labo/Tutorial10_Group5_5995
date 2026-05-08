package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeDeviceInfoSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DeviceInfo";

    public NativeDeviceInfoSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @f84
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DeviceInfo";
    }

    public abstract Map<String, Object> getTypedExportedConstants();
}
