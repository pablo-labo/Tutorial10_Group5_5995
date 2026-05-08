package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o7b implements pne {
    public final to1 a;
    public final zn1 b;
    public lyd c;
    public int d;
    public boolean e;
    public long f;

    public o7b(to1 to1Var) {
        this.a = to1Var;
        zn1 zn1VarF = to1Var.f();
        this.b = zn1VarF;
        lyd lydVar = zn1VarF.a;
        this.c = lydVar;
        this.d = lydVar != null ? lydVar.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.pne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f1(defpackage.zn1 r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.e
            if (r3 != 0) goto L5f
            lyd r3 = r8.c
            zn1 r4 = r8.b
            if (r3 == 0) goto L27
            lyd r5 = r4.a
            if (r3 != r5) goto L21
            int r3 = r8.d
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            defpackage.r6.g(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.f
            r2 = 1
            long r0 = r0 + r2
            to1 r2 = r8.a
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            lyd r0 = r8.c
            if (r0 != 0) goto L48
            lyd r0 = r4.a
            if (r0 == 0) goto L48
            r8.c = r0
            int r0 = r0.b
            r8.d = r0
        L48:
            long r0 = r4.b
            long r2 = r8.f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            zn1 r2 = r8.b
            long r4 = r8.f
            r3 = r9
            r2.G(r3, r4, r6)
            long r9 = r8.f
            long r9 = r9 + r6
            r8.f = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            defpackage.r6.g(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = defpackage.r6.c(r10, r8)
            defpackage.h5.k(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7b.f1(zn1, long):long");
    }

    @Override // defpackage.pne
    public final kmf g() {
        return this.a.g();
    }
}
