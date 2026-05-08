package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hj5 {

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
    public static final class a<T> extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return hj5.a(null, null, false, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r1.a(r10, r0) == r5) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:13:0x0035, B:24:0x005f, B:28:0x0074, B:30:0x007c, B:20:0x0051, B:23:0x005b), top: B:49:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008e -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(defpackage.wi5<? super T> r7, defpackage.dsc<? extends T> r8, boolean r9, defpackage.lu2<? super defpackage.j6g> r10) {
        /*
            boolean r0 = r10 instanceof hj5.a
            if (r0 == 0) goto L13
            r0 = r10
            hj5$a r0 = (hj5.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            hj5$a r0 = new hj5$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L55
            if (r1 == r4) goto L43
            if (r1 != r3) goto L3d
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            g22 r7 = (defpackage.g22) r7
            java.lang.Object r8 = r0.L$1
            dsc r8 = (defpackage.dsc) r8
            java.lang.Object r1 = r0.L$0
            wi5 r1 = (defpackage.wi5) r1
            defpackage.r7d.b(r10)     // Catch: java.lang.Throwable -> L3b
        L38:
            r10 = r7
            r7 = r1
            goto L5f
        L3b:
            r7 = move-exception
            goto L99
        L3d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L43:
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            g22 r7 = (defpackage.g22) r7
            java.lang.Object r8 = r0.L$1
            dsc r8 = (defpackage.dsc) r8
            java.lang.Object r1 = r0.L$0
            wi5 r1 = (defpackage.wi5) r1
            defpackage.r7d.b(r10)     // Catch: java.lang.Throwable -> L3b
            goto L74
        L55:
            defpackage.r7d.b(r10)
            defpackage.wg2.y(r7)
            g22 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L3b
        L5f:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L3b
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L3b
            r0.L$2 = r10     // Catch: java.lang.Throwable -> L3b
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L3b
            r0.label = r4     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L3b
            if (r1 != r5) goto L70
            goto L90
        L70:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L74:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L3b
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L91
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L3b
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L3b
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L3b
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L3b
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L3b
            r0.label = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r10 = r1.a(r10, r0)     // Catch: java.lang.Throwable -> L3b
            if (r10 != r5) goto L38
        L90:
            return r5
        L91:
            if (r9 == 0) goto L96
            r8.h(r2)
        L96:
            j6g r7 = defpackage.j6g.a
            return r7
        L99:
            throw r7     // Catch: java.lang.Throwable -> L9a
        L9a:
            r10 = move-exception
            if (r9 == 0) goto Lb3
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto La4
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        La4:
            if (r2 != 0) goto Lb0
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        Lb0:
            r8.h(r2)
        Lb3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj5.a(wi5, dsc, boolean, lu2):java.lang.Object");
    }
}
