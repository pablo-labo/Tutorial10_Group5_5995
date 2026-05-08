package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fge<T> implements cge<T>, e13, g6e<T> {
    public final g6e<T> a;
    public final /* synthetic */ e13 b;

    /* JADX WARN: Multi-variable type inference failed */
    public fge(e13 e13Var, g6e<? super T> g6eVar) {
        e13Var.getClass();
        g6eVar.getClass();
        this.a = g6eVar;
        this.b = e13Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N(qza.b.c r5, defpackage.pu2 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dge
            if (r0 == 0) goto L13
            r0 = r6
            dge r0 = (defpackage.dge) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            dge r0 = new dge
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L30
            java.lang.Object r4 = r0.L$1
            ex7 r4 = (defpackage.ex7) r4
            java.lang.Object r4 = r0.L$0
            r5 = r4
            gu5 r5 = (defpackage.gu5) r5
            defpackage.r7d.b(r6)     // Catch: java.lang.Throwable -> L2e
            goto L6d
        L2e:
            r4 = move-exception
            goto L7b
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L37:
            defpackage.r7d.b(r6)
            e13 r4 = r4.b     // Catch: java.lang.Throwable -> L2e
            v03 r4 = r4.getCoroutineContext()     // Catch: java.lang.Throwable -> L2e
            ex7$a r6 = ex7.a.a     // Catch: java.lang.Throwable -> L2e
            v03$a r4 = r4.h1(r6)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L73
            ex7 r4 = (defpackage.ex7) r4     // Catch: java.lang.Throwable -> L2e
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L2e
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L2e
            r0.label = r2     // Catch: java.lang.Throwable -> L2e
            qw1 r6 = new qw1     // Catch: java.lang.Throwable -> L2e
            lu2 r0 = defpackage.ewa.v(r0)     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r2, r0)     // Catch: java.lang.Throwable -> L2e
            r6.q()     // Catch: java.lang.Throwable -> L2e
            ege r0 = new ege     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L2e
            r4.d0(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r6.p()     // Catch: java.lang.Throwable -> L2e
            g13 r6 = defpackage.g13.a
            if (r4 != r6) goto L6d
            return r6
        L6d:
            r5.invoke()
            j6g r4 = defpackage.j6g.a
            return r4
        L73:
            java.lang.String r4 = "Internal error, context should have a job."
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            throw r6     // Catch: java.lang.Throwable -> L2e
        L7b:
            r5.invoke()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fge.N(qza$b$c, pu2):java.lang.Object");
    }

    @Override // defpackage.g6e
    public final Object b(lu2 lu2Var, Object obj) {
        return this.a.b(lu2Var, obj);
    }

    @Override // defpackage.e13
    public final v03 getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override // defpackage.g6e
    public final boolean k(Throwable th) {
        return this.a.k(null);
    }
}
