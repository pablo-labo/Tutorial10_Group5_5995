package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextHelper;

/* JADX INFO: loaded from: classes.dex */
public final class umf {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public umf(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static umf e(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new umf(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final ColorStateList a(int i) {
        int resourceId;
        ColorStateList colorStateListZ;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListZ = pnb.z(this.a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListZ;
    }

    public final Drawable b(int i) {
        int resourceId;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : pnb.A(this.a, resourceId);
    }

    public final Drawable c(int i) {
        int resourceId;
        Drawable drawableD;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        pj0 pj0VarA = pj0.a();
        Context context = this.a;
        synchronized (pj0VarA) {
            drawableD = pj0VarA.a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public final Typeface d(int i, int i2, AppCompatTextHelper.a aVar) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        ThreadLocal<TypedValue> threadLocal = g6d.a;
        Context context = this.a;
        if (context.isRestricted()) {
            return null;
        }
        return g6d.b(context, resourceId, typedValue, i2, aVar, true, false);
    }

    public final void f() {
        this.b.recycle();
    }
}
