package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class bb9 {
    public final e13 a;
    public final Function1<lu2<? super Bitmap>, Object> b;
    public yr3 c;

    /* JADX WARN: Multi-variable type inference failed */
    public bb9(e13 e13Var, Function1<? super lu2<? super Bitmap>, ? extends Object> function1) {
        e13Var.getClass();
        this.a = e13Var;
        this.b = function1;
        this.c = u63.l(e13Var, null, new za9(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pu2 r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ab9
            if (r0 == 0) goto L13
            r0 = r5
            ab9 r0 = (defpackage.ab9) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ab9 r0 = new ab9
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.r7d.b(r5)
            goto L3c
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L2c:
            defpackage.r7d.b(r5)
            yr3 r4 = r4.c
            r0.label = r3
            java.lang.Object r5 = r4.o(r0)
            g13 r4 = defpackage.g13.a
            if (r5 != r4) goto L3c
            return r4
        L3c:
            xa9 r5 = (defpackage.xa9) r5
            expo.modules.kotlin.exception.CodedException r4 = r5.b
            if (r4 != 0) goto L4d
            android.graphics.Bitmap r4 = r5.a
            if (r4 == 0) goto L47
            return r4
        L47:
            java.lang.String r4 = "The result doesn't have a value or error"
            defpackage.l5.q(r4)
            return r2
        L4d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb9.a(pu2):java.lang.Object");
    }
}
