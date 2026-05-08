package com.facebook.react.bridge;

import com.datadog.android.rum.internal.RumFeature;
import defpackage.f84;
import defpackage.sy3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001d\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0003\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0003\u0010\nJ!\u0010\u0004\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0004\u0010\u000eJ!\u0010\u0004\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0004\u0010\u0011J+\u0010\u0004\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0004\u0010\u0012J\u0017\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0004\u0010\u0013J\u001f\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0004\u0010\u0016J\u001f\u0010\u0004\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0004\u0010\u0017J)\u0010\u0004\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0004\u0010\u0018J)\u0010\u0004\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0004\u0010\u0019J7\u0010\u0004\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0004\u0010\u001aJ\u0017\u0010\u0004\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0004\u0010\u001bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/bridge/PromiseImpl;", "Lcom/facebook/react/bridge/Promise;", "Lcom/facebook/react/bridge/Callback;", "resolve", "reject", "<init>", "(Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "", "value", "Lj6g;", "(Ljava/lang/Object;)V", "", PromiseImpl.ERROR_MAP_KEY_CODE, "message", "(Ljava/lang/String;Ljava/lang/String;)V", "", RumFeature.EVENT_THROWABLE_PROPERTY, "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "Lcom/facebook/react/bridge/WritableMap;", PromiseImpl.ERROR_MAP_KEY_USER_INFO, "(Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V", "(Ljava/lang/String;)V", "Lcom/facebook/react/bridge/Callback;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@f84
public final class PromiseImpl implements Promise {
    private static final Companion Companion = new Companion(null);
    private static final String ERROR_DEFAULT_CODE = "EUNSPECIFIED";
    private static final String ERROR_DEFAULT_MESSAGE = "Error not specified.";
    private static final String ERROR_MAP_KEY_CODE = "code";
    private static final String ERROR_MAP_KEY_MESSAGE = "message";
    private static final String ERROR_MAP_KEY_NAME = "name";
    private static final String ERROR_MAP_KEY_NATIVE_STACK = "nativeStackAndroid";
    private static final String ERROR_MAP_KEY_USER_INFO = "userInfo";
    private static final int ERROR_STACK_FRAME_LIMIT = 50;
    private static final String STACK_FRAME_KEY_CLASS = "class";
    private static final String STACK_FRAME_KEY_FILE = "file";
    private static final String STACK_FRAME_KEY_LINE_NUMBER = "lineNumber";
    private static final String STACK_FRAME_KEY_METHOD_NAME = "methodName";
    private Callback reject;
    private Callback resolve;

    @f84
    public PromiseImpl(Callback callback, Callback callback2) {
        this.resolve = callback;
        this.reject = callback2;
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, String message, Throwable throwable, WritableMap userInfo) {
        if (this.reject == null) {
            this.resolve = null;
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (code == null) {
            writableNativeMap.putString(ERROR_MAP_KEY_CODE, ERROR_DEFAULT_CODE);
        } else {
            writableNativeMap.putString(ERROR_MAP_KEY_CODE, code);
        }
        if (message != null) {
            writableNativeMap.putString("message", message);
        } else if (throwable != null) {
            String message2 = throwable.getMessage();
            if (message2 == null || message2.length() == 0) {
                message2 = throwable.getClass().getCanonicalName();
            }
            writableNativeMap.putString("message", message2);
        } else {
            writableNativeMap.putString("message", ERROR_DEFAULT_MESSAGE);
        }
        if (userInfo != null) {
            writableNativeMap.putMap(ERROR_MAP_KEY_USER_INFO, userInfo);
        } else {
            writableNativeMap.putNull(ERROR_MAP_KEY_USER_INFO);
        }
        if (throwable != null) {
            writableNativeMap.putString(ERROR_MAP_KEY_NAME, throwable.getClass().getCanonicalName());
            StackTraceElement[] stackTrace = throwable.getStackTrace();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (int i = 0; i < stackTrace.length && i < ERROR_STACK_FRAME_LIMIT; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putString(STACK_FRAME_KEY_CLASS, stackTraceElement.getClassName());
                writableNativeMap2.putString(STACK_FRAME_KEY_FILE, stackTraceElement.getFileName());
                writableNativeMap2.putInt(STACK_FRAME_KEY_LINE_NUMBER, stackTraceElement.getLineNumber());
                writableNativeMap2.putString(STACK_FRAME_KEY_METHOD_NAME, stackTraceElement.getMethodName());
                writableNativeArray.pushMap(writableNativeMap2);
            }
            writableNativeMap.putArray(ERROR_MAP_KEY_NATIVE_STACK, writableNativeArray);
        } else {
            writableNativeMap.putArray(ERROR_MAP_KEY_NATIVE_STACK, new WritableNativeArray());
        }
        Callback callback = this.reject;
        if (callback != null) {
            callback.invoke(writableNativeMap);
        }
        this.resolve = null;
        this.reject = null;
    }

    @Override // com.facebook.react.bridge.Promise
    public void resolve(Object value) {
        Callback callback = this.resolve;
        if (callback != null) {
            callback.invoke(value);
            this.resolve = null;
            this.reject = null;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/bridge/PromiseImpl$Companion;", "", "<init>", "()V", "ERROR_STACK_FRAME_LIMIT", "", "ERROR_DEFAULT_CODE", "", "ERROR_DEFAULT_MESSAGE", "ERROR_MAP_KEY_CODE", "ERROR_MAP_KEY_MESSAGE", "ERROR_MAP_KEY_NAME", "ERROR_MAP_KEY_USER_INFO", "ERROR_MAP_KEY_NATIVE_STACK", "STACK_FRAME_KEY_CLASS", "STACK_FRAME_KEY_FILE", "STACK_FRAME_KEY_LINE_NUMBER", "STACK_FRAME_KEY_METHOD_NAME", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, Throwable throwable) {
        code.getClass();
        reject(code, null, throwable, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, String message, Throwable throwable) {
        code.getClass();
        reject(code, message, throwable, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable throwable) {
        throwable.getClass();
        reject(null, null, throwable, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable throwable, WritableMap userInfo) {
        throwable.getClass();
        userInfo.getClass();
        reject(null, null, throwable, userInfo);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, WritableMap userInfo) {
        code.getClass();
        userInfo.getClass();
        reject(code, null, null, userInfo);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, Throwable throwable, WritableMap userInfo) {
        code.getClass();
        userInfo.getClass();
        reject(code, null, throwable, userInfo);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, String message, WritableMap userInfo) {
        code.getClass();
        userInfo.getClass();
        reject(code, message, null, userInfo);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, String message) {
        code.getClass();
        reject(code, message, null, null);
    }

    @Override // com.facebook.react.bridge.Promise
    @sy3
    public void reject(String message) {
        message.getClass();
        reject(null, message, null, null);
    }
}
