package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wl5 {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0059, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.view.View a(android.view.View r4, android.view.View r5, int r6) {
        /*
            r0 = 1
            r1 = -1
            r2 = 0
            if (r6 == r0) goto L32
            r0 = 2
            if (r6 == r0) goto L9
            goto L38
        L9:
            int r6 = r4.getNextFocusForwardId()
            if (r6 != r1) goto L10
            goto L38
        L10:
            vl5 r0 = new vl5
            r0.<init>(r6)
            r6 = r2
        L16:
            android.view.View r6 = b(r4, r0, r6)
            if (r6 != 0) goto L31
            if (r4 != r5) goto L1f
            goto L31
        L1f:
            android.view.ViewParent r6 = r4.getParent()
            if (r6 == 0) goto L30
            boolean r1 = r6 instanceof android.view.View
            if (r1 != 0) goto L2a
            goto L30
        L2a:
            android.view.View r6 = (android.view.View) r6
            r3 = r6
            r6 = r4
            r4 = r3
            goto L16
        L30:
            return r2
        L31:
            return r6
        L32:
            int r6 = r4.getId()
            if (r6 != r1) goto L39
        L38:
            return r2
        L39:
            ul5 r6 = new ul5
            r6.<init>(r5, r4)
            r0 = r2
        L3f:
            android.view.View r0 = b(r4, r6, r0)
            if (r0 != 0) goto L5a
            if (r4 != r5) goto L48
            goto L5a
        L48:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L59
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto L53
            goto L59
        L53:
            android.view.View r0 = (android.view.View) r0
            r3 = r0
            r0 = r4
            r4 = r3
            goto L3f
        L59:
            return r2
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl5.a(android.view.View, android.view.View, int):android.view.View");
    }

    public static final View b(View view, Function1<? super View, Boolean> function1, View view2) {
        View viewB;
        if (function1.invoke(view).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (viewB = b(childAt, function1, view2)) != null) {
                return viewB;
            }
        }
        return null;
    }
}
