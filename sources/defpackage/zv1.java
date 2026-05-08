package defpackage;

import android.util.Log;
import com.oney.WebRTCModule.WebRTCModule;
import org.webrtc.CameraVideoCapturer;

/* JADX INFO: loaded from: classes3.dex */
public final class zv1 implements CameraVideoCapturer.CameraSwitchHandler {
    public final /* synthetic */ WebRTCModule.a a;
    public final /* synthetic */ wv1 b;

    public zv1(wv1 wv1Var, WebRTCModule.a aVar) {
        this.b = wv1Var;
        this.a = aVar;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public final void onCameraSwitchDone(boolean z) {
        Log.d("wv1", "Invoked onCameraSwitchDone, isFrontFacing:" + z);
        wv1 wv1Var = this.b;
        wv1Var.i = z;
        this.a.a.resolve(wv1Var.h());
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public final void onCameraSwitchError(String str) {
        Log.e("wv1", "Error switching camera: " + str);
        this.a.a.resolve(this.b.h());
    }
}
