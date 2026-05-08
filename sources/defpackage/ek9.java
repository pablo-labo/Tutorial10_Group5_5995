package defpackage;

import androidx.media3.exoplayer.video.g;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.indeed.android.myjobs.rnnextstepsdashboard.RNNextStepsDashboardModule;
import com.oney.WebRTCModule.f;
import org.webrtc.RtpReceiver;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ek9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ek9(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s sVar = (s) this.b;
                sVar.g.m1((r.d) this.c, Integer.MIN_VALUE, 3, x.o1(new q6(11)));
                break;
            case 1:
                f fVar = (f) this.b;
                RtpReceiver rtpReceiver = (RtpReceiver) this.c;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("pcId", fVar.b);
                writableMapCreateMap.putString("receiverId", rtpReceiver.id());
                fVar.i.sendEvent("peerConnectionOnRemoveTrack", writableMapCreateMap);
                break;
            case 2:
                RNNextStepsDashboardModule.showPushOptInModal$lambda$4((RNNextStepsDashboardModule) this.b, (Promise) this.c);
                break;
            case 3:
                fmc fmcVar = (fmc) this.b;
                try {
                    fmcVar.n((BridgeReactContext) this.c);
                } catch (Exception e) {
                    fmcVar.h.handleException(e);
                    return;
                }
                break;
            case 4:
                g.a aVar = (g.a) this.b;
                ak3 ak3Var = (ak3) this.c;
                synchronized (ak3Var) {
                }
                g gVar = aVar.b;
                String str = vjg.a;
                gVar.b(ak3Var);
                break;
            default:
                ((Promise) this.b).reject("E_OPERATION_ERROR", (String) this.c);
                break;
        }
    }
}
