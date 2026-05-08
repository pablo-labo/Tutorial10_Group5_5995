package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class gb1 extends FrameLayout {
    public static final a W = new a();
    public PorterDuff.Mode V;
    public int a;
    public final float b;
    public final float c;
    public final int d;
    public final int e;
    public ColorStateList f;

    public static class a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public gb1(Context context, AttributeSet attributeSet) {
        super(ff9.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, lac.E);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.d.k(this, dimensionPixelSize);
        }
        this.a = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.b = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(ye9.b(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(gsg.d(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.c = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(W);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(hh1.G(hh1.z(this, R.attr.colorSurface), getBackgroundOverlayColorAlpha(), hh1.z(this, R.attr.colorOnSurface)));
            ColorStateList colorStateList = this.f;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap<View, prg> weakHashMap2 = epg.a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.c;
    }

    public int getAnimationMode() {
        return this.a;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.b;
    }

    public int getMaxInlineActionWidth() {
        return this.e;
    }

    public int getMaxWidth() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.c.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.d;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.a = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f);
            drawable.setTintMode(this.V);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.V);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.V = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    public void setOnAttachStateChangeListener(eb1 eb1Var) {
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : W);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(fb1 fb1Var) {
    }
}
