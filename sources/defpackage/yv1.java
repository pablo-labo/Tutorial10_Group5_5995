package defpackage;

import android.util.Log;
import org.webrtc.CameraVideoCapturer;

/* JADX INFO: loaded from: classes3.dex */
public final class yv1 implements CameraVideoCapturer.CameraSwitchHandler {
    public final /* synthetic */ wv1 a;

    public yv1(wv1 wv1Var) {
        this.a = wv1Var;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public final void onCameraSwitchDone(boolean z) {
        Log.d("wv1", "Restored to the right camera facing mode: ".concat(this.a.h()));
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public final void onCameraSwitchError(String str) {
        Log.e("wv1", "Error restoring camera: " + str);
    }
}
