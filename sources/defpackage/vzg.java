package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes3.dex */
public final class vzg {
    public static WindowInsets a(View view, View view2, WindowInsets windowInsets) {
        view2.getClass();
        Insets insets = windowInsets.getInsets(7);
        insets.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ja.k("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = insets.bottom;
        marginLayoutParams.leftMargin = insets.left;
        marginLayoutParams.rightMargin = insets.right;
        marginLayoutParams.topMargin = view2.getPaddingTop() + insets.top;
        view.setLayoutParams(marginLayoutParams);
        Insets insets2 = view2.getRootWindowInsets().getInsets(WindowInsets.Type.ime());
        insets2.getClass();
        int i = insets.bottom;
        int i2 = insets2.bottom;
        if (i <= i2) {
            i = i2;
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            ja.k("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = i;
        view2.setLayoutParams(marginLayoutParams2);
        WindowInsets windowInsetsBuild = new WindowInsets.Builder().setInsets(WindowInsets.Type.ime(), insets2).build();
        windowInsetsBuild.getClass();
        return windowInsetsBuild;
    }
}
