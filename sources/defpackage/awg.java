package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.oney.WebRTCModule.RTCVideoViewManager;
import com.oney.WebRTCModule.WebRTCModule;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class awg implements inc {
    @Override // defpackage.inc
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new WebRTCModule(reactApplicationContext));
    }

    @Override // defpackage.inc
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RTCVideoViewManager());
    }
}
