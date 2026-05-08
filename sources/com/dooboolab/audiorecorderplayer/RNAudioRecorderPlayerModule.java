package com.dooboolab.audiorecorderplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.dooboolab.audiorecorderplayer.RNAudioRecorderPlayerModule;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import defpackage.fbc;
import defpackage.g8b;
import defpackage.ot2;
import defpackage.u63;
import defpackage.w7;
import defpackage.wl7;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001aB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001f\u0010 J)\u0010\"\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b$\u0010\u0016J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b%\u0010\u0016J\u001f\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b'\u0010\u001cJ\u0017\u0010(\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b(\u0010\u0016J\u001f\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b*\u0010\u001cJ-\u00101\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0-2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0012H\u0016¢\u0006\u0004\b5\u00104J\u000f\u00106\u001a\u00020\u0012H\u0016¢\u0006\u0004\b6\u00104J\u000f\u00107\u001a\u00020\u0012H\u0004¢\u0006\u0004\b7\u00104J)\u0010<\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u0002082\u0006\u00109\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0012H\u0002¢\u0006\u0004\b>\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0016\u0010@\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010WR$\u0010Z\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_¨\u0006b"}, d2 = {"Lcom/dooboolab/audiorecorderplayer/RNAudioRecorderPlayerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lg8b;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "path", "Lcom/facebook/react/bridge/ReadableMap;", "audioSet", "", "meteringEnabled", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "startRecorder", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;ZLcom/facebook/react/bridge/Promise;)V", "resumeRecorder", "(Lcom/facebook/react/bridge/Promise;)V", "pauseRecorder", "stopRecorder", "", "volume", "setVolume", "(DLcom/facebook/react/bridge/Promise;)V", "", "playbackSpeed", "setPlaybackSpeed", "(FLcom/facebook/react/bridge/Promise;)V", "httpHeaders", "startPlayer", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "resumePlayer", "pausePlayer", "time", "seekToPlayer", "stopPlayer", "sec", "setSubscriptionDuration", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)Z", "onHostDestroy", "()V", "onHostPause", "onHostResume", "finalize", "Lcom/facebook/react/bridge/ReactContext;", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "sendEvent", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "autoSaveRecordingIfNeeded", "Lcom/facebook/react/bridge/ReactApplicationContext;", "audioFileURL", "Ljava/lang/String;", "subsDurationMillis", "I", "_meteringEnabled", "Z", "Landroid/media/MediaRecorder;", "mediaRecorder", "Landroid/media/MediaRecorder;", "Landroid/media/MediaPlayer;", "mediaPlayer", "Landroid/media/MediaPlayer;", "Ljava/lang/Runnable;", "recorderRunnable", "Ljava/lang/Runnable;", "Ljava/util/TimerTask;", "mTask", "Ljava/util/TimerTask;", "Ljava/util/Timer;", "mTimer", "Ljava/util/Timer;", "", "pausedRecordTime", "J", "totalPausedRecordTime", "Landroid/os/Handler;", "recordHandler", "Landroid/os/Handler;", "getRecordHandler", "()Landroid/os/Handler;", "setRecordHandler", "(Landroid/os/Handler;)V", "Companion", "a", "react-native-audio-recorder-player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNAudioRecorderPlayerModule extends ReactContextBaseJavaModule implements g8b, LifecycleEventListener {
    private static List<String> defaultFileExtensions = u63.a0("mp4", "3gp", "mp4", "amr", "amr", "aac", "aac", "rtp", "ts", "webm", "xxx", "ogg");
    private static String defaultFileName = "sound.mp4";
    private static String tag = "RNAudioRecorderPlayer";
    private boolean _meteringEnabled;
    private String audioFileURL;
    private TimerTask mTask;
    private Timer mTimer;
    private MediaPlayer mediaPlayer;
    private MediaRecorder mediaRecorder;
    private long pausedRecordTime;
    private final ReactApplicationContext reactContext;
    private Handler recordHandler;
    private Runnable recorderRunnable;
    private int subsDurationMillis;
    private long totalPausedRecordTime;

    public static final class b extends TimerTask {
        public final /* synthetic */ MediaPlayer a;
        public final /* synthetic */ RNAudioRecorderPlayerModule b;

        public b(RNAudioRecorderPlayerModule rNAudioRecorderPlayerModule, MediaPlayer mediaPlayer) {
            this.a = mediaPlayer;
            this.b = rNAudioRecorderPlayerModule;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            MediaPlayer mediaPlayer = this.a;
            try {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.getClass();
                writableMapCreateMap.putInt("duration", mediaPlayer.getDuration());
                writableMapCreateMap.putInt("currentPosition", mediaPlayer.getCurrentPosition());
                writableMapCreateMap.putBoolean("isFinished", false);
                RNAudioRecorderPlayerModule rNAudioRecorderPlayerModule = this.b;
                rNAudioRecorderPlayerModule.sendEvent(rNAudioRecorderPlayerModule.reactContext, "rn-playback", writableMapCreateMap);
            } catch (IllegalStateException e) {
                Log.e(RNAudioRecorderPlayerModule.tag, "Mediaplayer error: " + e.getMessage());
            }
        }
    }

    public static final class c implements Runnable {
        public final /* synthetic */ long a;
        public final /* synthetic */ RNAudioRecorderPlayerModule b;

        public c(long j, RNAudioRecorderPlayerModule rNAudioRecorderPlayerModule) {
            this.a = j;
            this.b = rNAudioRecorderPlayerModule;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int maxAmplitude;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.a;
            RNAudioRecorderPlayerModule rNAudioRecorderPlayerModule = this.b;
            long j = jElapsedRealtime - rNAudioRecorderPlayerModule.totalPausedRecordTime;
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            writableMapCreateMap.putDouble("currentPosition", j);
            if (rNAudioRecorderPlayerModule._meteringEnabled) {
                if (rNAudioRecorderPlayerModule.mediaRecorder != null) {
                    MediaRecorder mediaRecorder = rNAudioRecorderPlayerModule.mediaRecorder;
                    mediaRecorder.getClass();
                    maxAmplitude = mediaRecorder.getMaxAmplitude();
                } else {
                    maxAmplitude = 0;
                }
                writableMapCreateMap.putInt("currentMetering", (int) (maxAmplitude > 0 ? Math.log10(((double) maxAmplitude) / 32767.0d) * 20.0d : -160.0d));
            }
            rNAudioRecorderPlayerModule.sendEvent(rNAudioRecorderPlayerModule.reactContext, "rn-recordback", writableMapCreateMap);
            Handler recordHandler = rNAudioRecorderPlayerModule.getRecordHandler();
            recordHandler.getClass();
            recordHandler.postDelayed(this, rNAudioRecorderPlayerModule.subsDurationMillis);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAudioRecorderPlayerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
        this.audioFileURL = "";
        this.subsDurationMillis = 500;
        this.recordHandler = new Handler(Looper.getMainLooper());
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private final void autoSaveRecordingIfNeeded() {
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.getClass();
                mediaRecorder.stop();
                MediaRecorder mediaRecorder2 = this.mediaRecorder;
                mediaRecorder2.getClass();
                mediaRecorder2.release();
                this.mediaRecorder = null;
                Log.d(tag, "Recording auto-saved on app pause/destroy.");
            } catch (Exception e) {
                Log.e(tag, "Error auto-saving recording: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(ReactContext reactContext, String eventName, WritableMap params) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startPlayer$lambda$4(RNAudioRecorderPlayerModule rNAudioRecorderPlayerModule, String str, Promise promise, MediaPlayer mediaPlayer) {
        Log.d(tag, "Mediaplayer prepared and start");
        mediaPlayer.start();
        rNAudioRecorderPlayerModule.mTask = new b(rNAudioRecorderPlayerModule, mediaPlayer);
        Timer timer = new Timer();
        rNAudioRecorderPlayerModule.mTimer = timer;
        timer.schedule(rNAudioRecorderPlayerModule.mTask, 0L, rNAudioRecorderPlayerModule.subsDurationMillis);
        if (wl7.b(str, "DEFAULT")) {
            str = rNAudioRecorderPlayerModule.reactContext.getCacheDir() + "/" + defaultFileName;
        }
        promise.resolve(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startPlayer$lambda$5(RNAudioRecorderPlayerModule rNAudioRecorderPlayerModule, MediaPlayer mediaPlayer) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putInt("duration", mediaPlayer.getDuration());
        writableMapCreateMap.putInt("currentPosition", mediaPlayer.getCurrentPosition());
        writableMapCreateMap.putBoolean("isFinished", true);
        rNAudioRecorderPlayerModule.sendEvent(rNAudioRecorderPlayerModule.reactContext, "rn-playback", writableMapCreateMap);
        Log.d(tag, "Plays completed.");
        Timer timer = rNAudioRecorderPlayerModule.mTimer;
        if (timer != null) {
            timer.cancel();
        }
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        rNAudioRecorderPlayerModule.mediaPlayer = null;
    }

    public final void finalize() {
        this.reactContext.removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return tag;
    }

    public final Handler getRecordHandler() {
        return this.recordHandler;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        autoSaveRecordingIfNeeded();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // defpackage.g8b
    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        return requestCode == 200 && grantResults[0] == 0;
    }

    @ReactMethod
    public final void pausePlayer(Promise promise) {
        promise.getClass();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            promise.reject("pausePlay", "Mediaplayer is null on pause.");
            return;
        }
        try {
            mediaPlayer.pause();
            promise.resolve("pause player");
        } catch (Exception e) {
            Log.e(tag, "pausePlay exception: " + e.getMessage());
            promise.reject("pausePlay", e.getMessage());
        }
    }

    @ReactMethod
    public final void pauseRecorder(Promise promise) {
        promise.getClass();
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder == null) {
            promise.reject("pauseRecorder", "Recorder is null.");
            return;
        }
        try {
            mediaRecorder.pause();
            this.pausedRecordTime = SystemClock.elapsedRealtime();
            Runnable runnable = this.recorderRunnable;
            if (runnable != null) {
                Handler handler = this.recordHandler;
                handler.getClass();
                handler.removeCallbacks(runnable);
            }
            promise.resolve("Recorder paused.");
        } catch (Exception e) {
            Log.e(tag, "pauseRecorder exception: " + e.getMessage());
            promise.reject("pauseRecorder", e.getMessage());
        }
    }

    @ReactMethod
    public final void resumePlayer(Promise promise) {
        promise.getClass();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            promise.reject("resume", "Mediaplayer is null on resume.");
            return;
        }
        if (mediaPlayer.isPlaying()) {
            promise.reject("resume", "Mediaplayer is already running.");
            return;
        }
        try {
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            mediaPlayer2.getClass();
            MediaPlayer mediaPlayer3 = this.mediaPlayer;
            mediaPlayer3.getClass();
            mediaPlayer2.seekTo(mediaPlayer3.getCurrentPosition());
            MediaPlayer mediaPlayer4 = this.mediaPlayer;
            mediaPlayer4.getClass();
            mediaPlayer4.start();
            promise.resolve("resume player");
        } catch (Exception e) {
            Log.e(tag, "Mediaplayer resume: " + e.getMessage());
            promise.reject("resume", e.getMessage());
        }
    }

    @ReactMethod
    public final void resumeRecorder(Promise promise) {
        promise.getClass();
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder == null) {
            promise.reject("resumeRecorder", "Recorder is null.");
            return;
        }
        try {
            mediaRecorder.resume();
            this.totalPausedRecordTime = (SystemClock.elapsedRealtime() - this.pausedRecordTime) + this.totalPausedRecordTime;
            Runnable runnable = this.recorderRunnable;
            if (runnable != null) {
                Handler handler = this.recordHandler;
                handler.getClass();
                handler.postDelayed(runnable, this.subsDurationMillis);
            }
            promise.resolve("Recorder resumed.");
        } catch (Exception e) {
            Log.e(tag, "Recorder resume: " + e.getMessage());
            promise.reject("resumeRecorder", e.getMessage());
        }
    }

    @ReactMethod
    public final void seekToPlayer(double time, Promise promise) {
        promise.getClass();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            promise.reject("seekTo", "Mediaplayer is null on seek.");
        } else {
            mediaPlayer.seekTo((int) time);
            promise.resolve("pause player");
        }
    }

    @ReactMethod
    public final void setPlaybackSpeed(float playbackSpeed, Promise promise) {
        promise.getClass();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            promise.reject("setPlaybackSpeed", "player is null.");
            return;
        }
        mediaPlayer.getClass();
        mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(playbackSpeed));
        promise.resolve("setPlaybackSpeed");
    }

    public final void setRecordHandler(Handler handler) {
        this.recordHandler = handler;
    }

    @ReactMethod
    public final void setSubscriptionDuration(double sec, Promise promise) {
        promise.getClass();
        int i = (int) (sec * 1000.0d);
        this.subsDurationMillis = i;
        promise.resolve("setSubscriptionDuration: " + i);
    }

    @ReactMethod
    public final void setVolume(double volume, Promise promise) {
        promise.getClass();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            promise.reject("setVolume", "player is null.");
            return;
        }
        float f = (float) volume;
        mediaPlayer.setVolume(f, f);
        promise.resolve("set volume");
    }

    @ReactMethod
    public final void startPlayer(final String path, ReadableMap httpHeaders, final Promise promise) {
        path.getClass();
        promise.getClass();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            if (!mediaPlayer.isPlaying()) {
                MediaPlayer mediaPlayer2 = this.mediaPlayer;
                mediaPlayer2.getClass();
                if (mediaPlayer2.getCurrentPosition() > 1) {
                    MediaPlayer mediaPlayer3 = this.mediaPlayer;
                    mediaPlayer3.getClass();
                    mediaPlayer3.start();
                    promise.resolve("player resumed.");
                    return;
                }
            }
            Log.e(tag, "Player is already running. Stop it first.");
            promise.reject("startPlay", "Player is already running. Stop it first.");
            return;
        }
        this.mediaPlayer = new MediaPlayer();
        try {
            if (path.equals("DEFAULT")) {
                MediaPlayer mediaPlayer4 = this.mediaPlayer;
                mediaPlayer4.getClass();
                mediaPlayer4.setDataSource(this.reactContext.getCacheDir() + "/" + defaultFileName);
            } else if (httpHeaders != null) {
                HashMap map = new HashMap();
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = httpHeaders.keySetIterator();
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    map.put(strNextKey, httpHeaders.getString(strNextKey));
                }
                MediaPlayer mediaPlayer5 = this.mediaPlayer;
                mediaPlayer5.getClass();
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                currentActivity.getClass();
                mediaPlayer5.setDataSource(currentActivity.getApplicationContext(), Uri.parse(path), map);
            } else {
                MediaPlayer mediaPlayer6 = this.mediaPlayer;
                mediaPlayer6.getClass();
                mediaPlayer6.setDataSource(path);
            }
            MediaPlayer mediaPlayer7 = this.mediaPlayer;
            mediaPlayer7.getClass();
            mediaPlayer7.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: gbc
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer8) {
                    RNAudioRecorderPlayerModule.startPlayer$lambda$4(this.a, path, promise, mediaPlayer8);
                }
            });
            MediaPlayer mediaPlayer8 = this.mediaPlayer;
            mediaPlayer8.getClass();
            mediaPlayer8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: hbc
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer9) {
                    RNAudioRecorderPlayerModule.startPlayer$lambda$5(this.a, mediaPlayer9);
                }
            });
            MediaPlayer mediaPlayer9 = this.mediaPlayer;
            mediaPlayer9.getClass();
            mediaPlayer9.prepare();
        } catch (IOException e) {
            Log.e(tag, "startPlay() io exception");
            promise.reject("startPlay", e.getMessage());
        } catch (NullPointerException unused) {
            Log.e(tag, "startPlay() null exception");
        }
    }

    @ReactMethod
    public final void startRecorder(String path, ReadableMap audioSet, boolean meteringEnabled, Promise promise) {
        path.getClass();
        promise.getClass();
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 || (ot2.a(this.reactContext, "android.permission.RECORD_AUDIO") == 0 && ot2.a(this.reactContext, "android.permission.WRITE_EXTERNAL_STORAGE") == 0)) {
                if (ot2.a(this.reactContext, "android.permission.RECORD_AUDIO") != 0) {
                    Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                    currentActivity.getClass();
                    w7.b(currentActivity, new String[]{"android.permission.RECORD_AUDIO"}, 0);
                    promise.reject("No permission granted.", "Try again after adding permission.");
                    return;
                }
                int i2 = (audioSet == null || !audioSet.hasKey("OutputFormatAndroid")) ? 2 : audioSet.getInt("OutputFormatAndroid");
                String str = path;
                if (str.equals("DEFAULT")) {
                    str = this.reactContext.getCacheDir() + "/sound." + ((Object) defaultFileExtensions.get(i2));
                }
                this.audioFileURL = str;
                this._meteringEnabled = meteringEnabled;
                if (this.mediaRecorder != null) {
                    promise.reject("InvalidState", "startRecorder has already been called.");
                    return;
                }
                MediaRecorder mediaRecorderA = i >= 31 ? fbc.a(this.reactContext) : new MediaRecorder();
                try {
                    if (audioSet == null) {
                        mediaRecorderA.setAudioSource(1);
                        mediaRecorderA.setOutputFormat(i2);
                        mediaRecorderA.setAudioEncoder(3);
                    } else {
                        mediaRecorderA.setAudioSource(audioSet.hasKey("AudioSourceAndroid") ? audioSet.getInt("AudioSourceAndroid") : 1);
                        mediaRecorderA.setOutputFormat(i2);
                        mediaRecorderA.setAudioEncoder(audioSet.hasKey("AudioEncoderAndroid") ? audioSet.getInt("AudioEncoderAndroid") : 3);
                        if (audioSet.hasKey("AudioSamplingRateAndroid")) {
                            mediaRecorderA.setAudioSamplingRate(audioSet.getInt("AudioSamplingRateAndroid"));
                        }
                        if (audioSet.hasKey("AudioEncodingBitRateAndroid")) {
                            mediaRecorderA.setAudioEncodingBitRate(audioSet.getInt("AudioEncodingBitRateAndroid"));
                        }
                        if (audioSet.hasKey("AudioChannelsAndroid")) {
                            mediaRecorderA.setAudioChannels(audioSet.getInt("AudioChannelsAndroid"));
                        }
                    }
                    mediaRecorderA.setOutputFile(this.audioFileURL);
                    mediaRecorderA.prepare();
                    this.totalPausedRecordTime = 0L;
                    mediaRecorderA.start();
                    this.mediaRecorder = mediaRecorderA;
                    c cVar = new c(SystemClock.elapsedRealtime(), this);
                    this.recorderRunnable = cVar;
                    cVar.run();
                    promise.resolve("file:///" + this.audioFileURL);
                    return;
                } catch (Exception e) {
                    mediaRecorderA.release();
                    this.mediaRecorder = null;
                    Log.e(tag, "Exception: ", e);
                    promise.reject("startRecord", e.getMessage());
                    return;
                }
            }
            Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
            currentActivity2.getClass();
            w7.b(currentActivity2, new String[]{"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"}, 0);
            promise.reject("No permission granted.", "Try again after adding permission.");
        } catch (NullPointerException e2) {
            Log.w(tag, e2.toString());
            promise.reject("No permission granted.", "Try again after adding permission.");
        }
    }

    @ReactMethod
    public final void stopPlayer(Promise promise) {
        promise.getClass();
        Timer timer = this.mTimer;
        if (timer != null) {
            timer.cancel();
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            promise.resolve("Already stopped player");
            return;
        }
        try {
            mediaPlayer.stop();
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            mediaPlayer2.getClass();
            mediaPlayer2.reset();
            MediaPlayer mediaPlayer3 = this.mediaPlayer;
            mediaPlayer3.getClass();
            mediaPlayer3.release();
            this.mediaPlayer = null;
            promise.resolve("stopped player");
        } catch (Exception e) {
            Log.e(tag, "stopPlay exception: " + e.getMessage());
            promise.reject("stopPlay", e.getMessage());
        }
    }

    @ReactMethod
    public final void stopRecorder(Promise promise) {
        Runnable runnable;
        promise.getClass();
        Handler handler = this.recordHandler;
        if (handler != null && (runnable = this.recorderRunnable) != null) {
            handler.removeCallbacks(runnable);
        }
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder == null) {
            promise.reject("stopRecord", "recorder is null.");
            return;
        }
        try {
            mediaRecorder.stop();
            MediaRecorder mediaRecorder2 = this.mediaRecorder;
            mediaRecorder2.getClass();
            mediaRecorder2.release();
            this.mediaRecorder = null;
            promise.resolve("file:///" + this.audioFileURL);
        } catch (RuntimeException e) {
            String message = e.getMessage();
            if (message != null) {
                Log.d(tag, message);
            }
            promise.reject("stopRecord", e.getMessage());
        }
    }
}
