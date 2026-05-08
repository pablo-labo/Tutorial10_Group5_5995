package defpackage;

import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nfe {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @uh3(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", l = {49}, m = "invokeSuspend")
    public static final class a<T> extends c1f implements Function2<wi5<? super T>, lu2<? super j6g>, Object> {
        final /* synthetic */ Function2<cge<T>, lu2<? super j6g>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: nfe$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", l = {67, 68}, m = "invokeSuspend")
        public static final class C0330a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ wi5<T> $$this$flow;
            final /* synthetic */ Function2<cge<T>, lu2<? super j6g>, Object> $block;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX INFO: renamed from: nfe$a$a$a, reason: collision with other inner class name */
            @uh3(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", f = "SimpleChannelFlow.kt", l = {RumViewScope.SLOW_RENDERED_THRESHOLD_FPS}, m = "invokeSuspend")
            public static final class C0331a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                final /* synthetic */ Function2<cge<T>, lu2<? super j6g>, Object> $block;
                final /* synthetic */ u12<T> $channel;
                int label;

                /* JADX INFO: renamed from: nfe$a$a$a$a, reason: collision with other inner class name */
                @uh3(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", f = "SimpleChannelFlow.kt", l = {60}, m = "invokeSuspend")
                public static final class C0332a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                    final /* synthetic */ Function2<cge<T>, lu2<? super j6g>, Object> $block;
                    final /* synthetic */ u12<T> $channel;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0332a(u12<T> u12Var, Function2<? super cge<T>, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super C0332a> lu2Var) {
                        super(2, lu2Var);
                        this.$channel = u12Var;
                        this.$block = function2;
                    }

                    @Override // defpackage.x81
                    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                        C0332a c0332a = new C0332a(this.$channel, this.$block, lu2Var);
                        c0332a.L$0 = obj;
                        return c0332a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                        return ((C0332a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                    }

                    @Override // defpackage.x81
                    public final Object invokeSuspend(Object obj) {
                        int i = this.label;
                        if (i == 0) {
                            r7d.b(obj);
                            fge fgeVar = new fge((e13) this.L$0, this.$channel);
                            Function2<cge<T>, lu2<? super j6g>, Object> function2 = this.$block;
                            this.label = 1;
                            Object objInvoke = function2.invoke(fgeVar, this);
                            g13 g13Var = g13.a;
                            if (objInvoke == g13Var) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0331a(u12<T> u12Var, Function2<? super cge<T>, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super C0331a> lu2Var) {
                    super(2, lu2Var);
                    this.$channel = u12Var;
                    this.$block = function2;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new C0331a(this.$channel, this.$block, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                    return ((C0331a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    int i = this.label;
                    try {
                        if (i == 0) {
                            r7d.b(obj);
                            C0332a c0332a = new C0332a(this.$channel, this.$block, null);
                            this.label = 1;
                            Object objD = f13.d(c0332a, this);
                            g13 g13Var = g13.a;
                            if (objD == g13Var) {
                                return g13Var;
                            }
                        } else {
                            if (i != 1) {
                                r6.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r7d.b(obj);
                        }
                        this.$channel.k(null);
                    } catch (Throwable th) {
                        this.$channel.k(th);
                    }
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0330a(wi5<? super T> wi5Var, Function2<? super cge<T>, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super C0330a> lu2Var) {
                super(2, lu2Var);
                this.$$this$flow = wi5Var;
                this.$block = function2;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0330a c0330a = new C0330a(this.$$this$flow, this.$block, lu2Var);
                c0330a.L$0 = obj;
                return c0330a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0330a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0074 -> B:7:0x0018). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type lu2 to nfe$a$a for r8v2 'this'  lu2
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // defpackage.x81
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    int r0 = r8.label
                    r1 = 2
                    r2 = 1
                    r3 = 0
                    g13 r4 = defpackage.g13.a
                    if (r0 == 0) goto L2d
                    if (r0 == r2) goto L21
                    if (r0 != r1) goto L1b
                    java.lang.Object r0 = r8.L$1
                    g22 r0 = (defpackage.g22) r0
                    java.lang.Object r5 = r8.L$0
                    ex7 r5 = (defpackage.ex7) r5
                    defpackage.r7d.b(r9)
                L18:
                    r9 = r5
                    r5 = r0
                    goto L4b
                L1b:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r8)
                    return r3
                L21:
                    java.lang.Object r0 = r8.L$1
                    g22 r0 = (defpackage.g22) r0
                    java.lang.Object r5 = r8.L$0
                    ex7 r5 = (defpackage.ex7) r5
                    defpackage.r7d.b(r9)
                    goto L5c
                L2d:
                    defpackage.r7d.b(r9)
                    java.lang.Object r9 = r8.L$0
                    e13 r9 = (defpackage.e13) r9
                    r0 = 0
                    r5 = 6
                    go1 r0 = defpackage.h22.a(r0, r5, r3)
                    nfe$a$a$a r5 = new nfe$a$a$a
                    kotlin.jvm.functions.Function2<cge<T>, lu2<? super j6g>, java.lang.Object> r6 = r8.$block
                    r5.<init>(r0, r6, r3)
                    r6 = 3
                    uqe r9 = defpackage.u63.Y(r9, r3, r3, r5, r6)
                    go1$a r5 = new go1$a
                    r5.<init>()
                L4b:
                    r8.L$0 = r9
                    r8.L$1 = r5
                    r8.label = r2
                    java.lang.Object r0 = r5.b(r8)
                    if (r0 != r4) goto L58
                    goto L76
                L58:
                    r7 = r5
                    r5 = r9
                    r9 = r0
                    r0 = r7
                L5c:
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    if (r9 == 0) goto L77
                    java.lang.Object r9 = r0.next()
                    wi5<T> r6 = r8.$$this$flow
                    r8.L$0 = r5
                    r8.L$1 = r0
                    r8.label = r1
                    java.lang.Object r9 = r6.a(r9, r8)
                    if (r9 != r4) goto L18
                L76:
                    return r4
                L77:
                    r5.h(r3)
                    j6g r8 = defpackage.j6g.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: nfe.a.C0330a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super cge<T>, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$block = function2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$block, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
            return ((a) create((wi5) obj, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                C0330a c0330a = new C0330a((wi5) this.L$0, this.$block, null);
                this.label = 1;
                Object objD = f13.d(c0330a, this);
                g13 g13Var = g13.a;
                if (objD == g13Var) {
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

    public static final <T> vi5<T> a(Function2<? super cge<T>, ? super lu2<? super j6g>, ? extends Object> function2) {
        return wg2.l(new kjd(new a(function2, null)), -2);
    }
}
