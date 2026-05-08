package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.passport.AppInitValuesHolder$sync$2$2", f = "AppInitValuesHolder.kt", l = {92, 94}, m = "invokeSuspend")
public final class ll0 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ll0(2, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ll0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r5.f(r4) == r3) goto L15;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 2
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.r7d.b(r5)
            goto L34
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L17:
            defpackage.r7d.b(r5)
            goto L29
        L1b:
            defpackage.r7d.b(r5)
            il0 r5 = defpackage.il0.a
            r4.label = r2
            java.lang.Object r5 = r5.e(r4)
            if (r5 != r3) goto L29
            goto L33
        L29:
            il0 r5 = defpackage.il0.a
            r4.label = r1
            java.lang.Object r4 = r5.f(r4)
            if (r4 != r3) goto L34
        L33:
            return r3
        L34:
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
