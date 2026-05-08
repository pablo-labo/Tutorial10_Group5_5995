package defpackage;

import android.util.Log;
import com.datadog.android.trace.AndroidTracer;
import defpackage.lza;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", l = {136}, m = "invokeSuspend")
public final class mza extends c1f implements Function2<cge<l2b<Object>>, lu2<? super j6g>, Object> {
    final /* synthetic */ r0d<Object, Object> $remoteMediator;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ lza<Object, Object> this$0;

    @uh3(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", l = {AndroidTracer.SPAN_ID_BIT_SIZE, AndroidTracer.SPAN_ID_BIT_SIZE}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<wi5<? super Boolean>, lu2<? super j6g>, Object> {
        final /* synthetic */ x0d<Object, Object> $remoteMediatorAccessor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0d<Object, Object> x0dVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$remoteMediatorAccessor = x0dVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$remoteMediatorAccessor, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(wi5<? super Boolean> wi5Var, lu2<? super j6g> lu2Var) {
            return ((a) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (r7 == r4) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        
            if (r0.a(r7, r6) != r4) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            return r4;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L1f
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.r7d.b(r7)
                goto L4f
            L11:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                return r1
            L17:
                java.lang.Object r0 = r6.L$0
                wi5 r0 = (defpackage.wi5) r0
                defpackage.r7d.b(r7)
                goto L36
            L1f:
                defpackage.r7d.b(r7)
                java.lang.Object r7 = r6.L$0
                r0 = r7
                wi5 r0 = (defpackage.wi5) r0
                x0d<java.lang.Object, java.lang.Object> r7 = r6.$remoteMediatorAccessor
                if (r7 == 0) goto L39
                r6.L$0 = r0
                r6.label = r3
                java.lang.Object r7 = r7.d(r6)
                if (r7 != r4) goto L36
                goto L4e
            L36:
                r0d$a r7 = (r0d.a) r7
                goto L3a
            L39:
                r7 = r1
            L3a:
                r0d$a r5 = r0d.a.a
                if (r7 != r5) goto L3f
                goto L40
            L3f:
                r3 = 0
            L40:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
                r6.L$0 = r1
                r6.label = r2
                java.lang.Object r6 = r0.a(r7, r6)
                if (r6 != r4) goto L4f
            L4e:
                return r4
            L4f:
                j6g r6 = defpackage.j6g.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mza.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", l = {73, 77}, m = "invokeSuspend")
    public static final class b extends c1f implements wu5<lza.a<Object, Object>, Boolean, lu2<? super lza.a<Object, Object>>, Object> {
        final /* synthetic */ x0d<Object, Object> $remoteMediatorAccessor;
        /* synthetic */ Object L$0;
        Object L$1;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ lza<Object, Object> this$0;

        public /* synthetic */ class a extends qv5 implements gu5<j6g> {
            @Override // defpackage.gu5
            public final j6g invoke() {
                ((lza) this.receiver).c.c(Boolean.TRUE);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lu2 lu2Var, lza lzaVar, x0d x0dVar) {
            super(3, lu2Var);
            this.$remoteMediatorAccessor = x0dVar;
            this.this$0 = lzaVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00e5  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 278
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: mza.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.wu5
        public final Object q(lza.a<Object, Object> aVar, Boolean bool, lu2<? super lza.a<Object, Object>> lu2Var) {
            boolean zBooleanValue = bool.booleanValue();
            b bVar = new b(lu2Var, this.this$0, this.$remoteMediatorAccessor);
            bVar.L$0 = aVar;
            bVar.Z$0 = zBooleanValue;
            return bVar.invokeSuspend(j6g.a);
        }
    }

    @uh3(c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", f = "PageFetcher.kt", l = {}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<kza<Object>, lu2<? super j6g>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            c cVar = new c(2, lu2Var);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kza<Object> kzaVar, lu2<? super j6g> lu2Var) {
            return ((c) create(kzaVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            kza kzaVar = (kza) this.L$0;
            if (Log.isLoggable("Paging", 2)) {
                Log.v("Paging", "Sent " + kzaVar, null);
            }
            return j6g.a;
        }
    }

    public /* synthetic */ class d implements wi5, ev5 {
        public final /* synthetic */ cge<l2b<Object>> a;

        public d(cge<l2b<Object>> cgeVar) {
            this.a = cgeVar;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            Object objB = this.a.b(lu2Var, (l2b) obj);
            return objB == g13.a ? objB : j6g.a;
        }

        @Override // defpackage.ev5
        public final vu5<?> c() {
            return new qv5(2, this.a, cge.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof wi5) && (obj instanceof ev5)) {
                return c().equals(((ev5) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    @uh3(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", l = {105}, m = "invokeSuspend")
    public static final class e extends c1f implements wu5<wi5<? super l2b<Object>>, lza.a<Object, Object>, lu2<? super j6g>, Object> {
        final /* synthetic */ x0d $remoteMediatorAccessor$inlined;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ lza this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(lu2 lu2Var, lza lzaVar, x0d x0dVar) {
            super(3, lu2Var);
            this.this$0 = lzaVar;
            this.$remoteMediatorAccessor$inlined = x0dVar;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                wi5 wi5Var = (wi5) this.L$0;
                lza.a aVar = (lza.a) this.L$1;
                lza lzaVar = this.this$0;
                rza<Key, Value> rzaVar = aVar.a;
                qy7 qy7Var = aVar.c;
                x0d x0dVar = this.$remoteMediatorAccessor$inlined;
                lzaVar.getClass();
                pk5 pk5Var = new pk5(x0dVar == null ? rzaVar.l : nfe.a(new mw1(qy7Var, new qza(x0dVar, rzaVar, new h3a(), null), null)), new c(2, null));
                this.this$0.d.getClass();
                l2b l2bVar = new l2b(pk5Var, new lza.c(), new lza.b(aVar.a), k2b.a);
                this.label = 1;
                Object objA = wi5Var.a(l2bVar, this);
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

        @Override // defpackage.wu5
        public final Object q(wi5<? super l2b<Object>> wi5Var, lza.a<Object, Object> aVar, lu2<? super j6g> lu2Var) {
            e eVar = new e(lu2Var, this.this$0, this.$remoteMediatorAccessor$inlined);
            eVar.L$0 = wi5Var;
            eVar.L$1 = aVar;
            return eVar.invokeSuspend(j6g.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mza(r0d<Object, Object> r0dVar, lza<Object, Object> lzaVar, lu2<? super mza> lu2Var) {
        super(2, lu2Var);
        this.$remoteMediator = r0dVar;
        this.this$0 = lzaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        mza mzaVar = new mza(this.$remoteMediator, this.this$0, lu2Var);
        mzaVar.L$0 = obj;
        return mzaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(cge<l2b<Object>> cgeVar, lu2<? super j6g> lu2Var) {
        return ((mza) create(cgeVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        s0d s0dVar;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            cge cgeVar = (cge) this.L$0;
            r0d<Object, Object> r0dVar = this.$remoteMediator;
            if (r0dVar != null) {
                cgeVar.getClass();
                s0dVar = new s0d(cgeVar, r0dVar);
            } else {
                s0dVar = null;
            }
            vi5 vi5VarA = nfe.a(new cj5(new ok5(new kjd(new bj5(null, new mj5((jo2) this.this$0.c.b, new a(s0dVar, null)), new b(null, this.this$0, s0dVar), null))), new e(null, this.this$0, s0dVar), null));
            d dVar = new d(cgeVar);
            this.label = 1;
            Object objE = vi5VarA.e(dVar, this);
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
