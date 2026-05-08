package com.indeed.android.rnprofile;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseProfileModalNativeModule;
import defpackage.cr8;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.nmc;
import defpackage.np7;
import defpackage.qjc;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseProfileModalNativeModule.MODULE_NAME)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ3\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/indeed/android/rnprofile/RNProfileModalNativeModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseProfileModalNativeModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lj6g;", "showShareProfileModalInternal", "()V", "", "routeName", "", "", "routeProps", "showProfileFormModalInternal", "(Ljava/lang/String;Ljava/util/Map;)V", "onCatalystInstanceDestroy", "Lcom/facebook/react/bridge/ReadableMap;", "stackAction", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "showModal", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "hideModal", "(Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Companion", "a", "rnprofile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNProfileModalNativeModule extends IndeedRNBridgeBaseProfileModalNativeModule {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static RNProfileModalNativeModule instance;
    private static volatile gu5<j6g> onHideModalCallback;
    private static gu5<j6g> onShowModalCallback;
    private final ReactApplicationContext reactContext;

    /* JADX INFO: renamed from: com.indeed.android.rnprofile.RNProfileModalNativeModule$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNProfileModalNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
        instance = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showProfileFormModalInternal(String routeName, Map<String, ? extends Object> routeProps) {
        try {
            ((np7) cr8.p(np7.class)).a("[IndeedRNBridge] RNProfileModalNativeModule.showProfileFormModalInternal", "Showing profile form modal with route: " + routeName);
            gu5<j6g> gu5Var = onShowModalCallback;
            if (gu5Var != null) {
                gu5Var.invoke();
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("routeName", routeName);
            if (routeProps != null) {
                writableMapCreateMap.putMap("routeProps", qjc.a(routeProps));
            }
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("navigateToModal", writableMapCreateMap);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseProfileModalNativeModule.MODULE_NAME, "Error in showProfileFormModalInternal", false, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showShareProfileModalInternal() {
        try {
            ((np7) cr8.p(np7.class)).a("[IndeedRNBridge] RNProfileModalNativeModule.showShareProfileModalInternal", "Triggering share profile modal event");
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("showShareProfileModal", null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseProfileModalNativeModule.MODULE_NAME, "Error in showShareProfileModalInternal", false, e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseProfileModalNativeModule
    @ReactMethod
    public void hideModal(Promise promise) {
        promise.getClass();
        try {
            ((np7) cr8.p(np7.class)).a("[IndeedRNBridge] RNProfileModalNativeModule.hideModal", "hideModal called");
            gu5<j6g> gu5Var = onHideModalCallback;
            if (gu5Var != null) {
                gu5Var.invoke();
            }
            promise.resolve(null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseProfileModalNativeModule.MODULE_NAME, "Error in hideModal", false, e);
            promise.reject("HIDE_MODAL_ERROR", "Failed to hide modal: " + e.getMessage(), e);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        instance = null;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseProfileModalNativeModule
    @ReactMethod
    public void showModal(String routeName, ReadableMap routeProps, String stackAction, Promise promise) {
        routeName.getClass();
        promise.getClass();
        try {
            ((np7) cr8.p(np7.class)).a("[IndeedRNBridge] RNProfileModalNativeModule.showModal", "showModal called with route: ".concat(routeName));
            gu5<j6g> gu5Var = onShowModalCallback;
            if (gu5Var != null) {
                gu5Var.invoke();
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("routeName", routeName);
            if (routeProps != null) {
                writableMapCreateMap.putMap("routeProps", routeProps);
            }
            if (stackAction != null) {
                writableMapCreateMap.putString("stackAction", stackAction);
            }
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("navigateToModal", writableMapCreateMap);
            promise.resolve(null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseProfileModalNativeModule.MODULE_NAME, "Error in showModal", false, e);
            promise.reject("SHOW_MODAL_ERROR", "Failed to show modal: " + e.getMessage(), e);
        }
    }
}
