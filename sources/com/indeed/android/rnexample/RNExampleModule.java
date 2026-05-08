package com.indeed.android.rnexample;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseExampleModule;
import defpackage.nmc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseExampleModule.MODULE_NAME)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/indeed/android/rnexample/RNExampleModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseExampleModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "message", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "exampleMethod", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "rnexample_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNExampleModule extends IndeedRNBridgeBaseExampleModule {
    public static final int $stable = IndeedRNBridgeBaseExampleModule.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNExampleModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseExampleModule
    @ReactMethod
    public void exampleMethod(String message, Promise promise) {
        message.getClass();
        promise.getClass();
        promise.resolve("Message received: ".concat(message));
    }
}
