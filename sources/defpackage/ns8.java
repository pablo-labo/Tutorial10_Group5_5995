package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ns8 implements pr8, xrd {
    public final /* synthetic */ xrd a;
    public final /* synthetic */ ss8 b;

    public ns8(xrd xrdVar, ss8 ss8Var) {
        this.b = ss8Var;
        this.a = xrdVar;
    }

    @Override // defpackage.pr8
    public final int a() {
        return this.b.j().f();
    }

    @Override // defpackage.pr8
    public final int b() {
        zr8 zr8Var = (zr8) z92.Z0(this.b.j().i());
        if (zr8Var != null) {
            return zr8Var.getIndex();
        }
        return 0;
    }

    @Override // defpackage.pr8
    public final void c(int i, int i2) {
        this.b.l(i, i2);
    }

    @Override // defpackage.pr8
    public final int d(int i) {
        zr8 zr8Var;
        ss8 ss8Var = this.b;
        gs8 gs8VarJ = ss8Var.j();
        if (!gs8VarJ.i().isEmpty()) {
            int iH = ss8Var.h();
            if (i > b() || iH > i) {
                return ((i - ss8Var.h()) * q92.K(gs8VarJ)) - ss8Var.i();
            }
            List<zr8> listI = gs8VarJ.i();
            int size = listI.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    zr8Var = null;
                    break;
                }
                zr8Var = listI.get(i2);
                if (zr8Var.getIndex() == i) {
                    break;
                }
                i2++;
            }
            zr8 zr8Var2 = zr8Var;
            if (zr8Var2 != null) {
                return zr8Var2.getOffset();
            }
        }
        return 0;
    }

    @Override // defpackage.xrd
    public final float e(float f) {
        return this.a.e(f);
    }

    @Override // defpackage.pr8
    public final int f() {
        return this.b.i();
    }

    @Override // defpackage.pr8
    public final int g() {
        return this.b.h();
    }
}
