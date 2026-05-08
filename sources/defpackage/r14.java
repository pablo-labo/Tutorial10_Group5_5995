package defpackage;

import defpackage.hv1;

/* JADX INFO: loaded from: classes3.dex */
public final class r14 extends tfe implements l04 {
    public final b5c t0;
    public final o8a u0;
    public final hyf v0;
    public final cng w0;
    public final c14 x0;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public r14(defpackage.aj3 r8, defpackage.sfe r9, defpackage.lf0 r10, defpackage.n8a r11, hv1.a r12, defpackage.b5c r13, defpackage.o8a r14, defpackage.hyf r15, defpackage.cng r16, defpackage.c14 r17, defpackage.qne r18) {
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
            r7.t0 = r13
            r7.u0 = r14
            r7.v0 = r15
            r1 = r16
            r7.w0 = r1
            r1 = r17
            r7.x0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r14.<init>(aj3, sfe, lf0, n8a, hv1$a, b5c, o8a, hyf, cng, c14, qne):void");
    }

    @Override // defpackage.g14
    public final hyf D() {
        return this.v0;
    }

    @Override // defpackage.g14
    public final o8a I() {
        return this.u0;
    }

    @Override // defpackage.g14
    public final c14 J() {
        return this.x0;
    }

    @Override // defpackage.tfe, defpackage.mv5
    public final mv5 M0(lf0 lf0Var, hv1.a aVar, aj3 aj3Var, kv5 kv5Var, n8a n8aVar, qne qneVar) {
        n8a n8aVar2;
        aj3Var.getClass();
        aVar.getClass();
        lf0Var.getClass();
        sfe sfeVar = (sfe) kv5Var;
        if (n8aVar == null) {
            n8a name = getName();
            name.getClass();
            n8aVar2 = name;
        } else {
            n8aVar2 = n8aVar;
        }
        r14 r14Var = new r14(aj3Var, sfeVar, lf0Var, n8aVar2, aVar, this.t0, this.u0, this.v0, this.w0, this.x0, qneVar);
        r14Var.l0 = this.l0;
        return r14Var;
    }

    @Override // defpackage.g14
    public final rp9 f0() {
        return this.t0;
    }
}
