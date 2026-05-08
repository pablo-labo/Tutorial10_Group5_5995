package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ye1 {
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8 A[PHI: r0
  0x00a8: PHI (r0v11 int) = (r0v6 int), (r0v7 int), (r0v8 int), (r0v9 int), (r0v10 int) binds: [B:54:0x00a6, B:57:0x00ab, B:60:0x00af, B:63:0x00b3, B:66:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T a(androidx.compose.ui.focus.FocusTargetNode r9, int r10, kotlin.jvm.functions.Function1<? super we1.a, ? extends T> r11) {
        /*
            androidx.compose.ui.e$c r0 = r9.a
            boolean r0 = r0.c0
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.ae7.b(r0)
        Lb:
            androidx.compose.ui.e$c r0 = r9.a
            androidx.compose.ui.e$c r0 = r0.e
            pm8 r1 = defpackage.us3.f(r9)
        L13:
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L81
            ria r4 = r1.t0
            androidx.compose.ui.e$c r4 = r4.f
            int r4 = r4.d
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L72
        L21:
            if (r0 == 0) goto L72
            int r4 = r0.c
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L6f
            r4 = r0
            r5 = r3
        L2b:
            if (r4 == 0) goto L6f
            boolean r6 = r4 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r6 == 0) goto L32
            goto L82
        L32:
            int r6 = r4.c
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L6a
            boolean r6 = r4 instanceof defpackage.zs3
            if (r6 == 0) goto L6a
            r6 = r4
            zs3 r6 = (defpackage.zs3) r6
            androidx.compose.ui.e$c r6 = r6.e0
            r7 = 0
        L42:
            if (r6 == 0) goto L67
            int r8 = r6.c
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L64
            int r7 = r7 + 1
            if (r7 != r2) goto L50
            r4 = r6
            goto L64
        L50:
            if (r5 != 0) goto L5b
            j4a r5 = new j4a
            r8 = 16
            androidx.compose.ui.e$c[] r8 = new androidx.compose.ui.e.c[r8]
            r5.<init>(r8)
        L5b:
            if (r4 == 0) goto L61
            r5.b(r4)
            r4 = r3
        L61:
            r5.b(r6)
        L64:
            androidx.compose.ui.e$c r6 = r6.f
            goto L42
        L67:
            if (r7 != r2) goto L6a
            goto L2b
        L6a:
            androidx.compose.ui.e$c r4 = defpackage.us3.b(r5)
            goto L2b
        L6f:
            androidx.compose.ui.e$c r0 = r0.e
            goto L21
        L72:
            pm8 r1 = r1.K()
            if (r1 == 0) goto L7f
            ria r0 = r1.t0
            if (r0 == 0) goto L7f
            f8f r0 = r0.e
            goto L13
        L7f:
            r0 = r3
            goto L13
        L81:
            r4 = r3
        L82:
            androidx.compose.ui.focus.FocusTargetNode r4 = (androidx.compose.ui.focus.FocusTargetNode) r4
            if (r4 == 0) goto L9b
            g6c<we1> r0 = defpackage.xe1.a
            java.lang.Object r1 = r4.g(r0)
            we1 r1 = (defpackage.we1) r1
            java.lang.Object r0 = r9.g(r0)
            we1 r0 = (defpackage.we1) r0
            boolean r0 = defpackage.wl7.b(r1, r0)
            if (r0 == 0) goto L9b
            goto Lc6
        L9b:
            g6c<we1> r0 = defpackage.xe1.a
            java.lang.Object r9 = r9.g(r0)
            we1 r9 = (defpackage.we1) r9
            if (r9 == 0) goto Lc6
            r0 = 5
            if (r10 != r0) goto Laa
        La8:
            r2 = r0
            goto Lbc
        Laa:
            r0 = 6
            if (r10 != r0) goto Lae
            goto La8
        Lae:
            r0 = 3
            if (r10 != r0) goto Lb2
            goto La8
        Lb2:
            r0 = 4
            if (r10 != r0) goto Lb6
            goto La8
        Lb6:
            r0 = 2
            if (r10 != r2) goto Lba
            goto La8
        Lba:
            if (r10 != r0) goto Lc1
        Lbc:
            java.lang.Object r9 = r9.O(r11, r2)
            return r9
        Lc1:
            java.lang.String r9 = "Unsupported direction for beyond bounds layout"
            defpackage.r6.g(r9)
        Lc6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye1.a(androidx.compose.ui.focus.FocusTargetNode, int, kotlin.jvm.functions.Function1):java.lang.Object");
    }
}
