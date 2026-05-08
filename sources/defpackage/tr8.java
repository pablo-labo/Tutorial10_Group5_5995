package defpackage;

import defpackage.ur8;

/* JADX INFO: loaded from: classes.dex */
public final class tr8 implements rr8 {
    public final /* synthetic */ ss8 a;
    public final /* synthetic */ boolean b;

    public tr8(ss8 ss8Var, boolean z) {
        this.a = ss8Var;
        this.b = z;
    }

    @Override // defpackage.rr8
    public final int a() {
        ss8 ss8Var = this.a;
        return ss8Var.j().c() + ss8Var.j().d();
    }

    @Override // defpackage.rr8
    public final float b() {
        ss8 ss8Var = this.a;
        int iH = ss8Var.h();
        int i = ss8Var.i();
        return ss8Var.d() ? (iH * 500) + i + 100.0f : (iH * 500) + i;
    }

    @Override // defpackage.rr8
    public final i92 c() {
        boolean z = this.b;
        ss8 ss8Var = this.a;
        return z ? new i92(ss8Var.j().f(), 1) : new i92(1, ss8Var.j().f());
    }

    @Override // defpackage.rr8
    public final int d() {
        ss8 ss8Var = this.a;
        return (int) (ss8Var.j().a() == dwa.a ? ss8Var.j().b() & 4294967295L : ss8Var.j().b() >> 32);
    }

    @Override // defpackage.rr8
    public final float e() {
        ss8 ss8Var = this.a;
        return (ss8Var.h() * 500) + ss8Var.i();
    }

    @Override // defpackage.rr8
    public final Object f(int i, ur8.a aVar) {
        Object objK = ss8.k(this.a, i, aVar);
        return objK == g13.a ? objK : j6g.a;
    }
}
