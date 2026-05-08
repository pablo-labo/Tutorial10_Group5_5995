package defpackage;

import androidx.compose.runtime.g;
import androidx.compose.runtime.r;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class q30<T> {
    public final Function1<Float, Float> a;
    public final gu5<Float> b;
    public final yd0<Float> c;
    public final Function1<T, Boolean> d;
    public final g4a g;
    public final yi7 e = new yi7();
    public final y30 f = new y30(this);
    public final az3 h = r.c(new b40(this));
    public final az3 i = r.c(new v30(this));
    public final x2a j = g.a(Float.NaN);
    public final az3 k = r.d(new a40(this), wab.a0);
    public final x2a l = g.a(0.0f);
    public final g4a m = r.f(null);
    public final g4a n = r.f(new lb9(bs4.a));
    public final t30 o = new t30(this);

    @uh3(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {567}, m = "anchoredDrag")
    public static final class a extends pu2 {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ q30<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q30<T> q30Var, lu2<? super a> lu2Var) {
            super(lu2Var);
            this.this$0 = q30Var;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.b(null, null, null, this);
        }
    }

    @uh3(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {569}, m = "invokeSuspend")
    public static final class b extends c1f implements Function1<lu2<? super j6g>, Object> {
        final /* synthetic */ xu5<y20, oa4<T>, T, lu2<? super j6g>, Object> $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ q30<T> this$0;

        public static final class a extends mj8 implements gu5<Pair<? extends oa4<T>, ? extends T>> {
            final /* synthetic */ q30<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q30<T> q30Var) {
                super(0);
                this.this$0 = q30Var;
            }

            @Override // defpackage.gu5
            public final Object invoke() {
                return new Pair(this.this$0.e(), this.this$0.h.getValue());
            }
        }

        /* JADX INFO: renamed from: q30$b$b, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {571}, m = "invokeSuspend")
        public static final class C0392b extends c1f implements Function2<Pair<? extends oa4<T>, ? extends T>, lu2<? super j6g>, Object> {
            final /* synthetic */ xu5<y20, oa4<T>, T, lu2<? super j6g>, Object> $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ q30<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0392b(xu5<? super y20, ? super oa4<T>, ? super T, ? super lu2<? super j6g>, ? extends Object> xu5Var, q30<T> q30Var, lu2<? super C0392b> lu2Var) {
                super(2, lu2Var);
                this.$block = xu5Var;
                this.this$0 = q30Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0392b c0392b = new C0392b(this.$block, this.this$0, lu2Var);
                c0392b.L$0 = obj;
                return c0392b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
                return ((C0392b) create((Pair) obj, lu2Var)).invokeSuspend(j6g.a);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to q30$b$b for r4v3 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // defpackage.x81
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    int r0 = r4.label
                    r1 = 1
                    if (r0 == 0) goto L12
                    if (r0 != r1) goto Lb
                    defpackage.r7d.b(r5)
                    goto L34
                Lb:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r4)
                    r4 = 0
                    return r4
                L12:
                    defpackage.r7d.b(r5)
                    java.lang.Object r5 = r4.L$0
                    kotlin.Pair r5 = (kotlin.Pair) r5
                    java.lang.Object r0 = r5.a()
                    oa4 r0 = (defpackage.oa4) r0
                    java.lang.Object r5 = r5.b()
                    xu5<y20, oa4<T>, T, lu2<? super j6g>, java.lang.Object> r2 = r4.$block
                    q30<T> r3 = r4.this$0
                    t30 r3 = r3.o
                    r4.label = r1
                    java.lang.Object r4 = r2.j(r3, r0, r5, r4)
                    g13 r5 = defpackage.g13.a
                    if (r4 != r5) goto L34
                    return r5
                L34:
                    j6g r4 = defpackage.j6g.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: q30.b.C0392b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(q30<T> q30Var, T t, xu5<? super y20, ? super oa4<T>, ? super T, ? super lu2<? super j6g>, ? extends Object> xu5Var, lu2<? super b> lu2Var) {
            super(1, lu2Var);
            this.this$0 = q30Var;
            this.$targetValue = t;
            this.$block = xu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(lu2<?> lu2Var) {
            return new b(this.this$0, this.$targetValue, this.$block, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(lu2<? super j6g> lu2Var) {
            return ((b) create(lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                this.this$0.i(this.$targetValue);
                a aVar = new a(this.this$0);
                C0392b c0392b = new C0392b(this.$block, this.this$0, null);
                this.label = 1;
                Object objA = androidx.compose.material3.internal.a.a(aVar, c0392b, this);
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

    public q30(Enum r1, Function1 function1, gu5 gu5Var, yd0 yd0Var, Function1 function12) {
        this.a = function1;
        this.b = gu5Var;
        this.c = yd0Var;
        this.d = function12;
        this.g = r.f(r1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.n4a r6, defpackage.w30 r7, defpackage.pu2 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.l30
            if (r0 == 0) goto L13
            r0 = r8
            l30 r0 = (defpackage.l30) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            l30 r0 = new l30
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto L2e
            java.lang.Object r5 = r0.L$0
            q30 r5 = (defpackage.q30) r5
            defpackage.r7d.b(r8)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r6 = move-exception
            goto L8e
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r2
        L34:
            defpackage.r7d.b(r8)
            yi7 r8 = r5.e     // Catch: java.lang.Throwable -> L2c
            o30 r1 = new o30     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r5, r2, r7)     // Catch: java.lang.Throwable -> L2c
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L2c
            r0.label = r4     // Catch: java.lang.Throwable -> L2c
            r8.getClass()     // Catch: java.lang.Throwable -> L2c
            wi7 r7 = new wi7     // Catch: java.lang.Throwable -> L2c
            r7.<init>(r6, r8, r1, r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r6 = defpackage.f13.d(r7, r0)     // Catch: java.lang.Throwable -> L2c
            g13 r7 = defpackage.g13.a
            if (r6 != r7) goto L53
            return r7
        L53:
            oa4 r6 = r5.e()
            x2a r7 = r5.j
            cme r7 = (defpackage.cme) r7
            float r8 = r7.g()
            java.lang.Object r6 = r6.c(r8)
            if (r6 == 0) goto L8b
            float r7 = r7.g()
            oa4 r8 = r5.e()
            float r8 = r8.f(r6)
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 > 0) goto L8b
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> r7 = r5.d
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L8b
            r5.h(r6)
        L8b:
            j6g r5 = defpackage.j6g.a
            return r5
        L8e:
            oa4 r7 = r5.e()
            x2a r8 = r5.j
            cme r8 = (defpackage.cme) r8
            float r0 = r8.g()
            java.lang.Object r7 = r7.c(r0)
            if (r7 == 0) goto Lc6
            float r8 = r8.g()
            oa4 r0 = r5.e()
            float r0 = r0.f(r7)
            float r8 = r8 - r0
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto Lc6
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> r8 = r5.d
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lc6
            r5.h(r7)
        Lc6:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q30.a(n4a, w30, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(T r6, defpackage.n4a r7, defpackage.xu5<? super defpackage.y20, ? super defpackage.oa4<T>, ? super T, ? super defpackage.lu2<? super defpackage.j6g>, ? extends java.lang.Object> r8, defpackage.lu2<? super defpackage.j6g> r9) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q30.b(java.lang.Object, n4a, xu5, lu2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(float f, float f2, Object obj) {
        oa4<T> oa4VarE = e();
        float f3 = oa4VarE.f(obj);
        float fFloatValue = this.b.invoke().floatValue();
        if (f3 != f && !Float.isNaN(f3)) {
            Function1<Float, Float> function1 = this.a;
            if (f3 < f) {
                if (f2 >= fFloatValue) {
                    T tB = oa4VarE.b(f, true);
                    tB.getClass();
                    return tB;
                }
                T tB2 = oa4VarE.b(f, true);
                tB2.getClass();
                if (f >= Math.abs(Math.abs(function1.invoke(Float.valueOf(Math.abs(oa4VarE.f(tB2) - f3))).floatValue()) + f3)) {
                    return tB2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    T tB3 = oa4VarE.b(f, false);
                    tB3.getClass();
                    return tB3;
                }
                T tB4 = oa4VarE.b(f, false);
                tB4.getClass();
                float fAbs = Math.abs(f3 - Math.abs(function1.invoke(Float.valueOf(Math.abs(f3 - oa4VarE.f(tB4)))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return tB4;
                }
            }
        }
        return obj;
    }

    public final float d(float f) {
        float f2 = f(f);
        x2a x2aVar = this.j;
        cme cmeVar = (cme) x2aVar;
        float fG = Float.isNaN(cmeVar.g()) ? 0.0f : cmeVar.g();
        ((cme) x2aVar).q(f2);
        return f2 - fG;
    }

    public final oa4<T> e() {
        return (oa4) ((gme) this.n).getValue();
    }

    public final float f(float f) {
        cme cmeVar = (cme) this.j;
        return nic.B((Float.isNaN(cmeVar.g()) ? 0.0f : cmeVar.g()) + f, e().e(), e().g());
    }

    public final float g() {
        x2a x2aVar = this.j;
        if (!Float.isNaN(((cme) x2aVar).g())) {
            return ((cme) x2aVar).g();
        }
        r6.g("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final void h(T t) {
        ((gme) this.g).setValue(t);
    }

    public final void i(T t) {
        ((gme) this.m).setValue(t);
    }

    public final Object j(float f, c1f c1fVar) {
        Object value = ((gme) this.g).getValue();
        Object objC = c(g(), f, value);
        boolean zBooleanValue = this.d.invoke((T) objC).booleanValue();
        g13 g13Var = g13.a;
        if (zBooleanValue) {
            Object objB = androidx.compose.material3.internal.a.b(this, objC, f, c1fVar);
            return objB == g13Var ? objB : j6g.a;
        }
        Object objB2 = androidx.compose.material3.internal.a.b(this, value, f, c1fVar);
        return objB2 == g13Var ? objB2 : j6g.a;
    }
}
