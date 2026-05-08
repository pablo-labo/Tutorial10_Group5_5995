package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* JADX INFO: loaded from: classes.dex */
public final class dn5 {
    public static final FocusTargetNode a(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeF = us3.g(focusTargetNode).getFocusOwner().f();
        if (focusTargetNodeF == null || !focusTargetNodeF.c0) {
            return null;
        }
        return focusTargetNodeF;
    }

    public static final qtc b(FocusTargetNode focusTargetNode) {
        tia tiaVar = focusTargetNode.W;
        return tiaVar != null ? ojh.m(tiaVar).J(tiaVar, false) : qtc.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode c(androidx.compose.ui.focus.FocusTargetNode r8) {
        /*
            androidx.compose.ui.e$c r0 = r8.a
            boolean r0 = r0.c0
            r1 = 0
            if (r0 != 0) goto L9
            goto Laa
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.ae7.b(r0)
        L10:
            j4a r0 = new j4a
            r2 = 16
            androidx.compose.ui.e$c[] r3 = new androidx.compose.ui.e.c[r2]
            r0.<init>(r3)
            androidx.compose.ui.e$c r8 = r8.a
            androidx.compose.ui.e$c r3 = r8.f
            if (r3 != 0) goto L23
            defpackage.us3.a(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.c
            if (r8 == 0) goto Laa
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.k(r8)
            androidx.compose.ui.e$c r8 = (androidx.compose.ui.e.c) r8
            int r3 = r8.d
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            defpackage.us3.a(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.c
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La7
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof androidx.compose.ui.focus.FocusTargetNode
            r5 = 1
            if (r4 == 0) goto L6c
            androidx.compose.ui.focus.FocusTargetNode r8 = (androidx.compose.ui.focus.FocusTargetNode) r8
            androidx.compose.ui.e$c r4 = r8.a
            boolean r4 = r4.c0
            if (r4 == 0) goto La2
            ym5 r4 = r8.P()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L6b
            if (r4 == r5) goto L6b
            r5 = 2
            if (r4 == r5) goto L6b
            r8 = 3
            if (r4 != r8) goto L67
            goto La2
        L67:
            defpackage.l.g()
            return r1
        L6b:
            return r8
        L6c:
            int r4 = r8.c
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La2
            boolean r4 = r8 instanceof defpackage.zs3
            if (r4 == 0) goto La2
            r4 = r8
            zs3 r4 = (defpackage.zs3) r4
            androidx.compose.ui.e$c r4 = r4.e0
            r6 = 0
        L7c:
            if (r4 == 0) goto L9f
            int r7 = r4.c
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9c
            int r6 = r6 + 1
            if (r6 != r5) goto L8a
            r8 = r4
            goto L9c
        L8a:
            if (r3 != 0) goto L93
            j4a r3 = new j4a
            androidx.compose.ui.e$c[] r7 = new androidx.compose.ui.e.c[r2]
            r3.<init>(r7)
        L93:
            if (r8 == 0) goto L99
            r3.b(r8)
            r8 = r1
        L99:
            r3.b(r4)
        L9c:
            androidx.compose.ui.e$c r4 = r4.f
            goto L7c
        L9f:
            if (r6 != r5) goto La2
            goto L45
        La2:
            androidx.compose.ui.e$c r8 = defpackage.us3.b(r3)
            goto L45
        La7:
            androidx.compose.ui.e$c r8 = r8.f
            goto L3c
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn5.c(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean d(FocusTargetNode focusTargetNode) {
        pm8 pm8Var;
        tia tiaVar;
        pm8 pm8Var2;
        tia tiaVar2 = focusTargetNode.W;
        return (tiaVar2 == null || (pm8Var = tiaVar2.e0) == null || !pm8Var.k() || (tiaVar = focusTargetNode.W) == null || (pm8Var2 = tiaVar.e0) == null || !pm8Var2.d()) ? false : true;
    }
}
