package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class mx8 extends View {
    public int[] V;
    public int[] W;
    public final Paint a;
    public float[] a0;
    public Path b;
    public RectF c;
    public float[] d;
    public float[] e;
    public float[] f;

    public mx8(Context context) {
        super(context);
        this.a = new Paint(5);
        this.e = new float[]{0.5f, 0.0f};
        this.f = new float[]{0.5f, 1.0f};
        this.W = new int[]{0, 0};
        this.a0 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public final void a() {
        int[] iArr = this.V;
        if (iArr != null) {
            float[] fArr = this.d;
            if (fArr == null || iArr.length == fArr.length) {
                float[] fArr2 = this.e;
                float f = fArr2[0];
                int[] iArr2 = this.W;
                int i = iArr2[0];
                float f2 = fArr2[1];
                int i2 = iArr2[1];
                float[] fArr3 = this.f;
                this.a.setShader(new LinearGradient(f * i, f2 * i2, i * fArr3[0], fArr3[1] * i2, this.V, this.d, Shader.TileMode.CLAMP));
                invalidate();
            }
        }
    }

    public final void b() {
        if (this.b == null) {
            this.b = new Path();
            this.c = new RectF();
        }
        this.b.reset();
        RectF rectF = this.c;
        int[] iArr = this.W;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.b.addRoundRect(this.c, this.a0, Path.Direction.CW);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.b;
        Paint paint = this.a;
        if (path == null) {
            canvas.drawPaint(paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.W = new int[]{i, i2};
        b();
        a();
    }

    public void setBorderRadii(float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = TypedValue.applyDimension(1, fArr[i], getContext().getResources().getDisplayMetrics());
        }
        this.a0 = fArr;
        b();
        a();
    }

    public void setColors(int[] iArr) {
        this.V = iArr;
        a();
    }

    public void setDither(boolean z) {
        this.a.setDither(z);
        a();
    }

    public void setLocations(float[] fArr) {
        this.d = fArr;
        a();
    }
}
