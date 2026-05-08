package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {67}, m = "invokeSuspend")
public final class da6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ u12<j6g> $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da6(u12<j6g> u12Var, lu2<? super da6> lu2Var) {
        super(2, lu2Var);
        this.$channel = u12Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new da6(this.$channel, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((da6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x0010, B:18:0x0035, B:20:0x003d, B:14:0x0026, B:21:0x0052, B:13:0x0021), top: B:33:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x0010, B:18:0x0035, B:20:0x003d, B:14:0x0026, B:21:0x0052, B:13:0x0021), top: B:33:0x0004 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0032 -> B:18:0x0035). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r0 == 0) goto L1c
            if (r0 != r2) goto L16
            java.lang.Object r0 = r5.L$1
            g22 r0 = (defpackage.g22) r0
            java.lang.Object r3 = r5.L$0
            dsc r3 = (defpackage.dsc) r3
            defpackage.r7d.b(r6)     // Catch: java.lang.Throwable -> L14
            goto L35
        L14:
            r5 = move-exception
            goto L5a
        L16:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r1
        L1c:
            defpackage.r7d.b(r6)
            u12<j6g> r3 = r5.$channel
            g22 r6 = r3.iterator()     // Catch: java.lang.Throwable -> L14
            r0 = r6
        L26:
            r5.L$0 = r3     // Catch: java.lang.Throwable -> L14
            r5.L$1 = r0     // Catch: java.lang.Throwable -> L14
            r5.label = r2     // Catch: java.lang.Throwable -> L14
            java.lang.Object r6 = r0.b(r5)     // Catch: java.lang.Throwable -> L14
            g13 r4 = defpackage.g13.a
            if (r6 != r4) goto L35
            return r4
        L35:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L14
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L52
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L14
            j6g r6 = (defpackage.j6g) r6     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.atomic.AtomicBoolean r6 = defpackage.fa6.b     // Catch: java.lang.Throwable -> L14
            r4 = 0
            r6.set(r4)     // Catch: java.lang.Throwable -> L14
            wle$a r6 = defpackage.wle.e     // Catch: java.lang.Throwable -> L14
            r6.getClass()     // Catch: java.lang.Throwable -> L14
            wle.a.f()     // Catch: java.lang.Throwable -> L14
            goto L26
        L52:
            j6g r5 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L14
            r3.h(r1)
            j6g r5 = defpackage.j6g.a
            return r5
        L5a:
            throw r5     // Catch: java.lang.Throwable -> L5b
        L5b:
            r6 = move-exception
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L63
            r1 = r5
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
        L63:
            if (r1 != 0) goto L6f
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Channel was consumed, consumer had failed"
            r1.<init>(r0)
            r1.initCause(r5)
        L6f:
            r3.h(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
