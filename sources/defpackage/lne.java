package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class lne extends ba1 {
    public final RectF D;
    public final ij8 E;
    public final float[] F;
    public final Path G;
    public final hl8 H;

    public lne(j79 j79Var, hl8 hl8Var) {
        super(j79Var, hl8Var);
        this.D = new RectF();
        ij8 ij8Var = new ij8();
        this.E = ij8Var;
        this.F = new float[8];
        this.G = new Path();
        this.H = hl8Var;
        ij8Var.setAlpha(0);
        ij8Var.setStyle(Paint.Style.FILL);
        ij8Var.setColor(hl8Var.l);
    }

    @Override // defpackage.ba1, defpackage.vc4
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        hl8 hl8Var = this.H;
        float f = hl8Var.j;
        float f2 = hl8Var.k;
        RectF rectF2 = this.D;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.ba1
    public final void k(Canvas canvas, Matrix matrix, int i, hd4 hd4Var) {
        hl8 hl8Var = this.H;
        int iAlpha = Color.alpha(hl8Var.l);
        if (iAlpha == 0) {
            return;
        }
        int i2 = hl8Var.l;
        ij8 ij8Var = this.E;
        ij8Var.setColor(i2);
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.w.j == null ? 100 : r2.e().intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        ij8Var.setAlpha(iIntValue);
        if (hd4Var == null || Color.alpha(hd4Var.d) <= 0) {
            ij8Var.clearShadowLayer();
        } else {
            ij8Var.setShadowLayer(Math.max(hd4Var.a, Float.MIN_VALUE), hd4Var.b, hd4Var.c, hd4Var.d);
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = hl8Var.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = hl8Var.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, ij8Var);
        }
    }
}
