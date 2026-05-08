package defpackage;

import androidx.media3.common.a;
import defpackage.vuf;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class de4 implements jp4 {
    public final List<vuf.a> a;
    public final zpf[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = -9223372036854775807L;

    public de4(List list) {
        this.a = list;
        this.b = new zpf[list.size()];
    }

    @Override // defpackage.jp4
    public final void a(g4b g4bVar) {
        boolean z;
        boolean z2;
        if (this.c) {
            if (this.d == 2) {
                if (g4bVar.a() == 0) {
                    z2 = false;
                } else {
                    if (g4bVar.x() != 32) {
                        this.c = false;
                    }
                    this.d--;
                    z2 = this.c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.d == 1) {
                if (g4bVar.a() == 0) {
                    z = false;
                } else {
                    if (g4bVar.x() != 0) {
                        this.c = false;
                    }
                    this.d--;
                    z = this.c;
                }
                if (!z) {
                    return;
                }
            }
            int i = g4bVar.b;
            int iA = g4bVar.a();
            for (zpf zpfVar : this.b) {
                g4bVar.J(i);
                zpfVar.f(iA, g4bVar);
            }
            this.e += iA;
        }
    }

    @Override // defpackage.jp4
    public final void c() {
        this.c = false;
        this.f = -9223372036854775807L;
    }

    @Override // defpackage.jp4
    public final void d(boolean z) {
        if (this.c) {
            ka2.q(this.f != -9223372036854775807L);
            for (zpf zpfVar : this.b) {
                zpfVar.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // defpackage.jp4
    public final void e(o55 o55Var, vuf.c cVar) {
        int i = 0;
        while (true) {
            zpf[] zpfVarArr = this.b;
            if (i >= zpfVarArr.length) {
                return;
            }
            vuf.a aVar = this.a.get(i);
            cVar.a();
            cVar.b();
            zpf zpfVarO = o55Var.o(cVar.d, 3);
            a.C0036a c0036a = new a.C0036a();
            cVar.b();
            c0036a.a = cVar.e;
            c0036a.l = st9.p("video/mp2t");
            c0036a.m = st9.p("application/dvbsubs");
            c0036a.p = Collections.singletonList(aVar.b);
            c0036a.d = aVar.a;
            t40.n(c0036a, zpfVarO);
            zpfVarArr[i] = zpfVarO;
            i++;
        }
    }

    @Override // defpackage.jp4
    public final void f(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = j;
        this.e = 0;
        this.d = 2;
    }
}
