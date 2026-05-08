package defpackage;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class xea extends e.c implements jtf, sea {
    public sea d0;
    public tea e0;
    public xea f0;
    public final String g0;

    @uh3(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {122, 127}, m = "onPostFling-RZ2iAVY")
    public static final class a extends pu2 {
        long J$0;
        long J$1;
        int label;
        /* synthetic */ Object result;

        public a(pu2 pu2Var) {
            super(pu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return xea.this.T0(0L, 0L, this);
        }
    }

    @uh3(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {115, 116}, m = "onPreFling-QWom1Mo")
    public static final class b extends pu2 {
        long J$0;
        int label;
        /* synthetic */ Object result;

        public b(pu2 pu2Var) {
            super(pu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return xea.this.s0(0L, this);
        }
    }

    public xea(sea seaVar, tea teaVar) {
        this.d0 = seaVar;
        this.e0 = teaVar == null ? new tea() : teaVar;
        this.g0 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.jtf
    public final Object E() {
        return this.g0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.sea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T0(long r13, long r15, defpackage.lu2<? super defpackage.vmg> r17) {
        /*
            r12 = this;
            r1 = r17
            boolean r2 = r1 instanceof xea.a
            if (r2 == 0) goto L16
            r2 = r1
            xea$a r2 = (xea.a) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
        L14:
            r8 = r2
            goto L1e
        L16:
            xea$a r2 = new xea$a
            pu2 r1 = (defpackage.pu2) r1
            r2.<init>(r1)
            goto L14
        L1e:
            java.lang.Object r1 = r8.result
            int r2 = r8.label
            r9 = 0
            r10 = 2
            r3 = 1
            g13 r11 = defpackage.g13.a
            if (r2 == 0) goto L41
            if (r2 == r3) goto L39
            if (r2 != r10) goto L33
            long r2 = r8.J$0
            defpackage.r7d.b(r1)
            goto L89
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r9
        L39:
            long r2 = r8.J$1
            long r4 = r8.J$0
            defpackage.r7d.b(r1)
            goto L58
        L41:
            defpackage.r7d.b(r1)
            sea r1 = r12.d0
            r8.J$0 = r13
            r6 = r15
            r8.J$1 = r6
            r8.label = r3
            r4 = r13
            r3 = r1
            java.lang.Object r1 = r3.T0(r4, r6, r8)
            if (r1 != r11) goto L56
            goto L87
        L56:
            r4 = r13
            r2 = r15
        L58:
            vmg r1 = (defpackage.vmg) r1
            long r6 = r1.a
            boolean r1 = r12.c0
            if (r1 == 0) goto L6c
            if (r1 == 0) goto L6e
            if (r1 == 0) goto L6e
            jtf r0 = defpackage.pg8.t(r12)
            r9 = r0
            xea r9 = (defpackage.xea) r9
            goto L6e
        L6c:
            xea r9 = r12.f0
        L6e:
            if (r9 == 0) goto L8f
            long r0 = defpackage.vmg.e(r4, r6)
            long r2 = defpackage.vmg.d(r2, r6)
            r8.J$0 = r6
            r8.label = r10
            r13 = r0
            r15 = r2
            r17 = r8
            r12 = r9
            java.lang.Object r1 = r12.T0(r13, r15, r17)
            if (r1 != r11) goto L88
        L87:
            return r11
        L88:
            r2 = r6
        L89:
            vmg r1 = (defpackage.vmg) r1
            long r0 = r1.a
            r6 = r2
            goto L91
        L8f:
            r0 = 0
        L91:
            long r0 = defpackage.vmg.e(r6, r0)
            vmg r2 = new vmg
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xea.T0(long, long, lu2):java.lang.Object");
    }

    @Override // androidx.compose.ui.e.c
    public final void U1() {
        tea teaVar = this.e0;
        teaVar.a = this;
        teaVar.b = null;
        this.f0 = null;
        teaVar.c = new yea(this);
        this.e0.d = Q1();
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        luc lucVar = new luc();
        pg8.X(this, new zea(lucVar));
        xea xeaVar = (xea) ((jtf) lucVar.element);
        this.f0 = xeaVar;
        tea teaVar = this.e0;
        teaVar.b = xeaVar;
        if (teaVar.a == this) {
            teaVar.a = null;
        }
    }

    @Override // defpackage.sea
    public final long Z0(long j, int i, long j2) {
        long jZ0 = this.d0.Z0(j, i, j2);
        boolean z = this.c0;
        xea xeaVar = null;
        if (z && z) {
            xeaVar = (xea) pg8.t(this);
        }
        xea xeaVar2 = xeaVar;
        return ooa.f(jZ0, xeaVar2 != null ? xeaVar2.Z0(ooa.f(j, jZ0), i, ooa.e(j2, jZ0)) : 0L);
    }

    public final e13 c2() {
        xea xeaVar = this.c0 ? (xea) pg8.t(this) : null;
        e13 e13VarC2 = xeaVar != null ? xeaVar.c2() : null;
        if (e13VarC2 != null && f13.e(e13VarC2)) {
            return e13VarC2;
        }
        e13 e13Var = this.e0.d;
        if (e13Var != null) {
            return e13Var;
        }
        r6.g("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    @Override // defpackage.sea
    public final long e0(int i, long j) {
        boolean z = this.c0;
        xea xeaVar = null;
        if (z && z) {
            xeaVar = (xea) pg8.t(this);
        }
        long jE0 = xeaVar != null ? xeaVar.e0(i, j) : 0L;
        return ooa.f(jE0, this.d0.e0(i, ooa.e(j, jE0)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r9 == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.sea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s0(long r7, defpackage.lu2<? super defpackage.vmg> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof xea.b
            if (r0 == 0) goto L13
            r0 = r9
            xea$b r0 = (xea.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L1a
        L13:
            xea$b r0 = new xea$b
            pu2 r9 = (defpackage.pu2) r9
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.J$0
            defpackage.r7d.b(r9)
            goto L71
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r2
        L35:
            long r7 = r0.J$0
            defpackage.r7d.b(r9)
            goto L58
        L3b:
            defpackage.r7d.b(r9)
            boolean r9 = r6.c0
            if (r9 == 0) goto L4b
            if (r9 == 0) goto L4b
            jtf r9 = defpackage.pg8.t(r6)
            r2 = r9
            xea r2 = (defpackage.xea) r2
        L4b:
            if (r2 == 0) goto L5d
            r0.J$0 = r7
            r0.label = r4
            java.lang.Object r9 = r2.s0(r7, r0)
            if (r9 != r5) goto L58
            goto L6f
        L58:
            vmg r9 = (defpackage.vmg) r9
            long r1 = r9.a
            goto L5f
        L5d:
            r1 = 0
        L5f:
            sea r6 = r6.d0
            long r7 = defpackage.vmg.d(r7, r1)
            r0.J$0 = r1
            r0.label = r3
            java.lang.Object r9 = r6.s0(r7, r0)
            if (r9 != r5) goto L70
        L6f:
            return r5
        L70:
            r6 = r1
        L71:
            vmg r9 = (defpackage.vmg) r9
            long r8 = r9.a
            long r6 = defpackage.vmg.e(r6, r8)
            vmg r8 = new vmg
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xea.s0(long, lu2):java.lang.Object");
    }
}
