package com.indeed.android.reactnative.nativemodules;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNFileCache;
import defpackage.cr8;
import defpackage.hb5;
import defpackage.l5;
import defpackage.nmc;
import defpackage.np7;
import defpackage.wg2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseRNFileCache.MODULE_NAME)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/indeed/android/reactnative/nativemodules/RNFileCacheModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseRNFileCache;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lokhttp3/OkHttpClient;", "httpClient", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lokhttp3/OkHttpClient;)V", "Lj6g;", "clearDownloadsCache", "()V", "initialize", "", "url", "fileName", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "downloadToCache", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lokhttp3/OkHttpClient;", "Companion", "a", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNFileCacheModule extends IndeedRNBridgeBaseRNFileCache {
    public static final int $stable = 8;
    private static final String DOWNLOADS_FOLDER = "downloads";
    private static final String TAG = "RNFileCacheModule";
    private final OkHttpClient httpClient;
    private final ReactApplicationContext reactContext;

    public static final class b implements Callback {
        public final /* synthetic */ Promise a;
        public final /* synthetic */ File b;

        public b(Promise promise, File file) {
            this.a = promise;
            this.b = file;
        }

        @Override // okhttp3.Callback
        public final void h(Call call, IOException iOException) {
            this.a.reject("DOWNLOAD_ERROR", "Failed to download file: " + iOException.getMessage(), iOException);
        }

        @Override // okhttp3.Callback
        public final void p(Call call, Response response) {
            File file = this.b;
            Promise promise = this.a;
            try {
                if (!response.h()) {
                    promise.reject("DOWNLOAD_ERROR", "Failed to download: HTTP " + response.d);
                    return;
                }
                ResponseBody responseBody = response.V;
                if (responseBody == null) {
                    promise.reject("DOWNLOAD_ERROR", "Response body is null");
                    return;
                }
                InputStream inputStreamA = responseBody.a();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        wg2.u(inputStreamA, fileOutputStream);
                        fileOutputStream.close();
                        inputStreamA.close();
                        promise.resolve("file://" + file.getAbsolutePath());
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e) {
                promise.reject("DOWNLOAD_ERROR", "Failed to save file: " + e.getMessage(), e);
            } finally {
                response.close();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNFileCacheModule(ReactApplicationContext reactApplicationContext, OkHttpClient okHttpClient) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        okHttpClient.getClass();
        this.reactContext = reactApplicationContext;
        this.httpClient = okHttpClient;
    }

    private final void clearDownloadsCache() {
        try {
            File file = new File(this.reactContext.getCacheDir(), DOWNLOADS_FOLDER);
            if (file.exists()) {
                hb5.P(file);
            }
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(TAG, l5.l("Failed to clear downloads cache: ", e.getMessage()), false, e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNFileCache
    @ReactMethod
    public void downloadToCache(String url, String fileName, Promise promise) {
        url.getClass();
        fileName.getClass();
        promise.getClass();
        File file = new File(this.reactContext.getCacheDir(), DOWNLOADS_FOLDER);
        File file2 = new File(file, fileName);
        if (file2.exists()) {
            promise.resolve("file://" + file2.getAbsolutePath());
            return;
        }
        if (!file.exists() && !file.mkdirs()) {
            promise.reject("CACHE_ERROR", "Failed to create cache directory");
            return;
        }
        Request.Builder builder = new Request.Builder();
        builder.g(url);
        Request requestB = builder.b();
        OkHttpClient okHttpClient = this.httpClient;
        okHttpClient.getClass();
        new RealCall(okHttpClient, requestB, false).R0(new b(promise, file2));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        clearDownloadsCache();
    }
}
