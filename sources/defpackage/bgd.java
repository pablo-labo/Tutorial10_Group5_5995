package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class bgd extends mgd {
    public static final /* synthetic */ int n0 = 0;
    public final Paint j0;
    public final Bitmap k0;
    public WeakReference<Bitmap> l0;
    public RectF m0;

    public bgd(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.j0 = paint2;
        Paint paint3 = new Paint(1);
        this.m0 = null;
        this.k0 = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // defpackage.mgd
    public final void b() {
        super.b();
        if (this.m0 == null) {
            this.m0 = new RectF();
        }
        this.f0.mapRect(this.m0, this.Y);
    }

    @Override // defpackage.mgd, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Shader shader;
        it5.a();
        boolean z = this.b;
        Bitmap bitmap = this.k0;
        if (!(z && bitmap != null)) {
            super.draw(canvas);
            it5.a();
            return;
        }
        b();
        a();
        WeakReference<Bitmap> weakReference = this.l0;
        Paint paint = this.j0;
        if (weakReference == null || weakReference.get() != bitmap) {
            this.l0 = new WeakReference<>(bitmap);
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.d = true;
            }
        }
        if (this.d && (shader = paint.getShader()) != null) {
            shader.setLocalMatrix(this.f0);
            this.d = false;
        }
        paint.setFilterBitmap(this.g0);
        int iSave = canvas.save();
        canvas.concat(this.e0);
        RectF rectF = this.m0;
        Path path = this.c;
        if (rectF != null) {
            int iSave2 = canvas.save();
            canvas.clipRect(this.m0);
            canvas.drawPath(path, paint);
            canvas.restoreToCount(iSave2);
        } else {
            canvas.drawPath(path, paint);
        }
        canvas.restoreToCount(iSave);
        it5.a();
    }

    @Override // defpackage.mgd, defpackage.agd
    public final void n() {
    }

    @Override // defpackage.mgd, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        Paint paint = this.j0;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // defpackage.mgd, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.j0.setColorFilter(colorFilter);
    }
}
