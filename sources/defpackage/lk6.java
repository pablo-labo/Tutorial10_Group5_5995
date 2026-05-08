package defpackage;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lk6 extends e.c implements dfb {
    public d3a d0;
    public hk6 e0;

    @uh3(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {89}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return lk6.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                lk6 lk6Var = lk6.this;
                this.label = 1;
                Object objC2 = lk6.c2(lk6Var, this);
                g13 g13Var = g13.a;
                if (objC2 == g13Var) {
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

    @uh3(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {90}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public b(lu2<? super b> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return lk6.this.new b(lu2Var);
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
                lk6 lk6Var = lk6.this;
                this.label = 1;
                Object objD2 = lk6.d2(lk6Var, this);
                g13 g13Var = g13.a;
                if (objD2 == g13Var) {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c2(defpackage.lk6 r4, defpackage.pu2 r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof defpackage.jk6
            if (r0 == 0) goto L16
            r0 = r5
            jk6 r0 = (defpackage.jk6) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            jk6 r0 = new jk6
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            java.lang.Object r0 = r0.L$0
            hk6 r0 = (defpackage.hk6) r0
            defpackage.r7d.b(r5)
            goto L4f
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L33:
            defpackage.r7d.b(r5)
            hk6 r5 = r4.e0
            if (r5 != 0) goto L51
            hk6 r5 = new hk6
            r5.<init>()
            d3a r1 = r4.d0
            r0.L$0 = r5
            r0.label = r2
            java.lang.Object r0 = r1.a(r5, r0)
            g13 r1 = defpackage.g13.a
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            r4.e0 = r0
        L51:
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk6.c2(lk6, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d2(defpackage.lk6 r4, defpackage.pu2 r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof defpackage.kk6
            if (r0 == 0) goto L16
            r0 = r5
            kk6 r0 = (defpackage.kk6) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            kk6 r0 = new kk6
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 != r3) goto L29
            defpackage.r7d.b(r5)
            goto L48
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L2f:
            defpackage.r7d.b(r5)
            hk6 r5 = r4.e0
            if (r5 == 0) goto L4a
            ik6 r1 = new ik6
            r1.<init>(r5)
            d3a r5 = r4.d0
            r0.label = r3
            java.lang.Object r5 = r5.a(r1, r0)
            g13 r0 = defpackage.g13.a
            if (r5 != r0) goto L48
            return r0
        L48:
            r4.e0 = r2
        L4a:
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk6.d2(lk6, pu2):java.lang.Object");
    }

    @Override // defpackage.dfb
    public final void R(neb nebVar, peb pebVar, long j) {
        if (pebVar == peb.b) {
            int i = nebVar.e;
            if (i == 4) {
                u63.Y(Q1(), null, null, new a(null), 3);
            } else if (i == 5) {
                u63.Y(Q1(), null, null, new b(null), 3);
            }
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        e2();
    }

    public final void e2() {
        hk6 hk6Var = this.e0;
        if (hk6Var != null) {
            this.d0.c(new ik6(hk6Var));
            this.e0 = null;
        }
    }

    @Override // defpackage.dfb
    public final void f1() {
        e2();
    }
}
