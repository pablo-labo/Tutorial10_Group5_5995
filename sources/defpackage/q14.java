package defpackage;

import defpackage.hv1;

/* JADX INFO: loaded from: classes3.dex */
public final class q14 extends e4c implements l04 {
    public final g5c p0;
    public final o8a q0;
    public final hyf r0;
    public final cng s0;
    public final c14 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q14(aj3 aj3Var, d4c d4cVar, lf0 lf0Var, ax9 ax9Var, e04 e04Var, boolean z, n8a n8aVar, hv1.a aVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, g5c g5cVar, o8a o8aVar, hyf hyfVar, cng cngVar, c14 c14Var) {
        super(aj3Var, d4cVar, lf0Var, ax9Var, e04Var, z, n8aVar, aVar, qne.p, z2, z3, z6, z4, z5);
        aj3Var.getClass();
        lf0Var.getClass();
        ax9Var.getClass();
        e04Var.getClass();
        n8aVar.getClass();
        aVar.getClass();
        g5cVar.getClass();
        o8aVar.getClass();
        hyfVar.getClass();
        cngVar.getClass();
        this.p0 = g5cVar;
        this.q0 = o8aVar;
        this.r0 = hyfVar;
        this.s0 = cngVar;
        this.t0 = c14Var;
    }

    @Override // defpackage.g14
    public final hyf D() {
        return this.r0;
    }

    @Override // defpackage.g14
    public final o8a I() {
        return this.q0;
    }

    @Override // defpackage.g14
    public final c14 J() {
        return this.t0;
    }

    @Override // defpackage.e4c
    public final e4c O0(aj3 aj3Var, ax9 ax9Var, e04 e04Var, d4c d4cVar, hv1.a aVar, n8a n8aVar) {
        aj3Var.getClass();
        ax9Var.getClass();
        e04Var.getClass();
        aVar.getClass();
        n8aVar.getClass();
        return new q14(aj3Var, d4cVar, getAnnotations(), ax9Var, e04Var, this.f, n8aVar, aVar, this.c0, this.d0, isExternal(), this.g0, this.e0, this.p0, this.q0, this.r0, this.s0, this.t0);
    }

    @Override // defpackage.g14
    public final rp9 f0() {
        return this.p0;
    }

    @Override // defpackage.e4c, defpackage.zm9
    public final boolean isExternal() {
        return ch5.E.c(this.p0.Q()).booleanValue();
    }
}
