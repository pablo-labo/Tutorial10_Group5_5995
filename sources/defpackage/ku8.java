package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ku8 {
    public static void a(wxe wxeVar, int i, wq2<s83> wq2Var) {
        long jF = wxeVar.f(i);
        List<n83> listE = wxeVar.e(jF);
        if (listE.isEmpty()) {
            return;
        }
        if (i == wxeVar.m() - 1) {
            bg.h();
            return;
        }
        long jF2 = wxeVar.f(i + 1) - wxeVar.f(i);
        if (jF2 > 0) {
            wq2Var.accept(new s83(jF, jF2, listE));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(defpackage.wxe r12, dye.b r13, defpackage.wq2<defpackage.s83> r14) {
        /*
            long r0 = r13.a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r12.a(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.m()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r12.f(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            int r2 = r12.m()
            if (r4 >= r2) goto L51
            java.util.List r11 = r12.e(r0)
            long r2 = r12.f(r4)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L51
            long r7 = r13.a
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            s83 r6 = new s83
            long r9 = r2 - r7
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
            r2 = 1
            goto L52
        L51:
            r2 = r5
        L52:
            r3 = r4
        L53:
            int r6 = r12.m()
            if (r3 >= r6) goto L5f
            a(r12, r3, r14)
            int r3 = r3 + 1
            goto L53
        L5f:
            boolean r13 = r13.b
            if (r13 == 0) goto L87
            if (r2 == 0) goto L67
            int r4 = r4 + (-1)
        L67:
            if (r5 >= r4) goto L6f
            a(r12, r5, r14)
            int r5 = r5 + 1
            goto L67
        L6f:
            if (r2 == 0) goto L87
            s83 r6 = new s83
            java.util.List r11 = r12.e(r0)
            long r7 = r12.f(r4)
            long r12 = r12.f(r4)
            long r9 = r0 - r12
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku8.b(wxe, dye$b, wq2):void");
    }
}
