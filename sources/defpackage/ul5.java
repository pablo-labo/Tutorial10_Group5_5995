package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ul5 extends mj8 implements Function1<View, Boolean> {
    final /* synthetic */ View $root;
    final /* synthetic */ View $startView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul5(View view, View view2) {
        super(1);
        this.$root = view;
        this.$startView = view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r1 = r3;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke(android.view.View r7) {
        /*
            r6 = this;
            android.view.View r7 = (android.view.View) r7
            android.view.View r0 = r6.$root
            int r1 = r7.getNextFocusForwardId()
            vl5 r2 = new vl5
            r2.<init>(r1)
            r1 = 0
            r3 = r1
        Lf:
            android.view.View r3 = defpackage.wl5.b(r7, r2, r3)
            if (r3 != 0) goto L29
            if (r7 != r0) goto L18
            goto L29
        L18:
            android.view.ViewParent r3 = r7.getParent()
            if (r3 == 0) goto L2a
            boolean r4 = r3 instanceof android.view.View
            if (r4 != 0) goto L23
            goto L2a
        L23:
            android.view.View r3 = (android.view.View) r3
            r5 = r3
            r3 = r7
            r7 = r5
            goto Lf
        L29:
            r1 = r3
        L2a:
            android.view.View r6 = r6.$startView
            if (r1 != r6) goto L30
            r6 = 1
            goto L31
        L30:
            r6 = 0
        L31:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul5.invoke(java.lang.Object):java.lang.Object");
    }
}
