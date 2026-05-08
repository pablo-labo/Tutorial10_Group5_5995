package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class hd4 {
    public float a;
    public float b;
    public float c;
    public int d;
    public float[] e = null;

    public hd4(hd4 hd4Var) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0;
        this.a = hd4Var.a;
        this.b = hd4Var.b;
        this.c = hd4Var.c;
        this.d = hd4Var.d;
    }

    public final void a(int i, ij8 ij8Var) {
        int iAlpha = Color.alpha(this.d);
        int iC = du9.c(i);
        Matrix matrix = ckg.a;
        int i2 = (int) ((((iAlpha / 255.0f) * iC) / 255.0f) * 255.0f);
        if (i2 <= 0) {
            ij8Var.clearShadowLayer();
        } else {
            ij8Var.setShadowLayer(Math.max(this.a, Float.MIN_VALUE), this.b, this.c, Color.argb(i2, Color.red(this.d), Color.green(this.d), Color.blue(this.d)));
        }
    }

    public final void b(int i) {
        this.d = Color.argb(Math.round((du9.c(i) * Color.alpha(this.d)) / 255.0f), Color.red(this.d), Color.green(this.d), Color.blue(this.d));
    }

    public final void c(Matrix matrix) {
        if (this.e == null) {
            this.e = new float[2];
        }
        float[] fArr = this.e;
        fArr[0] = this.b;
        fArr[1] = this.c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.e;
        this.b = fArr2[0];
        this.c = fArr2[1];
        this.a = matrix.mapRadius(this.a);
    }
}
