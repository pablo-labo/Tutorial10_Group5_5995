package com.indeed.android.reactnative.nativemodules.generated;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b'\u0018\u0000 *2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0015\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0016\u0010\u0012J'\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\"\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0006H&¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u000fH&¢\u0006\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseHomePageModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "cookieName", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "getCookie", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "", "rootTag", "didInitiatePrimaryRequest", "(DLcom/facebook/react/bridge/Promise;)V", "didStartReceivingPrimaryResponse", "didFinishLoad", "didFailLoad", "didBecomeReadyForInteraction", "query", "location", "getRecentSearchNewCount", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableArray;", "cookies", "setCookies", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "", "visible", "animated", "setTabBarVisibility", "(DZZLcom/facebook/react/bridge/Promise;)V", "eventName", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "(D)V", "Companion", "a", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class IndeedRNBridgeBaseHomePageModule extends ReactContextBaseJavaModule {
    public static final int $stable = 8;
    public static final String MODULE_NAME = "HomePageModule";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeedRNBridgeBaseHomePageModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    public abstract void addListener(String eventName);

    public abstract void didBecomeReadyForInteraction(double rootTag, Promise promise);

    public abstract void didFailLoad(double rootTag, Promise promise);

    public abstract void didFinishLoad(double rootTag, Promise promise);

    public abstract void didInitiatePrimaryRequest(double rootTag, Promise promise);

    public abstract void didStartReceivingPrimaryResponse(double rootTag, Promise promise);

    public abstract void getCookie(String cookieName, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public abstract void getRecentSearchNewCount(String query, String location, Promise promise);

    public abstract void removeListeners(double count);

    public abstract void setCookies(ReadableArray cookies, Promise promise);

    public abstract void setTabBarVisibility(double rootTag, boolean visible, boolean animated, Promise promise);
}
