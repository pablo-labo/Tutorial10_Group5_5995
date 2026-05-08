package com.indeed.android.reactnative.nativemodules;

import android.util.Log;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSONCallbackNativeModule;
import com.indeed.android.uiplugin.oneoff.JSONCallbackError;
import com.indeed.android.uiplugin.oneoff.a;
import defpackage.lc9;
import defpackage.lz2;
import defpackage.mqc;
import defpackage.nmc;
import defpackage.qjc;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseRNJSONCallbackNativeModule.MODULE_NAME)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/indeed/android/reactnative/nativemodules/RNJSONCallbackNativeModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseRNJSONCallbackNativeModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "callbackId", "Lcom/facebook/react/bridge/ReadableMap;", "data", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "triggerJSONCallback", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNJSONCallbackNativeModule extends IndeedRNBridgeBaseRNJSONCallbackNativeModule {
    public static final int $stable = 8;
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNJSONCallbackNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSONCallbackNativeModule
    @ReactMethod
    public void triggerJSONCallback(String callbackId, ReadableMap data, Promise promise) {
        callbackId.getClass();
        promise.getClass();
        ArrayList arrayList = lz2.a;
        JsonObject jsonObjectB = null;
        Log.d(IndeedRNBridgeBaseRNJSONCallbackNativeModule.MODULE_NAME, "triggerJSONCallback - callbackId: ".concat(callbackId), null);
        if (data != null) {
            try {
                jsonObjectB = mqc.b(data);
            } catch (JSONCallbackError e) {
                ArrayList arrayList2 = lz2.a;
                lz2.b(IndeedRNBridgeBaseRNJSONCallbackNativeModule.MODULE_NAME, "Failed to trigger callback", false, e);
                String message = e.getMessage();
                promise.reject("TRIGGER_FAILED", message != null ? message : "Failed to trigger callback", e);
                return;
            } catch (Exception e2) {
                ArrayList arrayList3 = lz2.a;
                lz2.b(IndeedRNBridgeBaseRNJSONCallbackNativeModule.MODULE_NAME, "Failed to trigger callback", false, e2);
                promise.reject("TRIGGER_FAILED", "Failed to trigger callback: " + e2.getMessage(), e2);
                return;
            }
        }
        a.a.b(callbackId, jsonObjectB);
        Boolean bool = Boolean.TRUE;
        promise.resolve(qjc.a(lc9.a0(new Pair("success", bool), new Pair("callbackId", callbackId), new Pair("triggered", bool))));
    }
}
