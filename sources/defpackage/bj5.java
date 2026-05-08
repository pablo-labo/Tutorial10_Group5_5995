package defpackage;

import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", l = {54, RumViewScope.SLOW_RENDERED_THRESHOLD_FPS}, m = "invokeSuspend")
public final class bj5 extends c1f implements Function2<wi5<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ Object $initial;
    final /* synthetic */ wu5<Object, Object, lu2<Object>, Object> $operation;
    final /* synthetic */ vi5<Object> $this_simpleScan;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ luc<Object> a;
        public final /* synthetic */ wu5<Object, T, lu2<Object>, Object> b;
        public final /* synthetic */ wi5<Object> c;

        /* JADX INFO: renamed from: bj5$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.paging.FlowExtKt$simpleScan$1$1", f = "FlowExt.kt", l = {56, 57}, m = "emit")
        public static final class C0094a extends pu2 {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0094a(a<? super T> aVar, lu2<? super C0094a> lu2Var) {
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

        /* JADX WARN: Multi-variable type inference failed */
        public a(luc<Object> lucVar, wu5<Object, ? super T, ? super lu2<Object>, ? extends Object> wu5Var, wi5<Object> wi5Var) {
            this.a = lucVar;
            this.b = wu5Var;
            this.c = wi5Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
        
            if (r7.a(r8, r0) == r5) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.wi5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(T r8, defpackage.lu2<? super defpackage.j6g> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof bj5.a.C0094a
                if (r0 == 0) goto L13
                r0 = r9
                bj5$a$a r0 = (bj5.a.C0094a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                bj5$a$a r0 = new bj5$a$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                int r1 = r0.label
                r2 = 0
                r3 = 2
                r4 = 1
                g13 r5 = defpackage.g13.a
                if (r1 == 0) goto L3d
                if (r1 == r4) goto L31
                if (r1 != r3) goto L2b
                defpackage.r7d.b(r9)
                goto L6c
            L2b:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r7)
                return r2
            L31:
                java.lang.Object r7 = r0.L$1
                luc r7 = (defpackage.luc) r7
                java.lang.Object r8 = r0.L$0
                bj5$a r8 = (bj5.a) r8
                defpackage.r7d.b(r9)
                goto L57
            L3d:
                defpackage.r7d.b(r9)
                luc<java.lang.Object> r9 = r7.a
                T r1 = r9.element
                r0.L$0 = r7
                r0.L$1 = r9
                r0.label = r4
                wu5<java.lang.Object, T, lu2<java.lang.Object>, java.lang.Object> r4 = r7.b
                java.lang.Object r8 = r4.q(r1, r8, r0)
                if (r8 != r5) goto L53
                goto L6b
            L53:
                r6 = r8
                r8 = r7
                r7 = r9
                r9 = r6
            L57:
                r7.element = r9
                wi5<java.lang.Object> r7 = r8.c
                luc<java.lang.Object> r8 = r8.a
                T r8 = r8.element
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r7 = r7.a(r8, r0)
                if (r7 != r5) goto L6c
            L6b:
                return r5
            L6c:
                j6g r7 = defpackage.j6g.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: bj5.a.a(java.lang.Object, lu2):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bj5(Object obj, vi5<Object> vi5Var, wu5<Object, Object, ? super lu2<Object>, ? extends Object> wu5Var, lu2<? super bj5> lu2Var) {
        super(2, lu2Var);
        this.$initial = obj;
        this.$this_simpleScan = vi5Var;
        this.$operation = wu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        bj5 bj5Var = new bj5(this.$initial, this.$this_simpleScan, this.$operation, lu2Var);
        bj5Var.L$0 = obj;
        return bj5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<Object> wi5Var, lu2<? super j6g> lu2Var) {
        return ((bj5) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r8.e(r5, r7) == r4) goto L16;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 0
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L23
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.r7d.b(r8)
            goto L57
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r1
        L17:
            java.lang.Object r0 = r7.L$1
            luc r0 = (defpackage.luc) r0
            java.lang.Object r3 = r7.L$0
            wi5 r3 = (defpackage.wi5) r3
            defpackage.r7d.b(r8)
            goto L41
        L23:
            defpackage.r7d.b(r8)
            java.lang.Object r8 = r7.L$0
            wi5 r8 = (defpackage.wi5) r8
            luc r0 = new luc
            r0.<init>()
            java.lang.Object r5 = r7.$initial
            r0.element = r5
            r7.L$0 = r8
            r7.L$1 = r0
            r7.label = r3
            java.lang.Object r3 = r8.a(r5, r7)
            if (r3 != r4) goto L40
            goto L56
        L40:
            r3 = r8
        L41:
            vi5<java.lang.Object> r8 = r7.$this_simpleScan
            bj5$a r5 = new bj5$a
            wu5<java.lang.Object, java.lang.Object, lu2<java.lang.Object>, java.lang.Object> r6 = r7.$operation
            r5.<init>(r0, r6, r3)
            r7.L$0 = r1
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r7 = r8.e(r5, r7)
            if (r7 != r4) goto L57
        L56:
            return r4
        L57:
            j6g r7 = defpackage.j6g.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
