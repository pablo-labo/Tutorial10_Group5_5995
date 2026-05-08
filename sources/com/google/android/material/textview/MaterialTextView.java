package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.ff9;
import defpackage.lac;
import defpackage.me9;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(ff9.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        TypedValue typedValueA = me9.a(context2, com.indeed.android.jobsearch.R.attr.textAppearanceLineHeightEnabled);
        if (typedValueA != null && typedValueA.type == 18 && typedValueA.data == 0) {
            return;
        }
        Resources.Theme theme = context2.getTheme();
        int[] iArr = lac.x;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        int iD = d(context2, typedArrayObtainStyledAttributes, 1, 2);
        typedArrayObtainStyledAttributes.recycle();
        if (iD != -1) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId != -1) {
            TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, lac.w);
            int iD2 = d(getContext(), typedArrayObtainStyledAttributes3, 1, 2);
            typedArrayObtainStyledAttributes3.recycle();
            if (iD2 >= 0) {
                setLineHeight(iD2);
            }
        }
    }

    public static int d(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            int i2 = iArr[i];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i2, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        TypedValue typedValueA = me9.a(context, com.indeed.android.jobsearch.R.attr.textAppearanceLineHeightEnabled);
        if (typedValueA != null && typedValueA.type == 18 && typedValueA.data == 0) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, lac.w);
        int iD = d(getContext(), typedArrayObtainStyledAttributes, 1, 2);
        typedArrayObtainStyledAttributes.recycle();
        if (iD >= 0) {
            setLineHeight(iD);
        }
    }
}
