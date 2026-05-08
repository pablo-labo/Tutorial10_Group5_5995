package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeAnimatedModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeAnimatedModule";

    public NativeAnimatedModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @f84
    public abstract void addAnimatedEventToView(double d, String str, ReadableMap readableMap);

    @ReactMethod
    @f84
    public abstract void addListener(String str);

    @ReactMethod
    @f84
    public abstract void connectAnimatedNodeToView(double d, double d2);

    @ReactMethod
    @f84
    public abstract void connectAnimatedNodes(double d, double d2);

    @ReactMethod
    @f84
    public abstract void createAnimatedNode(double d, ReadableMap readableMap);

    @ReactMethod
    @f84
    public abstract void disconnectAnimatedNodeFromView(double d, double d2);

    @ReactMethod
    @f84
    public abstract void disconnectAnimatedNodes(double d, double d2);

    @ReactMethod
    @f84
    public abstract void dropAnimatedNode(double d);

    @ReactMethod
    @f84
    public abstract void extractAnimatedNodeOffset(double d);

    @ReactMethod
    @f84
    public abstract void finishOperationBatch();

    @ReactMethod
    @f84
    public abstract void flattenAnimatedNodeOffset(double d);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NativeAnimatedModule";
    }

    @ReactMethod
    @f84
    public abstract void getValue(double d, Callback callback);

    @ReactMethod
    @f84
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
    }

    @ReactMethod
    @f84
    public abstract void removeAnimatedEventFromView(double d, String str, double d2);

    @ReactMethod
    @f84
    public abstract void removeListeners(double d);

    @ReactMethod
    @f84
    public abstract void restoreDefaultValues(double d);

    @ReactMethod
    @f84
    public abstract void setAnimatedNodeOffset(double d, double d2);

    @ReactMethod
    @f84
    public abstract void setAnimatedNodeValue(double d, double d2);

    @ReactMethod
    @f84
    public abstract void startAnimatingNode(double d, double d2, ReadableMap readableMap, Callback callback);

    @ReactMethod
    @f84
    public abstract void startListeningToAnimatedNodeValue(double d);

    @ReactMethod
    @f84
    public abstract void startOperationBatch();

    @ReactMethod
    @f84
    public abstract void stopAnimation(double d);

    @ReactMethod
    @f84
    public abstract void stopListeningToAnimatedNodeValue(double d);

    @ReactMethod
    @f84
    public void updateAnimatedNodeConfig(double d, ReadableMap readableMap) {
    }
}
