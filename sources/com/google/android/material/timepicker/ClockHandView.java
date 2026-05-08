package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.lac;
import defpackage.prg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
class ClockHandView extends View {
    public float V;
    public boolean W;
    public final ArrayList a;
    public double a0;
    public final int b;
    public int b0;
    public final float c;
    public final Paint d;
    public final RectF e;
    public final int f;

    public interface a {
        void a(float f);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.a = new ArrayList();
        Paint paint = new Paint();
        this.d = paint;
        this.e = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lac.i, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.c = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(float f) {
        float f2 = f % 360.0f;
        this.V = f2;
        this.a0 = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        float fCos = (this.b0 * ((float) Math.cos(this.a0))) + (getWidth() / 2);
        float fSin = (this.b0 * ((float) Math.sin(this.a0))) + height;
        float f3 = this.b;
        this.e.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f2);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float fCos = (this.b0 * ((float) Math.cos(this.a0))) + width;
        float f = height;
        float fSin = (this.b0 * ((float) Math.sin(this.a0))) + f;
        Paint paint = this.d;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.b, paint);
        double dSin = Math.sin(this.a0);
        double dCos = Math.cos(this.a0);
        paint.setStrokeWidth(this.f);
        canvas.drawLine(width, f, r1 + ((int) (dCos * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(width, f, this.c, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(this.V);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.W = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.W;
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.W;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.V != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            a(f);
            z3 = true;
        }
        this.W = z4 | z3;
        return true;
    }
}
