package defpackage;

import expo.modules.video.player.VideoPlayer;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class log {
    public final gk0 a;
    public final WeakReference<VideoPlayer> b;
    public boolean c = true;
    public iog d;

    public log(VideoPlayer videoPlayer, gk0 gk0Var) {
        this.a = gk0Var;
        this.b = new WeakReference<>(videoPlayer);
        u63.Y(gk0Var.g, null, null, new kog(this, null), 3);
    }

    public final void a(qf8 qf8Var, boolean z) {
        qf8Var.getClass();
        gk0 gk0Var = this.a;
        if (z) {
            u63.Y(gk0Var.g, null, null, new kog(this, null), 3);
        } else {
            u63.Y(gk0Var.g, null, null, new jog(this, null), 3);
        }
        this.c = z;
    }
}
