package defpackage;

import defpackage.qu2;
import defpackage.v03;

/* JADX INFO: loaded from: classes3.dex */
public final class ls3 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.pu2 r4) {
        /*
            boolean r0 = r4 instanceof defpackage.ks3
            if (r0 == 0) goto L13
            r0 = r4
            ks3 r0 = (defpackage.ks3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ks3 r0 = new ks3
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return
        L27:
            defpackage.r7d.b(r4)
            goto L45
        L2b:
            defpackage.r7d.b(r4)
            r0.label = r2
            qw1 r4 = new qw1
            lu2 r0 = defpackage.ewa.v(r0)
            r4.<init>(r2, r0)
            r4.q()
            java.lang.Object r4 = r4.p()
            g13 r0 = defpackage.g13.a
            if (r4 != r0) goto L45
            return
        L45:
            defpackage.r40.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls3.a(pu2):void");
    }

    public static final Object b(long j, lu2<? super j6g> lu2Var) {
        if (j <= 0) {
            return j6g.a;
        }
        qw1 qw1Var = new qw1(1, ewa.v(lu2Var));
        qw1Var.q();
        if (j < Long.MAX_VALUE) {
            c(qw1Var.e).b0(j, qw1Var);
        }
        Object objP = qw1Var.p();
        return objP == g13.a ? objP : j6g.a;
    }

    public static final js3 c(v03 v03Var) {
        v03.a aVarH1 = v03Var.h1(qu2.a.a);
        js3 js3Var = aVarH1 instanceof js3 ? (js3) aVarH1 : null;
        return js3Var == null ? fn3.a : js3Var;
    }

    public static final long d(long j) {
        int i = wd4.d;
        boolean z = j > 0;
        if (z) {
            return wd4.f(wd4.n(j, pg8.U(999999L, be4.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        l.g();
        return 0L;
    }
}
