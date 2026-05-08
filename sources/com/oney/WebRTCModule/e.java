package com.oney.WebRTCModule;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.oney.WebRTCModule.WebRTCModule;
import defpackage.cp4;
import defpackage.dlf;
import defpackage.f5;
import defpackage.ln2;
import defpackage.wv1;
import defpackage.z24;
import defpackage.zv1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import java.util.function.Predicate;
import org.webrtc.AudioTrack;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static final String g = WebRTCModule.TAG;
    public static final int h = (int) (Math.random() * 32767.0d);
    public CameraEnumerator a;
    public final ReactApplicationContext b;
    public final HashMap c = new HashMap();
    public final WebRTCModule d;
    public Promise e;
    public Intent f;

    public class a extends BaseActivityEventListener {
        public a() {
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public final void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            super.onActivityResult(activity, i, i2, intent);
            if (i == e.h) {
                e eVar = e.this;
                if (i2 != -1) {
                    eVar.e.reject("DOMException", "NotAllowedError");
                    eVar.e = null;
                } else {
                    eVar.f = intent;
                    dlf.a(new z24(2, this, activity));
                }
            }
        }
    }

    public interface b<T, U> {
        void e(String str, ArrayList arrayList);
    }

    public static class c {
        public final MediaSource a;
        public final MediaStreamTrack b;
        public final f5 c;
        public final SurfaceTextureHelper d;
        public boolean e = false;

        public c(MediaStreamTrack mediaStreamTrack, MediaSource mediaSource, f5 f5Var, SurfaceTextureHelper surfaceTextureHelper) {
            this.b = mediaStreamTrack;
            this.a = mediaSource;
            this.c = f5Var;
            this.d = surfaceTextureHelper;
        }
    }

    public e(WebRTCModule webRTCModule, ReactApplicationContext reactApplicationContext) {
        this.d = webRTCModule;
        this.b = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new a());
    }

    public final void a(MediaStreamTrack[] mediaStreamTrackArr, b<String, ArrayList<WritableMap>> bVar) {
        String string = UUID.randomUUID().toString();
        WebRTCModule webRTCModule = this.d;
        MediaStream mediaStreamCreateLocalMediaStream = webRTCModule.mFactory.createLocalMediaStream(string);
        ArrayList arrayList = new ArrayList();
        for (MediaStreamTrack mediaStreamTrack : mediaStreamTrackArr) {
            if (mediaStreamTrack != null) {
                boolean z = mediaStreamTrack instanceof AudioTrack;
                if (z) {
                    mediaStreamCreateLocalMediaStream.addTrack((AudioTrack) mediaStreamTrack);
                } else {
                    mediaStreamCreateLocalMediaStream.addTrack((VideoTrack) mediaStreamTrack);
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                String strId = mediaStreamTrack.id();
                writableMapCreateMap.putBoolean("enabled", mediaStreamTrack.enabled());
                writableMapCreateMap.putString("id", strId);
                writableMapCreateMap.putString("kind", mediaStreamTrack.kind());
                writableMapCreateMap.putString("readyState", "live");
                writableMapCreateMap.putBoolean("remote", false);
                if (mediaStreamTrack instanceof VideoTrack) {
                    writableMapCreateMap.putMap("settings", ((c) this.c.get(strId)).c.e());
                }
                if (z) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putString("deviceId", "audio-1");
                    writableMapCreateMap2.putString("groupId", "");
                    writableMapCreateMap.putMap("settings", writableMapCreateMap2);
                }
                arrayList.add(writableMapCreateMap);
            }
        }
        Log.d(g, "MediaStream id: " + string);
        webRTCModule.localStreams.put(string, mediaStreamCreateLocalMediaStream);
        bVar.e(string, arrayList);
    }

    public final VideoTrack b(f5 f5Var) {
        VideoCapturer videoCapturerB = f5Var.b();
        f5Var.g = videoCapturerB;
        if (videoCapturerB == null) {
            return null;
        }
        WebRTCModule webRTCModule = this.d;
        PeerConnectionFactory peerConnectionFactory = webRTCModule.mFactory;
        SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("CaptureThread", cp4.a());
        if (surfaceTextureHelperCreate == null) {
            Log.d(g, "Error creating SurfaceTextureHelper");
            return null;
        }
        String string = UUID.randomUUID().toString();
        f5Var.h = new ln2(webRTCModule, string);
        VideoSource videoSourceCreateVideoSource = peerConnectionFactory.createVideoSource(videoCapturerB.isScreencast());
        videoCapturerB.initialize(surfaceTextureHelperCreate, this.b, videoSourceCreateVideoSource.getCapturerObserver());
        VideoTrack videoTrackCreateVideoTrack = peerConnectionFactory.createVideoTrack(string, videoSourceCreateVideoSource);
        videoTrackCreateVideoTrack.setEnabled(true);
        this.c.put(string, new c(videoTrackCreateVideoTrack, videoSourceCreateVideoSource, f5Var, surfaceTextureHelperCreate));
        f5Var.f();
        return videoTrackCreateVideoTrack;
    }

    public final void c(String str, WebRTCModule.a aVar) {
        Promise promise = aVar.a;
        c cVar = (c) this.c.get(str);
        if (cVar != null) {
            f5 f5Var = cVar.c;
            if (f5Var instanceof wv1) {
                final wv1 wv1Var = (wv1) f5Var;
                Log.d("wv1", "Invoked switchCamera, isCapturing:" + wv1Var.j);
                if (!wv1Var.j) {
                    wv1Var.i = !wv1Var.i;
                    promise.resolve(wv1Var.h());
                    return;
                }
                VideoCapturer videoCapturer = wv1Var.g;
                if (videoCapturer instanceof CameraVideoCapturer) {
                    CameraVideoCapturer cameraVideoCapturer = (CameraVideoCapturer) videoCapturer;
                    String[] deviceNames = wv1Var.n.getDeviceNames();
                    int length = deviceNames.length;
                    Log.d("wv1", "Invoked switchCamera, deviceCount:" + length);
                    if (length < 2) {
                        promise.resolve(wv1Var.h());
                        return;
                    }
                    zv1 zv1Var = new zv1(wv1Var, aVar);
                    if (length == 2) {
                        cameraVideoCapturer.switchCamera(zv1Var);
                        return;
                    }
                    try {
                        String str2 = (String) Arrays.stream(deviceNames).filter(new Predicate() { // from class: tv1
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                String str3 = (String) obj;
                                wv1 wv1Var2 = wv1Var;
                                wv1Var2.getClass();
                                StringBuilder sb = new StringBuilder("Filtering ");
                                sb.append(str3);
                                sb.append(" isFrontFacing ");
                                CameraEnumerator cameraEnumerator = wv1Var2.n;
                                sb.append(cameraEnumerator.isFrontFacing(str3));
                                Log.d("wv1", sb.toString());
                                return cameraEnumerator.isFrontFacing(str3) != wv1Var2.i;
                            }
                        }).findFirst().get();
                        Log.d("wv1", "Invoked switchCamera, has more than 02 cameras, will switch to device:" + str2);
                        cameraVideoCapturer.switchCamera(zv1Var, str2);
                    } catch (Exception e) {
                        Log.d("wv1", "Failed to switch the camera device:" + e.getMessage());
                    }
                }
            }
        }
    }
}
