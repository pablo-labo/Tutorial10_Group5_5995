package com.oney.WebRTCModule;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public final a a = new a();
    public final CameraEnumerator b;
    public final AudioManager c;
    public final WebRTCModule d;

    public class a extends AudioDeviceCallback {
        public a() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            d.this.d.sendEvent("mediaDevicesOnDeviceChange", null);
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            d.this.d.sendEvent("mediaDevicesOnDeviceChange", null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("BLUETOOTH", 0);
            a = bVar;
            b bVar2 = new b("SPEAKERPHONE", 1);
            b = bVar2;
            b bVar3 = new b("WIRED_OR_EARPIECE", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public enum c {
        VIDEO_INPUT("videoinput"),
        AUDIO(MediaStreamTrack.AUDIO_TRACK_KIND);

        private String kind;

        c(String str) {
            this.kind = str;
        }

        public final String a() {
            return this.kind;
        }
    }

    public d(WebRTCModule webRTCModule, ReactApplicationContext reactApplicationContext) {
        boolean zIsSupported;
        CameraEnumerator camera1Enumerator;
        this.d = webRTCModule;
        this.c = (AudioManager) reactApplicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        try {
            zIsSupported = Camera2Enumerator.isSupported(reactApplicationContext);
        } catch (Throwable th) {
            Log.w("com.oney.WebRTCModule.d", "Error checking for Camera2 API support.", th);
            zIsSupported = false;
        }
        if (zIsSupported) {
            Log.d("com.oney.WebRTCModule.d", "Creating video capturer using Camera2 API.");
            camera1Enumerator = new Camera2Enumerator(reactApplicationContext);
        } else {
            Log.d("com.oney.WebRTCModule.d", "Creating video capturer using Camera1 API.");
            camera1Enumerator = new Camera1Enumerator(false);
        }
        this.b = camera1Enumerator;
    }

    public static WritableMap a(String str, String str2, String str3) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("deviceId", str);
        writableMapCreateMap.putString("groupId", "");
        writableMapCreateMap.putString("label", str2);
        writableMapCreateMap.putString("kind", str3);
        return writableMapCreateMap;
    }

    public final void b(String str) {
        Log.d("com.oney.WebRTCModule.d", "setAudioDevice(audioDeviceType=" + str + ")");
        int iOrdinal = b.valueOf(str).ordinal();
        AudioManager audioManager = this.c;
        if (iOrdinal == 0) {
            audioManager.setSpeakerphoneOn(false);
            c(true);
        } else if (iOrdinal == 1) {
            c(false);
            audioManager.setSpeakerphoneOn(true);
        } else if (iOrdinal != 2) {
            Log.e("com.oney.WebRTCModule.d", "Invalid audio device selection");
        } else {
            c(false);
            audioManager.setSpeakerphoneOn(false);
        }
    }

    public final void c(boolean z) {
        AudioManager audioManager = this.c;
        if (z) {
            audioManager.startBluetoothSco();
            audioManager.setBluetoothScoOn(true);
        } else {
            audioManager.setBluetoothScoOn(false);
            audioManager.stopBluetoothSco();
        }
    }
}
