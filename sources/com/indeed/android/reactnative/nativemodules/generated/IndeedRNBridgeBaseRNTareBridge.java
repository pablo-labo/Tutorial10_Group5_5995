package com.indeed.android.reactnative.nativemodules.generated;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\bI\b'\u0018\u0000 \u0082\u00012\u00020\u0001:\u0002\u0083\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\rJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\rJ\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\rJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0016\u0010\u0010J'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b \u0010!J?\u0010#\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b#\u0010$J/\u0010%\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b%\u0010&J7\u0010)\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b)\u0010\u001fJ7\u0010/\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b/\u00100J)\u00103\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b3\u00104J1\u00107\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b:\u0010!J)\u0010>\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b>\u0010?JU\u0010F\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020+2\u0006\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u000e2\b\u0010D\u001a\u0004\u0018\u00010\u00062\b\u0010E\u001a\u0004\u0018\u00010;2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bF\u0010GJ'\u0010J\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bJ\u0010KJ3\u0010N\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010\u00062\b\u0010M\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bN\u00108J1\u0010R\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00062\b\u0010Q\u001a\u0004\u0018\u00010;2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bR\u0010SJ/\u0010U\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00062\u0006\u0010T\u001a\u00020;2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bU\u0010VJ1\u0010W\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00062\b\u0010Q\u001a\u0004\u0018\u00010+2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bW\u0010XJ/\u0010Y\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00062\u0006\u0010T\u001a\u00020+2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bY\u0010ZJ1\u0010[\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00062\b\u0010Q\u001a\u0004\u0018\u00010+2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b[\u0010XJ/\u0010\\\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00062\u0006\u0010T\u001a\u00020+2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\\\u0010ZJ1\u0010]\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00062\b\u0010Q\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b]\u00108J/\u0010^\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00062\u0006\u0010T\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b^\u00108J\u001f\u0010_\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b_\u0010!J\u001f\u0010`\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b`\u0010!J'\u0010b\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bb\u0010cJ\u001f\u0010e\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\be\u0010!J'\u0010g\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bg\u0010cJ/\u0010i\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bi\u00108J)\u0010k\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u000e2\b\u0010I\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bk\u0010KJ)\u0010m\u001a\u00020\u000b2\u0006\u0010l\u001a\u00020\u000e2\b\u0010I\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bm\u0010KJ\u0017\u0010n\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bn\u0010\rJ'\u0010q\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020\u00062\u0006\u0010p\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bq\u0010\u001aJ\u001f\u0010r\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\br\u0010!J9\u0010v\u001a\u00020\u000b2\u0006\u0010s\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u0010t\u001a\u00020\u00062\b\u0010u\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0006H&¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\u000b2\u0006\u0010z\u001a\u00020+H&¢\u0006\u0004\b{\u0010|J\u001f\u0010~\u001a\u00020\u000b2\u0006\u0010}\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b~\u0010!J\"\u0010\u0080\u0001\u001a\u00020\u000b2\u0006\u0010\u007f\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0084\u0001"}, d2 = {"Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseRNTareBridge;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "getAppModel", "(Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "getAppModelSync", "()Lcom/facebook/react/bridge/ReadableMap;", "getAccountStatus", "getAccountStatusSync", "getDeviceModel", "getDeviceModelSync", "getAppSessionInfo", "getAppSessionInfoSync", "screenName", "elementName", "logTapButton", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableArray;", "tags", "extraParams", "logTapButtonWithExtraParams", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "logScreenView", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "elementType", "logElementView", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "logScreenViewWithExtraParams", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "eventName", "eventType", "logLegacyGenericEvent", "message", "", "errCode", "errDomain", "otherUserInfo", "logNonFatal", "(Ljava/lang/String;DLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "event", "metadata", "logRNBridgeInternal", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "url", "subject", "openShareSheet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "text", "copyToClipboard", "", "isRegistration", "from", "openLoginModal", "(ZLjava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "rootTag", "leading", "trailing", "title", "backgroundColor", "animated", "setNavBarItems", "(DLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "profilePreferenceFormData", "presenter", "presentProfilePreferences", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "style", "tk", "openPaywallModal", "namespace", "key", "defaultValue", "getLocalPrefsBoolean", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/facebook/react/bridge/Promise;)V", "newValue", "setLocalPrefsBoolean", "(Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/react/bridge/Promise;)V", "getLocalPrefsInt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/facebook/react/bridge/Promise;)V", "setLocalPrefsInt", "(Ljava/lang/String;Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V", "getLocalPrefsLong", "setLocalPrefsLong", "getLocalPrefsString", "setLocalPrefsString", "clearLocalPrefsNamespace", "getCachedViewJobHint", "hint", "setCachedViewJobHint", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "homepageTk", "getCachedViewJobFeed", "viewJobFeed", "setCachedViewJobFeed", "value", "updateCachedViewJobFeed", "resumeMainSectionFormData", "presentResumeMainSectionForm", "resumeOtherSectionFormData", "presentResumeOtherSectionForm", "sseClient", "sseClientId", "path", "sseConnect", "sseDisconnect", "requestId", "method", "body", "startNativeFetch", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "(D)V", "testName", "getProctorAllocation", "testNames", "getProctorAllocations", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "Companion", "a", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class IndeedRNBridgeBaseRNTareBridge extends ReactContextBaseJavaModule {
    public static final int $stable = 8;
    public static final String MODULE_NAME = "RNTareBridge";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeedRNBridgeBaseRNTareBridge(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    public abstract void addListener(String eventName);

    public abstract void clearLocalPrefsNamespace(String namespace, Promise promise);

    public abstract void copyToClipboard(String text, Promise promise);

    public abstract void getAccountStatus(Promise promise);

    public abstract ReadableMap getAccountStatusSync();

    public abstract void getAppModel(Promise promise);

    public abstract ReadableMap getAppModelSync();

    public abstract void getAppSessionInfo(Promise promise);

    public abstract ReadableMap getAppSessionInfoSync();

    public abstract void getCachedViewJobFeed(String homepageTk, Promise promise);

    public abstract void getCachedViewJobHint(String key, Promise promise);

    public abstract void getDeviceModel(Promise promise);

    public abstract ReadableMap getDeviceModelSync();

    public abstract void getLocalPrefsBoolean(String namespace, String key, Boolean defaultValue, Promise promise);

    public abstract void getLocalPrefsInt(String namespace, String key, Double defaultValue, Promise promise);

    public abstract void getLocalPrefsLong(String namespace, String key, Double defaultValue, Promise promise);

    public abstract void getLocalPrefsString(String namespace, String key, String defaultValue, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public abstract void getProctorAllocation(String testName, Promise promise);

    public abstract void getProctorAllocations(ReadableArray testNames, Promise promise);

    public abstract void logElementView(String screenName, String elementName, String elementType, ReadableArray tags, ReadableMap extraParams, Promise promise);

    public abstract void logLegacyGenericEvent(String eventName, String eventType, ReadableArray tags, ReadableMap extraParams, Promise promise);

    public abstract void logNonFatal(String message, double errCode, String errDomain, ReadableMap otherUserInfo, Promise promise);

    public abstract void logRNBridgeInternal(ReadableMap event, ReadableMap metadata, Promise promise);

    public abstract void logScreenView(String screenName, Promise promise);

    public abstract void logScreenViewWithExtraParams(String screenName, ReadableArray tags, ReadableMap extraParams, Promise promise);

    public abstract void logTapButton(String screenName, String elementName, Promise promise);

    public abstract void logTapButtonWithExtraParams(String screenName, String elementName, ReadableArray tags, ReadableMap extraParams, Promise promise);

    public abstract void openLoginModal(boolean isRegistration, String from, Promise promise);

    public abstract void openPaywallModal(String style, String from, String tk, Promise promise);

    public abstract void openShareSheet(String url, String message, String subject, Promise promise);

    public abstract void presentProfilePreferences(ReadableMap profilePreferenceFormData, String presenter, Promise promise);

    public abstract void presentResumeMainSectionForm(ReadableMap resumeMainSectionFormData, String presenter, Promise promise);

    public abstract void presentResumeOtherSectionForm(ReadableMap resumeOtherSectionFormData, String presenter, Promise promise);

    public abstract void removeListeners(double count);

    public abstract void setCachedViewJobFeed(String homepageTk, ReadableMap viewJobFeed, Promise promise);

    public abstract void setCachedViewJobHint(String key, ReadableMap hint, Promise promise);

    public abstract void setLocalPrefsBoolean(String namespace, String key, boolean newValue, Promise promise);

    public abstract void setLocalPrefsInt(String namespace, String key, double newValue, Promise promise);

    public abstract void setLocalPrefsLong(String namespace, String key, double newValue, Promise promise);

    public abstract void setLocalPrefsString(String namespace, String key, String newValue, Promise promise);

    public abstract void setNavBarItems(double rootTag, ReadableArray leading, ReadableArray trailing, ReadableMap title, String backgroundColor, Boolean animated, String screenName, Promise promise);

    public abstract void sseClient(Promise promise);

    public abstract void sseConnect(String sseClientId, String path, Promise promise);

    public abstract void sseDisconnect(String sseClientId, Promise promise);

    public abstract void startNativeFetch(String requestId, String url, String method, String body, Promise promise);

    public abstract void updateCachedViewJobFeed(String homepageTk, String key, String value, Promise promise);
}
