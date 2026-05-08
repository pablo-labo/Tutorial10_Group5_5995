package defpackage;

import android.media.metrics.PlaybackMetrics;
import android.util.Pair;
import androidx.appcompat.app.d;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gj0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                d.c cVar = (d.c) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    cVar.a();
                }
            case 1:
                d.a aVar = ((ry0) obj2).b;
                String str = vjg.a;
                androidx.media3.exoplayer.d.this.s.w((sy0) obj);
                return;
            case 2:
                ((rj9) obj2).d.reportPlaybackMetrics((PlaybackMetrics) obj);
                return;
            default:
                Pair pair = (Pair) obj;
                ((i.a) obj2).b.h.F(((Integer) pair.first).intValue(), (h.b) pair.second);
                return;
        }
    }
}
