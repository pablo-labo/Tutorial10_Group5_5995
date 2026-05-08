package com.indeed.android.rnserp;

import android.webkit.CookieManager;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseSerpModule;
import defpackage.b0;
import defpackage.nmc;
import defpackage.p6;
import defpackage.t98;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseSerpModule.MODULE_NAME)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/indeed/android/rnserp/RNSerpModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseSerpModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lkotlin/Function1;", "", "", "isIndeedUrl", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lokhttp3/OkHttpClient;Lkotlin/jvm/functions/Function1;)V", "url", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "getSerpData", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/functions/Function1;", "rnserp_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNSerpModule extends IndeedRNBridgeBaseSerpModule {
    private final Function1<String, Boolean> isIndeedUrl;
    private final OkHttpClient okHttpClient;

    public static final class a implements Callback {
        public final /* synthetic */ Promise a;

        public a(Promise promise) {
            this.a = promise;
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
                promise.reject(new Exception(p6.c(response.d, "Error retrieving Serp data: error code ")));
                return;
            }
            ResponseBody responseBody = response.V;
            String strV = responseBody != null ? responseBody.v() : null;
            if (strV == null) {
                promise.reject("Response body is null");
                return;
            }
            try {
                promise.resolve(t98.f(new JSONObject(strV)));
            } catch (JSONException e) {
                promise.reject("Error parsing json data: " + e);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RNSerpModule(ReactApplicationContext reactApplicationContext, OkHttpClient okHttpClient, Function1<? super String, Boolean> function1) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        okHttpClient.getClass();
        function1.getClass();
        this.okHttpClient = okHttpClient;
        this.isIndeedUrl = function1;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseSerpModule
    @ReactMethod
    public void getSerpData(String url, Promise promise) throws EOFException {
        HttpUrl httpUrlC;
        url.getClass();
        promise.getClass();
        HttpUrl.k.getClass();
        try {
            httpUrlC = HttpUrl.Companion.c(url);
        } catch (IllegalArgumentException unused) {
            httpUrlC = null;
        }
        String str = httpUrlC != null ? httpUrlC.d : null;
        if (!this.isIndeedUrl.invoke(url).booleanValue() || str == null) {
            promise.reject(new Exception("Invalid Url ".concat(url)));
            return;
        }
        if (CookieManager.getInstance() == null) {
            b0.p("CookieManager was not initialized", promise);
            return;
        }
        Request.Builder builder = new Request.Builder();
        builder.g(url);
        Request requestB = builder.b();
        OkHttpClient okHttpClient = this.okHttpClient;
        okHttpClient.getClass();
        new RealCall(okHttpClient, requestB, false).R0(new a(promise));
    }
}
