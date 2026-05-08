package defpackage;

import defpackage.kza;
import defpackage.xz8;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", l = {203}, m = "invokeSuspend")
public final class qza extends c1f implements Function2<cge<kza<Object>>, lu2<? super j6g>, Object> {
    final /* synthetic */ x0d<Object, Object> $accessor;
    final /* synthetic */ h3a $sourceStates;
    final /* synthetic */ rza<Object, Object> $this_injectRemoteEvents;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ cge<kza<Object>> a;

        public a(cge<kza<Object>> cgeVar) {
            this.a = cgeVar;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            Object objB = this.a.b(lu2Var, (kza) obj);
            return objB == g13.a ? objB : j6g.a;
        }
    }

    @uh3(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", l = {161}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<cge<kza<Object>>, lu2<? super j6g>, Object> {
        final /* synthetic */ vi5 $otherFlow;
        final /* synthetic */ h3a $sourceStates$inlined;
        final /* synthetic */ vi5 $this_combineWithoutBatching;
        private /* synthetic */ Object L$0;
        int label;

        @uh3(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", l = {141}, m = "invokeSuspend")
        public static final class a extends c1f implements xu5<yz8, kza<Object>, sb2, lu2<? super j6g>, Object> {
            final /* synthetic */ cge<kza<Object>> $$this$simpleChannelFlow;
            final /* synthetic */ h3a $sourceStates$inlined;
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(cge cgeVar, lu2 lu2Var, h3a h3aVar) {
                super(4, lu2Var);
                this.$sourceStates$inlined = h3aVar;
                this.$$this$simpleChannelFlow = cgeVar;
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    Object obj2 = this.L$0;
                    Object obj3 = this.L$1;
                    sb2 sb2Var = (sb2) this.L$2;
                    cge<kza<Object>> cgeVar = this.$$this$simpleChannelFlow;
                    Object cVar = (kza) obj3;
                    yz8 yz8Var = (yz8) obj2;
                    if (sb2Var == sb2.b) {
                        cVar = new kza.c(this.$sourceStates$inlined.d(), yz8Var);
                    } else if (cVar instanceof kza.b) {
                        h3a h3aVar = this.$sourceStates$inlined;
                        kza.b bVar = (kza.b) cVar;
                        yz8 yz8Var2 = bVar.e;
                        h3aVar.b(yz8Var2);
                        zz8 zz8Var = bVar.a;
                        List<nrf<T>> list = bVar.b;
                        int i2 = bVar.c;
                        int i3 = bVar.d;
                        zz8Var.getClass();
                        list.getClass();
                        cVar = new kza.b(zz8Var, list, i2, i3, yz8Var2, yz8Var);
                    } else if (cVar instanceof kza.a) {
                        this.$sourceStates$inlined.c(null, xz8.c.c);
                    } else {
                        if (!(cVar instanceof kza.c)) {
                            if (cVar instanceof kza.d) {
                                r6.g("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                                return null;
                            }
                            l.g();
                            return null;
                        }
                        h3a h3aVar2 = this.$sourceStates$inlined;
                        yz8 yz8Var3 = ((kza.c) cVar).a;
                        h3aVar2.b(yz8Var3);
                        cVar = new kza.c(yz8Var3, yz8Var);
                    }
                    this.label = 1;
                    Object objB = cgeVar.b(this, cVar);
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
                return j6g.a;
            }

            @Override // defpackage.xu5
            public final Object j(yz8 yz8Var, kza<Object> kzaVar, sb2 sb2Var, lu2<? super j6g> lu2Var) {
                a aVar = new a(this.$$this$simpleChannelFlow, lu2Var, this.$sourceStates$inlined);
                aVar.L$0 = yz8Var;
                aVar.L$1 = kzaVar;
                aVar.L$2 = sb2Var;
                return aVar.invokeSuspend(j6g.a);
            }
        }

        /* JADX INFO: renamed from: qza$b$b, reason: collision with other inner class name */
        @uh3(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {147}, m = "invokeSuspend")
        public static final class C0402b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ cge<kza<Object>> $$this$simpleChannelFlow;
            final /* synthetic */ vi5 $flow;
            final /* synthetic */ AtomicInteger $incompleteFlows;
            final /* synthetic */ int $index;
            final /* synthetic */ v5g $unbatchedFlowCombiner;
            int label;

            /* JADX INFO: renamed from: qza$b$b$a */
            public static final class a<T> implements wi5 {
                public final /* synthetic */ v5g a;
                public final /* synthetic */ int b;

                /* JADX INFO: renamed from: qza$b$b$a$a, reason: collision with other inner class name */
                public static final class C0403a extends pu2 {
                    int label;
                    /* synthetic */ Object result;

                    public C0403a(lu2 lu2Var) {
                        super(lu2Var);
                    }

                    @Override // defpackage.x81
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                public a(v5g v5gVar, int i) {
                    this.a = v5gVar;
                    this.b = i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
                
                    if (defpackage.hwf.f(r0) == r4) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // defpackage.wi5
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object a(java.lang.Object r6, defpackage.lu2<? super defpackage.j6g> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof qza.b.C0402b.a.C0403a
                        if (r0 == 0) goto L13
                        r0 = r7
                        qza$b$b$a$a r0 = (qza.b.C0402b.a.C0403a) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        qza$b$b$a$a r0 = new qza$b$b$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        int r1 = r0.label
                        r2 = 2
                        r3 = 1
                        g13 r4 = defpackage.g13.a
                        if (r1 == 0) goto L35
                        if (r1 == r3) goto L31
                        if (r1 != r2) goto L2a
                        defpackage.r7d.b(r7)
                        goto L4e
                    L2a:
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.r6.g(r5)
                        r5 = 0
                        return r5
                    L31:
                        defpackage.r7d.b(r7)
                        goto L45
                    L35:
                        defpackage.r7d.b(r7)
                        r0.label = r3
                        v5g r7 = r5.a
                        int r5 = r5.b
                        java.lang.Object r5 = r7.a(r5, r6, r0)
                        if (r5 != r4) goto L45
                        goto L4d
                    L45:
                        r0.label = r2
                        java.lang.Object r5 = defpackage.hwf.f(r0)
                        if (r5 != r4) goto L4e
                    L4d:
                        return r4
                    L4e:
                        j6g r5 = defpackage.j6g.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: qza.b.C0402b.a.a(java.lang.Object, lu2):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0402b(vi5 vi5Var, AtomicInteger atomicInteger, cge cgeVar, v5g v5gVar, int i, lu2 lu2Var) {
                super(2, lu2Var);
                this.$flow = vi5Var;
                this.$incompleteFlows = atomicInteger;
                this.$unbatchedFlowCombiner = v5gVar;
                this.$index = i;
                this.$$this$simpleChannelFlow = cgeVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0402b(this.$flow, this.$incompleteFlows, this.$$this$simpleChannelFlow, this.$unbatchedFlowCombiner, this.$index, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0402b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                int i = this.label;
                try {
                    if (i == 0) {
                        r7d.b(obj);
                        vi5 vi5Var = this.$flow;
                        a aVar = new a(this.$unbatchedFlowCombiner, this.$index);
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
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.$$this$simpleChannelFlow.k(null);
                    }
                    return j6g.a;
                } finally {
                    if (this.$incompleteFlows.decrementAndGet() == 0) {
                        this.$$this$simpleChannelFlow.k(null);
                    }
                }
            }
        }

        public static final class c extends mj8 implements gu5<j6g> {
            final /* synthetic */ ae2 $parentJob;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(qy7 qy7Var) {
                super(0);
                this.$parentJob = qy7Var;
            }

            @Override // defpackage.gu5
            public final j6g invoke() {
                this.$parentJob.h(null);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vi5 vi5Var, vi5 vi5Var2, lu2 lu2Var, h3a h3aVar) {
            super(2, lu2Var);
            this.$this_combineWithoutBatching = vi5Var;
            this.$otherFlow = vi5Var2;
            this.$sourceStates$inlined = h3aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = new b(this.$this_combineWithoutBatching, this.$otherFlow, lu2Var, this.$sourceStates$inlined);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(cge<kza<Object>> cgeVar, lu2<? super j6g> lu2Var) {
            return ((b) create(cgeVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                cge cgeVar = (cge) this.L$0;
                AtomicInteger atomicInteger = new AtomicInteger(2);
                v5g v5gVar = new v5g(new a(cgeVar, null, this.$sourceStates$inlined));
                qy7 qy7VarF = u63.f();
                int i2 = 0;
                vi5[] vi5VarArr = {this.$this_combineWithoutBatching, this.$otherFlow};
                int i3 = 0;
                while (i3 < 2) {
                    u63.Y(cgeVar, qy7VarF, null, new C0402b(vi5VarArr[i3], atomicInteger, cgeVar, v5gVar, i2, null), 2);
                    i3++;
                    i2++;
                }
                c cVar = new c(qy7VarF);
                this.label = 1;
                Object objN = cgeVar.N(cVar, this);
                g13 g13Var = g13.a;
                if (objN == g13Var) {
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
    public qza(x0d<Object, Object> x0dVar, rza<Object, Object> rzaVar, h3a h3aVar, lu2<? super qza> lu2Var) {
        super(2, lu2Var);
        this.$accessor = x0dVar;
        this.$this_injectRemoteEvents = rzaVar;
        this.$sourceStates = h3aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        qza qzaVar = new qza(this.$accessor, this.$this_injectRemoteEvents, this.$sourceStates, lu2Var);
        qzaVar.L$0 = obj;
        return qzaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(cge<kza<Object>> cgeVar, lu2<? super j6g> lu2Var) {
        return ((qza) create(cgeVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            cge cgeVar = (cge) this.L$0;
            vi5 vi5VarA = nfe.a(new b(this.$accessor.getState(), this.$this_injectRemoteEvents.l, null, this.$sourceStates));
            a aVar = new a(cgeVar);
            this.label = 1;
            Object objE = vi5VarA.e(aVar, this);
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
