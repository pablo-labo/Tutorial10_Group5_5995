package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.eb2;
import defpackage.ece;
import defpackage.fce;
import defpackage.gsg;
import defpackage.hcf;
import defpackage.k0;
import defpackage.vdf;
import defpackage.w4h;
import defpackage.wz9;
import defpackage.ydd;
import defpackage.ze9;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends ze9 implements Drawable.Callback, vdf.b {
    public static final int[] u1 = {R.attr.state_enabled};
    public static final ShapeDrawable v1 = new ShapeDrawable(new OvalShape());
    public Drawable A0;
    public RippleDrawable B0;
    public ColorStateList C0;
    public float D0;
    public SpannableStringBuilder E0;
    public boolean F0;
    public boolean G0;
    public Drawable H0;
    public ColorStateList I0;
    public wz9 J0;
    public wz9 K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public float Q0;
    public float R0;
    public float S0;
    public final Context T0;
    public final Paint U0;
    public final Paint.FontMetrics V0;
    public final RectF W0;
    public final PointF X0;
    public final Path Y0;
    public final vdf Z0;
    public int a1;
    public int b1;
    public int c1;
    public int d1;
    public int e1;
    public int f1;
    public boolean g1;
    public int h1;
    public int i1;
    public ColorFilter j1;
    public PorterDuffColorFilter k1;
    public ColorStateList l1;
    public ColorStateList m0;
    public PorterDuff.Mode m1;
    public ColorStateList n0;
    public int[] n1;
    public float o0;
    public ColorStateList o1;
    public float p0;
    public WeakReference<InterfaceC0151a> p1;
    public ColorStateList q0;
    public TextUtils.TruncateAt q1;
    public float r0;
    public boolean r1;
    public ColorStateList s0;
    public int s1;
    public CharSequence t0;
    public boolean t1;
    public boolean u0;
    public Drawable v0;
    public ColorStateList w0;
    public float x0;
    public boolean y0;
    public boolean z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0151a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.indeed.android.jobsearch.R.attr.chipStyle, com.indeed.android.jobsearch.R.style.Widget_MaterialComponents_Chip_Action);
        this.p0 = -1.0f;
        this.U0 = new Paint(1);
        this.V0 = new Paint.FontMetrics();
        this.W0 = new RectF();
        this.X0 = new PointF();
        this.Y0 = new Path();
        this.i1 = 255;
        this.m1 = PorterDuff.Mode.SRC_IN;
        this.p1 = new WeakReference<>(null);
        i(context);
        this.T0 = context;
        vdf vdfVar = new vdf(this);
        this.Z0 = vdfVar;
        this.t0 = "";
        vdfVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = u1;
        setState(iArr);
        if (!Arrays.equals(this.n1, iArr)) {
            this.n1 = iArr;
            if (T()) {
                w(getState(), iArr);
            }
        }
        this.r1 = true;
        int[] iArr2 = ydd.a;
        v1.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z) {
        if (this.G0 != z) {
            boolean zR = R();
            this.G0 = z;
            boolean zR2 = R();
            if (zR != zR2) {
                Drawable drawable = this.H0;
                if (zR2) {
                    o(drawable);
                } else {
                    U(drawable);
                }
                invalidateSelf();
                v();
            }
        }
    }

    @Deprecated
    public final void B(float f) {
        if (this.p0 != f) {
            this.p0 = f;
            ece.a aVarE = this.a.a.e();
            aVarE.e = new k0(f);
            aVarE.f = new k0(f);
            aVarE.g = new k0(f);
            aVarE.h = new k0(f);
            setShapeAppearanceModel(aVarE.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void C(Drawable drawable) {
        ?? A;
        Object obj = this.v0;
        if (obj != null) {
            boolean z = obj instanceof w4h;
            A = obj;
            if (z) {
                A = ((w4h) obj).a();
            }
        } else {
            A = 0;
        }
        if (A != drawable) {
            float fQ = q();
            this.v0 = drawable != null ? drawable.mutate() : null;
            float fQ2 = q();
            U(A);
            if (S()) {
                o(this.v0);
            }
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void D(float f) {
        if (this.x0 != f) {
            float fQ = q();
            this.x0 = f;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.y0 = true;
        if (this.w0 != colorStateList) {
            this.w0 = colorStateList;
            if (S()) {
                this.v0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z) {
        if (this.u0 != z) {
            boolean zS = S();
            this.u0 = z;
            boolean zS2 = S();
            if (zS != zS2) {
                Drawable drawable = this.v0;
                if (zS2) {
                    o(drawable);
                } else {
                    U(drawable);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.q0 != colorStateList) {
            this.q0 = colorStateList;
            if (this.t1) {
                ze9.b bVar = this.a;
                if (bVar.d != colorStateList) {
                    bVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f) {
        if (this.r0 != f) {
            this.r0 = f;
            this.U0.setStrokeWidth(f);
            if (this.t1) {
                this.a.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void I(Drawable drawable) {
        ?? A;
        Object obj = this.A0;
        if (obj != null) {
            boolean z = obj instanceof w4h;
            A = obj;
            if (z) {
                A = ((w4h) obj).a();
            }
        } else {
            A = 0;
        }
        if (A != drawable) {
            float fR = r();
            this.A0 = drawable != null ? drawable.mutate() : null;
            int[] iArr = ydd.a;
            this.B0 = new RippleDrawable(ydd.b(this.s0), this.A0, v1);
            float fR2 = r();
            U(A);
            if (T()) {
                o(this.A0);
            }
            invalidateSelf();
            if (fR != fR2) {
                v();
            }
        }
    }

    public final void J(float f) {
        if (this.R0 != f) {
            this.R0 = f;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void K(float f) {
        if (this.D0 != f) {
            this.D0 = f;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void L(float f) {
        if (this.Q0 != f) {
            this.Q0 = f;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.C0 != colorStateList) {
            this.C0 = colorStateList;
            if (T()) {
                this.A0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z) {
        if (this.z0 != z) {
            boolean zT = T();
            this.z0 = z;
            boolean zT2 = T();
            if (zT != zT2) {
                Drawable drawable = this.A0;
                if (zT2) {
                    o(drawable);
                } else {
                    U(drawable);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f) {
        if (this.N0 != f) {
            float fQ = q();
            this.N0 = f;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void P(float f) {
        if (this.M0 != f) {
            float fQ = q();
            this.M0 = f;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.s0 != colorStateList) {
            this.s0 = colorStateList;
            this.o1 = null;
            onStateChange(getState());
        }
    }

    public final boolean R() {
        return this.G0 && this.H0 != null && this.g1;
    }

    public final boolean S() {
        return this.u0 && this.v0 != null;
    }

    public final boolean T() {
        return this.z0 && this.A0 != null;
    }

    @Override // vdf.b
    public final void a() {
        v();
        invalidateSelf();
    }

    @Override // defpackage.ze9, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.i1) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.t1;
        Paint paint = this.U0;
        RectF rectF = this.W0;
        if (!z) {
            paint.setColor(this.a1);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, s(), s(), paint);
        }
        if (!this.t1) {
            paint.setColor(this.b1);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.j1;
            if (colorFilter == null) {
                colorFilter = this.k1;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, s(), s(), paint);
        }
        if (this.t1) {
            super.draw(canvas);
        }
        if (this.r0 > 0.0f && !this.t1) {
            paint.setColor(this.d1);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.t1) {
                ColorFilter colorFilter2 = this.j1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.k1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.r0 / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.p0 - (this.r0 / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.e1);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.t1) {
            RectF rectF2 = new RectF(bounds);
            ze9.b bVar = this.a;
            ece eceVar = bVar.a;
            float f4 = bVar.i;
            ze9.a aVar = this.f0;
            fce fceVar = this.g0;
            Path path = this.Y0;
            fceVar.a(eceVar, f4, rectF2, aVar, path);
            e(canvas2, paint, path, this.a.a, g());
        } else {
            canvas2.drawRoundRect(rectF, s(), s(), paint);
        }
        if (S()) {
            p(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas2.translate(f5, f6);
            this.v0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.v0.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (R()) {
            p(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.H0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.H0.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (this.r1 && this.t0 != null) {
            PointF pointF = this.X0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.t0;
            vdf vdfVar = this.Z0;
            if (charSequence != null) {
                float fQ = q() + this.L0 + this.O0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fQ;
                } else {
                    pointF.x = bounds.right - fQ;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = vdfVar.a;
                Paint.FontMetrics fontMetrics = this.V0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.t0 != null) {
                float fQ2 = q() + this.L0 + this.O0;
                float fR = r() + this.S0 + this.P0;
                int layoutDirection = getLayoutDirection();
                int i3 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i3 + fQ2;
                    rectF.right = bounds.right - fR;
                } else {
                    rectF.left = i3 + fR;
                    rectF.right = bounds.right - fQ2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            hcf hcfVar = vdfVar.f;
            TextPaint textPaint2 = vdfVar.a;
            if (hcfVar != null) {
                textPaint2.drawableState = getState();
                vdfVar.f.e(this.T0, textPaint2, vdfVar.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(vdfVar.a(this.t0.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.t0;
            if (z2 && this.q1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.q1);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f9 = this.S0 + this.R0;
                if (getLayoutDirection() == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.D0;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.D0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f12 = this.D0;
                float f13 = fExactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.A0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = ydd.a;
            this.B0.setBounds(this.A0.getBounds());
            this.B0.jumpToCurrentState();
            this.B0.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.i1 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.i1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.j1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(r() + this.Z0.a(this.t0.toString()) + q() + this.L0 + this.O0 + this.P0 + this.S0), this.s1);
    }

    @Override // defpackage.ze9, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.ze9, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.t1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.o0, this.p0);
        } else {
            outline.setRoundRect(bounds, this.p0);
            outline2 = outline;
        }
        outline2.setAlpha(this.i1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.ze9, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (t(this.m0) || t(this.n0) || t(this.q0)) {
            return true;
        }
        hcf hcfVar = this.Z0.f;
        if (hcfVar == null || (colorStateList = hcfVar.j) == null || !colorStateList.isStateful()) {
            return (this.G0 && this.H0 != null && this.F0) || u(this.v0) || u(this.H0) || t(this.l1);
        }
        return true;
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.A0) {
            if (drawable.isStateful()) {
                drawable.setState(this.n1);
            }
            drawable.setTintList(this.C0);
            return;
        }
        Drawable drawable2 = this.v0;
        if (drawable == drawable2 && this.y0) {
            drawable2.setTintList(this.w0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (S()) {
            zOnLayoutDirectionChanged |= this.v0.setLayoutDirection(i);
        }
        if (R()) {
            zOnLayoutDirectionChanged |= this.H0.setLayoutDirection(i);
        }
        if (T()) {
            zOnLayoutDirectionChanged |= this.A0.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (S()) {
            zOnLevelChange |= this.v0.setLevel(i);
        }
        if (R()) {
            zOnLevelChange |= this.H0.setLevel(i);
        }
        if (T()) {
            zOnLevelChange |= this.A0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.ze9, android.graphics.drawable.Drawable, vdf.b
    public final boolean onStateChange(int[] iArr) {
        if (this.t1) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.n1);
    }

    public final void p(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f = this.L0 + this.M0;
            Drawable drawable = this.g1 ? this.H0 : this.v0;
            float intrinsicWidth = this.x0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.g1 ? this.H0 : this.v0;
            float fCeil = this.x0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(gsg.b(this.T0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float q() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f = this.M0;
        Drawable drawable = this.g1 ? this.H0 : this.v0;
        float intrinsicWidth = this.x0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.N0;
    }

    public final float r() {
        if (T()) {
            return this.Q0 + this.D0 + this.R0;
        }
        return 0.0f;
    }

    public final float s() {
        return this.t1 ? this.a.a.e.a(g()) : this.p0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.ze9, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.i1 != i) {
            this.i1 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.ze9, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.j1 != colorFilter) {
            this.j1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.ze9, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.l1 != colorStateList) {
            this.l1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.ze9, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.m1 != mode) {
            this.m1 = mode;
            ColorStateList colorStateList = this.l1;
            this.k1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (S()) {
            visible |= this.v0.setVisible(z, z2);
        }
        if (R()) {
            visible |= this.H0.setVisible(z, z2);
        }
        if (T()) {
            visible |= this.A0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        InterfaceC0151a interfaceC0151a = this.p1.get();
        if (interfaceC0151a != null) {
            interfaceC0151a.a();
        }
    }

    public final boolean w(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.m0;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.a1) : 0);
        boolean state = true;
        if (this.a1 != iC) {
            this.a1 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.n0;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.b1) : 0);
        if (this.b1 != iC2) {
            this.b1 = iC2;
            zOnStateChange = true;
        }
        int iC3 = eb2.c(iC2, iC);
        if ((this.c1 != iC3) | (this.a.c == null)) {
            this.c1 = iC3;
            k(ColorStateList.valueOf(iC3));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.q0;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.d1) : 0;
        if (this.d1 != colorForState) {
            this.d1 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.o1 == null || !ydd.c(iArr)) ? 0 : this.o1.getColorForState(iArr, this.e1);
        if (this.e1 != colorForState2) {
            this.e1 = colorForState2;
        }
        hcf hcfVar = this.Z0.f;
        int colorForState3 = (hcfVar == null || (colorStateList = hcfVar.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f1);
        if (this.f1 != colorForState3) {
            this.f1 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
        } else {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.F0) {
                    z = true;
                }
            }
            z = false;
        }
        if (this.g1 == z || this.H0 == null) {
            z2 = false;
        } else {
            float fQ = q();
            this.g1 = z;
            if (fQ != q()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.l1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.h1) : 0;
        if (this.h1 != colorForState4) {
            this.h1 = colorForState4;
            ColorStateList colorStateList6 = this.l1;
            PorterDuff.Mode mode = this.m1;
            this.k1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (u(this.v0)) {
            state |= this.v0.setState(iArr);
        }
        if (u(this.H0)) {
            state |= this.H0.setState(iArr);
        }
        if (u(this.A0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.A0.setState(iArr3);
        }
        int[] iArr4 = ydd.a;
        if (u(this.B0)) {
            state |= this.B0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            v();
        }
        return state;
    }

    public final void x(boolean z) {
        if (this.F0 != z) {
            this.F0 = z;
            float fQ = q();
            if (!z && this.g1) {
                this.g1 = false;
            }
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.H0 != drawable) {
            float fQ = q();
            this.H0 = drawable;
            float fQ2 = q();
            U(this.H0);
            o(this.H0);
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.I0 != colorStateList) {
            this.I0 = colorStateList;
            if (this.G0 && (drawable = this.H0) != null && this.F0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }
}
