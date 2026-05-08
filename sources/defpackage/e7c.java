package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e7c implements sea {
    public final a14 a;
    public final d7c b;

    @uh3(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", l = {98}, m = "onPreFling-QWom1Mo")
    public static final class a extends pu2 {
        float F$0;
        int label;
        /* synthetic */ Object result;

        public a(pu2 pu2Var) {
            super(pu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e7c.this.s0(0L, this);
        }
    }

    public e7c(a14 a14Var, d7c d7cVar) {
        this.a = a14Var;
        this.b = d7cVar;
    }

    @Override // defpackage.sea
    public final long Z0(long j, int i, long j2) {
        if (i != 1) {
            return 0L;
        }
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) <= 0.0f) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(((Number) this.a.invoke(Float.valueOf(Float.intBitsToFloat(i2)))).floatValue())) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // defpackage.sea
    public final long e0(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) >= 0.0f) {
            return 0L;
        }
        float fFloatValue = ((Number) this.a.invoke(Float.valueOf(Float.intBitsToFloat(i2)))).floatValue();
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue)) & 4294967295L);
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
            boolean r0 = r7 instanceof e7c.a
            if (r0 == 0) goto L13
            r0 = r7
            e7c$a r0 = (e7c.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L1a
        L13:
            e7c$a r0 = new e7c$a
            pu2 r7 = (defpackage.pu2) r7
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            float r4 = r0.F$0
            defpackage.r7d.b(r7)
            goto L4d
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L30:
            defpackage.r7d.b(r7)
            float r5 = defpackage.vmg.c(r5)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            r5 = 0
            r0.F$0 = r5
            r0.label = r2
            d7c r4 = r4.b
            java.lang.Object r7 = r4.invoke(r6, r0)
            g13 r4 = defpackage.g13.a
            if (r7 != r4) goto L4c
            return r4
        L4c:
            r4 = r5
        L4d:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            long r4 = defpackage.ewa.f(r4, r5)
            vmg r6 = new vmg
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e7c.s0(long, lu2):java.lang.Object");
    }
}
