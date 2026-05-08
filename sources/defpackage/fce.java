package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import defpackage.uce;
import defpackage.ze9;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public final class fce {
    public final uce[] a = new uce[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final uce g = new uce();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public static class a {
        public static final fce a = new fce();
    }

    public fce() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new uce();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ece eceVar, float f, RectF rectF, ze9.a aVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr;
        int i;
        uce[] uceVarArr;
        Matrix[] matrixArr2;
        char c;
        float f2;
        char c2;
        int i2;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.c;
            fArr = this.h;
            uceVarArr = this.a;
            matrixArr2 = this.b;
            c = 0;
            if (i3 >= 4) {
                break;
            }
            s03 s03Var = i3 != 1 ? i3 != 2 ? i3 != 3 ? eceVar.f : eceVar.e : eceVar.h : eceVar.g;
            ie7 ie7Var = i3 != 1 ? i3 != 2 ? i3 != 3 ? eceVar.b : eceVar.a : eceVar.d : eceVar.c;
            uce uceVar = uceVarArr[i3];
            ie7Var.getClass();
            ie7Var.m(uceVar, f, s03Var.a(rectF));
            int i4 = i3 + 1;
            float f3 = i4 * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.d;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            uce uceVar2 = uceVarArr[i2];
            fArr[0] = uceVar2.b;
            fArr[1] = uceVar2.c;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            uce uceVar3 = uceVarArr[i5];
            uceVar3.getClass();
            fArr[c] = 0.0f;
            fArr[1] = uceVar3.a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[c], fArr[1]);
            } else {
                path.lineTo(fArr[c], fArr[1]);
            }
            uceVarArr[i5].b(matrixArr2[i5], path);
            if (aVar != null) {
                uce uceVar4 = uceVarArr[i5];
                Matrix matrix = matrixArr2[i5];
                ze9 ze9Var = ze9.this;
                f2 = 0.0f;
                BitSet bitSet = ze9Var.d;
                uceVar4.getClass();
                bitSet.set(i5, (boolean) c);
                uce.f[] fVarArr = ze9Var.b;
                uceVar4.a(uceVar4.e);
                fVarArr[i5] = new tce(new ArrayList(uceVar4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            uce uceVar5 = uceVarArr[i5];
            fArr[0] = uceVar5.b;
            fArr[1] = uceVar5.c;
            matrixArr2[i5].mapPoints(fArr);
            uce uceVar6 = uceVarArr[i7];
            uceVar6.getClass();
            float[] fArr2 = this.i;
            fArr2[0] = f2;
            fArr2[1] = uceVar6.a;
            matrixArr2[i7].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr;
            uce[] uceVarArr2 = uceVarArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f2);
            uce uceVar7 = uceVarArr2[i5];
            fArr[0] = uceVar7.b;
            fArr[1] = uceVar7.c;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            uce uceVar8 = this.g;
            uceVar8.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? eceVar.j : eceVar.i : eceVar.l : eceVar.k).getClass();
            uceVar8.c(fMax, 0.0f);
            Path path4 = this.j;
            path4.reset();
            uceVar8.b(matrixArr3[i5], path4);
            if (this.l && (b(path4, i5) || b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = uceVar8.a;
                matrixArr3[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                uceVar8.b(matrixArr3[i5], path2);
            } else {
                uceVar8.b(matrixArr3[i5], path);
            }
            if (aVar != null) {
                Matrix matrix2 = matrixArr3[i5];
                ze9 ze9Var2 = ze9.this;
                c2 = 0;
                ze9Var2.d.set(i5 + 4, false);
                uce.f[] fVarArr2 = ze9Var2.c;
                uceVar8.a(uceVar8.e);
                fVarArr2[i5] = new tce(new ArrayList(uceVar8.g), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            i5 = i6;
            c = c2;
            uceVarArr = uceVarArr2;
            matrixArr = matrixArr3;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].b(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
