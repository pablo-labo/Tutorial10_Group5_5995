package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ydd {
    public static final int[] a = {R.attr.state_pressed};
    public static final int[] b = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] c = {R.attr.state_selected};
    public static final int[] d = {R.attr.state_enabled, R.attr.state_pressed};
    public static final String e = ydd.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        int colorForState;
        int colorForState2 = 0;
        if (colorStateList != null) {
            colorForState = colorStateList.getColorForState(b, colorStateList.getDefaultColor());
        } else {
            colorForState = 0;
        }
        int iE = eb2.e(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
        int[][] iArr = {c, StateSet.NOTHING};
        if (colorStateList != null) {
            colorForState2 = colorStateList.getColorForState(a, colorStateList.getDefaultColor());
        }
        return new ColorStateList(iArr, new int[]{iE, eb2.e(colorForState2, Math.min(Color.alpha(colorForState2) * 2, 255))});
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(d, 0)) != 0) {
            Log.w(e, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean c(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
