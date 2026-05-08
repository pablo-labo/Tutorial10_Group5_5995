package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class rd1 {
    public static final jte a = new jte(new pd1(0));
    public static Boolean b;

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[Catch: RejectedExecutionException -> 0x008d, TryCatch #0 {RejectedExecutionException -> 0x008d, blocks: (B:8:0x0038, B:14:0x0045, B:16:0x005a, B:21:0x0065, B:23:0x0077, B:26:0x0088, B:25:0x007b, B:18:0x0060, B:10:0x003e), top: B:32:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.le0 r9, final defpackage.tjf r10, final pn5.a r11, final java.util.List<le0.c<defpackage.sab>> r12, androidx.compose.runtime.b r13, int r14) {
        /*
            jte r0 = defpackage.rd1.a
            java.lang.Object r0 = r13.M(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            if (r0 == 0) goto L91
            java.lang.String r1 = r9.b
            int r1 = r1.length()
            boolean r1 = b(r1)
            if (r1 == 0) goto L91
            r1 = -518708178(0xffffffffe115242e, float:-1.7194824E20)
            r13.L(r1)
            jte r1 = defpackage.um2.n
            java.lang.Object r1 = r13.M(r1)
            r4 = r1
            vl8 r4 = (defpackage.vl8) r4
            jte r1 = defpackage.um2.h
            java.lang.Object r1 = r13.M(r1)
            r7 = r1
            iy3 r7 = (defpackage.iy3) r7
            r1 = r14 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r2 = 0
            r3 = 1
            r5 = 32
            if (r1 <= r5) goto L3e
            boolean r1 = r13.K(r10)     // Catch: java.util.concurrent.RejectedExecutionException -> L8d
            if (r1 != 0) goto L42
        L3e:
            r1 = r14 & 48
            if (r1 != r5) goto L44
        L42:
            r1 = r3
            goto L45
        L44:
            r1 = r2
        L45:
            int r5 = r4.ordinal()     // Catch: java.util.concurrent.RejectedExecutionException -> L8d
            boolean r5 = r13.d(r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L8d
            r1 = r1 | r5
            boolean r5 = r13.x(r12)     // Catch: java.util.concurrent.RejectedExecutionException -> L8d
            r1 = r1 | r5
            r5 = r14 & 14
            r5 = r5 ^ 6
            r6 = 4
            if (r5 <= r6) goto L60
            boolean r5 = r13.K(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L8d
            if (r5 != 0) goto L64
        L60:
            r14 = r14 & 6
            if (r14 != r6) goto L65
        L64:
            r2 = r3
        L65:
            r14 = r1 | r2
            boolean r1 = r13.K(r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L8d
            r14 = r14 | r1
            boolean r1 = r13.x(r11)     // Catch: java.util.concurrent.RejectedExecutionException -> L8d
            r14 = r14 | r1
            java.lang.Object r1 = r13.v()     // Catch: java.util.concurrent.RejectedExecutionException -> L8d
            if (r14 != 0) goto L7b
            androidx.compose.runtime.b$a$a r14 = androidx.compose.runtime.b.a.a     // Catch: java.util.concurrent.RejectedExecutionException -> L8d
            if (r1 != r14) goto L88
        L7b:
            od1 r2 = new od1     // Catch: java.util.concurrent.RejectedExecutionException -> L8d
            r6 = r9
            r3 = r10
            r8 = r11
            r5 = r12
            r2.<init>()     // Catch: java.util.concurrent.RejectedExecutionException -> L8d
            r13.p(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L8d
            r1 = r2
        L88:
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.util.concurrent.RejectedExecutionException -> L8d
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L8d
        L8d:
            r13.F()
            return
        L91:
            r9 = -517807721(0xffffffffe122e197, float:-1.8778925E20)
            r13.L(r9)
            r13.F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd1.a(le0, tjf, pn5$a, java.util.List, androidx.compose.runtime.b, int):void");
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            if (b == null) {
                b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = b;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
