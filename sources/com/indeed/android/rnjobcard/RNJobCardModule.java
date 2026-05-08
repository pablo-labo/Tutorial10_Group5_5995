package com.indeed.android.rnjobcard;

import android.webkit.URLUtil;
import com.datadog.android.log.Logger;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseJobCardNativeModule;
import defpackage.cr8;
import defpackage.gu5;
import defpackage.j6;
import defpackage.nmc;
import defpackage.p6;
import defpackage.u2g;
import defpackage.zve;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseJobCardNativeModule.MODULE_NAME)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u001a\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/indeed/android/rnjobcard/RNJobCardModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseJobCardNativeModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lkotlin/Function0;", "Lcom/datadog/android/log/Logger;", "datadogLoggerProvider", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lgu5;)V", "", "getName", "()Ljava/lang/String;", "url", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "navigateToWebview", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "jobKey", "pageId", "", "undo", "tk", "dislikeJob", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "clickUrl", "logJobClick", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lgu5;", "rnjobcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNJobCardModule extends IndeedRNBridgeBaseJobCardNativeModule {
    private final gu5<Logger> datadogLoggerProvider;
    private final ReactApplicationContext reactContext;

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
            if (zH) {
                promise.resolve(null);
            } else {
                promise.reject(new Exception(p6.c(response.d, "Error: ")));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNJobCardModule(ReactApplicationContext reactApplicationContext, gu5<Logger> gu5Var) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        gu5Var.getClass();
        this.reactContext = reactApplicationContext;
        this.datadogLoggerProvider = gu5Var;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseJobCardNativeModule
    @ReactMethod
    public void dislikeJob(String jobKey, String pageId, boolean undo, String tk, Promise promise) {
        jobKey.getClass();
        pageId.getClass();
        promise.getClass();
        ((u2g) cr8.p(u2g.class)).b(jobKey, pageId, undo, tk, new a(promise));
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseJobCardNativeModule, com.facebook.react.bridge.NativeModule
    public String getName() {
        return IndeedRNBridgeBaseJobCardNativeModule.MODULE_NAME;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseJobCardNativeModule
    @ReactMethod
    public void logJobClick(String clickUrl, Promise promise) {
        clickUrl.getClass();
        promise.getClass();
        if (zve.U(clickUrl)) {
            Logger loggerInvoke = this.datadogLoggerProvider.invoke();
            if (loggerInvoke != null) {
                Logger.e$default(loggerInvoke, "logJobClick.emptyUrl", null, null, 6, null);
            }
            promise.reject("EMPTY_URL", "clickUrl is empty");
            return;
        }
        if (URLUtil.isNetworkUrl(clickUrl)) {
            ((u2g) cr8.p(u2g.class)).a(clickUrl);
            promise.resolve(null);
        } else {
            Logger loggerInvoke2 = this.datadogLoggerProvider.invoke();
            if (loggerInvoke2 != null) {
                Logger.e$default(loggerInvoke2, "logJobClick.invalidUrl", null, j6.c("clickUrl", clickUrl), 2, null);
            }
            promise.reject("INVALID_URL", "Unable to create URL from provided string: ".concat(clickUrl));
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseJobCardNativeModule
    @ReactMethod
    public void navigateToWebview(String url, Promise promise) {
        url.getClass();
        promise.getClass();
        promise.reject("NOT_IMPLEMENTED", "navigateToWebview is not implemented on Android yet", (Throwable) null);
    }
}
