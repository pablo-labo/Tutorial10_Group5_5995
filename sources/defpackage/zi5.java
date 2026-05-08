package defpackage;

import defpackage.kv8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {177}, m = "invokeSuspend")
public final class zi5 extends c1f implements Function2<mpb<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ v03 $context;
    final /* synthetic */ kv8 $lifecycle;
    final /* synthetic */ kv8.b $minActiveState;
    final /* synthetic */ vi5<Object> $this_collectAsStateWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    @uh3(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {179, 181}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ mpb<Object> $$this$produceState;
        final /* synthetic */ v03 $context;
        final /* synthetic */ vi5<Object> $this_collectAsStateWithLifecycle;
        int label;

        /* JADX INFO: renamed from: zi5$a$a, reason: collision with other inner class name */
        public static final class C0493a<T> implements wi5 {
            public final /* synthetic */ mpb<T> a;

            public C0493a(mpb<T> mpbVar) {
                this.a = mpbVar;
            }

            @Override // defpackage.wi5
            public final Object a(T t, lu2<? super j6g> lu2Var) {
                this.a.setValue(t);
                return j6g.a;
            }
        }

        @uh3(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", l = {182}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ mpb<Object> $$this$produceState;
            final /* synthetic */ vi5<Object> $this_collectAsStateWithLifecycle;
            int label;

            /* JADX INFO: renamed from: zi5$a$b$a, reason: collision with other inner class name */
            public static final class C0494a<T> implements wi5 {
                public final /* synthetic */ mpb<T> a;

                public C0494a(mpb<T> mpbVar) {
                    this.a = mpbVar;
                }

                @Override // defpackage.wi5
                public final Object a(T t, lu2<? super j6g> lu2Var) {
                    this.a.setValue(t);
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(vi5<Object> vi5Var, mpb<Object> mpbVar, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.$this_collectAsStateWithLifecycle = vi5Var;
                this.$$this$produceState = mpbVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.$this_collectAsStateWithLifecycle, this.$$this$produceState, lu2Var);
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
                    vi5<Object> vi5Var = this.$this_collectAsStateWithLifecycle;
                    C0494a c0494a = new C0494a(this.$$this$produceState);
                    this.label = 1;
                    Object objE = vi5Var.e(c0494a, this);
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
        public a(v03 v03Var, vi5<Object> vi5Var, mpb<Object> mpbVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$context = v03Var;
            this.$this_collectAsStateWithLifecycle = vi5Var;
            this.$$this$produceState = mpbVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$context, this.$this_collectAsStateWithLifecycle, this.$$this$produceState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r7.e(r1, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (defpackage.u63.q0(r7, r3, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        
            return r0;
         */
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
                if (r0 == 0) goto L16
                if (r0 == r3) goto L12
                if (r0 != r2) goto Lc
                goto L12
            Lc:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                return r1
            L12:
                defpackage.r7d.b(r7)
                goto L4b
            L16:
                defpackage.r7d.b(r7)
                v03 r7 = r6.$context
                vr4 r0 = defpackage.vr4.a
                boolean r7 = defpackage.wl7.b(r7, r0)
                g13 r0 = defpackage.g13.a
                if (r7 == 0) goto L37
                vi5<java.lang.Object> r7 = r6.$this_collectAsStateWithLifecycle
                zi5$a$a r1 = new zi5$a$a
                mpb<java.lang.Object> r2 = r6.$$this$produceState
                r1.<init>(r2)
                r6.label = r3
                java.lang.Object r6 = r7.e(r1, r6)
                if (r6 != r0) goto L4b
                goto L4a
            L37:
                v03 r7 = r6.$context
                zi5$a$b r3 = new zi5$a$b
                vi5<java.lang.Object> r4 = r6.$this_collectAsStateWithLifecycle
                mpb<java.lang.Object> r5 = r6.$$this$produceState
                r3.<init>(r4, r5, r1)
                r6.label = r2
                java.lang.Object r6 = defpackage.u63.q0(r7, r3, r6)
                if (r6 != r0) goto L4b
            L4a:
                return r0
            L4b:
                j6g r6 = defpackage.j6g.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: zi5.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi5(kv8 kv8Var, kv8.b bVar, v03 v03Var, vi5<Object> vi5Var, lu2<? super zi5> lu2Var) {
        super(2, lu2Var);
        this.$lifecycle = kv8Var;
        this.$minActiveState = bVar;
        this.$context = v03Var;
        this.$this_collectAsStateWithLifecycle = vi5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        zi5 zi5Var = new zi5(this.$lifecycle, this.$minActiveState, this.$context, this.$this_collectAsStateWithLifecycle, lu2Var);
        zi5Var.L$0 = obj;
        return zi5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mpb<Object> mpbVar, lu2<? super j6g> lu2Var) {
        return ((zi5) create(mpbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            mpb mpbVar = (mpb) this.L$0;
            kv8 kv8Var = this.$lifecycle;
            kv8.b bVar = this.$minActiveState;
            a aVar = new a(this.$context, this.$this_collectAsStateWithLifecycle, mpbVar, null);
            this.label = 1;
            Object objA = c2d.a(kv8Var, bVar, aVar, this);
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
