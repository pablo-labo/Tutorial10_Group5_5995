package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ju1<T> {
    public final fh5<T> a;
    public final nde b;
    public final jxe c;
    public final uqe d;
    public final kjd e;

    @uh3(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", l = {102}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<wi5<? super kza<T>>, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ju1<T> this$0;

        /* JADX INFO: renamed from: ju1$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", l = {}, m = "invokeSuspend")
        public static final class C0283a extends c1f implements Function2<ma7<? extends kza<T>>, lu2<? super Boolean>, Object> {
            /* synthetic */ Object L$0;
            int label;

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0283a c0283a = new C0283a(2, lu2Var);
                c0283a.L$0 = obj;
                return c0283a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, lu2<? super Boolean> lu2Var) {
                return ((C0283a) create((ma7) obj, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r7d.b(obj);
                    return Boolean.valueOf(((ma7) this.L$0) != null);
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public static final class b<T> implements wi5 {
            public final /* synthetic */ juc a;
            public final /* synthetic */ wi5<kza<T>> b;

            /* JADX INFO: renamed from: ju1$a$b$a, reason: collision with other inner class name */
            @uh3(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", f = "CachedPageEventFlow.kt", l = {105}, m = "emit")
            public static final class C0284a extends pu2 {
                Object L$0;
                Object L$1;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ b<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0284a(b<? super T> bVar, lu2<? super C0284a> lu2Var) {
                    super(lu2Var);
                    this.this$0 = bVar;
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.a(null, this);
                }
            }

            public b(wi5 wi5Var, juc jucVar) {
                this.a = jucVar;
                this.b = wi5Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // defpackage.wi5
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(defpackage.ma7<? extends defpackage.kza<T>> r5, defpackage.lu2<? super defpackage.j6g> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ju1.a.b.C0284a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ju1$a$b$a r0 = (ju1.a.b.C0284a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    ju1$a$b$a r0 = new ju1$a$b$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.result
                    int r1 = r0.label
                    r2 = 1
                    if (r1 == 0) goto L35
                    if (r1 != r2) goto L2e
                    java.lang.Object r4 = r0.L$1
                    r5 = r4
                    ma7 r5 = (defpackage.ma7) r5
                    java.lang.Object r4 = r0.L$0
                    ju1$a$b r4 = (ju1.a.b) r4
                    defpackage.r7d.b(r6)
                    goto L56
                L2e:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r4)
                    r4 = 0
                    return r4
                L35:
                    defpackage.r7d.b(r6)
                    r5.getClass()
                    int r6 = r5.a
                    juc r1 = r4.a
                    int r1 = r1.element
                    if (r6 <= r1) goto L5c
                    T r6 = r5.b
                    r0.L$0 = r4
                    r0.L$1 = r5
                    r0.label = r2
                    wi5<kza<T>> r1 = r4.b
                    java.lang.Object r6 = r1.a(r6, r0)
                    g13 r0 = defpackage.g13.a
                    if (r6 != r0) goto L56
                    return r0
                L56:
                    juc r4 = r4.a
                    int r5 = r5.a
                    r4.element = r5
                L5c:
                    j6g r4 = defpackage.j6g.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: ju1.a.b.a(ma7, lu2):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ju1<T> ju1Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = ju1Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.this$0, lu2Var);
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
                wi5 wi5Var = (wi5) this.L$0;
                juc jucVar = new juc();
                jucVar.element = Integer.MIN_VALUE;
                wj5 wj5Var = new wj5(this.this$0.c, new C0283a(2, null));
                b bVar = new b(wi5Var, jucVar);
                this.label = 1;
                Object objE = wj5Var.e(bVar, this);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
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

    @uh3(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", l = {76}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ vi5<kza<T>> $src;
        int label;
        final /* synthetic */ ju1<T> this$0;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ ju1<T> a;

            /* JADX INFO: renamed from: ju1$b$a$a, reason: collision with other inner class name */
            @uh3(c = "androidx.paging.CachedPageEventFlow$job$1$1", f = "CachedPageEventFlow.kt", l = {77, 78}, m = "emit")
            public static final class C0285a extends pu2 {
                Object L$0;
                Object L$1;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0285a(a<? super T> aVar, lu2<? super C0285a> lu2Var) {
                    super(lu2Var);
                    this.this$0 = aVar;
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.a(null, this);
                }
            }

            public a(ju1<T> ju1Var) {
                this.a = ju1Var;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
            
                if (r6.b(r7, r0) == r5) goto L21;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // defpackage.wi5
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(defpackage.ma7<? extends defpackage.kza<T>> r7, defpackage.lu2<? super defpackage.j6g> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof ju1.b.a.C0285a
                    if (r0 == 0) goto L13
                    r0 = r8
                    ju1$b$a$a r0 = (ju1.b.a.C0285a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    ju1$b$a$a r0 = new ju1$b$a$a
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.result
                    int r1 = r0.label
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    g13 r5 = defpackage.g13.a
                    if (r1 == 0) goto L3e
                    if (r1 == r4) goto L31
                    if (r1 != r3) goto L2b
                    defpackage.r7d.b(r8)
                    goto L63
                L2b:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r6)
                    return r2
                L31:
                    java.lang.Object r6 = r0.L$1
                    r7 = r6
                    ma7 r7 = (defpackage.ma7) r7
                    java.lang.Object r6 = r0.L$0
                    ju1$b$a r6 = (ju1.b.a) r6
                    defpackage.r7d.b(r8)
                    goto L52
                L3e:
                    defpackage.r7d.b(r8)
                    ju1<T> r8 = r6.a
                    nde r8 = r8.b
                    r0.L$0 = r6
                    r0.L$1 = r7
                    r0.label = r4
                    java.lang.Object r8 = r8.a(r7, r0)
                    if (r8 != r5) goto L52
                    goto L62
                L52:
                    ju1<T> r6 = r6.a
                    fh5<T> r6 = r6.a
                    r0.L$0 = r2
                    r0.L$1 = r2
                    r0.label = r3
                    java.lang.Object r6 = r6.b(r7, r0)
                    if (r6 != r5) goto L63
                L62:
                    return r5
                L63:
                    j6g r6 = defpackage.j6g.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ju1.b.a.a(ma7, lu2):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(vi5<? extends kza<T>> vi5Var, ju1<T> ju1Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$src = vi5Var;
            this.this$0 = ju1Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$src, this.this$0, lu2Var);
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
                vi5<kza<T>> vi5Var = this.$src;
                a aVar = new a(this.this$0);
                this.label = 1;
                Object objE = vi5Var.e(new qk5(aVar, new juc()), this);
                Object obj2 = g13.a;
                if (objE != obj2) {
                    objE = j6g.a;
                }
                if (objE == obj2) {
                    return obj2;
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

    public static final class c extends mj8 implements Function1<Throwable, j6g> {
        final /* synthetic */ ju1<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ju1<T> ju1Var) {
            super(1);
            this.this$0 = ju1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Throwable th) {
            this.this$0.b.b(null);
            return j6g.a;
        }
    }

    @uh3(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = {62, 67}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<wi5<? super ma7<? extends kza<T>>>, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ ju1<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ju1<T> ju1Var, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.this$0 = ju1Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            d dVar = new d(this.this$0, lu2Var);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
            return ((d) create((wi5) obj, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        
            if (r5 == r3) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                int r0 = r4.label
                r1 = 2
                r2 = 1
                g13 r3 = defpackage.g13.a
                if (r0 == 0) goto L27
                if (r0 == r2) goto L1f
                if (r0 != r1) goto L18
                java.lang.Object r0 = r4.L$1
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r2 = r4.L$0
                wi5 r2 = (defpackage.wi5) r2
                defpackage.r7d.b(r5)
                goto L4f
            L18:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r4)
                r4 = 0
                return r4
            L1f:
                java.lang.Object r0 = r4.L$0
                wi5 r0 = (defpackage.wi5) r0
                defpackage.r7d.b(r5)
                goto L3e
            L27:
                defpackage.r7d.b(r5)
                java.lang.Object r5 = r4.L$0
                r0 = r5
                wi5 r0 = (defpackage.wi5) r0
                ju1<T> r5 = r4.this$0
                fh5<T> r5 = r5.a
                r4.L$0 = r0
                r4.label = r2
                java.io.Serializable r5 = r5.a(r4)
                if (r5 != r3) goto L3e
                goto L67
            L3e:
                java.util.List r5 = (java.util.List) r5
                ju1<T> r2 = r4.this$0
                uqe r2 = r2.d
                r2.start()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
                r2 = r0
                r0 = r5
            L4f:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L68
                java.lang.Object r5 = r0.next()
                ma7 r5 = (defpackage.ma7) r5
                r4.L$0 = r2
                r4.L$1 = r0
                r4.label = r1
                java.lang.Object r5 = r2.a(r5, r4)
                if (r5 != r3) goto L4f
            L67:
                return r3
            L68:
                j6g r4 = defpackage.j6g.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ju1.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ju1(vi5<? extends kza<T>> vi5Var, e13 e13Var) {
        e13Var.getClass();
        this.a = new fh5<>();
        nde ndeVarC = wg2.c(1, Integer.MAX_VALUE, eo1.a);
        this.b = ndeVarC;
        this.c = new jxe(ndeVarC, new d(this, null));
        uqe uqeVarY = u63.Y(e13Var, null, i13.b, new b(vi5Var, this, null), 1);
        uqeVarY.d0(new c(this));
        this.d = uqeVarY;
        this.e = new kjd(new a(this, null));
    }
}
