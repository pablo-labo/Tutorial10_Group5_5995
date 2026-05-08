package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1", f = "LazyPagingItems.kt", l = {210, 212}, m = "invokeSuspend")
public final class bt8 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ v03 $context;
    final /* synthetic */ at8<Object> $lazyPagingItems;
    int label;

    @uh3(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1", f = "LazyPagingItems.kt", l = {213}, m = "invokeSuspend")
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
                Object objQ = wg2.q(at8Var.a, new ys8(at8Var, null), this);
                Object obj2 = g13.a;
                if (objQ != obj2) {
                    objQ = j6g.a;
                }
                if (objQ == obj2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt8(v03 v03Var, at8<Object> at8Var, lu2<? super bt8> lu2Var) {
        super(2, lu2Var);
        this.$context = v03Var;
        this.$lazyPagingItems = at8Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new bt8(this.$context, this.$lazyPagingItems, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((bt8) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r5 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (defpackage.u63.q0(r6, r3, r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
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
            goto L4e
        L16:
            defpackage.r7d.b(r6)
            v03 r6 = r5.$context
            vr4 r0 = defpackage.vr4.a
            boolean r6 = defpackage.wl7.b(r6, r0)
            g13 r0 = defpackage.g13.a
            if (r6 == 0) goto L3c
            at8<java.lang.Object> r6 = r5.$lazyPagingItems
            r5.label = r3
            vi5<l2b<T>> r2 = r6.a
            ys8 r3 = new ys8
            r3.<init>(r6, r1)
            java.lang.Object r5 = defpackage.wg2.q(r2, r3, r5)
            if (r5 != r0) goto L37
            goto L39
        L37:
            j6g r5 = defpackage.j6g.a
        L39:
            if (r5 != r0) goto L4e
            goto L4d
        L3c:
            v03 r6 = r5.$context
            bt8$a r3 = new bt8$a
            at8<java.lang.Object> r4 = r5.$lazyPagingItems
            r3.<init>(r4, r1)
            r5.label = r2
            java.lang.Object r5 = defpackage.u63.q0(r6, r3, r5)
            if (r5 != r0) goto L4e
        L4d:
            return r0
        L4e:
            j6g r5 = defpackage.j6g.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
