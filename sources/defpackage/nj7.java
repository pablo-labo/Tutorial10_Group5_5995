package defpackage;

import android.os.Handler;
import android.os.Looper;
import expo.modules.video.player.VideoPlayer;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class nj7 {
    public static final /* synthetic */ qf8<Object>[] e = {fwc.a.e(new w3a(nj7.class, "interval", "getInterval()J", 0))};
    public final WeakReference<oj7> a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final i07 c = new i07(0L, new pe(this, 3));
    public boolean d;

    public nj7(VideoPlayer videoPlayer) {
        this.a = new WeakReference<>(videoPlayer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a() {
        qf8<Object> qf8Var = e[0];
        i07 i07Var = this.c;
        i07Var.getClass();
        qf8Var.getClass();
        return ((Number) i07Var.a).longValue();
    }

    public final void b() {
        if (a() <= 0) {
            return;
        }
        this.b.postDelayed(new z84(new nj(this, 14), 2), a());
    }
}
