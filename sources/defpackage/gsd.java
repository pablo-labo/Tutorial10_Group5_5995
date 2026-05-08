package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gsd implements sea {
    public final xsd a;
    public boolean b;

    @uh3(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {924}, m = "onPostFling-RZ2iAVY")
    public static final class a extends pu2 {
        long J$0;
        int label;
        /* synthetic */ Object result;

        public a(pu2 pu2Var) {
            super(pu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return gsd.this.T0(0L, 0L, this);
        }
    }

    public gsd(xsd xsdVar, boolean z) {
        this.a = xsdVar;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.sea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T0(long r4, long r6, defpackage.lu2<? super defpackage.vmg> r8) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r4 = r8 instanceof gsd.a
            if (r4 == 0) goto L13
            r4 = r8
            gsd$a r4 = (gsd.a) r4
            int r5 = r4.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.label = r5
            goto L1a
        L13:
            gsd$a r4 = new gsd$a
            pu2 r8 = (defpackage.pu2) r8
            r4.<init>(r8)
        L1a:
            java.lang.Object r5 = r4.result
            int r8 = r4.label
            r0 = 1
            if (r8 == 0) goto L30
            if (r8 != r0) goto L29
            long r6 = r4.J$0
            defpackage.r7d.b(r5)
            goto L4d
        L29:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r3)
            r3 = 0
            return r3
        L30:
            defpackage.r7d.b(r5)
            boolean r5 = r3.b
            r1 = 0
            if (r5 == 0) goto L55
            xsd r3 = r3.a
            boolean r5 = r3.i
            if (r5 == 0) goto L40
            goto L51
        L40:
            r4.J$0 = r6
            r4.label = r0
            java.lang.Object r5 = r3.a(r6, r4)
            g13 r3 = defpackage.g13.a
            if (r5 != r3) goto L4d
            return r3
        L4d:
            vmg r5 = (defpackage.vmg) r5
            long r1 = r5.a
        L51:
            long r1 = defpackage.vmg.d(r6, r1)
        L55:
            vmg r3 = new vmg
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsd.T0(long, long, lu2):java.lang.Object");
    }

    @Override // defpackage.sea
    public final long Z0(long j, int i, long j2) {
        if (!this.b) {
            return 0L;
        }
        xsd xsdVar = this.a;
        if (xsdVar.a.b()) {
            return 0L;
        }
        return xsdVar.h(xsdVar.d(xsdVar.a.e(xsdVar.d(xsdVar.g(j2)))));
    }
}
