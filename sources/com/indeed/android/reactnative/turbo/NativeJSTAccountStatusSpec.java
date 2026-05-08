package com.indeed.android.reactnative.turbo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeJSTAccountStatusSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeJSTAccountStatus";

    public NativeJSTAccountStatusSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @f84
    public abstract WritableMap getAccountStatus();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NativeJSTAccountStatus";
    }
}
