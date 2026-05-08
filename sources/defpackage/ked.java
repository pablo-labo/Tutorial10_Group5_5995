package defpackage;

import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: loaded from: classes3.dex */
public final class ked {
    public static final void a(Fragment fragment, String str) {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        fragment.getClass();
        try {
            Object applicationContext = fragment.requireContext().getApplicationContext();
            applicationContext.getClass();
            rkc rkcVarB = ((pjc) applicationContext).b();
            ReactContext reactContextA = rkcVarB != null ? rkcVarB.a() : null;
            if (reactContextA == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextA.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
                return;
            }
            rCTDeviceEventEmitter.emit("pushEventMessageReceived", null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c(str, "Error emitting pushEventMessageReceived event", false, e);
        }
    }
}
