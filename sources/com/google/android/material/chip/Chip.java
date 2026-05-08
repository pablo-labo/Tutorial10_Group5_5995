package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.a;
import defpackage.b0;
import defpackage.bf1;
import defpackage.cde;
import defpackage.cj0;
import defpackage.ece;
import defpackage.epg;
import defpackage.ff9;
import defpackage.gsg;
import defpackage.hcf;
import defpackage.i42;
import defpackage.jkf;
import defpackage.ka2;
import defpackage.lac;
import defpackage.pnb;
import defpackage.prg;
import defpackage.t6;
import defpackage.tdf;
import defpackage.v1;
import defpackage.vdf;
import defpackage.w35;
import defpackage.w4h;
import defpackage.wz9;
import defpackage.ydd;
import defpackage.ye9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class Chip extends cj0 implements a.InterfaceC0151a, cde {
    public static final Rect n0 = new Rect();
    public static final int[] o0 = {R.attr.state_selected};
    public static final int[] p0 = {R.attr.state_checkable};
    public RippleDrawable V;
    public View.OnClickListener W;
    public CompoundButton.OnCheckedChangeListener a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public com.google.android.material.chip.a e;
    public boolean e0;
    public InsetDrawable f;
    public boolean f0;
    public int g0;
    public int h0;
    public final b i0;
    public boolean j0;
    public final Rect k0;
    public final RectF l0;
    public final a m0;

    public class a extends v1 {
        public a() {
        }

        @Override // defpackage.v1
        public final void k0(int i) {
        }

        @Override // defpackage.v1
        public final void l0(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.e;
            chip.setText(aVar.r1 ? aVar.t0 : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }
    }

    public class b extends w35 {
        public b(Chip chip) {
            super(chip);
        }

        @Override // defpackage.w35
        public final int n(float f, float f2) {
            Rect rect = Chip.n0;
            Chip chip = Chip.this;
            return (chip.e() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // defpackage.w35
        public final void o(ArrayList arrayList) {
            com.google.android.material.chip.a aVar;
            arrayList.add(0);
            Rect rect = Chip.n0;
            Chip chip = Chip.this;
            if (!chip.e() || (aVar = chip.e) == null || !aVar.z0 || chip.W == null) {
                return;
            }
            arrayList.add(1);
        }

        @Override // defpackage.w35
        public final boolean s(int i, int i2) {
            boolean z = false;
            if (i2 == 16) {
                Chip chip = Chip.this;
                if (i == 0) {
                    return chip.performClick();
                }
                if (i == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.W;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    if (chip.j0) {
                        chip.i0.x(1, 1);
                    }
                }
            }
            return z;
        }

        @Override // defpackage.w35
        public final void t(t6 t6Var) {
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.e;
            t6Var.m(aVar != null && aVar.F0);
            t6Var.o(chip.isClickable());
            t6Var.n(chip.getAccessibilityClassName());
            t6Var.x(chip.getText());
        }

        @Override // defpackage.w35
        public final void u(int i, t6 t6Var) {
            if (i != 1) {
                t6Var.r("");
                t6Var.l(Chip.n0);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                t6Var.r(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                t6Var.r(chip.getContext().getString(com.indeed.android.jobsearch.R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            t6Var.l(chip.getCloseIconTouchBoundsInt());
            t6Var.b(t6.a.g);
            t6Var.a.setEnabled(chip.isEnabled());
        }

        @Override // defpackage.w35
        public final void v(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.e0 = z;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(ff9.a(context, attributeSet, com.indeed.android.jobsearch.R.attr.chipStyle, com.indeed.android.jobsearch.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.indeed.android.jobsearch.R.attr.chipStyle);
        this.k0 = new Rect();
        this.l0 = new RectF();
        this.m0 = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                b0.u("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                b0.u("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                b0.u("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                b0.u("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                b0.u("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context2, attributeSet);
        Context context3 = aVar.T0;
        int[] iArr = lac.f;
        TypedArray typedArrayD = jkf.d(context3, attributeSet, iArr, com.indeed.android.jobsearch.R.attr.chipStyle, com.indeed.android.jobsearch.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        aVar.t1 = typedArrayD.hasValue(37);
        Context context4 = aVar.T0;
        ColorStateList colorStateListB = ye9.b(context4, typedArrayD, 24);
        if (aVar.m0 != colorStateListB) {
            aVar.m0 = colorStateListB;
            aVar.onStateChange(aVar.getState());
        }
        ColorStateList colorStateListB2 = ye9.b(context4, typedArrayD, 11);
        if (aVar.n0 != colorStateListB2) {
            aVar.n0 = colorStateListB2;
            aVar.onStateChange(aVar.getState());
        }
        float dimension = typedArrayD.getDimension(19, 0.0f);
        if (aVar.o0 != dimension) {
            aVar.o0 = dimension;
            aVar.invalidateSelf();
            aVar.v();
        }
        if (typedArrayD.hasValue(12)) {
            aVar.B(typedArrayD.getDimension(12, 0.0f));
        }
        aVar.G(ye9.b(context4, typedArrayD, 22));
        aVar.H(typedArrayD.getDimension(23, 0.0f));
        aVar.Q(ye9.b(context4, typedArrayD, 36));
        String text = typedArrayD.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(aVar.t0, text);
        vdf vdfVar = aVar.Z0;
        if (!zEquals) {
            aVar.t0 = text;
            vdfVar.d = true;
            aVar.invalidateSelf();
            aVar.v();
        }
        hcf hcfVar = (!typedArrayD.hasValue(0) || (resourceId3 = typedArrayD.getResourceId(0, 0)) == 0) ? null : new hcf(context4, resourceId3);
        hcfVar.k = typedArrayD.getDimension(1, hcfVar.k);
        vdfVar.b(hcfVar, context4);
        int i = typedArrayD.getInt(3, 0);
        if (i == 1) {
            aVar.q1 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            aVar.q1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            aVar.q1 = TextUtils.TruncateAt.END;
        }
        aVar.F(typedArrayD.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            aVar.F(typedArrayD.getBoolean(15, false));
        }
        aVar.C(ye9.c(context4, typedArrayD, 14));
        if (typedArrayD.hasValue(17)) {
            aVar.E(ye9.b(context4, typedArrayD, 17));
        }
        aVar.D(typedArrayD.getDimension(16, -1.0f));
        aVar.N(typedArrayD.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            aVar.N(typedArrayD.getBoolean(26, false));
        }
        aVar.I(ye9.c(context4, typedArrayD, 25));
        aVar.M(ye9.b(context4, typedArrayD, 30));
        aVar.K(typedArrayD.getDimension(28, 0.0f));
        aVar.x(typedArrayD.getBoolean(6, false));
        aVar.A(typedArrayD.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            aVar.A(typedArrayD.getBoolean(8, false));
        }
        aVar.y(ye9.c(context4, typedArrayD, 7));
        if (typedArrayD.hasValue(9)) {
            aVar.z(ye9.b(context4, typedArrayD, 9));
        }
        aVar.J0 = (!typedArrayD.hasValue(39) || (resourceId2 = typedArrayD.getResourceId(39, 0)) == 0) ? null : wz9.a(context4, resourceId2);
        aVar.K0 = (!typedArrayD.hasValue(33) || (resourceId = typedArrayD.getResourceId(33, 0)) == 0) ? null : wz9.a(context4, resourceId);
        float dimension2 = typedArrayD.getDimension(21, 0.0f);
        if (aVar.L0 != dimension2) {
            aVar.L0 = dimension2;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.P(typedArrayD.getDimension(35, 0.0f));
        aVar.O(typedArrayD.getDimension(34, 0.0f));
        float dimension3 = typedArrayD.getDimension(41, 0.0f);
        if (aVar.O0 != dimension3) {
            aVar.O0 = dimension3;
            aVar.invalidateSelf();
            aVar.v();
        }
        float dimension4 = typedArrayD.getDimension(40, 0.0f);
        if (aVar.P0 != dimension4) {
            aVar.P0 = dimension4;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.L(typedArrayD.getDimension(29, 0.0f));
        aVar.J(typedArrayD.getDimension(27, 0.0f));
        float dimension5 = typedArrayD.getDimension(13, 0.0f);
        if (aVar.S0 != dimension5) {
            aVar.S0 = dimension5;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.s1 = typedArrayD.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayD.recycle();
        jkf.a(context2, attributeSet, com.indeed.android.jobsearch.R.attr.chipStyle, com.indeed.android.jobsearch.R.style.Widget_MaterialComponents_Chip_Action);
        jkf.b(context2, attributeSet, iArr, com.indeed.android.jobsearch.R.attr.chipStyle, com.indeed.android.jobsearch.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.indeed.android.jobsearch.R.attr.chipStyle, com.indeed.android.jobsearch.R.style.Widget_MaterialComponents_Chip_Action);
        this.f0 = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.h0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(gsg.b(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(aVar);
        aVar.j(epg.d.e(this));
        jkf.a(context2, attributeSet, com.indeed.android.jobsearch.R.attr.chipStyle, com.indeed.android.jobsearch.R.style.Widget_MaterialComponents_Chip_Action);
        jkf.b(context2, attributeSet, iArr, com.indeed.android.jobsearch.R.attr.chipStyle, com.indeed.android.jobsearch.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.indeed.android.jobsearch.R.attr.chipStyle, com.indeed.android.jobsearch.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.i0 = new b(this);
        f();
        if (!zHasValue) {
            setOutlineProvider(new i42(this));
        }
        setChecked(this.b0);
        setText(aVar.t0);
        setEllipsize(aVar.q1);
        i();
        if (!this.e.r1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.f0) {
            setMinHeight(this.h0);
        }
        this.g0 = getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.l0;
        rectF.setEmpty();
        if (e() && this.W != null) {
            com.google.android.material.chip.a aVar = this.e;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.T()) {
                float f = aVar.S0 + aVar.R0 + aVar.D0 + aVar.Q0 + aVar.P0;
                if (aVar.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.k0;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private hcf getTextAppearance() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.Z0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.d0 != z) {
            this.d0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.c0 != z) {
            this.c0 = z;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0151a
    public final void a() {
        d(this.h0);
        requestLayout();
        invalidateOutline();
    }

    public final void d(int i) {
        this.h0 = i;
        if (!this.f0) {
            InsetDrawable insetDrawable = this.f;
            if (insetDrawable == null) {
                int[] iArr = ydd.a;
                g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = ydd.a;
                    g();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.e.o0));
        int iMax2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f;
            if (insetDrawable2 == null) {
                int[] iArr3 = ydd.a;
                g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = ydd.a;
                    g();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = ydd.a;
                g();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        int[] iArr6 = ydd.a;
        g();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.j0 ? super.dispatchHoverEvent(motionEvent) : this.i0.l(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.j0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.i0;
        if (!bVar.m(keyEvent) || bVar.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.cj0, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.e;
        boolean zW = false;
        if (aVar != null && com.google.android.material.chip.a.u(aVar.A0)) {
            com.google.android.material.chip.a aVar2 = this.e;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.e0) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.d0) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.c0) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.e0) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.d0) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.c0) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(aVar2.n1, iArr)) {
                aVar2.n1 = iArr;
                if (aVar2.T()) {
                    zW = aVar2.w(aVar2.getState(), iArr);
                }
            }
        }
        if (zW) {
            invalidate();
        }
    }

    public final boolean e() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null) {
            return false;
        }
        Object objA = aVar.A0;
        if (objA == null) {
            objA = null;
        } else if (objA instanceof w4h) {
            objA = ((w4h) objA).a();
        }
        return objA != null;
    }

    public final void f() {
        com.google.android.material.chip.a aVar;
        if (!e() || (aVar = this.e) == null || !aVar.z0 || this.W == null) {
            epg.o(this, null);
            this.j0 = false;
        } else {
            epg.o(this, this.i0);
            this.j0 = true;
        }
    }

    public final void g() {
        this.V = new RippleDrawable(ydd.b(this.e.s0), getBackgroundDrawable(), null);
        this.e.getClass();
        RippleDrawable rippleDrawable = this.V;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        setBackground(rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || !aVar.F0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).V) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.H0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.I0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.n0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.S0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || (drawable = aVar.v0) == 0) {
            return null;
        }
        return drawable instanceof w4h ? ((w4h) drawable).a() : drawable;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.x0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.w0;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.o0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.L0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.q0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.r0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || (drawable = aVar.A0) == 0) {
            return null;
        }
        return drawable instanceof w4h ? ((w4h) drawable).a() : drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.E0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.R0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.D0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.Q0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.C0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.q1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.j0) {
            b bVar = this.i0;
            if (bVar.l == 1 || bVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public wz9 getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.K0;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.N0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.M0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.s0;
        }
        return null;
    }

    public ece getShapeAppearanceModel() {
        return this.e.a.a;
    }

    public wz9 getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.J0;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.P0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.O0;
        }
        return 0.0f;
    }

    public final void h() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.e) == null) {
            return;
        }
        int iR = (int) (aVar.r() + aVar.S0 + aVar.P0);
        com.google.android.material.chip.a aVar2 = this.e;
        int iQ = (int) (aVar2.q() + aVar2.L0 + aVar2.O0);
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            iQ += rect.left;
            iR += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        setPaddingRelative(iQ, paddingTop, iR, paddingBottom);
    }

    public final void i() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        hcf textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.m0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ka2.F(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, o0);
        }
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null && aVar.F0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, p0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.j0) {
            this.i0.r(z, i, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        com.google.android.material.chip.a aVar = this.e;
        accessibilityNodeInfo.setCheckable(aVar != null && aVar.F0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.c) {
                i = 0;
                for (int i2 = 0; i2 < chipGroup.getChildCount(); i2++) {
                    if (chipGroup.getChildAt(i2) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i2)) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            Object tag = getTag(com.indeed.android.jobsearch.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) t6.f.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, isChecked(), 1).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.g0 != i) {
            this.g0 = i;
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.c0
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.c0
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.W
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.j0
            if (r0 == 0) goto L43
            com.google.android.material.chip.Chip$b r0 = r5.i0
            r0.x(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.V) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.cj0, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.V) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.cj0, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.x(z);
        }
    }

    public void setCheckableResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.x(aVar.T0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null) {
            this.b0 = z;
            return;
        }
        if (aVar.F0) {
            boolean zIsChecked = isChecked();
            super.setChecked(z);
            if (zIsChecked == z || (onCheckedChangeListener = this.a0) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.y(pnb.A(aVar.T0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.z(pnb.z(aVar.T0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.A(aVar.T0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.n0 == colorStateList) {
            return;
        }
        aVar.n0 = colorStateList;
        aVar.onStateChange(aVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListZ;
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.n0 == (colorStateListZ = pnb.z(aVar.T0, i))) {
            return;
        }
        aVar.n0 = colorStateListZ;
        aVar.onStateChange(aVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.B(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.B(aVar.T0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.e;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.p1 = new WeakReference<>(null);
            }
            this.e = aVar;
            aVar.r1 = false;
            aVar.p1 = new WeakReference<>(this);
            d(this.h0);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.S0 == f) {
            return;
        }
        aVar.S0 = f;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setChipEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            float dimension = aVar.T0.getResources().getDimension(i);
            if (aVar.S0 != dimension) {
                aVar.S0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.C(pnb.A(aVar.T0, i));
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.D(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.D(aVar.T0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.E(pnb.z(aVar.T0, i));
        }
    }

    public void setChipIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.F(aVar.T0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.o0 == f) {
            return;
        }
        aVar.o0 = f;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setChipMinHeightResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            float dimension = aVar.T0.getResources().getDimension(i);
            if (aVar.o0 != dimension) {
                aVar.o0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.L0 == f) {
            return;
        }
        aVar.L0 = f;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setChipStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            float dimension = aVar.T0.getResources().getDimension(i);
            if (aVar.L0 != dimension) {
                aVar.L0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.G(pnb.z(aVar.T0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.H(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.H(aVar.T0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.I(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.E0 == charSequence) {
            return;
        }
        String str = bf1.b;
        bf1 bf1Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? bf1.e : bf1.d;
        bf1Var.getClass();
        tdf.d dVar = tdf.a;
        aVar.E0 = bf1Var.c(charSequence);
        aVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.J(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.J(aVar.T0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.I(pnb.A(aVar.T0, i));
        }
        f();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.K(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.K(aVar.T0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.L(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.L(aVar.T0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.M(pnb.z(aVar.T0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.cj0, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            b0.u("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            b0.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // defpackage.cj0, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            b0.u("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            b0.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            b0.u("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            b0.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            b0.u("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            b0.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.j(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            b0.u("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.q1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f0 = z;
        d(this.h0);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(wz9 wz9Var) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.K0 = wz9Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.K0 = wz9.a(aVar.T0, i);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.O(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.O(aVar.T0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.P(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.P(aVar.T0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            b0.u("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            b0.u("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.s1 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            b0.u("Chip does not support multi-line text");
        }
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.a0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.W = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.Q(colorStateList);
        }
        this.e.getClass();
        g();
    }

    public void setRippleColorResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.Q(pnb.z(aVar.T0, i));
            this.e.getClass();
            g();
        }
    }

    @Override // defpackage.cde
    public void setShapeAppearanceModel(ece eceVar) {
        this.e.setShapeAppearanceModel(eceVar);
    }

    public void setShowMotionSpec(wz9 wz9Var) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.J0 = wz9Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.J0 = wz9.a(aVar.T0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            b0.u("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.r1 ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.e;
        if (aVar2 == null || TextUtils.equals(aVar2.t0, charSequence)) {
            return;
        }
        aVar2.t0 = charSequence;
        aVar2.Z0.d = true;
        aVar2.invalidateSelf();
        aVar2.v();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            Context context2 = aVar.T0;
            aVar.Z0.b(new hcf(context2, i), context2);
        }
        i();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.P0 == f) {
            return;
        }
        aVar.P0 = f;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setTextEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            float dimension = aVar.T0.getResources().getDimension(i);
            if (aVar.P0 != dimension) {
                aVar.P0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.O0 == f) {
            return;
        }
        aVar.O0 = f;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setTextStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            float dimension = aVar.T0.getResources().getDimension(i);
            if (aVar.O0 != dimension) {
                aVar.O0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.N(z);
        }
        f();
    }

    public void setCheckedIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.A(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.F(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            b0.u("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            b0.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            b0.u("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            b0.u("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(hcf hcfVar) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.Z0.b(hcfVar, aVar.T0);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            Context context = aVar.T0;
            aVar.Z0.b(new hcf(context, i), context);
        }
        i();
    }
}
