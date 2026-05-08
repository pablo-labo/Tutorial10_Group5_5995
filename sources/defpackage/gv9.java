package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gv9 implements sea {
    public final /* synthetic */ d40<?> a;

    @uh3(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", l = {570}, m = "onPostFling-RZ2iAVY")
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
            return gv9.this.T0(0L, 0L, this);
        }
    }

    @uh3(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", l = {561}, m = "onPreFling-QWom1Mo")
    public static final class b extends pu2 {
        long J$0;
        int label;
        /* synthetic */ Object result;

        public b(pu2 pu2Var) {
            super(pu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return gv9.this.s0(0L, this);
        }
    }

    public gv9(d40 d40Var) {
        this.a = d40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.sea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T0(long r3, long r5, defpackage.lu2<? super defpackage.vmg> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof gv9.a
            if (r3 == 0) goto L13
            r3 = r7
            gv9$a r3 = (gv9.a) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.label = r4
            goto L1a
        L13:
            gv9$a r3 = new gv9$a
            pu2 r7 = (defpackage.pu2) r7
            r3.<init>(r7)
        L1a:
            java.lang.Object r4 = r3.result
            int r7 = r3.label
            r0 = 1
            if (r7 == 0) goto L30
            if (r7 != r0) goto L29
            long r5 = r3.J$0
            defpackage.r7d.b(r4)
            goto L46
        L29:
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r2)
            r2 = 0
            return r2
        L30:
            defpackage.r7d.b(r4)
            float r4 = defpackage.vmg.c(r5)
            r3.J$0 = r5
            r3.label = r0
            d40<?> r2 = r2.a
            java.lang.Object r2 = r2.i(r4, r3)
            g13 r3 = defpackage.g13.a
            if (r2 != r3) goto L46
            return r3
        L46:
            vmg r2 = new vmg
            r2.<init>(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv9.T0(long, long, lu2):java.lang.Object");
    }

    @Override // defpackage.sea
    public final long Z0(long j, int i, long j2) {
        if (i != 1) {
            return 0L;
        }
        return a(this.a.d(Float.intBitsToFloat((int) (4294967295L & j2))));
    }

    public final long a(float f) {
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // defpackage.sea
    public final long e0(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        return a(this.a.d(fIntBitsToFloat));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.sea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s0(long r5, defpackage.lu2<? super defpackage.vmg> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof gv9.b
            if (r0 == 0) goto L13
            r0 = r7
            gv9$b r0 = (gv9.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L1a
        L13:
            gv9$b r0 = new gv9$b
            pu2 r7 = (defpackage.pu2) r7
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            long r5 = r0.J$0
            defpackage.r7d.b(r7)
            goto L5d
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L30:
            defpackage.r7d.b(r7)
            float r7 = defpackage.vmg.c(r5)
            d40<?> r4 = r4.a
            float r1 = r4.g()
            r3 = 0
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 >= 0) goto L5b
            pa4 r3 = r4.e()
            float r3 = r3.e()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L5b
            r0.J$0 = r5
            r0.label = r2
            java.lang.Object r4 = r4.i(r7, r0)
            g13 r7 = defpackage.g13.a
            if (r4 != r7) goto L5d
            return r7
        L5b:
            r5 = 0
        L5d:
            vmg r4 = new vmg
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv9.s0(long, lu2):java.lang.Object");
    }
}
