package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeStatusBarManagerAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "StatusBarManager";

    public NativeStatusBarManagerAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @f84
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "StatusBarManager";
    }

    public abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @f84
    public abstract void setColor(double d, boolean z);

    @ReactMethod
    @f84
    public abstract void setHidden(boolean z);

    @ReactMethod
    @f84
    public abstract void setStyle(String str);

    @ReactMethod
    @f84
    public abstract void setTranslucent(boolean z);
}
