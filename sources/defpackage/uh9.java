package defpackage;

import androidx.media3.session.g;
import androidx.media3.session.k;
import androidx.media3.session.l;
import androidx.media3.session.r;
import androidx.media3.session.t;
import androidx.media3.session.z;
import androidx.media3.ui.PlayerView;
import defpackage.gdb;
import defpackage.lz8;
import expo.modules.video.VideoView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uh9 implements lz8.a, k.c, t.g, v84, PlayerView.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uh9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.session.t.g
    public void d(r.d dVar) {
        ((t) this.b).g.t.stop();
    }

    @Override // androidx.media3.ui.PlayerView.d
    public void e(boolean z) {
        ((VideoView) this.b).enterFullscreen();
    }

    @Override // defpackage.v84
    public double f(double d) {
        hrf hrfVar = (hrf) this.b;
        double d2 = hrfVar.b;
        double d3 = hrfVar.c;
        double d4 = hrfVar.d;
        return d >= hrfVar.e * d4 ? (Math.pow(d, 1.0d / hrfVar.a) - d3) / d2 : d / d4;
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        gVar.r(((k) this.b).c, i);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((gdb.c) obj).b0(((z) obj2).p);
                break;
            default:
                ((gdb.c) obj).S(((l.c) obj2).a.o);
                break;
        }
    }
}
