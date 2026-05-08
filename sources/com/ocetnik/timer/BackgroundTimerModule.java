package com.ocetnik.timer;

import android.os.Handler;
import android.os.PowerManager;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: loaded from: classes3.dex */
public class BackgroundTimerModule extends ReactContextBaseJavaModule {
    private Handler handler;
    private final LifecycleEventListener listener;
    private PowerManager powerManager;
    private ReactContext reactContext;
    private Runnable runnable;
    private PowerManager.WakeLock wakeLock;

    public class a implements LifecycleEventListener {
        public a() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostDestroy() {
            BackgroundTimerModule backgroundTimerModule = BackgroundTimerModule.this;
            if (backgroundTimerModule.wakeLock.isHeld()) {
                backgroundTimerModule.wakeLock.release();
            }
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostResume() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BackgroundTimerModule backgroundTimerModule = BackgroundTimerModule.this;
            backgroundTimerModule.sendEvent(backgroundTimerModule.reactContext, "backgroundTimer");
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ int a;

        public c(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BackgroundTimerModule backgroundTimerModule = BackgroundTimerModule.this;
            if (backgroundTimerModule.getReactApplicationContext().hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) backgroundTimerModule.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("backgroundTimer.timeout", Integer.valueOf(this.a));
            }
        }
    }

    public BackgroundTimerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        a aVar = new a();
        this.listener = aVar;
        this.reactContext = reactApplicationContext;
        PowerManager powerManager = (PowerManager) getReactApplicationContext().getSystemService("power");
        this.powerManager = powerManager;
        this.wakeLock = powerManager.newWakeLock(1, "rohit_bg_wakelock");
        reactApplicationContext.addLifecycleEventListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNBackgroundTimer";
    }

    @ReactMethod
    public void setTimeout(int i, double d) {
        new Handler().postDelayed(new c(i), (long) d);
    }

    @ReactMethod
    public void start(int i) {
        if (!this.wakeLock.isHeld()) {
            this.wakeLock.acquire();
        }
        Handler handler = new Handler();
        this.handler = handler;
        b bVar = new b();
        this.runnable = bVar;
        handler.post(bVar);
    }

    @ReactMethod
    public void stop() {
        if (this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.runnable);
        }
    }
}
