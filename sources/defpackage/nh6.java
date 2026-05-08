package defpackage;

import defpackage.ry3;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nh6 extends ezg {
    @Override // defpackage.ezg, defpackage.ny3
    public final void a(ny3 ny3Var) {
        n81 n81Var = (n81) this.b;
        int i = n81Var.s0;
        ry3 ry3Var = this.h;
        Iterator it = ry3Var.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((ry3) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            ry3Var.d(i3 + n81Var.u0);
        } else {
            ry3Var.d(i2 + n81Var.u0);
        }
    }

    @Override // defpackage.ezg
    public final void d() {
        gq2 gq2Var = this.b;
        if (gq2Var instanceof n81) {
            ry3 ry3Var = this.h;
            ry3Var.b = true;
            ArrayList arrayList = ry3Var.l;
            n81 n81Var = (n81) gq2Var;
            int i = n81Var.s0;
            boolean z = n81Var.t0;
            int i2 = 0;
            if (i == 0) {
                ry3Var.e = ry3.a.d;
                while (i2 < n81Var.r0) {
                    gq2 gq2Var2 = n81Var.q0[i2];
                    if (z || gq2Var2.h0 != 8) {
                        ry3 ry3Var2 = gq2Var2.d.h;
                        ry3Var2.k.add(ry3Var);
                        arrayList.add(ry3Var2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                ry3Var.e = ry3.a.e;
                while (i2 < n81Var.r0) {
                    gq2 gq2Var3 = n81Var.q0[i2];
                    if (z || gq2Var3.h0 != 8) {
                        ry3 ry3Var3 = gq2Var3.d.i;
                        ry3Var3.k.add(ry3Var);
                        arrayList.add(ry3Var3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                ry3Var.e = ry3.a.f;
                while (i2 < n81Var.r0) {
                    gq2 gq2Var4 = n81Var.q0[i2];
                    if (z || gq2Var4.h0 != 8) {
                        ry3 ry3Var4 = gq2Var4.e.h;
                        ry3Var4.k.add(ry3Var);
                        arrayList.add(ry3Var4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            ry3Var.e = ry3.a.V;
            while (i2 < n81Var.r0) {
                gq2 gq2Var5 = n81Var.q0[i2];
                if (z || gq2Var5.h0 != 8) {
                    ry3 ry3Var5 = gq2Var5.e.i;
                    ry3Var5.k.add(ry3Var);
                    arrayList.add(ry3Var5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.ezg
    public final void e() {
        gq2 gq2Var = this.b;
        if (gq2Var instanceof n81) {
            int i = ((n81) gq2Var).s0;
            ry3 ry3Var = this.h;
            if (i == 0 || i == 1) {
                gq2Var.Z = ry3Var.g;
            } else {
                gq2Var.a0 = ry3Var.g;
            }
        }
    }

    @Override // defpackage.ezg
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.ezg
    public final boolean k() {
        return false;
    }

    public final void m(ry3 ry3Var) {
        ry3 ry3Var2 = this.h;
        ry3Var2.k.add(ry3Var);
        ry3Var.l.add(ry3Var2);
    }
}
