package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pcb {
    public static final jte a = new jte(a.a);

    public static final class a extends mj8 implements gu5<b02> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final /* bridge */ /* synthetic */ b02 invoke() {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.ocb r4, kotlin.jvm.functions.Function2 r5, defpackage.pu2 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.qcb
            if (r0 == 0) goto L13
            r0 = r6
            qcb r0 = (defpackage.qcb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            qcb r0 = new qcb
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return
        L27:
            kotlin.KotlinNothingValueException r4 = defpackage.s6.e(r6)
            throw r4
        L2c:
            defpackage.r7d.b(r6)
            androidx.compose.ui.e$c r6 = r4.k()
            boolean r6 = r6.c0
            if (r6 == 0) goto L4f
            rxa r6 = defpackage.us3.g(r4)
            pm8 r4 = defpackage.us3.f(r4)
            sm2 r4 = r4.p0
            jte r1 = defpackage.pcb.a
            java.lang.Object r4 = r4.a(r1)
            b02 r4 = (defpackage.b02) r4
            r0.label = r2
            b(r6, r4, r5, r0)
            return
        L4f:
            java.lang.String r4 = "establishTextInputSession called from an unattached node"
            defpackage.l5.q(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcb.a(ocb, kotlin.jvm.functions.Function2, pu2):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.rxa r4, defpackage.b02 r5, kotlin.jvm.functions.Function2 r6, defpackage.pu2 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.rcb
            if (r0 == 0) goto L13
            r0 = r7
            rcb r0 = (defpackage.rcb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            rcb r0 = new rcb
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 == r3) goto L2f
            if (r1 == r2) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return
        L2a:
            kotlin.KotlinNothingValueException r4 = defpackage.s6.e(r7)
            throw r4
        L2f:
            kotlin.KotlinNothingValueException r4 = defpackage.s6.e(r7)
            throw r4
        L34:
            defpackage.r7d.b(r7)
            if (r5 != 0) goto L3f
            r0.label = r3
            r4.x(r6, r0)
            return
        L3f:
            r0.label = r2
            r5.a(r4, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcb.b(rxa, b02, kotlin.jvm.functions.Function2, pu2):void");
    }
}
