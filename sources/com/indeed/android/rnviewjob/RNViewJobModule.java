package com.indeed.android.rnviewjob;

import android.app.Activity;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseViewJobModule;
import defpackage.b0;
import defpackage.c1g;
import defpackage.cpb;
import defpackage.cr8;
import defpackage.hde;
import defpackage.j6g;
import defpackage.lx5;
import defpackage.nmc;
import defpackage.np7;
import defpackage.o6;
import defpackage.or;
import defpackage.p6;
import defpackage.t98;
import defpackage.w40;
import defpackage.wl7;
import defpackage.wu5;
import defpackage.yu5;
import defpackage.z92;
import defpackage.zr4;
import defpackage.zve;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Cookie;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseViewJobModule.MODULE_NAME)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n\u0012*\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\fH\u0017¢\u0006\u0004\b&\u0010'J'\u0010+\u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\fH\u0017¢\u0006\u0004\b+\u0010,J'\u0010.\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\fH\u0017¢\u0006\u0004\b.\u0010/J9\u00104\u001a\u00020\r2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\fH\u0017¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\fH\u0017¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\fH\u0017¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\fH\u0017¢\u0006\u0004\b:\u00107J/\u0010=\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\fH\u0017¢\u0006\u0004\b=\u0010>J'\u0010@\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\fH\u0017¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR,\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010ER8\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010FR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010D¨\u0006G"}, d2 = {"Lcom/indeed/android/rnviewjob/RNViewJobModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseViewJobModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lkotlin/Function1;", "", "", "isIndeedUrl", "Lkotlin/Function3;", "Landroid/app/Activity;", "Lcom/facebook/react/bridge/Promise;", "Lj6g;", "startIndeedApplyCommand", "Lkotlin/Function5;", "Lhde;", "navigateViewCommand", "Llx5;", "logGenericEvent", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lokhttp3/OkHttpClient;Lkotlin/jvm/functions/Function1;Lwu5;Lyu5;Lkotlin/jvm/functions/Function1;)V", "Lokhttp3/Request;", "request", BaseJavaModule.METHOD_TYPE_PROMISE, "getJsonData", "(Lokhttp3/Request;Lcom/facebook/react/bridge/Promise;)V", "Landroid/webkit/CookieManager;", "cookieManager", "name", "value", "origin", "setCookie", "(Landroid/webkit/CookieManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "deleteCookie", "(Landroid/webkit/CookieManager;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "params", "logVJUnmount", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "", "rootTag", "url", "handleStartIndeedApply", "(DLjava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "payload", "httpPostJson", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "sourceUrl", "targetUrl", "shareUrl", "shareMessage", "navigateView", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "getVJData", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "onDeepLinkLoadCompleted", "(Lcom/facebook/react/bridge/Promise;)V", "httpGetJson", "jobKey", "sourceAbbreviation", "updateApplyStartCookie", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "isSaved", "toggleSaveJob", "(Ljava/lang/String;ZLcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/functions/Function1;", "Lwu5;", "Lyu5;", "rnviewjob_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNViewJobModule extends IndeedRNBridgeBaseViewJobModule {
    private final Function1<String, Boolean> isIndeedUrl;
    private final Function1<lx5, j6g> logGenericEvent;
    private final yu5<String, String, hde, Activity, Promise, j6g> navigateViewCommand;
    private final OkHttpClient okHttpClient;
    private final ReactApplicationContext reactContext;
    private final wu5<String, Activity, Promise, j6g> startIndeedApplyCommand;

    public static final class a implements Callback {
        public final /* synthetic */ Promise a;
        public final /* synthetic */ RNViewJobModule b;
        public final /* synthetic */ Request c;

        public a(Promise promise, RNViewJobModule rNViewJobModule, Request request) {
            this.a = promise;
            this.b = rNViewJobModule;
            this.c = request;
        }

        @Override // okhttp3.Callback
        public final void h(Call call, IOException iOException) {
            this.a.reject(iOException);
        }

        @Override // okhttp3.Callback
        public final void p(Call call, Response response) {
            boolean zH = response.h();
            Promise promise = this.a;
            if (!zH) {
                promise.reject(new Exception(p6.c(response.d, "Error: ")));
                return;
            }
            ResponseBody responseBody = response.V;
            String strV = responseBody != null ? responseBody.v() : null;
            if (strV == null) {
                b0.p("empty response", promise);
                return;
            }
            try {
                WritableMap writableMapF = t98.f(new JSONObject(strV));
                this.b.logGenericEvent.invoke(new lx5("rn_view_job_debug", "other", "rnViewJobDebug", 1, zr4.a, new or(this.c, 18)));
                promise.resolve(writableMapF);
            } catch (JSONException e) {
                promise.reject(e);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RNViewJobModule(ReactApplicationContext reactApplicationContext, OkHttpClient okHttpClient, Function1<? super String, Boolean> function1, wu5<? super String, ? super Activity, ? super Promise, j6g> wu5Var, yu5<? super String, ? super String, ? super hde, ? super Activity, ? super Promise, j6g> yu5Var, Function1<? super lx5, j6g> function12) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        okHttpClient.getClass();
        function1.getClass();
        wu5Var.getClass();
        yu5Var.getClass();
        function12.getClass();
        this.reactContext = reactApplicationContext;
        this.okHttpClient = okHttpClient;
        this.isIndeedUrl = function1;
        this.startIndeedApplyCommand = wu5Var;
        this.navigateViewCommand = yu5Var;
        this.logGenericEvent = function12;
    }

    private final void deleteCookie(CookieManager cookieManager, String name, String origin) {
        cookieManager.setCookie(origin, name + "=; expires=Thu, 01 Jan 1970 00:00:00 GMT");
        cookieManager.flush();
    }

    private final void getJsonData(Request request, Promise promise) {
        this.okHttpClient.c(request).R0(new a(promise, this, request));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g logVJUnmount$lambda$0(String str, String str2, int i, String str3, String str4, lx5.b bVar) {
        w40.l(bVar, "url", str, "mobtk", str2);
        bVar.b("duration", Long.valueOf(i));
        bVar.a("queryStatus", str3);
        bVar.a("jobKey", str4);
        return j6g.a;
    }

    private final void setCookie(CookieManager cookieManager, String name, String value, String origin) {
        cookieManager.setCookie(origin, o6.f(name, "=", value, ";Max-Age=223948800000"));
        cookieManager.flush();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseViewJobModule
    @ReactMethod
    public void getVJData(String url, Promise promise) throws EOFException {
        HttpUrl httpUrlC;
        url.getClass();
        promise.getClass();
        HttpUrl.k.getClass();
        Cookie cookie = null;
        try {
            httpUrlC = HttpUrl.Companion.c(url);
        } catch (IllegalArgumentException unused) {
            httpUrlC = null;
        }
        String str = httpUrlC != null ? httpUrlC.d : null;
        if (!this.isIndeedUrl.invoke(url).booleanValue() || str == null) {
            b0.p("Invalid url", promise);
            return;
        }
        CookieManager cookieManager = CookieManager.getInstance();
        if (cookieManager == null) {
            b0.p("CookieManager is not initialized", promise);
            return;
        }
        HttpUrl.Builder builder = new HttpUrl.Builder();
        builder.e(httpUrlC.a);
        builder.c(httpUrlC.d);
        HttpUrl httpUrlB = builder.b();
        String cookie2 = cookieManager.getCookie(httpUrlB.i);
        if (cookie2 == null) {
            cookie2 = "";
        }
        Iterator it = zve.k0(cookie2, new String[]{";"}).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            Cookie.j.getClass();
            Cookie cookieC = Cookie.Companion.c(httpUrlB, str2);
            if (cookieC != null && wl7.b(cookieC.a, "MCLK")) {
                cookie = cookieC;
                break;
            }
        }
        Request.Builder builder2 = new Request.Builder();
        builder2.g(url);
        if (cookie != null) {
            builder2.d("Cookie", "MCLK=" + cookie.b);
        }
        Request requestB = builder2.b();
        deleteCookie(cookieManager, "MCLK", str);
        getJsonData(requestB, promise);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseViewJobModule
    @ReactMethod
    public void handleStartIndeedApply(double rootTag, String url, Promise promise) {
        url.getClass();
        promise.getClass();
        if (!URLUtil.isValidUrl(url)) {
            b0.p("Invalid Apply Url", promise);
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (!this.reactContext.hasCurrentActivity() || currentActivity == null) {
            b0.p("No activity in App", promise);
        } else {
            this.startIndeedApplyCommand.q(url, currentActivity, promise);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseViewJobModule
    @ReactMethod
    public void httpGetJson(String url, Promise promise) {
        url.getClass();
        promise.getClass();
        if (!this.isIndeedUrl.invoke(url).booleanValue()) {
            b0.p("Invalid url", promise);
            return;
        }
        Request.Builder builder = new Request.Builder();
        builder.g(url);
        getJsonData(builder.b(), promise);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseViewJobModule
    @ReactMethod
    public void httpPostJson(String url, String payload, Promise promise) {
        url.getClass();
        payload.getClass();
        promise.getClass();
        if (!URLUtil.isValidUrl(url)) {
            b0.p("Invalid Url", promise);
            return;
        }
        MediaType.e.getClass();
        MediaType mediaTypeA = MediaType.Companion.a("application/json; charset=utf-8");
        Request.Builder builder = new Request.Builder();
        builder.g(url);
        RequestBody.INSTANCE.getClass();
        builder.e("POST", RequestBody.Companion.a(payload, mediaTypeA));
        getJsonData(builder.b(), promise);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseViewJobModule
    @ReactMethod
    public void logVJUnmount(ReadableMap params, Promise promise) {
        params.getClass();
        promise.getClass();
        String string = params.getString("queryStatus");
        if (string == null) {
            string = "unknown";
        }
        int i = params.getInt("duration");
        String string2 = params.getString("jobKey");
        String string3 = params.getString("mobtk");
        String string4 = params.getString("url");
        this.logGenericEvent.invoke(new lx5("rn_viewjob_unmount", "other", "rnViewJobUnmount", 1, zr4.a, new cpb(i, string4, string3, string, string2)));
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseViewJobModule
    @ReactMethod
    public void navigateView(String sourceUrl, String targetUrl, String shareUrl, String shareMessage, Promise promise) {
        sourceUrl.getClass();
        targetUrl.getClass();
        shareUrl.getClass();
        promise.getClass();
        if (!URLUtil.isValidUrl(targetUrl) || !URLUtil.isValidUrl(sourceUrl)) {
            b0.p("Invalid Url", promise);
            return;
        }
        hde hdeVar = new hde(shareUrl, shareMessage, 4);
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (!this.reactContext.hasCurrentActivity() || currentActivity == null) {
            b0.p("No activity in App", promise);
        } else {
            this.navigateViewCommand.t(sourceUrl, targetUrl, hdeVar, currentActivity, promise);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseViewJobModule
    @ReactMethod
    public void onDeepLinkLoadCompleted(Promise promise) {
        promise.getClass();
        ((np7) cr8.p(np7.class)).e("RNViewJobModule", "notifyDeepLinkLoadCompleted()");
        ((c1g) cr8.p(c1g.class)).a();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseViewJobModule
    @ReactMethod
    public void toggleSaveJob(String jobKey, boolean isSaved, Promise promise) {
        jobKey.getClass();
        promise.getClass();
        promise.reject("NOT_IMPLEMENTED", "toggleSaveJob is not implemented on Android yet", (Throwable) null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseViewJobModule
    @ReactMethod
    public void updateApplyStartCookie(String jobKey, String sourceAbbreviation, String origin, Promise promise) throws IOException {
        HttpUrl httpUrlC;
        Cookie cookieC;
        jobKey.getClass();
        sourceAbbreviation.getClass();
        origin.getClass();
        promise.getClass();
        HttpUrl.k.getClass();
        try {
            httpUrlC = HttpUrl.Companion.c(origin);
        } catch (IllegalArgumentException unused) {
            httpUrlC = null;
        }
        if (!URLUtil.isValidUrl(origin) || httpUrlC == null) {
            b0.p("Invalid Domain", promise);
            return;
        }
        CookieManager cookieManager = CookieManager.getInstance();
        if (cookieManager == null) {
            b0.p("CookieManager is not initialized", promise);
            return;
        }
        String cookie = cookieManager.getCookie(httpUrlC.i);
        if (cookie == null) {
            cookie = "";
        }
        Iterator it = zve.k0(cookie, new String[]{";"}).iterator();
        while (true) {
            if (!it.hasNext()) {
                cookieC = null;
                break;
            }
            String str = (String) it.next();
            Cookie.j.getClass();
            cookieC = Cookie.Companion.c(httpUrlC, str);
            if (cookieC != null && wl7.b(cookieC.a, "RJAS")) {
                break;
            }
        }
        String strConcat = sourceAbbreviation.concat(jobKey);
        String str2 = cookieC != null ? cookieC.b : null;
        List listK0 = str2 != null ? zve.k0(str2, new String[]{":"}) : zr4.a;
        if (!listK0.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listK0) {
                if (!wl7.b((String) obj, strConcat)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.add(strConcat);
            if (arrayList2.size() > 10) {
                arrayList2.remove(0);
            }
            strConcat = z92.W0(arrayList2, ":", null, null, null, 62);
        }
        setCookie(cookieManager, "RJAS", strConcat, origin);
        promise.resolve(null);
    }
}
