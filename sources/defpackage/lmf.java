package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lmf<U, T extends U> extends vpd<T> implements Runnable {
    public final long e;

    public lmf(long j, lu2<? super U> lu2Var) {
        super(lu2Var, lu2Var.getContext());
        this.e = j;
    }

    @Override // defpackage.d78
    public final String S() {
        return super.S() + "(timeMillis=" + this.e + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r4 = this;
            v03 r0 = r4.c
            js3 r0 = defpackage.ls3.c(r0)
            boolean r1 = r0 instanceof defpackage.ns3
            if (r1 == 0) goto Ld
            ns3 r0 = (defpackage.ns3) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            long r1 = r4.e
            if (r0 == 0) goto L1f
            int r3 = defpackage.wd4.d
            be4 r3 = defpackage.be4.MILLISECONDS
            defpackage.pg8.U(r1, r3)
            java.lang.String r0 = r0.N()
            if (r0 != 0) goto L27
        L1f:
            java.lang.String r0 = "Timed out waiting for "
            java.lang.String r3 = " ms"
            java.lang.String r0 = defpackage.u40.c(r1, r0, r3)
        L27:
            kotlinx.coroutines.TimeoutCancellationException r1 = new kotlinx.coroutines.TimeoutCancellationException
            r1.<init>(r0, r4)
            r4.q(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmf.run():void");
    }
}
