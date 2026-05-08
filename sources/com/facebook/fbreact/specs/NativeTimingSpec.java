package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeTimingSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Timing";

    public NativeTimingSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @f84
    public abstract void createTimer(double d, double d2, double d3, boolean z);

    @ReactMethod
    @f84
    public abstract void deleteTimer(double d);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Timing";
    }

    @ReactMethod
    @f84
    public abstract void setSendIdleEvents(boolean z);
}
