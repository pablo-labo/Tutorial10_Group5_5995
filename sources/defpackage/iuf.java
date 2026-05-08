package defpackage;

import defpackage.coa;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", l = {301, 309}, m = "invokeSuspend")
public final class iuf extends c1f implements Function2<drf, lu2<? super j6g>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ztf this$0;

    @uh3(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1", f = "InvalidationTracker.kt", l = {313, 314}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<crf<j6g>, lu2<? super j6g>, Object> {
        final /* synthetic */ drf $connection;
        final /* synthetic */ coa.a[] $tablesToSync;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ ztf this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(coa.a[] aVarArr, ztf ztfVar, drf drfVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$tablesToSync = aVarArr;
            this.this$0 = ztfVar;
            this.$connection = drfVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$tablesToSync, this.this$0, this.$connection, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(crf<j6g> crfVar, lu2<? super j6g> lu2Var) {
            return ((a) create(crfVar, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        
            if (defpackage.ztf.b(r7, r12, r6, r11) == r10) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        
            r6 = r12;
            r5 = r9;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007c -> B:27:0x007d). Please report as a decompilation issue!!! */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                int r0 = r11.label
                r1 = 0
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L27
                if (r0 == r3) goto Lb
                if (r0 != r2) goto L21
            Lb:
                int r0 = r11.I$2
                int r4 = r11.I$1
                int r5 = r11.I$0
                java.lang.Object r6 = r11.L$2
                drf r6 = (defpackage.drf) r6
                java.lang.Object r7 = r11.L$1
                ztf r7 = (defpackage.ztf) r7
                java.lang.Object r8 = r11.L$0
                coa$a[] r8 = (coa.a[]) r8
                defpackage.r7d.b(r12)
                goto L60
            L21:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r11)
                return r1
            L27:
                defpackage.r7d.b(r12)
                coa$a[] r12 = r11.$tablesToSync
                ztf r0 = r11.this$0
                drf r4 = r11.$connection
                int r5 = r12.length
                r6 = 0
                r8 = r12
                r7 = r0
                r12 = r4
                r0 = r5
                r4 = r6
            L37:
                if (r4 >= r0) goto L7f
                r5 = r8[r4]
                int r9 = r6 + 1
                int r5 = r5.ordinal()
                if (r5 == 0) goto L7c
                g13 r10 = defpackage.g13.a
                if (r5 == r3) goto L67
                if (r5 != r2) goto L63
                r11.L$0 = r8
                r11.L$1 = r7
                r11.L$2 = r12
                r11.I$0 = r9
                r11.I$1 = r4
                r11.I$2 = r0
                r11.label = r2
                java.lang.Object r5 = defpackage.ztf.c(r7, r12, r6, r11)
                if (r5 != r10) goto L5e
                goto L7b
            L5e:
                r6 = r12
                r5 = r9
            L60:
                r12 = r6
                r6 = r5
                goto L7d
            L63:
                defpackage.l.g()
                return r1
            L67:
                r11.L$0 = r8
                r11.L$1 = r7
                r11.L$2 = r12
                r11.I$0 = r9
                r11.I$1 = r4
                r11.I$2 = r0
                r11.label = r3
                java.lang.Object r5 = defpackage.ztf.b(r7, r12, r6, r11)
                if (r5 != r10) goto L5e
            L7b:
                return r10
            L7c:
                r6 = r9
            L7d:
                int r4 = r4 + r3
                goto L37
            L7f:
                j6g r11 = defpackage.j6g.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: iuf.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuf(ztf ztfVar, lu2<? super iuf> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ztfVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        iuf iufVar = new iuf(this.this$0, lu2Var);
        iufVar.L$0 = obj;
        return iufVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drf drfVar, lu2<? super j6g> lu2Var) {
        return ((iuf) create(drfVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
    
        if (r1.a(drf.a.b, r4, r18) == r5) goto L47;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.label
            r2 = 2
            r3 = 0
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L14
            defpackage.r7d.b(r19)
            goto La3
        L14:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r3
        L1a:
            java.lang.Object r1 = r0.L$0
            drf r1 = (defpackage.drf) r1
            defpackage.r7d.b(r19)
            r6 = r19
            goto L37
        L24:
            defpackage.r7d.b(r19)
            java.lang.Object r1 = r0.L$0
            drf r1 = (defpackage.drf) r1
            r0.L$0 = r1
            r0.label = r4
            java.lang.Object r6 = r1.c(r0)
            if (r6 != r5) goto L37
            goto La2
        L37:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L42
            j6g r0 = defpackage.j6g.a
            return r0
        L42:
            ztf r6 = r0.this$0
            coa r6 = r6.h
            long[] r7 = r6.b
            java.util.concurrent.locks.ReentrantLock r8 = r6.a
            r8.lock()
            boolean r9 = r6.d     // Catch: java.lang.Throwable -> L79
            if (r9 != 0) goto L56
            r8.unlock()
            r11 = r3
            goto L8d
        L56:
            r9 = 0
            r6.d = r9     // Catch: java.lang.Throwable -> L79
            int r10 = r7.length     // Catch: java.lang.Throwable -> L79
            coa$a[] r11 = new coa.a[r10]     // Catch: java.lang.Throwable -> L79
            r12 = r9
            r13 = r12
        L5e:
            if (r12 >= r10) goto L86
            r14 = r7[r12]     // Catch: java.lang.Throwable -> L79
            r16 = 0
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 <= 0) goto L6a
            r14 = r4
            goto L6b
        L6a:
            r14 = r9
        L6b:
            boolean[] r15 = r6.c     // Catch: java.lang.Throwable -> L79
            boolean r4 = r15[r12]     // Catch: java.lang.Throwable -> L79
            if (r14 == r4) goto L7e
            r15[r12] = r14     // Catch: java.lang.Throwable -> L79
            if (r14 == 0) goto L7b
            coa$a r4 = coa.a.b     // Catch: java.lang.Throwable -> L79
        L77:
            r13 = 1
            goto L80
        L79:
            r0 = move-exception
            goto La6
        L7b:
            coa$a r4 = coa.a.c     // Catch: java.lang.Throwable -> L79
            goto L77
        L7e:
            coa$a r4 = coa.a.a     // Catch: java.lang.Throwable -> L79
        L80:
            r11[r12] = r4     // Catch: java.lang.Throwable -> L79
            int r12 = r12 + 1
            r4 = 1
            goto L5e
        L86:
            if (r13 == 0) goto L89
            goto L8a
        L89:
            r11 = r3
        L8a:
            r8.unlock()
        L8d:
            if (r11 == 0) goto La3
            iuf$a r4 = new iuf$a
            ztf r6 = r0.this$0
            r4.<init>(r11, r6, r1, r3)
            r0.L$0 = r3
            r0.label = r2
            drf$a r2 = drf.a.b
            java.lang.Object r0 = r1.a(r2, r4, r0)
            if (r0 != r5) goto La3
        La2:
            return r5
        La3:
            j6g r0 = defpackage.j6g.a
            return r0
        La6:
            r8.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
