package defpackage;

import android.content.Context;
import com.datadog.android.core.internal.CoreFeature;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.oney.WebRTCModule.WebRTCModule;
import com.oney.WebRTCModule.f;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.webrtc.DataChannel;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kz2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kz2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                CoreFeature.initialize$lambda$0((CoreFeature) obj2, (Context) obj);
                break;
            case 1:
                MessageQueueThreadImpl.callOnQueue$lambda$0((SimpleSettableFuture) obj2, (Callable) obj);
                break;
            case 2:
                f fVar = (f) obj2;
                DataChannel dataChannel = (DataChannel) obj;
                String string = UUID.randomUUID().toString();
                WebRTCModule webRTCModule = fVar.i;
                int i2 = fVar.b;
                zd3 zd3Var = new zd3(webRTCModule, i2, string, dataChannel);
                fVar.a.put(string, zd3Var);
                dataChannel.registerObserver(zd3Var);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("peerConnectionId", i2);
                writableMapCreateMap.putString("reactTag", string);
                writableMapCreateMap.putString("label", dataChannel.label());
                writableMapCreateMap.putInt("id", dataChannel.id());
                writableMapCreateMap.putBoolean("ordered", true);
                writableMapCreateMap.putInt("maxPacketLifeTime", -1);
                writableMapCreateMap.putInt("maxRetransmits", -1);
                writableMapCreateMap.putString("protocol", "");
                writableMapCreateMap.putBoolean("negotiated", false);
                writableMapCreateMap.putString("readyState", zd3.a(dataChannel.state()));
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putInt("pcId", i2);
                writableMapCreateMap2.putMap("dataChannel", writableMapCreateMap);
                webRTCModule.sendEvent("peerConnectionDidOpenDataChannel", writableMapCreateMap2);
                break;
            default:
                ((VideoSource) obj2).lambda$setVideoProcessor$0((VideoFrame) obj);
                break;
        }
    }
}
