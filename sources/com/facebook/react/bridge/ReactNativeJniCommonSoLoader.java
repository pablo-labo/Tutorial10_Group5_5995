package com.facebook.react.bridge;

import com.facebook.soloader.SoLoader;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068G@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/react/bridge/ReactNativeJniCommonSoLoader;", "", "<init>", "()V", "Lj6g;", "staticInit", "", "value", "initialized", "Z", "isInitialized", "()Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactNativeJniCommonSoLoader {
    public static final ReactNativeJniCommonSoLoader INSTANCE = new ReactNativeJniCommonSoLoader();
    private static volatile boolean initialized;

    private ReactNativeJniCommonSoLoader() {
    }

    public static final boolean isInitialized() {
        return initialized;
    }

    public static final synchronized void staticInit() {
        if (initialized) {
            return;
        }
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
        SoLoader.l("reactnativejni_common");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
        initialized = true;
    }
}
