package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import defpackage.cde;
import defpackage.ece;
import defpackage.epg;
import defpackage.ff9;
import defpackage.gsg;
import defpackage.jkf;
import defpackage.k0;
import defpackage.ka2;
import defpackage.l5;
import defpackage.lac;
import defpackage.pe9;
import defpackage.pnb;
import defpackage.prg;
import defpackage.r6;
import defpackage.ydd;
import defpackage.ye9;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, cde {
    public static final int[] i0 = {R.attr.state_checkable};
    public static final int[] j0 = {R.attr.state_checked};
    public PorterDuff.Mode V;
    public ColorStateList W;
    public Drawable a0;
    public int b0;
    public int c0;
    public final pe9 d;
    public int d0;
    public final LinkedHashSet<a> e;
    public int e0;
    public b f;
    public boolean f0;
    public boolean g0;
    public int h0;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    public interface b {
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(ff9.a(context, attributeSet, com.indeed.android.jobsearch.R.attr.materialButtonStyle, com.indeed.android.jobsearch.R.style.Widget_MaterialComponents_Button), attributeSet, com.indeed.android.jobsearch.R.attr.materialButtonStyle);
        this.e = new LinkedHashSet<>();
        this.f0 = false;
        this.g0 = false;
        Context context2 = getContext();
        TypedArray typedArrayD = jkf.d(context2, attributeSet, lac.p, com.indeed.android.jobsearch.R.attr.materialButtonStyle, com.indeed.android.jobsearch.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.e0 = typedArrayD.getDimensionPixelSize(12, 0);
        int i = typedArrayD.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.V = gsg.d(i, mode);
        this.W = ye9.b(getContext(), typedArrayD, 14);
        this.a0 = ye9.c(getContext(), typedArrayD, 10);
        this.h0 = typedArrayD.getInteger(11, 1);
        this.b0 = typedArrayD.getDimensionPixelSize(13, 0);
        pe9 pe9Var = new pe9(this, ece.b(context2, attributeSet, com.indeed.android.jobsearch.R.attr.materialButtonStyle, com.indeed.android.jobsearch.R.style.Widget_MaterialComponents_Button).a());
        this.d = pe9Var;
        pe9Var.c = typedArrayD.getDimensionPixelOffset(1, 0);
        pe9Var.d = typedArrayD.getDimensionPixelOffset(2, 0);
        pe9Var.e = typedArrayD.getDimensionPixelOffset(3, 0);
        pe9Var.f = typedArrayD.getDimensionPixelOffset(4, 0);
        if (typedArrayD.hasValue(8)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(8, -1);
            pe9Var.g = dimensionPixelSize;
            float f = dimensionPixelSize;
            ece.a aVarE = pe9Var.b.e();
            aVarE.e = new k0(f);
            aVarE.f = new k0(f);
            aVarE.g = new k0(f);
            aVarE.h = new k0(f);
            pe9Var.c(aVarE.a());
            pe9Var.p = true;
        }
        pe9Var.h = typedArrayD.getDimensionPixelSize(20, 0);
        pe9Var.i = gsg.d(typedArrayD.getInt(7, -1), mode);
        pe9Var.j = ye9.b(getContext(), typedArrayD, 6);
        pe9Var.k = ye9.b(getContext(), typedArrayD, 19);
        pe9Var.l = ye9.b(getContext(), typedArrayD, 16);
        pe9Var.q = typedArrayD.getBoolean(5, false);
        pe9Var.s = typedArrayD.getDimensionPixelSize(9, 0);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(0)) {
            pe9Var.o = true;
            setSupportBackgroundTintList(pe9Var.j);
            setSupportBackgroundTintMode(pe9Var.i);
        } else {
            pe9Var.e();
        }
        setPaddingRelative(paddingStart + pe9Var.c, paddingTop + pe9Var.e, paddingEnd + pe9Var.d, paddingBottom + pe9Var.f);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.e0);
        c(this.a0 != null);
    }

    private String getA11yClassName() {
        pe9 pe9Var = this.d;
        return ((pe9Var == null || !pe9Var.q) ? Button.class : CompoundButton.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    public final boolean a() {
        pe9 pe9Var = this.d;
        return (pe9Var == null || pe9Var.o) ? false : true;
    }

    public final void b() {
        int i = this.h0;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.a0, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.a0, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.a0, null, null);
        }
    }

    public final void c(boolean z) {
        Drawable drawable = this.a0;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.a0 = drawableMutate;
            drawableMutate.setTintList(this.W);
            PorterDuff.Mode mode = this.V;
            if (mode != null) {
                this.a0.setTintMode(mode);
            }
            int intrinsicWidth = this.b0;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.a0.getIntrinsicWidth();
            }
            int intrinsicHeight = this.b0;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.a0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.a0;
            int i = this.c0;
            int i2 = this.d0;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.a0.setVisible(true, z);
        }
        if (z) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.h0;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.a0) || (((i3 == 3 || i3 == 4) && drawable5 != this.a0) || ((i3 == 16 || i3 == 32) && drawable4 != this.a0))) {
            b();
        }
    }

    public final void d(int i, int i2) {
        if (this.a0 == null || getLayout() == null) {
            return;
        }
        int i3 = this.h0;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.c0 = 0;
                if (i3 == 16) {
                    this.d0 = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.b0;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.a0.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.e0) - getPaddingBottom()) / 2;
                if (this.d0 != textHeight) {
                    this.d0 = textHeight;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.d0 = 0;
        if (i3 == 1 || i3 == 3) {
            this.c0 = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.b0;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.a0.getIntrinsicWidth();
        }
        int textWidth = i - getTextWidth();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        int paddingEnd = ((((textWidth - getPaddingEnd()) - intrinsicWidth) - this.e0) - getPaddingStart()) / 2;
        if ((getLayoutDirection() == 1) != (this.h0 == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.c0 != paddingEnd) {
            this.c0 = paddingEnd;
            c(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.d.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.a0;
    }

    public int getIconGravity() {
        return this.h0;
    }

    public int getIconPadding() {
        return this.e0;
    }

    public int getIconSize() {
        return this.b0;
    }

    public ColorStateList getIconTint() {
        return this.W;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.V;
    }

    public int getInsetBottom() {
        return this.d.f;
    }

    public int getInsetTop() {
        return this.d.e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.d.l;
        }
        return null;
    }

    public ece getShapeAppearanceModel() {
        if (a()) {
            return this.d.b;
        }
        r6.g("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.d.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.d.h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.d.j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            ka2.F(this, this.d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        pe9 pe9Var = this.d;
        if (pe9Var != null && pe9Var.q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, i0);
        }
        if (this.f0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, j0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f0);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        pe9 pe9Var = this.d;
        accessibilityNodeInfo.setCheckable(pe9Var != null && pe9Var.q);
        accessibilityNodeInfo.setChecked(this.f0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        setChecked(savedState.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.f0;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d(i, i2);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.a0 != null) {
            if (this.a0.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        pe9 pe9Var = this.d;
        if (pe9Var.b(false) != null) {
            pe9Var.b(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        pe9 pe9Var = this.d;
        pe9Var.o = true;
        MaterialButton materialButton = pe9Var.a;
        materialButton.setSupportBackgroundTintList(pe9Var.j);
        materialButton.setSupportBackgroundTintMode(pe9Var.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? pnb.A(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (a()) {
            this.d.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        pe9 pe9Var = this.d;
        if (pe9Var == null || !pe9Var.q || !isEnabled() || this.f0 == z) {
            return;
        }
        this.f0 = z;
        refreshDrawableState();
        if (this.g0) {
            return;
        }
        this.g0 = true;
        Iterator<a> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f0);
        }
        this.g0 = false;
    }

    public void setCornerRadius(int i) {
        if (a()) {
            pe9 pe9Var = this.d;
            if (pe9Var.p && pe9Var.g == i) {
                return;
            }
            pe9Var.g = i;
            pe9Var.p = true;
            float f = i;
            ece.a aVarE = pe9Var.b.e();
            aVarE.e = new k0(f);
            aVarE.f = new k0(f);
            aVarE.g = new k0(f);
            aVarE.h = new k0(f);
            pe9Var.c(aVarE.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.d.b(false).j(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.a0 != drawable) {
            this.a0 = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.h0 != i) {
            this.h0 = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.e0 != i) {
            this.e0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? pnb.A(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            l5.q("iconSize cannot be less than 0");
        } else if (this.b0 != i) {
            this.b0 = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.V != mode) {
            this.V = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(pnb.z(getContext(), i));
    }

    public void setInsetBottom(int i) {
        pe9 pe9Var = this.d;
        pe9Var.d(pe9Var.e, i);
    }

    public void setInsetTop(int i) {
        pe9 pe9Var = this.d;
        pe9Var.d(i, pe9Var.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.f;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            pe9 pe9Var = this.d;
            MaterialButton materialButton = pe9Var.a;
            if (pe9Var.l != colorStateList) {
                pe9Var.l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(ydd.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(pnb.z(getContext(), i));
        }
    }

    @Override // defpackage.cde
    public void setShapeAppearanceModel(ece eceVar) {
        if (a()) {
            this.d.c(eceVar);
        } else {
            r6.g("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (a()) {
            pe9 pe9Var = this.d;
            pe9Var.n = z;
            pe9Var.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            pe9 pe9Var = this.d;
            if (pe9Var.k != colorStateList) {
                pe9Var.k = colorStateList;
                pe9Var.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(pnb.z(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            pe9 pe9Var = this.d;
            if (pe9Var.h != i) {
                pe9Var.h = i;
                pe9Var.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        pe9 pe9Var = this.d;
        if (pe9Var.j != colorStateList) {
            pe9Var.j = colorStateList;
            if (pe9Var.b(false) != null) {
                pe9Var.b(false).setTintList(pe9Var.j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        pe9 pe9Var = this.d;
        if (pe9Var.i != mode) {
            pe9Var.i = mode;
            if (pe9Var.b(false) == null || pe9Var.i == null) {
                return;
            }
            pe9Var.b(false).setTintMode(pe9Var.i);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f0);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }
    }
}
