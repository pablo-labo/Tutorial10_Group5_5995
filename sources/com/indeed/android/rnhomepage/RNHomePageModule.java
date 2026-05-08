package com.indeed.android.rnhomepage;

import android.app.Activity;
import androidx.fragment.app.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseHomePageModule;
import com.indeed.android.uiplugin.api.UIPRecentSearchCountException;
import defpackage.a74;
import defpackage.c1f;
import defpackage.cr8;
import defpackage.e13;
import defpackage.eq3;
import defpackage.f13;
import defpackage.g13;
import defpackage.g3g;
import defpackage.iae;
import defpackage.it7;
import defpackage.j3g;
import defpackage.j6g;
import defpackage.l5;
import defpackage.lr5;
import defpackage.lu2;
import defpackage.m1g;
import defpackage.m89;
import defpackage.n1g;
import defpackage.nmc;
import defpackage.no3;
import defpackage.p1g;
import defpackage.r1g;
import defpackage.r6;
import defpackage.r7d;
import defpackage.t1g;
import defpackage.t92;
import defpackage.u63;
import defpackage.uh3;
import defpackage.wl7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseHomePageModule.MODULE_NAME)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0018\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0019\u0010\u0015J'\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0006H\u0017¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u000fH\u0017¢\u0006\u0004\b(\u0010)J/\u0010-\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/¨\u00060"}, d2 = {"Lcom/indeed/android/rnhomepage/RNHomePageModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseHomePageModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "mode", "Lit7;", "convertModeToJSTSearchMode", "(Ljava/lang/String;)Lit7;", "cookieName", "Lm1g;", "cookieFromCookieName", "(Ljava/lang/String;)Lm1g;", "", "rootTag", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "didInitiatePrimaryRequest", "(DLcom/facebook/react/bridge/Promise;)V", "didStartReceivingPrimaryResponse", "didFinishLoad", "didFailLoad", "didBecomeReadyForInteraction", "query", "location", "getRecentSearchNewCount", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableArray;", "cookies", "setCookies", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "getCookie", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "eventName", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "(D)V", "", "visible", "animated", "setTabBarVisibility", "(DZZLcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "rnhomepage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNHomePageModule extends IndeedRNBridgeBaseHomePageModule {
    private final ReactApplicationContext reactContext;

    @uh3(c = "com.indeed.android.rnhomepage.RNHomePageModule$getRecentSearchNewCount$1", f = "RNHomePageModule.kt", l = {96}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $location;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $query;
        int label;

        /* JADX INFO: renamed from: com.indeed.android.rnhomepage.RNHomePageModule$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.rnhomepage.RNHomePageModule$getRecentSearchNewCount$1$response$1", f = "RNHomePageModule.kt", l = {97}, m = "invokeSuspend")
        public static final class C0181a extends c1f implements Function2<e13, lu2<? super j3g>, Object> {
            final /* synthetic */ String $location;
            final /* synthetic */ String $query;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0181a(String str, String str2, lu2<? super C0181a> lu2Var) {
                super(2, lu2Var);
                this.$query = str;
                this.$location = str2;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0181a(this.$query, this.$location, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j3g> lu2Var) {
                return ((C0181a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        r7d.b(obj);
                        return obj;
                    }
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                g3g g3gVar = (g3g) cr8.p(g3g.class);
                String str = this.$query;
                String str2 = this.$location;
                this.label = 1;
                Object objA = g3gVar.a(str, str2, this);
                g13 g13Var = g13.a;
                return objA == g13Var ? g13Var : objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Promise promise, String str, String str2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$promise = promise;
            this.$query = str;
            this.$location = str2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$promise, this.$query, this.$location, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    eq3 eq3Var = a74.a;
                    no3 no3Var = no3.c;
                    C0181a c0181a = new C0181a(this.$query, this.$location, null);
                    this.label = 1;
                    obj = u63.q0(no3Var, c0181a, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                j3g j3gVar = (j3g) obj;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("key", j3gVar.a);
                writableMapCreateMap.putInt("newCount", j3gVar.b);
                writableMapCreateMap.putString("status", j3gVar.c);
                this.$promise.resolve(writableMapCreateMap);
            } catch (UIPRecentSearchCountException e) {
                this.$promise.reject(e.getCode(), e.getMessage(), e);
            } catch (Exception e2) {
                this.$promise.reject("unknown_error", "Failed to fetch new result count: " + e2.getMessage(), e2);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNHomePageModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
    }

    private final it7 convertModeToJSTSearchMode(String mode) {
        return wl7.b(mode, "what") ? it7.b : it7.c;
    }

    private final m1g cookieFromCookieName(String cookieName) {
        m1g m1gVar;
        m1g[] m1gVarArrValues = m1g.values();
        int length = m1gVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                m1gVar = null;
                break;
            }
            m1gVar = m1gVarArrValues[i];
            if (wl7.b(m1gVar.a(), cookieName)) {
                break;
            }
            i++;
        }
        if (m1gVar != null) {
            return m1gVar;
        }
        l5.q(l5.l("Unsupported cookie name: ", cookieName));
        return null;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseHomePageModule
    @ReactMethod
    public void addListener(String eventName) {
        eventName.getClass();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseHomePageModule
    @ReactMethod
    public void didBecomeReadyForInteraction(double rootTag, Promise promise) {
        promise.getClass();
        ((t1g) cr8.p(t1g.class)).b();
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseHomePageModule
    @ReactMethod
    public void didFailLoad(double rootTag, Promise promise) {
        promise.getClass();
        ((t1g) cr8.p(t1g.class)).a();
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseHomePageModule
    @ReactMethod
    public void didFinishLoad(double rootTag, Promise promise) {
        promise.getClass();
        ((t1g) cr8.p(t1g.class)).a();
        if (!this.reactContext.hasCurrentActivity()) {
            promise.reject("ERROR", "No activity available");
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        currentActivity.getClass();
        g gVar = (g) currentActivity;
        lr5 lr5VarU = gVar.u();
        lr5VarU.getClass();
        p1g p1gVar = (p1g) cr8.p(p1g.class);
        getName();
        p1gVar.b(gVar, lr5VarU);
        ((p1g) cr8.p(p1g.class)).a();
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseHomePageModule
    @ReactMethod
    public void didInitiatePrimaryRequest(double rootTag, Promise promise) {
        promise.getClass();
        ((t1g) cr8.p(t1g.class)).c();
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseHomePageModule
    @ReactMethod
    public void didStartReceivingPrimaryResponse(double rootTag, Promise promise) {
        promise.getClass();
        ((t1g) cr8.p(t1g.class)).e();
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseHomePageModule
    @ReactMethod
    public void getCookie(String cookieName, Promise promise) {
        cookieName.getClass();
        promise.getClass();
        try {
            promise.resolve(((n1g) cr8.p(n1g.class)).b(cookieFromCookieName(cookieName)));
        } catch (IllegalArgumentException unused) {
            promise.reject("ERROR_INVALID_COOKIE_NAME", "Invalid cookie name: ".concat(cookieName));
        } catch (Exception e) {
            promise.reject("ERROR", "Unexpected error while getting cookie", e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseHomePageModule
    @ReactMethod
    public void getRecentSearchNewCount(String query, String location, Promise promise) {
        query.getClass();
        location.getClass();
        promise.getClass();
        eq3 eq3Var = a74.a;
        u63.Y(f13.a(m89.a), null, null, new a(promise, query, location, null), 3);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseHomePageModule
    @ReactMethod
    public void removeListeners(double count) {
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseHomePageModule
    @ReactMethod
    public void setCookies(ReadableArray cookies, Promise promise) {
        cookies.getClass();
        promise.getClass();
        try {
            ArrayList<Object> arrayList = cookies.toArrayList();
            ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ((n1g) cr8.p(n1g.class)).a(arrayList2);
                    promise.resolve(null);
                    return;
                }
                Object next = it.next();
                HashMap map = next instanceof HashMap ? (HashMap) next : null;
                if (map == null) {
                    throw new IllegalArgumentException("Expected ReadableMap for cookie item");
                }
                String str = (String) map.get("name");
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = (String) map.get("value");
                if (str3 != null) {
                    str2 = str3;
                }
                arrayList2.add(new iae(cookieFromCookieName(str), str2));
            }
        } catch (IllegalArgumentException e) {
            promise.reject("ERROR_INVALID_COOKIE_NAME", "Invalid cookie name in the provided cookies array", e);
        } catch (Exception e2) {
            promise.reject("ERROR", "Unexpected error while setting cookies", e2);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseHomePageModule
    @ReactMethod
    public void setTabBarVisibility(double rootTag, boolean visible, boolean animated, Promise promise) {
        promise.getClass();
        if (!this.reactContext.hasCurrentActivity()) {
            promise.reject("ERROR", "No activity available");
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        g gVar = currentActivity instanceof g ? (g) currentActivity : null;
        if (gVar == null) {
            promise.reject("ERROR", "Current activity is not a FragmentActivity");
            return;
        }
        try {
            ((r1g) cr8.p(r1g.class)).a(gVar, visible, animated);
            promise.resolve(null);
        } catch (Exception e) {
            promise.reject("ERROR", "Failed to set tab bar visibility: " + e.getMessage(), e);
        }
    }
}
