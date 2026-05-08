package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1", f = "LazyPagingItems.kt", l = {220, 222}, m = "invokeSuspend")
public final class ct8 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ v03 $context;
    final /* synthetic */ at8<Object> $lazyPagingItems;
    int label;

    @uh3(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1$1", f = "LazyPagingItems.kt", l = {223}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ at8<Object> $lazyPagingItems;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(at8<Object> at8Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$lazyPagingItems = at8Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$lazyPagingItems, lu2Var);
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
                at8<Object> at8Var = this.$lazyPagingItems;
                this.label = 1;
                Object objA = at8Var.a(this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct8(v03 v03Var, at8<Object> at8Var, lu2<? super ct8> lu2Var) {
        super(2, lu2Var);
        this.$context = v03Var;
        this.$lazyPagingItems = at8Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ct8(this.$context, this.$lazyPagingItems, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ct8) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r6.a(r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (defpackage.u63.q0(r6, r3, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        return r0;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r1
        L12:
            defpackage.r7d.b(r6)
            goto L42
        L16:
            defpackage.r7d.b(r6)
            v03 r6 = r5.$context
            vr4 r0 = defpackage.vr4.a
            boolean r6 = defpackage.wl7.b(r6, r0)
            g13 r0 = defpackage.g13.a
            if (r6 == 0) goto L30
            at8<java.lang.Object> r6 = r5.$lazyPagingItems
            r5.label = r3
            java.lang.Object r5 = r6.a(r5)
            if (r5 != r0) goto L42
            goto L41
        L30:
            v03 r6 = r5.$context
            ct8$a r3 = new ct8$a
            at8<java.lang.Object> r4 = r5.$lazyPagingItems
            r3.<init>(r4, r1)
            r5.label = r2
            java.lang.Object r5 = defpackage.u63.q0(r6, r3, r5)
            if (r5 != r0) goto L42
        L41:
            return r0
        L42:
            j6g r5 = defpackage.j6g.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
