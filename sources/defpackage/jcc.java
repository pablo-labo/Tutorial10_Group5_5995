package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.indeed.android.reactnative.nativemodules.RNBroadcastModule;
import com.indeed.android.reactnative.nativemodules.RNCoreNativeModule;
import com.indeed.android.reactnative.nativemodules.RNDatadogBridge;
import com.indeed.android.reactnative.nativemodules.RNFileCacheModule;
import com.indeed.android.reactnative.nativemodules.RNJSONCallbackNativeModule;
import com.indeed.android.reactnative.nativemodules.RNJSTPushAuthorization;
import com.indeed.android.reactnative.rntarebridge.RNTareBridge;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final class jcc implements inc {
    public final zw a;
    public final lz b;
    public final OkHttpClient c;

    public jcc(zw zwVar, lz lzVar, OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.a = zwVar;
        this.b = lzVar;
        this.c = okHttpClient;
    }

    @Override // defpackage.inc
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        return u63.a0(new RNBroadcastModule(reactApplicationContext), new RNCoreNativeModule(reactApplicationContext), new RNTareBridge(reactApplicationContext), new RNJSTNavigator(reactApplicationContext), new RNJSTPushAuthorization(reactApplicationContext), new RNJSONCallbackNativeModule(reactApplicationContext), new RNDatadogBridge(reactApplicationContext, this.a, this.b), new RNFileCacheModule(reactApplicationContext, this.c), new RNBroadcastModule(reactApplicationContext));
    }

    @Override // defpackage.inc
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList();
    }
}
