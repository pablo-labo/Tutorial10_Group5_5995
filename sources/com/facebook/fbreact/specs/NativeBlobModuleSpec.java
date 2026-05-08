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
public abstract class NativeBlobModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BlobModule";

    public NativeBlobModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @f84
    public abstract void addNetworkingHandler();

    @ReactMethod
    @f84
    public abstract void addWebSocketHandler(double d);

    @ReactMethod
    @f84
    public abstract void createFromParts(ReadableArray readableArray, String str);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @f84
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BlobModule";
    }

    public abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @f84
    public abstract void release(String str);

    @ReactMethod
    @f84
    public abstract void removeWebSocketHandler(double d);

    @ReactMethod
    @f84
    public abstract void sendOverSocket(ReadableMap readableMap, double d);
}
