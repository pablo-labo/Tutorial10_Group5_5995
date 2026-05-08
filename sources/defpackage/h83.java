package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tracking.CtkAaidMapTracking$sync$2", f = "CtkAaidMapTracking.kt", l = {36, 38, 41}, m = "invokeSuspend")
public final class h83 extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ String $url;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h83(String str, lu2<? super h83> lu2Var) {
        super(1, lu2Var);
        this.$url = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new h83(this.$url, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((h83) create(lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (defpackage.e83.b(r0, r2, r7, r6) == r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (defpackage.e83.a(r0, r3, r7, r6) == r5) goto L24;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r0 == 0) goto L23
            if (r0 == r4) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            goto L17
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r1
        L17:
            java.lang.Object r6 = r6.L$0
            d0$a r6 = (d0.a) r6
            defpackage.r7d.b(r7)
            goto L74
        L1f:
            defpackage.r7d.b(r7)
            goto L31
        L23:
            defpackage.r7d.b(r7)
            d0 r7 = defpackage.d0.a
            r6.label = r4
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r5) goto L31
            goto L60
        L31:
            d0$a r7 = (d0.a) r7
            boolean r0 = r7 instanceof d0.a.c
            if (r0 == 0) goto L4a
            e83 r0 = defpackage.e83.a
            java.lang.String r2 = r6.$url
            d0$a$c r7 = (d0.a.c) r7
            java.lang.String r7 = r7.a
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r6 = defpackage.e83.b(r0, r2, r7, r6)
            if (r6 != r5) goto L74
            goto L60
        L4a:
            boolean r0 = r7 instanceof d0.a.b
            if (r0 == 0) goto L61
            e83 r0 = defpackage.e83.a
            java.lang.String r3 = r6.$url
            d0$a$b r7 = (d0.a.b) r7
            java.lang.String r7 = r7.a
            r6.L$0 = r1
            r6.label = r2
            java.lang.Object r6 = defpackage.e83.a(r0, r3, r7, r6)
            if (r6 != r5) goto L74
        L60:
            return r5
        L61:
            boolean r6 = r7 instanceof d0.a.C0203a
            if (r6 == 0) goto L77
            java.util.ArrayList r6 = defpackage.lz2.a
            d0$a$a r7 = (d0.a.C0203a) r7
            java.lang.Exception r6 = r7.a
            r7 = 4
            java.lang.String r0 = "CtkAaidMapTracking"
            java.lang.String r1 = "Error in getAdvertisingIdInfo"
            r2 = 0
            defpackage.lz2.c(r0, r1, r2, r6, r7)
        L74:
            j6g r6 = defpackage.j6g.a
            return r6
        L77:
            defpackage.l.g()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h83.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
