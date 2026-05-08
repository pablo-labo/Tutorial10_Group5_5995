package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class o70 {
    public final Context a;

    public o70(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.jn5 r10, defpackage.pu2 r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.n70
            if (r0 == 0) goto L13
            r0 = r11
            n70 r0 = (defpackage.n70) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            n70 r0 = new n70
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            android.content.Context r2 = r9.a
            r9 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3a
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            java.lang.Object r9 = r0.L$0
            r10 = r9
            jn5 r10 = (defpackage.jn5) r10
            defpackage.r7d.b(r11)
            goto L80
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r10)
            return r9
        L36:
            defpackage.r7d.b(r11)
            return r11
        L3a:
            defpackage.r7d.b(r11)
            boolean r11 = r10 instanceof defpackage.m70
            if (r11 != 0) goto L91
            boolean r11 = r10 instanceof defpackage.s5d
            if (r11 == 0) goto L8b
            r9 = r10
            s5d r9 = (defpackage.s5d) r9
            r0.L$0 = r10
            r0.label = r3
            qw1 r11 = new qw1
            lu2 r0 = defpackage.ewa.v(r0)
            r11.<init>(r4, r0)
            r11.q()
            int r3 = r9.a
            p70 r6 = new p70
            r6.<init>(r11, r9)
            java.lang.ThreadLocal<android.util.TypedValue> r9 = defpackage.g6d.a
            boolean r9 = r2.isRestricted()
            if (r9 == 0) goto L6c
            r9 = -4
            r6.a(r9)
            goto L77
        L6c:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            r7 = 0
            r8 = 0
            r5 = 0
            defpackage.g6d.b(r2, r3, r4, r5, r6, r7, r8)
        L77:
            java.lang.Object r11 = r11.p()
            g13 r9 = defpackage.g13.a
            if (r11 != r9) goto L80
            return r9
        L80:
            android.graphics.Typeface r11 = (android.graphics.Typeface) r11
            s5d r10 = (defpackage.s5d) r10
            so5 r9 = r10.d
            android.graphics.Typeface r9 = defpackage.ycb.a(r11, r9, r2)
            return r9
        L8b:
            java.lang.String r11 = "Unknown font type: "
            defpackage.akb.o(r10, r11)
            return r9
        L91:
            r0.label = r4
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o70.a(jn5, pu2):java.lang.Object");
    }

    public final Typeface b(jn5 jn5Var) {
        if (jn5Var instanceof m70) {
            throw null;
        }
        if (!(jn5Var instanceof s5d)) {
            return null;
        }
        s5d s5dVar = (s5d) jn5Var;
        int i = s5dVar.a;
        Context context = this.a;
        Typeface typefaceA = g6d.a(context, i);
        typefaceA.getClass();
        return ycb.a(typefaceA, s5dVar.d, context);
    }
}
