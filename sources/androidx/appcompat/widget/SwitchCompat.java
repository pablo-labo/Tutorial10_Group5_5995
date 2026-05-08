package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.d;
import defpackage.ac4;
import defpackage.cpg;
import defpackage.ekf;
import defpackage.epg;
import defpackage.h20;
import defpackage.isg;
import defpackage.lkf;
import defpackage.pnb;
import defpackage.prg;
import defpackage.umf;
import defpackage.wac;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final a J0 = new a(Float.class, "thumbPos");
    public static final int[] K0 = {R.attr.state_checked};
    public final TextPaint A0;
    public final ColorStateList B0;
    public StaticLayout C0;
    public StaticLayout D0;
    public final h20 E0;
    public ObjectAnimator F0;
    public AppCompatEmojiTextHelper G0;
    public b H0;
    public final Rect I0;
    public ColorStateList V;
    public PorterDuff.Mode W;
    public Drawable a;
    public boolean a0;
    public ColorStateList b;
    public boolean b0;
    public PorterDuff.Mode c;
    public int c0;
    public boolean d;
    public int d0;
    public boolean e;
    public int e0;
    public Drawable f;
    public boolean f0;
    public CharSequence g0;
    public CharSequence h0;
    public CharSequence i0;
    public CharSequence j0;
    public boolean k0;
    public int l0;
    public final int m0;
    public float n0;
    public float o0;
    public final VelocityTracker p0;
    public final int q0;
    public float r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public boolean z0;

    public class a extends Property<SwitchCompat, Float> {
        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.r0);
        }

        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public static class b extends d.f {
        public final WeakReference a;

        public b(SwitchCompat switchCompat) {
            this.a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.d.f
        public final void a() {
            SwitchCompat switchCompat = (SwitchCompat) this.a.get();
            if (switchCompat != null) {
                switchCompat.c();
            }
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.a.get();
            if (switchCompat != null) {
                switchCompat.c();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, com.indeed.android.jobsearch.R.attr.switchStyle);
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.V = null;
        this.W = null;
        this.a0 = false;
        this.b0 = false;
        this.p0 = VelocityTracker.obtain();
        this.z0 = true;
        this.I0 = new Rect();
        lkf.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.A0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = wac.w;
        umf umfVarE = umf.e(context, attributeSet, iArr, com.indeed.android.jobsearch.R.attr.switchStyle);
        TypedArray typedArray = umfVarE.b;
        epg.n(this, context, iArr, attributeSet, typedArray, com.indeed.android.jobsearch.R.attr.switchStyle);
        Drawable drawableB = umfVarE.b(2);
        this.a = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(this);
        }
        Drawable drawableB2 = umfVarE.b(11);
        this.f = drawableB2;
        if (drawableB2 != null) {
            drawableB2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.k0 = typedArray.getBoolean(3, true);
        this.c0 = typedArray.getDimensionPixelSize(8, 0);
        this.d0 = typedArray.getDimensionPixelSize(5, 0);
        this.e0 = typedArray.getDimensionPixelSize(6, 0);
        this.f0 = typedArray.getBoolean(4, false);
        ColorStateList colorStateListA = umfVarE.a(9);
        if (colorStateListA != null) {
            this.b = colorStateListA;
            this.d = true;
        }
        PorterDuff.Mode modeC = ac4.c(typedArray.getInt(10, -1), null);
        if (this.c != modeC) {
            this.c = modeC;
            this.e = true;
        }
        if (this.d || this.e) {
            a();
        }
        ColorStateList colorStateListA2 = umfVarE.a(12);
        if (colorStateListA2 != null) {
            this.V = colorStateListA2;
            this.a0 = true;
        }
        PorterDuff.Mode modeC2 = ac4.c(typedArray.getInt(13, -1), null);
        if (this.W != modeC2) {
            this.W = modeC2;
            this.b0 = true;
        }
        if (this.a0 || this.b0) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, wac.x);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = pnb.z(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.B0 = colorStateList;
            } else {
                this.B0 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i2 = typedArrayObtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i2 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((2 & i3) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                h20 h20Var = new h20();
                h20Var.a = context2.getResources().getConfiguration().locale;
                this.E0 = h20Var;
            } else {
                this.E0 = null;
            }
            setTextOnInternal(this.g0);
            setTextOffInternal(this.i0);
            typedArrayObtainStyledAttributes.recycle();
        }
        new AppCompatTextHelper(this).f(attributeSet, com.indeed.android.jobsearch.R.attr.switchStyle);
        umfVarE.f();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.m0 = viewConfiguration.getScaledTouchSlop();
        this.q0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.indeed.android.jobsearch.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.G0 == null) {
            this.G0 = new AppCompatEmojiTextHelper(this);
        }
        return this.G0;
    }

    private boolean getTargetCheckedState() {
        return this.r0 > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = isg.a;
        int layoutDirection = getLayoutDirection();
        float f = this.r0;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.I0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.a;
        Rect rectB = drawable2 != null ? ac4.b(drawable2) : ac4.c;
        return ((((this.s0 - this.u0) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.i0 = charSequence;
        TransformationMethod transformationMethodE = getEmojiTextViewHelper().b.a.e(this.E0);
        if (transformationMethodE != null) {
            charSequence = transformationMethodE.getTransformation(charSequence, this);
        }
        this.j0 = charSequence;
        this.D0 = null;
        if (this.k0) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.g0 = charSequence;
        TransformationMethod transformationMethodE = getEmojiTextViewHelper().b.a.e(this.E0);
        if (transformationMethodE != null) {
            charSequence = transformationMethodE.getTransformation(charSequence, this);
        }
        this.h0 = charSequence;
        this.C0 = null;
        if (this.k0) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = drawable.mutate();
                this.a = drawableMutate;
                if (this.d) {
                    drawableMutate.setTintList(this.b);
                }
                if (this.e) {
                    this.a.setTintMode(this.c);
                }
                if (this.a.isStateful()) {
                    this.a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.a0 || this.b0) {
                Drawable drawableMutate = drawable.mutate();
                this.f = drawableMutate;
                if (this.a0) {
                    drawableMutate.setTintList(this.V);
                }
                if (this.b0) {
                    this.f.setTintMode(this.W);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.g0);
        setTextOffInternal(this.i0);
        requestLayout();
    }

    public final void d() {
        if (this.H0 == null && this.G0.b.a.b() && d.d()) {
            d dVarA = d.a();
            int iC = dVarA.c();
            if (iC == 3 || iC == 0) {
                b bVar = new b(this);
                this.H0 = bVar;
                dVarA.h(bVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.v0;
        int i4 = this.w0;
        int i5 = this.x0;
        int i6 = this.y0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.a;
        Rect rectB = drawable != null ? ac4.b(drawable) : ac4.c;
        Drawable drawable2 = this.f;
        Rect rect = this.I0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.u0 + rect.right;
            this.a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = isg.a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.s0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.e0 : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = isg.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.s0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.e0 : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ekf.e(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.k0;
    }

    public boolean getSplitTrack() {
        return this.f0;
    }

    public int getSwitchMinWidth() {
        return this.d0;
    }

    public int getSwitchPadding() {
        return this.e0;
    }

    public CharSequence getTextOff() {
        return this.i0;
    }

    public CharSequence getTextOn() {
        return this.g0;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    public final float getThumbPosition() {
        return this.r0;
    }

    public int getThumbTextPadding() {
        return this.c0;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    public ColorStateList getTrackTintList() {
        return this.V;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.W;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.F0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.F0.end();
        this.F0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, K0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f;
        Rect rect = this.I0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.w0;
        int i2 = this.y0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.f0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = ac4.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.C0 : this.D0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.A0;
            ColorStateList colorStateList = this.B0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.g0 : this.i0;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.a != null) {
            Drawable drawable = this.f;
            Rect rect = this.I0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = ac4.b(this.a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = isg.a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.s0 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.s0) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.t0;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.t0 + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.t0;
        }
        this.v0 = paddingLeft;
        this.w0 = paddingTop;
        this.y0 = height;
        this.x0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.k0) {
            StaticLayout staticLayout = this.C0;
            TextPaint textPaint = this.A0;
            if (staticLayout == null) {
                CharSequence charSequence = this.h0;
                this.C0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.D0 == null) {
                CharSequence charSequence2 = this.j0;
                this.D0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.a;
        Rect rect = this.I0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.u0 = Math.max(this.k0 ? (this.c0 * 2) + Math.max(this.C0.getWidth(), this.D0.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect rectB = ac4.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        boolean z = this.z0;
        int iMax3 = this.d0;
        if (z) {
            iMax3 = Math.max(iMax3, (this.u0 * 2) + iMax + iMax2);
        }
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.s0 = iMax3;
        this.t0 = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.g0 : this.i0;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.g0;
                if (string == null) {
                    string = getResources().getString(com.indeed.android.jobsearch.R.string.abc_capital_on);
                }
                WeakHashMap<View, prg> weakHashMap = epg.a;
                new cpg(com.indeed.android.jobsearch.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.i0;
            if (string2 == null) {
                string2 = getResources().getString(com.indeed.android.jobsearch.R.string.abc_capital_off);
            }
            WeakHashMap<View, prg> weakHashMap2 = epg.a;
            new cpg(com.indeed.android.jobsearch.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.F0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, J0, zIsChecked ? 1.0f : 0.0f);
        this.F0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.F0.setAutoCancel(true);
        this.F0.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ekf.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.g0);
        setTextOffInternal(this.i0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.z0 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.k0 != z) {
            this.k0 = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.d0 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.e0 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.A0;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.i0;
        if (string == null) {
            string = getResources().getString(com.indeed.android.jobsearch.R.string.abc_capital_off);
        }
        WeakHashMap<View, prg> weakHashMap = epg.a;
        new cpg(com.indeed.android.jobsearch.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.g0;
        if (string == null) {
            string = getResources().getString(com.indeed.android.jobsearch.R.string.abc_capital_on);
        }
        WeakHashMap<View, prg> weakHashMap = epg.a;
        new cpg(com.indeed.android.jobsearch.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.r0 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(pnb.A(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.c0 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(pnb.A(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.V = colorStateList;
        this.a0 = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.W = mode;
        this.b0 = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.f;
    }
}
