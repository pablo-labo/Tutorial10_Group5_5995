package com.canhub.cropper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.canhub.cropper.CropImageView;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.l;
import defpackage.l5;
import defpackage.r6;
import defpackage.u63;
import defpackage.wl7;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0003UVWB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0015¢\u0006\u0004\b*\u0010\u0018J\u0015\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u001d¢\u0006\u0004\b,\u0010 J\u0015\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u001d¢\u0006\u0004\b.\u0010 J\u0015\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102R(\u0010&\u001a\u0004\u0018\u00010%2\b\u00103\u001a\u0004\u0018\u00010%8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u00103\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R(\u0010@\u001a\u0004\u0018\u00010\u00112\b\u00103\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R$\u0010G\u001a\u00020A2\u0006\u0010B\u001a\u00020A8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u00020!2\u0006\u0010H\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010$R$\u0010L\u001a\u00020!2\u0006\u0010L\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010J\"\u0004\bN\u0010$R(\u0010T\u001a\u0004\u0018\u00010O2\b\u0010B\u001a\u0004\u0018\u00010O8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006X"}, d2 = {"Lcom/canhub/cropper/CropOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/canhub/cropper/CropOverlayView$b;", "listener", "Lj6g;", "setCropWindowChangeListener", "(Lcom/canhub/cropper/CropOverlayView$b;)V", "Lcom/canhub/cropper/CropImageView$c;", "cropShape", "setCropShape", "(Lcom/canhub/cropper/CropImageView$c;)V", "Lcom/canhub/cropper/CropImageView$a;", "cropCornerShape", "setCropCornerShape", "(Lcom/canhub/cropper/CropImageView$a;)V", "", "isEnabled", "setCropperTextLabelVisibility", "(Z)V", "", "textLabel", "setCropLabelText", "(Ljava/lang/String;)V", "", "textSize", "setCropLabelTextSize", "(F)V", "", "textColor", "setCropLabelTextColor", "(I)V", "Lcom/canhub/cropper/CropImageView$d;", "guidelines", "setGuidelines", "(Lcom/canhub/cropper/CropImageView$d;)V", "fixAspectRatio", "setFixedAspectRatio", "snapRadius", "setSnapRadius", "cornerRadius", "setCropCornerRadius", "Lcom/canhub/cropper/CropImageOptions;", "options", "setInitialAttributeValues", "(Lcom/canhub/cropper/CropImageOptions;)V", "value", "v0", "Lcom/canhub/cropper/CropImageView$d;", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$d;", "w0", "Lcom/canhub/cropper/CropImageView$c;", "getCropShape", "()Lcom/canhub/cropper/CropImageView$c;", "x0", "Lcom/canhub/cropper/CropImageView$a;", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$a;", "cornerShape", "Landroid/graphics/RectF;", "rect", "getCropWindowRect", "()Landroid/graphics/RectF;", "setCropWindowRect", "(Landroid/graphics/RectF;)V", "cropWindowRect", "aspectRatioX", "getAspectRatioX", "()I", "setAspectRatioX", "aspectRatioY", "getAspectRatioY", "setAspectRatioY", "Landroid/graphics/Rect;", "getInitialCropWindowRect", "()Landroid/graphics/Rect;", "setInitialCropWindowRect", "(Landroid/graphics/Rect;)V", "initialCropWindowRect", "a", "b", "c", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CropOverlayView extends View {
    public float A0;
    public int B0;
    public final Rect C0;
    public boolean D0;
    public final float E0;
    public final h V;
    public b W;
    public float a;
    public final RectF a0;
    public Integer b;
    public Paint b0;
    public CropImageOptions c;
    public Paint c0;
    public ScaleGestureDetector d;
    public Paint d0;
    public boolean e;
    public Paint e0;
    public boolean f;
    public Paint f0;
    public final Path g0;
    public final float[] h0;
    public final RectF i0;
    public int j0;
    public int k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public i q0;
    public boolean r0;
    public int s0;
    public int t0;
    public float u0;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public CropImageView.d guidelines;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public CropImageView.c cropShape;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public CropImageView.a cornerShape;
    public boolean y0;
    public String z0;

    public static final class a {
        public static Paint a(float f, int i) {
            if (f <= 0.0f) {
                return null;
            }
            Paint paint = new Paint();
            paint.setColor(i);
            paint.setStrokeWidth(f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    public interface b {
        void a(boolean z);
    }

    public final class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            scaleGestureDetector.getClass();
            CropOverlayView cropOverlayView = CropOverlayView.this;
            RectF rectFG = cropOverlayView.V.g();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f = focusY - currentSpanY;
            float f2 = focusX - currentSpanX;
            float f3 = focusX + currentSpanX;
            float f4 = focusY + currentSpanY;
            if (f2 >= f3 || f > f4 || f2 < 0.0f || f3 > cropOverlayView.V.c() || f < 0.0f || f4 > cropOverlayView.V.b()) {
                return true;
            }
            rectFG.set(f2, f, f3, f4);
            h hVar = cropOverlayView.V;
            hVar.getClass();
            hVar.a.set(rectFG);
            cropOverlayView.invalidate();
            return true;
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CropImageView.c.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[CropImageView.a.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f = true;
        this.V = new h();
        this.a0 = new RectF();
        this.g0 = new Path();
        this.h0 = new float[8];
        this.i0 = new RectF();
        this.u0 = this.s0 / this.t0;
        this.z0 = "";
        this.A0 = 20.0f;
        this.B0 = -1;
        this.C0 = new Rect();
        this.E0 = TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics());
    }

    public final boolean a(RectF rectF) {
        float f;
        float f2;
        Rect rect = g.a;
        float[] fArr = this.h0;
        float fN = g.n(fArr);
        float fP = g.p(fArr);
        float fO = g.o(fArr);
        float fL = g.l(fArr);
        float f3 = fArr[0];
        float f4 = fArr[6];
        RectF rectF2 = this.i0;
        if (f3 == f4 || fArr[1] == fArr[7]) {
            rectF2.set(fN, fP, fO, fL);
            return false;
        }
        float f5 = fArr[0];
        float f6 = fArr[1];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[6];
        float f10 = fArr[7];
        if (f10 < f6) {
            float f11 = fArr[3];
            if (f6 < f11) {
                float f12 = fArr[2];
                f = f10;
                f10 = f11;
                f2 = f9;
                f6 = f8;
                f9 = f12;
                f5 = f7;
            } else {
                f9 = f5;
                f10 = f6;
                f6 = f11;
                f5 = fArr[2];
                f2 = f7;
                f = f8;
            }
        } else {
            f = fArr[3];
            if (f6 > f) {
                f2 = fArr[2];
            } else {
                f2 = f5;
                f5 = f9;
                f = f6;
                f6 = f10;
                f9 = f7;
                f10 = f8;
            }
        }
        float f13 = (f6 - f) / (f5 - f2);
        float f14 = (-1.0f) / f13;
        float f15 = f - (f13 * f2);
        float f16 = f - (f2 * f14);
        float f17 = f10 - (f13 * f9);
        float f18 = f10 - (f9 * f14);
        float fCenterY = rectF.centerY() - rectF.top;
        float fCenterX = rectF.centerX();
        float f19 = rectF.left;
        float f20 = fCenterY / (fCenterX - f19);
        float f21 = -f20;
        float f22 = rectF.top;
        float f23 = f22 - (f19 * f20);
        float f24 = rectF.right;
        float f25 = f22 - (f21 * f24);
        float f26 = f13 - f20;
        float f27 = (f23 - f15) / f26;
        float fMax = Math.max(fN, f27 < f24 ? f27 : fN);
        float f28 = (f23 - f16) / (f14 - f20);
        if (f28 >= rectF.right) {
            f28 = fMax;
        }
        float fMax2 = Math.max(fMax, f28);
        float f29 = f14 - f21;
        float f30 = (f25 - f18) / f29;
        float fMax3 = Math.max(fMax2, f30 < rectF.right ? f30 : fMax2);
        float f31 = (f25 - f16) / f29;
        if (f31 <= rectF.left) {
            f31 = fO;
        }
        float fMin = Math.min(fO, f31);
        float f32 = (f25 - f17) / (f13 - f21);
        if (f32 <= rectF.left) {
            f32 = fMin;
        }
        float fMin2 = Math.min(fMin, f32);
        float f33 = (f23 - f17) / f26;
        if (f33 <= rectF.left) {
            f33 = fMin2;
        }
        float fMin3 = Math.min(fMin2, f33);
        float fMax4 = Math.max(fP, Math.max((f13 * fMax3) + f15, (f14 * fMin3) + f16));
        float fMin4 = Math.min(fL, Math.min((f14 * fMax3) + f18, (f13 * fMin3) + f17));
        rectF2.left = fMax3;
        rectF2.top = fMax4;
        rectF2.right = fMin3;
        rectF2.bottom = fMin4;
        return true;
    }

    public final void b(Canvas canvas, RectF rectF, float f, float f2) {
        CropImageView.c cVar = this.cropShape;
        int i = cVar == null ? -1 : d.a[cVar.ordinal()];
        if (i == 1) {
            float f3 = this.a;
            CropImageView.a aVar = this.cornerShape;
            int i2 = aVar == null ? -1 : d.b[aVar.ordinal()];
            if (i2 != -1) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        d(canvas, rectF, f, f2);
                        return;
                    } else {
                        l.g();
                        return;
                    }
                }
                float f4 = rectF.left - f;
                float f5 = rectF.top - f;
                Paint paint = this.c0;
                paint.getClass();
                canvas.drawCircle(f4, f5, f3, paint);
                float f6 = rectF.right + f;
                float f7 = rectF.top - f;
                Paint paint2 = this.c0;
                paint2.getClass();
                canvas.drawCircle(f6, f7, f3, paint2);
                float f8 = rectF.left - f;
                float f9 = rectF.bottom + f;
                Paint paint3 = this.c0;
                paint3.getClass();
                canvas.drawCircle(f8, f9, f3, paint3);
                float f10 = rectF.right + f;
                float f11 = rectF.bottom + f;
                Paint paint4 = this.c0;
                paint4.getClass();
                canvas.drawCircle(f10, f11, f3, paint4);
                return;
            }
            return;
        }
        if (i == 2) {
            float fCenterX = rectF.centerX() - this.m0;
            float f12 = rectF.top - f;
            float fCenterX2 = this.m0 + rectF.centerX();
            float f13 = rectF.top - f;
            Paint paint5 = this.c0;
            paint5.getClass();
            canvas.drawLine(fCenterX, f12, fCenterX2, f13, paint5);
            float fCenterX3 = rectF.centerX() - this.m0;
            float f14 = rectF.bottom + f;
            float fCenterX4 = rectF.centerX() + this.m0;
            float f15 = rectF.bottom + f;
            Paint paint6 = this.c0;
            paint6.getClass();
            canvas.drawLine(fCenterX3, f14, fCenterX4, f15, paint6);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                d(canvas, rectF, f, f2);
                return;
            } else {
                r6.g("Unrecognized crop shape");
                return;
            }
        }
        float f16 = rectF.left - f;
        float fCenterY = rectF.centerY() - this.m0;
        float f17 = rectF.left - f;
        float fCenterY2 = this.m0 + rectF.centerY();
        Paint paint7 = this.c0;
        paint7.getClass();
        canvas.drawLine(f16, fCenterY, f17, fCenterY2, paint7);
        float f18 = rectF.right + f;
        float fCenterY3 = rectF.centerY() - this.m0;
        float f19 = rectF.right + f;
        float fCenterY4 = rectF.centerY() + this.m0;
        Paint paint8 = this.c0;
        paint8.getClass();
        canvas.drawLine(f18, fCenterY3, f19, fCenterY4, paint8);
    }

    public final void c(Canvas canvas) {
        if (this.d0 != null) {
            Paint paint = this.b0;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            RectF rectFG = this.V.g();
            rectFG.inset(strokeWidth, strokeWidth);
            float fWidth = rectFG.width() / 3.0f;
            float fHeight = rectFG.height() / 3.0f;
            CropImageView.c cVar = this.cropShape;
            int i = cVar == null ? -1 : d.a[cVar.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                float f = rectFG.left + fWidth;
                float f2 = rectFG.right - fWidth;
                float f3 = rectFG.top;
                float f4 = rectFG.bottom;
                Paint paint2 = this.d0;
                paint2.getClass();
                canvas.drawLine(f, f3, f, f4, paint2);
                float f5 = rectFG.top;
                float f6 = rectFG.bottom;
                Paint paint3 = this.d0;
                paint3.getClass();
                canvas.drawLine(f2, f5, f2, f6, paint3);
                float f7 = rectFG.top + fHeight;
                float f8 = rectFG.bottom - fHeight;
                float f9 = rectFG.left;
                float f10 = rectFG.right;
                Paint paint4 = this.d0;
                paint4.getClass();
                canvas.drawLine(f9, f7, f10, f7, paint4);
                float f11 = rectFG.left;
                float f12 = rectFG.right;
                Paint paint5 = this.d0;
                paint5.getClass();
                canvas.drawLine(f11, f8, f12, f8, paint5);
                return;
            }
            if (i != 4) {
                r6.g("Unrecognized crop shape");
                return;
            }
            float fWidth2 = (rectFG.width() / 2.0f) - strokeWidth;
            float fHeight2 = (rectFG.height() / 2.0f) - strokeWidth;
            float f13 = rectFG.left + fWidth;
            float f14 = rectFG.right - fWidth;
            float fSin = (float) (Math.sin(Math.acos((fWidth2 - fWidth) / fWidth2)) * ((double) fHeight2));
            float f15 = (rectFG.top + fHeight2) - fSin;
            float f16 = (rectFG.bottom - fHeight2) + fSin;
            Paint paint6 = this.d0;
            paint6.getClass();
            canvas.drawLine(f13, f15, f13, f16, paint6);
            float f17 = (rectFG.top + fHeight2) - fSin;
            float f18 = (rectFG.bottom - fHeight2) + fSin;
            Paint paint7 = this.d0;
            paint7.getClass();
            canvas.drawLine(f14, f17, f14, f18, paint7);
            float f19 = rectFG.top + fHeight;
            float f20 = rectFG.bottom - fHeight;
            float fCos = (float) (Math.cos(Math.asin((fHeight2 - fHeight) / fHeight2)) * ((double) fWidth2));
            float f21 = (rectFG.left + fWidth2) - fCos;
            float f22 = (rectFG.right - fWidth2) + fCos;
            Paint paint8 = this.d0;
            paint8.getClass();
            canvas.drawLine(f21, f19, f22, f19, paint8);
            float f23 = (rectFG.left + fWidth2) - fCos;
            float f24 = (rectFG.right - fWidth2) + fCos;
            Paint paint9 = this.d0;
            paint9.getClass();
            canvas.drawLine(f23, f20, f24, f20, paint9);
        }
    }

    public final void d(Canvas canvas, RectF rectF, float f, float f2) {
        float f3 = rectF.left - f;
        float f4 = rectF.top;
        float f5 = f4 + this.m0;
        Paint paint = this.c0;
        paint.getClass();
        canvas.drawLine(f3, f4 - f2, f3, f5, paint);
        float f6 = rectF.left;
        float f7 = rectF.top - f;
        float f8 = f6 + this.m0;
        Paint paint2 = this.c0;
        paint2.getClass();
        canvas.drawLine(f6 - f2, f7, f8, f7, paint2);
        float f9 = rectF.right + f;
        float f10 = rectF.top;
        float f11 = f10 + this.m0;
        Paint paint3 = this.c0;
        paint3.getClass();
        canvas.drawLine(f9, f10 - f2, f9, f11, paint3);
        float f12 = rectF.right;
        float f13 = rectF.top - f;
        float f14 = f12 - this.m0;
        Paint paint4 = this.c0;
        paint4.getClass();
        canvas.drawLine(f12 + f2, f13, f14, f13, paint4);
        float f15 = rectF.left - f;
        float f16 = rectF.bottom;
        float f17 = f16 - this.m0;
        Paint paint5 = this.c0;
        paint5.getClass();
        canvas.drawLine(f15, f16 + f2, f15, f17, paint5);
        float f18 = rectF.left;
        float f19 = rectF.bottom + f;
        float f20 = f18 + this.m0;
        Paint paint6 = this.c0;
        paint6.getClass();
        canvas.drawLine(f18 - f2, f19, f20, f19, paint6);
        float f21 = rectF.right + f;
        float f22 = rectF.bottom;
        float f23 = f22 - this.m0;
        Paint paint7 = this.c0;
        paint7.getClass();
        canvas.drawLine(f21, f22 + f2, f21, f23, paint7);
        float f24 = rectF.right;
        float f25 = rectF.bottom + f;
        float f26 = f24 - this.m0;
        Paint paint8 = this.c0;
        paint8.getClass();
        canvas.drawLine(f24 + f2, f25, f26, f25, paint8);
    }

    public final void e(RectF rectF) {
        float fWidth = rectF.width();
        h hVar = this.V;
        if (fWidth < hVar.e()) {
            float fE = (hVar.e() - rectF.width()) / 2.0f;
            rectF.left -= fE;
            rectF.right += fE;
        }
        if (rectF.height() < hVar.d()) {
            float fD = (hVar.d() - rectF.height()) / 2.0f;
            rectF.top -= fD;
            rectF.bottom += fD;
        }
        if (rectF.width() > hVar.c()) {
            float fWidth2 = (rectF.width() - hVar.c()) / 2.0f;
            rectF.left += fWidth2;
            rectF.right -= fWidth2;
        }
        if (rectF.height() > hVar.b()) {
            float fHeight = (rectF.height() - hVar.b()) / 2.0f;
            rectF.top += fHeight;
            rectF.bottom -= fHeight;
        }
        a(rectF);
        RectF rectF2 = this.i0;
        if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
            float fMax = Math.max(rectF2.left, 0.0f);
            float fMax2 = Math.max(rectF2.top, 0.0f);
            float fMin = Math.min(rectF2.right, getWidth());
            float fMin2 = Math.min(rectF2.bottom, getHeight());
            if (rectF.left < fMax) {
                rectF.left = fMax;
            }
            if (rectF.top < fMax2) {
                rectF.top = fMax2;
            }
            if (rectF.right > fMin) {
                rectF.right = fMin;
            }
            if (rectF.bottom > fMin2) {
                rectF.bottom = fMin2;
            }
        }
        if (!this.r0 || Math.abs(rectF.width() - (rectF.height() * this.u0)) <= 0.1d) {
            return;
        }
        if (rectF.width() > rectF.height() * this.u0) {
            float fAbs = Math.abs((rectF.height() * this.u0) - rectF.width()) / 2.0f;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        } else {
            float fAbs2 = Math.abs((rectF.width() / this.u0) - rectF.height()) / 2.0f;
            rectF.top += fAbs2;
            rectF.bottom -= fAbs2;
        }
    }

    public final void f() {
        Rect rect = g.a;
        float[] fArr = this.h0;
        float fMax = Math.max(g.n(fArr), 0.0f);
        float fMax2 = Math.max(g.p(fArr), 0.0f);
        float fMin = Math.min(g.o(fArr), getWidth());
        float fMin2 = Math.min(g.l(fArr), getHeight());
        if (fMin <= fMax || fMin2 <= fMax2) {
            return;
        }
        RectF rectF = new RectF();
        this.D0 = true;
        float f = this.n0;
        float f2 = fMin - fMax;
        float f3 = f * f2;
        float f4 = fMin2 - fMax2;
        float f5 = f * f4;
        Rect rect2 = this.C0;
        int iWidth = rect2.width();
        h hVar = this.V;
        if (iWidth > 0 && rect2.height() > 0) {
            float f6 = (rect2.left / hVar.k) + fMax;
            rectF.left = f6;
            rectF.top = (rect2.top / hVar.l) + fMax2;
            rectF.right = (rect2.width() / hVar.k) + f6;
            rectF.bottom = (rect2.height() / hVar.l) + rectF.top;
            rectF.left = Math.max(fMax, rectF.left);
            rectF.top = Math.max(fMax2, rectF.top);
            rectF.right = Math.min(fMin, rectF.right);
            rectF.bottom = Math.min(fMin2, rectF.bottom);
        } else if (!this.r0 || fMin <= fMax || fMin2 <= fMax2) {
            rectF.left = fMax + f3;
            rectF.top = fMax2 + f5;
            rectF.right = fMin - f3;
            rectF.bottom = fMin2 - f5;
        } else if (f2 / f4 > this.u0) {
            rectF.top = fMax2 + f5;
            rectF.bottom = fMin2 - f5;
            float width = getWidth() / 2.0f;
            this.u0 = this.s0 / this.t0;
            float fMax3 = Math.max(hVar.e(), rectF.height() * this.u0) / 2.0f;
            rectF.left = width - fMax3;
            rectF.right = width + fMax3;
        } else {
            rectF.left = fMax + f3;
            rectF.right = fMin - f3;
            float height = getHeight() / 2.0f;
            float fMax4 = Math.max(hVar.d(), rectF.width() / this.u0) / 2.0f;
            rectF.top = height - fMax4;
            rectF.bottom = height + fMax4;
        }
        e(rectF);
        hVar.getClass();
        hVar.a.set(rectF);
    }

    public final void g() {
        if (this.D0) {
            setCropWindowRect(g.b);
            f();
            invalidate();
        }
    }

    /* JADX INFO: renamed from: getAspectRatioX, reason: from getter */
    public final int getS0() {
        return this.s0;
    }

    /* JADX INFO: renamed from: getAspectRatioY, reason: from getter */
    public final int getT0() {
        return this.t0;
    }

    public final CropImageView.a getCornerShape() {
        return this.cornerShape;
    }

    public final CropImageView.c getCropShape() {
        return this.cropShape;
    }

    public final RectF getCropWindowRect() {
        return this.V.g();
    }

    public final CropImageView.d getGuidelines() {
        return this.guidelines;
    }

    /* JADX INFO: renamed from: getInitialCropWindowRect, reason: from getter */
    public final Rect getC0() {
        return this.C0;
    }

    public final void h(int i, int i2, float[] fArr) {
        float[] fArr2 = this.h0;
        if (fArr == null || !Arrays.equals(fArr2, fArr)) {
            if (fArr == null) {
                Arrays.fill(fArr2, 0.0f);
            } else {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            }
            this.j0 = i;
            this.k0 = i2;
            RectF rectFG = this.V.g();
            if (rectFG.width() == 0.0f || rectFG.height() == 0.0f) {
                f();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        Canvas canvas2;
        Paint paint;
        canvas.getClass();
        super.onDraw(canvas);
        h hVar = this.V;
        RectF rectFG = hVar.g();
        Rect rect = g.a;
        float[] fArr = this.h0;
        float fMax = Math.max(g.n(fArr), 0.0f);
        float fMax2 = Math.max(g.p(fArr), 0.0f);
        float fMin = Math.min(g.o(fArr), getWidth());
        float fMin2 = Math.min(g.l(fArr), getHeight());
        CropImageView.c cVar = this.cropShape;
        int i3 = cVar == null ? -1 : d.a[cVar.ordinal()];
        Path path = this.g0;
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            i = 4;
            i2 = 3;
            if (fArr[0] == fArr[6] || fArr[1] == fArr[7]) {
                float f = rectFG.top;
                Paint paint2 = this.e0;
                paint2.getClass();
                canvas2 = canvas;
                canvas2.drawRect(fMax, fMax2, fMin, f, paint2);
                float f2 = rectFG.bottom;
                Paint paint3 = this.e0;
                paint3.getClass();
                canvas2.drawRect(fMax, f2, fMin, fMin2, paint3);
                float f3 = rectFG.top;
                float f4 = rectFG.left;
                float f5 = rectFG.bottom;
                Paint paint4 = this.e0;
                paint4.getClass();
                canvas2.drawRect(fMax, f3, f4, f5, paint4);
                float f6 = rectFG.right;
                float f7 = rectFG.top;
                float f8 = rectFG.bottom;
                Paint paint5 = this.e0;
                paint5.getClass();
                canvas2.drawRect(f6, f7, fMin, f8, paint5);
            } else {
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.close();
                canvas.save();
                canvas.clipOutPath(path);
                Paint paint6 = this.e0;
                paint6.getClass();
                canvas2 = canvas;
                canvas2.drawRect(fMax, fMax2, fMin, fMin2, paint6);
                canvas2.restore();
            }
        } else {
            if (i3 != 4) {
                r6.g("Unrecognized crop shape");
                return;
            }
            path.reset();
            float f9 = rectFG.left;
            float f10 = rectFG.top;
            i = 4;
            float f11 = rectFG.right;
            float f12 = rectFG.bottom;
            i2 = 3;
            RectF rectF = this.a0;
            rectF.set(f9, f10, f11, f12);
            path.addOval(rectF, Path.Direction.CW);
            canvas.save();
            canvas.clipOutPath(path);
            Paint paint7 = this.e0;
            paint7.getClass();
            canvas.drawRect(fMax, fMax2, fMin, fMin2, paint7);
            canvas.restore();
            canvas2 = canvas;
        }
        RectF rectF2 = hVar.a;
        if (rectF2.width() >= 100.0f && rectF2.height() >= 100.0f) {
            CropImageView.d dVar = this.guidelines;
            if (dVar == CropImageView.d.b) {
                c(canvas);
            } else if (dVar == CropImageView.d.a && this.q0 != null) {
                c(canvas);
            }
        }
        CropImageOptions cropImageOptions = this.c;
        this.c0 = a.a(cropImageOptions != null ? cropImageOptions.n0 : 0.0f, cropImageOptions != null ? cropImageOptions.q0 : -1);
        if (this.y0) {
            RectF rectFG2 = hVar.g();
            float f13 = (rectFG2.left + rectFG2.right) / 2.0f;
            float f14 = rectFG2.top - 50.0f;
            Paint paint8 = this.f0;
            if (paint8 != null) {
                paint8.setTextSize(this.A0);
                paint8.setColor(this.B0);
            }
            String str = this.z0;
            Paint paint9 = this.f0;
            paint9.getClass();
            canvas2.drawText(str, f13, f14, paint9);
            canvas2.save();
        }
        Paint paint10 = this.b0;
        if (paint10 != null) {
            float strokeWidth = paint10.getStrokeWidth();
            RectF rectFG3 = hVar.g();
            float f15 = strokeWidth / 2.0f;
            rectFG3.inset(f15, f15);
            CropImageView.c cVar2 = this.cropShape;
            int i4 = cVar2 == null ? -1 : d.a[cVar2.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == i2) {
                Paint paint11 = this.b0;
                paint11.getClass();
                canvas2.drawRect(rectFG3, paint11);
            } else if (i4 != i) {
                r6.g("Unrecognized crop shape");
                return;
            } else {
                Paint paint12 = this.b0;
                paint12.getClass();
                canvas2.drawOval(rectFG3, paint12);
            }
        }
        if (this.c0 != null) {
            Paint paint13 = this.b0;
            float strokeWidth2 = paint13 != null ? paint13.getStrokeWidth() : 0.0f;
            Paint paint14 = this.c0;
            paint14.getClass();
            float strokeWidth3 = paint14.getStrokeWidth();
            float f16 = (strokeWidth3 - strokeWidth2) / 2.0f;
            float f17 = strokeWidth3 / 2.0f;
            float f18 = f17 + f16;
            CropImageView.c cVar3 = this.cropShape;
            int i5 = cVar3 == null ? -1 : d.a[cVar3.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                f17 += this.l0;
            } else if (i5 != 4) {
                r6.g("Unrecognized crop shape");
                return;
            }
            RectF rectFG4 = hVar.g();
            rectFG4.inset(f17, f17);
            b(canvas2, rectFG4, f16, f18);
            if (this.cornerShape == CropImageView.a.b) {
                Integer num = this.b;
                if (num != null) {
                    int iIntValue = num.intValue();
                    paint = new Paint();
                    paint.setColor(iIntValue);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setAntiAlias(true);
                } else {
                    paint = null;
                }
                this.c0 = paint;
                b(canvas2, rectFG4, f16, f18);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            RectF rectFG5 = hVar.g();
            List<Rect> systemGestureExclusionRects = getSystemGestureExclusionRects();
            systemGestureExclusionRects.getClass();
            Rect rect2 = systemGestureExclusionRects.size() > 0 ? systemGestureExclusionRects.get(0) : new Rect();
            List<Rect> systemGestureExclusionRects2 = getSystemGestureExclusionRects();
            systemGestureExclusionRects2.getClass();
            Rect rect3 = 1 < systemGestureExclusionRects2.size() ? systemGestureExclusionRects2.get(1) : new Rect();
            List<Rect> systemGestureExclusionRects3 = getSystemGestureExclusionRects();
            systemGestureExclusionRects3.getClass();
            Rect rect4 = 2 < systemGestureExclusionRects3.size() ? systemGestureExclusionRects3.get(2) : new Rect();
            float f19 = rectFG5.left;
            float f20 = this.o0;
            int i6 = (int) (f19 - f20);
            rect2.left = i6;
            int i7 = (int) (rectFG5.right + f20);
            rect2.right = i7;
            float f21 = rectFG5.top;
            int i8 = (int) (f21 - f20);
            rect2.top = i8;
            float f22 = this.E0;
            float f23 = 0.3f * f22;
            rect2.bottom = (int) (i8 + f23);
            rect3.left = i6;
            rect3.right = i7;
            float f24 = rectFG5.bottom;
            int i9 = (int) (((f21 + f24) / 2.0f) - (0.2f * f22));
            rect3.top = i9;
            rect3.bottom = (int) ((f22 * 0.4f) + i9);
            rect4.left = rect2.left;
            rect4.right = rect2.right;
            int i10 = (int) (f24 + f20);
            rect4.bottom = i10;
            rect4.top = (int) (i10 - f23);
            setSystemGestureExclusionRects(u63.a0(rect2, rect3, rect4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x03a5 A[PHI: r7 r8
  0x03a5: PHI (r7v3 float) = (r7v1 float), (r7v8 float) binds: [B:171:0x045c, B:131:0x03a3] A[DONT_GENERATE, DONT_INLINE]
  0x03a5: PHI (r8v3 float) = (r8v1 float), (r8v8 float) binds: [B:171:0x045c, B:131:0x03a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03b7 A[PHI: r7 r8
  0x03b7: PHI (r7v2 float) = (r7v1 float), (r7v8 float) binds: [B:178:0x0476, B:134:0x03b5] A[DONT_GENERATE, DONT_INLINE]
  0x03b7: PHI (r8v2 float) = (r8v1 float), (r8v8 float) binds: [B:178:0x0476, B:134:0x03b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    @Override // android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 1302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropOverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setAspectRatioX(int i) {
        if (i <= 0) {
            l5.q("Cannot set aspect ratio value to a number less than or equal to 0.");
            return;
        }
        if (this.s0 != i) {
            this.s0 = i;
            this.u0 = i / this.t0;
            if (this.D0) {
                f();
                invalidate();
            }
        }
    }

    public final void setAspectRatioY(int i) {
        if (i <= 0) {
            l5.q("Cannot set aspect ratio value to a number less than or equal to 0.");
            return;
        }
        if (this.t0 != i) {
            this.t0 = i;
            this.u0 = this.s0 / i;
            if (this.D0) {
                f();
                invalidate();
            }
        }
    }

    public final void setCropCornerRadius(float cornerRadius) {
        this.a = cornerRadius;
    }

    public final void setCropCornerShape(CropImageView.a cropCornerShape) {
        cropCornerShape.getClass();
        if (this.cornerShape != cropCornerShape) {
            this.cornerShape = cropCornerShape;
            invalidate();
        }
    }

    public final void setCropLabelText(String textLabel) {
        if (textLabel != null) {
            this.z0 = textLabel;
        }
    }

    public final void setCropLabelTextColor(int textColor) {
        this.B0 = textColor;
        invalidate();
    }

    public final void setCropLabelTextSize(float textSize) {
        this.A0 = textSize;
        invalidate();
    }

    public final void setCropShape(CropImageView.c cropShape) {
        cropShape.getClass();
        if (this.cropShape != cropShape) {
            this.cropShape = cropShape;
            invalidate();
        }
    }

    public final void setCropWindowChangeListener(b listener) {
        this.W = listener;
    }

    public final void setCropWindowRect(RectF rectF) {
        rectF.getClass();
        h hVar = this.V;
        hVar.getClass();
        hVar.a.set(rectF);
    }

    public final void setCropperTextLabelVisibility(boolean isEnabled) {
        this.y0 = isEnabled;
        invalidate();
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        if (this.r0 != fixAspectRatio) {
            this.r0 = fixAspectRatio;
            if (this.D0) {
                f();
                invalidate();
            }
        }
    }

    public final void setGuidelines(CropImageView.d guidelines) {
        guidelines.getClass();
        if (this.guidelines != guidelines) {
            this.guidelines = guidelines;
            if (this.D0) {
                invalidate();
            }
        }
    }

    public final void setInitialAttributeValues(CropImageOptions options) {
        b bVar;
        options.getClass();
        float f = options.Z0;
        int i = options.a1;
        int i2 = options.A0;
        int i3 = options.z0;
        int i4 = options.y0;
        int i5 = options.x0;
        boolean zB = wl7.b(this.c, options);
        CropImageOptions cropImageOptions = this.c;
        boolean z = (cropImageOptions != null && options.i0 == cropImageOptions.i0 && options.j0 == cropImageOptions.j0 && options.k0 == cropImageOptions.k0) ? false : true;
        this.c = options;
        float f2 = i5;
        h hVar = this.V;
        hVar.g = f2;
        float f3 = i4;
        hVar.h = f3;
        float f4 = i3;
        hVar.i = f4;
        float f5 = i2;
        hVar.j = f5;
        if (zB) {
            return;
        }
        hVar.c = options.v0;
        hVar.d = options.w0;
        hVar.g = f2;
        hVar.h = f3;
        hVar.i = f4;
        hVar.j = f5;
        this.B0 = i;
        this.A0 = f;
        String str = options.b1;
        if (str == null) {
            str = "";
        }
        this.z0 = str;
        this.y0 = options.Z;
        this.a = options.e;
        this.cornerShape = options.d;
        this.cropShape = options.c;
        this.p0 = options.f;
        setEnabled(options.f0);
        this.guidelines = options.W;
        this.r0 = options.i0;
        setAspectRatioX(options.j0);
        setAspectRatioY(options.k0);
        boolean z2 = options.d0;
        this.e = z2;
        if (z2 && this.d == null) {
            this.d = new ScaleGestureDetector(getContext(), new c());
        }
        this.f = options.e0;
        this.o0 = options.V;
        this.n0 = options.h0;
        this.b0 = a.a(options.l0, options.m0);
        this.l0 = options.o0;
        this.m0 = options.p0;
        this.b = Integer.valueOf(options.r0);
        this.c0 = a.a(options.n0, options.q0);
        this.d0 = a.a(options.s0, options.t0);
        int i6 = options.u0;
        Paint paint = new Paint();
        paint.setColor(i6);
        this.e0 = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(1.0f);
        paint2.setTextSize(f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setColor(i);
        this.f0 = paint2;
        if (z) {
            f();
        }
        invalidate();
        if (!z || (bVar = this.W) == null) {
            return;
        }
        bVar.a(false);
    }

    public final void setInitialCropWindowRect(Rect rect) {
        if (rect == null) {
            rect = g.a;
        }
        this.C0.set(rect);
        if (this.D0) {
            f();
            invalidate();
            b bVar = this.W;
            if (bVar != null) {
                bVar.a(false);
            }
        }
    }

    public final void setSnapRadius(float snapRadius) {
        this.p0 = snapRadius;
    }
}
