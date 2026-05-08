package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.g;
import defpackage.qog;
import defpackage.tog;

/* JADX INFO: loaded from: classes.dex */
public final class b implements VideoSink.a {
    public final /* synthetic */ c b;

    public b(c cVar) {
        this.b = cVar;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink.a
    public final void a(tog togVar) {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink.a
    public final void b() {
        k.a aVar = this.b.w0;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink.a
    public final void f() {
        c cVar = this.b;
        if (cVar.K1 != null) {
            cVar.W0(0, 1);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink.a
    public final void onFirstFrameRendered() {
        c cVar = this.b;
        Surface surface = cVar.K1;
        if (surface != null) {
            g.a aVar = cVar.w1;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new qog(aVar, surface, SystemClock.elapsedRealtime()));
            }
            cVar.N1 = true;
        }
    }
}
