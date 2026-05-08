package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface pv0 {

    public static final class a implements pv0 {
        public static final a a = new a();

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.pv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(defpackage.m17 r5, defpackage.w27 r6, defpackage.pu2 r7) {
            /*
                r4 = this;
                boolean r0 = r7 instanceof defpackage.ov0
                if (r0 == 0) goto L13
                r0 = r7
                ov0 r0 = (defpackage.ov0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                ov0 r0 = new ov0
                r0.<init>(r4, r7)
            L18:
                java.lang.Object r4 = r0.result
                int r7 = r0.label
                r1 = 1
                r2 = 0
                if (r7 == 0) goto L31
                if (r7 != r1) goto L2b
                java.lang.Object r5 = r0.L$0
                r6 = r5
                w27 r6 = (defpackage.w27) r6
                defpackage.r7d.b(r4)
                goto L41
            L2b:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r4)
                return r2
            L31:
                defpackage.r7d.b(r4)
                r0.L$0 = r6
                r0.label = r1
                java.lang.Object r4 = r5.b(r6, r0)
                g13 r5 = defpackage.g13.a
                if (r4 != r5) goto L41
                return r5
            L41:
                c37 r4 = (defpackage.c37) r4
                boolean r5 = r4 instanceof defpackage.mye
                if (r5 == 0) goto L57
                kv0$b$d r5 = new kv0$b$d
                mye r4 = (defpackage.mye) r4
                k07 r7 = r4.a
                android.content.Context r6 = r6.a
                x2b r6 = defpackage.wg2.h(r7, r6, r1)
                r5.<init>(r6, r4)
                return r5
            L57:
                boolean r5 = r4 instanceof defpackage.uw4
                if (r5 == 0) goto L6d
                kv0$b$b r5 = new kv0$b$b
                uw4 r4 = (defpackage.uw4) r4
                k07 r7 = r4.a
                if (r7 == 0) goto L69
                android.content.Context r6 = r6.a
                x2b r2 = defpackage.wg2.h(r7, r6, r1)
            L69:
                r5.<init>(r2, r4)
                return r5
            L6d:
                defpackage.l.g()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: pv0.a.a(m17, w27, pu2):java.lang.Object");
        }
    }

    Object a(m17 m17Var, w27 w27Var, pu2 pu2Var);
}
