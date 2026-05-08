package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dhe implements wi5<bse<Object>> {
    public final /* synthetic */ wi5 a;

    @uh3(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
    public static final class a extends pu2 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(lu2 lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return dhe.this.a(null, this);
        }
    }

    public dhe(wi5 wi5Var) {
        this.a = wi5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.bse<java.lang.Object> r5, defpackage.lu2 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof dhe.a
            if (r0 == 0) goto L13
            r0 = r6
            dhe$a r0 = (dhe.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            dhe$a r0 = new dhe$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.r7d.b(r6)
            goto L4e
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L2c:
            defpackage.r7d.b(r6)
            bse r5 = (defpackage.bse) r5
            boolean r6 = r5 instanceof defpackage.aqc
            if (r6 != 0) goto L64
            boolean r6 = r5 instanceof defpackage.ec5
            if (r6 != 0) goto L5f
            boolean r6 = r5 instanceof defpackage.td3
            if (r6 == 0) goto L51
            td3 r5 = (defpackage.td3) r5
            T r5 = r5.a
            r0.label = r3
            wi5 r4 = r4.a
            java.lang.Object r4 = r4.a(r5, r0)
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L4e
            return r5
        L4e:
            j6g r4 = defpackage.j6g.a
            return r4
        L51:
            boolean r4 = r5 instanceof defpackage.t5g
            if (r4 == 0) goto L5b
            java.lang.String r4 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.r6.g(r4)
            return r2
        L5b:
            defpackage.l.g()
            return r2
        L5f:
            ec5 r5 = (defpackage.ec5) r5
            java.lang.Throwable r4 = r5.a
            throw r4
        L64:
            aqc r5 = (defpackage.aqc) r5
            java.lang.Throwable r4 = r5.a
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhe.a(java.lang.Object, lu2):java.lang.Object");
    }
}
