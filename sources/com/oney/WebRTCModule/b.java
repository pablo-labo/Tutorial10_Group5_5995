package com.oney.WebRTCModule;

import android.media.AudioAttributes;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.oney.WebRTCModule.b;
import com.oney.WebRTCModule.d;
import defpackage.fd3;
import defpackage.gd3;
import defpackage.ky1;
import defpackage.xn0;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int W = 0;
    public a V;
    public d a;
    public AudioManager b;
    public DeviceEventManagerModule.RCTDeviceEventEmitter c;
    public EnumC0189b d;
    public ExecutorService e;
    public AudioFocusRequest f;

    public class a extends AudioDeviceCallback {
        public a() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            b.this.e.execute(new xn0(this, 2));
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            b.this.e.execute(new ky1(this, 2));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.oney.WebRTCModule.b$b, reason: collision with other inner class name */
    public static final class EnumC0189b {
        public static final EnumC0189b a;
        public static final EnumC0189b b;
        public static final EnumC0189b c;
        public static final EnumC0189b d;
        public static final /* synthetic */ EnumC0189b[] e;

        static {
            EnumC0189b enumC0189b = new EnumC0189b("IDLE", 0);
            a = enumC0189b;
            EnumC0189b enumC0189b2 = new EnumC0189b("VIDEO_CALL", 1);
            b = enumC0189b2;
            EnumC0189b enumC0189b3 = new EnumC0189b("VOICE_CALL", 2);
            c = enumC0189b3;
            EnumC0189b enumC0189b4 = new EnumC0189b("USER_SPECIFIED_ROUTE", 3);
            d = enumC0189b4;
            e = new EnumC0189b[]{enumC0189b, enumC0189b2, enumC0189b3, enumC0189b4};
        }

        public EnumC0189b() {
            throw null;
        }

        public static EnumC0189b valueOf(String str) {
            return (EnumC0189b) Enum.valueOf(EnumC0189b.class, str);
        }

        public static EnumC0189b[] values() {
            return (EnumC0189b[]) e.clone();
        }
    }

    public final void a() {
        d.b bVar;
        d dVar = this.a;
        AudioManager audioManager = this.b;
        Log.d("com.oney.WebRTCModule.b", "configureDevicesForCurrentMode => " + this.d);
        EnumC0189b enumC0189b = this.d;
        if (enumC0189b == EnumC0189b.d) {
            return;
        }
        if (enumC0189b == EnumC0189b.a) {
            audioManager.setMode(0);
            dVar.b("WIRED_OR_EARPIECE");
            return;
        }
        audioManager.setMode(3);
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        if (Arrays.stream(devices).anyMatch(new fd3())) {
            bVar = d.b.a;
        } else {
            bVar = (!Arrays.stream(devices).anyMatch(new gd3()) && this.d == EnumC0189b.b) ? d.b.b : d.b.c;
        }
        Log.d("com.oney.WebRTCModule.b", "configureDevicesForCurrentMode: preferring audio route " + bVar);
        dVar.b(bVar.toString());
    }

    public final void b() {
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(this).build();
        this.f = audioFocusRequestBuild;
        this.b.requestAudioFocus(audioFocusRequestBuild);
    }

    public final void c(EnumC0189b enumC0189b) {
        a aVar = this.V;
        AudioManager audioManager = this.b;
        Log.d("com.oney.WebRTCModule.b", "transitionToCurrentMode: " + this.d);
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            audioManager.unregisterAudioDeviceCallback(aVar);
            Log.d("com.oney.WebRTCModule.b", "abandonAudioFocus");
            AudioFocusRequest audioFocusRequest = this.f;
            if (audioFocusRequest == null) {
                Log.d("com.oney.WebRTCModule.b", "abandonAudioFocus: expected audioFocusRequest to exist");
            } else {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
            a();
            return;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            if (enumC0189b == EnumC0189b.b || enumC0189b == EnumC0189b.c || enumC0189b == EnumC0189b.d) {
                a();
                return;
            }
            a();
            b();
            audioManager.registerAudioDeviceCallback(aVar, null);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.e.execute(new Runnable() { // from class: dd3
            @Override // java.lang.Runnable
            public final void run() {
                b bVar = this.a;
                DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = bVar.c;
                int i2 = i;
                if (i2 != -3 && i2 != -2 && i2 != -1) {
                    if (i2 != 1) {
                        return;
                    }
                    Log.d("com.oney.WebRTCModule.b", "onAudioFocusChange: GAIN");
                    bVar.a();
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("hasFocus", true);
                    rCTDeviceEventEmitter.emit("EventAudioFocusChange", writableMapCreateMap);
                    return;
                }
                Log.d("com.oney.WebRTCModule.b", "onAudioFocusChange: LOSS " + i2);
                int mode = bVar.b.getMode();
                if (2 == mode || 1 == mode) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putBoolean("hasFocus", false);
                    rCTDeviceEventEmitter.emit("EventAudioFocusChange", writableMapCreateMap2);
                }
            }
        });
    }
}
