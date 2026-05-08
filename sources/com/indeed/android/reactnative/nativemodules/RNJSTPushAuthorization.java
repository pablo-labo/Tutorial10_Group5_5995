package com.indeed.android.reactnative.nativemodules;

import android.os.Build;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTPushAuthorization;
import defpackage.at7;
import defpackage.bf;
import defpackage.cr8;
import defpackage.et7;
import defpackage.ft7;
import defpackage.gt7;
import defpackage.ht7;
import defpackage.j6g;
import defpackage.l;
import defpackage.l5;
import defpackage.mt;
import defpackage.nmc;
import defpackage.np7;
import defpackage.qs0;
import defpackage.wl7;
import defpackage.zi;
import defpackage.zs7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseRNJSTPushAuthorization.MODULE_NAME)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b!\u0010\"J3\u0010#\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b#\u0010 J\u0017\u0010$\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b$\u0010\u001bJ\u0017\u0010%\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b%\u0010\u001bJ\u0017\u0010&\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b&\u0010\u001bJ\u0017\u0010'\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b'\u0010\u001b¨\u0006("}, d2 = {"Lcom/indeed/android/reactnative/nativemodules/RNJSTPushAuthorization;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseRNJSTPushAuthorization;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lft7;", "status", "Lcom/facebook/react/bridge/WritableMap;", "createStatusResult", "(Lft7;)Lcom/facebook/react/bridge/WritableMap;", "", "toRNString", "(Lft7;)Ljava/lang/String;", "Lzs7;", "(Lzs7;)Ljava/lang/String;", "Lht7;", "toPresentationType", "(Ljava/lang/String;)Lht7;", "Lcom/facebook/react/bridge/ReadableMap;", "Lgt7;", "toModalConfig", "(Lcom/facebook/react/bridge/ReadableMap;)Lgt7;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "canShowPushPrompt", "(Lcom/facebook/react/bridge/Promise;)V", "presentationType", "from", "customModalConfig", "requestSystemPushAuthWithPrimer", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "requestImmediateSystemPushAuthorization", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "requestReengagementModal", "getPushAuthorizationStatus", "openPushNotificationAuthorizationSettings", "resetPushPromptCooldownTimeout", "incrementSignificantEvent", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNJSTPushAuthorization extends IndeedRNBridgeBaseRNJSTPushAuthorization {
    public static final int $stable = 8;

    public static final class a implements gt7 {
        public final String a;
        public final String b;

        public a(ReadableMap readableMap) {
            ReadableMap map;
            this.a = (!readableMap.hasKey("customImage") || (map = readableMap.getMap("customImage")) == null) ? null : map.getString("uri");
            this.b = readableMap.hasKey("customMessage") ? readableMap.getString("customMessage") : null;
        }

        @Override // defpackage.gt7
        public final String a() {
            return this.a;
        }

        @Override // defpackage.gt7
        public final String b() {
            return this.b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNJSTPushAuthorization(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    private final WritableMap createStatusResult(ft7 status) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putString("status", toRNString(status));
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openPushNotificationAuthorizationSettings$lambda$4(Promise promise, RNJSTPushAuthorization rNJSTPushAuthorization, et7 et7Var) {
        et7Var.getClass();
        if (et7Var instanceof et7.b) {
            promise.resolve(rNJSTPushAuthorization.createStatusResult(((et7.b) et7Var).a));
            return j6g.a;
        }
        if (et7Var instanceof et7.a) {
            throw null;
        }
        l.g();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g requestImmediateSystemPushAuthorization$lambda$2(Promise promise, RNJSTPushAuthorization rNJSTPushAuthorization, et7 et7Var) {
        et7Var.getClass();
        if (et7Var instanceof et7.b) {
            promise.resolve(rNJSTPushAuthorization.createStatusResult(((et7.b) et7Var).a));
            return j6g.a;
        }
        if (et7Var instanceof et7.a) {
            throw null;
        }
        l.g();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g requestReengagementModal$lambda$3(Promise promise, RNJSTPushAuthorization rNJSTPushAuthorization, zs7 zs7Var) {
        zs7Var.getClass();
        promise.resolve(rNJSTPushAuthorization.toRNString(zs7Var));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g requestSystemPushAuthWithPrimer$lambda$1(Promise promise, RNJSTPushAuthorization rNJSTPushAuthorization, et7 et7Var) {
        et7Var.getClass();
        if (et7Var instanceof et7.b) {
            promise.resolve(rNJSTPushAuthorization.createStatusResult(((et7.b) et7Var).a));
            return j6g.a;
        }
        if (et7Var instanceof et7.a) {
            throw null;
        }
        l.g();
        return null;
    }

    private final gt7 toModalConfig(ReadableMap readableMap) {
        return new a(readableMap);
    }

    private final ht7 toPresentationType(String str) {
        if (wl7.b(str, "alertDialog")) {
            return ht7.a;
        }
        if (wl7.b(str, "bottomSheet")) {
            return ht7.b;
        }
        l5.q(l5.l("Unknown presentation type: ", str));
        return null;
    }

    private final String toRNString(zs7 zs7Var) {
        int iOrdinal = zs7Var.ordinal();
        if (iOrdinal == 0) {
            return "canceledAuthState";
        }
        if (iOrdinal == 1) {
            return "canceledRules";
        }
        if (iOrdinal == 2) {
            return "snooze";
        }
        if (iOrdinal == 3) {
            return "allowNotifications";
        }
        l.g();
        return null;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTPushAuthorization
    @ReactMethod
    public void canShowPushPrompt(Promise promise) {
        promise.getClass();
        try {
            boolean zH = ((at7) cr8.p(at7.class)).h();
            ft7 ft7VarA = ((at7) cr8.p(at7.class)).a();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("canShowPushPrompt", zH);
            writableMapCreateMap.putString("authStatus", toRNString(ft7VarA));
            promise.resolve(writableMapCreateMap);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNJSTPushAuthorization.MODULE_NAME, l5.l("canShowPushPrompt failed: ", e.getMessage()), false, e);
            promise.reject("ERROR", e.getMessage(), e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTPushAuthorization
    @ReactMethod
    public void getPushAuthorizationStatus(Promise promise) {
        promise.getClass();
        try {
            promise.resolve(createStatusResult(((at7) cr8.p(at7.class)).a()));
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNJSTPushAuthorization.MODULE_NAME, l5.l("getPushAuthorizationStatus failed: ", e.getMessage()), false, e);
            promise.reject("ERROR", e.getMessage(), e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTPushAuthorization
    @ReactMethod
    public void incrementSignificantEvent(Promise promise) {
        promise.getClass();
        try {
            ((np7) cr8.p(np7.class)).f(IndeedRNBridgeBaseRNJSTPushAuthorization.MODULE_NAME, "incrementSignificantEvent not implemented", false, null);
            promise.resolve(null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNJSTPushAuthorization.MODULE_NAME, l5.l("incrementSignificantEvent failed: ", e.getMessage()), false, e);
            promise.reject("ERROR", e.getMessage(), e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTPushAuthorization
    @ReactMethod
    public void openPushNotificationAuthorizationSettings(Promise promise) {
        promise.getClass();
        try {
            ((at7) cr8.p(at7.class)).c(new qs0(12, promise, this));
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNJSTPushAuthorization.MODULE_NAME, l5.l("openPushNotificationAuthorizationSettings failed: ", e.getMessage()), false, e);
            promise.reject("ERROR", e.getMessage(), e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTPushAuthorization
    @ReactMethod
    public void requestImmediateSystemPushAuthorization(String from, Promise promise) {
        promise.getClass();
        ((np7) cr8.p(np7.class)).a(IndeedRNBridgeBaseRNJSTPushAuthorization.MODULE_NAME, "requestImmediateSystemPushAuthorization()");
        if (Build.VERSION.SDK_INT < 33) {
            promise.resolve(createStatusResult(ft7.c));
            return;
        }
        try {
            ((at7) cr8.p(at7.class)).e(new bf(5, promise, this));
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNJSTPushAuthorization.MODULE_NAME, l5.l("requestImmediateSystemPushAuthorization failed: ", e.getMessage()), false, e);
            promise.reject("ERROR", e.getMessage(), e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTPushAuthorization
    @ReactMethod
    public void requestReengagementModal(String presentationType, String from, ReadableMap customModalConfig, Promise promise) {
        presentationType.getClass();
        promise.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            promise.resolve("canceledAuthState");
            return;
        }
        try {
            ((at7) cr8.p(at7.class)).f(customModalConfig != null ? toModalConfig(customModalConfig) : null, toPresentationType(presentationType), from, new zi(5, promise, this));
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNJSTPushAuthorization.MODULE_NAME, l5.l("requestReengagementModal failed: ", e.getMessage()), false, e);
            promise.reject("ERROR", e.getMessage(), e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTPushAuthorization
    @ReactMethod
    public void requestSystemPushAuthWithPrimer(String presentationType, String from, ReadableMap customModalConfig, Promise promise) {
        presentationType.getClass();
        promise.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            promise.resolve(createStatusResult(ft7.c));
            return;
        }
        try {
            ((at7) cr8.p(at7.class)).g(customModalConfig != null ? toModalConfig(customModalConfig) : null, toPresentationType(presentationType), from, new mt(9, promise, this));
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNJSTPushAuthorization.MODULE_NAME, l5.l("requestSystemPushAuthWithPrimer failed: ", e.getMessage()), false, e);
            promise.reject("ERROR", e.getMessage(), e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNJSTPushAuthorization
    @ReactMethod
    public void resetPushPromptCooldownTimeout(Promise promise) {
        promise.getClass();
        try {
            ((at7) cr8.p(at7.class)).b();
            promise.resolve(null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNJSTPushAuthorization.MODULE_NAME, l5.l("resetPushPromptCooldownTimeout failed: ", e.getMessage()), false, e);
            promise.reject("ERROR", e.getMessage(), e);
        }
    }

    private final String toRNString(ft7 ft7Var) {
        int iOrdinal = ft7Var.ordinal();
        if (iOrdinal == 0) {
            return "notDetermined";
        }
        if (iOrdinal == 1) {
            return "denied";
        }
        if (iOrdinal == 2) {
            return "authorized";
        }
        l.g();
        return null;
    }
}
