package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.SparseBooleanArray;
import androidx.media3.exoplayer.d;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.t;
import androidx.media3.session.y;
import defpackage.sdb;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m35 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m35(Context context, boolean z, d dVar, sdb sdbVar) {
        this.c = context;
        this.b = z;
        this.d = dVar;
        this.e = sdbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                boolean z = this.b;
                d dVar = (d) this.d;
                sdb sdbVar = (sdb) this.e;
                rj9 rj9VarP = rj9.p(context);
                if (rj9VarP == null) {
                    zkd.T("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    dVar.s.g0(rj9VarP);
                }
                LogSessionId logSessionIdR = rj9VarP.r();
                synchronized (sdbVar) {
                    sdb.a aVar = sdbVar.b;
                    aVar.getClass();
                    aVar.a(logSessionIdR);
                }
                return;
            default:
                t.a aVar2 = (t.a) this.c;
                r.e eVar = (r.e) this.d;
                boolean z2 = this.b;
                r.d dVar2 = (r.d) this.e;
                s sVar = t.this.g;
                vdb vdbVar = sVar.t;
                y.f(vdbVar, eVar);
                int iB = vdbVar.b();
                if (iB == 1) {
                    if (vdbVar.O0(2)) {
                        vdbVar.f();
                    }
                } else if (iB == 4 && vdbVar.O0(4)) {
                    vdbVar.q();
                }
                if (z2 && vdbVar.O0(1)) {
                    vdbVar.u0();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i : new int[]{31, 2}) {
                    ka2.q(!false);
                    sparseBooleanArray.append(i, true);
                }
                if (z2) {
                    ka2.q(!false);
                    sparseBooleanArray.append(1, true);
                }
                ka2.q(!false);
                sVar.s(dVar2);
                return;
        }
    }

    public /* synthetic */ m35(t.a aVar, r.e eVar, boolean z, r.d dVar) {
        this.c = aVar;
        this.d = eVar;
        this.b = z;
        this.e = dVar;
    }
}
