package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kgd extends up5 implements agd {
    public final float[] V;
    public final Paint W;
    public int X;
    public boolean Y;
    public final Path Z;
    public final Path a0;
    public final RectF b0;
    public final a d;
    public final RectF e;
    public final float[] f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;

        static {
            a aVar = new a("OVERLAY_COLOR", 0);
            a = aVar;
            b = new a[]{aVar, new a("CLIPPING", 1)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgd(Drawable drawable) {
        super(drawable);
        drawable.getClass();
        this.d = a.a;
        this.e = new RectF();
        this.f = new float[8];
        this.V = new float[8];
        this.W = new Paint(1);
        this.X = 0;
        this.Y = false;
        this.Z = new Path();
        this.a0 = new Path();
        this.b0 = new RectF();
    }

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.e.set(getBounds());
        int iOrdinal = this.d.ordinal();
        Path path = this.Z;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            int iSave = canvas.save();
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
            return;
        }
        super.draw(canvas);
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.W;
        paint.setStyle(style);
        paint.setColor(this.X);
        paint.setStrokeWidth(0.0f);
        paint.setFilterBitmap(this.Y);
        path.setFillType(Path.FillType.EVEN_ODD);
        canvas.drawPath(path, paint);
    }

    @Override // defpackage.agd
    public final void g() {
        v();
        invalidateSelf();
    }

    @Override // defpackage.agd
    public final void h() {
        v();
        invalidateSelf();
    }

    @Override // defpackage.agd
    public final void i() {
        Arrays.fill(this.f, 0.0f);
        v();
        invalidateSelf();
    }

    @Override // defpackage.agd
    public final void k(boolean z) {
        if (this.Y != z) {
            this.Y = z;
            invalidateSelf();
        }
    }

    @Override // defpackage.agd
    public final void m() {
        v();
        invalidateSelf();
    }

    @Override // defpackage.agd
    public final void n() {
    }

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        v();
    }

    @Override // defpackage.agd
    public final void r() {
        v();
        invalidateSelf();
    }

    @Override // defpackage.agd
    public final void s(float[] fArr) {
        float[] fArr2 = this.f;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            web.f("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        v();
        invalidateSelf();
    }

    public final void v() {
        Path path = this.Z;
        path.reset();
        Path path2 = this.a0;
        path2.reset();
        Rect bounds = getBounds();
        RectF rectF = this.b0;
        rectF.set(bounds);
        rectF.inset(0.0f, 0.0f);
        if (this.d == a.a) {
            path.addRect(rectF, Path.Direction.CW);
        }
        Path.Direction direction = Path.Direction.CW;
        float[] fArr = this.f;
        path.addRoundRect(rectF, fArr, direction);
        rectF.inset(-0.0f, -0.0f);
        rectF.inset(0.0f, 0.0f);
        int i = 0;
        while (true) {
            float[] fArr2 = this.V;
            if (i >= fArr2.length) {
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                rectF.inset(-0.0f, -0.0f);
                return;
            } else {
                fArr2[i] = (fArr[i] + 0.0f) - 0.0f;
                i++;
            }
        }
    }
}
