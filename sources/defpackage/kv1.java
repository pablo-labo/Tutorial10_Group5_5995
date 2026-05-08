package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class kv1<T> extends a22<T> {
    public final Function2<upb<? super T>, lu2<? super j6g>, Object> e;

    @uh3(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    public static final class a extends pu2 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(pu2 pu2Var) {
            super(pu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kv1.this.j(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kv1(Function2<? super upb<? super T>, ? super lu2<? super j6g>, ? extends Object> function2, v03 v03Var, int i, eo1 eo1Var) {
        super(function2, v03Var, i, eo1Var);
        this.e = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.a22, defpackage.z12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.upb<? super T> r5, defpackage.lu2<? super defpackage.j6g> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kv1.a
            if (r0 == 0) goto L13
            r0 = r6
            kv1$a r0 = (kv1.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L1a
        L13:
            kv1$a r0 = new kv1$a
            pu2 r6 = (defpackage.pu2) r6
            r0.<init>(r6)
        L1a:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            r5 = r4
            upb r5 = (defpackage.upb) r5
            defpackage.r7d.b(r6)
            goto L43
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L33:
            defpackage.r7d.b(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = super.j(r5, r0)
            g13 r6 = defpackage.g13.a
            if (r4 != r6) goto L43
            return r6
        L43:
            boolean r4 = r5.l()
            if (r4 == 0) goto L4c
            j6g r4 = defpackage.j6g.a
            return r4
        L4c:
            java.lang.String r4 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            defpackage.r6.g(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv1.j(upb, lu2):java.lang.Object");
    }

    @Override // defpackage.a22, defpackage.z12
    public final z12<T> k(v03 v03Var, int i, eo1 eo1Var) {
        return new kv1(this.e, v03Var, i, eo1Var);
    }
}
