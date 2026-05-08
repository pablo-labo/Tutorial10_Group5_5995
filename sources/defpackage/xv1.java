package defpackage;

import android.util.Log;
import org.webrtc.CameraVideoCapturer;

/* JADX INFO: loaded from: classes3.dex */
public final class xv1 implements CameraVideoCapturer.CameraSwitchHandler {
    public final /* synthetic */ uv1 a;
    public final /* synthetic */ o66 b;
    public final /* synthetic */ wv1 c;

    public xv1(wv1 wv1Var, uv1 uv1Var, o66 o66Var) {
        this.c = wv1Var;
        this.a = uv1Var;
        this.b = o66Var;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public final void onCameraSwitchDone(boolean z) {
        this.c.i = z;
        this.a.run();
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public final void onCameraSwitchError(String str) {
        Exception exc = new Exception(l5.l("Error switching camera: ", str));
        Log.e("wv1", "OnCameraSwitchError", exc);
        this.b.accept(exc);
    }
}
