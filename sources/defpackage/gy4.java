package defpackage;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gy4 implements fy4, ui7 {
    public ReactContext a;

    @Override // defpackage.fy4
    public final void a(String str, Bundle bundle) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, Arguments.fromBundle(bundle));
    }

    @Override // defpackage.ui7
    public final List<Class> f() {
        return Collections.singletonList(fy4.class);
    }
}
