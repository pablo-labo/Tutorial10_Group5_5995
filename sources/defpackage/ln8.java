package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ln8 implements cq8 {
    public final so8 a;

    public ln8(so8 so8Var) {
        this.a = so8Var;
    }

    @Override // defpackage.cq8
    public final int a() {
        return this.a.g().f();
    }

    @Override // defpackage.cq8
    public final int b() {
        int i;
        so8 so8Var = this.a;
        if (so8Var.g().i().isEmpty()) {
            return 0;
        }
        eo8 eo8VarG = so8Var.g();
        dwa dwaVarA = eo8VarG.a();
        dwa dwaVar = dwa.a;
        int iB = (int) (dwaVarA == dwaVar ? eo8VarG.b() & 4294967295L : eo8VarG.b() >> 32);
        eo8 eo8VarG2 = so8Var.g();
        boolean z = eo8VarG2.a() == dwaVar;
        List<rn8> listI = eo8VarG2.i();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < listI.size()) {
            rn8 rn8Var = eo8VarG2.i().get(i2);
            int iE = z ? rn8Var.e() : rn8Var.getColumn();
            if (iE == -1) {
                i2++;
            } else {
                int iMax = 0;
                while (i2 < listI.size()) {
                    rn8 rn8Var2 = eo8VarG2.i().get(i2);
                    if ((z ? rn8Var2.e() : rn8Var2.getColumn()) != iE) {
                        break;
                    }
                    iMax = Math.max(iMax, (int) (z ? listI.get(i2).a() & 4294967295L : listI.get(i2).a() >> 32));
                    i2++;
                }
                i3 += iMax;
                i4++;
            }
        }
        int iG = eo8VarG2.g() + (i3 / i4);
        if (iG != 0 && (i = iB / iG) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.cq8
    public final boolean c() {
        return !this.a.g().i().isEmpty();
    }

    @Override // defpackage.cq8
    public final int d() {
        return ((dme) this.a.d.a).e();
    }

    @Override // defpackage.cq8
    public final int e() {
        return ((rn8) z92.Y0(this.a.g().i())).getIndex();
    }
}
