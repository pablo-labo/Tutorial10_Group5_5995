package defpackage;

import defpackage.ii7;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lrc implements ii7.a {
    public final w27 a;
    public final List<ii7> b;
    public final int c;
    public final w27 d;
    public final iie e;
    public final cz4 f;
    public final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public lrc(w27 w27Var, List<? extends ii7> list, int i, w27 w27Var2, iie iieVar, cz4 cz4Var, boolean z) {
        this.a = w27Var;
        this.b = list;
        this.c = i;
        this.d = w27Var2;
        this.e = iieVar;
        this.f = cz4Var;
        this.g = z;
    }

    @Override // ii7.a
    public final w27 a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.pu2 r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.jrc
            if (r0 == 0) goto L13
            r0 = r14
            jrc r0 = (defpackage.jrc) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            jrc r0 = new jrc
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 != r3) goto L32
            java.lang.Object r13 = r0.L$1
            ii7 r13 = (defpackage.ii7) r13
            java.lang.Object r0 = r0.L$0
            lrc r0 = (defpackage.lrc) r0
            defpackage.r7d.b(r14)
            r12 = r14
            r14 = r13
            r13 = r0
            r0 = r12
            goto L67
        L32:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r13)
            return r2
        L38:
            defpackage.r7d.b(r14)
            java.util.List<ii7> r14 = r13.b
            int r1 = r13.c
            java.lang.Object r14 = r14.get(r1)
            ii7 r14 = (defpackage.ii7) r14
            int r7 = r1 + 1
            lrc r4 = new lrc
            cz4 r10 = r13.f
            boolean r11 = r13.g
            w27 r5 = r13.a
            java.util.List<ii7> r6 = r13.b
            w27 r8 = r13.d
            iie r9 = r13.e
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r3
            java.lang.Object r0 = r14.a(r4, r0)
            g13 r1 = defpackage.g13.a
            if (r0 != r1) goto L67
            return r1
        L67:
            c37 r0 = (defpackage.c37) r0
            w27 r1 = r0.a()
            r13.getClass()
            android.content.Context r3 = r1.a
            w27 r13 = r13.a
            android.content.Context r4 = r13.a
            java.lang.String r5 = "Interceptor '"
            if (r3 != r4) goto L9f
            java.lang.Object r3 = r1.b
            ima r4 = defpackage.ima.a
            if (r3 == r4) goto L99
            z9f r3 = r1.c
            z9f r4 = r13.c
            if (r3 != r4) goto L93
            rie r1 = r1.p
            rie r13 = r13.p
            if (r1 != r13) goto L8d
            return r0
        L8d:
            java.lang.String r13 = "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead."
            defpackage.v40.o(r5, r14, r13)
            return r2
        L93:
            java.lang.String r13 = "' cannot modify the request's target."
            defpackage.v40.o(r5, r14, r13)
            return r2
        L99:
            java.lang.String r13 = "' cannot set the request's data to null."
            defpackage.v40.o(r5, r14, r13)
            return r2
        L9f:
            java.lang.String r13 = "' cannot modify the request's context."
            defpackage.v40.o(r5, r14, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrc.b(pu2):java.lang.Object");
    }
}
