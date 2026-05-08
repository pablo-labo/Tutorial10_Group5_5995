package defpackage;

import android.view.Surface;
import androidx.media3.session.g;
import androidx.media3.session.k;
import androidx.media3.session.x;
import defpackage.dqf;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hi9 implements k.c, wq2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hi9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        x xVar = (x) this.a;
        dqf dqfVarB = (dqf) this.b;
        vdb vdbVar = (vdb) obj;
        f47<wpf, cqf> f47Var = dqfVarB.D;
        if (!f47Var.isEmpty()) {
            dqf.b bVarC = dqfVarB.a().c();
            r6g<cqf> it = f47Var.values().iterator();
            while (it.hasNext()) {
                cqf next = it.next();
                wpf wpfVar = (wpf) xVar.e.W.get(next.a.b);
                if (wpfVar == null || next.a.a != wpfVar.a) {
                    bVarC.a(next);
                } else {
                    bVarC.a(new cqf(wpfVar, next.b));
                }
            }
            dqfVarB = bVarC.b();
        }
        vdbVar.v(dqfVarB);
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        k kVar = (k) this.a;
        gVar.x0(kVar.c, i, (Surface) this.b);
    }
}
