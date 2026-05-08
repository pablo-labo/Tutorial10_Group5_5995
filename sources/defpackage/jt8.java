package defpackage;

import defpackage.ur8;

/* JADX INFO: loaded from: classes.dex */
public final class jt8 implements rr8 {
    public final /* synthetic */ so8 a;

    public jt8(so8 so8Var) {
        this.a = so8Var;
    }

    @Override // defpackage.rr8
    public final int a() {
        so8 so8Var = this.a;
        return so8Var.g().c() + so8Var.g().d();
    }

    @Override // defpackage.rr8
    public final float b() {
        so8 so8Var = this.a;
        int iE = ((dme) so8Var.d.a).e();
        int iE2 = ((dme) so8Var.d.b).e();
        return so8Var.d() ? (iE * 500) + iE2 + 100.0f : (iE * 500) + iE2;
    }

    @Override // defpackage.rr8
    public final i92 c() {
        return new i92(-1, -1);
    }

    @Override // defpackage.rr8
    public final int d() {
        so8 so8Var = this.a;
        return (int) (so8Var.g().a() == dwa.a ? so8Var.g().b() & 4294967295L : so8Var.g().b() >> 32);
    }

    @Override // defpackage.rr8
    public final float e() {
        so8 so8Var = this.a;
        return (((dme) so8Var.d.a).e() * 500) + ((dme) so8Var.d.b).e();
    }

    @Override // defpackage.rr8
    public final Object f(int i, ur8.a aVar) {
        ko2 ko2Var = so8.w;
        so8 so8Var = this.a;
        so8Var.getClass();
        Object objA = so8Var.a(n4a.a, new to8(so8Var, i, 0, null), aVar);
        g13 g13Var = g13.a;
        if (objA != g13Var) {
            objA = j6g.a;
        }
        return objA == g13Var ? objA : j6g.a;
    }
}
