package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.indeed.android.jobsearch.R;
import defpackage.awd;
import defpackage.epg;
import defpackage.ff9;
import defpackage.jkf;
import defpackage.ka2;
import defpackage.lac;
import defpackage.prg;
import defpackage.ze9;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    public Integer M0;
    public boolean N0;
    public boolean O0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(ff9.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayD = jkf.d(context2, attributeSet, lac.y, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayD.hasValue(0)) {
            setNavigationIconTint(typedArrayD.getColor(0, -1));
        }
        this.N0 = typedArrayD.getBoolean(2, false);
        this.O0 = typedArrayD.getBoolean(1, false);
        typedArrayD.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            ze9 ze9Var = new ze9();
            ze9Var.k(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            ze9Var.i(context2);
            WeakHashMap<View, prg> weakHashMap = epg.a;
            ze9Var.j(epg.d.e(this));
            setBackground(ze9Var);
        }
    }

    public Integer getNavigationIconTint() {
        return this.M0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ka2.G(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.N0 || this.O0) {
            TextView textViewD = awd.d(this, getTitle());
            TextView textViewD2 = awd.d(this, getSubtitle());
            if (textViewD == null && textViewD2 == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int i5 = measuredWidth / 2;
            int paddingLeft = getPaddingLeft();
            int paddingRight = measuredWidth - getPaddingRight();
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8 && childAt != textViewD && childAt != textViewD2) {
                    if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                        paddingLeft = childAt.getRight();
                    }
                    if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                        paddingRight = childAt.getLeft();
                    }
                }
            }
            Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
            if (this.N0 && textViewD != null) {
                y(textViewD, pair);
            }
            if (!this.O0 || textViewD2 == null) {
                return;
            }
            y(textViewD2, pair);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ka2.E(this, f);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.M0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.M0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.M0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.O0 != z) {
            this.O0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.N0 != z) {
            this.N0 = z;
            requestLayout();
        }
    }

    public final void y(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
