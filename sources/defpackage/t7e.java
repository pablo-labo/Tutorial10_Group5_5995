package defpackage;

import com.facebook.react.bridge.WritableArray;
import java.util.function.Consumer;
import org.webrtc.RtpCapabilities;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t7e implements Consumer {
    public final /* synthetic */ WritableArray a;

    public /* synthetic */ t7e(WritableArray writableArray) {
        this.a = writableArray;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.pushMap(y7e.d((RtpCapabilities.CodecCapability) obj));
    }
}
