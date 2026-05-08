package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class ye9 {
    public static ColorStateList a(Context context, umf umfVar, int i) {
        int resourceId;
        ColorStateList colorStateListZ;
        TypedArray typedArray = umfVar.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListZ = pnb.z(context, resourceId)) == null) ? umfVar.a(i) : colorStateListZ;
    }

    public static ColorStateList b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListZ;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListZ = pnb.z(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListZ;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableA;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableA = pnb.A(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableA;
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
