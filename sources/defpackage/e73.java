package defpackage;

import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.canhub.cropper.CropOverlayView;

/* JADX INFO: loaded from: classes.dex */
public final class e73 extends Animation implements Animation.AnimationListener {
    public final float[] V;
    public final float[] W;
    public final ImageView a;
    public final CropOverlayView b;
    public final float[] c;
    public final float[] d;
    public final RectF e;
    public final RectF f;

    public e73(ImageView imageView, CropOverlayView cropOverlayView) {
        imageView.getClass();
        cropOverlayView.getClass();
        this.a = imageView;
        this.b = cropOverlayView;
        this.c = new float[8];
        this.d = new float[8];
        this.e = new RectF();
        this.f = new RectF();
        this.V = new float[9];
        this.W = new float[9];
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        transformation.getClass();
        RectF rectF = new RectF();
        RectF rectF2 = this.e;
        float f2 = rectF2.left;
        RectF rectF3 = this.f;
        rectF.left = k6.b(rectF3.left, f2, f, f2);
        float f3 = rectF2.top;
        rectF.top = k6.b(rectF3.top, f3, f, f3);
        float f4 = rectF2.right;
        rectF.right = k6.b(rectF3.right, f4, f, f4);
        float f5 = rectF2.bottom;
        rectF.bottom = k6.b(rectF3.bottom, f5, f, f5);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            float f6 = this.c[i];
            fArr[i] = k6.b(this.d[i], f6, f, f6);
        }
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.setCropWindowRect(rectF);
        ImageView imageView = this.a;
        cropOverlayView.h(imageView.getWidth(), imageView.getHeight(), fArr);
        cropOverlayView.invalidate();
        float[] fArr2 = new float[9];
        for (int i2 = 0; i2 < 9; i2++) {
            float f7 = this.V[i2];
            fArr2[i2] = k6.b(this.W[i2], f7, f, f7);
        }
        imageView.getImageMatrix().setValues(fArr2);
        imageView.invalidate();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        this.a.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
    }
}
