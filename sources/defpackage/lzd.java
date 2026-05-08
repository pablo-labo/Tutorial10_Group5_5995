package defpackage;

import androidx.media3.common.a;
import defpackage.vuf;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lzd {
    public final List<a> a;
    public final zpf[] b;
    public final a2d c = new a2d(new dz1(this, 8));

    public lzd(List list) {
        this.a = list;
        this.b = new zpf[list.size()];
    }

    public final void a(o55 o55Var, vuf.c cVar) {
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
            String str2 = aVar.a;
            if (str2 == null) {
                cVar.b();
                str2 = cVar.e;
            }
            a.C0036a c0036a = new a.C0036a();
            c0036a.a = str2;
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
