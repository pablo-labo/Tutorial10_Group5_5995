package defpackage;

import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.runtime.ReactHostImpl;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class vlc implements xlc {
    public final ReactHostImpl a;

    public vlc(ReactHostImpl reactHostImpl) {
        this.a = reactHostImpl;
    }

    public final Activity a() {
        WeakReference<Activity> weakReference = this.a.o.get();
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void b() {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        ReactContext reactContextA = this.a.a();
        if (reactContextA == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextA.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
            return;
        }
        rCTDeviceEventEmitter.emit("toggleElementInspector", null);
    }
}
