package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dgf extends ab1<dgf> {
    public final jhf h;
    public final nif i;

    public dgf(jhf jhfVar, roa roaVar, nif nifVar, yif yifVar) {
        super(jhfVar.a, jhfVar.b, nifVar != null ? nifVar.a : null, roaVar, yifVar);
        this.h = jhfVar;
        this.i = nifVar;
    }

    public final List<qh4> q(Function1<? super dgf, ? extends qh4> function1) {
        if (!kjf.c(this.f)) {
            return u63.a0(new kc2("", 0), new sae(kjf.f(this.f), kjf.f(this.f)));
        }
        qh4 qh4VarInvoke = function1.invoke(this);
        if (qh4VarInvoke != null) {
            return u63.Z(qh4VarInvoke);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int r(defpackage.nif r9, int r10) {
        /*
            r8 = this;
            sl8 r0 = r9.b
            mif r1 = r9.a
            if (r0 == 0) goto L13
            sl8 r9 = r9.c
            if (r9 == 0) goto L10
            r2 = 1
            qtc r9 = r9.J(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            qtc r9 = defpackage.qtc.e
        L15:
            jhf r0 = r8.h
            long r2 = r0.b
            int r0 = defpackage.kjf.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            roa r8 = r8.d
            int r0 = r8.c(r0)
            qtc r0 = r1.c(r0)
            float r2 = r0.a
            float r0 = r0.b
            long r6 = r9.c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r2 = r2 << r0
            long r9 = r9 & r4
            long r9 = r9 | r2
            q1a r0 = r1.b
            int r9 = r0.g(r9)
            int r8 = r8.a(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgf.r(nif, int):int");
    }
}
