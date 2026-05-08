package defpackage;

import app.rive.runtime.kotlin.renderers.RendererMetrics;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class f22<T, R> extends d22<T, R> {
    public final wu5<wi5<? super R>, T, lu2<? super j6g>, Object> e;

    @uh3(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ wi5<R> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ f22<T, R> this$0;

        /* JADX INFO: renamed from: f22$a$a, reason: collision with other inner class name */
        public static final class C0224a<T> implements wi5 {
            public final /* synthetic */ luc<ex7> a;
            public final /* synthetic */ e13 b;
            public final /* synthetic */ f22<T, R> c;
            public final /* synthetic */ wi5<R> d;

            /* JADX INFO: renamed from: f22$a$a$a, reason: collision with other inner class name */
            @uh3(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {RendererMetrics.SAMPLES}, m = "invokeSuspend")
            public static final class C0225a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                final /* synthetic */ wi5<R> $collector;
                final /* synthetic */ T $value;
                int label;
                final /* synthetic */ f22<T, R> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0225a(f22<T, R> f22Var, wi5<? super R> wi5Var, T t, lu2<? super C0225a> lu2Var) {
                    super(2, lu2Var);
                    this.this$0 = f22Var;
                    this.$collector = wi5Var;
                    this.$value = t;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new C0225a(this.this$0, this.$collector, this.$value, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                    return ((C0225a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to f22$a$a$a for r3v3 'this'  java.lang.Object
                    	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                    	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                    	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                    	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                    */
                @Override // defpackage.x81
                public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                    /*
                        r3 = this;
                        int r0 = r3.label
                        r1 = 1
                        if (r0 == 0) goto L12
                        if (r0 != r1) goto Lb
                        defpackage.r7d.b(r4)
                        goto L28
                    Lb:
                        java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.r6.g(r3)
                        r3 = 0
                        return r3
                    L12:
                        defpackage.r7d.b(r4)
                        f22<T, R> r4 = r3.this$0
                        wu5<wi5<? super R>, T, lu2<? super j6g>, java.lang.Object> r4 = r4.e
                        wi5<R> r0 = r3.$collector
                        T r2 = r3.$value
                        r3.label = r1
                        java.lang.Object r3 = r4.q(r0, r2, r3)
                        g13 r4 = defpackage.g13.a
                        if (r3 != r4) goto L28
                        return r4
                    L28:
                        j6g r3 = defpackage.j6g.a
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: f22.a.C0224a.C0225a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: renamed from: f22$a$a$b */
            @uh3(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {26}, m = "emit")
            public static final class b extends pu2 {
                Object L$0;
                Object L$1;
                Object L$2;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C0224a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0224a<? super T> c0224a, lu2<? super b> lu2Var) {
                    super(lu2Var);
                    this.this$0 = c0224a;
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.a(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0224a(luc<ex7> lucVar, e13 e13Var, f22<T, R> f22Var, wi5<? super R> wi5Var) {
                this.a = lucVar;
                this.b = e13Var;
                this.c = f22Var;
                this.d = wi5Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // defpackage.wi5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(T r6, defpackage.lu2<? super defpackage.j6g> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof f22.a.C0224a.b
                    if (r0 == 0) goto L13
                    r0 = r7
                    f22$a$a$b r0 = (f22.a.C0224a.b) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    f22$a$a$b r0 = new f22$a$a$b
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.result
                    int r1 = r0.label
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L36
                    if (r1 != r3) goto L30
                    java.lang.Object r5 = r0.L$2
                    ex7 r5 = (defpackage.ex7) r5
                    java.lang.Object r6 = r0.L$1
                    java.lang.Object r5 = r0.L$0
                    f22$a$a r5 = (f22.a.C0224a) r5
                    defpackage.r7d.b(r7)
                    goto L5a
                L30:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r5)
                    return r2
                L36:
                    defpackage.r7d.b(r7)
                    luc<ex7> r7 = r5.a
                    T r7 = r7.element
                    ex7 r7 = (defpackage.ex7) r7
                    if (r7 == 0) goto L5a
                    kotlinx.coroutines.flow.internal.ChildCancelledException r1 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r1.<init>()
                    r7.h(r1)
                    r0.L$0 = r5
                    r0.L$1 = r6
                    r0.L$2 = r7
                    r0.label = r3
                    java.lang.Object r7 = r7.s0(r0)
                    g13 r0 = defpackage.g13.a
                    if (r7 != r0) goto L5a
                    return r0
                L5a:
                    luc<ex7> r7 = r5.a
                    e13 r0 = r5.b
                    f22$a$a$a r1 = new f22$a$a$a
                    f22<T, R> r4 = r5.c
                    wi5<R> r5 = r5.d
                    r1.<init>(r4, r5, r6, r2)
                    i13 r5 = defpackage.i13.d
                    uqe r5 = defpackage.u63.Y(r0, r2, r5, r1, r3)
                    r7.element = r5
                    j6g r5 = defpackage.j6g.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: f22.a.C0224a.a(java.lang.Object, lu2):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(f22<T, R> f22Var, wi5<? super R> wi5Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = f22Var;
            this.$collector = wi5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.this$0, this.$collector, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type lu2 to f22$a for r6v3 'this'  lu2
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.x81
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 1
                if (r0 == 0) goto L12
                if (r0 != r1) goto Lb
                defpackage.r7d.b(r7)
                goto L34
            Lb:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                r6 = 0
                return r6
            L12:
                defpackage.r7d.b(r7)
                java.lang.Object r7 = r6.L$0
                e13 r7 = (defpackage.e13) r7
                luc r0 = new luc
                r0.<init>()
                f22<T, R> r2 = r6.this$0
                vi5<S> r3 = r2.d
                f22$a$a r4 = new f22$a$a
                wi5<R> r5 = r6.$collector
                r4.<init>(r0, r7, r2, r5)
                r6.label = r1
                java.lang.Object r6 = r3.e(r4, r6)
                g13 r7 = defpackage.g13.a
                if (r6 != r7) goto L34
                return r7
            L34:
                j6g r6 = defpackage.j6g.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: f22.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f22(wu5<? super wi5<? super R>, ? super T, ? super lu2<? super j6g>, ? extends Object> wu5Var, vi5<? extends T> vi5Var, v03 v03Var, int i, eo1 eo1Var) {
        super(i, eo1Var, v03Var, vi5Var);
        this.e = wu5Var;
    }

    @Override // defpackage.z12
    public final z12<R> k(v03 v03Var, int i, eo1 eo1Var) {
        return new f22(this.e, this.d, v03Var, i, eo1Var);
    }

    @Override // defpackage.d22
    public final Object n(wi5<? super R> wi5Var, lu2<? super j6g> lu2Var) {
        Object objD = f13.d(new a(this, wi5Var, null), lu2Var);
        return objD == g13.a ? objD : j6g.a;
    }
}
