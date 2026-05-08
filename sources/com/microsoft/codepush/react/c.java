package com.microsoft.codepush.react;

import android.view.Choreographer;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.a;
import com.microsoft.codepush.react.CodePushNativeModule;
import defpackage.d94;
import defpackage.r6;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public boolean a = false;
    public d94 b = null;
    public final /* synthetic */ CodePushNativeModule.b c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.microsoft.codepush.react.c$a$a, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC0188a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0188a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                c cVar = c.this;
                d94 d94Var = cVar.b;
                if (d94Var.a != d94Var.b) {
                    cVar.b();
                }
                cVar.a = false;
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.facebook.react.modules.core.a aVar = com.facebook.react.modules.core.a.f;
            if (aVar == null) {
                r6.g("ReactChoreographer needs to be initialized.");
            } else {
                aVar.b(a.EnumC0132a.c, new ChoreographerFrameCallbackC0188a());
            }
        }
    }

    public c(CodePushNativeModule.b bVar) {
        this.c = bVar;
    }

    public final void a(d94 d94Var) {
        CodePushNativeModule.b bVar = this.c;
        if (bVar.b) {
            this.b = d94Var;
            if (d94Var.a == d94Var.b) {
                b();
            } else {
                if (this.a) {
                    return;
                }
                this.a = true;
                CodePushNativeModule.this.getReactApplicationContext().runOnUiQueueThread(new a());
            }
        }
    }

    public final void b() {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) CodePushNativeModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        d94 d94Var = this.b;
        long j = d94Var.b;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        long j2 = d94Var.a;
        if (j2 < 2147483647L) {
            writableNativeMap.putInt("totalBytes", (int) j2);
            writableNativeMap.putInt("receivedBytes", (int) j);
        } else {
            writableNativeMap.putDouble("totalBytes", j2);
            writableNativeMap.putDouble("receivedBytes", j);
        }
        rCTDeviceEventEmitter.emit("CodePushDownloadProgress", writableNativeMap);
    }
}
