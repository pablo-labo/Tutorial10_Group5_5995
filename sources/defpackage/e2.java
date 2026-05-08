package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e2<T> implements vi5<T>, rw1<T> {

    @uh3(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    public static final class a extends pu2 {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ e2<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e2<T> e2Var, lu2<? super a> lu2Var) {
            super(lu2Var);
            this.this$0 = e2Var;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.e(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.vi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.wi5<? super T> r5, defpackage.lu2<? super defpackage.j6g> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof e2.a
            if (r0 == 0) goto L13
            r0 = r6
            e2$a r0 = (e2.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            e2$a r0 = new e2$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            java.lang.Object r4 = r0.L$0
            hjd r4 = (defpackage.hjd) r4
            defpackage.r7d.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L55
        L29:
            r5 = move-exception
            goto L63
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L32:
            defpackage.r7d.b(r6)
            hjd r6 = new hjd
            v03 r1 = r0.getContext()
            r6.<init>(r5, r1)
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L61
            r0.label = r2     // Catch: java.lang.Throwable -> L61
            kjd r4 = (defpackage.kjd) r4     // Catch: java.lang.Throwable -> L5d
            kotlin.jvm.functions.Function2<wi5<? super T>, lu2<? super j6g>, java.lang.Object> r4 = r4.a     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = r4.invoke(r6, r0)     // Catch: java.lang.Throwable -> L5d
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L4f
            goto L51
        L4f:
            j6g r4 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L5d
        L51:
            if (r4 != r5) goto L54
            return r5
        L54:
            r4 = r6
        L55:
            r4.releaseIntercepted()
            j6g r4 = defpackage.j6g.a
            return r4
        L5b:
            r5 = r4
            goto L5f
        L5d:
            r4 = move-exception
            goto L5b
        L5f:
            r4 = r6
            goto L63
        L61:
            r5 = move-exception
            goto L5f
        L63:
            r4.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e2.e(wi5, lu2):java.lang.Object");
    }
}
