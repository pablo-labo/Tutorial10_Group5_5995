package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tb2 extends b1 {
    public boolean A0;
    public final k3a<ex7> B0;
    public final k3a<a> C0;
    public gu5<j6g> z0;

    public static final class a {
    }

    @uh3(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1", f = "Clickable.kt", l = {1212}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public b(lu2<? super b> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return tb2.this.new b(lu2Var);
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
                long jB = ((opg) om2.a(tb2.this, um2.s)).b();
                this.label = 1;
                Object objB = ls3.b(jB, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            gu5<j6g> gu5Var = tb2.this.z0;
            if (gu5Var != null) {
                gu5Var.invoke();
            }
            return j6g.a;
        }
    }

    public tb2() {
        throw null;
    }

    public tb2(gu5 gu5Var, gu5 gu5Var2, boolean z, d3a d3aVar, boolean z2, boolean z3) {
        super(d3aVar, null, z2, z3, null, null, gu5Var);
        this.z0 = gu5Var2;
        this.A0 = z;
        k3a k3aVar = j59.a;
        this.B0 = new k3a<>();
        this.C0 = new k3a<>();
    }

    @Override // androidx.compose.ui.e.c
    public final void W1() {
        p2();
    }

    @Override // defpackage.b1
    public final void f2(s5e s5eVar) {
        if (this.z0 != null) {
            k30 k30Var = new k30(this, 5);
            qf8<Object>[] qf8VarArr = o5e.a;
            s5eVar.a(v4e.c, new r5(null, k30Var));
        }
    }

    @Override // defpackage.b1
    public final k1f g2() {
        return f1f.a(new ub2(this));
    }

    @Override // defpackage.b1
    public final void l2() {
        p2();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // defpackage.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2(android.view.KeyEvent r7) {
        /*
            r6 = this;
            long r0 = defpackage.pg8.y(r7)
            gu5<j6g> r7 = r6.z0
            r2 = 0
            if (r7 == 0) goto L24
            k3a<ex7> r7 = r6.B0
            java.lang.Object r3 = r7.b(r0)
            if (r3 != 0) goto L24
            e13 r3 = r6.Q1()
            tb2$b r4 = new tb2$b
            r4.<init>(r2)
            r5 = 3
            uqe r3 = defpackage.u63.Y(r3, r2, r2, r4, r5)
            r7.h(r3, r0)
            r7 = 1
            goto L25
        L24:
            r7 = 0
        L25:
            k3a<tb2$a> r6 = r6.C0
            java.lang.Object r6 = r6.b(r0)
            tb2$a r6 = (tb2.a) r6
            if (r6 != 0) goto L30
            return r7
        L30:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb2.m2(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.b1
    public final void n2(KeyEvent keyEvent) {
        long jY = pg8.y(keyEvent);
        k3a<ex7> k3aVar = this.B0;
        boolean z = false;
        if (k3aVar.b(jY) != null) {
            ex7 ex7VarB = k3aVar.b(jY);
            if (ex7VarB != null) {
                if (ex7VarB.isActive()) {
                    ex7VarB.h(null);
                } else {
                    z = true;
                }
            }
            k3aVar.g(jY);
        }
        if (z) {
            return;
        }
        this.l0.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p2() {
        /*
            r24 = this;
            r0 = r24
            k3a<ex7> r1 = r0.B0
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            r14 = 0
            if (r4 < 0) goto L5c
            r15 = r14
            r16 = 128(0x80, double:6.32E-322)
        L1a:
            r6 = r3[r15]
            r18 = 255(0xff, double:1.26E-321)
            long r8 = ~r6
            long r8 = r8 << r10
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r15 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L2e:
            if (r9 >= r8) goto L4e
            long r20 = r6 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L46
            int r20 = r15 << 3
            int r20 = r20 + r9
            r20 = r2[r20]
            r21 = r10
            r10 = r20
            ex7 r10 = (defpackage.ex7) r10
            r10.h(r5)
            goto L48
        L46:
            r21 = r10
        L48:
            long r6 = r6 >> r13
            int r9 = r9 + 1
            r10 = r21
            goto L2e
        L4e:
            r21 = r10
            if (r8 != r13) goto L62
            goto L55
        L53:
            r21 = r10
        L55:
            if (r15 == r4) goto L62
            int r15 = r15 + 1
            r10 = r21
            goto L1a
        L5c:
            r21 = r10
            r16 = 128(0x80, double:6.32E-322)
            r18 = 255(0xff, double:1.26E-321)
        L62:
            r1.c()
            k3a<tb2$a> r0 = r0.C0
            java.lang.Object[] r1 = r0.c
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto La2
            r4 = r14
        L71:
            r6 = r2[r4]
            long r8 = ~r6
            long r8 = r8 << r21
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L9d
            int r8 = r4 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L84:
            if (r9 >= r8) goto L9b
            long r22 = r6 & r18
            int r10 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r10 < 0) goto L90
            long r6 = r6 >> r13
            int r9 = r9 + 1
            goto L84
        L90:
            int r0 = r4 << 3
            int r0 = r0 + r9
            r0 = r1[r0]
            tb2$a r0 = (tb2.a) r0
            r0.getClass()
            throw r5
        L9b:
            if (r8 != r13) goto La2
        L9d:
            if (r4 == r3) goto La2
            int r4 = r4 + 1
            goto L71
        La2:
            r0.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb2.p2():void");
    }
}
