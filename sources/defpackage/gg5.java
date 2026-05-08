package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.d;
import androidx.media3.ui.PlayerView;
import defpackage.gdb;
import expo.modules.video.enums.ContentFit;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class gg5 implements gdb.c {
    public final c00 a;
    public final o91 b;
    public final WeakReference<ExoPlayer> c;
    public boolean d;
    public boolean e;

    public gg5(d dVar, c00 c00Var, o91 o91Var) {
        c00Var.getClass();
        this.a = c00Var;
        this.b = o91Var;
        this.c = new WeakReference<>(dVar);
        dVar.m.a(this);
    }

    @Override // gdb.c
    public final void H() throws Exception {
        if (!x()) {
            this.d = true;
            return;
        }
        if (!this.e) {
            this.b.invoke();
        }
        this.d = false;
        this.e = true;
    }

    @Override // gdb.c
    public final void Q(int i, int i2) throws Exception {
        if (x() && this.d) {
            if (!this.e) {
                this.b.invoke();
            }
            this.d = false;
            this.e = true;
        }
    }

    @Override // gdb.c
    public final void X(int i, ij9 ij9Var) {
        this.e = false;
    }

    public final boolean x() {
        PlayerView playerView;
        ExoPlayer exoPlayer = this.c.get();
        if (exoPlayer == null || (playerView = (PlayerView) ((WeakReference) this.a.a).get()) == null) {
            return false;
        }
        int i = exoPlayer.N0().a;
        int i2 = exoPlayer.N0().b;
        int i3 = exoPlayer.d0().a;
        int i4 = exoPlayer.d0().b;
        float f = exoPlayer.d0().c;
        if (i == 0 || i2 == 0) {
            return false;
        }
        return ((double) Math.abs(((((float) i3) / ((float) i4)) * f) - (i / i2))) < 0.05d || (playerView.getResizeMode() == ContentFit.FILL.toResizeMode()) || (i3 == 0 || i4 == 0);
    }
}
