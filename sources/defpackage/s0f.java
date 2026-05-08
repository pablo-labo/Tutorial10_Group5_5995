package defpackage;

import com.oney.WebRTCModule.WebRTCModule;
import org.webrtc.SurfaceTextureHelper;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s0f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s0f(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((SurfaceTextureHelper) obj).lambda$setFrameRotation$4(i2);
                break;
            default:
                ((WebRTCModule) obj).lambda$peerConnectionRestartIce$37(i2);
                break;
        }
    }
}
