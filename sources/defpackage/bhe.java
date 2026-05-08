package defpackage;

import defpackage.yge;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
public final class bhe extends c1f implements Function2<yge.a<Object>, lu2<? super j6g>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ yge<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhe(yge<Object> ygeVar, lu2<? super bhe> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ygeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        bhe bheVar = new bhe(this.this$0, lu2Var);
        bheVar.L$0 = obj;
        return bheVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(yge.a<Object> aVar, lu2<? super j6g> lu2Var) {
        return ((bhe) create(aVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        if (r5 == r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        if (defpackage.yge.b(r5.this$0, (yge.a.b) r6, r5) == r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        return r4;
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
            goto L7a
        L16:
            defpackage.r7d.b(r6)
            java.lang.Object r6 = r5.L$0
            yge$a r6 = (yge.a) r6
            boolean r0 = r6 instanceof yge.a.C0483a
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L69
            yge<java.lang.Object> r0 = r5.this$0
            yge$a$a r6 = (yge.a.C0483a) r6
            r5.label = r3
            gse r2 = r0.V
            java.lang.Object r2 = r2.getValue()
            bse r2 = (defpackage.bse) r2
            boolean r3 = r2 instanceof defpackage.td3
            if (r3 == 0) goto L36
            goto L5e
        L36:
            boolean r3 = r2 instanceof defpackage.aqc
            if (r3 == 0) goto L48
            bse<T> r6 = r6.a
            if (r2 != r6) goto L5e
            java.lang.Object r5 = r0.f(r5)
            if (r5 != r4) goto L45
            goto L60
        L45:
            j6g r5 = defpackage.j6g.a
            goto L60
        L48:
            t5g r6 = defpackage.t5g.a
            boolean r6 = defpackage.wl7.b(r2, r6)
            if (r6 == 0) goto L5a
            java.lang.Object r5 = r0.f(r5)
            if (r5 != r4) goto L57
            goto L60
        L57:
            j6g r5 = defpackage.j6g.a
            goto L60
        L5a:
            boolean r5 = r2 instanceof defpackage.ec5
            if (r5 != 0) goto L63
        L5e:
            j6g r5 = defpackage.j6g.a
        L60:
            if (r5 != r4) goto L7a
            goto L79
        L63:
            java.lang.String r5 = "Can't read in final state."
            defpackage.r6.g(r5)
            return r1
        L69:
            boolean r0 = r6 instanceof yge.a.b
            if (r0 == 0) goto L7a
            yge<java.lang.Object> r0 = r5.this$0
            yge$a$b r6 = (yge.a.b) r6
            r5.label = r2
            java.lang.Object r5 = defpackage.yge.b(r0, r6, r5)
            if (r5 != r4) goto L7a
        L79:
            return r4
        L7a:
            j6g r5 = defpackage.j6g.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhe.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
