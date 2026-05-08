package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class m80 implements v5b {
    public final Path a = new Path();
    public RectF b;
    public float[] c;
    public Matrix d;

    public m80(int i) {
    }

    @Override // defpackage.v5b
    public final void a(float f, float f2) {
        this.a.rMoveTo(f, f2);
    }

    @Override // defpackage.v5b
    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.v5b
    public final void c(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    @Override // defpackage.v5b
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.v5b
    public final void d(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // defpackage.v5b
    public final void e(int i) {
        this.a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // defpackage.v5b
    public final void f(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    @Override // defpackage.v5b
    public final void g(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.getClass();
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }

    @Override // defpackage.v5b
    public final qtc getBounds() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new qtc(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // defpackage.v5b
    public final void h(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // defpackage.v5b
    public final int i() {
        return this.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @Override // defpackage.v5b
    public final void j(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    @Override // defpackage.v5b
    public final void k() {
        this.a.rewind();
    }

    @Override // defpackage.v5b
    public final void l(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.v5b
    public final void m(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    @Override // defpackage.v5b
    public final void n(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void o(zfd zfdVar) {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        float f = zfdVar.a;
        long j = zfdVar.h;
        long j2 = zfdVar.g;
        long j3 = zfdVar.f;
        long j4 = zfdVar.e;
        rectF.set(f, zfdVar.b, zfdVar.c, zfdVar.d);
        if (this.c == null) {
            this.c = new float[8];
        }
        float[] fArr = this.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        RectF rectF2 = this.b;
        rectF2.getClass();
        float[] fArr2 = this.c;
        fArr2.getClass();
        this.a.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final boolean p(v5b v5bVar, v5b v5bVar2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(v5bVar instanceof m80)) {
            b0.u("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = ((m80) v5bVar).a;
        if (v5bVar2 instanceof m80) {
            return this.a.op(path, ((m80) v5bVar2).a, op);
        }
        b0.u("Unable to obtain android.graphics.Path");
        return false;
    }

    @Override // defpackage.v5b
    public final void reset() {
        this.a.reset();
    }
}
