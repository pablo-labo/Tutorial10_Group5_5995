package defpackage;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.media3.exoplayer.l;
import defpackage.og9;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tx0 {
    public final Context a;
    public final jl3 b;
    public final Handler c;
    public final a d;
    public final c e;
    public final b f;
    public sx0 g;
    public ux0 h;
    public ox0 i;
    public boolean j;

    public final class a extends AudioDeviceCallback {
        public a() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            tx0 tx0Var = tx0.this;
            tx0Var.a(sx0.b(tx0Var.a, tx0Var.i, tx0Var.h));
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            tx0 tx0Var = tx0.this;
            if (vjg.l(tx0Var.h, audioDeviceInfoArr)) {
                tx0Var.h = null;
            }
            tx0Var.a(sx0.b(tx0Var.a, tx0Var.i, tx0Var.h));
        }
    }

    public final class b extends ContentObserver {
        public final ContentResolver a;
        public final Uri b;

        public b(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.a = contentResolver;
            this.b = uri;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            tx0 tx0Var = tx0.this;
            tx0Var.a(sx0.b(tx0Var.a, tx0Var.i, tx0Var.h));
        }
    }

    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            tx0 tx0Var = tx0.this;
            tx0Var.a(sx0.c(context, intent, tx0Var.i, tx0Var.h));
        }
    }

    public tx0(Context context, jl3 jl3Var, ox0 ox0Var, ux0 ux0Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = jl3Var;
        this.i = ox0Var;
        this.h = ux0Var;
        String str = vjg.a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.c = handler;
        this.d = new a();
        this.e = new c();
        sx0 sx0Var = sx0.c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f = uriFor != null ? new b(handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(sx0 sx0Var) {
        l.a aVar;
        if (!this.j || sx0Var.equals(this.g)) {
            return;
        }
        this.g = sx0Var;
        ll3 ll3Var = (ll3) this.b.b;
        Looper looperMyLooper = Looper.myLooper();
        boolean z = ll3Var.f0 == looperMyLooper;
        StringBuilder sb = new StringBuilder("Current looper (");
        sb.append(looperMyLooper == null ? "null" : looperMyLooper.getThread().getName());
        sb.append(") is not the playback looper (");
        Looper looper = ll3Var.f0;
        sb.append(looper == null ? "null" : looper.getThread().getName());
        sb.append(")");
        ka2.p(sb.toString(), z);
        sx0 sx0Var2 = ll3Var.x;
        if (sx0Var2 == null || sx0Var.equals(sx0Var2)) {
            return;
        }
        ll3Var.x = sx0Var;
        og9.a aVar2 = ll3Var.s;
        if (aVar2 != null) {
            og9 og9Var = og9.this;
            synchronized (og9Var.a) {
                aVar = og9Var.g0;
            }
            if (aVar != null) {
                hr3 hr3Var = (hr3) aVar;
                synchronized (hr3Var.c) {
                    hr3Var.f.getClass();
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        ux0 ux0Var = this.h;
        if (Objects.equals(audioDeviceInfo, ux0Var == null ? null : (AudioDeviceInfo) ux0Var.b)) {
            return;
        }
        ux0 ux0Var2 = audioDeviceInfo != null ? new ux0(audioDeviceInfo, 0) : null;
        this.h = ux0Var2;
        a(sx0.b(this.a, this.i, ux0Var2));
    }
}
