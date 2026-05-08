package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class da4 {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Path cross not found for [B:32:0x00c6, B:38:0x00e2], limit reached: 67 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0092 -> B:23:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.l61 r17, defpackage.yeb r18, defpackage.peb r19, defpackage.x81 r20) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da4.a(l61, yeb, peb, x81):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        if (defpackage.ooa.c(defpackage.mh2.s(r6, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:22:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.l61 r12, long r13, defpackage.pu2 r15) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da4.b(l61, long, pu2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.lang.Object, yeb] */
    /* JADX WARN: Type inference failed for: r9v3, types: [luc] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.l61 r8, long r9, defpackage.pu2 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.z94
            if (r0 == 0) goto L13
            r0 = r11
            z94 r0 = (defpackage.z94) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            z94 r0 = new z94
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L39
            if (r1 != r2) goto L33
            java.lang.Object r8 = r0.L$2
            huc r8 = (defpackage.huc) r8
            java.lang.Object r9 = r0.L$1
            luc r9 = (defpackage.luc) r9
            java.lang.Object r10 = r0.L$0
            yeb r10 = (defpackage.yeb) r10
            defpackage.r7d.b(r11)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lae
            goto La1
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r3
        L39:
            defpackage.r7d.b(r11)
            neb r11 = r8.Q0()
            boolean r11 = e(r11, r9)
            if (r11 == 0) goto L47
            goto Lad
        L47:
            neb r11 = r8.Q0()
            java.util.List<yeb> r11 = r11.a
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r4 = 0
        L55:
            if (r4 >= r1) goto L6a
            java.lang.Object r5 = r11.get(r4)
            r6 = r5
            yeb r6 = (defpackage.yeb) r6
            long r6 = r6.a
            boolean r6 = defpackage.web.m(r6, r9)
            if (r6 == 0) goto L67
            goto L6b
        L67:
            int r4 = r4 + 1
            goto L55
        L6a:
            r5 = r3
        L6b:
            r10 = r5
            yeb r10 = (defpackage.yeb) r10
            if (r10 != 0) goto L71
            goto Lad
        L71:
            luc r9 = new luc
            r9.<init>()
            luc r11 = new luc
            r11.<init>()
            r11.element = r10
            opg r1 = r8.getViewConfiguration()
            long r4 = r1.b()
            huc r1 = new huc     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lae
            r1.<init>()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lae
            aa4 r6 = new aa4     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lae
            r6.<init>(r1, r11, r9, r3)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lae
            r0.L$0 = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lae
            r0.L$1 = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lae
            r0.L$2 = r1     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lae
            r0.label = r2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lae
            java.lang.Object r8 = r8.v1(r4, r6, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lae
            g13 r11 = defpackage.g13.a
            if (r8 != r11) goto La0
            return r11
        La0:
            r8 = r1
        La1:
            boolean r8 = r8.element     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lae
            if (r8 == 0) goto Lad
            T r8 = r9.element     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lae
            yeb r8 = (defpackage.yeb) r8     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lae
            if (r8 != 0) goto Lac
            return r10
        Lac:
            return r8
        Lad:
            return r3
        Lae:
            T r8 = r9.element
            yeb r8 = (defpackage.yeb) r8
            if (r8 != 0) goto Lb5
            goto Lb6
        Lb5:
            r10 = r8
        Lb6:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da4.c(l61, long, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0045 -> B:18:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.l61 r4, long r5, kotlin.jvm.functions.Function1 r7, defpackage.pu2 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ca4
            if (r0 == 0) goto L13
            r0 = r8
            ca4 r0 = (defpackage.ca4) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ca4 r0 = new ca4
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r5 = r0.L$0
            l61 r5 = (defpackage.l61) r5
            defpackage.r7d.b(r8)
            r7 = r4
            r4 = r5
            goto L48
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L36:
            defpackage.r7d.b(r8)
        L39:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r2
            java.lang.Object r8 = b(r4, r5, r0)
            g13 r5 = defpackage.g13.a
            if (r8 != r5) goto L48
            return r5
        L48:
            yeb r8 = (defpackage.yeb) r8
            if (r8 != 0) goto L4f
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4f:
            boolean r5 = defpackage.mh2.i(r8)
            if (r5 == 0) goto L58
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L58:
            r7.invoke(r8)
            long r5 = r8.a
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da4.d(l61, long, kotlin.jvm.functions.Function1, pu2):java.lang.Object");
    }

    public static final boolean e(neb nebVar, long j) {
        yeb yebVar;
        List<yeb> list = nebVar.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                yebVar = null;
                break;
            }
            yebVar = list.get(i);
            if (web.m(yebVar.a, j)) {
                break;
            }
            i++;
        }
        yeb yebVar2 = yebVar;
        if (yebVar2 != null && yebVar2.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float f(opg opgVar, int i) {
        return i == 2 ? opgVar.f() * a : opgVar.f();
    }
}
