package defpackage;

import android.os.SystemClock;
import androidx.media3.session.l;
import androidx.media3.session.o;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.t;
import androidx.media3.session.x;
import androidx.media3.session.z;
import androidx.media3.ui.PlayerView;
import defpackage.e47;
import defpackage.gdb;
import defpackage.ij9;
import defpackage.lz8;
import defpackage.oj9;
import defpackage.v20;
import expo.modules.video.FullscreenPlayerActivity;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yk3 implements lz8.a, PlayerView.d, t.g, x.e, v84 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yk3(v20.a aVar, Object obj, long j) {
        this.a = 0;
        this.b = obj;
    }

    @Override // androidx.media3.session.t.g
    public void d(r.d dVar) {
        s sVar = ((t) this.b).g;
        if (sVar.t.T0() == null) {
            return;
        }
        zng zngVar = sVar.e;
        sVar.v(dVar);
        zngVar.getClass();
        aw5.K1(new x9e(-6));
    }

    @Override // androidx.media3.ui.PlayerView.d
    public void e(boolean z) {
        FullscreenPlayerActivity fullscreenPlayerActivity = (FullscreenPlayerActivity) this.b;
        int i = FullscreenPlayerActivity.Z;
        fullscreenPlayerActivity.finish();
    }

    @Override // defpackage.v84
    public double f(double d) {
        return ((abd) this.b).n.f(nic.A(d, r8.e, r8.f));
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        kj9 kj9Var = (kj9) this.b;
        o oVar = (o) sVar;
        oVar.getClass();
        if (kj9Var == null || !kj9Var.b || !s.l(dVar)) {
            oVar.v(dVar);
            throw null;
        }
        if (oVar.h.m == null) {
            return aw5.K1(wu8.b(-6));
        }
        ij9.b.a aVar = new ij9.b.a();
        ryc rycVar = ryc.V;
        e47.b bVar = e47.b;
        qyc qycVar = qyc.e;
        List list = Collections.EMPTY_LIST;
        qyc qycVar2 = qyc.e;
        ij9.e.a aVar2 = new ij9.e.a();
        ij9.g gVar = ij9.g.d;
        oj9.a aVar3 = new oj9.a();
        aVar3.q = Boolean.TRUE;
        aVar3.r = Boolean.FALSE;
        ij9 ij9Var = new ij9("androidx.media3.session.recent.root", new ij9.c(aVar), null, new ij9.e(aVar2), new oj9(aVar3), gVar);
        wu8.c(ij9Var);
        return aw5.K1(new wu8(0, SystemClock.elapsedRealtime(), kj9Var, null, ij9Var, 2));
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((v20) obj).getClass();
                break;
            case 1:
                ((gdb.c) obj).a((tog) obj2);
                break;
            case 2:
            default:
                ((gdb.c) obj).s(((l.c) obj2).a.y);
                break;
            case 3:
                ((gdb.c) obj).n(((z) obj2).x);
                break;
        }
    }

    public /* synthetic */ yk3(t tVar, qic qicVar) {
        this.a = 5;
        this.b = tVar;
    }

    public /* synthetic */ yk3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
