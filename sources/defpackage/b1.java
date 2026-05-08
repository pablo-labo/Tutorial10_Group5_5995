package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.hmb;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b1 extends zs3 implements dfb, rg8, c5e, jtf, nm2, joa {
    public static final a y0 = new a();
    public d3a f0;
    public ua7 g0;
    public boolean h0;
    public String i0;
    public qed j0;
    public boolean k0;
    public gu5<j6g> l0;
    public final fn5 m0;
    public ua7 n0;
    public g1f o0;
    public ts3 p0;
    public hmb.b q0;
    public hk6 r0;
    public final k3a<hmb.b> s0;
    public long t0;
    public d3a u0;
    public boolean v0;
    public uqe w0;
    public final a x0;

    public static final class a {
    }

    public /* synthetic */ class b extends qv5 implements Function1<Boolean, j6g> {
        /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.j6g invoke(java.lang.Boolean r15) {
            /*
                r14 = this;
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                java.lang.Object r14 = r14.receiver
                b1 r14 = (defpackage.b1) r14
                k3a<hmb$b> r0 = r14.s0
                if (r15 == 0) goto L12
                r14.k2()
                goto L6c
            L12:
                d3a r15 = r14.f0
                if (r15 == 0) goto L66
                java.lang.Object[] r15 = r0.c
                long[] r1 = r0.a
                int r2 = r1.length
                int r2 = r2 + (-2)
                if (r2 < 0) goto L66
                r3 = 0
                r4 = r3
            L21:
                r5 = r1[r4]
                long r7 = ~r5
                r9 = 7
                long r7 = r7 << r9
                long r7 = r7 & r5
                r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r7 = r7 & r9
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 == 0) goto L61
                int r7 = r4 - r2
                int r7 = ~r7
                int r7 = r7 >>> 31
                r8 = 8
                int r7 = 8 - r7
                r9 = r3
            L3b:
                if (r9 >= r7) goto L5f
                r10 = 255(0xff, double:1.26E-321)
                long r10 = r10 & r5
                r12 = 128(0x80, double:6.32E-322)
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 >= 0) goto L5b
                int r10 = r4 << 3
                int r10 = r10 + r9
                r10 = r15[r10]
                hmb$b r10 = (hmb.b) r10
                e13 r11 = r14.Q1()
                j1 r12 = new j1
                r13 = 0
                r12.<init>(r14, r10, r13)
                r10 = 3
                defpackage.u63.Y(r11, r13, r13, r12, r10)
            L5b:
                long r5 = r5 >> r8
                int r9 = r9 + 1
                goto L3b
            L5f:
                if (r7 != r8) goto L66
            L61:
                if (r4 == r2) goto L66
                int r4 = r4 + 1
                goto L21
            L66:
                r0.c()
                r14.l2()
            L6c:
                j6g r14 = defpackage.j6g.a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: b1.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionCancel$1$1$1", f = "Clickable.kt", l = {1706}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ hmb.b $pressInteraction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(lu2 lu2Var, d3a d3aVar, hmb.b bVar) {
            super(2, lu2Var);
            this.$pressInteraction = bVar;
            this.$interactionSource = d3aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(lu2Var, this.$interactionSource, this.$pressInteraction);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hmb.a aVar = new hmb.a(this.$pressInteraction);
                d3a d3aVar = this.$interactionSource;
                this.label = 1;
                Object objA = d3aVar.a(aVar, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
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

    @uh3(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {1592}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hmb.b $press;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(hmb.b bVar, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$press = bVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return b1.this.new d(this.$press, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                d3a d3aVar = b1.this.f0;
                if (d3aVar != null) {
                    hmb.b bVar = this.$press;
                    this.label = 1;
                    Object objA = d3aVar.a(bVar, this);
                    g13 g13Var = g13.a;
                    if (objA == g13Var) {
                        return g13Var;
                    }
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

    @uh3(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2", f = "Clickable.kt", l = {1603}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hmb.b $press;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(hmb.b bVar, lu2<? super e> lu2Var) {
            super(2, lu2Var);
            this.$press = bVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return b1.this.new e(this.$press, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                d3a d3aVar = b1.this.f0;
                if (d3aVar != null) {
                    hmb.c cVar = new hmb.c(this.$press);
                    this.label = 1;
                    Object objA = d3aVar.a(cVar, this);
                    g13 g13Var = g13.a;
                    if (objA == g13Var) {
                        return g13Var;
                    }
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

    @uh3(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", l = {}, m = "invokeSuspend")
    public static final class f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public f(lu2<? super f> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return b1.this.new f(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            b1 b1Var = b1.this;
            if (b1Var.r0 == null) {
                hk6 hk6Var = new hk6();
                d3a d3aVar = b1Var.f0;
                if (d3aVar != null) {
                    u63.Y(b1Var.Q1(), null, null, new c1(d3aVar, hk6Var, null), 3);
                }
                b1Var.r0 = hk6Var;
            }
            return j6g.a;
        }
    }

    @uh3(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", f = "Clickable.kt", l = {}, m = "invokeSuspend")
    public static final class g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public g(lu2<? super g> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return b1.this.new g(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            b1 b1Var = b1.this;
            hk6 hk6Var = b1Var.r0;
            if (hk6Var != null) {
                ik6 ik6Var = new ik6(hk6Var);
                d3a d3aVar = b1Var.f0;
                if (d3aVar != null) {
                    u63.Y(b1Var.Q1(), null, null, new d1(d3aVar, ik6Var, null), 3);
                }
                b1Var.r0 = null;
            }
            return j6g.a;
        }
    }

    public b1() {
        throw null;
    }

    public b1(d3a d3aVar, ua7 ua7Var, boolean z, boolean z2, String str, qed qedVar, gu5 gu5Var) {
        this.f0 = d3aVar;
        this.g0 = ua7Var;
        this.h0 = z;
        this.i0 = str;
        this.j0 = qedVar;
        this.k0 = z2;
        this.l0 = gu5Var;
        this.m0 = new fn5(d3aVar, 0, new b(1, this, b1.class, "onFocusChange", "onFocusChange(Z)V", 0));
        k3a k3aVar = j59.a;
        this.s0 = new k3a<>();
        this.t0 = 0L;
        d3a d3aVar2 = this.f0;
        this.u0 = d3aVar2;
        this.v0 = d3aVar2 == null;
        this.x0 = y0;
    }

    @Override // defpackage.jtf
    public final Object E() {
        return this.x0;
    }

    @Override // defpackage.c5e
    public final void F0(s5e s5eVar) {
        qed qedVar = this.j0;
        if (qedVar != null) {
            o5e.i(s5eVar, qedVar.a);
        }
        String str = this.i0;
        a1 a1Var = new a1(this, 0);
        qf8<Object>[] qf8VarArr = o5e.a;
        s5eVar.a(v4e.b, new r5(str, a1Var));
        if (this.k0) {
            this.m0.F0(s5eVar);
        } else {
            s5eVar.a(k5e.i, j6g.a);
        }
        f2(s5eVar);
    }

    @Override // defpackage.c5e
    public final boolean L1() {
        return true;
    }

    @Override // defpackage.rg8
    public final boolean N0(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.dfb
    public void R(neb nebVar, peb pebVar, long j) {
        k1f k1fVarG2;
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.t0 = (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L);
        k2();
        if (this.k0 && pebVar == peb.b) {
            int i = nebVar.e;
            if (i == 4) {
                u63.Y(Q1(), null, null, new f(null), 3);
            } else if (i == 5) {
                u63.Y(Q1(), null, null, new g(null), 3);
            }
        }
        if (this.o0 == null && (k1fVarG2 = g2()) != null) {
            c2(k1fVarG2);
            this.o0 = k1fVarG2;
        }
        g1f g1fVar = this.o0;
        if (g1fVar != null) {
            g1fVar.R(nebVar, pebVar, j);
        }
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public final void U1() {
        u0();
        if (!this.v0) {
            k2();
        }
        if (this.k0) {
            c2(this.m0);
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        i2();
        if (this.u0 == null) {
            this.f0 = null;
        }
        ts3 ts3Var = this.p0;
        if (ts3Var != null) {
            d2(ts3Var);
        }
        this.p0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[RETURN] */
    @Override // defpackage.rg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b1(android.view.KeyEvent r11) {
        /*
            r10 = this;
            r10.k2()
            long r0 = defpackage.pg8.y(r11)
            boolean r2 = r10.k0
            r3 = 3
            r4 = 0
            k3a<hmb$b> r5 = r10.s0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            int r2 = defpackage.pg8.A(r11)
            r8 = 2
            if (r2 != r8) goto L4a
            boolean r2 = androidx.compose.foundation.b.g(r11)
            if (r2 == 0) goto L4a
            boolean r2 = r5.a(r0)
            if (r2 != 0) goto L40
            hmb$b r2 = new hmb$b
            long r8 = r10.t0
            r2.<init>(r8)
            r5.h(r2, r0)
            d3a r0 = r10.f0
            if (r0 == 0) goto L3e
            e13 r0 = r10.Q1()
            b1$d r1 = new b1$d
            r1.<init>(r2, r4)
            defpackage.u63.Y(r0, r4, r4, r1, r3)
        L3e:
            r0 = r6
            goto L41
        L40:
            r0 = r7
        L41:
            boolean r10 = r10.m2(r11)
            if (r10 != 0) goto L77
            if (r0 == 0) goto L78
            goto L77
        L4a:
            boolean r2 = r10.k0
            if (r2 == 0) goto L78
            int r2 = defpackage.pg8.A(r11)
            if (r2 != r6) goto L78
            boolean r2 = androidx.compose.foundation.b.g(r11)
            if (r2 == 0) goto L78
            java.lang.Object r0 = r5.g(r0)
            hmb$b r0 = (hmb.b) r0
            if (r0 == 0) goto L75
            d3a r1 = r10.f0
            if (r1 == 0) goto L72
            e13 r1 = r10.Q1()
            b1$e r2 = new b1$e
            r2.<init>(r0, r4)
            defpackage.u63.Y(r1, r4, r4, r2, r3)
        L72:
            r10.n2(r11)
        L75:
            if (r0 == 0) goto L78
        L77:
            return r6
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1.b1(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.dfb
    public void f1() {
        hk6 hk6Var;
        d3a d3aVar = this.f0;
        if (d3aVar != null && (hk6Var = this.r0) != null) {
            d3aVar.c(new ik6(hk6Var));
        }
        this.r0 = null;
        g1f g1fVar = this.o0;
        if (g1fVar != null) {
            g1fVar.f1();
        }
    }

    public void f2(s5e s5eVar) {
    }

    public abstract k1f g2();

    public final boolean h2() {
        huc hucVar = new huc();
        pg8.W(this, esd.f0, new cj(hucVar, 2));
        if (hucVar.element) {
            return true;
        }
        int i = q72.b;
        ViewParent parent = vs3.a(this).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i2() {
        /*
            r17 = this;
            r0 = r17
            d3a r1 = r0.f0
            k3a<hmb$b> r2 = r0.s0
            if (r1 == 0) goto L6a
            hmb$b r3 = r0.q0
            if (r3 == 0) goto L14
            hmb$a r4 = new hmb$a
            r4.<init>(r3)
            r1.c(r4)
        L14:
            hk6 r3 = r0.r0
            if (r3 == 0) goto L20
            ik6 r4 = new ik6
            r4.<init>(r3)
            r1.c(r4)
        L20:
            java.lang.Object[] r3 = r2.c
            long[] r4 = r2.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6a
            r6 = 0
            r7 = r6
        L2b:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L65
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L45:
            if (r12 >= r10) goto L63
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5f
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            hmb$b r13 = (hmb.b) r13
            hmb$a r14 = new hmb$a
            r14.<init>(r13)
            r1.c(r14)
        L5f:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L45
        L63:
            if (r10 != r11) goto L6a
        L65:
            if (r7 == r5) goto L6a
            int r7 = r7 + 1
            goto L2b
        L6a:
            r1 = 0
            r0.q0 = r1
            r0.r0 = r1
            r2.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1.i2():void");
    }

    public final void j2() {
        d3a d3aVar = this.f0;
        if (d3aVar != null) {
            uqe uqeVar = this.w0;
            if (uqeVar == null || !uqeVar.isActive()) {
                hmb.b bVar = this.q0;
                if (bVar != null) {
                    u63.Y(Q1(), null, null, new c(null, d3aVar, bVar), 3);
                }
            } else {
                uqe uqeVar2 = this.w0;
                if (uqeVar2 != null) {
                    uqeVar2.h(null);
                }
            }
            this.q0 = null;
        }
    }

    public final void k2() {
        if (this.p0 != null) {
            return;
        }
        ua7 ua7Var = this.h0 ? this.n0 : this.g0;
        if (ua7Var != null) {
            if (this.f0 == null) {
                this.f0 = new e3a();
            }
            this.m0.h2(this.f0);
            d3a d3aVar = this.f0;
            d3aVar.getClass();
            ts3 ts3VarA = ua7Var.a(d3aVar);
            c2(ts3VarA);
            this.p0 = ts3VarA;
        }
    }

    public void l2() {
    }

    public abstract boolean m2(KeyEvent keyEvent);

    public abstract void n2(KeyEvent keyEvent);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o2(defpackage.d3a r4, defpackage.ua7 r5, boolean r6, boolean r7, java.lang.String r8, defpackage.qed r9, defpackage.gu5<defpackage.j6g> r10) {
        /*
            r3 = this;
            d3a r0 = r3.u0
            boolean r0 = defpackage.wl7.b(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.i2()
            r3.u0 = r4
            r3.f0 = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            ua7 r0 = r3.g0
            boolean r0 = defpackage.wl7.b(r0, r5)
            if (r0 != 0) goto L1f
            r3.g0 = r5
            r4 = r1
        L1f:
            boolean r5 = r3.h0
            if (r5 == r6) goto L2b
            r3.h0 = r6
            if (r6 == 0) goto L2a
            r3.u0()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.k0
            fn5 r6 = r3.m0
            if (r5 == r7) goto L46
            if (r7 == 0) goto L37
            r3.c2(r6)
            goto L3d
        L37:
            r3.d2(r6)
            r3.i2()
        L3d:
            pm8 r5 = defpackage.us3.f(r3)
            r5.U()
            r3.k0 = r7
        L46:
            java.lang.String r5 = r3.i0
            boolean r5 = defpackage.wl7.b(r5, r8)
            if (r5 != 0) goto L57
            r3.i0 = r8
            pm8 r5 = defpackage.us3.f(r3)
            r5.U()
        L57:
            qed r5 = r3.j0
            boolean r5 = defpackage.wl7.b(r5, r9)
            if (r5 != 0) goto L68
            r3.j0 = r9
            pm8 r5 = defpackage.us3.f(r3)
            r5.U()
        L68:
            r3.l0 = r10
            boolean r5 = r3.v0
            d3a r7 = r3.u0
            if (r7 != 0) goto L72
            r8 = r1
            goto L73
        L72:
            r8 = r2
        L73:
            if (r5 == r8) goto L81
            if (r7 != 0) goto L78
            r2 = r1
        L78:
            r3.v0 = r2
            if (r2 != 0) goto L81
            ts3 r5 = r3.p0
            if (r5 != 0) goto L81
            goto L82
        L81:
            r1 = r4
        L82:
            if (r1 == 0) goto L97
            ts3 r4 = r3.p0
            if (r4 != 0) goto L8c
            boolean r5 = r3.v0
            if (r5 != 0) goto L97
        L8c:
            if (r4 == 0) goto L91
            r3.d2(r4)
        L91:
            r4 = 0
            r3.p0 = r4
            r3.k2()
        L97:
            d3a r3 = r3.f0
            r6.h2(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1.o2(d3a, ua7, boolean, boolean, java.lang.String, qed, gu5):void");
    }

    @Override // defpackage.joa
    public final void u0() {
        if (this.h0) {
            koa.a(this, new z0(this, 0));
        }
    }
}
