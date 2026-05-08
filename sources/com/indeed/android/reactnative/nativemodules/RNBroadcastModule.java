package com.indeed.android.reactnative.nativemodules;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNBroadcastModule;
import com.indeed.android.tare.broadcast.JSTBroadcast;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import defpackage.cr8;
import defpackage.fwc;
import defpackage.j6g;
import defpackage.l5;
import defpackage.m91;
import defpackage.mqc;
import defpackage.nmc;
import defpackage.np7;
import defpackage.s98;
import defpackage.t98;
import defpackage.wl7;
import defpackage.yd8;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseRNBroadcastModule.MODULE_NAME)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/indeed/android/reactnative/nativemodules/RNBroadcastModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseRNBroadcastModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/ReactContext;", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "Lj6g;", "sendEvent", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/facebook/react/bridge/ReadableMap;", "broadcastEvent", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "dispatch", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "subscribe", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "handle", "unsubscribe", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(D)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNBroadcastModule extends IndeedRNBridgeBaseRNBroadcastModule {
    public static final int $stable = 8;
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNBroadcastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
    }

    private final void sendEvent(ReactContext reactContext, String eventName, WritableMap params) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g subscribe$lambda$1(RNBroadcastModule rNBroadcastModule, JSTBroadcastEvent jSTBroadcastEvent) {
        jSTBroadcastEvent.getClass();
        JsonElement jsonElementE = s98.d.e(JSTBroadcastEvent.INSTANCE.serializer(), jSTBroadcastEvent);
        String strR = fwc.a.b(jSTBroadcastEvent.getClass()).r();
        if (strR != null) {
            rNBroadcastModule.sendEvent(rNBroadcastModule.reactContext, strR, jsonElementE instanceof JsonObject ? t98.d((JsonObject) jsonElementE) : null);
            return j6g.a;
        }
        ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNBroadcastModule.MODULE_NAME, "Failed to get classname for event " + jSTBroadcastEvent + ", skipping sending event", false, null);
        return j6g.a;
    }

    @ReactMethod
    public final void addListener(String eventName) {
        eventName.getClass();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNBroadcastModule
    @ReactMethod
    public void dispatch(ReadableMap broadcastEvent, Promise promise) {
        broadcastEvent.getClass();
        promise.getClass();
        try {
            ((JSTBroadcast) cr8.p(JSTBroadcast.class)).dispatch((JSTBroadcastEvent) mqc.a.d(JSTBroadcastEvent.INSTANCE.serializer(), mqc.b(broadcastEvent)));
            promise.resolve(null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNBroadcastModule.MODULE_NAME, l5.l("Failed to dispatch broadcast event: ", e.getMessage()), false, e);
            promise.reject("ERROR", "Failed to dispatch broadcast event: " + e.getMessage());
        }
    }

    @ReactMethod
    public final void removeListeners(double count) {
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNBroadcastModule
    @ReactMethod
    public void subscribe(String eventName, Promise promise) {
        Object next;
        eventName.getClass();
        promise.getClass();
        Collection<yd8<?>> collectionH = fwc.a.b(JSTBroadcastEvent.class).h();
        collectionH.getClass();
        Iterator<T> it = collectionH.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (wl7.b(((yd8) next).r(), eventName)) {
                    break;
                }
            }
        }
        yd8 yd8Var = (yd8) next;
        if (yd8Var != null) {
            promise.resolve(((JSTBroadcast) cr8.p(JSTBroadcast.class)).subscribe(yd8Var, null, new m91(this, 9)));
        } else {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNBroadcastModule.MODULE_NAME, "Invalid event name: ".concat(eventName), false, null);
            promise.reject("ERROR", "Invalid event name: ".concat(eventName));
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNBroadcastModule
    @ReactMethod
    public void unsubscribe(String handle, Promise promise) {
        handle.getClass();
        promise.getClass();
        try {
            ((JSTBroadcast) cr8.p(JSTBroadcast.class)).unsubscribe(handle);
            promise.resolve(null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNBroadcastModule.MODULE_NAME, "Tried to unsubscribe to handle without subscription: ".concat(handle), false, e);
            promise.reject("ERROR", "Tried to unsubscribe to handle without subscription");
        }
    }
}
