package com.indeed.android.rnsearch;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseSearchModule;
import defpackage.c3g;
import defpackage.cr8;
import defpackage.d24;
import defpackage.j6g;
import defpackage.ndc;
import defpackage.nmc;
import defpackage.o7d;
import defpackage.vh8;
import defpackage.xh8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseSearchModule.MODULE_NAME)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/indeed/android/rnsearch/RNSearchModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseSearchModule;", "Lxh8;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "detectDeviceLocation", "(Lcom/facebook/react/bridge/Promise;)V", "location", "updateWhereLocation", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "eventName", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(D)V", "rnsearch_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNSearchModule extends IndeedRNBridgeBaseSearchModule implements xh8 {
    public static final int $stable = IndeedRNBridgeBaseSearchModule.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNSearchModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g detectDeviceLocation$lambda$1(Promise promise, o7d o7dVar) {
        if (o7dVar.b() instanceof o7d.a) {
            promise.resolve(null);
        } else {
            Object objB = o7dVar.b();
            if (objB instanceof o7d.a) {
                objB = null;
            }
            d24 d24Var = (d24) objB;
            if (d24Var != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("formattedLocation", d24Var.a);
                writableMapCreateMap.putString("postalCode", d24Var.b);
                writableMapCreateMap.putString("admin1", d24Var.c);
                writableMapCreateMap.putString("admin2", d24Var.d);
                writableMapCreateMap.putString("admin3", d24Var.e);
                writableMapCreateMap.putString("admin4", d24Var.f);
                promise.resolve(writableMapCreateMap);
            } else {
                promise.resolve(null);
            }
        }
        return j6g.a;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseSearchModule
    @ReactMethod
    public void addListener(String eventName) {
        eventName.getClass();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseSearchModule
    @ReactMethod
    public void detectDeviceLocation(Promise promise) {
        promise.getClass();
        if (((c3g) cr8.p(c3g.class)).b()) {
            ((c3g) cr8.p(c3g.class)).c(new ndc(2, promise));
        } else {
            promise.resolve(null);
        }
    }

    @Override // defpackage.xh8
    public vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseSearchModule, com.facebook.react.bridge.NativeModule
    public String getName() {
        return IndeedRNBridgeBaseSearchModule.MODULE_NAME;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseSearchModule
    @ReactMethod
    public void removeListeners(double count) {
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseSearchModule
    @ReactMethod
    public void updateWhereLocation(String location, Promise promise) {
        location.getClass();
        promise.getClass();
        ((c3g) cr8.p(c3g.class)).a(location);
        promise.resolve(null);
    }
}
