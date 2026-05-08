package defpackage;

import defpackage.pn5;

/* JADX INFO: loaded from: classes.dex */
public final class qn5 implements pn5.a {
    public final o70 a;
    public final q70 b;
    public final kt1 c;
    public final xn5 d;
    public final pbb e;
    public final pq f;

    public qn5(o70 o70Var, q70 q70Var) {
        kt1 kt1Var = rn5.a;
        xn5 xn5Var = new xn5(rn5.b);
        pbb pbbVar = new pbb();
        this.a = o70Var;
        this.b = q70Var;
        this.c = kt1Var;
        this.d = xn5Var;
        this.e = pbbVar;
        this.f = new pq(this, 7);
    }

    @Override // pn5.a
    public final hzf a(pn5 pn5Var, to5 to5Var, int i, int i2) {
        q70 q70Var = this.b;
        q70Var.getClass();
        int i3 = q70Var.a;
        to5 to5Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? to5Var : new to5(nic.C(to5Var.a + i3, 1, 1000));
        this.a.getClass();
        return b(new gzf(pn5Var, to5Var2, i, i2, null));
    }

    public final hzf b(gzf gzfVar) {
        kt1 kt1Var = this.c;
        yc1 yc1Var = new yc1(5, this, gzfVar);
        synchronized (((awd) kt1Var.a)) {
            hzf hzfVar = (hzf) ((a89) kt1Var.b).b(gzfVar);
            if (hzfVar != null) {
                if (hzfVar.f()) {
                    return hzfVar;
                }
            }
            try {
                hzf hzfVar2 = (hzf) yc1Var.invoke(new ly(3, kt1Var, gzfVar));
                synchronized (((awd) kt1Var.a)) {
                    try {
                        if (((a89) kt1Var.b).b(gzfVar) == null && hzfVar2.f()) {
                            ((a89) kt1Var.b).c(gzfVar, hzfVar2);
                        }
                        j6g j6gVar = j6g.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return hzfVar2;
            } catch (Exception e) {
                ja.m("Could not load font", e);
                return null;
            }
        }
    }
}
