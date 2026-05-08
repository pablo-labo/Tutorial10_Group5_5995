package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import com.indeed.android.rnace.RNAceModule;
import com.oney.WebRTCModule.WebRTCModule;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class abc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ abc(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                RNAceModule.openAceResumeCreation$lambda$0((lr5) this.b, (ebc) this.c, (Promise) this.d);
                return;
            case 1:
                fmc fmcVar = (fmc) this.b;
                ylc[] ylcVarArr = (ylc[]) this.c;
                BridgeReactContext bridgeReactContext = (BridgeReactContext) this.d;
                synchronized (fmcVar) {
                    if (fmcVar.b == LifecycleState.c) {
                        fmcVar.i(true);
                    }
                    break;
                }
                for (ylc ylcVar : ylcVarArr) {
                    if (ylcVar != null) {
                        ylcVar.a(bridgeReactContext);
                    }
                }
                return;
            case 2:
                ((VideoFileRenderer) this.b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.c, (VideoFrame) this.d);
                return;
            default:
                WebRTCModule.d dVar = (WebRTCModule.d) this.b;
                PeerConnection peerConnection = (PeerConnection) this.c;
                Promise promise = (Promise) this.d;
                WritableMap writableMapCreateMap = Arguments.createMap();
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                SessionDescription localDescription = peerConnection.getLocalDescription();
                if (localDescription != null) {
                    writableMapCreateMap.putString("type", localDescription.type.canonicalForm());
                    writableMapCreateMap.putString("sdp", localDescription.description);
                }
                writableMapCreateMap2.putMap("sdpInfo", writableMapCreateMap);
                writableMapCreateMap2.putArray("transceiversInfo", dVar.c.getTransceiversInfo(peerConnection));
                promise.resolve(writableMapCreateMap2);
                return;
        }
    }
}
