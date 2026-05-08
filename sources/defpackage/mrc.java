package defpackage;

import android.content.Context;
import defpackage.hi7;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mrc implements hi7.a {
    public final v27 a;
    public final List<hi7> b;
    public final int c;
    public final v27 d;
    public final hie e;
    public final bz4 f;
    public final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public mrc(v27 v27Var, List<? extends hi7> list, int i, v27 v27Var2, hie hieVar, bz4 bz4Var, boolean z) {
        this.a = v27Var;
        this.b = list;
        this.c = i;
        this.d = v27Var2;
        this.e = hieVar;
        this.f = bz4Var;
        this.g = z;
    }

    @Override // hi7.a
    public final v27 a() {
        return this.d;
    }

    public final void b(v27 v27Var, hi7 hi7Var) {
        Context context = v27Var.a;
        v27 v27Var2 = this.a;
        if (context != v27Var2.a) {
            v40.o("Interceptor '", hi7Var, "' cannot modify the request's context.");
            return;
        }
        if (v27Var.b == boa.Y) {
            v40.o("Interceptor '", hi7Var, "' cannot set the request's data to null.");
        } else if (v27Var.t != v27Var2.t) {
            v40.o("Interceptor '", hi7Var, "' cannot modify the request's lifecycle.");
        } else {
            if (v27Var.u == v27Var2.u) {
                return;
            }
            v40.o("Interceptor '", hi7Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.v27 r13, defpackage.pu2 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.krc
            if (r0 == 0) goto L13
            r0 = r14
            krc r0 = (defpackage.krc) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            krc r0 = new krc
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            java.lang.Object r12 = r0.L$1
            hi7 r12 = (defpackage.hi7) r12
            java.lang.Object r13 = r0.L$0
            mrc r13 = (defpackage.mrc) r13
            defpackage.r7d.b(r14)
            r11 = r14
            r14 = r12
            r12 = r13
            r13 = r11
            goto L73
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r12)
            r12 = 0
            return r12
        L38:
            defpackage.r7d.b(r14)
            java.util.List<hi7> r14 = r12.b
            int r1 = r12.c
            if (r1 <= 0) goto L4c
            int r3 = r1 + (-1)
            java.lang.Object r3 = r14.get(r3)
            hi7 r3 = (defpackage.hi7) r3
            r12.b(r13, r3)
        L4c:
            java.lang.Object r14 = r14.get(r1)
            hi7 r14 = (defpackage.hi7) r14
            int r6 = r1 + 1
            mrc r3 = new mrc
            bz4 r9 = r12.f
            boolean r10 = r12.g
            v27 r4 = r12.a
            java.util.List<hi7> r5 = r12.b
            hie r8 = r12.e
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.L$0 = r12
            r0.L$1 = r14
            r0.label = r2
            java.lang.Object r13 = r14.a(r3, r0)
            g13 r0 = defpackage.g13.a
            if (r13 != r0) goto L73
            return r0
        L73:
            d37 r13 = (defpackage.d37) r13
            v27 r0 = r13.a()
            r12.b(r0, r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrc.c(v27, pu2):java.lang.Object");
    }
}
