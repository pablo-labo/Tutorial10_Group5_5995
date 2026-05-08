package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", f = "PageFetcherSnapshot.kt", l = {646, 233}, m = "invokeSuspend")
public final class c0b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ rza<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0b(rza<Object, Object> rzaVar, lu2<? super c0b> lu2Var) {
        super(2, lu2Var);
        this.this$0 = rzaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new c0b(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((c0b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (defpackage.rza.a(r0, r8, defpackage.zz8.b, r7) == r4) goto L17;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 2
            r2 = 1
            r3 = 0
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L27
            if (r0 == r2) goto L17
            if (r0 != r1) goto L11
            defpackage.r7d.b(r8)
            goto L66
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r3
        L17:
            java.lang.Object r0 = r7.L$2
            rza r0 = (defpackage.rza) r0
            java.lang.Object r2 = r7.L$1
            z4a r2 = (defpackage.z4a) r2
            java.lang.Object r5 = r7.L$0
            e0b$a r5 = (e0b.a) r5
            defpackage.r7d.b(r8)
            goto L40
        L27:
            defpackage.r7d.b(r8)
            rza<java.lang.Object, java.lang.Object> r0 = r7.this$0
            e0b$a<Key, Value> r5 = r0.j
            a5a r8 = r5.a
            r7.L$0 = r5
            r7.L$1 = r8
            r7.L$2 = r0
            r7.label = r2
            java.lang.Object r2 = r8.h(r7)
            if (r2 != r4) goto L3f
            goto L65
        L3f:
            r2 = r8
        L40:
            e0b<Key, Value> r8 = r5.b     // Catch: java.lang.Throwable -> L69
            go1 r5 = r8.g     // Catch: java.lang.Throwable -> L69
            v12 r5 = defpackage.wg2.t(r5)     // Catch: java.lang.Throwable -> L69
            g0b r6 = new g0b     // Catch: java.lang.Throwable -> L69
            r6.<init>(r8, r3)     // Catch: java.lang.Throwable -> L69
            mj5 r8 = new mj5     // Catch: java.lang.Throwable -> L69
            r8.<init>(r5, r6)     // Catch: java.lang.Throwable -> L69
            r2.p(r3)
            r7.L$0 = r3
            r7.L$1 = r3
            r7.L$2 = r3
            r7.label = r1
            zz8 r1 = defpackage.zz8.b
            java.lang.Object r7 = defpackage.rza.a(r0, r8, r1, r7)
            if (r7 != r4) goto L66
        L65:
            return r4
        L66:
            j6g r7 = defpackage.j6g.a
            return r7
        L69:
            r7 = move-exception
            r2.p(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c0b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
