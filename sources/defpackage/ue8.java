package defpackage;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import defpackage.pt7;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ue8 implements ey4, fy4 {
    public final fy4 a;
    public final WeakReference<ReactApplicationContext> b;

    public static final class a extends ox4<a> {
        public final String a;
        public final WritableMap b;
        public final Short c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, String str, WritableMap writableMap, Short sh) {
            super(i, i2);
            str.getClass();
            this.a = str;
            this.b = writableMap;
            this.c = sh;
        }

        @Override // defpackage.ox4
        public final boolean canCoalesce() {
            return this.c != null;
        }

        @Override // defpackage.ox4
        public final short getCoalescingKey() {
            Short sh = this.c;
            if (sh != null) {
                return sh.shortValue();
            }
            return (short) 0;
        }

        @Override // defpackage.ox4
        public final WritableMap getEventData() {
            WritableMap writableMap = this.b;
            if (writableMap != null) {
                return writableMap;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            return writableMapCreateMap;
        }

        @Override // defpackage.ox4
        public final String getEventName() {
            return ypd.I(this.a);
        }
    }

    public ue8(fy4 fy4Var, WeakReference<ReactApplicationContext> weakReference) {
        this.a = fy4Var;
        this.b = weakReference;
    }

    @Override // defpackage.fy4
    public void a(String str, Bundle bundle) {
        this.a.a(str, bundle);
    }

    @Override // defpackage.ey4
    public void b(String str, Map<?, ?> map) {
        str.getClass();
        ReactApplicationContext reactApplicationContext = this.b.get();
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = reactApplicationContext != null ? (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class) : null;
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit(str, pt7.b(map, pt7.b.a));
        }
    }
}
