package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {68, 69}, m = "invokeSuspend")
public final class nme extends c1f implements Function2<mpb<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ v03 $context;
    final /* synthetic */ vi5<Object> $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ mpb<Object> a;

        public a(mpb<Object> mpbVar) {
            this.a = mpbVar;
        }

        @Override // defpackage.wi5
        public final Object a(T t, lu2<? super j6g> lu2Var) {
            this.a.setValue(t);
            return j6g.a;
        }
    }

    @uh3(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", l = {69}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ mpb<Object> $$this$produceState;
        final /* synthetic */ vi5<Object> $this_collectAsState;
        int label;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ mpb<Object> a;

            public a(mpb<Object> mpbVar) {
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
            this.$this_collectAsState = vi5Var;
            this.$$this$produceState = mpbVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$this_collectAsState, this.$$this$produceState, lu2Var);
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
                vi5<Object> vi5Var = this.$this_collectAsState;
                a aVar = new a(this.$$this$produceState);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nme(v03 v03Var, vi5<Object> vi5Var, lu2<? super nme> lu2Var) {
        super(2, lu2Var);
        this.$context = v03Var;
        this.$this_collectAsState = vi5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        nme nmeVar = new nme(this.$context, this.$this_collectAsState, lu2Var);
        nmeVar.L$0 = obj;
        return nmeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mpb<Object> mpbVar, lu2<? super j6g> lu2Var) {
        return ((nme) create(mpbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r0.e(r1, r6) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (defpackage.u63.q0(r0, r3, r6) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        return r4;
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
            java.lang.Object r7 = r6.L$0
            mpb r7 = (defpackage.mpb) r7
            v03 r0 = r6.$context
            vr4 r4 = defpackage.vr4.a
            boolean r0 = defpackage.wl7.b(r0, r4)
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L39
            vi5<java.lang.Object> r0 = r6.$this_collectAsState
            nme$a r1 = new nme$a
            r1.<init>(r7)
            r6.label = r3
            java.lang.Object r6 = r0.e(r1, r6)
            if (r6 != r4) goto L4b
            goto L4a
        L39:
            v03 r0 = r6.$context
            nme$b r3 = new nme$b
            vi5<java.lang.Object> r5 = r6.$this_collectAsState
            r3.<init>(r5, r7, r1)
            r6.label = r2
            java.lang.Object r6 = defpackage.u63.q0(r0, r3, r6)
            if (r6 != r4) goto L4b
        L4a:
            return r4
        L4b:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nme.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
