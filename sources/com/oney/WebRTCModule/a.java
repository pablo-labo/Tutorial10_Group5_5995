package com.oney.WebRTCModule;

import android.util.Log;
import org.webrtc.CameraVideoCapturer;

/* JADX INFO: loaded from: classes3.dex */
public class a implements CameraVideoCapturer.CameraEventsHandler {
    public static final String a = WebRTCModule.TAG;

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraClosed() {
        Log.d(a, "CameraEventsHandler.onCameraClosed");
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraDisconnected() {
        Log.d(a, "CameraEventsHandler.onCameraDisconnected");
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraError(String str) {
        Log.d(a, "CameraEventsHandler.onCameraError: errorDescription=" + str);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraFreezed(String str) {
        Log.d(a, "CameraEventsHandler.onCameraFreezed: errorDescription=" + str);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraOpening(String str) {
        Log.d(a, "CameraEventsHandler.onCameraOpening: cameraName=" + str);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onFirstFrameAvailable() {
        Log.d(a, "CameraEventsHandler.onFirstFrameAvailable");
    }
}
