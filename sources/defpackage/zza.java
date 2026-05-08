package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", l = {646, 168, 657}, m = "invokeSuspend")
public final class zza extends c1f implements Function2<cge<kza<Object>>, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ rza<Object, Object> this$0;

    @uh3(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", l = {91}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ cge<kza<Object>> $$this$cancelableChannelFlow;
        int label;
        final /* synthetic */ rza<Object, Object> this$0;

        /* JADX INFO: renamed from: zza$a$a, reason: collision with other inner class name */
        public static final class C0496a<T> implements wi5 {
            public final /* synthetic */ cge<kza<Object>> a;

            /* JADX INFO: renamed from: zza$a$a$a, reason: collision with other inner class name */
            @uh3(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", f = "PageFetcherSnapshot.kt", l = {95}, m = "emit")
            public static final class C0497a extends pu2 {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C0496a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0497a(C0496a<? super T> c0496a, lu2<? super C0497a> lu2Var) {
                    super(lu2Var);
                    this.this$0 = c0496a;
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.a(null, this);
                }
            }

            public C0496a(cge<kza<Object>> cgeVar) {
                this.a = cgeVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // defpackage.wi5
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(defpackage.kza<java.lang.Object> r5, defpackage.lu2<? super defpackage.j6g> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof zza.a.C0496a.C0497a
                    if (r0 == 0) goto L13
                    r0 = r6
                    zza$a$a$a r0 = (zza.a.C0496a.C0497a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    zza$a$a$a r0 = new zza$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.result
                    int r1 = r0.label
                    r2 = 1
                    if (r1 == 0) goto L2c
                    if (r1 != r2) goto L25
                    defpackage.r7d.b(r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3c
                    goto L3c
                L25:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r4)
                    r4 = 0
                    return r4
                L2c:
                    defpackage.r7d.b(r6)
                    cge<kza<java.lang.Object>> r4 = r4.a     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3c
                    r0.label = r2     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3c
                    java.lang.Object r4 = r4.b(r0, r5)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3c
                    g13 r5 = defpackage.g13.a
                    if (r4 != r5) goto L3c
                    return r5
                L3c:
                    j6g r4 = defpackage.j6g.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: zza.a.C0496a.a(kza, lu2):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rza<Object, Object> rzaVar, cge<kza<Object>> cgeVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = rzaVar;
            this.$$this$cancelableChannelFlow = cgeVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.this$0, this.$$this$cancelableChannelFlow, lu2Var);
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
                v12 v12VarT = wg2.t(this.this$0.i);
                C0496a c0496a = new C0496a(this.$$this$cancelableChannelFlow);
                this.label = 1;
                Object objE = v12VarT.e(c0496a, this);
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

    @uh3(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", l = {105}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ u12<j6g> $retryChannel;
        int label;
        final /* synthetic */ rza<Object, Object> this$0;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ u12<j6g> a;

            public a(u12<j6g> u12Var) {
                this.a = u12Var;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                this.a.f((j6g) obj);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u12 u12Var, lu2 lu2Var, rza rzaVar) {
            super(2, lu2Var);
            this.this$0 = rzaVar;
            this.$retryChannel = u12Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$retryChannel, lu2Var, this.this$0);
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
                vi5<j6g> vi5Var = this.this$0.d;
                a aVar = new a(this.$retryChannel);
                this.label = 1;
                Object objE = vi5Var.e(aVar, this);
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

    @uh3(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", l = {110}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ u12<j6g> $retryChannel;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ rza<Object, Object> this$0;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ rza<Object, Object> a;
            public final /* synthetic */ e13 b;

            /* JADX INFO: renamed from: zza$c$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0498a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[zz8.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    a = iArr;
                }
            }

            public a(rza<Object, Object> rzaVar, e13 e13Var) {
                this.a = rzaVar;
                this.b = e13Var;
            }

            @Override // defpackage.wi5
            public final /* bridge */ /* synthetic */ Object a(Object obj, lu2 lu2Var) {
                return c(lu2Var);
            }

            /* JADX WARN: Code restructure failed: missing block: B:113:0x03b8, code lost:
            
                if (r12.h(r0) == r5) goto L155;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x02d2, code lost:
            
                if (r12.h(r0) == r5) goto L155;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:100:0x034a  */
            /* JADX WARN: Removed duplicated region for block: B:101:0x034e  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x039e  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x03a2  */
            /* JADX WARN: Removed duplicated region for block: B:129:0x03e1 A[PHI: r7 r8 r9
  0x03e1: PHI (r7v47 e13) = (r7v24 e13), (r7v49 e13) binds: [B:89:0x02fe, B:123:0x03d5] A[DONT_GENERATE, DONT_INLINE]
  0x03e1: PHI (r8v34 rza<java.lang.Object, java.lang.Object>) = (r8v15 rza<java.lang.Object, java.lang.Object>), (r8v36 rza<java.lang.Object, java.lang.Object>) binds: [B:89:0x02fe, B:123:0x03d5] A[DONT_GENERATE, DONT_INLINE]
  0x03e1: PHI (r9v22 yz8) = (r9v10 yz8), (r9v23 yz8) binds: [B:89:0x02fe, B:123:0x03d5] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:131:0x03e7  */
            /* JADX WARN: Removed duplicated region for block: B:136:0x0419  */
            /* JADX WARN: Removed duplicated region for block: B:137:0x041b  */
            /* JADX WARN: Removed duplicated region for block: B:141:0x042e  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x0432  */
            /* JADX WARN: Removed duplicated region for block: B:151:0x047b  */
            /* JADX WARN: Removed duplicated region for block: B:153:0x047f  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x04a9  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0248  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0257  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0265  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0269  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x02b7  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x02bd  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x02f7  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0300  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0335  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x0337  */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, zza$c$a, zza$c$a<T>] */
            /* JADX WARN: Type inference failed for: r12v1, types: [z4a] */
            /* JADX WARN: Type inference failed for: r12v102 */
            /* JADX WARN: Type inference failed for: r12v103 */
            /* JADX WARN: Type inference failed for: r12v106 */
            /* JADX WARN: Type inference failed for: r12v107 */
            /* JADX WARN: Type inference failed for: r12v14, types: [z4a] */
            /* JADX WARN: Type inference failed for: r12v2, types: [z4a] */
            /* JADX WARN: Type inference failed for: r12v3, types: [z4a] */
            /* JADX WARN: Type inference failed for: r12v39, types: [z4a] */
            /* JADX WARN: Type inference failed for: r12v67, types: [z4a] */
            /* JADX WARN: Type inference failed for: r12v98 */
            /* JADX WARN: Type inference failed for: r12v99 */
            /* JADX WARN: Type inference failed for: r7v1 */
            /* JADX WARN: Type inference failed for: r7v2, types: [zza$c$a] */
            /* JADX WARN: Type inference failed for: r7v66 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object c(defpackage.lu2 r13) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1258
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: zza.c.a.c(lu2):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u12 u12Var, lu2 lu2Var, rza rzaVar) {
            super(2, lu2Var);
            this.$retryChannel = u12Var;
            this.this$0 = rzaVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            c cVar = new c(this.$retryChannel, lu2Var, this.this$0);
            cVar.L$0 = obj;
            return cVar;
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
                e13 e13Var = (e13) this.L$0;
                v12 v12VarT = wg2.t(this.$retryChannel);
                a aVar = new a(this.this$0, e13Var);
                this.label = 1;
                Object objE = v12VarT.e(aVar, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(rza<Object, Object> rzaVar, lu2<? super zza> lu2Var) {
        super(2, lu2Var);
        this.this$0 = rzaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        zza zzaVar = new zza(this.this$0, lu2Var);
        zzaVar.L$0 = obj;
        return zzaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(cge<kza<Object>> cgeVar, lu2<? super j6g> lu2Var) {
        return ((zza) create(cgeVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zza.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
