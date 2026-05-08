package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class xl5 {
    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(im5 im5Var, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        qtc qtcVarO = im5Var.o();
        if (qtcVarO == null) {
            return null;
        }
        int i = (int) qtcVarO.a;
        int i2 = iArr[0];
        int i3 = iArr2[0];
        int i4 = (int) qtcVarO.b;
        int i5 = iArr[1];
        int i6 = iArr2[1];
        return new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) qtcVarO.c) + i2) - i3, (((int) qtcVarO.d) + i5) - i6);
    }

    public static final View c(e.c cVar) {
        ypg ypgVar = us3.f(cVar.a).c0;
        View interopView = ypgVar != null ? ypgVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        r6.g("Could not fetch interop view");
        return null;
    }
}
