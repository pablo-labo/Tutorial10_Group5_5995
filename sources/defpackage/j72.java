package defpackage;

import android.view.KeyEvent;
import defpackage.hmb;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j72 extends b1 {
    public yeb z0;

    public j72() {
        throw null;
    }

    @Override // defpackage.b1, defpackage.dfb
    public final void R(neb nebVar, peb pebVar, long j) {
        j72 j72Var;
        super.R(nebVar, pebVar, j);
        int i = 0;
        if (pebVar != peb.b) {
            if (pebVar != peb.c || this.z0 == null) {
                return;
            }
            List<yeb> list = nebVar.a;
            int size = list.size();
            while (i < size) {
                yeb yebVar = list.get(i);
                if (yebVar.b() && yebVar != this.z0) {
                    this.z0 = null;
                    j2();
                    return;
                }
                i++;
            }
            return;
        }
        yeb yebVar2 = this.z0;
        if (yebVar2 == null) {
            if (i8f.f(nebVar, true, false)) {
                yeb yebVar3 = nebVar.a.get(0);
                yebVar3.a();
                this.z0 = yebVar3;
                if (this.k0) {
                    long j2 = yebVar3.c;
                    d3a d3aVar = this.f0;
                    if (d3aVar != null) {
                        hmb.b bVar = new hmb.b(j2);
                        if (h2()) {
                            this.w0 = u63.Y(Q1(), null, null, new h1(d3aVar, bVar, this, null), 3);
                            return;
                        } else {
                            this.q0 = bVar;
                            u63.Y(Q1(), null, null, new i1(null, d3aVar, bVar), 3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        List<yeb> list2 = nebVar.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!mh2.h(list2.get(i2))) {
                long jI1 = us3.f(this).m0.I1(((opg) om2.a(this, um2.s)).d());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jI1 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jI1 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
                int size3 = list2.size();
                while (i < size3) {
                    yeb yebVar4 = list2.get(i);
                    if (yebVar4.b() || mh2.n(yebVar4, j, jFloatToRawIntBits)) {
                        this.z0 = null;
                        j2();
                        return;
                    }
                    i++;
                }
                return;
            }
        }
        list2.get(0).a();
        if (this.k0) {
            long j3 = yebVar2.c;
            d3a d3aVar2 = this.f0;
            if (d3aVar2 != null) {
                uqe uqeVar = this.w0;
                if (uqeVar == null || !uqeVar.isActive()) {
                    j72Var = this;
                    hmb.b bVar2 = j72Var.q0;
                    if (bVar2 != null) {
                        u63.Y(j72Var.Q1(), null, null, new g1(null, d3aVar2, bVar2), 3);
                    }
                } else {
                    j72Var = this;
                    u63.Y(Q1(), null, null, new f1(j72Var, j3, d3aVar2, null), 3);
                }
                j72Var.q0 = null;
            } else {
                j72Var = this;
            }
            j72Var.l0.invoke();
        } else {
            j72Var = this;
        }
        j72Var.z0 = null;
    }

    @Override // defpackage.b1, defpackage.dfb
    public final void f1() {
        super.f1();
        if (this.z0 != null) {
            this.z0 = null;
            j2();
        }
    }

    @Override // defpackage.b1
    public final k1f g2() {
        return null;
    }

    @Override // defpackage.b1
    public final boolean m2(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.b1
    public final void n2(KeyEvent keyEvent) {
        this.l0.invoke();
    }
}
