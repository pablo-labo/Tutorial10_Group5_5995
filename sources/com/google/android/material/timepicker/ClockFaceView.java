package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.lac;
import defpackage.pnb;
import defpackage.t6;
import defpackage.whc;
import defpackage.ye9;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class ClockFaceView extends whc implements ClockHandView.a {
    public final ColorStateList A0;
    public final ClockHandView n0;
    public final Rect o0;
    public final RectF p0;
    public final SparseArray<TextView> q0;
    public final b r0;
    public final int[] s0;
    public final float[] t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final int x0;
    public final String[] y0;
    public float z0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.o0 = new Rect();
        this.p0 = new RectF();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.q0 = sparseArray;
        this.t0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lac.h, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListB = ye9.b(context, typedArrayObtainStyledAttributes, 1);
        this.A0 = colorStateListB;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.n0 = clockHandView;
        this.u0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListB.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListB.getDefaultColor());
        this.s0 = new int[]{colorForState, colorForState, colorStateListB.getDefaultColor()};
        clockHandView.a.add(this);
        int defaultColor = pnb.z(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListB2 = ye9.b(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListB2 != null ? colorStateListB2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.r0 = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.y0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i = 0; i < Math.max(this.y0.length, size); i++) {
            TextView textView = sparseArray.get(i);
            if (i >= this.y0.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.y0[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                epg.o(textView, this.r0);
                textView.setTextColor(this.A0);
            }
        }
        this.v0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.w0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.x0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float f) {
        if (Math.abs(this.z0 - f) > 0.001f) {
            this.z0 = f;
            l();
        }
    }

    public final void l() {
        RadialGradient radialGradient;
        RectF rectF = this.n0.e;
        int i = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.q0;
            if (i >= sparseArray.size()) {
                return;
            }
            TextView textView = sparseArray.get(i);
            if (textView != null) {
                Rect rect = this.o0;
                textView.getDrawingRect(rect);
                rect.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, rect);
                RectF rectF2 = this.p0;
                rectF2.set(rect);
                if (RectF.intersects(rectF, rectF2)) {
                    radialGradient = new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, 0.5f * rectF.width(), this.s0, this.t0, Shader.TileMode.CLAMP);
                } else {
                    radialGradient = null;
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) t6.e.a(1, this.y0.length, 1).a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        l();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.x0 / Math.max(Math.max(this.v0 / displayMetrics.heightPixels, this.w0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
