package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import defpackage.ze9;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class yu1 {
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final ece f;

    public yu1(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ece eceVar, Rect rect) {
        hh2.k(rect.left);
        hh2.k(rect.top);
        hh2.k(rect.right);
        hh2.k(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = eceVar;
    }

    public static yu1 a(Context context, int i) {
        hh2.j("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, lac.s);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListB = ye9.b(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListB2 = ye9.b(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListB3 = ye9.b(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        ece eceVarA = ece.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new k0(0.0f)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new yu1(colorStateListB, colorStateListB2, colorStateListB3, dimensionPixelSize, eceVarA, rect);
    }

    public final void b(TextView textView) {
        ze9 ze9Var = new ze9();
        ze9 ze9Var2 = new ze9();
        ece eceVar = this.f;
        ze9Var.setShapeAppearanceModel(eceVar);
        ze9Var2.setShapeAppearanceModel(eceVar);
        ze9Var.k(this.c);
        ze9Var.a.j = this.e;
        ze9Var.invalidateSelf();
        ze9.b bVar = ze9Var.a;
        ColorStateList colorStateList = bVar.d;
        ColorStateList colorStateList2 = this.d;
        if (colorStateList != colorStateList2) {
            bVar.d = colorStateList2;
            ze9Var.onStateChange(ze9Var.getState());
        }
        ColorStateList colorStateList3 = this.b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), ze9Var, ze9Var2);
        Rect rect = this.a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        textView.setBackground(insetDrawable);
    }
}
