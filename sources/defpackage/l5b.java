package defpackage;

import androidx.media3.common.a;
import defpackage.vuf;

/* JADX INFO: loaded from: classes.dex */
public final class l5b implements wxd {
    public a a;
    public qmf b;
    public zpf c;

    public l5b(String str) {
        a.C0036a c0036a = new a.C0036a();
        c0036a.l = st9.p("video/mp2t");
        c0036a.m = st9.p(str);
        this.a = new a(c0036a);
    }

    @Override // defpackage.wxd
    public final void a(g4b g4bVar) {
        long jD;
        long j;
        ka2.r(this.b);
        String str = vjg.a;
        qmf qmfVar = this.b;
        synchronized (qmfVar) {
            try {
                long j2 = qmfVar.c;
                jD = j2 != -9223372036854775807L ? j2 + qmfVar.b : qmfVar.d();
            } finally {
            }
        }
        qmf qmfVar2 = this.b;
        synchronized (qmfVar2) {
            j = qmfVar2.b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        a aVar = this.a;
        if (j != aVar.s) {
            a.C0036a c0036aA = aVar.a();
            c0036aA.r = j;
            a aVar2 = new a(c0036aA);
            this.a = aVar2;
            this.c.d(aVar2);
        }
        int iA = g4bVar.a();
        this.c.f(iA, g4bVar);
        this.c.a(jD, 1, iA, 0, null);
    }

    @Override // defpackage.wxd
    public final void b(qmf qmfVar, o55 o55Var, vuf.c cVar) {
        this.b = qmfVar;
        cVar.a();
        cVar.b();
        zpf zpfVarO = o55Var.o(cVar.d, 5);
        this.c = zpfVarO;
        zpfVarO.d(this.a);
    }
}
