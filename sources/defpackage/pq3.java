package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes2.dex */
public final class pq3 {
    public static final int a(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.textColorHighlight});
        typedArrayObtainStyledAttributes.getClass();
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }
}
