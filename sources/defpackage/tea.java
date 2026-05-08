package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tea {
    public xea a;
    public xea b;
    public gu5<? extends e13> c = new a();
    public e13 d;

    public static final class a extends mj8 implements gu5<e13> {
        public a() {
            super(0);
        }

        @Override // defpackage.gu5
        public final e13 invoke() {
            return tea.this.d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r0 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        if (r0 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, long r10, defpackage.pu2 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.uea
            if (r0 == 0) goto L14
            r0 = r12
            uea r0 = (defpackage.uea) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            uea r0 = new uea
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.result
            int r1 = r12.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.r7d.b(r0)
            goto L7b
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L31:
            defpackage.r7d.b(r0)
            goto L5b
        L35:
            defpackage.r7d.b(r0)
            xea r0 = r7.a
            if (r0 == 0) goto L47
            boolean r1 = r0.c0
            if (r1 == 0) goto L47
            jtf r0 = defpackage.pg8.t(r0)
            xea r0 = (defpackage.xea) r0
            goto L48
        L47:
            r0 = r2
        L48:
            r5 = 0
            g13 r1 = defpackage.g13.a
            if (r0 != 0) goto L60
            xea r7 = r7.b
            if (r7 == 0) goto L7f
            r12.label = r4
            java.lang.Object r0 = r7.T0(r8, r10, r12)
            if (r0 != r1) goto L5b
            goto L7a
        L5b:
            vmg r0 = (defpackage.vmg) r0
            long r5 = r0.a
            goto L7f
        L60:
            xea r7 = r7.a
            if (r7 == 0) goto L6f
            boolean r0 = r7.c0
            if (r0 == 0) goto L6f
            jtf r7 = defpackage.pg8.t(r7)
            r2 = r7
            xea r2 = (defpackage.xea) r2
        L6f:
            r7 = r2
            if (r7 == 0) goto L7f
            r12.label = r3
            java.lang.Object r0 = r7.T0(r8, r10, r12)
            if (r0 != r1) goto L7b
        L7a:
            return r1
        L7b:
            vmg r0 = (defpackage.vmg) r0
            long r5 = r0.a
        L7f:
            vmg r7 = new vmg
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tea.a(long, long, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r5, defpackage.pu2 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.vea
            if (r0 == 0) goto L13
            r0 = r7
            vea r0 = (defpackage.vea) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            vea r0 = new vea
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.r7d.b(r7)
            goto L4b
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L2c:
            defpackage.r7d.b(r7)
            xea r4 = r4.a
            if (r4 == 0) goto L3e
            boolean r7 = r4.c0
            if (r7 == 0) goto L3e
            jtf r4 = defpackage.pg8.t(r4)
            r2 = r4
            xea r2 = (defpackage.xea) r2
        L3e:
            if (r2 == 0) goto L50
            r0.label = r3
            java.lang.Object r7 = r2.s0(r5, r0)
            g13 r4 = defpackage.g13.a
            if (r7 != r4) goto L4b
            return r4
        L4b:
            vmg r7 = (defpackage.vmg) r7
            long r4 = r7.a
            goto L52
        L50:
            r4 = 0
        L52:
            vmg r6 = new vmg
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tea.b(long, pu2):java.lang.Object");
    }

    public final e13 c() {
        e13 e13VarInvoke = this.c.invoke();
        if (e13VarInvoke != null) {
            return e13VarInvoke;
        }
        r6.g("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
