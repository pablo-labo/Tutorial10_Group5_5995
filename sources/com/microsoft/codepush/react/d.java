package com.microsoft.codepush.react;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.LifecycleEventListener;
import com.microsoft.codepush.react.CodePushNativeModule;
import defpackage.a92;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements LifecycleEventListener {
    public Date a = null;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final a c = new a();
    public final /* synthetic */ CodePushNativeModule.e d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            g.h("Loading bundle on suspend");
            CodePushNativeModule.this.restartAppInternal(false);
        }
    }

    public d(CodePushNativeModule.e eVar) {
        this.d = eVar;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        this.a = new Date();
        CodePushNativeModule.e eVar = this.d;
        if (eVar.b == a92.ON_NEXT_SUSPEND.a() && CodePushNativeModule.this.mSettingsManager.e(null)) {
            this.b.postDelayed(this.c, eVar.c * 1000);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() throws Throwable {
        CodePushNativeModule.e eVar = this.d;
        CodePushNativeModule codePushNativeModule = CodePushNativeModule.this;
        this.b.removeCallbacks(this.c);
        if (this.a != null) {
            long time = (new Date().getTime() - this.a.getTime()) / 1000;
            if (eVar.b == a92.IMMEDIATE.a() || time >= codePushNativeModule.mMinimumBackgroundDuration) {
                g.h("Loading bundle on resume");
                codePushNativeModule.restartAppInternal(false);
            }
        }
    }
}
