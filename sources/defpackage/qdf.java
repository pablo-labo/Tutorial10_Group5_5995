package defpackage;

import defpackage.le0;
import defpackage.pn5;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qdf {
    public final le0 a;
    public final tjf b;
    public final boolean e;
    public final iy3 g;
    public final pn5.a h;
    public r1a j;
    public vl8 k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;
    public final List<le0.c<sab>> i = zr4.a;

    public qdf(le0 le0Var, tjf tjfVar, boolean z, iy3 iy3Var, pn5.a aVar, int i) {
        this.a = le0Var;
        this.b = tjfVar;
        this.e = z;
        this.g = iy3Var;
        this.h = aVar;
    }

    public final void a(vl8 vl8Var) {
        r1a r1aVar = this.j;
        if (r1aVar == null || vl8Var != this.k || r1aVar.a()) {
            this.k = vl8Var;
            r1aVar = new r1a(this.a, web.y(this.b, vl8Var), this.i, this.g, this.h);
        }
        this.j = r1aVar;
    }
}
