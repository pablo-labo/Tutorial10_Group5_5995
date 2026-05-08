package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class mj5 implements vi5<Object> {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ vi5 b;

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {112, 116}, m = "collect")
    public static final class a extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(lu2 lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return mj5.this.e(null, this);
        }
    }

    public mj5(vi5 vi5Var, Function2 function2) {
        this.a = function2;
        this.b = vi5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r6.e(r7, r0) != r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.vi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.wi5<? super java.lang.Object> r7, defpackage.lu2<? super defpackage.j6g> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof mj5.a
            if (r0 == 0) goto L13
            r0 = r8
            mj5$a r0 = (mj5.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            mj5$a r0 = new mj5$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.r7d.b(r8)
            goto L76
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r4
        L31:
            java.lang.Object r6 = r0.L$2
            hjd r6 = (defpackage.hjd) r6
            java.lang.Object r7 = r0.L$1
            wi5 r7 = (defpackage.wi5) r7
            java.lang.Object r1 = r0.L$0
            mj5 r1 = (defpackage.mj5) r1
            defpackage.r7d.b(r8)     // Catch: java.lang.Throwable -> L41
            goto L62
        L41:
            r7 = move-exception
            goto L7b
        L43:
            defpackage.r7d.b(r8)
            hjd r8 = new hjd
            v03 r1 = r0.getContext()
            r8.<init>(r7, r1)
            kotlin.jvm.functions.Function2 r1 = r6.a     // Catch: java.lang.Throwable -> L79
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L79
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L79
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L79
            r0.label = r3     // Catch: java.lang.Throwable -> L79
            java.lang.Object r1 = r1.invoke(r8, r0)     // Catch: java.lang.Throwable -> L79
            if (r1 != r5) goto L60
            goto L75
        L60:
            r1 = r6
            r6 = r8
        L62:
            r6.releaseIntercepted()
            vi5 r6 = r1.b
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.label = r2
            java.lang.Object r6 = r6.e(r7, r0)
            if (r6 != r5) goto L76
        L75:
            return r5
        L76:
            j6g r6 = defpackage.j6g.a
            return r6
        L79:
            r7 = move-exception
            r6 = r8
        L7b:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj5.e(wi5, lu2):java.lang.Object");
    }
}
