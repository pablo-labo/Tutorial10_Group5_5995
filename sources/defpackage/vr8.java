package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vr8 implements cq8 {
    public final ss8 a;

    public vr8(ss8 ss8Var) {
        this.a = ss8Var;
    }

    @Override // defpackage.cq8
    public final int a() {
        return this.a.j().f();
    }

    @Override // defpackage.cq8
    public final int b() {
        int i;
        ss8 ss8Var = this.a;
        if (ss8Var.j().i().isEmpty()) {
            return 0;
        }
        gs8 gs8VarJ = ss8Var.j();
        int iB = (int) (gs8VarJ.a() == dwa.a ? gs8VarJ.b() & 4294967295L : gs8VarJ.b() >> 32);
        int iK = q92.K(ss8Var.j());
        if (iK != 0 && (i = iB / iK) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.cq8
    public final boolean c() {
        return !this.a.j().i().isEmpty();
    }

    @Override // defpackage.cq8
    public final int d() {
        return Math.max(0, this.a.h());
    }

    @Override // defpackage.cq8
    public final int e() {
        return Math.min(a() - 1, ((zr8) z92.Y0(this.a.j().i())).getIndex());
    }
}
