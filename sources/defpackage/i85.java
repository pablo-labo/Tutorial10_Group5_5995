package defpackage;

import com.apollographql.apollo.exception.ApolloException;
import defpackage.pua;
import defpackage.rh0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i85 {
    public static final e a = new e();
    public static final b b = new b();

    public static final class a implements ph0 {

        /* JADX INFO: Add missing generic type declarations: [D] */
        /* JADX INFO: renamed from: i85$a$a, reason: collision with other inner class name */
        @uh3(c = "com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1", f = "FetchPolicyInterceptors.kt", l = {122, 124, 127}, m = "invokeSuspend", v = 1)
        public static final class C0266a<D> extends c1f implements Function2<wi5<? super sh0<D>>, lu2<? super j6g>, Object> {
            final /* synthetic */ qh0 $chain;
            final /* synthetic */ rh0<D> $request;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0266a(qh0 qh0Var, rh0<D> rh0Var, lu2<? super C0266a> lu2Var) {
                super(2, lu2Var);
                this.$chain = qh0Var;
                this.$request = rh0Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0266a c0266a = new C0266a(this.$chain, this.$request, lu2Var);
                c0266a.L$0 = obj;
                return c0266a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
                return ((C0266a) create((wi5) obj, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
            
                if (defpackage.wg2.x(r0, r11, r10) != r5) goto L22;
             */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    int r0 = r10.label
                    r1 = 0
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    g13 r5 = defpackage.g13.a
                    if (r0 == 0) goto L2b
                    if (r0 == r4) goto L23
                    if (r0 == r3) goto L1b
                    if (r0 != r2) goto L15
                    defpackage.r7d.b(r11)
                    goto L88
                L15:
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r10)
                    return r1
                L1b:
                    java.lang.Object r0 = r10.L$0
                    wi5 r0 = (defpackage.wi5) r0
                    defpackage.r7d.b(r11)
                    goto L75
                L23:
                    java.lang.Object r0 = r10.L$0
                    wi5 r0 = (defpackage.wi5) r0
                    defpackage.r7d.b(r11)
                    goto L5d
                L2b:
                    defpackage.r7d.b(r11)
                    java.lang.Object r11 = r10.L$0
                    wi5 r11 = (defpackage.wi5) r11
                    qh0 r0 = r10.$chain
                    rh0<D> r6 = r10.$request
                    rh0$a r6 = r6.a()
                    d85 r7 = new d85
                    r7.<init>()
                    k15 r8 = r6.c
                    k15 r7 = r8.d(r7)
                    r6.c = r7
                    rh0 r6 = r6.b()
                    vi5 r0 = r0.a(r6)
                    r10.L$0 = r11
                    r10.label = r4
                    java.lang.Object r0 = defpackage.wg2.X(r0, r10)
                    if (r0 != r5) goto L5a
                    goto L87
                L5a:
                    r9 = r0
                    r0 = r11
                    r11 = r9
                L5d:
                    sh0 r11 = (defpackage.sh0) r11
                    sh0$a r11 = r11.c()
                    r4 = 0
                    r11.h = r4
                    sh0 r11 = r11.b()
                    r10.L$0 = r0
                    r10.label = r3
                    java.lang.Object r11 = r0.a(r11, r10)
                    if (r11 != r5) goto L75
                    goto L87
                L75:
                    qh0 r11 = r10.$chain
                    rh0<D> r3 = r10.$request
                    vi5 r11 = r11.a(r3)
                    r10.L$0 = r1
                    r10.label = r2
                    java.lang.Object r10 = defpackage.wg2.x(r0, r11, r10)
                    if (r10 != r5) goto L88
                L87:
                    return r5
                L88:
                    j6g r10 = defpackage.j6g.a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: i85.a.C0266a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // defpackage.ph0
        public final <D extends pua.a> vi5<sh0<D>> a(rh0<D> rh0Var, qh0 qh0Var) {
            rh0Var.getClass();
            qh0Var.getClass();
            return new kjd(new C0266a(qh0Var, rh0Var, null));
        }
    }

    public static final class b implements ph0 {

        /* JADX INFO: Add missing generic type declarations: [D] */
        @uh3(c = "com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1", f = "FetchPolicyInterceptors.kt", l = {59, 60, 66}, m = "invokeSuspend", v = 1)
        public static final class a<D> extends c1f implements Function2<wi5<? super sh0<D>>, lu2<? super j6g>, Object> {
            final /* synthetic */ qh0 $chain;
            final /* synthetic */ rh0<D> $request;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qh0 qh0Var, rh0<D> rh0Var, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.$chain = qh0Var;
                this.$request = rh0Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.$chain, this.$request, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
                return ((a) create((wi5) obj, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
            
                if (defpackage.wg2.x(r3, r11, r10) == r5) goto L30;
             */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    int r0 = r10.label
                    r1 = 0
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    g13 r5 = defpackage.g13.a
                    if (r0 == 0) goto L2f
                    if (r0 == r4) goto L27
                    if (r0 == r3) goto L1b
                    if (r0 != r2) goto L15
                    defpackage.r7d.b(r11)
                    goto L9e
                L15:
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r10)
                    return r1
                L1b:
                    java.lang.Object r0 = r10.L$1
                    sh0 r0 = (defpackage.sh0) r0
                    java.lang.Object r3 = r10.L$0
                    wi5 r3 = (defpackage.wi5) r3
                    defpackage.r7d.b(r11)
                    goto L82
                L27:
                    java.lang.Object r0 = r10.L$0
                    wi5 r0 = (defpackage.wi5) r0
                    defpackage.r7d.b(r11)
                    goto L61
                L2f:
                    defpackage.r7d.b(r11)
                    java.lang.Object r11 = r10.L$0
                    wi5 r11 = (defpackage.wi5) r11
                    qh0 r0 = r10.$chain
                    rh0<D> r6 = r10.$request
                    rh0$a r6 = r6.a()
                    d85 r7 = new d85
                    r7.<init>()
                    k15 r8 = r6.c
                    k15 r7 = r8.d(r7)
                    r6.c = r7
                    rh0 r6 = r6.b()
                    vi5 r0 = r0.a(r6)
                    r10.L$0 = r11
                    r10.label = r4
                    java.lang.Object r0 = defpackage.wg2.X(r0, r10)
                    if (r0 != r5) goto L5e
                    goto L9d
                L5e:
                    r9 = r0
                    r0 = r11
                    r11 = r9
                L61:
                    sh0 r11 = (defpackage.sh0) r11
                    sh0$a r6 = r11.c()
                    com.apollographql.apollo.exception.ApolloException r7 = r11.e
                    if (r7 != 0) goto L6c
                    goto L6d
                L6c:
                    r4 = 0
                L6d:
                    r6.h = r4
                    sh0 r4 = r6.b()
                    r10.L$0 = r0
                    r10.L$1 = r11
                    r10.label = r3
                    java.lang.Object r3 = r0.a(r4, r10)
                    if (r3 != r5) goto L80
                    goto L9d
                L80:
                    r3 = r0
                    r0 = r11
                L82:
                    com.apollographql.apollo.exception.ApolloException r11 = r0.e
                    if (r11 != 0) goto L89
                    j6g r10 = defpackage.j6g.a
                    return r10
                L89:
                    qh0 r11 = r10.$chain
                    rh0<D> r0 = r10.$request
                    vi5 r11 = r11.a(r0)
                    r10.L$0 = r1
                    r10.L$1 = r1
                    r10.label = r2
                    java.lang.Object r10 = defpackage.wg2.x(r3, r11, r10)
                    if (r10 != r5) goto L9e
                L9d:
                    return r5
                L9e:
                    j6g r10 = defpackage.j6g.a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: i85.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // defpackage.ph0
        public final <D extends pua.a> vi5<sh0<D>> a(rh0<D> rh0Var, qh0 qh0Var) {
            rh0Var.getClass();
            qh0Var.getClass();
            return new kjd(new a(qh0Var, rh0Var, null));
        }
    }

    public static final class c implements ph0 {
        @Override // defpackage.ph0
        public final <D extends pua.a> vi5<sh0<D>> a(rh0<D> rh0Var, qh0 qh0Var) {
            rh0Var.getClass();
            qh0Var.getClass();
            rh0.a<D> aVarA = rh0Var.a();
            aVarA.c = aVarA.c.d(new d85());
            return qh0Var.a(aVarA.b());
        }
    }

    public static final class d implements ph0 {

        /* JADX INFO: Add missing generic type declarations: [D] */
        @uh3(c = "com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1", f = "FetchPolicyInterceptors.kt", l = {95, 105, 106}, m = "invokeSuspend", v = 1)
        public static final class a<D> extends c1f implements Function2<wi5<? super sh0<D>>, lu2<? super j6g>, Object> {
            final /* synthetic */ qh0 $chain;
            final /* synthetic */ rh0<D> $request;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX INFO: renamed from: i85$d$a$a, reason: collision with other inner class name */
            @uh3(c = "com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1", f = "FetchPolicyInterceptors.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class C0267a extends c1f implements Function2<sh0<D>, lu2<? super j6g>, Object> {
                final /* synthetic */ luc<ApolloException> $networkException;
                /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0267a(lu2 lu2Var, luc lucVar) {
                    super(2, lu2Var);
                    this.$networkException = lucVar;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    C0267a c0267a = new C0267a(lu2Var, this.$networkException);
                    c0267a.L$0 = obj;
                    return c0267a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
                    return ((C0267a) create((sh0) obj, lu2Var)).invokeSuspend(j6g.a);
                }

                /* JADX WARN: Type inference failed for: r2v3, types: [T, com.apollographql.apollo.exception.ApolloException] */
                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    if (this.label != 0) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    ?? r2 = ((sh0) this.L$0).e;
                    if (r2 != 0) {
                        luc<ApolloException> lucVar = this.$networkException;
                        if (lucVar.element == null) {
                            lucVar.element = r2;
                        }
                    }
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qh0 qh0Var, rh0<D> rh0Var, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.$chain = qh0Var;
                this.$request = rh0Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.$chain, this.$request, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
                return ((a) create((wi5) obj, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
            
                if (r0.a((defpackage.sh0) r11, r10) != r5) goto L35;
             */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
                /*
                    r10 = this;
                    int r0 = r10.label
                    r1 = 3
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    g13 r5 = defpackage.g13.a
                    if (r0 == 0) goto L31
                    if (r0 == r4) goto L24
                    if (r0 == r2) goto L1b
                    if (r0 != r1) goto L15
                    defpackage.r7d.b(r11)
                    goto Lb4
                L15:
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r10)
                    return r3
                L1b:
                    java.lang.Object r0 = r10.L$0
                    wi5 r0 = (defpackage.wi5) r0
                    defpackage.r7d.b(r11)
                    goto La7
                L24:
                    java.lang.Object r0 = r10.L$1
                    luc r0 = (defpackage.luc) r0
                    java.lang.Object r4 = r10.L$0
                    wi5 r4 = (defpackage.wi5) r4
                    defpackage.r7d.b(r11)
                    r11 = r4
                    goto L73
                L31:
                    defpackage.r7d.b(r11)
                    java.lang.Object r11 = r10.L$0
                    wi5 r11 = (defpackage.wi5) r11
                    luc r0 = new luc
                    r0.<init>()
                    qh0 r6 = r10.$chain
                    rh0<D> r7 = r10.$request
                    vi5 r6 = r6.a(r7)
                    i85$d$a$a r7 = new i85$d$a$a
                    r7.<init>(r3, r0)
                    r10.L$0 = r11
                    r10.L$1 = r0
                    r10.label = r4
                    defpackage.wg2.y(r11)
                    j85 r4 = new j85
                    r4.<init>(r11, r0)
                    pk5$a r8 = new pk5$a
                    r8.<init>(r4, r7)
                    java.lang.Object r4 = r6.e(r8, r10)
                    if (r4 != r5) goto L64
                    goto L66
                L64:
                    j6g r4 = defpackage.j6g.a
                L66:
                    if (r4 != r5) goto L69
                    goto L6b
                L69:
                    j6g r4 = defpackage.j6g.a
                L6b:
                    if (r4 != r5) goto L6e
                    goto L70
                L6e:
                    j6g r4 = defpackage.j6g.a
                L70:
                    if (r4 != r5) goto L73
                    goto Lb3
                L73:
                    T r0 = r0.element
                    if (r0 != 0) goto L7a
                    j6g r10 = defpackage.j6g.a
                    return r10
                L7a:
                    qh0 r0 = r10.$chain
                    rh0<D> r4 = r10.$request
                    rh0$a r4 = r4.a()
                    d85 r6 = new d85
                    r6.<init>()
                    k15 r7 = r4.c
                    k15 r6 = r7.d(r6)
                    r4.c = r6
                    rh0 r4 = r4.b()
                    vi5 r0 = r0.a(r4)
                    r10.L$0 = r11
                    r10.L$1 = r3
                    r10.label = r2
                    java.lang.Object r0 = defpackage.wg2.X(r0, r10)
                    if (r0 != r5) goto La4
                    goto Lb3
                La4:
                    r9 = r0
                    r0 = r11
                    r11 = r9
                La7:
                    sh0 r11 = (defpackage.sh0) r11
                    r10.L$0 = r3
                    r10.label = r1
                    java.lang.Object r10 = r0.a(r11, r10)
                    if (r10 != r5) goto Lb4
                Lb3:
                    return r5
                Lb4:
                    j6g r10 = defpackage.j6g.a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: i85.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // defpackage.ph0
        public final <D extends pua.a> vi5<sh0<D>> a(rh0<D> rh0Var, qh0 qh0Var) {
            rh0Var.getClass();
            qh0Var.getClass();
            return new kjd(new a(qh0Var, rh0Var, null));
        }
    }

    public static final class e implements ph0 {
        @Override // defpackage.ph0
        public final <D extends pua.a> vi5<sh0<D>> a(rh0<D> rh0Var, qh0 qh0Var) {
            rh0Var.getClass();
            qh0Var.getClass();
            return qh0Var.a(rh0Var);
        }
    }
}
