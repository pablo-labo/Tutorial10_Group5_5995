package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class z4h {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.platform.k a(defpackage.n1 r6, defpackage.dm2 r7, defpackage.ah2 r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.fa6.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L48
            r0 = 6
            go1 r0 = defpackage.h22.a(r2, r0, r3)
            d2f r2 = defpackage.hb0.b0
            java.lang.Object r2 = r2.getValue()
            v03 r2 = (defpackage.v03) r2
            eu2 r2 = defpackage.f13.a(r2)
            da6 r4 = new da6
            r4.<init>(r0, r3)
            r5 = 3
            defpackage.u63.Y(r2, r3, r3, r4, r5)
            wle$a r2 = defpackage.wle.e
            ea6 r4 = new ea6
            r4.<init>(r0)
            r2.getClass()
            java.lang.Object r0 = defpackage.ame.c
            monitor-enter(r0)
            java.util.List<? extends kotlin.jvm.functions.Function1<java.lang.Object, j6g>> r2 = defpackage.ame.i     // Catch: java.lang.Throwable -> L45
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList r2 = defpackage.z92.g1(r4, r2)     // Catch: java.lang.Throwable -> L45
            defpackage.ame.i = r2     // Catch: java.lang.Throwable -> L45
            j6g r2 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L45
            monitor-exit(r0)
            nf r0 = defpackage.ame.a
            defpackage.ame.e(r0)
            goto L48
        L45:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L48:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L5b
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r1 == 0) goto L59
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L5f
        L59:
            r0 = r3
            goto L5f
        L5b:
            r6.removeAllViews()
            goto L59
        L5f:
            if (r0 != 0) goto L77
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r1 = r6.getContext()
            v03 r2 = r7.k()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = defpackage.z4h.a
            r6.addView(r1, r2)
        L77:
            tf7$a r6 = defpackage.tf7.a
            android.view.View r6 = r0.getView()
            r1 = 2131362710(0x7f0a0396, float:1.8345208E38)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof androidx.compose.ui.platform.k
            if (r2 == 0) goto L8b
            r3 = r6
            androidx.compose.ui.platform.k r3 = (androidx.compose.ui.platform.k) r3
        L8b:
            if (r3 != 0) goto La7
            androidx.compose.ui.platform.k r3 = new androidx.compose.ui.platform.k
            cba r6 = new cba
            pm8 r2 = r0.getRoot()
            r6.<init>(r2)
            km2 r2 = new km2
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        La7:
            r3.h(r8)
            v03 r6 = r0.getCoroutineContext()
            v03 r8 = r7.k()
            boolean r6 = defpackage.wl7.b(r6, r8)
            if (r6 != 0) goto Lbf
            v03 r6 = r7.k()
            r0.setCoroutineContext(r6)
        Lbf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4h.a(n1, dm2, ah2):androidx.compose.ui.platform.k");
    }
}
