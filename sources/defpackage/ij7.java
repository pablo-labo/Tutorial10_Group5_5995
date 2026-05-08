package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
public final class ij7 extends c1f implements Function2<e13, lu2<Object>, Object> {
    final /* synthetic */ gu5<Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij7(gu5<Object> gu5Var, lu2<? super ij7> lu2Var) {
        super(2, lu2Var);
        this.$block = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        ij7 ij7Var = new ij7(this.$block, lu2Var);
        ij7Var.L$0 = obj;
        return ij7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<Object> lu2Var) {
        return ((ij7) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        return r4.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r0.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        throw r4;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 0
            if (r0 != 0) goto L55
            defpackage.r7d.b(r5)
            java.lang.Object r5 = r4.L$0
            e13 r5 = (defpackage.e13) r5
            v03 r5 = r5.getCoroutineContext()
            gu5<java.lang.Object> r4 = r4.$block
            clf r0 = new clf     // Catch: java.lang.InterruptedException -> L48
            r0.<init>()     // Catch: java.lang.InterruptedException -> L48
            ex7 r5 = defpackage.u63.I(r5)     // Catch: java.lang.InterruptedException -> L48
            o74 r5 = defpackage.u63.T(r5, r0)     // Catch: java.lang.InterruptedException -> L48
            r0.f = r5     // Catch: java.lang.InterruptedException -> L48
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.clf.V     // Catch: java.lang.InterruptedException -> L48
        L23:
            int r2 = r5.get(r0)     // Catch: java.lang.InterruptedException -> L48
            if (r2 == 0) goto L34
            r5 = 2
            if (r2 == r5) goto L3b
            r5 = 3
            if (r2 != r5) goto L30
            goto L3b
        L30:
            defpackage.clf.l(r2)     // Catch: java.lang.InterruptedException -> L48
            throw r1     // Catch: java.lang.InterruptedException -> L48
        L34:
            r3 = 0
            boolean r2 = r5.compareAndSet(r0, r2, r3)     // Catch: java.lang.InterruptedException -> L48
            if (r2 == 0) goto L23
        L3b:
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L43
            r0.k()     // Catch: java.lang.InterruptedException -> L48
            return r4
        L43:
            r4 = move-exception
            r0.k()     // Catch: java.lang.InterruptedException -> L48
            throw r4     // Catch: java.lang.InterruptedException -> L48
        L48:
            r4 = move-exception
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Blocking call was interrupted due to parent cancellation"
            r5.<init>(r0)
            java.lang.Throwable r4 = r5.initCause(r4)
            throw r4
        L55:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
