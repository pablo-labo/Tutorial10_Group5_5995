package defpackage;

import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.oney.WebRTCModule.WebRTCModule;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.webrtc.DataChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class zd3 implements DataChannel.Observer {
    public final String a;
    public final DataChannel b;
    public final int c;
    public final WebRTCModule d;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DataChannel.State.values().length];
            a = iArr;
            try {
                iArr[DataChannel.State.CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DataChannel.State.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[DataChannel.State.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[DataChannel.State.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public zd3(WebRTCModule webRTCModule, int i, String str, DataChannel dataChannel) {
        this.d = webRTCModule;
        this.c = i;
        this.a = str;
        this.b = dataChannel;
    }

    public static String a(DataChannel.State state) {
        int i = a.a[state.ordinal()];
        if (i == 1) {
            return "connecting";
        }
        if (i == 2) {
            return "open";
        }
        if (i == 3) {
            return "closing";
        }
        if (i != 4) {
            return null;
        }
        return "closed";
    }

    @Override // org.webrtc.DataChannel.Observer
    public final void onBufferedAmountChange(long j) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("reactTag", this.a);
        writableMapCreateMap.putInt("peerConnectionId", this.c);
        writableMapCreateMap.putDouble("bufferedAmount", Long.valueOf(j).doubleValue());
        this.d.sendEvent("dataChannelDidChangeBufferedAmount", writableMapCreateMap);
    }

    @Override // org.webrtc.DataChannel.Observer
    public final void onMessage(DataChannel.Buffer buffer) {
        byte[] bArrArray;
        String str;
        String str2;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("reactTag", this.a);
        writableMapCreateMap.putInt("peerConnectionId", this.c);
        boolean zHasArray = buffer.data.hasArray();
        ByteBuffer byteBuffer = buffer.data;
        if (zHasArray) {
            bArrArray = byteBuffer.array();
        } else {
            bArrArray = new byte[byteBuffer.remaining()];
            buffer.data.get(bArrArray);
        }
        if (buffer.binary) {
            str = Base64.encodeToString(bArrArray, 2);
            str2 = "binary";
        } else {
            str = new String(bArrArray, StandardCharsets.UTF_8);
            str2 = "text";
        }
        writableMapCreateMap.putString("type", str2);
        writableMapCreateMap.putString("data", str);
        this.d.sendEvent("dataChannelReceiveMessage", writableMapCreateMap);
    }

    @Override // org.webrtc.DataChannel.Observer
    public final void onStateChange() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("reactTag", this.a);
        writableMapCreateMap.putInt("peerConnectionId", this.c);
        DataChannel dataChannel = this.b;
        writableMapCreateMap.putInt("id", dataChannel.id());
        writableMapCreateMap.putString("state", a(dataChannel.state()));
        this.d.sendEvent("dataChannelStateChanged", writableMapCreateMap);
    }
}
