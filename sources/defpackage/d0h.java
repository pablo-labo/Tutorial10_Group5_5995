package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes2.dex */
public final class d0h {
    public static WindowInsets a(View view, int i) {
        Insets insets = view.getRootWindowInsets().getInsets(WindowInsets.Type.ime());
        insets.getClass();
        int i2 = insets.bottom;
        if (i < i2) {
            i = i2;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ja.k("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i;
        view.setLayoutParams(marginLayoutParams);
        WindowInsets windowInsetsBuild = new WindowInsets.Builder().setInsets(WindowInsets.Type.ime(), insets).build();
        windowInsetsBuild.getClass();
        return windowInsetsBuild;
    }

    public static WindowInsets b(View view, View view2, WindowInsets windowInsets) {
        view2.getClass();
        Insets insets = view.getRootWindowInsets().getInsets(7);
        insets.getClass();
        Insets insets2 = windowInsets.getInsets(7);
        insets2.getClass();
        int i = insets.bottom;
        int i2 = insets2.bottom;
        if (i < i2) {
            i = i2;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ja.k("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i;
        marginLayoutParams.leftMargin = insets2.left;
        marginLayoutParams.rightMargin = insets2.right;
        marginLayoutParams.topMargin = insets2.top;
        view.setLayoutParams(marginLayoutParams);
        return a(view2, i);
    }
}
