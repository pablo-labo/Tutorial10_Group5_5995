package defpackage;

import defpackage.gdb;
import expo.modules.video.player.VideoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class iog implements gdb.c {
    public final /* synthetic */ log a;

    public iog(log logVar) {
        this.a = logVar;
    }

    @Override // gdb.c
    public final void s(int i) {
        VideoPlayer videoPlayer = this.a.b.get();
        if (videoPlayer == null) {
            return;
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                if (videoPlayer.X.W()) {
                    yng.a.getClass();
                    yng.f.add(videoPlayer);
                    yng.a();
                    return;
                }
                return;
            }
            if (i != 4) {
                return;
            }
        }
        yng.a.getClass();
        yng.f.add(videoPlayer);
        yng.a();
    }

    @Override // gdb.c
    public final void v0(boolean z) {
        VideoPlayer videoPlayer = this.a.b.get();
        if (videoPlayer == null) {
            return;
        }
        if (z) {
            yng.a.getClass();
            yng.f.add(videoPlayer);
            yng.a();
        } else {
            yng.a.getClass();
            yng.f.remove(videoPlayer);
            yng.a();
        }
    }
}
