package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", l = {107, 110}, m = "invokeSuspend")
public final class k0a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d0a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0a(d0a d0aVar, lu2<? super k0a> lu2Var) {
        super(2, lu2Var);
        this.this$0 = d0aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        k0a k0aVar = new k0a(this.this$0, lu2Var);
        k0aVar.L$0 = obj;
        return k0aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((k0a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (defpackage.d0a.a(r5, r6, r7, r8, r9, r10) != r4) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[Catch: all -> 0x0079, TRY_ENTER, TryCatch #2 {all -> 0x0079, blocks: (B:18:0x0031, B:21:0x003d, B:25:0x004d), top: B:42:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0074 -> B:42:0x0031). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = r12.label
            r1 = 0
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L2a
            if (r0 == r3) goto L22
            if (r0 != r2) goto L1c
            java.lang.Object r0 = r12.L$0
            e13 r0 = (defpackage.e13) r0
            defpackage.r7d.b(r13)     // Catch: java.lang.Throwable -> L17
            r10 = r12
        L15:
            r13 = r0
            goto L74
        L17:
            r0 = move-exception
            r13 = r0
            r10 = r12
            goto L81
        L1c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r12)
            return r1
        L22:
            java.lang.Object r0 = r12.L$0
            e13 r0 = (defpackage.e13) r0
            defpackage.r7d.b(r13)     // Catch: java.lang.Throwable -> L17
            goto L4d
        L2a:
            defpackage.r7d.b(r13)
            java.lang.Object r13 = r12.L$0
            e13 r13 = (defpackage.e13) r13
        L31:
            v03 r0 = r13.getCoroutineContext()     // Catch: java.lang.Throwable -> L79
            boolean r0 = defpackage.u63.U(r0)     // Catch: java.lang.Throwable -> L79
            d0a r5 = r12.this$0
            if (r0 == 0) goto L7c
            go1 r0 = r5.e     // Catch: java.lang.Throwable -> L79
            r12.L$0 = r13     // Catch: java.lang.Throwable -> L79
            r12.label = r3     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.c(r12)     // Catch: java.lang.Throwable -> L79
            if (r0 != r4) goto L4a
            goto L73
        L4a:
            r11 = r0
            r0 = r13
            r13 = r11
        L4d:
            r7 = r13
            d0a$a r7 = (d0a.a) r7     // Catch: java.lang.Throwable -> L79
            d0a r13 = r12.this$0     // Catch: java.lang.Throwable -> L79
            iy3 r13 = r13.d     // Catch: java.lang.Throwable -> L79
            r5 = 1086324736(0x40c00000, float:6.0)
            float r8 = r13.t1(r5)     // Catch: java.lang.Throwable -> L79
            d0a r13 = r12.this$0     // Catch: java.lang.Throwable -> L79
            iy3 r13 = r13.d     // Catch: java.lang.Throwable -> L79
            r5 = 1065353216(0x3f800000, float:1.0)
            float r9 = r13.t1(r5)     // Catch: java.lang.Throwable -> L79
            d0a r5 = r12.this$0     // Catch: java.lang.Throwable -> L79
            xsd r6 = r5.a     // Catch: java.lang.Throwable -> L79
            r12.L$0 = r0     // Catch: java.lang.Throwable -> L79
            r12.label = r2     // Catch: java.lang.Throwable -> L79
            r10 = r12
            java.lang.Object r12 = defpackage.d0a.a(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L76
            if (r12 != r4) goto L15
        L73:
            return r4
        L74:
            r12 = r10
            goto L31
        L76:
            r0 = move-exception
        L77:
            r13 = r0
            goto L81
        L79:
            r0 = move-exception
            r10 = r12
            goto L77
        L7c:
            r5.g = r1
            j6g r12 = defpackage.j6g.a
            return r12
        L81:
            d0a r12 = r10.this$0
            r12.g = r1
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
