package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.WritableMap;
import com.oney.WebRTCModule.f;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iy1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iy1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((CatalystInstanceImpl) obj).lambda$destroy$1();
                break;
            default:
                f fVar = (f) obj;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("pcId", fVar.b);
                fVar.i.sendEvent("peerConnectionOnRenegotiationNeeded", writableMapCreateMap);
                break;
        }
    }
}
