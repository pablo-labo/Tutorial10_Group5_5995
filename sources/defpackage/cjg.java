package defpackage;

import androidx.media3.common.a;
import defpackage.vuf;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cjg {
    public final List<a> a;
    public final zpf[] b;
    public final a2d c;

    public cjg(List list) {
        this.a = list;
        this.b = new zpf[list.size()];
        a2d a2dVar = new a2d(new g35(this));
        this.c = a2dVar;
        a2dVar.c(3);
    }

    public final void a(long j, g4b g4bVar) {
        if (g4bVar.a() < 9) {
            return;
        }
        int iJ = g4bVar.j();
        int iJ2 = g4bVar.j();
        int iX = g4bVar.x();
        if (iJ == 434 && iJ2 == 1195456820 && iX == 3) {
            this.c.a(j, g4bVar);
        }
    }

    public final void b(o55 o55Var, vuf.c cVar) {
        int i = 0;
        while (true) {
            zpf[] zpfVarArr = this.b;
            if (i >= zpfVarArr.length) {
                return;
            }
            cVar.a();
            cVar.b();
            zpf zpfVarO = o55Var.o(cVar.d, 3);
            a aVar = this.a.get(i);
            String str = aVar.n;
            ka2.k("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            a.C0036a c0036a = new a.C0036a();
            cVar.b();
            c0036a.a = cVar.e;
            c0036a.l = st9.p("video/mp2t");
            c0036a.m = st9.p(str);
            c0036a.e = aVar.e;
            c0036a.d = aVar.d;
            c0036a.J = aVar.K;
            c0036a.p = aVar.q;
            t40.n(c0036a, zpfVarO);
            zpfVarArr[i] = zpfVarO;
            i++;
        }
    }
}
