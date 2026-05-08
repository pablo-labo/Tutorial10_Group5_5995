package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class li8 {

    public static final class a implements Runnable {
        public final /* synthetic */ b a;
        public final /* synthetic */ Exception b;

        public a(b bVar, Exception exc) {
            this.a = bVar;
            this.b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ewa.v(this.a).resumeWith(r7d.a(this.b));
        }
    }

    @uh3(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    public static final class b extends pu2 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return li8.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.lang.Exception r4, defpackage.lu2<?> r5) {
        /*
            boolean r0 = r5 instanceof li8.b
            if (r0 == 0) goto L13
            r0 = r5
            li8$b r0 = (li8.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            li8$b r0 = new li8$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            defpackage.r7d.b(r5)
            j6g r4 = defpackage.j6g.a
            return r4
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L32:
            defpackage.r7d.b(r5)
            r0.L$0 = r4
            r0.label = r2
            eq3 r5 = defpackage.a74.a
            v03 r1 = r0.getContext()
            li8$a r2 = new li8$a
            r2.<init>(r0, r4)
            r5.v1(r1, r2)
            g13 r4 = defpackage.g13.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li8.a(java.lang.Exception, lu2):java.lang.Object");
    }
}
