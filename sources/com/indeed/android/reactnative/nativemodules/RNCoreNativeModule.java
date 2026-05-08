package com.indeed.android.reactnative.nativemodules;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import androidx.navigation.e;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource;
import com.indeed.android.reactnative.nativemodules.RNCoreNativeModule;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNCoreNativeModule;
import com.indeed.android.reactnative.rntarebridge.RNTareBridgeDetachmentException;
import defpackage.c6f;
import defpackage.cr8;
import defpackage.dmc;
import defpackage.e3g;
import defpackage.ela;
import defpackage.frg;
import defpackage.fwc;
import defpackage.h14;
import defpackage.j6g;
import defpackage.jq7;
import defpackage.l1g;
import defpackage.l5;
import defpackage.lcc;
import defpackage.lr5;
import defpackage.lz2;
import defpackage.mh2;
import defpackage.nmc;
import defpackage.np7;
import defpackage.prd;
import defpackage.qjc;
import defpackage.qt5;
import defpackage.rq7;
import defpackage.t98;
import defpackage.ve0;
import defpackage.wl7;
import defpackage.wu5;
import defpackage.xj1;
import defpackage.z92;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseRNCoreNativeModule.MODULE_NAME)
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001YB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010&\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b&\u0010'JO\u0010+\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\f2\u0006\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00170(2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00172\u0006\u0010 \u001a\u00020)¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b0\u00101JE\u00107\u001a\u00020\u00172\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u00010\f2\b\u00105\u001a\u0004\u0018\u00010\f2\b\u00106\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b7\u00108J;\u00109\u001a\u00020\u00172\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u00010\f2\b\u00106\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b9\u0010:JE\u0010<\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u00010\f2\b\u00105\u001a\u0004\u0018\u00010\f2\b\u00106\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b<\u00108J\u001f\u0010?\u001a\u00020\u00172\u0006\u0010>\u001a\u00020=2\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\u00172\u0006\u0010A\u001a\u00020=2\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\bB\u0010@J\u001f\u0010C\u001a\u00020\u00172\u0006\u0010A\u001a\u00020=2\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\bC\u0010@J5\u0010G\u001a\u00020\u00172\b\u0010D\u001a\u0004\u0018\u00010\f2\b\u0010E\u001a\u0004\u0018\u00010\f2\b\u0010F\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\bG\u0010HJ\u0011\u0010I\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\bI\u0010\u0014J)\u0010N\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020J2\u0006\u0010K\u001a\u00020\f2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010T\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u0004\u0018\u00010Q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Z²\u0006\f\u0010X\u001a\u00020Q8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/indeed/android/reactnative/nativemodules/RNCoreNativeModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseRNCoreNativeModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroidx/fragment/app/g;", "getActivity", "()Landroidx/fragment/app/g;", "Lorg/json/JSONObject;", "jsonObject", "", "", "convertJsonToMap", "(Lorg/json/JSONObject;)Ljava/util/Map;", "Lcom/facebook/react/bridge/ReadableMap;", "readableMap", "convertReadableMapToMap", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/util/Map;", "getName", "()Ljava/lang/String;", "Lcom/indeed/android/reactnative/nativemodules/RNCoreNativeModule$a;", "listener", "Lj6g;", "setScrollListener", "(Lcom/indeed/android/reactnative/nativemodules/RNCoreNativeModule$a;)V", "removeScrollListener", "", "scrollX", "scrollY", "onScroll", "(DD)V", "tabIdentifier", "", "isScrollUp", "isAtTop", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "onMainContentScrolled", "(Ljava/lang/String;ZZLcom/facebook/react/bridge/Promise;)V", "Lkotlin/Function3;", "Lxj1;", "Lprd;", "handleMainContentScrolled", "(Ljava/lang/String;ZZLwu5;Lcom/facebook/react/bridge/Promise;)V", "signalScrollMainContentToTop", "(Lxj1;)V", "rootTag", "close", "(DLcom/facebook/react/bridge/Promise;)V", "queryString", "variablesJSONString", "operationName", "headers", "options", "fetchTrackedOneGraphOperation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "fetchNativeOneGraphOperation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "mutationString", "mutateTrackedOneGraphOperation", "Lcom/facebook/react/bridge/ReadableArray;", "cookies", "setCookies", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "cookieNames", "getCookies", "deleteCookies", "content", "agentType", "optionalArgs", "aceNewConversation", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "getDevParamsSync", "Lcom/facebook/react/bridge/ReactContext;", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "emitEvent", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lc6f;", "_tabEventManagerViewModel", "Lc6f;", "scrollListener", "Lcom/indeed/android/reactnative/nativemodules/RNCoreNativeModule$a;", "getTabEventManagerViewModel", "()Lc6f;", "tabEventManagerViewModel", "a", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNCoreNativeModule extends IndeedRNBridgeBaseRNCoreNativeModule {
    public static final int $stable = 8;
    private c6f _tabEventManagerViewModel;
    private final ReactApplicationContext reactContext;
    private a scrollListener;

    public interface a {
        void q(int i);
    }

    public static final class b implements e3g.a {
        public final /* synthetic */ Promise a;

        public b(Promise promise) {
            this.a = promise;
        }

        @Override // e3g.a
        public final void a(JSONObject jSONObject) {
            this.a.resolve(t98.f(jSONObject));
        }

        @Override // e3g.a
        public final void b(Exception exc) {
            this.a.reject(exc);
        }
    }

    public static final class c implements e3g.a {
        public final /* synthetic */ Promise a;

        public c(Promise promise) {
            this.a = promise;
        }

        @Override // e3g.a
        public final void a(JSONObject jSONObject) {
            this.a.resolve(t98.f(jSONObject));
        }

        @Override // e3g.a
        public final void b(Exception exc) {
            this.a.reject(exc);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNCoreNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
    }

    private static final c6f _get_tabEventManagerViewModel_$lambda$1$lambda$0(Lazy<c6f> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$5(UIManager uIManager, double d, Promise promise) {
        try {
            View viewResolveView = uIManager.resolveView((int) d);
            if (viewResolveView == null) {
                promise.reject(new IllegalStateException("view not found for tag: " + d));
                return;
            }
            Fragment fragmentB = FragmentManager.B(viewResolveView);
            while (fragmentB != null && !(fragmentB instanceof f) && !(fragmentB instanceof l1g)) {
                fragmentB = fragmentB.getParentFragment();
            }
            if (fragmentB instanceof l1g) {
                ((l1g) fragmentB).close();
                promise.resolve(null);
            } else if (fragmentB instanceof f) {
                ((f) fragmentB).E();
                promise.resolve(null);
            } else {
                promise.reject(new IllegalStateException("No closeable fragment found for tag: " + d));
            }
        } catch (IllegalViewOperationException e) {
            promise.reject("VIEW_UNMOUNTED", "React Native view already unmounted for tag " + d, e);
        }
    }

    private final Map<String, String> convertJsonToMap(JSONObject jsonObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jsonObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, jsonObject.getString(next));
        }
        return linkedHashMap;
    }

    private final Map<String, String> convertReadableMapToMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            String string = readableMap.getString(strNextKey);
            if (string != null) {
                linkedHashMap.put(strNextKey, string);
            }
        }
        return linkedHashMap;
    }

    public static /* synthetic */ void emitEvent$default(RNCoreNativeModule rNCoreNativeModule, ReactContext reactContext, String str, WritableMap writableMap, int i, Object obj) {
        if ((i & 4) != 0) {
            writableMap = null;
        }
        rNCoreNativeModule.emitEvent(reactContext, str, writableMap);
    }

    private final g getActivity() {
        return (g) this.reactContext.getCurrentActivity();
    }

    private final c6f getTabEventManagerViewModel() {
        if (this._tabEventManagerViewModel == null) {
            try {
                g activity = getActivity();
                if (activity != null) {
                    return _get_tabEventManagerViewModel_$lambda$1$lambda$0(new frg(fwc.a.b(c6f.class), new ve0(activity, 4), new lcc(activity), new h14(activity, 5)));
                }
                this._tabEventManagerViewModel = null;
            } catch (Exception e) {
                ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNCoreNativeModule.MODULE_NAME, "Failed to resolve TabEventManagerViewModel", false, e);
                return null;
            }
        }
        return this._tabEventManagerViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g onMainContentScrolled$lambda$2(RNCoreNativeModule rNCoreNativeModule, xj1 xj1Var, boolean z, prd prdVar) {
        xj1Var.getClass();
        prdVar.getClass();
        c6f tabEventManagerViewModel = rNCoreNativeModule.getTabEventManagerViewModel();
        if (tabEventManagerViewModel != null) {
            tabEventManagerViewModel.k(xj1Var, z, prdVar);
        }
        return j6g.a;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNCoreNativeModule
    @ReactMethod
    public void aceNewConversation(String content, String agentType, ReadableMap optionalArgs, Promise promise) {
        e eVarK;
        promise.getClass();
        try {
            if (!this.reactContext.hasCurrentActivity()) {
                promise.reject("NO_ACTIVITY", "No current activity available", (Throwable) null);
                return;
            }
            Activity currentActivity = this.reactContext.getCurrentActivity();
            g gVar = currentActivity instanceof g ? (g) currentActivity : null;
            if (gVar == null) {
                promise.reject("INVALID_ACTIVITY", "Current activity is not a FragmentActivity", (Throwable) null);
                return;
            }
            lr5 lr5VarU = gVar.u();
            lr5VarU.getClass();
            List<Fragment> listF = lr5VarU.c.f();
            listF.getClass();
            Fragment fragment = (Fragment) z92.Q0(listF);
            if (fragment == null || (eVarK = mh2.k(fragment)) == null) {
                throw new RNTareBridgeDetachmentException();
            }
            ((rq7) cr8.p(rq7.class)).f(lr5VarU, eVarK, new jq7.c(content, agentType, convertReadableMapToMap(optionalArgs)), "rn_core_module");
            promise.resolve(null);
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.b(IndeedRNBridgeBaseRNCoreNativeModule.MODULE_NAME, "Failed to open new Ace chat", false, e);
            promise.reject("ACE_ERROR", "Failed to open new Ace chat: " + e.getMessage(), e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNCoreNativeModule
    @ReactMethod
    public void close(final double rootTag, final Promise promise) {
        promise.getClass();
        final UIManager uIManagerK = dmc.k(this.reactContext, (int) rootTag);
        if (uIManagerK == null) {
            promise.reject(new IllegalStateException("UIManager not found for tag: " + rootTag));
        } else {
            g activity = getActivity();
            if (activity == null) {
                promise.reject(new IllegalStateException("currentActivity is null"));
            } else {
                activity.runOnUiThread(new Runnable() { // from class: kcc
                    @Override // java.lang.Runnable
                    public final void run() {
                        RNCoreNativeModule.close$lambda$5(uIManagerK, rootTag, promise);
                    }
                });
            }
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNCoreNativeModule
    @ReactMethod
    public void deleteCookies(ReadableArray cookieNames, Promise promise) {
        cookieNames.getClass();
        promise.getClass();
        try {
            ArrayList<Object> arrayList = cookieNames.toArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ((e3g) cr8.p(e3g.class)).c(arrayList2);
                    promise.resolve(null);
                    return;
                } else {
                    Object next = it.next();
                    String str = next instanceof String ? (String) next : null;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
            }
        } catch (Exception e) {
            promise.reject("ERROR", "Failed to get cookies: " + e.getMessage(), e);
        }
    }

    public final void emitEvent(ReactContext reactContext, String eventName, WritableMap params) {
        reactContext.getClass();
        eventName.getClass();
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNCoreNativeModule
    @ReactMethod
    public void fetchNativeOneGraphOperation(String queryString, String variablesJSONString, String operationName, String options, Promise promise) {
        queryString.getClass();
        variablesJSONString.getClass();
        promise.getClass();
        ((e3g) cr8.p(e3g.class)).b(queryString, operationName, new JSONObject(variablesJSONString), null, null, options == null ? null : new JSONObject(options), new b(promise));
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNCoreNativeModule
    @ReactMethod
    public void fetchTrackedOneGraphOperation(String queryString, String variablesJSONString, String operationName, String headers, String options, Promise promise) {
        queryString.getClass();
        variablesJSONString.getClass();
        promise.getClass();
        JSONObject jSONObject = new JSONObject(variablesJSONString);
        Map<String, String> mapConvertJsonToMap = headers == null ? null : convertJsonToMap(new JSONObject(headers));
        ((e3g) cr8.p(e3g.class)).b(queryString, operationName, jSONObject, mapConvertJsonToMap != null ? mapConvertJsonToMap.get(ConversationsRemoteDataSource.ROOT_TRACKING_KEY_HEADER) : null, mapConvertJsonToMap != null ? mapConvertJsonToMap.get("indeed-client-sub-app") : null, options == null ? null : new JSONObject(options), new c(promise));
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNCoreNativeModule
    @ReactMethod
    public void getCookies(ReadableArray cookieNames, Promise promise) {
        cookieNames.getClass();
        promise.getClass();
        try {
            ArrayList<Object> arrayList = cookieNames.toArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            promise.resolve(qjc.a(((e3g) cr8.p(e3g.class)).e(arrayList2)));
        } catch (Exception e) {
            promise.reject("ERROR", "Failed to get cookies: " + e.getMessage(), e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNCoreNativeModule
    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDevParamsSync() {
        return null;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNCoreNativeModule, com.facebook.react.bridge.NativeModule
    public String getName() {
        return IndeedRNBridgeBaseRNCoreNativeModule.MODULE_NAME;
    }

    public final void handleMainContentScrolled(String tabIdentifier, boolean isAtTop, boolean isScrollUp, wu5<? super xj1, ? super Boolean, ? super prd, j6g> onScroll, Promise promise) {
        tabIdentifier.getClass();
        onScroll.getClass();
        promise.getClass();
        try {
            prd prdVar = isScrollUp ? prd.a : prd.b;
            xj1.a.getClass();
            xj1 xj1VarA = xj1.a.a(tabIdentifier);
            if (xj1VarA != null) {
                onScroll.q(xj1VarA, Boolean.valueOf(isAtTop), prdVar);
                promise.resolve(null);
            } else {
                throw new IllegalArgumentException("Invalid BottomNavTabIdentifier " + tabIdentifier + " passed to onMainContentScrolled");
            }
        } catch (IllegalArgumentException e) {
            np7 np7Var = (np7) cr8.p(np7.class);
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            np7Var.c(IndeedRNBridgeBaseRNCoreNativeModule.MODULE_NAME, message, false, e);
            promise.reject("ERROR", e.getMessage(), e);
        } catch (Exception e2) {
            String strConcat = "Unexpected error while calling onScroll for ".concat(tabIdentifier);
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNCoreNativeModule.MODULE_NAME, strConcat, false, e2);
            promise.reject("ERROR", strConcat, e2);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNCoreNativeModule
    public void mutateTrackedOneGraphOperation(String mutationString, String variablesJSONString, String operationName, String headers, String options, Promise promise) {
        mutationString.getClass();
        variablesJSONString.getClass();
        promise.getClass();
        throw new ela("An operation is not implemented: Not yet implemented");
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNCoreNativeModule
    @ReactMethod
    public void onMainContentScrolled(String tabIdentifier, boolean isScrollUp, boolean isAtTop, Promise promise) {
        tabIdentifier.getClass();
        promise.getClass();
        handleMainContentScrolled(tabIdentifier, isAtTop, isScrollUp, new qt5(this, 2), promise);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNCoreNativeModule
    @ReactMethod
    public void onScroll(double scrollX, double scrollY) {
        a aVar = this.scrollListener;
        if (aVar != null) {
            aVar.q((int) scrollY);
        }
    }

    public final void removeScrollListener(a listener) {
        listener.getClass();
        if (wl7.b(this.scrollListener, listener)) {
            this.scrollListener = null;
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNCoreNativeModule
    @ReactMethod
    public void setCookies(ReadableArray cookies, Promise promise) {
        cookies.getClass();
        promise.getClass();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = cookies.toArrayList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ((e3g) cr8.p(e3g.class)).a(linkedHashMap);
                    promise.resolve(null);
                    return;
                }
                Object next = it.next();
                HashMap map = next instanceof HashMap ? (HashMap) next : null;
                if (map == null) {
                    throw new IllegalArgumentException("Expected ReadableMap for cookie item");
                }
                String str = (String) map.get("name");
                if (str != null) {
                    String str2 = (String) map.get("value");
                    if (str2 == null) {
                        str2 = "";
                    }
                    linkedHashMap.put(str, str2);
                }
            }
        } catch (Exception e) {
            promise.reject("ERROR", "Failed to set cookies: " + e.getMessage(), e);
        }
    }

    public final void setScrollListener(a listener) {
        listener.getClass();
        this.scrollListener = listener;
    }

    public final void signalScrollMainContentToTop(xj1 tabIdentifier) {
        tabIdentifier.getClass();
        if (this.reactContext.hasCurrentActivity()) {
            emitEvent$default(this, this.reactContext, l5.m("scroll", tabIdentifier.a(), "ToTop"), null, 4, null);
        }
    }
}
