package defpackage;

import android.util.Pair;
import android.view.SurfaceView;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.h;
import androidx.media3.ui.PlayerView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nm9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nm9(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                ((i.a) obj3).b.h.C(((Integer) pair.first).intValue(), (h.b) pair.second, (nj9) obj);
                break;
            default:
                PlayerView.e.a((PlayerView.e) obj3, (SurfaceView) obj2, (jy1) obj);
                break;
        }
    }
}
