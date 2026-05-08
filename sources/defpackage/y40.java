package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class y40 implements ww1 {
    public Canvas a = z40.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.ww1
    public final void a(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.ww1
    public final void b(float f, float f2, float f3, float f4, float f5, float f6, u2b u2bVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, u2bVar.e());
    }

    @Override // defpackage.ww1
    public final void c(v5b v5bVar) {
        Canvas canvas = this.a;
        if (v5bVar instanceof m80) {
            canvas.clipPath(((m80) v5bVar).a, Region.Op.INTERSECT);
        } else {
            b0.u("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.ww1
    public final void d(m07 m07Var, long j, long j2, long j3, long j4, u2b u2bVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapA = w70.a(m07Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        j6g j6gVar = j6g.a;
        Rect rect2 = this.c;
        rect2.getClass();
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmapA, rect, rect2, u2bVar.e());
    }

    @Override // defpackage.ww1
    public final void e(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.ww1
    public final void f(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.ww1
    public final void g(m07 m07Var, u2b u2bVar) {
        this.a.drawBitmap(w70.a(m07Var), Float.intBitsToFloat(0), Float.intBitsToFloat(0), u2bVar.e());
    }

    @Override // defpackage.ww1
    public final void h() {
        this.a.restore();
    }

    @Override // defpackage.ww1
    public final void j() {
        ex1.a(this.a, true);
    }

    @Override // defpackage.ww1
    public final void k(long j, long j2, u2b u2bVar) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), u2bVar.e());
    }

    @Override // defpackage.ww1
    public final void l(float f, float f2, float f3, float f4, float f5, float f6, u2b u2bVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, u2bVar.e());
    }

    @Override // defpackage.ww1
    public final void m(v5b v5bVar, u2b u2bVar) {
        Canvas canvas = this.a;
        if (v5bVar instanceof m80) {
            canvas.drawPath(((m80) v5bVar).a, u2bVar.e());
        } else {
            b0.u("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.ww1
    public final void n(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.ww1
    public final void o() {
        this.a.save();
    }

    @Override // defpackage.ww1
    public final void p() {
        ex1.a(this.a, false);
    }

    @Override // defpackage.ww1
    public final void q(float[] fArr) {
        if (boa.C(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        pg8.L(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.ww1
    public final void r(qtc qtcVar, u2b u2bVar) {
        this.a.saveLayer(qtcVar.a, qtcVar.b, qtcVar.c, qtcVar.d, u2bVar.e(), 31);
    }

    @Override // defpackage.ww1
    public final void s(float f, long j, u2b u2bVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, u2bVar.e());
    }

    @Override // defpackage.ww1
    public final void t(float f, float f2, float f3, float f4, u2b u2bVar) {
        this.a.drawRect(f, f2, f3, f4, u2bVar.e());
    }
}
