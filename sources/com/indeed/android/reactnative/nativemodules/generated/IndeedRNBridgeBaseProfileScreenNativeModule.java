package com.indeed.android.reactnative.nativemodules.generated;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b'\u0018\u0000  2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0006H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000eH&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseProfileScreenNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "openResponsiveCandidateBottomSheet", "(Lcom/facebook/react/bridge/Promise;)V", "", "rootTag", "openResumeUploadFlow", "(DLcom/facebook/react/bridge/Promise;)V", "url", "fileName", "downloadAndPreviewPDF", "(DLjava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "", "visible", "setTopNavResumeUploadButtonVisible", "(ZLcom/facebook/react/bridge/Promise;)V", "eventName", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "(D)V", "Companion", "a", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class IndeedRNBridgeBaseProfileScreenNativeModule extends ReactContextBaseJavaModule {
    public static final int $stable = 8;
    public static final String MODULE_NAME = "ProfileScreenNativeModule";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeedRNBridgeBaseProfileScreenNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    public abstract void addListener(String eventName);

    public abstract void downloadAndPreviewPDF(double rootTag, String url, String fileName, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public abstract void openResponsiveCandidateBottomSheet(Promise promise);

    public abstract void openResumeUploadFlow(double rootTag, Promise promise);

    public abstract void removeListeners(double count);

    public abstract void setTopNavResumeUploadButtonVisible(boolean visible, Promise promise);
}
