package com.indeed.android.rnprofile;

import android.app.DownloadManager;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.webkit.CookieManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseProfileScreenNativeModule;
import defpackage.cr8;
import defpackage.ela;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.l5;
import defpackage.nmc;
import defpackage.np7;
import defpackage.yxa;
import defpackage.z84;
import defpackage.zve;
import defpackage.zxa;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseProfileScreenNativeModule.MODULE_NAME)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0006H\u0017¢\u0006\u0004\b!\u0010\nJ\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0014H\u0017¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/indeed/android/rnprofile/RNProfileScreenModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseProfileScreenNativeModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "subscreen", "Lj6g;", "emitNavigateToSubscreenInternal", "(Ljava/lang/String;)V", "emitUploadButtonTappedInternal", "()V", "emitResumeFileChangedInternal", "emitScreenAppearedInternal", "onCatalystInstanceDestroy", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "openResponsiveCandidateBottomSheet", "(Lcom/facebook/react/bridge/Promise;)V", "", "rootTag", "url", "fileName", "downloadAndPreviewPDF", "(DLjava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "", "visible", "setTopNavResumeUploadButtonVisible", "(ZLcom/facebook/react/bridge/Promise;)V", "openResumeUploadFlow", "(DLcom/facebook/react/bridge/Promise;)V", "eventName", "addListener", "count", "removeListeners", "(D)V", "Lyxa;", "pdfDownloadManager", "Lyxa;", "Companion", "a", "rnprofile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNProfileScreenModule extends IndeedRNBridgeBaseProfileScreenNativeModule {
    public static final int $stable = 8;
    private static final String TAG = "RNProfileScreenModule";
    private static RNProfileScreenModule instance;
    private static gu5<j6g> onOpenResumeUploadFlowCallback;
    private static gu5<j6g> onUploadButtonVisibilityChanged;
    private static boolean shouldShowTopNavResumeUploadButton;
    private final yxa pdfDownloadManager;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Object instanceLock = new Object();

    /* JADX INFO: renamed from: com.indeed.android.rnprofile.RNProfileScreenModule$a, reason: from kotlin metadata */
    public static final class Companion {
        public static void a() {
            synchronized (RNProfileScreenModule.instanceLock) {
                RNProfileScreenModule rNProfileScreenModule = RNProfileScreenModule.instance;
                if (rNProfileScreenModule != null) {
                    rNProfileScreenModule.emitResumeFileChangedInternal();
                    j6g j6gVar = j6g.a;
                }
            }
        }

        public static void b() {
            synchronized (RNProfileScreenModule.instanceLock) {
                RNProfileScreenModule rNProfileScreenModule = RNProfileScreenModule.instance;
                if (rNProfileScreenModule != null) {
                    rNProfileScreenModule.emitScreenAppearedInternal();
                    j6g j6gVar = j6g.a;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNProfileScreenModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        reactApplicationContext2.getClass();
        this.pdfDownloadManager = new yxa(reactApplicationContext2);
        synchronized (instanceLock) {
            instance = this;
            j6g j6gVar = j6g.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitNavigateToSubscreenInternal(String subscreen) {
        try {
            ((np7) cr8.p(np7.class)).a("[IndeedRNBridge] RNProfileScreenModule.emitNavigateToSubscreenInternal", "Emitting onNavigateToSubscreen event with subscreen: " + subscreen);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("subscreen", subscreen);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onNavigateToSubscreen", writableMapCreateMap);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(TAG, "Error emitting onNavigateToSubscreen event", false, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitResumeFileChangedInternal() {
        try {
            ((np7) cr8.p(np7.class)).a(TAG, "Emitting onResumeFileChanged event");
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onResumeFileChanged", null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(TAG, "Error emitting onResumeFileChanged event", false, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitScreenAppearedInternal() {
        try {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onScreenAppeared", null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(TAG, "Error emitting onScreenAppeared event", false, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitUploadButtonTappedInternal() {
        try {
            ((np7) cr8.p(np7.class)).a("[IndeedRNBridge] RNProfileScreenModule.emitUploadButtonTappedInternal", "Emitting onUploadButtonTapped event");
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onUploadButtonTapped", null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(TAG, "Error emitting onUploadButtonTapped event", false, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openResumeUploadFlow$lambda$2(Promise promise) {
        gu5<j6g> gu5Var = onOpenResumeUploadFlowCallback;
        if (gu5Var == null) {
            promise.reject("NO_CALLBACK", "Resume upload flow callback is not available");
        } else {
            gu5Var.invoke();
            promise.resolve(null);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseProfileScreenNativeModule
    @ReactMethod
    public void addListener(String eventName) {
        eventName.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Runnable, xxa] */
    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseProfileScreenNativeModule
    @ReactMethod
    public void downloadAndPreviewPDF(double rootTag, String url, String fileName, Promise promise) {
        final Promise promise2;
        Exception exc;
        url.getClass();
        fileName.getClass();
        promise.getClass();
        final yxa yxaVar = this.pdfDownloadManager;
        Handler handler = yxaVar.b;
        ConcurrentHashMap<Long, yxa.a> concurrentHashMap = yxaVar.c;
        Context context = yxaVar.a;
        try {
            try {
                if (zve.U(url)) {
                    promise.reject("INVALID_URL", "URL cannot be empty");
                    return;
                }
                if (context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS) == null) {
                    promise.reject("STORAGE_UNAVAILABLE", "External storage is not available");
                    ((np7) cr8.p(np7.class)).c("PDFDownloadManager", "External storage unavailable", false, null);
                    return;
                }
                Object systemService = context.getSystemService("download");
                DownloadManager downloadManager = systemService instanceof DownloadManager ? (DownloadManager) systemService : null;
                if (downloadManager == null) {
                    promise.reject("SERVICE_UNAVAILABLE", "DownloadManager service is not available");
                    ((np7) cr8.p(np7.class)).c("PDFDownloadManager", "DownloadManager service unavailable", false, null);
                    return;
                }
                try {
                    try {
                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
                        request.setTitle(fileName);
                        request.setDescription("Downloading PDF file");
                        String cookie = CookieManager.getInstance().getCookie(url);
                        if (cookie != null) {
                            request.addRequestHeader("Cookie", cookie);
                        }
                        request.setDestinationInExternalFilesDir(context, Environment.DIRECTORY_DOWNLOADS, fileName);
                        request.setNotificationVisibility(0);
                        final long jEnqueue = downloadManager.enqueue(request);
                        promise2 = promise;
                        zxa zxaVar = new zxa(jEnqueue, yxaVar, downloadManager, fileName, promise2);
                        ?? r13 = new Runnable() { // from class: xxa
                            @Override // java.lang.Runnable
                            public final void run() {
                                yxa yxaVar2 = yxaVar;
                                long j = jEnqueue;
                                yxaVar2.b(j);
                                promise2.reject("DOWNLOAD_TIMEOUT", "Download timed out after 600 seconds");
                                ((np7) cr8.p(np7.class)).c("PDFDownloadManager", r6.c(j, "Download timed out for downloadId: "), false, null);
                            }
                        };
                        concurrentHashMap.put(Long.valueOf(jEnqueue), new yxa.a(zxaVar, r13));
                        handler.postDelayed(r13, 600000L);
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
                        try {
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(zxaVar, intentFilter, 2);
                                return;
                            } else {
                                context.registerReceiver(zxaVar, intentFilter);
                                return;
                            }
                        } catch (Exception e) {
                            concurrentHashMap.remove(Long.valueOf(jEnqueue));
                            handler.removeCallbacks(r13);
                            throw e;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Exception e3) {
                    ((np7) cr8.p(np7.class)).c("PDFDownloadManager", "Invalid URL format: ".concat(url), false, e3);
                    promise.reject("INVALID_URL", "Invalid URL format: " + e3.getMessage(), e3);
                    return;
                }
            } catch (Exception e4) {
                exc = e4;
                promise2 = promise;
            }
        } catch (Exception e5) {
            e = e5;
            promise2 = promise;
        }
        exc = e;
        ((np7) cr8.p(np7.class)).c("PDFDownloadManager", l5.l("Error in downloadAndPreviewPDF: ", exc.getMessage()), false, exc);
        promise2.reject("DOWNLOAD_PREVIEW_ERROR", "Failed to download and preview PDF: " + exc.getMessage(), exc);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        synchronized (instanceLock) {
            instance = null;
            j6g j6gVar = j6g.a;
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseProfileScreenNativeModule
    @ReactMethod
    public void openResponsiveCandidateBottomSheet(Promise promise) {
        promise.getClass();
        throw new ela("An operation is not implemented: Not implemented: This will be replaced with a RN implementation");
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseProfileScreenNativeModule
    @ReactMethod
    public void openResumeUploadFlow(double rootTag, Promise promise) {
        promise.getClass();
        ((np7) cr8.p(np7.class)).a(TAG, "openResumeUploadFlow called from RN");
        UiThreadUtil.runOnUiThread(new z84(promise, 7));
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseProfileScreenNativeModule
    @ReactMethod
    public void removeListeners(double count) {
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseProfileScreenNativeModule
    @ReactMethod
    public void setTopNavResumeUploadButtonVisible(boolean visible, Promise promise) {
        promise.getClass();
        try {
            ((np7) cr8.p(np7.class)).a("[IndeedRNBridge] RNProfileScreenModule.setTopNavResumeUploadButtonVisible", "visible: " + visible);
            shouldShowTopNavResumeUploadButton = visible;
            gu5<j6g> gu5Var = onUploadButtonVisibilityChanged;
            if (gu5Var != null) {
                gu5Var.invoke();
            }
            promise.resolve(null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(TAG, "Error in setTopNavResumeUploadButtonVisible", false, e);
            promise.reject("SET_UPLOAD_BUTTON_ERROR", "Failed to set upload button visibility: " + e.getMessage(), e);
        }
    }
}
