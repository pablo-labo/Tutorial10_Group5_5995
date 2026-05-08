package com.indeed.android.reactnative.nativemodules.generated;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b'\u0018\u0000 32\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u001e\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b%\u0010#J\u001f\u0010&\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b&\u0010#JE\u0010,\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010*\u001a\u0004\u0018\u00010\u00062\b\u0010+\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b,\u0010-J\u0011\u0010.\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b.\u0010\bJ;\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010+\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b0\u00101JE\u00102\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010*\u001a\u0004\u0018\u00010\u00062\b\u0010+\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b2\u0010-¨\u00065"}, d2 = {"Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseRNCoreNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "", "scrollX", "scrollY", "Lj6g;", "onScroll", "(DD)V", "rootTag", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "close", "(DLcom/facebook/react/bridge/Promise;)V", "rnScrollModule", "", "isScrollUp", "isAtTop", "onMainContentScrolled", "(Ljava/lang/String;ZZLcom/facebook/react/bridge/Promise;)V", "content", "agentType", "Lcom/facebook/react/bridge/ReadableMap;", "optionalArgs", "aceNewConversation", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableArray;", "cookieNames", "getCookies", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "cookies", "setCookies", "deleteCookies", "mutationString", "variablesJSONString", "operationName", "headers", "options", "mutateTrackedOneGraphOperation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "getDevParamsSync", "queryString", "fetchNativeOneGraphOperation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "fetchTrackedOneGraphOperation", "Companion", "a", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class IndeedRNBridgeBaseRNCoreNativeModule extends ReactContextBaseJavaModule {
    public static final int $stable = 8;
    public static final String MODULE_NAME = "RNCoreNativeModule";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeedRNBridgeBaseRNCoreNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    public abstract void aceNewConversation(String content, String agentType, ReadableMap optionalArgs, Promise promise);

    public abstract void close(double rootTag, Promise promise);

    public abstract void deleteCookies(ReadableArray cookieNames, Promise promise);

    public abstract void fetchNativeOneGraphOperation(String queryString, String variablesJSONString, String operationName, String options, Promise promise);

    public abstract void fetchTrackedOneGraphOperation(String queryString, String variablesJSONString, String operationName, String headers, String options, Promise promise);

    public abstract void getCookies(ReadableArray cookieNames, Promise promise);

    public abstract String getDevParamsSync();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public abstract void mutateTrackedOneGraphOperation(String mutationString, String variablesJSONString, String operationName, String headers, String options, Promise promise);

    public abstract void onMainContentScrolled(String rnScrollModule, boolean isScrollUp, boolean isAtTop, Promise promise);

    public abstract void onScroll(double scrollX, double scrollY);

    public abstract void setCookies(ReadableArray cookies, Promise promise);
}
