package defpackage;

import defpackage.hv1;

/* JADX INFO: loaded from: classes3.dex */
public final class m04 extends n52 implements l04 {
    public final w4c u0;
    public final o8a v0;
    public final hyf w0;
    public final cng x0;
    public final c14 y0;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public m04(defpackage.t52 r8, defpackage.uq2 r9, defpackage.lf0 r10, boolean r11, hv1.a r12, defpackage.w4c r13, defpackage.o8a r14, defpackage.hyf r15, defpackage.cng r16, defpackage.c14 r17, defpackage.qne r18) {
        /*
            r7 = this;
            r8.getClass()
            r10.getClass()
            r12.getClass()
            r13.getClass()
            r14.getClass()
            r15.getClass()
            r16.getClass()
            if (r18 != 0) goto L21
            qne$a r0 = defpackage.qne.p
            r6 = r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0 = r7
            goto L29
        L21:
            r6 = r18
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
        L29:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.u0 = r13
            r7.v0 = r14
            r7.w0 = r15
            r1 = r16
            r7.x0 = r1
            r1 = r17
            r7.y0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m04.<init>(t52, uq2, lf0, boolean, hv1$a, w4c, o8a, hyf, cng, c14, qne):void");
    }

    @Override // defpackage.mv5, defpackage.kv5
    public final boolean B() {
        return false;
    }

    @Override // defpackage.g14
    public final hyf D() {
        return this.w0;
    }

    @Override // defpackage.g14
    public final o8a I() {
        return this.v0;
    }

    @Override // defpackage.g14
    public final c14 J() {
        return this.y0;
    }

    @Override // defpackage.n52, defpackage.mv5
    public final /* bridge */ /* synthetic */ mv5 M0(lf0 lf0Var, hv1.a aVar, aj3 aj3Var, kv5 kv5Var, n8a n8aVar, qne qneVar) {
        return Z0(aj3Var, kv5Var, aVar, lf0Var, qneVar);
    }

    @Override // defpackage.n52
    /* JADX INFO: renamed from: V0 */
    public final /* bridge */ /* synthetic */ n52 M0(lf0 lf0Var, hv1.a aVar, aj3 aj3Var, kv5 kv5Var, n8a n8aVar, qne qneVar) {
        return Z0(aj3Var, kv5Var, aVar, lf0Var, qneVar);
    }

    public final m04 Z0(aj3 aj3Var, kv5 kv5Var, hv1.a aVar, lf0 lf0Var, qne qneVar) {
        aj3Var.getClass();
        aVar.getClass();
        lf0Var.getClass();
        m04 m04Var = new m04((t52) aj3Var, (uq2) kv5Var, lf0Var, this.t0, aVar, this.u0, this.v0, this.w0, this.x0, this.y0, qneVar);
        m04Var.l0 = this.l0;
        return m04Var;
    }

    @Override // defpackage.g14
    public final rp9 f0() {
        return this.u0;
    }

    @Override // defpackage.mv5, defpackage.zm9
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.mv5, defpackage.kv5
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.mv5, defpackage.kv5
    public final boolean isSuspend() {
        return false;
    }
}
