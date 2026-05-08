package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", l = {646, 179}, m = "invokeSuspend")
public final class b0b extends c1f implements Function2<wi5<? super kza<Object>>, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ rza<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0b(rza<Object, Object> rzaVar, lu2<? super b0b> lu2Var) {
        super(2, lu2Var);
        this.this$0 = rzaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        b0b b0bVar = new b0b(this.this$0, lu2Var);
        b0bVar.L$0 = obj;
        return b0bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super kza<Object>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((b0b) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r0.a(r2, r6) == r4) goto L17;
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
            r1 = 2
            r2 = 1
            r3 = 0
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L27
            if (r0 == r2) goto L17
            if (r0 != r1) goto L11
            defpackage.r7d.b(r7)
            goto L64
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r3
        L17:
            java.lang.Object r0 = r6.L$2
            wi5 r0 = (defpackage.wi5) r0
            java.lang.Object r2 = r6.L$1
            z4a r2 = (defpackage.z4a) r2
            java.lang.Object r5 = r6.L$0
            e0b$a r5 = (e0b.a) r5
            defpackage.r7d.b(r7)
            goto L45
        L27:
            defpackage.r7d.b(r7)
            java.lang.Object r7 = r6.L$0
            r0 = r7
            wi5 r0 = (defpackage.wi5) r0
            rza<java.lang.Object, java.lang.Object> r7 = r6.this$0
            e0b$a<Key, Value> r5 = r7.j
            a5a r7 = r5.a
            r6.L$0 = r5
            r6.L$1 = r7
            r6.L$2 = r0
            r6.label = r2
            java.lang.Object r2 = r7.h(r6)
            if (r2 != r4) goto L44
            goto L63
        L44:
            r2 = r7
        L45:
            e0b<Key, Value> r7 = r5.b     // Catch: java.lang.Throwable -> L67
            h3a r7 = r7.j     // Catch: java.lang.Throwable -> L67
            yz8 r7 = r7.d()     // Catch: java.lang.Throwable -> L67
            r2.p(r3)
            kza$c r2 = new kza$c
            r2.<init>(r7, r3)
            r6.L$0 = r3
            r6.L$1 = r3
            r6.L$2 = r3
            r6.label = r1
            java.lang.Object r6 = r0.a(r2, r6)
            if (r6 != r4) goto L64
        L63:
            return r4
        L64:
            j6g r6 = defpackage.j6g.a
            return r6
        L67:
            r6 = move-exception
            r2.p(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
