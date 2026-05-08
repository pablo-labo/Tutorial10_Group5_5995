package defpackage;

import androidx.compose.runtime.g;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class t7c extends zs3 implements nm2, sea {
    public boolean f0;
    public gu5<j6g> g0;
    public boolean h0;
    public w7c i0;
    public float j0;
    public final xea k0;
    public final x2a l0;
    public final x2a m0;

    @uh3(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1", f = "PullToRefresh.kt", l = {287, 289}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return t7c.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if (r5.c(1.0f, r4) == r3) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        
            if (r5.c(0.0f, r4) == r3) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        
            return r3;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                int r0 = r4.label
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L16
                if (r0 == r2) goto L12
                if (r0 != r1) goto Lb
                goto L12
            Lb:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r4)
                r4 = 0
                return r4
            L12:
                defpackage.r7d.b(r5)
                goto L38
            L16:
                defpackage.r7d.b(r5)
                t7c r5 = defpackage.t7c.this
                boolean r0 = r5.f0
                w7c r5 = r5.i0
                g13 r3 = defpackage.g13.a
                if (r0 == 0) goto L2e
                r4.label = r2
                r0 = 1065353216(0x3f800000, float:1.0)
                java.lang.Object r4 = r5.c(r0, r4)
                if (r4 != r3) goto L38
                goto L37
            L2e:
                r4.label = r1
                r0 = 0
                java.lang.Object r4 = r5.c(r0, r4)
                if (r4 != r3) goto L38
            L37:
                return r3
            L38:
                j6g r4 = defpackage.j6g.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: t7c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPostScroll$1", f = "PullToRefresh.kt", l = {319}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public b(lu2<? super b> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return t7c.this.new b(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                t7c t7cVar = t7c.this;
                w7c w7cVar = t7cVar.i0;
                float fG = ((cme) t7cVar.l0).g() / t7c.this.i2();
                this.label = 1;
                Object objC = w7cVar.c(fG, this);
                g13 g13Var = g13.a;
                if (objC == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {327}, m = "onPreFling-QWom1Mo")
    public static final class c extends pu2 {
        float F$0;
        int label;
        /* synthetic */ Object result;

        public c(pu2 pu2Var) {
            super(pu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return t7c.this.s0(0L, this);
        }
    }

    public t7c() {
        throw null;
    }

    public t7c(boolean z, gu5 gu5Var, boolean z2, w7c w7cVar, float f) {
        this.f0 = z;
        this.g0 = gu5Var;
        this.h0 = z2;
        this.i0 = w7cVar;
        this.j0 = f;
        this.k0 = new xea(this, null);
        this.l0 = g.a(0.0f);
        this.m0 = g.a(0.0f);
    }

    @Override // androidx.compose.ui.e.c
    public final void U1() {
        c2(this.k0);
        u63.Y(Q1(), null, null, new a(null), 3);
    }

    @Override // defpackage.sea
    public final long Z0(long j, int i, long j2) {
        if (this.i0.e() || !this.h0 || i != 1) {
            return 0L;
        }
        long jH2 = h2(j2);
        u63.Y(Q1(), null, null, new b(null), 3);
        return jH2;
    }

    @Override // defpackage.sea
    public final long e0(int i, long j) {
        if (!this.i0.e() && this.h0 && i == 1 && Float.intBitsToFloat((int) (4294967295L & j)) < 0.0f) {
            return h2(j);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f2(defpackage.pu2 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.r7c
            if (r0 == 0) goto L13
            r0 = r5
            r7c r0 = (defpackage.r7c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            r7c r0 = new r7c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r4 = r0.L$0
            t7c r4 = (defpackage.t7c) r4
            defpackage.r7d.b(r5)
            goto L42
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L30:
            defpackage.r7d.b(r5)
            w7c r5 = r4.i0
            r0.L$0 = r4
            r0.label = r2
            java.lang.Object r5 = r5.a(r0)
            g13 r0 = defpackage.g13.a
            if (r5 != r0) goto L42
            return r0
        L42:
            x2a r5 = r4.m0
            cme r5 = (defpackage.cme) r5
            r0 = 0
            r5.q(r0)
            x2a r4 = r4.l0
            cme r4 = (defpackage.cme) r4
            r4.q(r0)
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7c.f2(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g2(defpackage.pu2 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.s7c
            if (r0 == 0) goto L13
            r0 = r5
            s7c r0 = (defpackage.s7c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            s7c r0 = new s7c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r4 = r0.L$0
            t7c r4 = (defpackage.t7c) r4
            defpackage.r7d.b(r5)
            goto L42
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L30:
            defpackage.r7d.b(r5)
            w7c r5 = r4.i0
            r0.L$0 = r4
            r0.label = r2
            java.lang.Object r5 = r5.d(r0)
            g13 r0 = defpackage.g13.a
            if (r5 != r0) goto L42
            return r0
        L42:
            int r5 = r4.i2()
            float r5 = (float) r5
            x2a r0 = r4.m0
            cme r0 = (defpackage.cme) r0
            r0.q(r5)
            int r5 = r4.i2()
            float r5 = (float) r5
            x2a r4 = r4.l0
            cme r4 = (defpackage.cme) r4
            r4.q(r5)
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7c.g2(pu2):java.lang.Object");
    }

    public final long h2(long j) {
        float fG;
        float fI2;
        if (this.f0) {
            fG = 0.0f;
        } else {
            x2a x2aVar = this.m0;
            cme cmeVar = (cme) x2aVar;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + cmeVar.g();
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            fG = fIntBitsToFloat - cmeVar.g();
            ((cme) x2aVar).q(fIntBitsToFloat);
            if (((cme) x2aVar).g() * 0.5f <= i2()) {
                fI2 = ((cme) x2aVar).g() * 0.5f;
            } else {
                float fB = nic.B(Math.abs((((cme) x2aVar).g() * 0.5f) / i2()) - 1.0f, 0.0f, 2.0f);
                fI2 = i2() + (i2() * (fB - (((float) Math.pow(fB, 2.0d)) / 4.0f)));
            }
            ((cme) this.l0).q(fI2);
        }
        return wab.c(0.0f, fG);
    }

    public final int i2() {
        return ((iy3) om2.a(this, um2.h)).x0(this.j0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (g2(r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (f2(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j2(float r6, defpackage.pu2 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.u7c
            if (r0 == 0) goto L13
            r0 = r7
            u7c r0 = (defpackage.u7c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            u7c r0 = new u7c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L40
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2f
            float r6 = r0.F$0
            java.lang.Object r5 = r0.L$0
            t7c r5 = (defpackage.t7c) r5
            defpackage.r7d.b(r7)
            goto L83
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            r5 = 0
            return r5
        L36:
            float r6 = r0.F$0
            java.lang.Object r5 = r0.L$0
            t7c r5 = (defpackage.t7c) r5
            defpackage.r7d.b(r7)
            goto L70
        L40:
            defpackage.r7d.b(r7)
            boolean r7 = r5.f0
            if (r7 == 0) goto L4d
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        L4d:
            x2a r7 = r5.m0
            cme r7 = (defpackage.cme) r7
            float r7 = r7.g()
            r1 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r1
            int r1 = r5.i2()
            float r1 = (float) r1
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            g13 r1 = defpackage.g13.a
            if (r7 <= 0) goto L76
            r0.L$0 = r5
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r7 = r5.g2(r0)
            if (r7 != r1) goto L70
            goto L82
        L70:
            gu5<j6g> r7 = r5.g0
            r7.invoke()
            goto L83
        L76:
            r0.L$0 = r5
            r0.F$0 = r6
            r0.label = r2
            java.lang.Object r7 = r5.f2(r0)
            if (r7 != r1) goto L83
        L82:
            return r1
        L83:
            x2a r7 = r5.m0
            cme r7 = (defpackage.cme) r7
            float r7 = r7.g()
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 != 0) goto L91
        L8f:
            r6 = r4
            goto L96
        L91:
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 >= 0) goto L96
            goto L8f
        L96:
            x2a r5 = r5.m0
            cme r5 = (defpackage.cme) r5
            r5.q(r4)
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7c.j2(float, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.sea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s0(long r5, defpackage.lu2<? super defpackage.vmg> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof t7c.c
            if (r0 == 0) goto L13
            r0 = r7
            t7c$c r0 = (t7c.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L1a
        L13:
            t7c$c r0 = new t7c$c
            pu2 r7 = (defpackage.pu2) r7
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            float r4 = r0.F$0
            defpackage.r7d.b(r7)
            goto L46
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L30:
            defpackage.r7d.b(r7)
            float r5 = defpackage.vmg.c(r5)
            r6 = 0
            r0.F$0 = r6
            r0.label = r2
            java.lang.Object r7 = r4.j2(r5, r0)
            g13 r4 = defpackage.g13.a
            if (r7 != r4) goto L45
            return r4
        L45:
            r4 = r6
        L46:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            long r4 = defpackage.ewa.f(r4, r5)
            vmg r6 = new vmg
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7c.s0(long, lu2):java.lang.Object");
    }
}
