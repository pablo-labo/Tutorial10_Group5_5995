package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import expo.modules.kotlin.exception.Exceptions$AppContextLost;
import expo.modules.video.player.VideoPlayer;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class edb implements ServiceConnection {
    public final WeakReference<VideoPlayer> a;
    public ddb b;
    public boolean c;
    public final WeakReference<gk0> d;

    public edb(gk0 gk0Var, WeakReference weakReference) {
        this.a = weakReference;
        this.d = new WeakReference<>(gk0Var);
    }

    public final gk0 a() throws Exceptions$AppContextLost {
        gk0 gk0Var = this.d.get();
        if (gk0Var != null) {
            return gk0Var;
        }
        throw new Exceptions$AppContextLost();
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.c = false;
        d49 d49Var = (d49) a().l.getValue();
        if (d49Var != null) {
            d49Var.a(o39.Error, "Expo-video has lost connection to the playback service binder. This will cause issues with now playing notification and sustaining background playback.", null);
        }
        super.onBindingDied(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        componentName.getClass();
        this.c = false;
        d49 d49Var = (d49) a().l.getValue();
        if (d49Var != null) {
            d49Var.a(o39.Error, pyd.w("Expo Video could not bind to the playback service"), null);
        }
        super.onNullBinding(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Exceptions$AppContextLost {
        componentName.getClass();
        iBinder.getClass();
        VideoPlayer videoPlayer = this.a.get();
        if (videoPlayer == null) {
            return;
        }
        ddb ddbVar = iBinder instanceof ddb ? (ddb) iBinder : null;
        if (ddbVar == null) {
            d49 d49Var = (d49) a().l.getValue();
            if (d49Var != null) {
                d49Var.a(o39.Error, pyd.w("Expo-video could not bind to the playback service"), null);
                return;
            }
            return;
        }
        i45 i45Var = ddbVar.a;
        this.c = true;
        this.b = ddbVar;
        gk0 gk0VarA = a();
        i45Var.getClass();
        i45Var.V = new WeakReference<>(gk0VarA);
        u63.Y(i45Var.k().g, null, null, new j45(videoPlayer, i45Var, null), 3);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.b = null;
        this.c = false;
    }
}
