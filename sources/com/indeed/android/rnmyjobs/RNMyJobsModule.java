package com.indeed.android.rnmyjobs;

import android.app.Activity;
import androidx.fragment.app.g;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseMyJobsModule;
import defpackage.a74;
import defpackage.ae6;
import defpackage.at7;
import defpackage.bs4;
import defpackage.c1f;
import defpackage.c5a;
import defpackage.cg2;
import defpackage.cr8;
import defpackage.d8c;
import defpackage.e13;
import defpackage.eq3;
import defpackage.f13;
import defpackage.f5a;
import defpackage.ft7;
import defpackage.fwc;
import defpackage.i88;
import defpackage.j6g;
import defpackage.l;
import defpackage.l5;
import defpackage.l8c;
import defpackage.lc9;
import defpackage.lr5;
import defpackage.lu2;
import defpackage.ndc;
import defpackage.nmc;
import defpackage.no3;
import defpackage.np7;
import defpackage.qpd;
import defpackage.r6;
import defpackage.r7d;
import defpackage.t40;
import defpackage.u63;
import defpackage.uh3;
import defpackage.vh8;
import defpackage.wl7;
import defpackage.xh8;
import defpackage.xj1;
import defpackage.z92;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseMyJobsModule.MODULE_NAME)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001$B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/indeed/android/rnmyjobs/RNMyJobsModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseMyJobsModule;", "Lxh8;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lj6g;", "emitTabFocusedEvent", "()V", "Lf5a;", "operation", "Lcom/facebook/react/bridge/ReadableMap;", "params", "body", "", "executeApiCall", "(Lf5a;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Llu2;)Ljava/lang/Object;", "notifySubscription", "eventName", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(D)V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "callRestApi", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "showPushOptInModal", "(Lcom/facebook/react/bridge/Promise;)V", "Lae6;", "gson", "Lae6;", "Companion", "a", "rnmyjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNMyJobsModule extends IndeedRNBridgeBaseMyJobsModule implements xh8 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static volatile boolean hasPendingFocusEvent;
    private static volatile boolean isSubscriptionActive;
    private final ae6 gson;

    /* JADX INFO: renamed from: com.indeed.android.rnmyjobs.RNMyJobsModule$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    @uh3(c = "com.indeed.android.rnmyjobs.RNMyJobsModule$callRestApi$1", f = "RNMyJobsModule.kt", l = {89, 90, 94}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ f5a $apiOperation;
        final /* synthetic */ ReadableMap $body;
        final /* synthetic */ ReadableMap $params;
        final /* synthetic */ Promise $promise;
        Object L$0;
        int label;

        @uh3(c = "com.indeed.android.rnmyjobs.RNMyJobsModule$callRestApi$1$1", f = "RNMyJobsModule.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ Promise $promise;
            final /* synthetic */ String $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Promise promise, String str, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.$promise = promise;
                this.$result = str;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new a(this.$promise, this.$result, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                this.$promise.resolve(this.$result);
                return j6g.a;
            }
        }

        /* JADX INFO: renamed from: com.indeed.android.rnmyjobs.RNMyJobsModule$b$b, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.rnmyjobs.RNMyJobsModule$callRestApi$1$2", f = "RNMyJobsModule.kt", l = {}, m = "invokeSuspend")
        public static final class C0183b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ Exception $e;
            final /* synthetic */ Promise $promise;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0183b(Promise promise, Exception exc, lu2<? super C0183b> lu2Var) {
                super(2, lu2Var);
                this.$promise = promise;
                this.$e = exc;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0183b(this.$promise, this.$e, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0183b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                Promise promise = this.$promise;
                String message = this.$e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                promise.reject("API_ERROR", message, this.$e);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f5a f5aVar, ReadableMap readableMap, ReadableMap readableMap2, Promise promise, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$apiOperation = f5aVar;
            this.$params = readableMap;
            this.$body = readableMap2;
            this.$promise = promise;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return RNMyJobsModule.this.new b(this.$apiOperation, this.$params, this.$body, this.$promise, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        
            if (defpackage.u63.q0(r0, r3, r8) == r5) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        
            if (defpackage.u63.q0(r0, r2, r8) != r5) goto L26;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 3
                r2 = 2
                r3 = 1
                r4 = 0
                g13 r5 = defpackage.g13.a
                if (r0 == 0) goto L2c
                if (r0 == r3) goto L28
                if (r0 == r2) goto L1e
                if (r0 != r1) goto L18
                java.lang.Object r8 = r8.L$0
                java.lang.Exception r8 = (java.lang.Exception) r8
                defpackage.r7d.b(r9)
                goto L6e
            L18:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r8)
                return r4
            L1e:
                java.lang.Object r0 = r8.L$0
                java.lang.String r0 = (java.lang.String) r0
                defpackage.r7d.b(r9)     // Catch: java.lang.Exception -> L26
                goto L6e
            L26:
                r9 = move-exception
                goto L58
            L28:
                defpackage.r7d.b(r9)     // Catch: java.lang.Exception -> L26
                goto L40
            L2c:
                defpackage.r7d.b(r9)
                com.indeed.android.rnmyjobs.RNMyJobsModule r9 = com.indeed.android.rnmyjobs.RNMyJobsModule.this     // Catch: java.lang.Exception -> L26
                f5a r0 = r8.$apiOperation     // Catch: java.lang.Exception -> L26
                com.facebook.react.bridge.ReadableMap r6 = r8.$params     // Catch: java.lang.Exception -> L26
                com.facebook.react.bridge.ReadableMap r7 = r8.$body     // Catch: java.lang.Exception -> L26
                r8.label = r3     // Catch: java.lang.Exception -> L26
                java.lang.Object r9 = com.indeed.android.rnmyjobs.RNMyJobsModule.access$executeApiCall(r9, r0, r6, r7, r8)     // Catch: java.lang.Exception -> L26
                if (r9 != r5) goto L40
                goto L6d
            L40:
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L26
                eq3 r0 = defpackage.a74.a     // Catch: java.lang.Exception -> L26
                k89 r0 = defpackage.m89.a     // Catch: java.lang.Exception -> L26
                com.indeed.android.rnmyjobs.RNMyJobsModule$b$a r3 = new com.indeed.android.rnmyjobs.RNMyJobsModule$b$a     // Catch: java.lang.Exception -> L26
                com.facebook.react.bridge.Promise r6 = r8.$promise     // Catch: java.lang.Exception -> L26
                r3.<init>(r6, r9, r4)     // Catch: java.lang.Exception -> L26
                r8.L$0 = r4     // Catch: java.lang.Exception -> L26
                r8.label = r2     // Catch: java.lang.Exception -> L26
                java.lang.Object r8 = defpackage.u63.q0(r0, r3, r8)     // Catch: java.lang.Exception -> L26
                if (r8 != r5) goto L6e
                goto L6d
            L58:
                eq3 r0 = defpackage.a74.a
                k89 r0 = defpackage.m89.a
                com.indeed.android.rnmyjobs.RNMyJobsModule$b$b r2 = new com.indeed.android.rnmyjobs.RNMyJobsModule$b$b
                com.facebook.react.bridge.Promise r3 = r8.$promise
                r2.<init>(r3, r9, r4)
                r8.L$0 = r4
                r8.label = r1
                java.lang.Object r8 = defpackage.u63.q0(r0, r2, r8)
                if (r8 != r5) goto L6e
            L6d:
                return r5
            L6e:
                j6g r8 = defpackage.j6g.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.rnmyjobs.RNMyJobsModule.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNMyJobsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.gson = new ae6();
        ((np7) cr8.p(np7.class)).a("RNMyJobsModule", "RNMyJobsModule initialized successfully");
    }

    private final void emitTabFocusedEvent() {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("myJobsBottomNavTabFocused", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object executeApiCall(f5a f5aVar, ReadableMap readableMap, ReadableMap readableMap2, lu2<? super String> lu2Var) {
        Map<String, ? extends Object> hashMap;
        HashMap<String, Object> hashMap2;
        i88 i88Var = (i88) ((qpd) getKoin().a.b).a(null, fwc.a.b(i88.class), null);
        Map<String, ? extends Object> map = bs4.a;
        if (readableMap == null || (hashMap = readableMap.toHashMap()) == null) {
            hashMap = map;
        }
        if (readableMap2 != null && (hashMap2 = readableMap2.toHashMap()) != null) {
            map = hashMap2;
        }
        ae6 ae6Var = this.gson;
        c5a c5aVar = new c5a(i88Var, ae6Var);
        switch (f5aVar.ordinal()) {
            case 0:
                return c5aVar.e(hashMap, lu2Var);
            case 1:
                return c5aVar.i(hashMap, map, lu2Var);
            case 2:
                return c5aVar.d(hashMap, map, lu2Var);
            case 3:
                return c5aVar.j(hashMap, map, lu2Var);
            case 4:
                return c5aVar.f(hashMap, lu2Var);
            case 5:
                return c5aVar.a(map, lu2Var);
            case 6:
                return c5aVar.c(map, lu2Var);
            case 7:
                return c5aVar.h(map, lu2Var);
            case 8:
                return c5aVar.g(map, lu2Var);
            case DatadogLogGenerator.CRASH /* 9 */:
                Object obj = map.get("tk");
                String str = obj instanceof String ? (String) obj : null;
                if (str == null) {
                    l5.q("LOG_TAB_MOUNTED requires 'tk' in body");
                    return null;
                }
                Object obj2 = map.get("tab");
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                if (str2 == null) {
                    l5.q("LOG_TAB_MOUNTED requires 'tab' in body");
                    return null;
                }
                Pair pair = new Pair("eventName", "tabMounted");
                Locale locale = Locale.ROOT;
                String upperCase = str2.toUpperCase(locale);
                upperCase.getClass();
                Pair pair2 = new Pair("name", upperCase);
                String lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
                Pair pair3 = new Pair("path", "/".concat(lowerCase));
                String lowerCase2 = str2.toLowerCase(locale);
                lowerCase2.getClass();
                String strF = ae6Var.f(lc9.a0(pair, pair2, pair3, new Pair("tab", lowerCase2)));
                strF.getClass();
                return c5aVar.k(str, strF, lu2Var);
            case 10:
                Object obj3 = map.get("tk");
                String str3 = obj3 instanceof String ? (String) obj3 : null;
                if (str3 == null) {
                    l5.q("LOG_APP_CARD_VIEWED requires 'tk' in body");
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    if (!wl7.b(entry.getKey(), "tk")) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put("eventName", "appCardViewed");
                Object obj4 = linkedHashMap2.get("displayRank");
                Number number = obj4 instanceof Number ? (Number) obj4 : null;
                if (number != null) {
                    linkedHashMap2.put("displayRank", new Integer(number.intValue()));
                }
                String strF2 = ae6Var.f(linkedHashMap2);
                strF2.getClass();
                return c5aVar.k(str3, strF2, lu2Var);
            default:
                l.g();
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPushOptInModal$lambda$1(RNMyJobsModule rNMyJobsModule, Promise promise) {
        try {
            Activity currentActivity = rNMyJobsModule.getReactApplicationContext().getCurrentActivity();
            g gVar = currentActivity instanceof g ? (g) currentActivity : null;
            if (gVar == null) {
                promise.reject("ERROR", "Activity is not a FragmentActivity");
                return;
            }
            if (((at7) cr8.p(at7.class)).a() == ft7.c) {
                promise.resolve(Boolean.TRUE);
                return;
            }
            int i = 1;
            if (!((d8c) ((qpd) rNMyJobsModule.getKoin().a.b).a(null, fwc.a.b(d8c.class), null)).c(xj1.c, true)) {
                promise.resolve(Boolean.FALSE);
                return;
            }
            l8c l8cVar = new l8c();
            l8cVar.l0 = new ndc(i, promise);
            lr5 lr5VarU = gVar.u();
            lr5VarU.getClass();
            l8cVar.L(lr5VarU, "PushPrimerDialogFragment");
        } catch (Exception e) {
            promise.reject("ERROR", "Failed to show push opt-in modal: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g showPushOptInModal$lambda$1$lambda$0(Promise promise, boolean z) {
        promise.resolve(Boolean.valueOf(z));
        return j6g.a;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseMyJobsModule
    @ReactMethod
    public void addListener(String eventName) {
        eventName.getClass();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseMyJobsModule
    @ReactMethod
    public void callRestApi(String operation, ReadableMap params, ReadableMap body, Promise promise) {
        f5a f5aVarValueOf;
        operation.getClass();
        promise.getClass();
        f5a.a.getClass();
        try {
            f5aVarValueOf = f5a.valueOf(operation);
        } catch (IllegalArgumentException unused) {
            f5aVarValueOf = null;
        }
        if (f5aVarValueOf == null) {
            promise.reject("INVALID_OPERATION", t40.l("Invalid operation: ", operation, ". Allowed values: ", z92.W0(f5a.c, null, null, null, null, 63)));
        } else {
            eq3 eq3Var = a74.a;
            u63.Y(f13.a(no3.c), null, null, new b(f5aVarValueOf, params, body, promise, null), 3);
        }
    }

    @Override // defpackage.xh8
    public vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseMyJobsModule
    @ReactMethod
    public void notifySubscription() {
        isSubscriptionActive = true;
        if (hasPendingFocusEvent) {
            hasPendingFocusEvent = false;
            emitTabFocusedEvent();
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseMyJobsModule
    @ReactMethod
    public void removeListeners(double count) {
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseMyJobsModule
    @ReactMethod
    public void showPushOptInModal(Promise promise) {
        promise.getClass();
        if (getReactApplicationContext().hasCurrentActivity()) {
            UiThreadUtil.runOnUiThread(new cg2(3, this, promise));
        } else {
            promise.reject("ERROR", "No activity available");
        }
    }
}
